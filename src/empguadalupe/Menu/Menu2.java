/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu;

import empguadalupe.Menu.Aprendizaje.ParoEmergencia.ParoEmergencia;
import empguadalupe.Menu.Aprendizaje.ParoNormal.ParoNormal;
import empguadalupe.Menu.Aprendizaje.ParoRapido.ParoRapido1;
import empguadalupe.Menu.Aprendizaje.arranque.Arranque1;
import empguadalupe.Menu.Evaluacion.Menu.*;
import empguadalupe.Menu.Evaluacion.Secuencias.ArranqueEva;
import empguadalupe.Menu.Evaluacion.Secuencias.ParoEmergenciaEVA;
import empguadalupe.Menu.Evaluacion.Secuencias.ParoNormalEVA;
import empguadalupe.Menu.Evaluacion.Secuencias.ParoRapidoEVA;
import empguadalupe.Menu.Menu1;
import empguadalupe.Menu.ayudaaprendizaje;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lzambrs
 */
public class Menu2 extends javax.swing.JFrame {

    /**
     * Creates new form Evaluacion
     */
    public Menu2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("ARRANQUE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 147, -1));

        jButton3.setText("PARO NORMAL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 147, -1));

        jButton4.setText("PARO RAPIDO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 145, -1));

        jButton5.setText("PARO DE EMERGENCIA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/thumbGRUPO20EPM20CON20CIERRE202013.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/color.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {                                         
            Arranque1 arr = new Arranque1();
            arr.setVisible(true);
            ayudaaprendizaje ayuda = null;
            Metodos met = new Metodos();
            try {
                met.guardaDatos("Arranque", 1);
            } catch (IOException ex) {
                Logger.getLogger(Menu2.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ayuda = new ayudaaprendizaje();
            } catch (IOException ex) {
                Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
            }
            ayuda.setVisible(true);
            ayuda.setLocationRelativeTo(null);// TODO add your handling code here:
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(Menu2.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ParoNormal pne = new ParoNormal();
        pne.setVisible(true);
        ayudaaprendizaje ayuda = null;
        Metodos met = new Metodos();
        try {
            met.guardaDatos("Paro Normal", 1);
        } catch (IOException ex) {
            Logger.getLogger(Menu2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
        ayuda.setVisible(true);
        ayuda.setLocationRelativeTo(null);// TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ParoRapido1 pne = new ParoRapido1();
        pne.setVisible(true);
        ayudaaprendizaje ayuda = null;
        Metodos met = new Metodos();
        try {
            met.guardaDatos("Paro Rapido", 1);
        } catch (IOException ex) {
            Logger.getLogger(Menu2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
        ayuda.setVisible(true);
        ayuda.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ParoEmergencia pne = new ParoEmergencia();
        pne.setVisible(true);
        ayudaaprendizaje ayuda = null;
        Metodos met = new Metodos();
        try {
            met.guardaDatos("Paro Emergencia", 1);
        } catch (IOException ex) {
            Logger.getLogger(Menu2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ayuda = new ayudaaprendizaje();
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
        ayuda.setVisible(true);
        ayuda.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       Menu1 menu = new Menu1();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
