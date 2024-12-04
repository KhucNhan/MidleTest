package com.example.midletest.Servlet;

import com.example.midletest.Entity.Book;
import com.example.midletest.Entity.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bookListServlet", value = "/bookList")
public class BookListServlet extends HttpServlet {
    private List<Book> books = new ArrayList<>();

    public void init() {
        books.add(new Book("One Piece", "Oda", "Animation", 2000));
        books.add(new Book("Doraemon", "Fuji", "Animation", 1999));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("bookList", books);
        request.getRequestDispatcher("BookList.jsp").forward(request,response);
    }
}
