/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.DAO;

import com.cinesys.entity.Phim;
import com.cinesys.untils.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author tuanlva
 */
public class PhimDAO extends CineSysDAO<Phim, String> {

    String insert_sql = "insert into Phim(MaPhim,TenPhim,HinhAnh,NgayMua,DaoDien,NamSanXuat,QuocGia,ThoiLuong,NgayKhoiChieu,NgayKetThuc) values(?,?,?,?,?,?,?,?,?,?)";
    String update_sql = "update Phim set TenPhim=?,HinhAnh=?,NgayMua=?,DaoDien=?,NamSanXuat=?,QuocGia=?,ThoiLuong=?,NgayKhoiChieu=?,NgayKetThuc=? where MaPhim=?";
    String delete_sql = "delete from Phim where MaPhim=?";
    String selectAll_sql = "select * from Phim";
    String selectById_sql = "select * from Phim where MaPhim=?";

    @Override
    public void insert(Phim entity) {
        try {
            jdbcHelper.update(insert_sql, entity.getMaPhim(), entity.getTenPhim(), entity.getHinhAnh(), entity.getNgayMua(), entity.getDaoDien(), entity.getNamSanXuat(), entity.getQuocGia(), entity.getThoiLuong(), entity.getNgayKhoiChieu(), entity.getNgayKetThuc());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Phim entity) {
        try {
            jdbcHelper.update(update_sql, entity.getTenPhim(), entity.getHinhAnh(), entity.getNgayMua(), entity.getDaoDien(), entity.getNamSanXuat(), entity.getQuocGia(), entity.getThoiLuong(), entity.getNgayKhoiChieu(), entity.getNgayKetThuc(), entity.getMaPhim());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String key) {
        try {
            jdbcHelper.update(delete_sql, key);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Phim> selectAll() {
        return this.selectBySql(selectAll_sql);
    }

    @Override
    public Phim selectById(String key) {
        List<Phim> list=this.selectBySql(selectById_sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Phim> selectBySql(String sql, Object... args) {
        List<Phim> list= new ArrayList<>();
        try {
            ResultSet rs=jdbcHelper.query(sql, args);
            while(rs.next()){
                Phim phim=new Phim();
                phim.setMaPhim(rs.getString("MaPhim"));
                phim.setTenPhim(rs.getString("TenPhim"));
                phim.setHinhAnh(rs.getString("HinhAnh"));
                phim.setNgayMua(rs.getDate("NgayMua"));
                phim.setDaoDien(rs.getString("DaoDien"));
                phim.setNamSanXuat(rs.getString("NamSanXuat"));
                phim.setQuocGia(rs.getString("QuocGia"));
                phim.setThoiLuong(rs.getInt("ThoiLuong"));
                phim.setNgayKhoiChieu(rs.getDate("NgayKhoiChieu"));
                phim.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                list.add(phim);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Phim selectByPhim(String tenPhim){
        String sql="select * from Phim where TenPhim like ?";
        List<Phim> list=selectBySql(sql, tenPhim);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
}
