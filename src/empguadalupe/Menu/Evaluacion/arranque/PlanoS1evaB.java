/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Evaluacion.arranque;

import empguadalupe.Menu.Aprendizaje.arranque.Planos.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author lzambrs
 */
public class PlanoS1evaB extends javax.swing.JFrame implements ActionListener{

 int contErrores;
    /**
     * Creates new form PlanoBomba
     */

    public PlanoS1evaB() {    
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/plano S1_1.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 140));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 120));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 50, 40));

        jButton4.setText("jButton4");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 60, 50));

        jButton5.setText("jButton5");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 40, 40));

        jButton6.setText("jButton6");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 30));

        jButton7.setText("jButton7");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 90, 70));

        jButton8.setText("jButton8");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 353, 40, 30));

        jButton9.setText("jButton3");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 50, 40));

        jButton10.setText("jButton3");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 323, 50, 40));

        jButton11.setText("jButton4");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 60, 50));

        jButton12.setText("jButton4");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 60, 50));

        jButton13.setText("jButton5");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 40, 40));

        jButton14.setText("jButton5");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 40, 40));

        jButton15.setText("jButton7");
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 90, 70));

        jButton16.setText("jButton7");
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 100, 90, 70));

        jButton17.setText("jButton6");
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, -1, 30));

        jButton18.setText("jButton6");
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 373, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        ArranqueEva arra = new ArranqueEva();
     arra.pu2 = contErrores;
     
        JOptionPane.showMessageDialog(rootPane, "correcto");
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
     contErrores=contErrores+1;
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
            java.util.logging.Logger.getLogger(PlanoS1evaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanoS1evaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanoS1evaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanoS1evaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new PlanoS1evaB().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
