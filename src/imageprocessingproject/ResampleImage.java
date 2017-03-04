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
    public static BufferedImage resampleImageBy2n(BufferedImage image,int ratio){
        BufferedImage tempImage=null;
        
        if(ratio==0){
            return image;        
        }
        else if(ratio>0){
            for(int k=0;k<ratio;k++){ 
                tempImage=new BufferedImage(image.getWidth()*2,image.getHeight()*2,
                        BufferedImage.TYPE_INT_RGB);

                int imgWidth=tempImage.getWidth();
                int imgHeight=tempImage.getHeight();
                for(int i=0;i<imgWidth;i++){
                    for(int j=0;j<imgHeight;j++){
                        tempImage.setRGB(i, j, image.getRGB(i/2, j/2));
                    }
                }
                image=tempImage;
            }
        }
        else{
            for(int k=0;k<-ratio;k++){ 
                tempImage=new BufferedImage(image.getWidth()/2, image.getHeight()/2,
                        BufferedImage.TYPE_INT_RGB);

                int imgWidth=tempImage.getWidth();
                int imgHeight=tempImage.getHeight();
                for(int i=0;i<imgWidth;i++){
                    for(int j=0;j<imgHeight;j++){
                        tempImage.setRGB(i, j, image.getRGB(i*2, j*2));
                    }
                }
                image=tempImage;
            }
        }
        
        return tempImage;
    }
}
