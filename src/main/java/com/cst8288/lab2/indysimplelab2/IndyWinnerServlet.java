package com.cst8288.lab2.indysimplelab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

/**
 * The {@code IndyWinnerServlet} handles HTTP requests to display a paginated list
 * of Indianapolis 500 winners. It interacts with the {@link AuthorDAO} to fetch data
 * from the database and dynamically generates an HTML response for the user.
 * 
 * <p>This servlet supports the GET method and provides simple pagination functionality
 * with controls to navigate between pages of winners.</p>
 * 
 * @author kajan
 * @version 1.0
 */
public class IndyWinnerServlet extends HttpServlet {
    private static final int PAGE_SIZE = 10;
    
    /**
    * The {@code AuthorDAO} implementation used for accessing database records.
    */
    private AuthorDAO dao;

    /**
     * Default constructor that initializes the servlet with the default {@code AuthorDAO} implementation.
     */
    public IndyWinnerServlet() {
        this.dao = new AuthorDAOImpl(); // Default DAO implementation
    }

    /**
     * Constructor for injecting a custom {@code AuthorDAO}, useful for testing or custom configurations.
     * 
     * @param dao The {@code AuthorDAO} implementation to use.
     */
    public IndyWinnerServlet(AuthorDAO dao) {
        this.dao = dao;
    }

    /**
     * Handles the HTTP GET method to retrieve and display a paginated list of winners.
     * 
     * <p>The method processes the `page` parameter to determine the current page and fetches
     * the corresponding set of winners using the {@code AuthorDAO}. It then generates an
     * HTML response to display the results, along with pagination controls.</p>
     * 
     * @param request The {@code HttpServletRequest} object containing the client's request.
     * @param response The {@code HttpServletResponse} object for sending the response to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException If an input or output error occurs while processing the request.
     */    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {

            // Get the page parameter from request, default to 1 if not provided
            String pageParam = request.getParameter("page");
            int page = 1;
            try {
                page = (pageParam == null || pageParam.isEmpty()) ? 1 : Integer.parseInt(pageParam);
                if (page < 1) {
                    page = 1;
                }
            } catch (NumberFormatException e) {
                page = 1;  // Default to page 1 if the parameter is invalid
            }

            // Calculate offset
            int offset = (page - 1) * PAGE_SIZE;

            // Fetch winners using DAO
            AuthorDAO dao = new AuthorDAOImpl();
            List<AuthorDTO> winners = dao.getWinners(offset, PAGE_SIZE);

            // Generate HTML output
            generateHtmlOutput(out, winners, page);

        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred while processing your request.");
        }
    }

    /**
     * Generates the HTML output for the list of winners and pagination controls.
     * 
     * <p>This method creates a simple HTML table to display the list of winners and includes
     * "Previous" and "Next" links for pagination. If no winners are available, an appropriate
     * message is displayed.</p>
     * 
     * @param out The {@code PrintWriter} object for writing the HTML response.
     * @param winners A list of {@code AuthorDTO} objects representing the winners.
     * @param currentPage The current page number for pagination.
     */
    private void generateHtmlOutput(PrintWriter out, List<AuthorDTO> winners, int currentPage) {
        out.println("<html><head><title>Indy Winners</title></head><body>");
        out.println("<h2>Indianapolis 500 Winners</h2>");
        out.println("<table border='1'><tr><th>Year</th><th>Driver</th><th>Avg Speed</th><th>Country</th></tr>");

        if (winners == null || winners.isEmpty()) {
                out.println("<p>No winners available for display.</p>");
            } else {
                out.println("<table border='1'><tr><th>Year</th><th>Driver</th><th>Avg Speed</th><th>Country</th></tr>");
                for (AuthorDTO winner : winners) {
                    out.println("<tr><td>" + winner.getYear() + "</td><td>" + winner.getDriver() +
                                "</td><td>" + winner.getAverageSpeed() + "</td><td>" + winner.getCountry() + "</td></tr>");
                }
                out.println("</table>");
            }

            // Add pagination controls
            out.println("<br><div style='text-align: center;'>");
            if (currentPage > 1) {
                out.println("<a href='?page=" + (currentPage - 1) + "'>Previous</a> ");
            }
            out.println("<a href='?page=" + (currentPage + 1) + "'>Next</a>");
            out.println("</div>");

            out.println("</body></html>");
    }
}
