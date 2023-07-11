package com.example.sd18104.servlet;

import com.example.sd18104.entity.SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Da chay vao day GET");
        String tenSinhVien = " Nguyen Van A";
        request.setAttribute("ten", tenSinhVien);
        SinhVien sinhVien = new SinhVien("Nguyen Van A", "SD18104", "Ha Noi");
        request.setAttribute("sinhVien", sinhVien);

        ArrayList<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("Nguyen Van A", "SD18104", "Ha Noi"));
        list.add(new SinhVien("Nguyen Van B", "SD18105", "Ha Noi 1"));
        list.add(new SinhVien("Nguyen Van C", "SD18105", "Ha Noi 2"));
        list.add(new SinhVien("Nguyen Van D", "SD18104", "Ha Noi"));
        request.setAttribute("listSinhVien", list);
        request.getRequestDispatcher("trang-chu.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Da chay vao day POST");
    }
}
