/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.Ghe;
import com.cinesys.untils.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author tuanlva
 */
public class GheDAO extends CineSysDAO<Ghe, String>{
    String insert_sql="insert into Ghe(MaGhe, MaPhong) values(?,?)";
    String update_sql="update Ghe set MaPhong=? where MaGhe=?";
    String delete_sql="delete from Ghe where MaGhe=?";
    String selectAll_sql="select * from Ghe";
    String selectById_sql="select * from Ghe where MaGhe=?";

    @Override
    public void insert(Ghe entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaGhe(), entity.getMaPhong());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Ghe entity) {
        try {
            jdbcHelper.update(update_sql, entity.getMaPhong(), entity.getMaGhe());
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
    public List<Ghe> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public Ghe selectById(String key) {
        List<Ghe> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Ghe> selectBySql(String sql, Object... args) {
        List<Ghe> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {                
                Ghe ghe=new Ghe();
                ghe.setMaGhe(rs.getString("MaGhe"));
                ghe.setMaPhong(rs.getInt("MaPhong"));
                list.add(ghe);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Ghe> selectGheSelected(){
        String sql="select * from Ghe WHERE TinhTrang=1";
        return this.selectBySql(sql);
    }
    
}
