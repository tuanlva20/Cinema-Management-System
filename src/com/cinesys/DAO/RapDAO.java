/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.Rap;
import com.cinesys.untils.jdbcHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tuanlva
 */
public class RapDAO extends CineSysDAO<Rap, Integer>{
    String insert_sql="insert into Rap(MaRap,TenRap,DiaChi) values(?,?,?)"; 
    String update_sql="update Rap set TenRap=?,DiaChi=? where MaRap=?";
    String delete_sql="delete from Rap where MaRap=?";
    String selectAll_sql="select * from Rap";
    String selectById_sql="select * from Rap where MaRap=?"; 
    @Override
    public void insert(Rap entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaRap(), entity.getTenRap(), entity.getDiaChi());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Rap entity) {
        try {
            jdbcHelper.update(update_sql, entity.getTenRap(), entity.getDiaChi(), entity.getMaRap());
        } catch (Exception e) {
            throw new RuntimeException(e);
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
    public List<Rap> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public Rap selectById(Integer key) {
        List<Rap> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Rap> selectBySql(String sql, Object... args) {
        List<Rap> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {                
                Rap entity=new Rap();
                entity.setMaRap(rs.getInt("MaRap"));
                entity.setTenRap(rs.getString("TenRap"));
                entity.setDiaChi(rs.getString("Diachi"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
