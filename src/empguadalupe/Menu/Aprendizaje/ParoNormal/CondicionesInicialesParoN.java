/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Aprendizaje.ParoNormal;

/**
 *
 * @author lzambrs
 */
public class CondicionesInicialesParoN extends javax.swing.JFrame {

    /**
     * Creates new form CondicionesIniciales
     */
    public CondicionesInicialesParoN() {
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

        jLabel39 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel101 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("GUADALUPE IV:ENCLAVAMIENTOS UNIDAD X SECUENCIA DE PARO NORMAL");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 30));

        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 20, 20));

        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 20, 20));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("PARO RÀPIDO SECUENCIA INACTIVA");
        getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 270, 20));

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("PARO EMERGENCIA SECUENCIA INACTIVA");
        getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 240, 20));

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("SECUENCIAS DE PARO INACTIVAS");
        jLabel102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 310, 20));

        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 20, 20));

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("PARO PARCIAL SECUENCIA INACTIVA");
        getContentPane().add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 240, 20));

        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 20, 20));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(4);
        jTextArea1.setText("La máquina se puede parar normalmente siempre y cuando no estén activas ninguna de las secuencias de paro: Parcial, rápido o de emergencia. Estas secuencias de paro se hacen automáticamente cuando ocurre alguna falla en la unidad. \nPara hacer un paro normal de la máquina se debe dar clic en el botón  AUTO o \nPASO según se quiera hacer este procedimiento automáticamente una vez dada la orden o paso a paso respectivamente. \n\nLuego debe darse clic en el botón  PARAR. Después en la ventana que sale, se  debe reconfirmar el proceso de paro normal. Una vez hecho esto el proceso de  paro, automático o paso a paso (según se haya seleccionado) es equivalente al proceso seguido para arrancar la máquina en cada caso respectivamente.\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 650, 210));

        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 310, 110));

        jLabel104.setBackground(new java.awt.Color(51, 153, 255));
        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/color.png"))); // NOI18N
        getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 750, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CondicionesInicialesParoN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CondicionesInicialesParoN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CondicionesInicialesParoN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CondicionesInicialesParoN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CondicionesInicialesParoN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
