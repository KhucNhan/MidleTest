package com.example.midletest.Servlet;

import com.example.midletest.Entity.Course;
import com.example.midletest.Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "courseListServlet", value = "/courseList")
public class CourseListServlet extends HttpServlet {
    private List<Course> courses = new ArrayList<>();

    public void init() {
        courses.add(new Course("Java", "Khuc Chi Nhan", 50, 100000));
        courses.add(new Course("Javascript", "Khuc Chi Nhan", 50, 100000));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("courseList", courses);
        request.getRequestDispatcher("CourseList.jsp").forward(request,response);
    }
}
