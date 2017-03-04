/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imageprocessingproject;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.hsqldb.map.BitMap;

/**
 *
 * @author CHAMOD
 */
public class MainFrame extends javax.swing.JFrame {

    JFileChooser filechooser;
    private BufferedImage original_image,processed_image;
    private int scaled_ratio=0;
    
    private BitMap bitMapOriginalImg=null;
           
    public MainFrame() {
        initComponents();
        
        filechooser = new JFileChooser("C:\\Users\\Chamod\\Desktop");
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("JPG", "JPG", "JPEG"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG", "PNG"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("GIF", "GIF"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("tt", "tt"));
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_original_img = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbl_processed_img = new javax.swing.JLabel();
        btnOpenFile = new javax.swing.JButton();
        btnScaleUp = new javax.swing.JButton();
        btnScaleDown = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_original_img.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(lbl_original_img);

        lbl_processed_img.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane2.setViewportView(lbl_processed_img);

        btnOpenFile.setText("OPEN");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnScaleUp.setText("Scale Up ( X 2 )");
        btnScaleUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScaleUpActionPerformed(evt);
            }
        });

        btnScaleDown.setText("Scale Down ( X 2 )");
        btnScaleDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScaleDownActionPerformed(evt);
            }
        });

        menuFile.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuFile.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        menuFile.add(jMenuItem2);

        jMenuBar1.add(menuFile);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnScaleUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnScaleDown, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOpenFile, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnScaleUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnScaleDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
             try {
                original_image = ImageIO.read(filechooser.getSelectedFile());
                drawOriginalImage();
            } catch (NullPointerException ex) {
//                open_tt_files(filechooser.getSelectedFile().toPath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(filechooser, "Not an image!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnScaleUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScaleUpActionPerformed
        scaled_ratio++;
        processed_image=ResampleImage.resampleImageBy2n(original_image,scaled_ratio);
        drawProcessedImage();
        
    }//GEN-LAST:event_btnScaleUpActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnScaleDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScaleDownActionPerformed
        scaled_ratio--;
        processed_image=ResampleImage.resampleImageBy2n(original_image,scaled_ratio);
        drawProcessedImage();
    }//GEN-LAST:event_btnScaleDownActionPerformed

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
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnScaleDown;
    private javax.swing.JButton btnScaleUp;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_original_img;
    private javax.swing.JLabel lbl_processed_img;
    private javax.swing.JMenu menuFile;
    // End of variables declaration//GEN-END:variables

    private void drawOriginalImage() {
        lbl_original_img.setSize(original_image.getWidth(), original_image.getHeight());
        lbl_original_img.setIcon(new ImageIcon(original_image));
    }
    
     private void drawProcessedImage() {
        lbl_processed_img.setSize(processed_image.getWidth(), processed_image.getHeight());
        lbl_processed_img.setIcon(new ImageIcon(processed_image));
    }
    
    
    
}
