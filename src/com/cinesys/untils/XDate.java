/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.untils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tuanlva
 */
public class XDate {
    static SimpleDateFormat formater=new SimpleDateFormat();
    
    public static String now(){
        Date now=new Date();
        formater.applyPattern("dd-MM-yyyy");
        return formater.format(now);
    }
    // Hàm chuyển từ String sang Date
    public static Date toDate(String date, String pattern){
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    //Hàm chuyển từ Date sang String
    public static String toString(Date date, String pattern){
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    
    //Trả về ngày + Ngày
    public static Date addDate(Date date, int dates){
        date.setTime(date.getTime()+dates*24*60*60*1000);
        return date;
    }
}
