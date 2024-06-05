 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.untils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author tuanlva
 */
public class XImage {
    //Đưa vào biểu tượng của App
    public static Image getAppIcon(){
        URL url=XImage.class.getResource("/com/cinesys/Icon/fpt.png");
        return new ImageIcon(url).getImage();
    }
    
    //Lưu File hình ảnh khi người dùng chọn lên từ thư mục
    public static void save(File src){
        File dst= new File("/Users/tuanlva/HOC/FALL2021/Du_An_1/CineSys/PS18390_LuongVuAnhTuan_CineSys/src/com/cinesys/img", src.getName());
        //Kiểm tra thử đã có thư mục logos chưa
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        
        //Copy hình ảnh vào thư mục logos
        try {
            Path from=Paths.get(src.getAbsolutePath());
            Path to=Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    //Đọc hình ảnh từ đường link File và đưa lên Form
    public static ImageIcon read(String fileName){
        File path= new File("/Users/tuanlva/HOC/FALL2021/Du_An_1/CineSys/PS18390_LuongVuAnhTuan_CineSys/src/com/cinesys/img",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
