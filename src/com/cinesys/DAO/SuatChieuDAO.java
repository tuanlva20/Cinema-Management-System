/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.SuatChieu;
import com.cinesys.untils.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author tuanlva
 */
public class SuatChieuDAO extends CineSysDAO<SuatChieu, String> {

    String insert_sql = "insert into SuatChieu(MaSC,TenSC,GioBatDau,GioKetThuc) values(?,?,?,?)";
    String update_sql = "update SuatChieu set TenSC=?,GioBatDau=?,GioKetThuc=? where MaSC=?";
    String delete_sql = "delete from SuatChieu where MaSC=?";
    String selectAll_sql = "select * from SuatChieu";
    String selectById_sql = "select * from SuatChieu where MaSC=?";

    @Override
    public void insert(SuatChieu entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaSC(), entity.getTenSC(), entity.getGioBatDau(), entity.getGioKetThuc());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(SuatChieu entity) {
        try {
            jdbcHelper.update(update_sql, entity.getTenSC(), entity.getGioBatDau(), entity.getGioKetThuc(), entity.getMaSC());
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
    public List<SuatChieu> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public SuatChieu selectById(String key) {
        List<SuatChieu> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SuatChieu> selectBySql(String sql, Object... args) {
        List<SuatChieu> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {                
                SuatChieu sc=new SuatChieu();
                sc.setMaSC(rs.getString("MaSC"));
                sc.setTenSC(rs.getString("TenSC"));
                sc.setGioBatDau(rs.getDate("GioBatDau"));
                sc.setGioKetThuc(rs.getDate("GioKetThuc"));
                list.add(sc);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
