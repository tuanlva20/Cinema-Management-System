package com.cinesys.DAO;

import com.cinesys.entity.NhanVien;
import com.cinesys.entity.NhanVienEntity;
import com.cinesys.untils.jdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {

    public void insert(NhanVienEntity model) {
        String sql = "INSERT INTO NhanVien (MaNV_TaiKhoan, MatKhau, TenNV, VaiTro, CMND, DiaChi, SDT, NgaySinh, Anh) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcHelper.value(sql,
                model.getMaNV_TaiKhoan(),
                model.getMatKhau(),
                model.getTenNV(),
                model.getVaiTro(),
                model.getCMND(),
                model.getDiaChi(),
                model.getSoDT(),
                model.getNgaySinh(),
                model.getAnhNV());
    }

    public void update(NhanVienEntity model) {
        String sql = "UPDATE NhanVien SET MatKhau=?, TenNV=?, VaiTro=?, CMND=?, DiaChi=?, SDT=?, NgaySinh=?, Anh=?"
                + "WHERE MaNV_TaiKhoan=?";
        jdbcHelper.value(sql,
                model.getMatKhau(),
                model.getTenNV(),
                model.getVaiTro(),
                model.getCMND(),
                model.getDiaChi(),
                model.getSoDT(),
                model.getNgaySinh(),
                model.getAnhNV(),
                model.getMaNV_TaiKhoan());

    }

    public void updateByProc(NhanVienEntity model) throws SQLException {
        String sql = "EXEC dbo.spNhanVien @MatKhau = ?, @TenNV = ?, @VaiTro = ?, @CMND = ?, @DiaChi = ?"
                + ", @SDT = ?, @NgaySinh = ?, @Anh = ?, @MaNV_TaiKhoan = ?";
        jdbcHelper.update(sql,
                model.getMatKhau(),
                model.getTenNV(),
                model.getVaiTro(),
                model.getCMND(),
                model.getDiaChi(),
                model.getSoDT(),
                model.getNgaySinh(),
                model.getAnhNV(),
                model.getMaNV_TaiKhoan());
    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNV_TaiKhoan=?";
        jdbcHelper.value(sql, MaNV);
    }

    public List<NhanVienEntity> select() {
        String sql = "SELECT * FROM NhanVien";
        return select(sql);
    }

    public NhanVienEntity findById(String manv) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV_TaiKhoan=?";
        List<NhanVienEntity> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<NhanVienEntity> findByTen(String tennv) {
        String sql = "SELECT * FROM NhanVien WHERE TenNV like N'%" + tennv + "%'";
        return select(sql);
//        List<NhanVienEntity> list = select(sql);
//        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NhanVienEntity> select(String sql, Object... args) {
        List<NhanVienEntity> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = (ResultSet) jdbcHelper.value(sql, args);
                while (rs.next()) {
                    NhanVienEntity model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private NhanVienEntity readFromResultSet(ResultSet rs) throws SQLException {
        NhanVienEntity model = new NhanVienEntity();
        model.setMaNV_TaiKhoan(rs.getString("MaNV_TaiKhoan"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setTenNV(rs.getString("TenNV"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        model.setCMND(rs.getString("CMND"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setSoDT(rs.getString("SDT"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setAnhNV(rs.getString("Anh"));
        return model;
    }

    public NhanVienEntity selectUserPass(String user) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV_TaiKhoan like ?";
        List<NhanVienEntity> list = this.select(sql, user);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
}
