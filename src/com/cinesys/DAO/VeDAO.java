/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.Ve1;
import com.cinesys.untils.jdbcHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author tuanlva
 */
public class VeDAO extends CineSysDAO<Ve1, Integer> {

    String insert_sql = "insert into Ve(MaVe,GiaVe,NgayMua,MaGhe,MaKH,MaNV_TaiKhoan,MaLC,MaPhim) values(?,?,?,?,?,?,?,?)";
    String update_sql = "update Ve set GiaVe=?,NgayMua=?,MaGhe=?,MaKH=?,MaNV_TaiKhoan=?,MaLC=?,MaPhim=? where MaVe=?";
    String delete_sql = "delete from Ve where MaVe=?";
    String selectAll_sql = "select * from Ve";
    String selectById_sql = "select * from Ve where MaVe=?";

    @Override
    public void insert(Ve1 entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaVe(), entity.getGiaVe(), entity.getNgayMua(),entity.getMaGhe(),entity.getMaKH(),entity.getMaNV_TaiKhoan(),entity.getMaLC(),entity.getMaPhim());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Ve1 entity) {
        try {
            jdbcHelper.update(update_sql, entity.getGiaVe(), entity.getNgayMua(), entity.getMaGhe(), entity.getMaKH(), entity.getMaNV_TaiKhoan(), entity.getMaLC(),entity.getMaPhim(), entity.getMaVe());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(Integer MaVe) {
        try {
            jdbcHelper.update(delete_sql, MaVe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ve1> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public Ve1 selectById(Integer MaVe) {
        List<Ve1> list=this.selectBySql(selectById_sql, MaVe);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Ve1> selectBySql(String sql, Object... args) {
        List<Ve1> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {                
                Ve1 entity=new Ve1();
                entity.setMaVe(rs.getInt("MaVe"));
                entity.setGiaVe(rs.getInt("GiaVe"));
                entity.setNgayMua(rs.getDate("NgayMua"));
                entity.setMaGhe(rs.getString("MaGhe"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setMaNV_TaiKhoan(rs.getString("MaNV_TaiKhoan"));
                entity.setMaLC(rs.getInt("MaLC"));
                entity.setMaPhim(rs.getString("MaPhim"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
public List<Ve1> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM Ve WHERE MaVe like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

//    public List<Ve1> getList() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
