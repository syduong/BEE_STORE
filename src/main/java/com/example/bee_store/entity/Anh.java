package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "anh")
public class Anh extends PrimaryEntity {

    @Column(name = "duong_dan")
    private String duongDan;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_chi_tiet_san_pham")
    private ChiTietSanPham idChiTietSanPham;
}
