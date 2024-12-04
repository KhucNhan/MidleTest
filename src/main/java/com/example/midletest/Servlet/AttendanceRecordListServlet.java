package com.example.midletest.Servlet;

import com.example.midletest.Entity.AttendanceRecord;
import com.example.midletest.Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "attendanceRecordListServlet", value = "/attendanceRecordList")
public class AttendanceRecordListServlet extends HttpServlet {
    private List<AttendanceRecord> attendanceRecords = new ArrayList<>();

    public void init() {
        attendanceRecords.add(new AttendanceRecord("Khuc Chi Nhan", "01-12/2024", 40, true));
        attendanceRecords.add(new AttendanceRecord("Khuc Chi Nhan", "01-12/2024", 40, true));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("attendanceRecordList", attendanceRecords);
        request.getRequestDispatcher("AttendanceRecordList.jsp").forward(request,response);
    }
}
