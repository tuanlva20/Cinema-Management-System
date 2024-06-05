
package com.cinesys.DAO;

import com.cinesys.untils.JDBCHelper_TU;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO_TU {
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBCHelper_TU.query(sql, args);
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
    public List <Object[]> getTongdoanhthu(){
        String sql = "{CALL dtvetutruocdennay}";
        String []cols = {"Tổng vé đã bán","Tổng tiền vé","Tổng doanh thu"};
        return this.getListOfArray(sql, cols);
    }
    public List <Object []> getDoanhThuPhim(){
        String sql = "{CALL dtphim}";
        String []cols = {"tenphim","Số buổi chiếu","Tổng số vé bán ra","Tổng tiền của phim"};
        return getListOfArray(sql, cols);
    }
    public List<Object[]> getDoanhThuPhong(int thang) {
        String sql = "{CALL dtvephong (?) }";
        String[] cols = {"MaPhong", "Số vé đã bán", "Tổng tiền vé","Tổng doanh thu"};
        return this.getListOfArray(sql, cols, thang);
    }
    public List<Object[]> getDoanhThuNgay(Integer ngay, Integer thang, Integer nam) {
        String sql = "{CALL dtvebanngay(?,?,?)}";
        String[] cols = {"Số vé đã bán", "Tổng tiền vé","Tổng doanh thu"};
        return this.getListOfArray(sql, cols, ngay,thang,nam);
    }
    public List<Object[]> getDoanhThuThang(Integer nam) {
        String sql = "{CALL dtvebanthang(?)}";
        String[] cols = {"Tháng","Số vé đã bán", "Tổng tiền vé","Tổng doanh thu"};
        return this.getListOfArray(sql, cols,nam);
    }
    public List<Object[]> getDoanhThuNam() {
        String sql = "{CALL dtvebannam}";
        String[] cols = {"Năm","Số vé đã bán", "Tổng tiền vé","Tổng doanh thu"};
        return this.getListOfArray(sql, cols);
    }
    public List <Object[]> getTopKH(){
        String sql = "{CALL topkhachhang}";
        String []cols = {"MaKH","TenKhachHang","SDT","DiemTichLuy"};
        return this.getListOfArray(sql, cols);
    }
    public List <Object[]> getthongkenam(){
        String sql = "{CALL dttongvebannam}";
        String []cols = {"Số vé đã bán", "Tổng tiền vé","Tổng doanh thu"};
        return this.getListOfArray(sql, cols);
    }
}
