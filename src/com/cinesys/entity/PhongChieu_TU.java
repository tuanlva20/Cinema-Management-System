/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

/**
 *
 * @author admin
 */
public class PhongChieu_TU {
    String MaPhong;
    String TenPhong;

    public PhongChieu_TU() {
    }

    public PhongChieu_TU(String MaPhong, String TenPhong) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    @Override
    public String toString(){
    return this.MaPhong;
    }
    @Override
    public boolean equals(Object obj){
    PhongChieu_TU other=(PhongChieu_TU)obj;
    return other.getMaPhong().equals(this.getMaPhong());
    }
}
