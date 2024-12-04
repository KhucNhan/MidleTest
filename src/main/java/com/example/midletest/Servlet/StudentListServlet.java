package com.example.midletest.Servlet;

import com.example.midletest.Entity.Product;
import com.example.midletest.Entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "studentListServlet", value = "/studentList")
public class StudentListServlet extends HttpServlet {
    private List<Student> students = new ArrayList<>();

    public void init() {
        students.add(new Student("Khuc Chi Nhan", 1, 10, true));
        students.add(new Student("The Hong Bao Khanh", 2, 0, false));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("studentList", students);
        request.getRequestDispatcher("StudentList.jsp").forward(request,response);
    }
}
