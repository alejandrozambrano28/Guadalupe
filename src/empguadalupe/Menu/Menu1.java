/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu;

import empguadalupe.Menu.Aprendizaje.ParoRapido.ParoRapido;
import empguadalupe.Menu.Aprendizaje.ParoEmergencia.ParoEmergencia;
import empguadalupe.Menu.Aprendizaje.ParoNormal.ParoNormal;
import empguadalupe.Menu.Aprendizaje.arranque.Arranque1;
import empguadalupe.Menu.Evaluacion.arranque.ArranqueEva;
import empguadalupe.Menu.Evaluacion.arranque.FormularioEvaluacion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author lzambrs
 */
public class Menu1 extends javax.swing.JFrame {
    String Mu;
    String label;
  
    /**
     * Creates new form Menu1
     */
    public Menu1() {
        initComponents();
         this.setLocationRelativeTo(null);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HIDROELECTRICA GUADALUPE IV  SECUENCIAS DE GENERACION"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/ARRANQUE.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/PARONORMAL.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, 70));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/PARORAPIDO.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 80, 70));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/PAROEMERGENCIA.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 80, 70));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/ARRANQUE.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 80, 70));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/PARONORMAL.png"))); // NOI18N
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 80, 80));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/PARORAPIDO.png"))); // NOI18N
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 80, 80));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/PAROEMERGENCIA.png"))); // NOI18N
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 80, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EVALUACION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APRENDIZAJE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/002.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Arranque1 arranque = null;
        try {
            arranque = new Arranque1();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
            arranque.setVisible(true);
             ayudaaprendizaje ayuda = null;
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
           ayuda.setVisible(true);// TODO add your handling code here:
           ayuda.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           JFrame ParoN = new ParoNormal();
            ParoN.setVisible(true);
                  ayudaaprendizaje ayuda = null;
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
           ayuda.setVisible(true);
            ayuda.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         JFrame ParoR = new ParoRapido();
            ParoR.setVisible(true);
                  ayudaaprendizaje ayuda = null;
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
           ayuda.setVisible(true);
            ayuda.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame ParoE = new ParoEmergencia();
            ParoE.setVisible(true);
                  ayudaaprendizaje ayuda = null;
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
           ayuda.setVisible(true);
           ayuda.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed
   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      FormularioEvaluacion form = new FormularioEvaluacion();
      form.setVisible(true);
      form.setLocationRelativeTo(null);
            ayudaaprendizaje ayuda = null;
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
           ayuda.setVisible(true);
            ayuda.setLocationRelativeTo(null);
      dispose();
     
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
