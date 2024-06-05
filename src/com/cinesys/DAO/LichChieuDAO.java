/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.LichChieu;
import com.cinesys.untils.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author tuanlva
 */
public class LichChieuDAO extends CineSysDAO<LichChieu, String>{
    String insert_sql="insert into LichChieu(MaLichChieu,NgayChieu,MaPhim,MaPhong,MaSC) values(?,?,?)";
    String update_sql="update LichChieu set NgayChieu=?,MaPhim=?,MaPhong=?,MaSC=? where MaLichChieu=?";
    String delete_sql="delete from LichChieu where MaLichChieu=?";
    String selectAll_sql="select * from LichChieu";
    String selectById_sql="select * from LichChieu where MaLichChieu=?";

    @Override
    public void insert(LichChieu entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaLichChieu(), entity.getNgayChieu(), entity.getMaPhim(), entity.getMaPhong(), entity.getMaSC());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(LichChieu entity) {
        try {
            jdbcHelper.update(update_sql, entity.getNgayChieu(), entity.getMaPhim(), entity.getMaPhong(), entity.getMaSC(), entity.getMaLichChieu());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String key) {
        try {
            jdbcHelper.update(delete_sql, key);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<LichChieu> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public LichChieu selectById(String key) {
        List<LichChieu> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LichChieu> selectBySql(String sql, Object... args) {
        List<LichChieu> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {                
                LichChieu entity=new LichChieu();
                entity.setMaLichChieu(rs.getInt("MaLichChieu"));
                entity.setNgayChieu(rs.getDate("NgayChieu"));
                entity.setMaPhim(rs.getString("MaPhim"));
                entity.setMaPhong(rs.getInt("MaPhong"));
                entity.setMaSC(rs.getString("MaSC"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
