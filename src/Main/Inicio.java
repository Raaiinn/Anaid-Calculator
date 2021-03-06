/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Datos.Fuentes;
import Datos.Mtd_Taylor;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    private final Font FP;

    public Inicio() {
        initComponents();
        FP = Fuentes.setFuente("/assets/font_1.ttf");
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(icon_logo, "src/assets/Inicio_logo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btn_close, "src/assets/icon_close.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(icon_inicio_1, "src/assets/icon_r_e.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(icon_inicio_2, "src/assets/icon_a_c.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(icon_inicio_3, "src/assets/icon_integral.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(icon_inicio_4, "src/assets/icon_derivada.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(icon_inicio_5, "src/assets/icon_t.png");
        Lbl_Raices1.setFont(FP);
        Lbl_Raices2.setFont(FP);
        Lbl_Raices3.setFont(FP);
        Lbl_Raices4.setFont(FP);
        Lbl_Raices.setFont(FP);
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_close = new javax.swing.JLabel();
        icon_logo = new javax.swing.JLabel();
        icon_inicio_5 = new javax.swing.JLabel();
        icon_inicio_4 = new javax.swing.JLabel();
        icon_inicio_3 = new javax.swing.JLabel();
        icon_inicio_1 = new javax.swing.JLabel();
        Lbl_Raices = new javax.swing.JLabel();
        icon_inicio_2 = new javax.swing.JLabel();
        Lbl_Raices4 = new javax.swing.JLabel();
        Lbl_Raices3 = new javax.swing.JLabel();
        Lbl_Raices2 = new javax.swing.JLabel();
        Lbl_Raices1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 637));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });
        getContentPane().add(btn_close);
        btn_close.setBounds(370, 0, 30, 30);
        getContentPane().add(icon_logo);
        icon_logo.setBounds(50, 20, 310, 140);
        getContentPane().add(icon_inicio_5);
        icon_inicio_5.setBounds(20, 550, 140, 80);
        getContentPane().add(icon_inicio_4);
        icon_inicio_4.setBounds(20, 470, 140, 80);
        getContentPane().add(icon_inicio_3);
        icon_inicio_3.setBounds(20, 370, 140, 80);
        getContentPane().add(icon_inicio_1);
        icon_inicio_1.setBounds(20, 190, 140, 60);

        Lbl_Raices.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Lbl_Raices.setText("Raices de ecuaciones");
        Lbl_Raices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_RaicesMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Raices);
        Lbl_Raices.setBounds(180, 190, 220, 50);
        getContentPane().add(icon_inicio_2);
        icon_inicio_2.setBounds(50, 280, 70, 70);

        Lbl_Raices4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Lbl_Raices4.setText("Serie de taylor");
        Lbl_Raices4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Raices4MouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Raices4);
        Lbl_Raices4.setBounds(180, 570, 220, 50);

        Lbl_Raices3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Lbl_Raices3.setText("Derivacion Num.");
        Lbl_Raices3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Raices3MouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Raices3);
        Lbl_Raices3.setBounds(180, 480, 220, 50);

        Lbl_Raices2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Lbl_Raices2.setText("Integracion Num.");
        Lbl_Raices2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Raices2MouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Raices2);
        Lbl_Raices2.setBounds(180, 390, 220, 50);

        Lbl_Raices1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Lbl_Raices1.setText("Ajuste de curvas");
        Lbl_Raices1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Raices1MouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Raices1);
        Lbl_Raices1.setBounds(180, 290, 220, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        rsscalelabel.RSScaleLabel.setScaleLabel(btn_close, "src/assets/icon_close_focus.png");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        rsscalelabel.RSScaleLabel.setScaleLabel(btn_close, "src/assets/icon_close.png");
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void Lbl_RaicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_RaicesMouseClicked
        try {
            Raices R = new Raices();
            this.dispose();
            R.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Lbl_RaicesMouseClicked

    private void Lbl_Raices1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Raices1MouseClicked
        try {
            AjusteCurvas a = new AjusteCurvas();
            this.dispose();
            a.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Lbl_Raices1MouseClicked

    private void Lbl_Raices2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Raices2MouseClicked
        try {
            Integracion a = new Integracion();
            this.dispose();
            a.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_Lbl_Raices2MouseClicked

    private void Lbl_Raices3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Raices3MouseClicked
        try {
            Derivacion a = new Derivacion();
            this.dispose();
            a.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Lbl_Raices3MouseClicked

    private void Lbl_Raices4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Raices4MouseClicked
        try {
            Taylor a=new Taylor();
            this.dispose();
            a.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_Lbl_Raices4MouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Raices;
    private javax.swing.JLabel Lbl_Raices1;
    private javax.swing.JLabel Lbl_Raices2;
    private javax.swing.JLabel Lbl_Raices3;
    private javax.swing.JLabel Lbl_Raices4;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel icon_inicio_1;
    private javax.swing.JLabel icon_inicio_2;
    private javax.swing.JLabel icon_inicio_3;
    private javax.swing.JLabel icon_inicio_4;
    private javax.swing.JLabel icon_inicio_5;
    private javax.swing.JLabel icon_logo;
    // End of variables declaration//GEN-END:variables
}
