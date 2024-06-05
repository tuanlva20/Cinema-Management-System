package com.cinesys.untils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCHelper_TU {

    public static String driver = "com.microsoft.sqlserver.SQLServerDriver";
    public static String connect = "jdbc:sqlserver://localhost:1433;databaseName=PS18390_LuongVuAnhTuan_CineSys";
    public static String user = "sa";
    public static String password = "Anhtuan123@";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static PreparedStatement getStatement(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(connect, user, password);
        PreparedStatement statement;
        if (sql.trim().startsWith("{")) {
            statement = conn.prepareCall(sql);
        } else {
            statement = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            statement.setObject(i + 1, args[i]);
        }
        return statement;
    }
   ////
    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement statement = JDBCHelper_TU.getStatement(sql, args);
        return statement.executeQuery();
    }
    ////
    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JDBCHelper_TU.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    ////
     public static int update(String sql, Object... args) {
        try {
            PreparedStatement statement = JDBCHelper_TU.getStatement(sql, args);
            try {
                return statement.executeUpdate();
            } finally {
                statement.getConnection().close();
            }
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
