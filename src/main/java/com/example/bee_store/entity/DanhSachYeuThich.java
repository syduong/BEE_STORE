package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "danh_sach_yeu_thich")
public class DanhSachYeuThich extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_san_pham")
    private SanPham idSanPham;
}
