package com.t2010a.hellot2010aagain.controller;

import com.t2010a.hellot2010aagain.model.MySqlStudentModel;
import com.t2010a.hellot2010aagain.model.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListStudentServlet extends HttpServlet {
   private StudentModel studentModel;

    public ListStudentServlet(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listStudent", studentModel.findAll());
        req.getRequestDispatcher("/admin/students/list.jsp").forward(req, resp);
    }
}


