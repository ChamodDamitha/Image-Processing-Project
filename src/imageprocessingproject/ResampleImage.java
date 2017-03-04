/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imageprocessingproject;

import java.awt.image.BufferedImage;

/**
 *
 * @author CHAMOD
 */
public class ResampleImage {
    
//  Nearest neighbour method  
    
    public static BufferedImage resampleImage_nearest_neighbour(BufferedImage image,float scale){
        BufferedImage tempImage=new BufferedImage(Math.round(image.getWidth()*scale),Math.round(image.getHeight()*scale),
                        BufferedImage.TYPE_INT_RGB);
        
        int imgWidth=tempImage.getWidth();
        int imgHeight=tempImage.getHeight();
        for(int i=0;i<imgWidth;i++){
            for(int j=0;j<imgHeight;j++){
                
                tempImage.setRGB(i, j, image.getRGB((int)(i/scale), (int)(j/scale)));                
            }
        }
        return tempImage;
    }
    
    public static BufferedImage resampleImage_linear_interpolation(BufferedImage image,float scale){
        BufferedImage tempImage=new BufferedImage(Math.round(image.getWidth()*scale),Math.round(image.getHeight()*scale),
                        BufferedImage.TYPE_INT_RGB);
        
        int imgWidth=tempImage.getWidth();
        int imgHeight=tempImage.getHeight();
        
        
        
        return tempImage;
    }
}
