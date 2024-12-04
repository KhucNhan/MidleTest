package com.example.midletest.Servlet;

import com.example.midletest.Entity.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "documentListServlet", value = "/documentList")
public class DocumentListServlet extends HttpServlet {
    private List<Document> documents = new ArrayList<>();

    @Override
    public void init() {
        documents.add(new Document("Introduction to Java", "Computer Science", "Dr. John Smith", "PDF"));
        documents.add(new Document("Advanced Mathematics", "Mathematics", "Prof. Alice Brown", "Word"));
        documents.add(new Document("Physics Fundamentals", "Physics", "Dr. Emily White", "PDF"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("documentList", documents);
        request.getRequestDispatcher("DocumentList.jsp").forward(request, response);
    }
}
