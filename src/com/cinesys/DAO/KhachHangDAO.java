/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.KhachHang;
import com.cinesys.untils.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author tuanlva
 */
public class KhachHangDAO extends CineSysDAO<KhachHang, Integer> {

    String insert_sql = "insert into KhachHang(MaKH,TenKhachHang,DiaChi,SDT,CMND) values(?,?,?,?,?)";
    String update_sql = "update KhachHang set TenKhachHang=?,DiaChi=?,SDT=?,CMND=? where MaKH=?";
    String delete_sql = "delete from KhachHang where MaKH=?";
    String selectAll_sql = "select * from KhachHang";
    String selectById_sql = "select * from KhachHang where MaKH=?";

    @Override
    public void insert(KhachHang entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaKH(), entity.getTenKhachHang(), entity.getDiaChi(), entity.getSDT(), entity.getCMND());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(KhachHang entity) {
        try {
            jdbcHelper.update(update_sql, entity.getTenKhachHang(), entity.getDiaChi(), entity.getSDT(), entity.getCMND(), entity.getMaKH());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer key) {
        try {
            jdbcHelper.update(delete_sql, key);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public KhachHang selectById(Integer key) {
        List<KhachHang> list = this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setTenKhachHang(rs.getString("TenKhachHang"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setSDT(rs.getString("SDT"));
                kh.setCMND(rs.getString("CMND"));
                kh.setDiemTichLuy(rs.getInt("DiemTichLuy"));
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public KhachHang selectBySDT(String SDT){
        String sql="SELECT * from KhachHang where SDT LIKE ?";
        List<KhachHang> list=this.selectBySql(sql, SDT);
        if (list.isEmpty()) {
            return null;
        }else return list.get(0);
    }
}
