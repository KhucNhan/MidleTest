package com.example.midletest.Servlet;

import com.example.midletest.Entity.Product;
import com.example.midletest.Entity.Tour;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "tourListServlet", value = "/tourList")
public class TourListServlet extends HttpServlet {
    private List<Tour> tours = new ArrayList<>();

    public void init() {
        tours.add(new Tour("Du lich Chau Au", "US, UK, Germany, Italy, Franch", "05-12-2024", true));
        tours.add(new Tour("Du lich Chau A", "Viet Nam", "05-12-2024", true));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("tourList", tours);
        request.getRequestDispatcher("TourList.jsp").forward(request,response);
    }
}
