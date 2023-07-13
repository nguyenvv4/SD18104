package com.example.sd18104.servlet;

import com.example.sd18104.entity.SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Servlet", value = {
        "/home",
        "/detail"
})
public class Servlet extends HttpServlet {
    ArrayList<SinhVien> list = new ArrayList<>();

    public Servlet() {
        list.add(new SinhVien("SV1", "Nguyen Van A", "SD18104", "Ha Noi"));
        list.add(new SinhVien("SV2", "Nguyen Van B", "SD18105", "Ha Noi 1"));
        list.add(new SinhVien("SV3", "Nguyen Van C", "SD18105", "Ha Noi 2"));
        list.add(new SinhVien("SV4", "Nguyen Van D", "SD18104", "Ha Noi"));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getRequestURI().contains("home")) {
            request.setAttribute("listSinhVien", list);
            request.getRequestDispatcher("trang-chu.jsp").forward(request, response);
        } else if (request.getRequestURI().contains("/detail")) {
            String id = request.getParameter("id");
            SinhVien detail = new SinhVien();
            for (SinhVien sinhVien : list) {
                if (sinhVien.getId().equals(id)) {
                    detail = sinhVien;
                }
            }
            request.setAttribute("detail", detail);
            request.getRequestDispatcher("detail.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Da chay vao day POST");
    }
}
