
package com.cinesys.untils;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public  class catchException {
    public static boolean nullPoint(String text){
        if (text.equals("")) {
            return true;
        } else return false;
    }
    
    public static boolean dateFormat(String format, String text, String text2){
        SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        dfm.format(text);
        SimpleDateFormat dfm1 = new SimpleDateFormat("MM/dd/yyyy");
        dfm1.format(text2);
        if (dfm.equals(dfm1)) {
            return false;
        } else return true;
    }
    
    public static boolean lengthEx(int lengthEx, String args){
        if (args.length() > lengthEx) {
            return true;
        } else return false;
    }
}
