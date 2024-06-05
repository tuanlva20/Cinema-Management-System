
package com.cinesys.DAO;

import com.cinesys.entity.PhongChieu_TU;
import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PhongChieuDAO_TU extends  RapPhimDAO_TU<PhongChieu_TU, Object>{

    @Override
    public void insert(PhongChieu_TU entity) {
        
    }

    @Override
    public void update(PhongChieu_TU entity) {
       
    }

    @Override
    public void delete(Object key) {
        
    }

    @Override
    public List<PhongChieu_TU> selectAll() {
        String all = "select * from PhongChieu";
        return this.selectBySQL(all);
    }

    @Override
    public PhongChieu_TU selectByID(Object key) {
        return null;
    }

    @Override
    protected List<PhongChieu_TU> selectBySQL(String sql, Object... arg) {
        List <PhongChieu_TU> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, arg);
            while(rs.next()){
                PhongChieu_TU pc = new PhongChieu_TU();
                pc.setMaPhong(rs.getString("MaPhong"));
                pc.setTenPhong(rs.getString("TenPhong"));
                list.add(pc);
            }
            rs.getStatement().getConnection().close();
            return list;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
