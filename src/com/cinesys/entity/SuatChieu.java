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
public class SuatChieu {
    String maSC;
    String tenSC;
    Date GioBatDau;
    Date GioKetThuc;

    public SuatChieu() {
    }

    public SuatChieu(String maSC, String tenSC, Date GioBatDau, Date GioKetThuc) {
        this.maSC = maSC;
        this.tenSC = tenSC;
        this.GioBatDau = GioBatDau;
        this.GioKetThuc = GioKetThuc;
    }

    public String getMaSC() {
        return maSC;
    }

    public void setMaSC(String maSC) {
        this.maSC = maSC;
    }

    public String getTenSC() {
        return tenSC;
    }

    public void setTenSC(String tenSC) {
        this.tenSC = tenSC;
    }

    public Date getGioBatDau() {
        return GioBatDau;
    }

    public void setGioBatDau(Date GioBatDau) {
        this.GioBatDau = GioBatDau;
    }

    public Date getGioKetThuc() {
        return GioKetThuc;
    }

    public void setGioKetThuc(Date GioKetThuc) {
        this.GioKetThuc = GioKetThuc;
    }
    
}
