/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Evaluacion.planos;

import com.sun.glass.ui.Cursor;
import empguadalupe.Menu.Aprendizaje.arranque.Planos.*;
import empguadalupe.Menu.Evaluacion.Secuencias.ArranqueEva;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author lzambrs
 */
public class PlanoS2eva1 extends javax.swing.JFrame implements ActionListener {

    int contErrores;

    /**
     * Creates new form PlanoBomba
     */
    public PlanoS2eva1(int numeroboton) {
        initComponents();
        this.setResizable(false);

        switch (numeroboton) {

            case 1:
                bomba1.setEnabled(true);
                bomba2.setEnabled(true);
                bomba5.setEnabled(true);
                break;
            case 2:
                bomba.setEnabled(true);
                bomba3.setEnabled(true);
                bomba4.setEnabled(true);
                break;

        }

    }

    private PlanoS2eva1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(rootPane, "correcto");
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
        bomba = new javax.swing.JButton();
        bomba1 = new javax.swing.JButton();
        bomba2 = new javax.swing.JButton();
        bomba3 = new javax.swing.JButton();
        bomba4 = new javax.swing.JButton();
        bomba5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/planoP1m.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 530));

        bomba.setText("jButton1");
        bomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombaActionPerformed(evt);
            }
        });
        getContentPane().add(bomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 50, 50));

        bomba1.setText("jButton1");
        bomba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba1ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 50, 50));

        bomba2.setText("jButton1");
        bomba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba2ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 50, 50));

        bomba3.setText("jButton1");
        bomba3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba3ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 50, 50));

        bomba4.setText("jButton1");
        bomba4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba4ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 50, 50));

        bomba5.setText("jButton1");
        bomba5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba5ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombaActionPerformed
        ArranqueEva arra = new ArranqueEva();
        arra.pu2[10] = contErrores;
        arra.preguntas[10] = 1;
        JOptionPane.showMessageDialog(rootPane, "correcto");
        dispose();
    }//GEN-LAST:event_bombaActionPerformed

    private void bomba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba1ActionPerformed
        ArranqueEva arra = new ArranqueEva();
        arra.pu2[9] = contErrores;
        arra.preguntas[9] = 1;
        JOptionPane.showMessageDialog(rootPane, "correcto");
        dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_bomba1ActionPerformed

    private void bomba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba2ActionPerformed
        ArranqueEva arra = new ArranqueEva();
        arra.pu2[9] = contErrores;
        arra.preguntas[9] = 1;
        JOptionPane.showMessageDialog(rootPane, "correcto");
        dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_bomba2ActionPerformed

    private void bomba3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba3ActionPerformed
        ArranqueEva arra = new ArranqueEva();
        arra.pu2[10] = contErrores;
        arra.preguntas[10] = 1;
        JOptionPane.showMessageDialog(rootPane, "correcto");
        dispose();
    }//GEN-LAST:event_bomba3ActionPerformed

    private void bomba4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba4ActionPerformed
        ArranqueEva arra = new ArranqueEva();
        arra.pu2[10] = contErrores;
        arra.preguntas[10] = 1;
        JOptionPane.showMessageDialog(rootPane, "correcto");
        dispose();   // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_bomba4ActionPerformed

    private void bomba5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba5ActionPerformed
        ArranqueEva arra = new ArranqueEva();
        arra.pu2[9] = contErrores;
        arra.preguntas[9] = 1;
        JOptionPane.showMessageDialog(rootPane, "correcto");
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_bomba5ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        contErrores = contErrores + 1;
        Image im = Toolkit.getDefaultToolkit().createImage("src\\imgfondo\\error.png");
        java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
        setCursor(cur);
        try {
            Thread.sleep(300); // 1000 milisegundos (10 segundos)

        } catch (InterruptedException ex) {
            Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(PlanoS2eva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanoS2eva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanoS2eva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanoS2eva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanoS2eva1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bomba;
    private javax.swing.JButton bomba1;
    private javax.swing.JButton bomba2;
    private javax.swing.JButton bomba3;
    private javax.swing.JButton bomba4;
    private javax.swing.JButton bomba5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
