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
public class DoiNguLamViec {
    int maNV;
    String tenNV;
    String CMND;
    String diaChi;
    String SDT;
    Date ngaySinh;
    int id;

    public DoiNguLamViec() {
    }

    public DoiNguLamViec(int maNV, String tenNV, String CMND, String diaChi, String SDT, Date ngaySinh, int id) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.CMND = CMND;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.ngaySinh = ngaySinh;
        this.id = id;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
