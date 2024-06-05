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
public class KhachHang {
    int maKH;
    String tenKhachHang;
    String diaChi;
    String SDT;
    String CMND;
    int diemTichLuy;

    public KhachHang() {
    }

    public KhachHang(int maKH, String tenKhachHang, String diaChi, String SDT, String CMND, int diemTichLuy) {
        this.maKH = maKH;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.CMND = CMND;
        this.diemTichLuy = diemTichLuy;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }
    
}
