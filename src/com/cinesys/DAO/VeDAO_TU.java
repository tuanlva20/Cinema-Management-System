/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.Ve1;
import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class VeDAO_TU extends RapPhimDAO_TU<Ve1, Object>{

    @Override
    public void insert(Ve1 entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Ve1 entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ve1> selectAll() {
        String sql = "select * from Ve";
        return selectBySQL(sql);
    }

    @Override
    public Ve1 selectByID(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Ve1> selectBySQL(String sql, Object... arg) {
        List <Ve1> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, arg);
            while(rs.next()){
                Ve1 ve = new Ve1();
                ve.setMaVe(rs.getInt(1));
                ve.setGiaVe(rs.getInt(2));
                ve.setNgayMua(rs.getDate(3));
                ve.setMaGhe(rs.getString(4));
                ve.setMaKH(rs.getString(5));
                ve.setMaNV_TaiKhoan(rs.getString(6));
                ve.setMaLC(rs.getInt(7));
                ve.setMaPhim(rs.getString(8));
                list.add(ve);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
