/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonarduino;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author cyndi
 */
public class Seleccion extends javax.swing.JFrame {
    Teclas tc = new Teclas();//ojeto de la clase Teclas, ventana principal
    
    private static String TeclasEspeciales[] ={"", "Enter", "Retroceso", "Ctrl", "Alt", "Shift", "Espacio" };
    String tc1;
    String tc2;
    String tc3;
    public static int Tecla1;//variable que guarda el valor de la primer tecla seleccionada en codigo ascii
    public static int Tecla2;//variable que guarda el valor de la segunda tecla seleccionada en codigo ascii
    public static int Tecla3;//variable que guarda el valor de la tercera tecla seleccionada en codigo ascii

    public Seleccion() {
        initComponents();
        
        
        
        setTitle("PunchLine");
        setLocationRelativeTo(null);
        setSize(330, 260);
        setResizable(false);
        setLayout(new BorderLayout(0,0));
        
        
        Font fuente = new Font("Lato", Font.CENTER_BASELINE, 12);
        
        Label_1.setFont(fuente);
        Label_2.setFont(fuente);
        Label_3.setFont(fuente);
        
        Mostrar(tc.seleccion_item);
        
        ComboBox1.setModel(new DefaultComboBoxModel<>(TeclasEspeciales) );
        ComboBox2.setModel(new DefaultComboBoxModel<>(TeclasEspeciales) );
        ComboBox3.setModel(new DefaultComboBoxModel<>(TeclasEspeciales) );
      
    }
    
    private void Mostrar(String seleccion){
        
        if(seleccion == "1"){
            Label_1.setEnabled(true);
            Tc1.setEnabled(true);
            Label_2.setEnabled(false);
            Tc2.setEnabled(false);
            CheckBox_2.setEnabled(false);
            Label_3.setEnabled(false);
            Tc3.setEnabled(false);
            CheckBox_3.setEnabled(false);
            
        }
        if(seleccion == "2"){
            Label_1.setEnabled(true);
            Tc1.setEnabled(true);
            Label_2.setEnabled(true);
            Tc2.setEnabled(true);
            CheckBox_2.setEnabled(true);
            Label_3.setEnabled(false);
            Tc3.setEnabled(false);
            CheckBox_3.setEnabled(false);
        }
        if(seleccion == "3")
        {
            Label_1.setEnabled(true);
            Tc1.setEnabled(true);
            Label_2.setEnabled(true);
            Tc2.setEnabled(true);
            CheckBox_2.setEnabled(true);
            Label_3.setEnabled(true);
            Tc3.setEnabled(true);
            CheckBox_3.setEnabled(true);
        }
        this.ComboBox1.setVisible(false);
        this.ComboBox2.setVisible(false);
        this.ComboBox3.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jFrame1 = new javax.swing.JFrame();
        Boton1 = new javax.swing.JButton();
        Tc4 = new javax.swing.JTextField();
        Tc5 = new javax.swing.JTextField();
        Tc6 = new javax.swing.JTextField();
        Label_4 = new javax.swing.JLabel();
        Label_5 = new javax.swing.JLabel();
        Label_6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ComboBox4 = new javax.swing.JComboBox<>();
        ComboBox5 = new javax.swing.JComboBox<>();
        ComboBox6 = new javax.swing.JComboBox<>();
        CheckBox_4 = new javax.swing.JCheckBox();
        CheckBox_5 = new javax.swing.JCheckBox();
        CheckBox_6 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        Boton = new javax.swing.JButton();
        Tc1 = new javax.swing.JTextField();
        Tc2 = new javax.swing.JTextField();
        Tc3 = new javax.swing.JTextField();
        Label_1 = new javax.swing.JLabel();
        Label_2 = new javax.swing.JLabel();
        Label_3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ComboBox2 = new javax.swing.JComboBox<>();
        ComboBox3 = new javax.swing.JComboBox<>();
        ComboBox1 = new javax.swing.JComboBox<>();
        CheckBox_1 = new javax.swing.JCheckBox();
        CheckBox_2 = new javax.swing.JCheckBox();
        CheckBox_3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton1.setText("Ok");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Tc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tc4ActionPerformed(evt);
            }
        });
        Tc4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tc4KeyTyped(evt);
            }
        });

        Label_4.setText("Tecla 1");

        Label_5.setText("Tecla 2");

        Label_6.setText("Tecla 3");

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CheckBox_4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox_4StateChanged(evt);
            }
        });

        CheckBox_5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox_5StateChanged(evt);
            }
        });

        CheckBox_6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox_6StateChanged(evt);
            }
        });

        jLabel2.setText("Tecla Especial");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(Boton1))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox_4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckBox_5)
                            .addComponent(CheckBox_6))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(Label_6)
                                .addGap(19, 19, 19)
                                .addComponent(ComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label_4)
                                    .addComponent(Label_5))
                                .addGap(18, 18, 18)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tc4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tc6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tc5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CheckBox_4)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_5)
                            .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(CheckBox_5)
                        .addGap(9, 9, 9)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_6)
                        .addComponent(ComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CheckBox_6))
                .addGap(9, 9, 9)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton.setText("Ok");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        Tc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tc1ActionPerformed(evt);
            }
        });

        Label_1.setText("Tecla 1");

        Label_2.setText("Tecla 2");

        Label_3.setText("Tecla 3");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CheckBox_1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox_1StateChanged(evt);
            }
        });

        CheckBox_2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox_2StateChanged(evt);
            }
        });

        CheckBox_3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox_3StateChanged(evt);
            }
        });

        jLabel1.setText("Tecla Especial");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1)
                        .addGap(59, 59, 59)
                        .addComponent(Boton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox_1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckBox_2)
                            .addComponent(CheckBox_3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_3)
                                .addGap(19, 19, 19)
                                .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label_1)
                                    .addComponent(Label_2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tc1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tc3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tc2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CheckBox_1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_2)
                            .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckBox_2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_3)
                        .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CheckBox_3))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void Tc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tc1ActionPerformed

    }//GEN-LAST:event_Tc1ActionPerformed
