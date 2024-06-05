
package com.cinesys.untils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;


public class Ximage_TU {
//    public static Image getAppIcon(){
//       URL url =  Ximage_TU.class.getResource("/asset_IMG/bieutuong.png");
//       return new ImageIcon(url).getImage();
//    }
    public static void save(File src){
        File dst = new File("logos",src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static ImageIcon read(String filename){
        File path = new File(filename);
        return new ImageIcon(path.toString());
    }
}
