/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Aprendizaje.arranque.Controles;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author lzambrs
 */
public class ControlBomba extends javax.swing.JFrame {

    /**
     * Creates new form ControlBomba
     */
    public ControlBomba() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/contrlo bombas de refrigeracion2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Para la explicación se hará referencia a las letras (A, B o C) y la letra X, la cual puede ser reemplazada por 1, 2 o 3 según sea la válvula que se necesite manipular. Esto se hace debido a que el circuito hidráulico es simétrico en cuanto a su estructura, por lo que por ejemplo, las válvulas B1, B2 y B3 cumplirán las mismas funciones por lo que se designarán Bx.\n\n1.\tCerrar la válvula Bx.\n2.\tAbrir válvula Cx\n3.\tAbrir vávula R\n4.\tLa válvula Ax siempre debe estar abierta para que pueda ingresar la refrigeración a la unidad.\n5.\tEn el gabinete LA26 se activa la bomba de reserva tal como se explicó en el capítulo 16.4 de este manual.\n6.\tEn el gabinete LA25 debe verificarse que la perilla “Manual – Automático” se encuentre ubicada en “Manual”\n7.\tEn el gabinete LA25 debe oprimirse el botón de arranque para comenzar a funcionar así la bomba de reserva.\n\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCaretPosition(1);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setKeymap(null);
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 33, 677, 289));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTROL Y CAMBIO A BOMBA DE RESPALDO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 416, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/sistemadeRefrigeracion2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 333, -1, 419));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/color.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 910, 760));

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
            java.util.logging.Logger.getLogger(ControlBomba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlBomba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlBomba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlBomba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlBomba().setVisible(true);
                ControlBomba control =new ControlBomba();
                control.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                   
                   //control.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
