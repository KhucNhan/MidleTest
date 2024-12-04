package com.example.midletest.Servlet;

import com.example.midletest.Entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "productListServlet", value = "/productList")
public class ProductListServlet extends HttpServlet {
    private List<Product> products = new ArrayList<>();

    public void init() {
        products.add(new Product("Iphone 16 Pro Max", 30000000, "Iphone 16 Pro Max 1TB", "https://th.bing.com/th/id/OIP.ZexOj0l_uymbhkQ_lMvoBgAAAA?rs=1&pid=ImgDetMain"));
        products.add(new Product("Samsung s22 Ultra 5G", 30000000, "Samsung s22 Ultra 5G 1TB", "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6494/6494441_sd.jpg"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("productList", products);
        request.getRequestDispatcher("ProductList.jsp").forward(request,response);
    }

    public void destroy() {
    }
}