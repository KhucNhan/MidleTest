package com.example.midletest.Servlet;

import com.example.midletest.Entity.Event;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "eventListServlet", value = "/eventList")
public class EventListServlet extends HttpServlet {
    private List<Event> events = new ArrayList<>();

    public void init() {
        events.add(new Event("Wedding", "10/03/2025 8.am", "Khuc Chi Nhan's house", 1000));
        events.add(new Event("Wedding", "10/03/2025 8.am", "Khuc Chi Nhan's house", 1000));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("eventList", events);
        request.getRequestDispatcher("EventList.jsp").forward(request,response);
    }
}
