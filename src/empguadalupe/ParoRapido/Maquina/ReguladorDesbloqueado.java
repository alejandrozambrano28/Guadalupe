/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.ParoRapido.Maquina;

import empguadalupe.ParoNormal.EnMarcha.*;
import empguadalupe.arranque.EnMarcha.*;
import empguadalupe.arranque.EnMarcha.Planos.PlanoFiltro;
import empguadalupe.arranque.EnMarcha.Controles.ControlBomba;
import empguadalupe.arranque.EnMarcha.Controles.ControlRegulador;
import empguadalupe.arranque.EnMarcha.Controles.movimiento;
import empguadalupe.arranque.EnMarcha.Planos.PlanoReguladorDes;
import empguadalupe.arranque.EnMarcha.Condiciones.Condicionesreguladordes;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lzambrs
 */
public class ReguladorDesbloqueado extends javax.swing.JFrame {
    int contgeneralv=0;

    /**
     * Creates new form BombaRefrigeracion
     */
    public ReguladorDesbloqueado(int contador) throws IOException {
        initComponents(); 
         contgeneralv=contador;
        int a=0;
       
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGULADOR DESBLOQUEADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 0, -1, 26));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/ezgif.com-crop.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, -1, -1));

        jButton1.setText("Ubicación en planta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("El regulador de velocidad tiene esta señal eléctrica de bloqueo por seguridad. Al desbloquear el regulador, esta manda la señal de que se encuentra lista para efectuar la labor.");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 630, 105));

        jButton2.setText("Control regalador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jButton3.setText("Condiciones Iniciales");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/color.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 650, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           PlanoReguladorDes plano = null;
                    plano = new PlanoReguladorDes();
                    plano.setSize(1090,474);
                    plano.setVisible(true);
                     plano.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ControlRegulador control = null;
                    control = new ControlRegulador();
                    control.setSize(240,390);
                    control.setVisible(true);
                     control.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Condicionesreguladordes condiciones = null;
        try {
            condiciones = new Condicionesreguladordes();
        } catch (IOException ex) {
            Logger.getLogger(ReguladorDesbloqueado.class.getName()).log(Level.SEVERE, null, ex);
        }
                    condiciones.setSize(580,220);
                    condiciones.setVisible(true);
                     condiciones.setLocationRelativeTo(null);
                 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
                       if(contgeneralv==12){
                             movimiento m = new movimiento();
                           m.setVisible(true);
                           m.setLocationRelativeTo(null);
                           m.setLocationRelativeTo(null);
    }
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */

	public static void main(String H[]) throws IOException
	{
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
