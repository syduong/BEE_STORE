package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "nhan_vien")
public class NhanVien extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @Column(name = "ho_va_ten")
    private String hoVaTen;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;

    @Column(name = "anh_dai_dien")
    private String anhDaiDien;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "xa")
    private String xa;

    @Column(name = "phuong")
    private String huyen;

    @Column(name = "tinh")
    private String tinh;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_vai_tro")
    private VaiTro idVaiTro;
}
