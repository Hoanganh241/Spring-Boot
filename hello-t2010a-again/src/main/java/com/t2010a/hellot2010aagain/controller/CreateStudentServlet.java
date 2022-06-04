package com.t2010a.hellot2010aagain.controller;

import com.t2010a.hellot2010aagain.model.StudentModel;

import javax.servlet.HttpConstraintElement;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateStudentServlet extends HttpServlet {

    private StudentModel studentModel;

    public CreateStudentServlet(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/students/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String rollNumber = req.getParameter("rollNumber");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String stringBirthday = req.getParameter("birthday");
        System.out.println(fullName);
        LocalDateTime birthday = DateTimeHelper.convertStringToLocalDateTime(stringBirthday);
        Student student = new Student(rollNumber, fullName, email, phone, birthday);

        //validate du lieu
        if (studentModel.save(student) != null) {
            resp.sendRedirect("/admin/students/list");
        }else {
            req.getRequestDispatcher("/admin/students/form.jsp").forward(req, resp);
        }

    }
}