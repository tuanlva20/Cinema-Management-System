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
public class Ghe {
    String maGhe;
    int maPhong;
    String tinhTrang;

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Ghe(String maGhe, int maPhong, String tinhTrang) {
        this.maGhe = maGhe;
        this.maPhong = maPhong;
        this.tinhTrang = tinhTrang;
    }

    public Ghe() {
    }

}
