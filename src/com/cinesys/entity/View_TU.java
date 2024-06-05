
package com.cinesys.entity;

import java.sql.Time;
import java.util.Date;

public class View_TU {
    String tenphim;
    Time giobd;
    Date ngaychieu;
    String hinhanh;

    public View_TU() {
    }

    public View_TU(String tenphim, Time giobd, Date ngaychieu, String hinhanh) {
        this.tenphim = tenphim;
        this.giobd = giobd;
        this.ngaychieu = ngaychieu;
        this.hinhanh = hinhanh;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public Time getGiobd() {
        return giobd;
    }

    public void setGiobd(Time giobd) {
        this.giobd = giobd;
    }

    public Date getNgaychieu() {
        return ngaychieu;
    }

    public void setNgaychieu(Date ngaychieu) {
        this.ngaychieu = ngaychieu;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
    
}
