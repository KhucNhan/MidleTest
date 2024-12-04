package com.example.midletest.Servlet;

import com.example.midletest.Entity.Vote;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "voteListServlet", value = "/voteList")
public class VoteListServlet extends HttpServlet {
    private List<Vote> votes = new ArrayList<>();

    @Override
    public void init() {
        List<String> choices1 = List.of("Option A", "Option B", "Option C");
        List<Integer> votes1 = List.of(50, 30, 20);
        this.votes.add(new Vote("What is your favorite color?", choices1, votes1));

        List<String> choices2 = List.of("Yes", "No", "Maybe");
        List<Integer> votes2 = List.of(100, 40, 60);
        this.votes.add(new Vote("Do you like coffee?", choices2, votes2));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("voteList", votes);
        request.getRequestDispatcher("VoteList.jsp").forward(request, response);
    }
}

