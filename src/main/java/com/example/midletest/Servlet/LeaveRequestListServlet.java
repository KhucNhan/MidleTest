package com.example.midletest.Servlet;

import com.example.midletest.Entity.LeaveRequest;
import com.example.midletest.Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "leaveRequestListServlet", value = "/leaveRequestList")
public class LeaveRequestListServlet extends HttpServlet {
    private List<LeaveRequest> leaveRequests = new ArrayList<>();

    public void init() {
        leaveRequests.add(new LeaveRequest("Khuc Chi Nhan", "04-05-2024", "11-05-2024", true));
        leaveRequests.add(new LeaveRequest("Khuc Chi Nhan", "04-05-2024", "11-05-2024", true));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("leaveRequestList", leaveRequests);
        request.getRequestDispatcher("LeaveRequestList.jsp").forward(request,response);
    }
}
