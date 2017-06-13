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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre del Funcionario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cedula del Funcionario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombre del Gestor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Calificacion Arranque");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Tiempo");

        NombreOP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NombreOP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NombreOP.setEnabled(false);
        NombreOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreOPActionPerformed(evt);
            }
        });

        CedulaOP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CedulaOP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CedulaOP.setEnabled(false);

        NombreS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NombreS.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NombreS.setEnabled(false);

        CalificacionA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CalificacionA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA.setEnabled(false);

        TiempoA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TiempoA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA.setEnabled(false);

        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Calificacion Paro Normal");

        CalificacionA1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CalificacionA1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA1.setEnabled(false);

        TiempoA1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TiempoA1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA1.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Calificacion Paro Rapido");

        CalificacionA2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CalificacionA2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA2.setEnabled(false);

        TiempoA2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TiempoA2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA2.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Calificacion Paro de Emergencia");

        CalificacionA3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CalificacionA3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CalificacionA3.setEnabled(false);

        TiempoA3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TiempoA3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TiempoA3.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Registro EPM");

        Registro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Registro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Registro.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NombreS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CedulaOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CalificacionA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CalificacionA3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(CalificacionA2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CalificacionA1)))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TiempoA1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TiempoA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TiempoA2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TiempoA3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CedulaOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(NombreS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CalificacionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CalificacionA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CalificacionA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CalificacionA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

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