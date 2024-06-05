package com.cinesys.DAO;


import com.cinesys.entity.LichChieu_TU;
import com.cinesys.entity.View_TU;
import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LichChieuDAO_TU extends RapPhimDAO_TU<LichChieu_TU, Object> {

    @Override
    public void insert(LichChieu_TU entity) {
        String them = "insert into LichChieu values(?,?,?,?)";
        JDBCHelper_TU.update(them, entity.getNgayChieu(), entity.getMaPhim(), entity.getMaPC(), entity.getMaSC());
    }

    @Override
    public void update(LichChieu_TU entity) {
        String sua = "update LichChieu "
                + "set NgayChieu = ? ,MaPhim = ? , MaPhong = ? , MaSC = ? where MaLichChieu = ? ";
        JDBCHelper_TU.update(sua, entity.getNgayChieu(), entity.getMaPhim(), entity.getMaPC(), entity.getMaSC(),
                 entity.getMaLC());
    }

    @Override
    public void delete(Object key) {
        String xoa = "delete LichChieu where MaLichChieu = ? ";
        JDBCHelper_TU.update(xoa, key);
    }

    @Override
    public List<LichChieu_TU> selectAll() {
        String all = "select * from LichChieu";
        return selectBySQL(all);
    }

    @Override
    public LichChieu_TU selectByID(Object key) {
        String selectByID = "select * from where = ? ";
        List<LichChieu_TU> list = this.selectBySQL(selectByID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LichChieu_TU> selectBySQL(String sql, Object... arg) {
        List<LichChieu_TU> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, arg);
            while (rs.next()) {
                LichChieu_TU lc = new LichChieu_TU();
                lc.setMaLC(rs.getInt("MaLichChieu"));
                lc.setNgayChieu(rs.getDate("NgayChieu"));
                lc.setMaPhim(rs.getString("MaPhim"));
                lc.setMaPC(rs.getString("MaPhong"));
                lc.setMaSC(rs.getString("MaSC"));
                list.add(lc);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List <View_TU> tenphim(String sql,Object malc) {
        List <View_TU> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, malc);
            while (rs.next()) {
                String tenphim = rs.getString("TenPhim");
                Time giobd = rs.getTime("GioBatDau");
                Date ngaykc = rs.getDate("NgayChieu");
                String hinh = rs.getString("HinhAnh");
                View_TU v = new View_TU(tenphim, giobd, ngaykc, hinh);
                list.add(v);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public View_TU Poster(Object key){
        String view = "select phim.TenPhim,suatchieu.GioBatDau, LichChieu.NgayChieu,Phim.HinhAnh "
                + " from lichchieu,Phim,PhongChieu,SuatChieu "
                + " where LichChieu.MaPhim = Phim.MaPhim and LichChieu.MaPhong = PhongChieu.MaPhong"
                + " and SuatChieu.MaSC = LichChieu.MaSC and LichChieu.MaLichChieu = ? " ;
        List<View_TU> list = this.tenphim(view, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
