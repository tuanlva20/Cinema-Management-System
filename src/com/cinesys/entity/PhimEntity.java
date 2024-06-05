/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

import java.util.Date;

/**
 *
 * @author 84987
 */
public class PhimEntity {
    private String maPhim;
    private String tenPhim;
    private String theLoai;
    private String hinhAnh;
    private Date ngayMua;
    private String daoDien;
    private Date namSX;
    private String quocGia;
    private int thoiLuong; 
    private Date ngayKC;
    private Date ngayKT;

    public String getMaPhim() {
        return maPhim;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public Date getNamSX() {
        return namSX;
    }

    public void setNamSX(Date namSX) {
        this.namSX = namSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public Date getNgayKC() {
        return ngayKC;
    }

    public void setNgayKC(Date ngayKC) {
        this.ngayKC = ngayKC;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }


            
    

}
