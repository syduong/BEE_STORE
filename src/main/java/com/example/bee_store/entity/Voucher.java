package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "voucher")
public class Voucher extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "loai")
    private Integer loai;

    @Column(name = "muc_giam")
    private BigDecimal mucGiam;

    @Column(name = "muc_giam_toi_da")
    private BigDecimal mucGiamToiDa;

    @Column(name = "gia_tri_toi_da")
    private BigDecimal giaTriToiDa;

    @Column(name = "gia_tri_toi_thieu")
    private BigDecimal giaTriToiThieu;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "ngay_bat_dau")
    private Date ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private Date ngayKetThuc;

}
