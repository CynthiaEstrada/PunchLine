package botonarduino;

import com.panamahitek.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends javax.swing.JFrame {
     //com.panamahitek.PanamaHitek_Arduino Arduino = new com.panamahitek.PanamaHitek_Arduino();

    public VentanaPrincipal(){
        initComponents(); 
        setLocationRelativeTo(null);
        setSize(500, 400);
        setTitle("PunchLine");
        setResizable(false);
        
        Font fuente = new Font("Lato", Font.CENTER_BASELINE, 40);
        TextoBienvenida.setFont(fuente);
        TextoBienvenida.setForeground(Color.BLUE);
        
        BotonEmpezar.setAlignmentY(BOTTOM_ALIGNMENT);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        TextoBienvenida = new javax.swing.JLabel();
        BotonEmpezar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoBienvenida.setText("PunchLine");
        TextoBienvenida.setAlignmentX(0.5F);
        TextoBienvenida.setAlignmentY(0.0F);
        TextoBienvenida.setFocusable(false);
        TextoBienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(TextoBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 118, -1, -1));

        BotonEmpezar.setBackground(new java.awt.Color(255, 255, 255));
        BotonEmpezar.setText("Empezar");
        BotonEmpezar.setAlignmentY(0.0F);
        BotonEmpezar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonEmpezar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEmpezar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpezarActionPerformed
                
        Teclas ventana = new Teclas();
        ventana.setVisible(true);
       dispose();

    }//GEN-LAST:event_BotonEmpezarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEmpezar;
    private javax.swing.JLabel TextoBienvenida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
