/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessingproject;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author chamod
 */
public class ImageHandler {
    private static ImageHandler handler = null;
    
    public static ImageHandler getInstance(){
        if(handler == null){
            handler = new ImageHandler();
        }
        return handler;
    }
    
    private ImageHandler(){
        
    }
    
    ArrayList<BufferedImage> image_queue = new ArrayList<>();
    
    public void addImage(BufferedImage bufferedImage){
        image_queue.add(bufferedImage);
    }
    
    public BufferedImage getCurrentImage(){
        if(image_queue.size() == 0){
            return null;
        }
        return image_queue.get(image_queue.size()-1);
    }
    
    public BufferedImage getPreviousImage(){
        if(image_queue.size() == 0){
            return null;
        }
        else if(image_queue.size() == 1){
            return image_queue.get(0);
        }
        else{
            image_queue.remove(image_queue.size()-1);
            return image_queue.get(image_queue.size()-1);
        }
    }
    
    
}
