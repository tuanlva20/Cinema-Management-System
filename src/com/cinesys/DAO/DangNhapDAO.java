/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.DangNhap;
import com.cinesys.untils.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author tuanlva
 */
public class DangNhapDAO extends CineSysDAO<DangNhap, Integer>{
    String insert_sql="insert into DangNhap(ID,Username,MatKhau,VaiTro) values (?,?,?,?)";
    String update_sql="update DangNhap set Username=?,MatKhau=?,VaiTro=? where ID=?";
    String delete_sql="delete from DangNhap where ID=?";
    String selectAll_sql="select * from DangNhap";
    String selectById_sql="select * from DangNhap where Id=?";
    
    @Override
    public void insert(DangNhap entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getId(), entity.getUsername(), entity.getMatKhau(), entity.getVaiTro());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(DangNhap entity) {
        try {
            jdbcHelper.update(update_sql, entity.getUsername(), entity.getMatKhau(), entity.getVaiTro(), entity.getId());
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
    public List<DangNhap> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public DangNhap selectById(Integer key) {
        List<DangNhap> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<DangNhap> selectBySql(String sql, Object... args) {
        List<DangNhap> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {
                DangNhap entity=new DangNhap();
                entity.setId(rs.getInt("ID"));
                entity.setUsername(rs.getString("Username"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getString("VaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DangNhap selectById(String taikhoan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
