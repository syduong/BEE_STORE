package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "khach_hang")
public class KhachHang extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @Column(name = "password")
    private String password;

    @Column(name = "ho_ten")
    private String hoTen;

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
}
