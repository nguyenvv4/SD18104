package com.example.sd18104.entity;

public class SinhVien {

    private String hoTen;

    private String lop;

    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String lop, String diaChi) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
