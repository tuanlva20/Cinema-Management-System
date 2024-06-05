/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Phim_TU {
    String MaPhim;
    String TenPhim;
    String TheLoai;
    String HinhAnh;
    Date NgayMua;
    String DaoDien;
    Date NamSx;
    String QuocGia;
    Date NgayKC;
    Date NgayKt;

    public Phim_TU() {
    }

    public String getMaPhim() {
        return MaPhim;
    }

    public void setMaPhim(String MaPhim) {
        this.MaPhim = MaPhim;
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String TenPhim) {
        this.TenPhim = TenPhim;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date NgayMua) {
        this.NgayMua = NgayMua;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public void setDaoDien(String DaoDien) {
        this.DaoDien = DaoDien;
    }

    public Date getNamSx() {
        return NamSx;
    }

    public void setNamSx(Date NamSx) {
        this.NamSx = NamSx;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public Date getNgayKC() {
        return NgayKC;
    }

    public void setNgayKC(Date NgayKC) {
        this.NgayKC = NgayKC;
    }

    public Date getNgayKt() {
        return NgayKt;
    }

    public void setNgayKt(Date NgayKt) {
        this.NgayKt = NgayKt;
    }

    public Phim_TU(String MaPhim, String TenPhim, String TheLoai, String HinhAnh, Date NgayMua, String DaoDien, Date NamSx, String QuocGia, Date NgayKC, Date NgayKt) {
        this.MaPhim = MaPhim;
        this.TenPhim = TenPhim;
        this.TheLoai = TheLoai;
        this.HinhAnh = HinhAnh;
        this.NgayMua = NgayMua;
        this.DaoDien = DaoDien;
        this.NamSx = NamSx;
        this.QuocGia = QuocGia;
        this.NgayKC = NgayKC;
        this.NgayKt = NgayKt;
    }
    @Override
    public String toString(){
    return this.TenPhim;
    }
    @Override
    public boolean equals(Object obj){
    Phim_TU other=(Phim_TU)obj;
    return other.getMaPhim().equals(this.getMaPhim());
    }
}
