package com.example.midletest.Servlet;
import com.example.midletest.Entity.Scholarship;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "scholarshipListServlet", value = "/scholarshipList")
public class ScholarshipListServlet extends HttpServlet {
    private List<Scholarship> scholarships = new ArrayList<>();

    @Override
    public void init() {
        scholarships.add(new Scholarship("Fullbright Scholarship", "Excellent academic record", "50,000 USD", "2024-12-31"));
        scholarships.add(new Scholarship("Chevening Scholarship", "Leadership potential", "30,000 USD", "2024-11-15"));
        scholarships.add(new Scholarship("Erasmus Mundus", "International exchange student", "40,000 USD", "2025-01-10"));
        scholarships.add(new Scholarship("Gates Cambridge Scholarship", "Outstanding intellectual ability", "100,000 USD", "2024-10-20"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("scholarshipList", scholarships);
        request.getRequestDispatcher("ScholarshipList.jsp").forward(request, response);
    }
}
