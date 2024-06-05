
package com.cinesys.entity;

/**
 *
 * @author admin
 */
public class KhachHang_TU {
    String MaKH;
    String TenKH;
    int CMND;
    String diachi;
    String SDT;
    float DiemTichLuy;

    public KhachHang_TU() {
    }

    public KhachHang_TU(String MaKH, String TenKH, int CMND, String diachi, String SDT, float DiemTichLuy) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.CMND = CMND;
        this.diachi = diachi;
        this.SDT = SDT;
        this.DiemTichLuy = DiemTichLuy;
    }
    

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public float getDiemTichLuy() {
        return DiemTichLuy;
    }

    public void setDiemTichLuy(float DiemTichLuy) {
        this.DiemTichLuy = DiemTichLuy;
    }

   
   
    
}
