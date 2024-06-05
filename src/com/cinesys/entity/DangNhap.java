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
public class DangNhap {
    int id;
    String username;
    String matKhau;
    String vaiTro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public DangNhap() {
    }

    public DangNhap(int id, String username, String matKhau, String vaiTro) {
        this.id = id;
        this.username = username;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }
}
