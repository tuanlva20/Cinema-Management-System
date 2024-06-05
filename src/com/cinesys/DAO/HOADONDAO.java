/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.Ve;
import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class HOADONDAO extends RapPhimDAO_TU<Ve, Object>{

    @Override
    public void insert(Ve entity) {
        String sql = "insert into ve " +
        "values(?,?,?,?,?,?,?,?,?,?)";
        JDBCHelper_TU.update(sql, entity.getGiave(),entity.getNgaymua(),entity.getMaghe()
            ,entity.getMakh(),entity.getManv(),entity.getMalc(),
            entity.getMaphim(),entity.getGiadichvu(),entity.getMaqr(),entity.getTiengiam());
    }

    @Override
    public void update(Ve entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ve> selectAll() {
        String sql = "select * from ve";
        return selectBySQL(sql);
    }

    @Override
    public Ve selectByID(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Ve> selectBySQL(String sql, Object... arg) {
        List <Ve> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, arg);
            while(rs.next()){
                Ve hd = new Ve();
                hd.setMave(rs.getInt(1));
                hd.setGiave(rs.getFloat(2));
                hd.setNgaymua(rs.getDate(3));
                hd.setMaghe(rs.getString(4));
                hd.setMakh(rs.getString(5));
                hd.setManv(rs.getString(6));
                hd.setMalc(rs.getInt(7));
                hd.setMaphim(rs.getString(8));
                hd.setGiadichvu(rs.getFloat(9));
                hd.setMaqr(rs.getString(10));
                hd.setTiengiam(rs.getFloat(11));
                list.add(hd);
            }
            rs.getStatement().getConnection();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
