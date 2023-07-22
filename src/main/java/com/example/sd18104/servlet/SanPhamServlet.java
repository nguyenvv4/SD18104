package com.example.sd18104.servlet;

import com.example.sd18104.entity.SanPham;
import com.example.sd18104.repository.SanPhamRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SanPhamServlet", value = "/san-pham")
public class SanPhamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/san-pham")) {
            SanPhamRepository sanPhamRepository = new SanPhamRepository();
            List<SanPham> list = sanPhamRepository.getAll();
            request.setAttribute("listSanPham", list);
            request.getRequestDispatcher("san-pham.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
