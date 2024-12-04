package com.example.midletest.Servlet;
import com.example.midletest.Entity.Pet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "petListServlet", value = "/petList")
public class PetListServlet extends HttpServlet {
    private List<Pet> pets = new ArrayList<>();

    @Override
    public void init() {
        pets.add(new Pet("Bella", "Dog", 3, "Alice Johnson"));
        pets.add(new Pet("Luna", "Cat", 2, "Michael Smith"));
        pets.add(new Pet("Charlie", "Rabbit", 1, "Emma Brown"));
        pets.add(new Pet("Max", "Parrot", 5, "John Doe"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("petList", pets);
        request.getRequestDispatcher("PetList.jsp").forward(request, response);
    }
}
