/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Evaluacion.Menu;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.itextpdf.text.Image;
import java.awt.Font;
import com.itextpdf.text.pdf.PdfPTable;
import empguadalupe.Menu.Evaluacion.Secuencias.ArranqueEva;
import empguadalupe.Menu.Menu1;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author lzambrs
 */
public class Resultado extends javax.swing.JFrame {

    String Rnom;
    String Rced;
    String RnombS;
    String RCalifA;
    int hora, min, seg;
    Date fecha;
    String tiempoA, tiempoA1, tiempoA2, tiempoA3;

    /**
     * Creates new form Resultado
     */
    public Resultado() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreOP = new javax.swing.JTextField();
        CedulaOP = new javax.swing.JTextField();
        NombreS = new javax.swing.JTextField();
        CalificacionA = new javax.swing.JTextField();
        TiempoA = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CalificacionA1 = new javax.swing.JTextField();
        TiempoA1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CalificacionA2 = new javax.swing.JTextField();
        TiempoA2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CalificacionA3 = new javax.swing.JTextField();
        TiempoA3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Registro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Funcionario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula del Funcionario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 62, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Gestor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calificacion Arranque");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 182, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiempo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 104, -1, -1));

        NombreOP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NombreOP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NombreOP.setEnabled(false);
        NombreOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreOPActionPerformed(evt);
            }
        });
        getContentPane().add(NombreOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 20, 120, -1));

        CedulaOP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CedulaOP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CedulaOP.setEnabled(false);
        getContentPane().add(CedulaOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 59, 120, -1));

        NombreS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NombreS.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NombreS.setEnabled(false);
        getContentPane().add(NombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 140, 120, -1));

        CalificacionA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CalificacionA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA.setEnabled(false);
        getContentPane().add(CalificacionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 179, 120, -1));

        TiempoA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TiempoA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA.setEnabled(false);
        getContentPane().add(TiempoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 179, 76, -1));

        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 339, 106, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Calificacion Paro Normal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 221, -1, -1));

        CalificacionA1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CalificacionA1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA1.setEnabled(false);
        getContentPane().add(CalificacionA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 218, 118, -1));

        TiempoA1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TiempoA1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA1.setEnabled(false);
        getContentPane().add(TiempoA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 218, 76, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Calificacion Paro Rapido");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 253, -1, -1));

        CalificacionA2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CalificacionA2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA2.setEnabled(false);
        getContentPane().add(CalificacionA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 250, 118, -1));

        TiempoA2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TiempoA2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA2.setEnabled(false);
        getContentPane().add(TiempoA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 250, 76, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Calificacion Paro de Emergencia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 292, -1, -1));

        CalificacionA3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CalificacionA3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA3.setEnabled(false);
        getContentPane().add(CalificacionA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 289, 118, -1));

        TiempoA3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TiempoA3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA3.setEnabled(false);
        getContentPane().add(TiempoA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 289, 76, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registro EPM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 104, -1, -1));

        Registro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Registro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Registro.setEnabled(false);
        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 101, 120, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/color.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreOPActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Metodos met = new Metodos();
        String[] cadena = new String[29];
        int j = 1;
        int cuantos = 4;
        try {
            cadena = met.muestraContenido(1);

            int i = Integer.parseInt(cadena[0]);

            while (j != i) {
                System.out.println(cadena[j]);
                j++;
            }

        } catch (IOException ex) {
            Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cadena[23] == null) {
            cuantos = 3;
        }
        if (cadena[17] == null) {
            cuantos = 2;
        }
        if (cadena[11] == null) {
            cuantos = 1;
        }

        NombreOP.setText(cadena[1]);
        NombreS.setText(cadena[2]);
        CedulaOP.setText(cadena[4]);
        Registro.setText(cadena[3]);
        switch (cuantos) {
            case 1:
                try {
                    comparar(5);
                } catch (IOException ex) {
                    Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                try {
                    comparar(5);
                    comparar(11);
                } catch (IOException ex) {
                    Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                try {
                    comparar(5);
                    comparar(11);
                    comparar(17);
                } catch (IOException ex) {
                    Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                try {
                    comparar(5);
                    comparar(11);
                    comparar(17);
                    comparar(23);
                } catch (IOException ex) {
                    Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }

    }//GEN-LAST:event_formWindowActivated

    public void comparar(int posicion) throws IOException {
        Metodos met = new Metodos();
        String[] cadena = new String[29];
        cadena = met.muestraContenido(1);
        if (cadena[posicion].equals("Arranque")) {
            tiempoA = cadena[posicion + 1] + ":" + cadena[posicion + 2] + ":" + cadena[posicion + 3];
            CalificacionA.setText(cadena[posicion + 4]);
            TiempoA.setText(tiempoA);
        }
        if (cadena[posicion].equals("Paro Normal")) {
            tiempoA1 = cadena[posicion + 1] + ":" + cadena[posicion + 2] + ":" + cadena[posicion + 3];
            CalificacionA1.setText(cadena[posicion + 4]);
            TiempoA1.setText(tiempoA1);
        }
        if (cadena[posicion].equals("Paro Rapido")) {
            tiempoA2 = cadena[posicion + 1] + ":" + cadena[posicion + 2] + ":" + cadena[posicion + 3];
            CalificacionA2.setText(cadena[posicion + 4]);
            TiempoA2.setText(tiempoA2);
        }
        if (cadena[posicion].equals("Paro Emergencia")) {
            tiempoA3 = cadena[posicion + 1] + ":" + cadena[posicion + 2] + ":" + cadena[posicion + 3];
            CalificacionA3.setText(cadena[posicion + 4]);
            TiempoA3.setText(tiempoA3);
        }
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        int dialogButton = JOptionPane.showConfirmDialog(rootPane, "DESEA HACER OTRA EVALUACION");
        TiempoA.setEditable(false);
        Metodos met = new Metodos();
        if (dialogButton == JOptionPane.YES_OPTION) {
            FormularioEvaluacion formu = new FormularioEvaluacion();
            formu.setVisible(true);
            met.eliminar(1);
        }
        if (dialogButton == JOptionPane.NO_OPTION) {
            Menu1 menu = new Menu1();
            menu.setVisible(true);
            met.eliminar(1);
        }

    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileOutputStream archivo = null;
        String nombrearchivo = NombreOP.getText() + "_" + CedulaOP.getText();

        try {
            archivo = new FileOutputStream(nombrearchivo + ".pdf");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Cierre la ventana del PDF para poder crear uno nuevo");
            return;
        }
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, archivo);
        } catch (DocumentException ex) {

        }
        documento.open();
        try {
            Image foto = Image.getInstance("src\\imgfondo\\thumbGRUPO20EPM20CON20CIERRE202013.jpg");
            foto.scaleToFit(150, 150);
            foto.setAlignment(Chunk.ALIGN_LEFT);
            documento.add(foto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

            documento.add(new Paragraph("RESULTADOS EVALUACION GENERAL",
                    FontFactory.getFont("arial", // fuente
                            27, // tamaño
                            Font.BOLD,
                            BaseColor.BLACK)));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            documento.add(new Paragraph("\r\n\r\n\r\n\r\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("Nombre del Funcionario:   " + NombreOP.getText() + "\r\n\r\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("Cedula del Funcionario:   " + CedulaOP.getText() + "\r\n\r\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("Registro EPM del Funcionario:   " + Registro.getText() + "\r\n\r\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("Nombre del Gestor:" + NombreS.getText() + "\r\n\r\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("\r\n\r\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            documento.add(new Paragraph("RESULTADOS ",
                    FontFactory.getFont("arial", // fuente
                            17, // tamaño
                            Font.BOLD,
                            BaseColor.BLACK)));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("\r\n\r\n" + "Arranque ",
                    FontFactory.getFont("arial", // fuente
                            15, // tamaño
                            Font.BOLD,
                            BaseColor.BLACK)));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            documento.add(new Paragraph("Numero de Intentos Negativos:   " + CalificacionA.getText() + "         " + "Tiempo:   " + tiempoA));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("\r\n\r\n" + "Paro Normal ",
                    FontFactory.getFont("arial", // fuente
                            15, // tamaño
                            Font.BOLD,
                            BaseColor.BLACK)));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            documento.add(new Paragraph("Numero de Intentos Negativos:   " + CalificacionA1.getText() + "         " + "Tiempo:   " + tiempoA1));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("\r\n\r\n" + "Paro Rapido ",
                    FontFactory.getFont("arial", // fuente
                            15, // tamaño
                            Font.BOLD,
                            BaseColor.BLACK)));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            documento.add(new Paragraph("Numero de Intentos Negativos:   " + CalificacionA2.getText() + "         " + "Tiempo:   " + tiempoA2));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            documento.add(new Paragraph("\r\n\r\n" + "Paro de Emergencia ",
                    FontFactory.getFont("arial", // fuente
                            15, // tamaño
                            Font.BOLD,
                            BaseColor.BLACK)));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            documento.add(new Paragraph("Numero de Intentos Negativos:   " + CalificacionA3.getText() + "         " + "Tiempo:" + tiempoA3));
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
        File path = new File(nombrearchivo + ".pdf");
        try {
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CalificacionA;
    private javax.swing.JTextField CalificacionA1;
    private javax.swing.JTextField CalificacionA2;
    private javax.swing.JTextField CalificacionA3;
    private javax.swing.JTextField CedulaOP;
    private javax.swing.JTextField NombreOP;
    private javax.swing.JTextField NombreS;
    private javax.swing.JTextField Registro;
    private javax.swing.JTextField TiempoA;
    private javax.swing.JTextField TiempoA1;
    private javax.swing.JTextField TiempoA2;
    private javax.swing.JTextField TiempoA3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
