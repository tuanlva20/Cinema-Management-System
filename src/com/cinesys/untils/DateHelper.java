//Chứa các phương thức chuyển đổi thời gian và chuỗi giúp lập trình sau này khi xử lý thời gian dễ dàng 
//hơn.

package com.cinesys.untils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("MM/dd/yyyy");
    static final SimpleDateFormat DATE_FORMATER1 = new SimpleDateFormat("yyyy/MM/dd");
    /**
    * Chuyển đổi String sang Date
    * @param date là String cần chuyển
    * @param pattern là định dạng thời gian
    * @return Date kết quả
    */
//    public static Date toDate(String date, String...pattern) {
//        try {
//            if(pattern.length > 0){
//                DATE_FORMATER1.applyPattern(pattern[0]);
//            }
//            if(date == null){
//                return DateHelper.now();
//            }
//        return DATE_FORMATER1.parse(date);
//        }catch (ParseException ex) {
//            throw new RuntimeException(ex);
//        }
//    }
    public static Date toDate(String date) throws ParseException {
        return DATE_FORMATER.parse(date);
    }
    /**
    * Chuyển đổi từ Date sang String
    * @param date là Date cần chuyển đổi
    * @param pattern là định dạng thời gian
    * @return String kết quả
    */
//    public static String toString(Date date, String...pattern) {
//        if(pattern.length > 0){
//            DATE_FORMATER.applyPattern(pattern[0]);
//        }
//        if(date == null){
//            date = DateHelper.now();
//        }
//        return DATE_FORMATER.format(date);
//    }
     public static String toString(Date date) {
       return DATE_FORMATER.format(date);
    }
    /**
    * Lấy thời gian hiện tại
    * @return Date kết quả
    */
    public static Date now() {
        return new Date();
    }
    /**
    * Bổ sung số ngày vào thời gian
    * @param date thời gian hiện có
    * @param days số ngày cần bổ sung váo date
    * @return Date kết quả
    */
    public static Date addDays(Date date, int days) {
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
    /**
    * Bổ sung số ngày vào thời gian hiện hành
    * @param days số ngày cần bổ sung vào thời gian hiện tại
    * @return Date kết quả
    */
    public static Date add(int days) {
        Date now = DateHelper.now();
        now.setTime(now.getTime() + days*24*60*60*1000);
        return now;
    }
}
