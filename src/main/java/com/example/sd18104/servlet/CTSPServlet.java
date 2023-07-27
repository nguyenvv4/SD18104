package com.example.sd18104.servlet;

import com.example.sd18104.entity.ChiTietSanPham;
import com.example.sd18104.entity.SanPham;
import com.example.sd18104.repository.ChiTietSanPhamRepository;
import com.example.sd18104.repository.SanPhamRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CTSPServlet", value = {
        "/chi-tiet-san-pham",
        "/addCtsp",
})
public class CTSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SanPhamRepository sanPhamRepository = new SanPhamRepository();
        List<SanPham> listSp = sanPhamRepository.getAll();
        request.setAttribute("listSp", listSp);
        ChiTietSanPhamRepository chiTietSanPhamRepository = new ChiTietSanPhamRepository();
        List<ChiTietSanPham> listCtsp = chiTietSanPhamRepository.getAll();
        request.setAttribute("listCtsp", listCtsp);
        request.getRequestDispatcher("/CTSP.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idSp = request.getParameter("idSp");
        String namBh = request.getParameter("namBh");
        String moTa = request.getParameter("moTa");
        String soLuongTon = request.getParameter("soLuongTon");
        String giaNhap = request.getParameter("giaNhap");
        String giaBan = request.getParameter("giaBan");

        SanPham sanPham = new SanPham();
        sanPham.setId(Integer.parseInt(idSp));
        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
        chiTietSanPham.setSanPham(sanPham);
        chiTietSanPham.setGiaBan(Integer.parseInt(giaBan));
        chiTietSanPham.setGiaNhap(Integer.parseInt(giaNhap));
        chiTietSanPham.setMoTa(moTa);
        chiTietSanPham.setSoLuongTon(Integer.parseInt(soLuongTon));
        chiTietSanPham.setNamBh(Integer.parseInt(namBh));
        new ChiTietSanPhamRepository().addNew(chiTietSanPham);
        response.sendRedirect("/chi-tiet-san-pham");
    }
}
