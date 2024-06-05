/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.untils;

import com.cinesys.entity.Phim;
import com.cinesys.entity.User;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author tuanlva
 */
public class Auth {
    public static User user=null;
    public static Phim phimStatic=null;
    //Hàm đưa biến user về Null
    public static void clearUser(){
        Auth.user=null;
    }
    
    public static void clearFilm(){
        Auth.phimStatic=null;
    }
    
    /**
     * Sao chép file logo chuyên đề vào thư mục logo
     *
     * @param file là đối tượng file ảnh
     * @return chép được hay không
     */
    public static boolean saveLogo(File file) {
        // tạo file trong thư mục dự án là DA1_RAPPHIM
        File dir = new File("src/Img");
        // Tạo thư mục nếu chưa tồn tại
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
        // Copy vào thư mục src (đè nếu đã tồn tại)
            //lấy đường dẫn source
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * Đọc hình ảnh logo chuyên đề
     * @param src/Img là đường dẫn 
     * @param fileName là tên file logo
     *
     * @return ảnh đọc được
     */
    public static ImageIcon readLogo(String fileName) {
        File path = new File("src/Img", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

}
