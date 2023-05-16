package Panes;

import Entity.Radio;

/**
 *
 * @author José Augusto Scherer
 */
public class 
    RadioInterface 
        extends javax.swing.JFrame {

    public RadioInterface() {
        initComponents(); 
        
        frequencyButton.setEnabled(false);
        
        
        this.setLocationRelativeTo(null);
    }
    
    Radio radio = new Radio();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuPane = new javax.swing.JPanel();
        decreaseVol = new javax.swing.JButton();
        increaseVol = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        frequencyButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        amIndicator = new javax.swing.JLabel();
        fmIndicator = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        onButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 230));

        contentPanel.setBackground(new java.awt.Color(153, 102, 0));
        contentPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("RADIO");

        menuPane.setBackground(new java.awt.Color(0, 0, 0));

        decreaseVol.setBackground(new java.awt.Color(153, 153, 153));
        decreaseVol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        decreaseVol.setForeground(new java.awt.Color(255, 255, 255));
        decreaseVol.setText("-");
        decreaseVol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decreaseVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseVolActionPerformed(evt);
            }
        });

        increaseVol.setBackground(new java.awt.Color(153, 153, 153));
        increaseVol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        increaseVol.setForeground(new java.awt.Color(255, 255, 255));
        increaseVol.setText("+");
        increaseVol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        increaseVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseVolActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        frequencyButton.setBackground(new java.awt.Color(153, 153, 153));
        frequencyButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        frequencyButton.setForeground(new java.awt.Color(255, 255, 255));
        frequencyButton.setText("Frequency");
        frequencyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        frequencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Documents\\NetBeansProjects\\Radio_java\\JavaRadio\\src\\main\\java\\Panes\\Captura de tela 2023-05-13 212612.png")); // NOI18N

        amIndicator.setBackground(new java.awt.Color(0, 0, 0));
        amIndicator.setForeground(new java.awt.Color(255, 255, 255));
        amIndicator.setText("AM");

        fmIndicator.setForeground(new java.awt.Color(255, 255, 255));
        fmIndicator.setText("FM");

        javax.swing.GroupLayout menuPaneLayout = new javax.swing.GroupLayout(menuPane);
        menuPane.setLayout(menuPaneLayout);
        menuPaneLayout.setHorizontalGroup(
            menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frequencyButton)
                    .addGroup(menuPaneLayout.createSequentialGroup()
                        .addComponent(amIndicator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fmIndicator)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPaneLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(decreaseVol))
                    .addGroup(menuPaneLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(increaseVol)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        menuPaneLayout.setVerticalGroup(
            menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPaneLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseVol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPaneLayout.createSequentialGroup()
                        .addComponent(frequencyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amIndicator)
                            .addComponent(fmIndicator))))
                .addGap(18, 18, 18)
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decreaseVol, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("By José Augusto Scherer");

        onButton.setBackground(new java.awt.Color(153, 102, 0));
        onButton.setForeground(new java.awt.Color(153, 153, 153));
        onButton.setText("On/Off");
        onButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(onButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())))
            .addComponent(menuPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onButton)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onButtonActionPerformed
       if (onButton.isSelected()) {
          radio.setIsOn(true);
          frequencyButton.setEnabled(true);
       } else {
           radio.setIsOn(false);
           frequencyButton.setEnabled(false);
       }
    }//GEN-LAST:event_onButtonActionPerformed

    private void frequencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyButtonActionPerformed
       
    }//GEN-LAST:event_frequencyButtonActionPerformed

    private void increaseVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseVolActionPerformed
        
    }//GEN-LAST:event_increaseVolActionPerformed

    private void decreaseVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseVolActionPerformed
       
    }//GEN-LAST:event_decreaseVolActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amIndicator;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton decreaseVol;
    private javax.swing.JLabel fmIndicator;
    private javax.swing.JButton frequencyButton;
    private javax.swing.JButton increaseVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel menuPane;
    private javax.swing.JRadioButton onButton;
    // End of variables declaration//GEN-END:variables
}
