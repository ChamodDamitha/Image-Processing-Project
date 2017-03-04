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
        
        int ori_imgWidth=image.getWidth();
        int ori_imgHeight=image.getHeight();
        
        Color A=new Color(0),B=new Color(0),C=new Color(0),D=new Color(0);
        int r,g,b,x,y;
        float dx,dy;
        
         for(int i=0;i<imgWidth;i++){
            for(int j=0;j<imgHeight;j++){
                x=(int)Math.floor(i/scale);
                y=(int)Math.floor(j/scale);
                dx=(i/scale)-x;
                dy=(j/scale)-y;
                
//                F = (1-dx)(1-dy)A + dx(1-dy)B + dxdyC + (1-dx)dyD
                A=new Color(image.getRGB(x, y));
                if(x+1<ori_imgWidth)
                    B=new Color(image.getRGB(x+1, y));
                if(x+1<ori_imgWidth && y+1<ori_imgHeight)
                    C=new Color(image.getRGB(x+1, y+1));
                if(y+1<ori_imgHeight)
                    D=new Color(image.getRGB(x, y+1));
                
                r=(int)((1-dx)*(1-dy)*A.getRed() + dx*(1-dy)*B.getRed() + dx*dy*C.getRed() + (1-dx)*dy*D.getRed());
                g=(int)((1-dx)*(1-dy)*A.getGreen()+ dx*(1-dy)*B.getGreen()+ dx*dy*C.getGreen()+ (1-dx)*dy*D.getGreen());
                b=(int)((1-dx)*(1-dy)*A.getBlue()+ dx*(1-dy)*B.getBlue()+ dx*dy*C.getBlue()+ (1-dx)*dy*D.getBlue());
                
                tempImage.setRGB(i, j, new Color(r,g,b,255).getRGB());
            
                
            }
//            break;
        }        
        
        return tempImage;
    }
}
