/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

/**
 *
 * @author DELL
 */
public class User {
    private String Ten;
    private String MatKhau;
    private String MaNV_TaiKhoan;
    private Boolean vaiTro;
    private String AnhNV;

    public String getAnhNV() {
        return AnhNV;
    }

    public void setAnhNV(String AnhNV) {
        this.AnhNV = AnhNV;
    }

    public User(String Ten, String MatKhau, String MaNV_TaiKhoan, Boolean vaiTro, String AnhNV) {
        this.Ten = Ten;
        this.MatKhau = MatKhau;
        this.MaNV_TaiKhoan = MaNV_TaiKhoan;
        this.vaiTro = vaiTro;
        this.AnhNV = AnhNV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public User() {
    }



    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public Boolean getVaiTro() {
        return vaiTro;
    }


    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaNV_TaiKhoan() {
        return MaNV_TaiKhoan;
    }

    public void setMaNV_TaiKhoan(String MaNV_TaiKhoan) {
        this.MaNV_TaiKhoan = MaNV_TaiKhoan;
    }
    
    
}
