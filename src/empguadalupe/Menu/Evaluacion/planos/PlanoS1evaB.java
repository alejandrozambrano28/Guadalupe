/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Evaluacion.planos;

import com.sun.glass.ui.Cursor;

import empguadalupe.Menu.Evaluacion.Secuencias.ArranqueEva;

import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lzambrs
 */
public class PlanoS1evaB extends javax.swing.JFrame implements ActionListener {

    int contErrores;
    int conPreguntas;
    boolean bande1 = false;
    boolean bande2 = false;
    boolean bande3 = false;
    boolean bande4 = false;
    boolean bande5 = false;
    boolean bande6 = false;
    boolean bande7 = false;
    boolean bande8 = false;
    boolean bande9 = false;
    boolean bande10 = false;
    boolean bande11 = false;
    boolean bande12 = false;
    boolean bande13 = false;
    boolean bande14 = false;
    boolean bande15 = false;
    boolean bande16 = false;
    boolean bande17 = false;
    boolean bande18 = false;
    int nument=0;
    String aa = "archivos\\error.png";

    /**
     * Creates new form PlanoBomba
     */
    public PlanoS1evaB(int numeroboton,int numentrada) {
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
                bande9 = true;
                bande10 = true;

                break;
            case 4:
                bande4 = true;
                bande11 = true;
                bande12 = true;

                break;
            case 5:
                bande5 = true;
                bande13 = true;
                bande14 = true;

                break;
            case 6:
                bande6 = true;
                bande17 = true;
                bande18 = true;

                break;
            case 7:
                bande7 = true;
                bande15 = true;
                bande16 = true;

                break;
            case 8:
                bande8 = true;

                break;
        }

    }

    private PlanoS1evaB() {
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
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmaquina/plano S1_1.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 460));

        btn1.setText("jButton1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 140));

        btn2.setText("jButton2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 120));

        btn3.setText("jButton3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 50, 40));

        btn4.setText("jButton4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 60, 50));

        btn5.setText("jButton5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 40, 40));

        btn6.setText("jButton6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 30));

        btn7.setText("jButton7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 90, 70));

        btn8.setText("jButton8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 353, 40, 30));

        btn9.setText("jButton3");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 50, 40));

        btn10.setText("jButton3");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 323, 50, 40));

        btn11.setText("jButton4");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 60, 50));

        btn12.setText("jButton4");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 60, 50));

        btn13.setText("jButton5");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 40, 40));

        btn14.setText("jButton5");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 40, 40));

        btn15.setText("jButton7");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 90, 70));

        btn16.setText("jButton7");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 100, 90, 70));

        btn17.setText("jButton6");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        getContentPane().add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, -1, 30));

        btn18.setText("jButton6");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        getContentPane().add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 373, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (bande1 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[29] = contErrores;
            arra.preguntas[29] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        contErrores = contErrores + 1;
        Image im = Toolkit.getDefaultToolkit().createImage(aa);
        java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
        setCursor(cur);
        try {
            Thread.sleep(300); // 1000 milisegundos (10 segundos)

        } catch (InterruptedException ex) {
            Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
    }//GEN-LAST:event_formMousePressed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (bande2 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[30] = contErrores;
            arra.preguntas[30] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        if (bande14 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[33] = contErrores;
            arra.preguntas[33] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        if (bande18 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[34+nument] = contErrores;
            arra.preguntas[34+nument] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (bande3 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[31] = contErrores;
            arra.preguntas[31] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (bande4 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[32] = contErrores;
            arra.preguntas[32] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        if (bande16 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[38] = contErrores;
            arra.preguntas[38] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (bande8 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[39+nument] = contErrores;
            arra.preguntas[39+nument] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (bande5 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[33] = contErrores;
            arra.preguntas[33] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (bande6 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[34+nument] = contErrores;
            arra.preguntas[34+nument] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (bande9 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[31] = contErrores;
            arra.preguntas[31] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:

    }//GEN-LAST:event_btn9ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        if (bande13 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[33] = contErrores;
            arra.preguntas[33] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if (bande11 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[32] = contErrores;
            arra.preguntas[32] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (bande7 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[38] = contErrores;
            arra.preguntas[38] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        if (bande17 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[34+nument] = contErrores;
            arra.preguntas[34+nument] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if (bande10 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[31] = contErrores;
            arra.preguntas[31] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if (bande12 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[32] = contErrores;
            arra.preguntas[32] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        if (bande15 == true) {
            ArranqueEva arra = new ArranqueEva();
            arra.pu2[38] = contErrores;
            arra.preguntas[38] = 1;
            JOptionPane.showMessageDialog(rootPane, "correcto");
            dispose();
        } else {

            Image im = Toolkit.getDefaultToolkit().createImage(aa);
            java.awt.Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(10, 10), "WILL");
            setCursor(cur);
            try {
                Thread.sleep(300); // 1000 milisegundos (10 segundos)

            } catch (InterruptedException ex) {
                Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setCursor(new java.awt.Cursor(Cursor.CURSOR_CUSTOM));
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn15ActionPerformed

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
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
