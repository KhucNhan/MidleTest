package com.example.midletest.Servlet;
import com.example.midletest.Entity.Appointment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "appointmentListServlet", value = "/appointmentList")
public class AppointmentListServlet extends HttpServlet {
    private List<Appointment> appointments = new ArrayList<>();

    @Override
    public void init() {
        appointments.add(new Appointment("Team Meeting", "2024-12-10 10:00 AM", "Conference Room A", "Discuss project milestones"));
        appointments.add(new Appointment("Doctor Appointment", "2024-12-11 2:30 PM", "City Clinic", "Annual health check-up"));
        appointments.add(new Appointment("Client Presentation", "2024-12-12 3:00 PM", "Zoom", "Present Q4 results to the client"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("appointmentList", appointments);
        request.getRequestDispatcher("AppointmentList.jsp").forward(request, response);
    }
}