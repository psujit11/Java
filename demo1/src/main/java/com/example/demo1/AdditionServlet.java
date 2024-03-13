package com.example.demo1;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/additionServlet")
public class AdditionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");

        // Perform addition
        int sum = Integer.parseInt(number1) + Integer.parseInt(number2);

        // Set the result as a request attribute
        request.setAttribute("sum", sum);

        // Forward to the result page
        request.getRequestDispatcher("Result.jsp").forward(request, response);
    }
}
