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
public class Dither {
    
    public static BufferedImage ditherImage(BufferedImage image){
        int height = image.getHeight() * 2;
        int width = image.getWidth() * 2; 
         
        BufferedImage tempImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        
        for(int i=0 ; i<width ; i+=2){
            for(int j=0 ; j<height ; j+=2){
                fillPattern(tempImage, getGrayValue(image.getRGB(i/2, j/2)), i, j);
            }
        }
        return tempImage;
    }
    
    private static void fillPattern(BufferedImage tempImage,int grayVal,int x,int y){
        if(0<=grayVal && grayVal<51){
            tempImage.setRGB(x, y, 0);
            tempImage.setRGB(x, y+1, 0);
            tempImage.setRGB(x+1, y, 0);
            tempImage.setRGB(x+1, y+1, 0);
        }
        else if(51<=grayVal && grayVal<102){
            tempImage.setRGB(x, y, -1);
            tempImage.setRGB(x, y+1, 0);
            tempImage.setRGB(x+1, y, 0);
            tempImage.setRGB(x+1, y+1, 0);
        }
        else if(102<=grayVal && grayVal<153){
            tempImage.setRGB(x, y, -1);
            tempImage.setRGB(x, y+1, -1);
            tempImage.setRGB(x+1, y, 0);
            tempImage.setRGB(x+1, y+1, 0);
        }
        else if(153<=grayVal && grayVal<204){
            tempImage.setRGB(x, y, -1);
            tempImage.setRGB(x, y+1, -1);
            tempImage.setRGB(x+1, y, -1);
            tempImage.setRGB(x+1, y+1, 0);
        }
        else if(204<=grayVal && grayVal<256){
            tempImage.setRGB(x, y, -1);
            tempImage.setRGB(x, y+1, -1);
            tempImage.setRGB(x+1, y, -1);
            tempImage.setRGB(x+1, y+1, -1);
        }
    }
    
    private static int getGrayValue(int rgb){
        Color c=new Color(rgb);
        return (c.getRed()+c.getGreen()+c.getBlue())/3;
    }
    
}
