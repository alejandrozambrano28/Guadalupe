/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Aprendizaje.arranque.Energizado;

import empguadalupe.Menu.Aprendizaje.arranque.Controles.ControlVoltajeSup;
import empguadalupe.Menu.Aprendizaje.arranque.Controles.Energizado;
import empguadalupe.Menu.Aprendizaje.arranque.Planos.PlanoVoltajeM;

import java.io.IOException;

/**
 *
 * @author lzambrs
 */
public class VoltajeInterruptor extends javax.swing.JFrame {

    int contgeneralv = 0;

    /**
     * Creates new form BombaRefrigeracion
     */
    public VoltajeInterruptor(int contador) throws IOException {
        initComponents();
        this.setResizable(false);
        contgeneralv = contador;

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
        jLabel1.setText("VOLTAJE GENERADOR >63%");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 11, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/GinterruptorCampo.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 610, -1));

        jButton1.setText("Ubicación en planta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 230, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Cuando se llega al valor de 63% (8.7 kV) de la tensión nominal en barraje salida estator ya la maquina se encuentra generando suficiente energía como para auto-excitarse, este valor se tiene que mantener para garantizar una conexión estable en cuanto nivel de tensión con la red exterior.  ");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 240, 281));

        jButton3.setText("Control Interruptor Generador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/color.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 910, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PlanoVoltajeM plano = null;
        plano = new PlanoVoltajeM();
        plano.setVisible(true);
        plano.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ControlVoltajeSup condiciones = null;
        condiciones = new ControlVoltajeSup();
        condiciones.setVisible(true);
        condiciones.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (contgeneralv == 15) {
            Energizado m = new Energizado();
            m.setVisible(true);
            m.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String H[]) throws IOException {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