*/
    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
            if(tc.seleccion_item == "1"){
                if(CheckBox_1.isSelected() == false){
                    tc1 = Tc1.getText();
                    Tecla1 = tc1.codePointAt(0);
                            System.out.print(Tecla1);
                }
            }
        
            System.exit(0);
            dispose();
    }//GEN-LAST:event_BotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckBox_1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBox_1StateChanged
        if(CheckBox_1.isSelected() == true){
            this.ComboBox1.setVisible(true);
            this.Tc1.setVisible(false);
        }else{
        this.ComboBox1.setVisible(false);
        this.Tc1.setVisible(true);
    }
    }//GEN-LAST:event_CheckBox_1StateChanged

    private void CheckBox_2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBox_2StateChanged
        if(CheckBox_2.isSelected() == true){
            this.ComboBox2.setVisible(true);
            this.Tc2.setVisible(false);
        }else{
        this.ComboBox2.setVisible(false);
        this.Tc2.setVisible(true);
    }
    }//GEN-LAST:event_CheckBox_2StateChanged

    private void CheckBox_3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBox_3StateChanged
        if(CheckBox_3.isSelected() == true){
            this.ComboBox3.setVisible(true);
            this.Tc3.setVisible(false);
        }else{
        this.ComboBox3.setVisible(false);
        this.Tc3.setVisible(true);
    }
    }//GEN-LAST:event_CheckBox_3StateChanged
/*
    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Tc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tc4ActionPerformed

    private void Tc4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tc4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Tc4KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CheckBox_4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBox_4StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_4StateChanged

    private void CheckBox_5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBox_5StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_5StateChanged

    private void CheckBox_6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBox_6StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_6StateChanged
*/
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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JButton Boton1;
    private javax.swing.JCheckBox CheckBox_1;
    private javax.swing.JCheckBox CheckBox_2;
    private javax.swing.JCheckBox CheckBox_3;
    private javax.swing.JCheckBox CheckBox_4;
    private javax.swing.JCheckBox CheckBox_5;
    private javax.swing.JCheckBox CheckBox_6;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JComboBox<String> ComboBox4;
    private javax.swing.JComboBox<String> ComboBox5;
    private javax.swing.JComboBox<String> ComboBox6;
    private javax.swing.JLabel Label_1;
    private javax.swing.JLabel Label_2;
    private javax.swing.JLabel Label_3;
    private javax.swing.JLabel Label_4;
    private javax.swing.JLabel Label_5;
    private javax.swing.JLabel Label_6;
    private javax.swing.JTextField Tc1;
    private javax.swing.JTextField Tc2;
    private javax.swing.JTextField Tc3;
    private javax.swing.JTextField Tc4;
    private javax.swing.JTextField Tc5;
    private javax.swing.JTextField Tc6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
