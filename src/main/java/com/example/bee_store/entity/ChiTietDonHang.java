package com.example.bee_store.entity;


import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "chi_tiet_don_hang")
public class ChiTietDonHang extends PrimaryEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_don_hang")
    private DonHang idDonHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_chi_tiet_san_pham")
    private ChiTietSanPham idChiTietSanPham;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "don_gia")
    private Integer donGia;

    @Column(name = "don_gia_sau_giam")
    private Integer donGiaSauGiam;

}
