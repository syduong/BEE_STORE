package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "san_pham")
public class SanPham extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "mo_ta")
    private String moTa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_xuat_xu")
    private XuatXu idXuatXu;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dong_san_pham")
    private DongSanPham idDongSanPham;
}
