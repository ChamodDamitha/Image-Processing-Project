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
public class ContrastStrech {
    
    private static double alpha=0.2,beta=1.15,gamma=0.2;
    
    public static BufferedImage contrastStreach(BufferedImage image){
        
        int height = image.getHeight();
        int width = image.getWidth(); 
         
        BufferedImage tempImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Color c;
        int r,g,b;
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                c = new Color(image.getRGB(i, j));
                
                r=getGrayVal(c.getRed());
                g=getGrayVal(c.getGreen());
                b=getGrayVal(c.getBlue());
                
                tempImage.setRGB(i, j, new Color(r,g,b,c.getAlpha()).getRGB());
            }
        }
        return tempImage;
    }
    
    
    private static int getGrayVal(int val){
        if(val>=0 && val<50){
            return (int)(val * alpha);
        }
        else if(val>=50 && val<200){
            return (int)(50*alpha)+(int)((val-50) * beta);
        }
        else{
            return (int)(50*alpha)+(int)(200 * beta)+(int)((val-200) * gamma);
        }
    }
    
}
