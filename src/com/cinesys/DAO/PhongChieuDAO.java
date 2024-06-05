/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.PhongChieu;
import com.cinesys.untils.jdbcHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author tuanlva
 */
public class PhongChieuDAO extends CineSysDAO<PhongChieu, Integer>{
    
    String insert_sql="insert into PhongChieu(MaPhong,TenPhong,MaRap) values(?,?,?)"; 
    String update_sql="update PhongChieu set TenPhong=?,MaRap=? where MaPhong=?";
    String delete_sql="delete from PhongChieu where MaPhong=?";
    String selectAll_sql="select * from PhongChieu";
    String selectById_sql="select * from PhongChieu where MaPhong=?";  

    @Override
    public void insert(PhongChieu entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaPhong(), entity.getTenPhong(), entity.getMaRap());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(PhongChieu entity) {
        try {
            jdbcHelper.update(update_sql, entity.getTenPhong(), entity.getMaRap(), entity.getMaPhong());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(Integer key) {
        try {
            jdbcHelper.update(delete_sql, key);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<PhongChieu> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public PhongChieu selectById(Integer key) {
        List<PhongChieu> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<PhongChieu> selectBySql(String sql, Object... args) {
        List<PhongChieu> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {                
                PhongChieu entity=new PhongChieu();
                entity.setMaPhong(rs.getInt("MaPhong"));
                entity.setTenPhong(rs.getString("TenPhong"));
                entity.setMaRap(rs.getInt("MaRap"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
