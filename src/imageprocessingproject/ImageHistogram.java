/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessingproject;

import java.awt.Color;
import java.awt.image.BufferedImage;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author chamod
 */
public class ImageHistogram {
    private static double [] histogram ;
    
    private static double [] contrast_lut;
    
    public static BufferedImage autoContrastImage(BufferedImage image){
        createContrastLUT(image);
        
        int height = image.getHeight();
        int width = image.getWidth(); 
        int r,g,b;
        Color c;
        
        BufferedImage tempImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        
        for(int i=0 ; i<width ; i++){
            for(int j=0 ; j<height ; j++){
                c=new Color(image.getRGB(i, j));
                r = (int)(c.getRed()*contrast_lut[c.getRed()]);
                g = (int)(c.getGreen()*contrast_lut[c.getGreen()]);
                b = (int)(c.getBlue()*contrast_lut[c.getBlue()]);
                tempImage.setRGB(i, j, new Color(r,g,b,c.getAlpha()).getRGB());
            }
        }
        
        return tempImage;
    }
    
    
    private static void createContrastLUT(BufferedImage image){
        createHistogram(image);
        contrast_lut=new double[256];
        
        double cumulative_prob=0;
        for(int i=0;i<256;i++){
            cumulative_prob+=histogram[i];
            contrast_lut[i]=cumulative_prob;
        }
    }
    
    public static void printHistogram(BufferedImage image){
        createHistogram(image);
        System.out.println("Histogram : ");
        for(int i=0;i<256;i++){
            System.out.println(histogram[i]);
        }
    }
    
    
    private static void createHistogram(BufferedImage image){
        histogram = new double[256];
        int height = image.getHeight();
        int width = image.getWidth(); 
        
        int sum=0;
         for(int i=0 ; i<width ; i++){
            for(int j=0 ; j<height ; j++){
                int grayVal = getGrayValue(image.getRGB(i, j));
                histogram[grayVal]++;
                sum++;
            }
        }
         
        for(int i=0;i<256;i++){
            histogram[i]=histogram[i]/sum;
        }
        
    }
    
     private static int getGrayValue(int rgb){
        Color c=new Color(rgb);
        return (c.getRed()+c.getGreen()+c.getBlue())/3;
    }
     
     
    public static JFreeChart plotHistogram(BufferedImage image){
        createHistogram(image);
        
        final XYSeries series = new XYSeries("Histogram Data");
        
        for(int i=0 ; i<histogram.length; i++){
            series.add(i,histogram[i]);
        }
//        
//        series.add(1.0, 500.2);
//        series.add(5.0, 694.1);
//        series.add(4.0, 100.0);
//        series.add(12.5, 734.4);
//        series.add(17.3, 453.2);
//        series.add(21.2, 500.2);
//        series.add(21.9, null);
//        series.add(25.6, 734.4);
//        series.add(30.0, 453.2);
//        
//        HistogramFrame frame =new HistogramFrame(series);
//        frame.show();
        
        
        
        final XYSeriesCollection data = new XYSeriesCollection(series);
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Image Histogram",
            "intensity", 
            "PDF", 
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );

        return chart;
    }  
}
