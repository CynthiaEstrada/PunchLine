/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonarduino;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;

/**
 *
 * @author cyndi
 */
public class Seleccion extends javax.swing.JFrame {
    Teclas tc = new Teclas();
    
    public static int Tecla;

    public Seleccion() {
        initComponents();
        
        
        
        setTitle("PunchLine");
        setLocationRelativeTo(null);
        setSize(300, 260);
        setResizable(false);
        setLayout(new BorderLayout(0,0));
        
        
        Font fuente = new Font("Lato", Font.CENTER_BASELINE, 12);
        
        Label_1.setFont(fuente);
        Label_2.setFont(fuente);
        Label_3.setFont(fuente);
        
        Mostrar(tc.seleccion_item);
      
    }
    
    private void Mostrar(String seleccion){
        
        if(seleccion == "1"){
            Label_1.setEnabled(true);
            Tc1.setEnabled(true);
            Label_2.setEnabled(false);
            Tc2.setEnabled(false);
            Label_3.setEnabled(false);
            Tc3.setEnabled(false);
        }
        if(seleccion == "2"){
            Label_1.setEnabled(true);
            Tc1.setEnabled(true);
            Label_2.setEnabled(true);
            Tc2.setEnabled(true);
            Label_3.setEnabled(false);
            Tc3.setEnabled(false);
        }
        if(seleccion == "3")
        {
            Label_1.setEnabled(true);
            Tc1.setEnabled(true);
            Label_2.setEnabled(true);
            Tc2.setEnabled(true);
            Label_3.setEnabled(true);
            Tc3.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        Boton = new javax.swing.JButton();
        Tc1 = new javax.swing.JTextField();
        Tc2 = new javax.swing.JTextField();
        Tc3 = new javax.swing.JTextField();
        Label_1 = new javax.swing.JLabel();
        Label_2 = new javax.swing.JLabel();
        Label_3 = new javax.swing.JLabel();
        CheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        ComboBox2 = new javax.swing.JComboBox<>();
        ComboBox3 = new javax.swing.JComboBox<>();
        ComboBox1 = new javax.swing.JComboBox<>();
        CheckBox_1 = new javax.swing.JCheckBox();
        CheckBox_2 = new javax.swing.JCheckBox();
        CheckBox_3 = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        Tc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tc1KeyTyped(evt);
            }
        });

        Label_1.setText("Tecla 1");

        Label_2.setText("Tecla 2");

        Label_3.setText("Tecla 3");

        CheckBox.setText("No quiero un numero y\\o letra");
        CheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBoxStateChanged(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBox_1)
                    .addComponent(CheckBox_2)
                    .addComponent(CheckBox_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBox)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton)
                            .addComponent(Tc1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tc3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tc2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_1)
                            .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Tc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label_2)
                                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CheckBox_2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_3)
                            .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CheckBox_3))
                .addGap(18, 18, 18)
                .addComponent(CheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tc1ActionPerformed

    private void Tc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tc1KeyTyped
       Tecla = evt.getKeyCode();
       System.out.print(Tecla);
    }//GEN-LAST:event_Tc1KeyTyped

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        //al presionar enviar los datos al arduino
        Teclas_Especiales TE = new Teclas_Especiales();
        if(CheckBox.isSelected() == true){
        TE.setVisible(true); 
        dispose();
        }
        else{
            System.exit(0);
            dispose();
        }
    }//GEN-LAST:event_BotonActionPerformed

    private void CheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBoxStateChanged
        if(CheckBox.isSelected() == true){
            Label_1.setEnabled(false);
            Tc1.setEnabled(false);
            Label_2.setEnabled(false);
            Tc2.setEnabled(false);
            Label_3.setEnabled(false);
            Tc3.setEnabled(false);
            
        }
        else{
            Mostrar(tc.seleccion_item);
        }
    }//GEN-LAST:event_CheckBoxStateChanged

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
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JCheckBox CheckBox_1;
    private javax.swing.JCheckBox CheckBox_2;
    private javax.swing.JCheckBox CheckBox_3;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JLabel Label_1;
    private javax.swing.JLabel Label_2;
    private javax.swing.JLabel Label_3;
    private javax.swing.JTextField Tc1;
    private javax.swing.JTextField Tc2;
    private javax.swing.JTextField Tc3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
