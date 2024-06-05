
package com.cinesys.DAO;

import com.cinesys.entity.PhimEntity;
import com.cinesys.untils.jdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


 public class PhimDAO1{

    public void insert(PhimEntity model) throws SQLException{
        
        String sql="INSERT INTO Phim (MaPhim, TenPhim, TheLoai, HinhAnh, NgayMua, DaoDien, NamSanXuat, QuocGia, NgayKhoiChieu, NgayKetThuc) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";  
        jdbcHelper.update(sql, 
            model.getMaPhim(), 
            model.getTenPhim(), 
            model.getTheLoai(), 
            model.getHinhAnh(),
            model.getNgayMua(),
            model.getDaoDien(),
            model.getNamSX(),
            model.getQuocGia(),
            model.getNgayKC(),
            model.getNgayKT());
    }
    
    public void update(PhimEntity model) throws SQLException{
        String sql="UPDATE Phim SET TenPhim=?, TheLoai=?, HinhAnh=?, NgayMua=?, DaoDien=?, NamSanXuat=?, QuocGia=?, NgayKhoiChieu=?, NgayKetThuc=? "
                + "WHERE MaPhim=?";
        jdbcHelper.update(sql, 
            model.getTenPhim(), 
            model.getTheLoai(), 
            model.getHinhAnh(),
            model.getNgayMua(),
            model.getDaoDien(),
            model.getNamSX(),
            model.getQuocGia(),
            model.getNgayKC(),
            model.getNgayKT(),
            model.getMaPhim());
        
    }
    
    public void delete(String MaPhim) throws SQLException{
        String sql="DELETE FROM Phim WHERE MaPhim=?";
        jdbcHelper.update(sql, MaPhim);
    }
 
    public List<PhimEntity> select(){
        String sql="SELECT * FROM Phim";
        return select(sql);
    }
 
    public PhimEntity findById(String maphim){
        String sql="SELECT * FROM Phim WHERE MaPhim=?";
        List<PhimEntity> list = select(sql, maphim);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public PhimEntity findByTenPhim (String tenphim){
        String sql="SELECT * FROM Phim WHERE TenPhim=?";
        List<PhimEntity> list = select(sql, tenphim);
        return list.size() > 0 ? list.get(0) : null;
    }
     public List<PhimEntity> findByTen(String tenphim){
        String sql="SELECT * FROM Phim WHERE TenPhim like N'%" + tenphim + "%'";
        return select(sql);
    }
    
    
    private List<PhimEntity> select(String sql, Object...args){
        List<PhimEntity> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcHelper.query(sql, args);
                while(rs.next()){
                    PhimEntity model = readFromResultSet(rs);
                    list.add(model);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
 
    private PhimEntity readFromResultSet(ResultSet rs) throws SQLException{
        PhimEntity model=new PhimEntity();
        model.setMaPhim(rs.getString("MaPhim"));
        model.setTenPhim(rs.getString("TenPhim"));
        model.setTheLoai(rs.getString("TheLoai"));
        model.setHinhAnh(rs.getString("HinhAnh"));
        model.setNgayMua(rs.getDate("NgayMua"));
        model.setDaoDien(rs.getString("DaoDien"));
        model.setNamSX(rs.getDate("NamSanXuat"));
        model.setQuocGia(rs.getString("QuocGia"));
        model.setNgayKC(rs.getDate("NgayKhoiChieu"));
        model.setNgayKT(rs.getDate("NgayKetThuc"));
        return model;
    }
    
}
