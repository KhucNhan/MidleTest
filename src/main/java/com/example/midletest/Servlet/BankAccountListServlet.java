package com.example.midletest.Servlet;

import com.example.midletest.Entity.BankAccount;
import com.example.midletest.Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bankAccountListServlet", value = "/bankAccountList")
public class BankAccountListServlet extends HttpServlet {
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public void init() {
        bankAccounts.add(new BankAccount(88888888, "Khuc Chi Nhan", 100000000, true));
        bankAccounts.add(new BankAccount(49534953, "The Hong Bao Khanh", -100000000, true));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("bankAccountList", bankAccounts);
        request.getRequestDispatcher("BankAccountList.jsp").forward(request,response);
    }
}
