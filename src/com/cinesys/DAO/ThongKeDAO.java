/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.untils.jdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tuanlva
 */
public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);

                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Object[]> getSuatChieu(String tenPhim){
        String sql="{CALL sp_SuatChieuPhim(?)}";
        String[] cols={"NgayChieu","GioBatDau","GioKetThuc"};
        return this.getListOfArray(sql, cols, tenPhim);
    } 
    
    public List<Object[]> getSuatChieuRap(String tenPhim, Date NgayChieu, Date GioBatDau){
        String sql="{CALL sp_LichChieuTheoRap(?,?,?)}";
        String[] cols={"NgayChieu","TenPhim","HinhAnh","DaoDien","ThoiLuong","GioBatDau","TenPhong","MaPhong","TenRap"};
        return this.getListOfArray(sql, cols, tenPhim, NgayChieu, GioBatDau);
    }
    
}
