package com.example.midletest.Servlet;

import com.example.midletest.Entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "carListServlet", value = "/carList")
public class CarListServlet extends HttpServlet {
    private List<Car> cars = new ArrayList<>();

    public void init() {
        cars.add(new Car("BMW", "BMW", 1000000000, true));
        cars.add(new Car("BMW", "BMW", 1000000000, true));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("carList", cars);
        request.getRequestDispatcher("CarList.jsp").forward(request,response);
    }
}
