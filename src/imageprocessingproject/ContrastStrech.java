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
    
    private final static double alpha=0.2,beta=1.15,gamma=0.2,CONTRAST_UP=1.2,CONTRAST_DOWN=0.8;
    
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
    
    
    
    public static BufferedImage contrastChange(BufferedImage image,boolean up){
        int r_mean=0,g_mean=0,b_mean=0;
        
        int height = image.getHeight();
        int width = image.getWidth(); 
         
        BufferedImage tempImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Color c;
        int r,g,b;
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                c = new Color(image.getRGB(i, j));
                
                r_mean+=c.getRed();
                g_mean+=c.getGreen();
                b_mean+=c.getBlue();
//                
//                tempImage.setRGB(i, j, new Color(r,g,b,c.getAlpha()).getRGB());
            }
        }
        r_mean=r_mean/(width*height);
        g_mean=g_mean/(width*height);
        b_mean=b_mean/(width*height);
        
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                c = new Color(image.getRGB(i, j));
                if(up){
                    r=(int)((c.getRed()-r_mean)*CONTRAST_UP);
                    g=(int)((c.getGreen()-g_mean)*CONTRAST_UP);
                    b=(int)((c.getBlue()-b_mean)*CONTRAST_UP);
                }
                else{
                    r=(int)((c.getRed()-r_mean)*CONTRAST_DOWN);
                    g=(int)((c.getGreen()-g_mean)*CONTRAST_DOWN);
                    b=(int)((c.getBlue()-b_mean)*CONTRAST_DOWN);
                    
                }
                r+=r_mean;
                g+=g_mean;
                b+=b_mean;
                
                    if(r>255){
                        r=255;
                    }
                    if(g>255){
                        g=255;
                    }
                    if(b>255){
                        b=255;
                    }
                    if(r<0){
                        r=0;
                    }
                    if(g<0){
                        g=0;
                    }
                    if(b<0){
                        b=0;
                    }
                
                try{
                tempImage.setRGB(i, j, new Color(r,g,b,c.getAlpha()).getRGB());
                }
                catch(Exception e){
                    System.out.println("rgb "+r+" "+g+" "+b);
                }
            }
        }
        
        return tempImage;
    }
    
}
