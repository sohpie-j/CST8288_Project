package com.cst8288.lab2.indysimplelab2;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

/**
 * The {@code IndyWinnerSimpleSV} servlet handles HTTP requests to display a paginated list
 * of Indianapolis 500 winners. It connects to the database, executes SQL queries with pagination,
 * and formats the results into an HTML response.
 * 
 * <p>This servlet supports both GET and POST methods, where POST is redirected to GET.</p>
 * 
 * <p>URL Pattern: {@code /IndyWinnerSimpleSV}</p>
 * 
 * @author kajan
 * @version 1.0
 */
@WebServlet(urlPatterns = {"/IndyWinnerSimpleSV"})
public class IndyWinnerSimpleSV extends HttpServlet {

    /**
    * A buffer used for building the HTML response dynamically.
    */
    private final StringBuilder buffer = new StringBuilder();

    /**
    * Default constructor for {@code IndyWinnerSimpleSV}.
    */
    public IndyWinnerSimpleSV() {
        // Default constructor
    }

    /**
     * Handles HTTP POST requests by redirecting to the GET method.
     * 
     * @param request The {@code HttpServletRequest} object.
     * @param response The {@code HttpServletResponse} object.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException If an I/O error occurs.
     */    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Handles HTTP GET requests to fetch and display winners.
     * 
     * <p>The method retrieves the current page number from the request parameter,
     * connects to the database, executes a paginated SQL query, and formats the
     * results into an HTML table.</p>
     * 
     * @param request The {@code HttpServletRequest} object.
     * @param response The {@code HttpServletResponse} object.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException If an I/O error occurs.
     */    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Clear the buffer for a fresh response
        buffer.setLength(0);

        // Get the URI, set the content type, and create a PrintWriter
        String uri = request.getRequestURI();
        response.setContentType("text/html");

        formatPageHeader(buffer);

        // Get the current page from request parameter
        int currentPage = 1;
        String pageParam = request.getParameter("page");
        if (pageParam != null) {
            try {
                currentPage = Integer.parseInt(pageParam);
            } catch (NumberFormatException e) {
                currentPage = 1; // Default to page 1 if the parameter is invalid
            }
        }

        int rowsPerPage = 10;

        // Execute the SQL query and format the results
        sqlQuery(
            "com.mysql.cj.jdbc.Driver",                   // Database Driver
            "jdbc:mysql://localhost:3308/indywinners",    // Database Name
            "root", "2131",                                // Username and Password
            buffer, uri, currentPage, rowsPerPage          // Buffer, URI, currentPage, rowsPerPage
        );

        // Wrap up HTML page
        buffer.append("</html>");

        // Send the formatted page back to the client
        try (java.io.PrintWriter out = response.getWriter()) {
            out.println(buffer.toString());
            out.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Formats the HTML header for the response.
     * 
     * @param buffer The {@code StringBuilder} to store the HTML content.
     */
    private void formatPageHeader(StringBuilder buffer) {
        // Format the HTML header page
        buffer.append("<html>");
        buffer.append("<head>");
        buffer.append("<title>Indianapolis 500 Winners</title>");
        buffer.append("</head>");
        buffer.append("<body>");
        buffer.append("<h2><center>");
        buffer.append("Indianapolis 500 Winners");
        buffer.append("</center></h2>");
        buffer.append("<br>");
    }
    
    /**
     * Executes the SQL query to fetch paginated results from the database.
     * 
     * <p>This method also handles database connection, prepares the query with
     * pagination (LIMIT and OFFSET), and appends the results to the buffer.</p>
     * 
     * @param driverName The name of the JDBC driver.
     * @param connectionURL The database connection URL.
     * @param user The database username.
     * @param pass The database password.
     * @param buffer The {@code StringBuilder} to store the HTML content.
     * @param uri The request URI.
     * @param currentPage The current page number for pagination.
     * @param rowsPerPage The number of rows to display per page.
     */
    private void sqlQuery(String driverName, String connectionURL, String user, String pass,
                          StringBuilder buffer, String uri, int currentPage, int rowsPerPage) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        // Keep stats for how long it takes to connect and execute the query
        long startMS = System.currentTimeMillis();
        int rowCount = 0;

        try {
            // Create an instance of the JDBC driver so that it registers itself
            Class.forName(driverName);
            con = DriverManager.getConnection(connectionURL, user, pass);

            // SQL query with pagination using LIMIT and OFFSET
            String query = "SELECT * FROM IndyWinners ORDER BY year DESC LIMIT ? OFFSET ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, rowsPerPage); // Number of rows per page
            stmt.setInt(2, (currentPage - 1) * rowsPerPage); // Offset calculation for pagination

            rs = stmt.executeQuery();

            // Format the result set into an HTML table
            rowCount = resultSetToHTML(rs, buffer, uri, currentPage, rowsPerPage);

        } catch (Exception ex) {
            // Send the error back to the client
            buffer.append("<p style='color: red;'>Exception: ").append(ex.toString()).append("</p>");
        } finally {
            // Always close properly
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException sqlEx) {
                // Ignore errors while closing
                sqlEx.printStackTrace();
            }
        }

        // Output some statistics
        long elapsed = System.currentTimeMillis() - startMS;
        buffer.append("<br><i> (").append(rowCount).append(" rows in ").append(elapsed).append("ms) </i>");
    }
    
    /**
     * Formats the {@link ResultSet} into an HTML table.
     * 
     * @param rs The {@code ResultSet} containing the query results.
     * @param buffer The {@code StringBuilder} to store the HTML content.
     * @param uri The request URI for generating pagination links.
     * @param currentPage The current page number for pagination.
     * @param rowsPerPage The number of rows displayed per page.
     * @return The number of rows retrieved from the {@code ResultSet}.
     * @throws SQLException If an SQL error occurs while processing the {@code ResultSet}.
     */
    private int resultSetToHTML(ResultSet rs, StringBuilder buffer, String uri, int currentPage, int rowsPerPage) throws SQLException {
        int rowCount = 0;

        // Create the table and center it
        buffer.append("<center><table border='1'>");

        // Start the table row, create table header values from metadata
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        buffer.append("<tr>");
        for (int i = 1; i <= columnCount; i++) {
            buffer.append("<th>").append(rsmd.getColumnLabel(i)).append("</th>");
        }
        buffer.append("</tr>");

        // Walk through the ResultSet and add rows to the HTML table
        while (rs.next()) {
            rowCount++;
            buffer.append("<tr>");
            for (int i = 1; i <= columnCount; i++) {
                String data = rs.getString(i);
                buffer.append("<td>").append(data != null ? data : "").append("</td>");
            }
            buffer.append("</tr>");
        }

        // End the table
        buffer.append("</table></center>");

        // Add pagination buttons
        buffer.append("<div style='text-align: center; margin-top: 20px;'>");
        if (currentPage > 1) {
            buffer.append("<a href='").append(uri.split("\\?")[0]).append("?page=").append(currentPage - 1).append("'>Previous</a> ");
        }
        if (rowCount == rowsPerPage) { // Show "Next" button only if the current page is full (implies more rows are present)
            buffer.append("<a href='").append(uri.split("\\?")[0]).append("?page=").append(currentPage + 1).append("'>Next</a>");
        }
        buffer.append("</div>");

        return rowCount;
    }
}
