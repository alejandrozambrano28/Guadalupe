/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Aprendizaje.arranque.Condiciones;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.io.IOException;


/**
 *
 * @author lzambrs
 */
public class Condicionesfrenos extends javax.swing.JFrame {

    /**
     * Creates new form BombaRefrigeracion
     */
    public Condicionesfrenos() throws IOException {
        initComponents(); 
          this.setResizable(false);
       
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONDICIONES INICIALES FRENOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 258, 26));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Voltajes de control disponible");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 61, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Voltaje auxiliar Ux");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 90, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Posicion de distribuidor 0%");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 116, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Velocidad menor al 10% (51 RPM)");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 170, 190, -1));

        jCheckBox5.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Velocidad menor a 1%");
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 61, -1, -1));

        jCheckBox6.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Sistema de frenos listo");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 139, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aplicar Frenos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 37, 101, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desaplicar Frenos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 37, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/color.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    /**
     * @param args the command line arguments
     */

	public static void main(String H[]) throws IOException
	{
		Condicionesfrenos p = new Condicionesfrenos();
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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
