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
public class Rap {
    int maRap;
    String tenRap;
    String diaChi;

    public Rap() {
    }

    public Rap(int maRap, String tenRap, String diaChi) {
        this.maRap = maRap;
        this.tenRap = tenRap;
        this.diaChi = diaChi;
    }

    public int getMaRap() {
        return maRap;
    }

    public void setMaRap(int maRap) {
        this.maRap = maRap;
    }

    public String getTenRap() {
        return tenRap;
    }

    public void setTenRap(String tenRap) {
        this.tenRap = tenRap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
