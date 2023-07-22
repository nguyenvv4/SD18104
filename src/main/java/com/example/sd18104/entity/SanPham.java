package com.example.sd18104.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SanPham")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")

//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(
//            name = "UUID",
//            strategy = "org.hibernate.id.UUIDGenerator"
//    )
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "GiaBan")
    private Integer giaBan;

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", giaBan=" + giaBan +
                '}';
    }
}
