/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imageprocessingproject;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
//import org.hsqldb.map.BitMap;

/**
 *
 * @author CHAMOD
 */
public class MainFrame extends javax.swing.JFrame {

    private JFileChooser filechooser;
    private ImageHandler imageHandler = null;
           
    public MainFrame() {
        initComponents();
        initialize();
      }

    private void initialize(){
//        file chooser
        filechooser = new JFileChooser("C:");
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("JPG", "JPG", "JPEG"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG", "PNG"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("GIF", "GIF"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("tt", "tt"));
        
//        image handler
        imageHandler = ImageHandler.getInstance(this);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_img = new javax.swing.JLabel();
        btnOpenFile = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        radioBtnMean = new javax.swing.JRadioButton();
        radioBtnMedian = new javax.swing.JRadioButton();
        radioBtnAlpha = new javax.swing.JRadioButton();
        btnApplyFilter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnFlip = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnScale = new javax.swing.JButton();
        spinnerScale = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnAutoContrast = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnNegative = new javax.swing.JButton();
        btnDither = new javax.swing.JButton();
        btnGrayScale = new javax.swing.JButton();
        histoPanel = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_img.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(lbl_img);

        btnOpenFile.setText("OPEN");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnUndo.setText("Undo");
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));

        buttonGroup1.add(radioBtnMean);
        radioBtnMean.setSelected(true);
        radioBtnMean.setText("Mean Filter");
        radioBtnMean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMeanActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnMedian);
        radioBtnMedian.setText("Median Filter");

        buttonGroup1.add(radioBtnAlpha);
        radioBtnAlpha.setText("Alpha Trimmed Filter");

        btnApplyFilter.setText("Apply");
        btnApplyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioBtnAlpha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioBtnMedian)
                    .addComponent(radioBtnMean)
                    .addComponent(btnApplyFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioBtnMean)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtnMedian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtnAlpha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApplyFilter))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Transformation"));

        jButton2.setText("Rotate Clockwise");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Rotate Anti-clockwise");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnFlip.setText("Flip");
        btnFlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFlip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFlip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Scaling"));

        btnScale.setText("Scale");
        btnScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScaleActionPerformed(evt);
            }
        });

        spinnerScale.setValue(200
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinnerScale, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScale, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinnerScale))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lighting"));

        jButton3.setText("Increase Brightness");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Decrease Brightness");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Increse Contrast");

        jButton6.setText("Decrease Contrast");

        btnAutoContrast.setText("Auto Contrast");
        btnAutoContrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoContrastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAutoContrast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAutoContrast))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Conversion"));

        btnNegative.setText("Negative");
        btnNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativeActionPerformed(evt);
            }
        });

        btnDither.setText("Dither");
        btnDither.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDitherActionPerformed(evt);
            }
        });

        btnGrayScale.setText("Grayscale");
        btnGrayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrayScaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDither, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrayScale, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNegative, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(btnDither, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGrayScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        histoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Image Histogram"));

        javax.swing.GroupLayout histoPanelLayout = new javax.swing.GroupLayout(histoPanel);
        histoPanel.setLayout(histoPanelLayout);
        histoPanelLayout.setHorizontalGroup(
            histoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        histoPanelLayout.setVerticalGroup(
            histoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(histoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnOpenFile, btnSave, btnUndo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndo)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(283, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(histoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOpenFile, btnSave, btnUndo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
             try {
                imageHandler.addImage(ImageIO.read(filechooser.getSelectedFile()));
                drawImage(imageHandler.getCurrentImage());
            } catch (NullPointerException ex) {
//                open_tt_files(filechooser.getSelectedFile().toPath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(filechooser, "Not an image!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScaleActionPerformed

        float scale=(Integer)spinnerScale.getValue()/100.0f;
        
        BufferedImage original_image = imageHandler.getCurrentImage();
        
        if(original_image != null){
            BufferedImage processed_image=ResampleImage.resampleImage_linear_interpolation(original_image, scale);
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }        
        else{
            JOptionPane.showMessageDialog(rootPane, "No image selected ...!");
        }
    }//GEN-LAST:event_btnScaleActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        drawImage(imageHandler.getPreviousImage());
    }//GEN-LAST:event_btnUndoActionPerformed

    private void btnFlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlipActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=ImageRotation.flipImage(imageHandler.getCurrentImage());
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_btnFlipActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=ImageRotation.rotateImage(imageHandler.getCurrentImage(),false);
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=ImageRotation.rotateImage(imageHandler.getCurrentImage(),true);
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativeActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=GrayLevelChanger.negativeImage(imageHandler.getCurrentImage());
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_btnNegativeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=GrayLevelChanger.brightenImage(imageHandler.getCurrentImage(),true);
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=GrayLevelChanger.brightenImage(imageHandler.getCurrentImage(),false);
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void radioBtnMeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMeanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMeanActionPerformed

    private void btnApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyFilterActionPerformed
        BufferedImage filteredImage=null;
        if(radioBtnMean.isSelected()){
            filteredImage = Filter.filterImage(imageHandler.getCurrentImage(), 0);
        }
        else if(radioBtnMedian.isSelected()){
            filteredImage = Filter.filterImage(imageHandler.getCurrentImage(), -1);
        }
        else{
            filteredImage = Filter.filterImage(imageHandler.getCurrentImage(), 1);
        }
        imageHandler.addImage(filteredImage);
        drawImage(imageHandler.getCurrentImage());
    }//GEN-LAST:event_btnApplyFilterActionPerformed

    private void btnDitherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDitherActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=Dither.ditherImage(imageHandler.getCurrentImage());
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_btnDitherActionPerformed

    private void btnAutoContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoContrastActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=
                    ImageHistogram.autoContrastImage(imageHandler.getCurrentImage());
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_btnAutoContrastActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        imageHandler.saveImage();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnGrayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrayScaleActionPerformed
         if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=GrayLevelChanger.grayscaleImage(imageHandler.getCurrentImage());
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_btnGrayScaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyFilter;
    private javax.swing.JButton btnAutoContrast;
    private javax.swing.JButton btnDither;
    private javax.swing.JButton btnFlip;
    private javax.swing.JButton btnGrayScale;
    private javax.swing.JButton btnNegative;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnScale;
    private javax.swing.JButton btnUndo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel histoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JRadioButton radioBtnAlpha;
    private javax.swing.JRadioButton radioBtnMean;
    private javax.swing.JRadioButton radioBtnMedian;
    private javax.swing.JSpinner spinnerScale;
    // End of variables declaration//GEN-END:variables

    private void drawImage(BufferedImage image) {
        if(image == null){
            JOptionPane.showMessageDialog(rootPane, "No image to show ... !");
        }
        else{
            lbl_img.setSize(image.getWidth(), image.getHeight());
            lbl_img.setIcon(new ImageIcon(image));   
            drawHistogram();
        }
    }
      
    private void drawHistogram(){
        JFreeChart chart = ImageHistogram.plotHistogram(imageHandler.getCurrentImage());
        final ChartPanel chartPanel = new ChartPanel(chart);
        histoPanel.setLayout(new BorderLayout());
        histoPanel.add(chartPanel,BorderLayout.CENTER);
        histoPanel.validate();
    }
    
}
