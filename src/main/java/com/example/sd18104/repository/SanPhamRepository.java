package com.example.sd18104.repository;

import com.example.sd18104.entity.SanPham;
import com.example.sd18104.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository {

    public List<SanPham> getAll() {
        List<SanPham> listSanPham = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            listSanPham = session.createQuery("from SanPham ").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    public SanPham getById(Integer id) {
        SanPham sanPham = new SanPham();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            sanPham = session.get(SanPham.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanPham;
    }
}
