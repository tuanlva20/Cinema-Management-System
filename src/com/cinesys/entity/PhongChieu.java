/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

/**
 *
 * @author tuanlva
 */
public class PhongChieu {
    int maPhong;
    String tenPhong;
    int maRap;

    public PhongChieu() {
    }

    public PhongChieu(int maPhong, String tenPhong, int maRap) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.maRap = maRap;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getMaRap() {
        return maRap;
    }

    public void setMaRap(int maRap) {
        this.maRap = maRap;
    }
    
}
