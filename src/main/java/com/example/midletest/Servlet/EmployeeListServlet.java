package com.example.midletest.Servlet;

import com.example.midletest.Entity.Employee;
import com.example.midletest.Entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "employeeListServlet", value = "/employeeList")
public class EmployeeListServlet extends HttpServlet {
    private List<Employee> employees = new ArrayList<>();

    public void init() {
        employees.add(new Employee("Khuc Chi Nhan", "IT", "Dev", 1000000000, true));
        employees.add(new Employee("The Hong Bao Khanh", "Sale", "Bitch", 5000000, false));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("employeeList", employees);
        request.getRequestDispatcher("EmployeeList.jsp").forward(request,response);
    }
}
