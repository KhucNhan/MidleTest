package com.example.midletest.Servlet;

import com.example.midletest.Entity.CartItem;
import com.example.midletest.Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "cartItemServlet", value = "/cartItemList")
public class CartItemListServlet extends HttpServlet {
    private List<CartItem> cart = new ArrayList<>();

    public void init() {
        cart.add(new CartItem("Iphone 16 Pro Max", 1, 30000000, 30000000));
        cart.add(new CartItem("Samsung s22 Ultra 5G", 1, 25000000, 25000000));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("cartItemList", cart);
        request.getRequestDispatcher("CartItemList.jsp").forward(request,response);
    }
}
