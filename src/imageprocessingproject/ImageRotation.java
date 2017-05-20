/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessingproject;

import java.awt.image.BufferedImage;

/**
 *
 * @author chamod
 */
public class ImageRotation {
    
    public static BufferedImage flipImage(BufferedImage image){
        BufferedImage tempImage=new BufferedImage(image.getWidth(),image.getHeight(),
                        BufferedImage.TYPE_INT_RGB);
        
        int height = image.getHeight();
        int width = image.getWidth();
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                tempImage.setRGB(i, j, image.getRGB(width-1-i, j));
            }
        }
        return tempImage;
    }
   
     public static BufferedImage rotateImage(BufferedImage image, boolean clockwise){
        
        int height = image.getWidth();
        int width = image.getHeight(); 
         
        BufferedImage tempImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                if(clockwise){
                    tempImage.setRGB(i, j, image.getRGB(j, width-1-i));
                }
                else{
                    tempImage.setRGB(i, j, image.getRGB(height-1-j, i));
                }
            }
        }
        return tempImage;
    }
   
}
