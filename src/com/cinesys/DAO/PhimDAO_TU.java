
package com.cinesys.DAO;


import com.cinesys.entity.Phim_TU;
import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PhimDAO_TU extends RapPhimDAO_TU<Phim_TU,Object> {

    @Override
    public void insert(Phim_TU entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Phim_TU entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Phim_TU> selectAll() {
        String all = "select * from Phim ";
        return selectBySQL(all);
    }

    @Override
    public Phim_TU selectByID(Object key) {
        String id = "select * from Phim where tenphim = ? ";
        List <Phim_TU> list = selectBySQL(id, key);
         if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Phim_TU> selectBySQL(String sql, Object... arg) {
        List <Phim_TU> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, arg);
            while(rs.next()){
                Phim_TU p = new Phim_TU();
                p.setMaPhim(rs.getString("MaPhim"));
                p.setTenPhim(rs.getString("TenPhim"));
                p.setTheLoai(rs.getString("TheLoai"));
                p.setHinhAnh(rs.getString("HinhAnh"));
                p.setNgayMua(rs.getDate("NgayMua"));
                p.setDaoDien(rs.getString("DaoDien"));
                p.setNamSx(rs.getDate("NamSanXuat"));
                p.setQuocGia(rs.getString("QuocGia"));
                p.setNgayKC(rs.getDate("NgayKhoiChieu"));
                p.setNgayKt(rs.getDate("NgayKetThuc"));
                list.add(p);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
