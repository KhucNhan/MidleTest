package com.example.midletest.Servlet;

import com.example.midletest.Entity.Product;
import com.example.midletest.Entity.Ticket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "ticketListServlet", value = "/ticketList")
public class TicketListServlet extends HttpServlet {
    private List<Ticket> tickets = new ArrayList<>();

    public void init() {
        tickets.add(new Ticket(1, "DeathPool & Wolverine", "F10", 100000));
        tickets.add(new Ticket(2, "Life of Pi", "F10", 200000));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("ticketList", tickets);
        request.getRequestDispatcher("TicketList.jsp").forward(request,response);
    }
}
