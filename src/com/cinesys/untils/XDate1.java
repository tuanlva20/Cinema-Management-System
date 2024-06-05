
package com.cinesys.untils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class XDate1 {
    static SimpleDateFormat formate = new SimpleDateFormat();
    public static Date toDate(String date, String pattern){
        try {
            formate.applyPattern(pattern);
            return formate.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String toString(Date date , String pattern){
        formate.applyPattern(pattern);
        return formate.format(date);
    }
    public static Date addDays(Date date,long days){
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
    public static Date now(){
        long millis=System.currentTimeMillis(); 
        Date nn = new java.sql.Date(millis);
        return nn;
    }
}
