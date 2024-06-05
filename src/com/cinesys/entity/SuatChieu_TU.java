/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.entity;

import java.sql.Time;



/**
 *
 * @author admin
 */
public class SuatChieu_TU {
    String MaSC;
    String TenSC;
    Time GioBD;
    Time GioKT;

    public SuatChieu_TU() {
    }

    public String getMaSC() {
        return MaSC;
    }

    public void setMaSC(String MaSC) {
        this.MaSC = MaSC;
    }

    public String getTenSC() {
        return TenSC;
    }

    public void setTenSC(String TenSC) {
        this.TenSC = TenSC;
    }

    public Time getGioBD() {
        return GioBD;
    }

    public void setGioBD(Time GioBD) {
        this.GioBD = GioBD;
    }

    public Time getGioKT() {
        return GioKT;
    }

    public void setGioKT(Time GioKT) {
        this.GioKT = GioKT;
    }

    public SuatChieu_TU(String MaSC, String TenSC, Time GioBD, Time GioKT) {
        this.MaSC = MaSC;
        this.TenSC = TenSC;
        this.GioBD = GioBD;
        this.GioKT = GioKT;
    }

    
    @Override
    public String toString(){
    return this.MaSC+" : "+this.GioBD;
    }
    @Override
    public boolean equals(Object obj){
    SuatChieu_TU other=(SuatChieu_TU)obj;
    return other.getMaSC().equals(this.getMaSC());
    }
}
