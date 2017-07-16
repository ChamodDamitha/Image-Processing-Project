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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnAutoContrast = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnEdgeFiltet = new javax.swing.JButton();
        radioBtnSobelH = new javax.swing.JRadioButton();
        radioBtnPrewittV = new javax.swing.JRadioButton();
        radioBtnLaplacian = new javax.swing.JRadioButton();
        radioBtnPrewittH = new javax.swing.JRadioButton();
        sliderThreshold = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        radioBtnSobelV = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        radioBtnNegative = new javax.swing.JRadioButton();
        radioBtnGrsyscale = new javax.swing.JRadioButton();
        radioBtnDither = new javax.swing.JRadioButton();
        btnApplyConversion = new javax.swing.JButton();
        histoPanel = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Editer");
        setResizable(false);

        lbl_img.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(lbl_img);

        btnOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_folder-35945_640.png"))); // NOI18N
        btnOpenFile.setToolTipText("Open Image");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_icon-ios7-undo-512.png"))); // NOI18N
        btnUndo.setToolTipText("Undo");
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        buttonGroup1.add(radioBtnMean);
        radioBtnMean.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnMean.setSelected(true);
        radioBtnMean.setText("Mean Filter");
        radioBtnMean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMeanActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnMedian);
        radioBtnMedian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnMedian.setText("Median Filter");

        buttonGroup1.add(radioBtnAlpha);
        radioBtnAlpha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnAlpha.setText("Alpha Trimmed Filter");

        btnApplyFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transformation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_1rsz_rotate_right_arrow.png"))); // NOI18N
        jButton2.setToolTipText("Rotate Clockwise 90 degrees");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_rotate_left_arrow.png"))); // NOI18N
        jButton1.setToolTipText("Rotate Anti-Clockwise 90 degrees");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnFlip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_vertical_align_mirror-512.png"))); // NOI18N
        btnFlip.setToolTipText("Flip Horizontal");
        btnFlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFlip, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlip, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFlip, jButton1, jButton2});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scaling", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnScale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnScale.setText("Scale");
        btnScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScaleActionPerformed(evt);
            }
        });

        spinnerScale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinnerScale.setValue(200
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnScale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(spinnerScale, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spinnerScale, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnScale)
                .addGap(19, 19, 19))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lighting", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_1enlighten_sun_light_brightness-512.png"))); // NOI18N
        jButton3.setToolTipText("Increase Brightness");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_enlighten_sun_light_brightness-512.png"))); // NOI18N
        jButton4.setToolTipText("Decrease Brightness");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_moon_last_quarter-512.png"))); // NOI18N
        jButton5.setToolTipText("Increase Contrast");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_basic3-102_visibility_contrast_brightness-512.png"))); // NOI18N
        jButton6.setToolTipText("Decrease Contrast");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnAutoContrast.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAutoContrast, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(btnAutoContrast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4, jButton5, jButton6});

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edge Detection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnEdgeFiltet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdgeFiltet.setText("Filter");
        btnEdgeFiltet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdgeFiltetActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBtnSobelH);
        radioBtnSobelH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnSobelH.setText("Sobel Horizontal");

        buttonGroup2.add(radioBtnPrewittV);
        radioBtnPrewittV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnPrewittV.setText("Prewitt Vertical");

        buttonGroup2.add(radioBtnLaplacian);
        radioBtnLaplacian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnLaplacian.setSelected(true);
        radioBtnLaplacian.setText("Laplacian");

        buttonGroup2.add(radioBtnPrewittH);
        radioBtnPrewittH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnPrewittH.setText("Prewitt Horizontal");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Threshold");

        buttonGroup2.add(radioBtnSobelV);
        radioBtnSobelV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnSobelV.setText("Sobel Vertical");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBtnSobelV)
                    .addComponent(radioBtnLaplacian)
                    .addComponent(radioBtnPrewittV)
                    .addComponent(radioBtnSobelH)
                    .addComponent(sliderThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEdgeFiltet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioBtnPrewittH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(sliderThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                        .addComponent(radioBtnSobelH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnSobelV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(radioBtnPrewittV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnPrewittH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnLaplacian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdgeFiltet)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Convert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        buttonGroup3.add(radioBtnNegative);
        radioBtnNegative.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnNegative.setSelected(true);
        radioBtnNegative.setText("Negative");
        radioBtnNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnNegativeActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioBtnGrsyscale);
        radioBtnGrsyscale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnGrsyscale.setText("Grayscale");

        buttonGroup3.add(radioBtnDither);
        radioBtnDither.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnDither.setText("Dither");

        btnApplyConversion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnApplyConversion.setText("Apply");
        btnApplyConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyConversionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApplyConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioBtnDither, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioBtnGrsyscale)
                            .addComponent(radioBtnNegative))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioBtnNegative)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtnGrsyscale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtnDither)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApplyConversion))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        histoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image Histogram", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout histoPanelLayout = new javax.swing.GroupLayout(histoPanel);
        histoPanel.setLayout(histoPanelLayout);
        histoPanelLayout.setHorizontalGroup(
            histoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        histoPanelLayout.setVerticalGroup(
            histoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageprocessingproject/rsz_save-xxl.png"))); // NOI18N
        btnSave.setToolTipText("Save Image");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Image Editer");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(histoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(histoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOpenFile, btnSave, btnUndo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

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

    private void btnAutoContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoContrastActionPerformed
        
//                    ImageHistogram.autoContrastImage(imageHandler.getCurrentImage());
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=
                    ContrastStrech.contrastStreach(imageHandler.getCurrentImage());
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_btnAutoContrastActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        imageHandler.saveImage();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEdgeFiltetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdgeFiltetActionPerformed
        BufferedImage image=null;
        if(radioBtnPrewittH.isSelected()){
            image=EdgeDetector.getPrewittHImage(imageHandler.getCurrentImage(), 
                    sliderThreshold.getValue());
        }
        else if(radioBtnPrewittV.isSelected()){
            image=EdgeDetector.getPrewittVImage(imageHandler.getCurrentImage(), 
                    sliderThreshold.getValue());
        }
        else if(radioBtnSobelH.isSelected()){
            image=EdgeDetector.getSobelHImage(imageHandler.getCurrentImage(), 
                    sliderThreshold.getValue());
        }
        else if(radioBtnSobelV.isSelected()){
            image=EdgeDetector.getSobelVImage(imageHandler.getCurrentImage(), 
                    sliderThreshold.getValue());
        }
        else if(radioBtnLaplacian.isSelected()){
            image=EdgeDetector.getLaplacianImage(imageHandler.getCurrentImage(), 
                    sliderThreshold.getValue());
        }
        imageHandler.addImage(image);
        drawImage(imageHandler.getCurrentImage());
    }//GEN-LAST:event_btnEdgeFiltetActionPerformed

    private void radioBtnNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnNegativeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnNegativeActionPerformed

    private void btnApplyConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyConversionActionPerformed
        if(radioBtnNegative.isSelected()){
            if(imageHandler.getCurrentImage() != null){
                BufferedImage processed_image=GrayLevelChanger.negativeImage(imageHandler.getCurrentImage());
                imageHandler.addImage(processed_image);
                drawImage(imageHandler.getCurrentImage());
            }
        }
        else if(radioBtnGrsyscale.isSelected()){
            if(imageHandler.getCurrentImage() != null){
                BufferedImage processed_image=GrayLevelChanger.grayscaleImage(imageHandler.getCurrentImage());
                imageHandler.addImage(processed_image);
                drawImage(imageHandler.getCurrentImage());
            }
        }
        else if(radioBtnDither.isSelected()){
            if(imageHandler.getCurrentImage() != null){
                BufferedImage processed_image=Dither.ditherImage(imageHandler.getCurrentImage());
                imageHandler.addImage(processed_image);
                drawImage(imageHandler.getCurrentImage());
            }
        }
    }//GEN-LAST:event_btnApplyConversionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=ContrastStrech.contrastChange(imageHandler.getCurrentImage(),true);
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(imageHandler.getCurrentImage() != null){
            BufferedImage processed_image=ContrastStrech.contrastChange(imageHandler.getCurrentImage(),false);
            imageHandler.addImage(processed_image);
            drawImage(imageHandler.getCurrentImage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
    private javax.swing.JButton btnApplyConversion;
    private javax.swing.JButton btnApplyFilter;
    private javax.swing.JButton btnAutoContrast;
    private javax.swing.JButton btnEdgeFiltet;
    private javax.swing.JButton btnFlip;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnScale;
    private javax.swing.JButton btnUndo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel histoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JRadioButton radioBtnAlpha;
    private javax.swing.JRadioButton radioBtnDither;
    private javax.swing.JRadioButton radioBtnGrsyscale;
    private javax.swing.JRadioButton radioBtnLaplacian;
    private javax.swing.JRadioButton radioBtnMean;
    private javax.swing.JRadioButton radioBtnMedian;
    private javax.swing.JRadioButton radioBtnNegative;
    private javax.swing.JRadioButton radioBtnPrewittH;
    private javax.swing.JRadioButton radioBtnPrewittV;
    private javax.swing.JRadioButton radioBtnSobelH;
    private javax.swing.JRadioButton radioBtnSobelV;
    private javax.swing.JSlider sliderThreshold;
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
