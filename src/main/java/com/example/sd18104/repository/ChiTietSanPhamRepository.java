package com.example.sd18104.repository;

import com.example.sd18104.entity.ChiTietSanPham;
import com.example.sd18104.entity.SanPham;
import com.example.sd18104.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class ChiTietSanPhamRepository {


    public List<ChiTietSanPham> getAll() {
        List<ChiTietSanPham> listSanPham = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            listSanPham = session.createQuery("from ChiTietSanPham ").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    public static void main(String[] args) {
        ChiTietSanPhamRepository chiTietSanPhamRepository = new ChiTietSanPhamRepository();

        List<ChiTietSanPham> list = new ArrayList<>();
        list = chiTietSanPhamRepository.getAll();

        for (ChiTietSanPham chiTietSanPham: list){

            System.out.println(chiTietSanPham.getSanPham().getTen().toString());
        }
    }
}
