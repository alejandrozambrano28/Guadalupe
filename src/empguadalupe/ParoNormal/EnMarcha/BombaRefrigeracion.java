/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.ParoNormal.EnMarcha;

import empguadalupe.arranque.EnMarcha.*;
import empguadalupe.arranque.EnMarcha.Planos.PlanoFiltro;
import empguadalupe.arranque.EnMarcha.Controles.ControlBomba;
import empguadalupe.arranque.EnMarcha.Controles.SistemadeRefrigeracion;
import empguadalupe.arranque.EnMarcha.Planos.PlanoBomba;
import empguadalupe.arranque.EnMarcha.Condiciones.CondicionesBomba;
import empguadalupe.arranque.EnMarcha.Condiciones.Condicionesfrenos;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lzambrs
 */
public class BombaRefrigeracion extends javax.swing.JFrame {

    /**
     * Creates new form BombaRefrigeracion
     */
    public BombaRefrigeracion() throws IOException {
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOMBA DE REFRIGERACION OFF");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 8, 440, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/sistema bombas2_1.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 370));

        jButton1.setText("Ubicación en planta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 160, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("El sistema de refrigeración del generador tiene la función de estabilizar la temperatura limitando su elevación más allá de los limites previstos. La bomba de refrigeracion hace circular agua a cada unidad, y debe garantizar el flujo a través de los cojinetes y radiadores.\n\n\n");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 310, 207));

        jButton2.setText("Control Bombas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, -1));

        jButton3.setText("Condiciones Iniciales");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 180, -1));

        jButton4.setText("Sistema de Refrigeracion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/color.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 2, 960, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           PlanoBomba plano = null;
                    plano = new PlanoBomba();
                    plano.setSize(1090,474);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ControlBomba control = null;
                    control = new ControlBomba();
                    control.setSize(920, 800);
                    control.setVisible(true);
                    control.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CondicionesBomba condiciones = null;
        try {
            condiciones = new CondicionesBomba();
        } catch (IOException ex) {
            Logger.getLogger(BombaRefrigeracion.class.getName()).log(Level.SEVERE, null, ex);
        }
                    condiciones.setSize(520, 190);
                    condiciones.setVisible(true);
                    condiciones.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SistemadeRefrigeracion sistema = null;
                    sistema = new SistemadeRefrigeracion();
                    sistema.setSize(920,541);
                    sistema.setVisible(true);
                    sistema.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

	public static void main(String H[]) throws IOException
	{
		BombaRefrigeracion p = new BombaRefrigeracion();
		p.show();
 
		//COLOCAMOS EL CODIGO QUE PERMITE CERRAR LA VENTANA
		p.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent evt)
			{
				System.exit(0);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
