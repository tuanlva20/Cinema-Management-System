package com.cinesys.entity;

import java.util.Date;

public class LichChieu_TU {

    int MaLC;
    Date NgayChieu;
    String MaPhim;
    String MaPC;
    String MaSC;

    public LichChieu_TU() {
    }

    public LichChieu_TU(int MaLC, Date NgayChieu, String MaPhim, String MaPC, String MaSC) {
        this.MaLC = MaLC;
        this.NgayChieu = NgayChieu;
        this.MaPhim = MaPhim;
        this.MaPC = MaPC;
        this.MaSC = MaSC;
    }

    public int getMaLC() {
        return MaLC;
    }

    public void setMaLC(int MaLC) {
        this.MaLC = MaLC;
    }

    public Date getNgayChieu() {
        return NgayChieu;
    }

    public void setNgayChieu(Date NgayChieu) {
        this.NgayChieu = NgayChieu;
    }

    public String getMaPhim() {
        return MaPhim;
    }

    public void setMaPhim(String MaPhim) {
        this.MaPhim = MaPhim;
    }

    public String getMaPC() {
        return MaPC;
    }

    public void setMaPC(String MaPC) {
        this.MaPC = MaPC;
    }

    public String getMaSC() {
        return MaSC;
    }

    public void setMaSC(String MaSC) {
        this.MaSC = MaSC;
    }

}
