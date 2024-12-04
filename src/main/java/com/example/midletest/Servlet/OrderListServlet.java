package com.example.midletest.Servlet;

import com.example.midletest.Entity.Order;
import com.example.midletest.Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "orderListServlet", value = "/orderList")
public class OrderListServlet extends HttpServlet {
    private List<Order> orders = new ArrayList<>();

    public void init() {
        orders.add(new Order(1,"04-12-2024 14:52:30", "Khuc Chi Nhan", "Done"));
        orders.add(new Order(2, "04-01-2024 04:25:03", "Can Tuan Anh", "Delivering"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("orderList", orders);
        request.getRequestDispatcher("OrderList.jsp").forward(request,response);
    }
}
