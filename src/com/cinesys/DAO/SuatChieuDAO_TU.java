package com.cinesys.DAO;


import com.cinesys.entity.SuatChieu_TU;
import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SuatChieuDAO_TU extends RapPhimDAO_TU<SuatChieu_TU, Object> {

    @Override
    public void insert(SuatChieu_TU entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(SuatChieu_TU entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SuatChieu_TU> selectAll() {
        String all = "select * from SuatChieu";
        return this.selectBySQL(all);
    }

    @Override
    public SuatChieu_TU selectByID(Object key) {
        String id = "select * from SuatChieu where MaSC = ?";
        List<SuatChieu_TU> list = this.selectBySQL(id, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SuatChieu_TU> selectBySQL(String sql, Object... arg) {
        List<SuatChieu_TU> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, arg);
            while (rs.next()) {
                SuatChieu_TU sc = new SuatChieu_TU();
                sc.setMaSC(rs.getString("MaSC"));
                sc.setTenSC(rs.getString("TenSC"));
                sc.setGioBD(rs.getTime("GioBatDau"));
                sc.setGioKT(rs.getTime("GioKetThuc"));
                list.add(sc);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
