package com.example.sd18104.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ChiTietSP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")

    private Integer id;

    @JoinColumn(name = "IdSP")
    @ManyToOne
    private SanPham sanPham;

    @Column(name = "NamBH")
    private Integer namBh;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "GiaNhap")
    private Integer giaNhap;

    @Column(name = "GiaBan")
    private Integer giaBan;

    @Override
    public String toString() {
        return "ChiTietSanPham{" +
                "id=" + id +
                ", sanPham=" + sanPham +
                ", namBh=" + namBh +
                ", moTa='" + moTa + '\'' +
                ", soLuongTon=" + soLuongTon +
                ", giaNhap=" + giaNhap +
                ", giaBan=" + giaBan +
                '}';
    }
}
