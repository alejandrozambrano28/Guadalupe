/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Evaluacion.planos;

import com.sun.glass.ui.Cursor;
import empguadalupe.Menu.Aprendizaje.arranque.Planos.*;
import empguadalupe.Menu.Evaluacion.Secuencias.ParoNormalEVA;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author lzambrs
 */
public class PlanoS3evaPN extends javax.swing.JFrame {

    int contErrores;
    boolean bande1 = false;
    boolean bande2 = false;
    boolean bande3 = false;
    boolean bande4 = false;
  int nument=0;

    /**
     * Creates new form PlanoBomba
     */
    public PlanoS3evaPN(int numeroboton,int numentrada) {
        initComponents();
        this.setResizable(false);

          nument=numentrada;


        switch (numeroboton) {
            case 1:
                bande1 = true;
                break;
            case 2:
                bande2 = true;

                break;
            case 3:
                bande3 = true;

                break;
            case 4:
                bande4 = true;
                break;

        }

    }

    public PlanoS3evaPN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/planoP1Operador.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        bomba.setText("jButton1");
        bomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombaActionPerformed(evt);
            }
        });
        getContentPane().add(bomba, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 30, 30));

        bomba1.setText("jButton1");
        bomba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba1ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 70));

        bomba2.setText("jButton2");
        bomba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba2ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 30, 30));

        bomba3.setText("jButton3");
        bomba3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bomba3ActionPerformed(evt);
            }
        });
        getContentPane().add(bomba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 270, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombaActionPerformed
        if (bande1 == true) {
        
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage("src\\imgfondo\\error.png");
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ParoNormalEVA.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }
    }//GEN-LAST:event_bombaActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        contErrores = contErrores + 1;
        Image im = Toolkit.getDefaultToolkit().createImage("src\\imgfondo\\error.png");
        java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
        setCursor(cur);
        try {
            Thread.sleep(300); // 1000 milisegundos (10 segundos)

        } catch (InterruptedException ex) {
            Logger.getLogger(ParoNormalEVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
    }//GEN-LAST:event_formMousePressed

    private void bomba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba1ActionPerformed
          if (bande2 == true) {
       
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage("src\\imgfondo\\error.png");
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ParoNormalEVA.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }
    }//GEN-LAST:event_bomba1ActionPerformed

    private void bomba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba2ActionPerformed
   if (bande3 == true) {
            ParoNormalEVA arra = new ParoNormalEVA();
            arra.pu2[36+nument] = contErrores;
            arra.preguntas[36+nument] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage("src\\imgfondo\\error.png");
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ParoNormalEVA.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bomba2ActionPerformed

    private void bomba3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bomba3ActionPerformed
   if (bande4 == true) {
            ParoNormalEVA arra = new ParoNormalEVA();
            arra.pu2[37+nument] = contErrores;
            arra.preguntas[37+nument] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage("src\\imgfondo\\error.png");
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ParoNormalEVA.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bomba3ActionPerformed

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
            java.util.logging.Logger.getLogger(PlanoS3evaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanoS3evaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanoS3evaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanoS3evaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanoS3evaPN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bomba;
    private javax.swing.JButton bomba1;
    private javax.swing.JButton bomba2;
    private javax.swing.JButton bomba3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
