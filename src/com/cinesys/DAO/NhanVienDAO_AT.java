/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.NhanVien;
import com.cinesys.entity.NhanVienEntity;
import com.cinesys.untils.jdbcHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author tuanlva
 */
public class NhanVienDAO_AT extends CineSysDAO<NhanVien, String> {

    String insert_sql = "insert into NhanVien(MaNV_TaiKhoan,MatKhau,TenNV,VaiTro,CMND,DiaChi,SDT,NgaySinh,Anh) values(?,?,?,?,?,?,?,?,?)";
    String update_sql = "update NhanVien set MatKhau=?,TenNV=?,VaiTro=?,CMND=?,DiaChi=?,SDT=?,NgaySinh=?,Anh=? where MaNV_TaiKhoan=?";
    String delete_sql = "delete from NhanVien where MaNV_TaiKhoan=?";
    String selectAll_sql = "select * from NhanVien";
    String selectById_sql = "select * from NhanVien where MaNV_TaiKhoan=?";

    @Override
    public void insert(NhanVien entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaNV_TaiKhoan(), entity.getMatKhau(), entity.getTenNV(), entity.isVaiTro(), entity.getCMND(), entity.getDiaChi(), entity.getSDT(), entity.getNgaySinh(), entity.getAnhNV());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void update(NhanVien entity) {
        try {
            jdbcHelper.update(update_sql, entity.getMatKhau(), entity.getTenNV(), entity.isVaiTro(), entity.getCMND(), entity.getDiaChi(), entity.getSDT(), entity.getNgaySinh(), entity.getAnhNV(), entity.getMaNV_TaiKhoan());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            jdbcHelper.update(delete_sql, key);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }else return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV_TaiKhoan(rs.getString("MaNV_TaiKhoan"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setCMND(rs.getString("CMND"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setSDT(rs.getString("SDT"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setAnhNV(rs.getString("Anh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NhanVien selectUserPass(String user){
        String sql="SELECT * FROM NhanVien WHERE MaNV_TaiKhoan like ?";
        List<NhanVien> list=this.selectBySql(sql, user);
        if (list.isEmpty()) {
            return null;
        }else return list.get(0);
    }
}
