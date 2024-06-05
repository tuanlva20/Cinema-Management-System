/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.untils;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author tuanlva
 */
public class MsgBox {
    JOptionPane jopane=new JOptionPane();
    public static boolean confirm(Component parent, String message){
        int i=JOptionPane.showConfirmDialog(parent, message, "Hệ thống quản lý rạp chiếu phim",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return i==JOptionPane.YES_OPTION;
    }
    
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Hệ thống quản lý rạp chiếu phim", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message, "Hệ thống quản lý rạp chiếu phim", JOptionPane.INFORMATION_MESSAGE);
    }
}
