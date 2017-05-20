/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessingproject;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author chamod
 */
public class GrayLevelChanger {
    public static BufferedImage negativeImage(BufferedImage image){
        int height = image.getHeight();
        int width = image.getWidth(); 
         
        BufferedImage tempImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Color c;
        int r,g,b;
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                c = new Color(image.getRGB(i, j));
                r = 255 - c.getRed();
                g = 255 - c.getGreen();
                b = 255 - c.getBlue();
                tempImage.setRGB(i, j, new Color(r,g,b,c.getAlpha()).getRGB());
            }
        }
        return tempImage;
    }
    
    public static BufferedImage brightenImage(BufferedImage image, boolean brighten){
        int height = image.getHeight();
        int width = image.getWidth(); 
         
        BufferedImage tempImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Color c;
        int r,g,b;
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                c = new Color(image.getRGB(i, j));
                if(brighten){
                    r = 10 + c.getRed();
                    g = 10 + c.getGreen();
                    b = 10 + c.getBlue();

                    if(r>255)r=255;
                    if(g>255)g=255;
                    if(b>255)b=255;
                }
                else{
                    r = -10 + c.getRed();
                    g = -10 + c.getGreen();
                    b = -10 + c.getBlue();

                    if(r<0)r=0;
                    if(g<0)g=0;
                    if(b<0)b=0;
                }
                tempImage.setRGB(i, j, new Color(r,g,b,c.getAlpha()).getRGB());
            }
        }
        return tempImage;
    }
}
