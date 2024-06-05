
package com.cinesys.DAO;


import com.cinesys.entity.KhachHang_TU;
import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class KhachHangDAO_TU extends RapPhimDAO_TU<KhachHang_TU, Object>{

    @Override
    public void insert(KhachHang_TU entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(KhachHang_TU entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KhachHang_TU> selectAll() {
        String all = " select * from KhachHang";
        return selectBySQL(all);
    }

    @Override
    public KhachHang_TU selectByID(Object key) {
        String id = "select * from KhachHang where SDT = ? ";
        List <KhachHang_TU> list = selectBySQL(id, key);
         if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang_TU> selectBySQL(String sql, Object... arg) {
        List <KhachHang_TU> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, arg);
            while(rs.next()){
                KhachHang_TU kh = new KhachHang_TU();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setCMND(rs.getInt("CMND"));
                kh.setDiachi(rs.getString("DiaChi"));
                kh.setSDT(rs.getString("SDT"));
                kh.setDiemTichLuy(rs.getFloat("DiemTichLuy"));
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
}
