/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

import java.util.Date;

/**
 *
 * @author tuanlva
 */
public class Ve1 {
    int maVe;
    int giaVe;
    Date ngayMua;
    String maGhe;
    String maKH;
    String maNV_TaiKhoan;
    String maSC;
    String maPhim;
    int MaLC;

    public String getMaSC() {
        return maSC;
    }

    public void setMaSC(String maSC) {
        this.maSC = maSC;
    }

    public int getMaLC() {
        return MaLC;
    }

    public void setMaLC(int MaLC) {
        this.MaLC = MaLC;
    }

    public Ve1() {
    }
       
    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV_TaiKhoan() {
        return maNV_TaiKhoan;
    }

    public void setMaNV_TaiKhoan(String maNV_TaiKhoan) {
        this.maNV_TaiKhoan = maNV_TaiKhoan;
    }

  

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }
    
}
