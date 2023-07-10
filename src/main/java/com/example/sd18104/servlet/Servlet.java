package com.example.sd18104.servlet;

import com.example.sd18104.entity.SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Da chay vao day GET");
        String tenSinhVien = " Nguyen Van A";
        request.setAttribute("ten", tenSinhVien);
        SinhVien sinhVien = new SinhVien("Nguyen Van A", "SD18104", "Ha Noi");
        request.setAttribute("sinhVien", sinhVien);
        request.getRequestDispatcher("trang-chu.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Da chay vao day POST");
    }
}
