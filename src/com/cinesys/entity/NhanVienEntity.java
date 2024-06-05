
package com.cinesys.entity;

import java.util.Date;

public class NhanVienEntity {
    private String maNV_TaiKhoan;
    private String matKhau;  
    private String tenNV;
    private boolean vaiTro;
    private String CMND;
    private String diaChi;
    private String soDT;
    private Date ngaySinh;
    private String anhNV;

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

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaNV_TaiKhoan() {
        return maNV_TaiKhoan;
    }

    public void setMaNV_TaiKhoan(String maNV_TaiKhoan) {
        this.maNV_TaiKhoan = maNV_TaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getAnhNV() {
        return anhNV;
    }

    public void setAnhNV(String anhNV) {
        this.anhNV = anhNV;
    }
    
    
    
}
