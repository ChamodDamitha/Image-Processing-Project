/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessingproject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.naming.Context;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author chamod
 */
public class ImageHandler {
    private static ImageHandler handler = null;
    private JFrame context;
    
    public static ImageHandler getInstance(JFrame context){
        if(handler == null){
            handler = new ImageHandler(context);
        }
        return handler;
    }
    
    private ImageHandler(JFrame context){
        this.context=context;
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
    
    
    public void saveImage(){
        if(getCurrentImage()!=null){
            JFileChooser filechooser = new JFileChooser("C:");
            if (filechooser.showSaveDialog(context) == JFileChooser.APPROVE_OPTION) {
                String newImageExtention = filechooser.getFileFilter().getDescription();

                File newImagePath = new File(filechooser.getSelectedFile().toString() + ".png");
                try {
                    ImageIO.write(getCurrentImage(), "png", newImagePath);
                    JOptionPane.showMessageDialog(filechooser, "File is saved successfully...!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(filechooser, "File is not saved...!");
                }
            }
        }
    }
    
}
