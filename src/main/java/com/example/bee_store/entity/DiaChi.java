package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "dia_chi")
public class DiaChi extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @Column(name = "ma_thanh_pho")
    private String maThanhPho;

    @Column(name = "ten_thanh_pho")
    private String tenThanhPho;

    @Column(name = "ma_quan_huyen")
    private String maQuanHuyen;

    @Column(name = "ten_quan_huyen")
    private String tenQuanHuyen;

    @Column(name = "ma_xa_phuong")
    private String maXaPhuong;

    @Column(name = "ten_xa_phuong")
    private String tenXaPhuong;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;
}
