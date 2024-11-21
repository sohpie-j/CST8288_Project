///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.cst8288.lab2.indysimplelab2;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.*;
//
//
///**
// *
// * @author kajan
// */
//public class IndyWinnerServlet extends HttpServlet {
//    private static final int PAGE_SIZE = 10;
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        // Get the page parameter
//        String pageParam = request.getParameter("page");
//        int page = (pageParam == null || pageParam.isEmpty()) ? 1 : Integer.parseInt(pageParam);
//
//        // Calculate offset
//        int offset = (page - 1) * PAGE_SIZE;
//
//        // Fetch winners using DAO
//        AuthorDAO dao = new AuthorDAOImpl();
//        List<AuthorDTO> winners = dao.getWinners(offset, PAGE_SIZE);
//
//        // Generate HTML output
//        out.println("<html><head><title>Indy Winners</title></head><body>");
//        out.println("<h2>Indianapolis 500 Winners</h2>");
//        out.println("<table border='1'><tr><th>Year</th><th>Driver</th><th>Avg Speed</th><th>Country</th></tr>");
//
//        for (AuthorDTO winner : winners) {
//            out.println("<tr><td>" + winner.getYear() + "</td><td>" + winner.getDriver() +
//                        "</td><td>" + winner.getAverageSpeed() + "</td><td>" + winner.getCountry() + "</td></tr>");
//        }
//
//        out.println("</table>");
//
//        // Add pagination
//        out.println("<br><a href='?page=" + (page + 1) + "'>Next</a>");
//        if (page > 1) {
//            out.println(" | <a href='?page=" + (page - 1) + "'>Previous</a>");
//        }
//
//        out.println("</body></html>");
//    }
//}

package com.cst8288.lab2.indysimplelab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

public class IndyWinnerServlet extends HttpServlet {
    private static final int PAGE_SIZE = 10;
    private AuthorDAO dao;

    // Default constructor
    public IndyWinnerServlet() {
        this.dao = new AuthorDAOImpl(); // Default DAO implementation
    }

    // Constructor for injecting a mock DAO (for testing purposes)
    public IndyWinnerServlet(AuthorDAO dao) {
        this.dao = dao;
    }

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

    // Separated method for generating HTML output for easier testing
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
