package com.cinesys.untils;

import static com.cinesys.untils.jdbcHelper.pass;
import static com.cinesys.untils.jdbcHelper.url;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCHelper11 {

    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String connect = "jdbc:sqlserver://localhost;database=PS18390_LuongVuAnhTuan_CineSys";
    public static String user = "sa";
    public static String password = "Anhtuan123@";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Xây dựng PreparedStatement
     *
     * @param sql là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một lời
     * gọi thủ tục lưu
     * @param args là danh sách các giá trị được cung cấp cho các tham số trong
     * câu lệnh sql
     * @return PreparedStatement tạo được
     * @throws java.sql.SQLException lỗi sai cú pháp
     */
    public static PreparedStatement prepareStatement(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(connect, user, password);
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = connection.prepareCall(sql);
        } else {
            pstmt = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }

    /**
     * Thực hiện câu lệnh SQL thao tác (INSERT, UPDATE, DELETE) hoặc thủ tục lưu
     * thao tác dữ liệu
     *
     * @param sql là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một lời
     * gọi thủ tục lưu
     * @param args là danh sách các giá trị được cung cấp cho các tham số trong
     * câu lệnh sql *
     */
    public static void update(String sql, Object... args) {
        try {
            PreparedStatement stmt = prepareStatement(sql, args);
            try {
                stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Thực hiện câu lệnh SQL truy vấn (SELECT) hoặc thủ tục lưu truy vấn dữ
     * liệu
     *
     * @param sql là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một lời
     * gọi thủ tục lưu
     * @param args là danh sách các giá trị được cung cấp cho các tham số trong
     * câu lệnh sql
     */
//    public static PreparedStatement getStatement(String sql, Object... args) throws SQLException {
//        Connection conn = DriverManager.getConnection(connect, user, password);
//        PreparedStatement statement;
//        if (sql.trim().startsWith("{")) {
//            statement = conn.prepareCall(sql);
//        } else {
//            statement = conn.prepareStatement(sql);
//        }
//        for (int i = 0; i < args.length; i++) {
//            statement.setObject(i + 1, args[i]);
//        }
//        return statement;
//    }

    
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);//Proc
        } else {
            stmt = conn.prepareStatement(sql);//SQL
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }
    
    
    public static ResultSet query(String sql, Object... args) throws SQLException {
            PreparedStatement stmt = JDBCHelper11.getStmt(sql, args);
            return stmt.executeQuery();
    }

    ////
//    public static ResultSet query(String sql, Object... args){
//        try {
//             PreparedStatement statement = JDBCHelper.getStatement(sql, args);
//            return statement.executeQuery();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//       
//    }
//    ////
    
    
//    public static Object value(String sql, Object... args) {
//        try {
//            ResultSet rs = JDBCHelper.query(sql, args);
//            if (rs.next()) {
//                return rs.getObject(0);
//            }
//            rs.getStatement().getConnection().close();
//            return null;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//    ////
    
    
//     public static int update(String sql, Object... args) {
//        try {
//            PreparedStatement statement = JDBCHelper.getStatement(sql, args);
//            try {
//                return statement.executeUpdate();
//            } finally {
//                statement.getConnection().close();
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//            throw new RuntimeException(e);
//        }
//    }
//     
//   public static void executeUpdate(Object ... arg) {
//        
//       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//   }
//
//    public static void executeUpdate(String sql, String MaNV) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static ResultSet executeQuery(String sql, Object[] args) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static void executeUpdate(String sql, String maNV_TaiKhoan, String matKhau, boolean vaiTro, int cmnd, String diaChi, int soDT, Date ngaySinh, String anhNV) {
//       
//    }
//    
}
