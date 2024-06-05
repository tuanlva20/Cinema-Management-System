/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class NhanVien {
       private String MatKhau;
       private String MaNV_TaiKhoan;
       private boolean VaiTro;
       private String DiaChi;
       private String CMND;
       private String SDT;
       private String TenNV;
       private Date NgaySinh;
       private String AnhNV;

    public NhanVien() {
    }

    public NhanVien(String MatKhau, String MaNV_TaiKhoan, boolean VaiTro, String DiaChi, String CMND, String SDT, String TenNV, Date NgaySinh, String AnhNV) {
        this.MatKhau = MatKhau;
        this.MaNV_TaiKhoan = MaNV_TaiKhoan;
        this.VaiTro = VaiTro;
        this.DiaChi = DiaChi;
        this.CMND = CMND;
        this.SDT = SDT;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.AnhNV = AnhNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaNV_TaiKhoan() {
        return MaNV_TaiKhoan;
    }

    public void setMaNV_TaiKhoan(String MaNV_TaiKhoan) {
        this.MaNV_TaiKhoan = MaNV_TaiKhoan;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getAnhNV() {
        return AnhNV;
    }

    public void setAnhNV(String AnhNV) {
        this.AnhNV = AnhNV;
    }
      

    
       
}
