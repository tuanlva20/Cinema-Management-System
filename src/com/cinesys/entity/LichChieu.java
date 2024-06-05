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
public class LichChieu {
    int maLichChieu;
    Date ngayChieu;
    String maPhim;
    int maPhong;
    String maSC;

    public LichChieu() {
    }

    public LichChieu(int maLichChieu, Date ngayChieu, String maPhim, int maPhong, String maSC) {
        this.maLichChieu = maLichChieu;
        this.ngayChieu = ngayChieu;
        this.maPhim = maPhim;
        this.maPhong = maPhong;
        this.maSC = maSC;
    }

    public int getMaLichChieu() {
        return maLichChieu;
    }

    public void setMaLichChieu(int maLichChieu) {
        this.maLichChieu = maLichChieu;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaSC() {
        return maSC;
    }

    public void setMaSC(String maSC) {
        this.maSC = maSC;
    }


    
}
