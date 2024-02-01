package com.example.bee_store.entity;

import com.example.bee_store.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "don_hang")
public class DonHang extends PrimaryEntity {

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten_nguoi_nhan")
    private String tenNguoiNhan;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;

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

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @Column(name = "ngay_dat_hang")
    private Date ngayDatHang;

    @Column(name = "ngay_giao_hang")
    private Date ngayGiaoHang;

    @Column(name = "ngay_huy")
    private Date ngayHuy;

    @Column(name = "ngay_hoan_thanh")
    private Date ngayHoanThanh;

    @Column(name = "ly_do_huy")
    private String lyDoHuy;

    @Column(name = "tien_giam")
    private BigDecimal tienGiam;

    @Column(name = "phi_giao_hang")
    private BigDecimal phiGiaoHang;

    @Column(name = "tong_tien")
    private BigDecimal tongTien;

    @Column(name = "tien_thanh_toan")
    private BigDecimal tienThanhToan;

    @Column(name = "tien_khach_tra")
    private BigDecimal tienKhachTra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_nhan_vien")
    private NhanVien idNhanVien;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_voucher")
    private Voucher idVoucher;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_phuong_thuc_thanh_toan")
    private PhuongThucThanhToan idPhuongThucThanhToan;
}
