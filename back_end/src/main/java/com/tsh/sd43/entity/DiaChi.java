package com.tsh.sd43.entity;

import com.tsh.sd43.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dia_chi")
public class DiaChi  extends PrimaryEntity {

    @Column(name = "ten")
    private String ten;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;

    @Column(name = "xa")
    @Nationalized
    private String xa;

    @Column(name = "phuong")
    @Nationalized
    private String phuong;

    @Column(name = "tinh")
    @Nationalized
    private String tinh;

    @Column(name = "dia_chi")
    @Nationalized
    private String diaChi;

    @Column(name = "ma_xa")
    private String maXa;

    @Column(name = "ma_phuong")
    private String maPhuong;

    @Column(name = "ma_tinh")
    private String maTinh;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang khachHang;

}
