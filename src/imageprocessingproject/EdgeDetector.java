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
public class EdgeDetector {
    
    private static int threshold=0;
    
    public static BufferedImage getPrewittHImage(BufferedImage image,int threshold){
        EdgeDetector.threshold=threshold;
        int[][] mask = new int[][]{{-1,-1,-1},{0,0,0},{1,1,1}};
        return convolute(image, mask);
    }
    
    public static BufferedImage getPrewittVImage(BufferedImage image,int threshold){
        EdgeDetector.threshold=threshold;
        int[][] mask = new int[][]{{-1,0,1},{-1,0,1},{-1,0,1}};
        return convolute(image, mask);
    }
    
    public static BufferedImage getSobelHImage(BufferedImage image,int threshold){
        EdgeDetector.threshold=threshold;
        int[][] mask = new int[][]{{-1,-2,-1},{0,0,0},{1,2,1}};
        return convolute(image, mask);
    }
    
    public static BufferedImage getSobelVImage(BufferedImage image,int threshold){
        EdgeDetector.threshold=threshold;
        int[][] mask = new int[][]{{-1,0,1},{-2,0,2},{-1,0,1}};
        return convolute(image, mask);
    }
    
    public static BufferedImage getLaplacianImage(BufferedImage image,int threshold){
        EdgeDetector.threshold=threshold;
        int[][] mask = new int[][]{{0,1,0},{1,-4,1},{0,1,0}};
        return convolute(image, mask);
    }
    
    private static BufferedImage convolute(BufferedImage image,int[][] mask){
         BufferedImage tempImage=new BufferedImage(image.getWidth(),image.getHeight(),
                        BufferedImage.TYPE_INT_RGB);
        
        int height = image.getHeight();
        int width = image.getWidth();
        int m=mask.length;
        int val=0,gray_val;
        Color c;
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
//                tempImage.setRGB(i, j, image.getRGB(width-1-i, j));
                for(int x=0;x<m;x++){
                    for(int y=0;y<m;y++){
                        try{
                            c=new Color(image.getRGB(i-m/2+x, j-m/2+y));
                        }
                        catch(ArrayIndexOutOfBoundsException e){continue;}
                        gray_val=(c.getRed()+c.getGreen()+c.getBlue())/3;
                        val+=gray_val*mask[x][y];
                    }
                }
                if(val>threshold){
                    tempImage.setRGB(i, j, new Color(255,255,255).getRGB());
                }
                else{
                    tempImage.setRGB(i, j, new Color(0,0,0).getRGB());
                
                }
                val=0;
            }
        }
        
        return tempImage;
    }
    
}
