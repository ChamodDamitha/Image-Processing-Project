/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessingproject;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chamod
 */
public class Filter {
    private static int n = 5;
    private static int p=0;
    
    private static int[][] mask = new int[n][n];
    
    private static void initMask(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mask[i][j] = 1;
            }
        }
    }
    
    public static BufferedImage filterImage(BufferedImage image, int p){
        int height = image.getHeight();
        int width = image.getWidth(); 
         
        BufferedImage tempImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Color c;
        int r,g,b;
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                r = calAverage(getOrderedNeighbours(image, i, j, 0), p);
                g = calAverage(getOrderedNeighbours(image, i, j, 1), p);
                b = calAverage(getOrderedNeighbours(image, i, j, 2), p);
                
                c = new Color(r,g,b,255);
                
                tempImage.setRGB(i, j, new Color(r,g,b,c.getAlpha()).getRGB());
            }
        }
        return tempImage;
        
    }
    
    
    private static int calAverage(ArrayList<Integer> a, int p){
        
        
//        System.out.println(a.toString());
        if(p<0){
            p=(n*n-1)/2;
        }
        int sum=0;
        for(int i=p; i<n*n-p; i++){
            try{
                sum+=a.get(i);
            }
            catch(IndexOutOfBoundsException e){
                return Math.round(sum/i);
            }
        }
//        if(a.get(a.size()-1)-a.get(0)>100){
//            System.out.println(a.toString()+" - "+Math.round(sum/(n*n-2*p)));
//        }
        
        return Math.round(sum/(n*n-2*p));
    }
    
    private static ArrayList<Integer> getOrderedNeighbours(BufferedImage image, int x , int y, int rgb_status){
        ArrayList<Integer> points = new ArrayList();
        Color c;
        for(int i=x-(n-1)/2; i<=x+(n-1)/2; i++){
            for(int j=y-(n-1)/2; j<=y+(n-1)/2; j++){
                try{
                    c=new Color(image.getRGB(i, j));
                    if(rgb_status == 0){
                        points.add(c.getRed());
                    }
                    else if(rgb_status == 1){
                        points.add(c.getGreen());
                    }
                    else{
                        points.add(c.getBlue());
                    }
                }
                catch(IndexOutOfBoundsException e){}
            }
        }
        
        sortList(points);
        return points;
    }
    
    private static void sortList(ArrayList<Integer> a){
        Collections.sort(a);
    }
}
