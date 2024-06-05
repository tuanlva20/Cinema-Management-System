/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.DoiNguLamViec;
import com.cinesys.untils.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author tuanlva
 */
public class DoiNguLamViecDAO extends CineSysDAO<DoiNguLamViec, Integer>{

    String insert_sql="insert into DoiNguLamViec(MaNV,TenNV,CMND,DiaChi,SDT,NgaySinh,ID) values(?,?,?,?,?,?,?)";
    String update_sql="update DoiNguLamViec set TenNV=?,CMND=?,DiaChi=?,SDT=?,NgaySinh=?,ID=? where MaNV=?";
    String delete_sql="delete form DoiNguLamViec where MaNV=?";
    String selectAll_sql="select * from DoiNguLamViec";
    String selectById_sql ="select * from DoiNguLamViec where MaNV=?";
    @Override
    public void insert(DoiNguLamViec entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaNV(), entity.getTenNV(), entity.getCMND(), entity.getDiaChi(), entity.getSDT(), entity.getNgaySinh(), entity.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
   }

    @Override
    public void update(DoiNguLamViec entity) {
        try {
            jdbcHelper.update(update_sql, entity.getTenNV(), entity.getCMND(), entity.getDiaChi(), entity.getSDT(), entity.getNgaySinh(), entity.getId(), entity.getMaNV());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer key) {
        try {
            jdbcHelper.update(delete_sql, key);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<DoiNguLamViec> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public DoiNguLamViec selectById(Integer key) {
        List<DoiNguLamViec> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<DoiNguLamViec> selectBySql(String sql, Object... args) {
        List<DoiNguLamViec> list=new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while (rs.next()) {
                DoiNguLamViec nv=new DoiNguLamViec();
                nv.setMaNV(rs.getInt("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setCMND(rs.getString("CMND"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("SDT"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setId(rs.getInt("ID"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
