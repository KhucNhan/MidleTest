package com.example.midletest.Servlet;

import com.example.midletest.Entity.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "patientListServlet", value = "/patientList")
public class PatientListServlet extends HttpServlet {
    private List<Patient> patients = new ArrayList<>();

    @Override
    public void init() {
        patients.add(new Patient("John Doe", 45, "Flu", LocalDate.of(2024, 12, 1), "Recovered"));
        patients.add(new Patient("Alice Smith", 32, "Fracture", LocalDate.of(2024, 11, 28), "Ongoing"));
        patients.add(new Patient("Michael Brown", 65, "Heart Disease", LocalDate.of(2024, 11, 20), "Critical"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("patientList", patients);
        request.getRequestDispatcher("PatientList.jsp").forward(request, response);
    }
}
