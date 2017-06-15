/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Evaluacion.Secuencias;

import empguadalupe.Menu.Aprendizaje.ParoEmergencia.*;
import empguadalupe.Menu.Evaluacion.Menu.Evaluacion;
import empguadalupe.Menu.Evaluacion.Menu.Metodos;
import empguadalupe.Menu.Evaluacion.planos.PlanoS1evaPE;
import empguadalupe.Menu.Evaluacion.planos.PlanoS2evaPE;
import empguadalupe.Menu.Evaluacion.planos.PlanoS3evaPE;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.green;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author lzambrs
 */
public class ParoEmergenciaEVA extends javax.swing.JFrame {

    Graphics g;
    int contador = 0;
    private Point location3, location4, location5, location6, location7, location8, location9, location10, location11, location12;
    private Point location13, location14, location15, location16, location17, location18, location19;
    Color color;
    private Point p;
    private Point pl;
    private int lx, ly;
    boolean calcular_diferencia = true;
    Point loc;
    int contgeneral = 0;
    int num = 0;
    int[] ubica = new int[24];
    boolean superbande = false;
    boolean bande1 = true;
    boolean bande2 = true;
    boolean bande3 = true;
    boolean bande4 = true;
    boolean bande5 = true;
    boolean bande6 = true;
    boolean bande7 = true;
    boolean bande8 = true;
    boolean bande9 = true;
    boolean bande10 = true;
    boolean bande11 = true;
    boolean bande12 = true;
    boolean bande13 = true;
    boolean bande14 = true;
    boolean bande15 = true;
    boolean bande16 = true;
    boolean bande17 = true;
    boolean bande18 = true;
    boolean bande19 = true;
    boolean bbande1 = false;
    boolean bbande2 = false;
    boolean bbande3 = false;
    boolean bbande4 = false;
    boolean bbande5 = false;
    boolean bbande6 = false;
    boolean bbande7 = false;
    boolean bbande8 = false;
    boolean bbande9 = false;
    boolean bbande10 = false;
    boolean bbande11 = false;
    boolean bbande12 = false;
    boolean bbande13 = false;
    boolean bbande14 = false;
    boolean bbande15 = false;
    boolean bbande16 = false;
    boolean bbande17 = false;
    boolean bbande18 = false;
    boolean bbande19 = false;
    int contPreguntas;
    int totalPreguntas = 67;
    int contGError = 24;
    public static int[] pu2 = new int[67];
    public static int[] preguntas = new int[67];
    int dia, mes, año, hora, minutos, segundos;
    int Segundo, Minuto, Hora, cuantos;
    Calendar calendario;
    Timer timer;
    boolean bandet = false;

    Rectangle rec1, rec2, rec3, rec4, rec5, rec6, rec7, rec8, rec9, rec10, rec11, rec12, rec13, rec14, rec15, rec16, rec17, rec18, rec19;

    /**
     * Creates new form Vista
     */
    public ParoEmergenciaEVA() {
        initComponents();
        this.setResizable(false);
        //envia a todos los botones correct que iluminan cuando es correcta el color negro 
        convertiranegro();
        correct3.setBackground(black);
        correct4.setBackground(black);
        correct5.setBackground(black);
        correct6.setBackground(black);
        correct7.setBackground(black);
        correct8.setBackground(black);
        correct9.setBackground(black);
        correct10.setBackground(black);
        correct11.setBackground(black);
        correct12.setBackground(black);
        correct13.setBackground(black);
        correct14.setBackground(black);
        correct15.setBackground(black);
        correct16.setBackground(black);
        correct17.setBackground(black);
        correct18.setBackground(black);
        correct19.setBackground(black);

//define el tamaño de cada recuandro hembra 
        rec3 = label3.getBounds();
        rec4 = label4.getBounds();
        rec5 = label5.getBounds();
        rec6 = label6.getBounds();
        rec7 = label7.getBounds();
        rec8 = label8.getBounds();
        rec9 = label9.getBounds();
        rec10 = label10.getBounds();
        rec11 = label11.getBounds();
        rec12 = label12.getBounds();
        rec13 = label13.getBounds();
        rec14 = label14.getBounds();
        rec15 = label15.getBounds();
        rec16 = label16.getBounds();
        rec17 = label17.getBounds();
        rec18 = label18.getBounds();
        rec19 = label19.getBounds();

//ubica da la posicion donde tiene que estar el boton macho, esto estan en pixeles de manera vertical        
        ubica[0] = 210;
        ubica[1] = 240;
        ubica[2] = 270;
        ubica[3] = 300;
        ubica[4] = 330;
        ubica[5] = 360;
        ubica[6] = 390;
        ubica[7] = 420;
        ubica[8] = 450;
        ubica[9] = 480;
        ubica[10] = 510;
        ubica[11] = 540;
        ubica[12] = 570;
        ubica[13] = 600;
        ubica[14] = 630;
        ubica[15] = 660;
        ubica[16] = 690;
        ubica[17] = 720;

//desactiva todos los botones macho
        color = boton17.getBackground();
        boton17.setEnabled(false);
        boton16.setEnabled(false);
        boton18.setEnabled(false);
        boton13.setEnabled(false);
        boton10.setEnabled(false);
        boton19.setEnabled(false);
        boton9.setEnabled(false);
        boton5.setEnabled(false);
        boton6.setEnabled(false);
        boton8.setEnabled(false);
        boton4.setEnabled(false);
        boton15.setEnabled(false);
        boton11.setEnabled(false);
        boton12.setEnabled(false);
        boton14.setEnabled(false);
        boton3.setEnabled(false);
        boton7.setEnabled(false);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParoEmergenciaEVA().setVisible(true);
            }
        });
    }

    //crea numeros aleatorios para poner los botones en diferentes posiciones
    public static Stack<Integer> generaNumeroAleatorio(int minimo, int maximo) {
        int pos;
        int nCartas = 17;
        Stack< Integer> pCartas = new Stack< Integer>();
        for (int i = 0; i < nCartas; i++) {
            pos = (int) Math.floor(Math.random() * nCartas);
            while (pCartas.contains(pos)) {
                pos = (int) Math.floor(Math.random() * nCartas);
            }
            pCartas.push(pos);
        }
        return pCartas;
    }

    //metodo para ajustar el boton en el label indicado en la izquierda
    public int[] tamañoIz(javax.swing.JLabel label) {
        int posmenorx, posmayorx;
        int posmenory, posmayory;
        Rectangle a = label.getBounds();
        int[] tamaño = new int[4];
        posmenorx = a.x - 20;
        posmayorx = a.x + 20;
        posmenory = a.y - 10;
        posmayory = a.y + 20;
        tamaño[0] = posmenorx;
        tamaño[1] = posmayorx;
        tamaño[2] = posmenory;
        tamaño[3] = posmayory;
        return tamaño;
    }

    //metodo para ajustar el boton en el label indicado en la izquierda
    public int[] tamaño(javax.swing.JLabel label) {
        int posmenorx, posmayorx;
        int posmenory, posmayory;
        Rectangle a = label.getBounds();
        int[] tamaño = new int[4];
        posmenorx = a.x - 20;
        posmayorx = a.x + 20;
        posmenory = a.y - 20;
        posmayory = a.y + 20;
        tamaño[0] = posmenorx;
        tamaño[1] = posmayorx;
        tamaño[2] = posmenory;
        tamaño[3] = posmayory;
        return tamaño;
    }

    public void mover(JButton boton) {
//calculo la posición del ratón y lo guardo en el p
        p = MouseInfo.getPointerInfo().getLocation();
        //este if solo se ejecuta al principio de que empiece a mover la etiqueta
        if (calcular_diferencia) {
            //calculo la posición de la etiqueta
            pl = boton.getLocation();
            //guardo la diferencia entre la posición del ratón y de la etiqueta
            lx = p.x - pl.x;
            ly = p.y - pl.y;
        }
        //ponemos false el calculo para que no lo vuelva a calcular otra vez
        calcular_diferencia = false;
        //cambio la posición de la etiqueta a la posición del ratón menos la diferencia calculada
        boton.setLocation(p.x - lx, p.y - ly);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        correct3 = new javax.swing.JButton();
        correct4 = new javax.swing.JButton();
        correct5 = new javax.swing.JButton();
        correct6 = new javax.swing.JButton();
        correct7 = new javax.swing.JButton();
        correct8 = new javax.swing.JButton();
        correct9 = new javax.swing.JButton();
        correct10 = new javax.swing.JButton();
        correct11 = new javax.swing.JButton();
        correct12 = new javax.swing.JButton();
        correct13 = new javax.swing.JButton();
        correct14 = new javax.swing.JButton();
        correct15 = new javax.swing.JButton();
        correct16 = new javax.swing.JButton();
        correct17 = new javax.swing.JButton();
        correct18 = new javax.swing.JButton();
        correct19 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        ParoEMERGENCIA = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        Plabel2 = new javax.swing.JLabel();
        Plabel1 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label19 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        Plabel4 = new javax.swing.JLabel();
        Plabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        Plabel6 = new javax.swing.JLabel();
        Plabel5 = new javax.swing.JLabel();
        Plabel9 = new javax.swing.JLabel();
        Plabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        boton17 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton19 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        boton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Plabel10 = new javax.swing.JLabel();
        label18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Plabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Plabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Reloj = new javax.swing.JTextField();
        icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Secuencia de Arranque\n");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/thumbGRUPO20EPM20CON20CIERRE202013.jpg"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(0, 0, 170, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(680, 170, 70, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1020, 170, 70, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1020, 240, 60, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("5");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(700, 340, 60, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("6");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(700, 420, 60, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("7");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(700, 500, 60, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("8");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(700, 570, 60, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/rombooff.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(680, 60, 70, 60);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CONDICION PREVIA LISTO");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(460, 90, 164, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("2");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 180, 60, 40);

        correct3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct3);
        correct3.setBounds(650, 180, 20, 20);

        correct4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct4);
        correct4.setBounds(270, 190, 20, 20);

        correct5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct5);
        correct5.setBounds(990, 180, 20, 20);

        correct6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct6);
        correct6.setBounds(990, 250, 20, 20);

        correct7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct7);
        correct7.setBounds(670, 370, 20, 20);

        correct8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct8);
        correct8.setBounds(670, 340, 20, 20);

        correct9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct9);
        correct9.setBounds(670, 420, 20, 20);

        correct10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        correct10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correct10ActionPerformed(evt);
            }
        });
        jPanel1.add(correct10);
        correct10.setBounds(670, 450, 20, 20);

        correct11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct11);
        correct11.setBounds(770, 420, 20, 20);

        correct12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct12);
        correct12.setBounds(670, 510, 20, 20);

        correct13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct13);
        correct13.setBounds(670, 580, 20, 20);

        correct14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        correct14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correct14ActionPerformed(evt);
            }
        });
        jPanel1.add(correct14);
        correct14.setBounds(670, 640, 20, 20);

        correct15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct15);
        correct15.setBounds(670, 710, 20, 20);

        correct16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct16);
        correct16.setBounds(670, 780, 20, 20);

        correct17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct17);
        correct17.setBounds(670, 810, 20, 20);

        correct18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        correct18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correct18ActionPerformed(evt);
            }
        });
        jPanel1.add(correct18);
        correct18.setBounds(770, 780, 20, 20);

        correct19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct19);
        correct19.setBounds(770, 810, 20, 20);

        titulo.setBackground(new java.awt.Color(60, 188, 28));
        titulo.setFont(new java.awt.Font("Verdana", 1, 34)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SECUENCIA DE PARO EMERGENCIA UNIDAD 1-2-3 GUADALUPE IV");
        titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 0), null, null));
        titulo.setOpaque(true);
        jPanel1.add(titulo);
        titulo.setBounds(170, 0, 1270, 50);

        ParoEMERGENCIA.setText("SECUENCIA PARO RAPIDO");
        ParoEMERGENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParoEMERGENCIAActionPerformed(evt);
            }
        });
        jPanel1.add(ParoEMERGENCIA);
        ParoEMERGENCIA.setBounds(1130, 60, 210, 23);

        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label8);
        label8.setBounds(630, 340, 20, 20);

        label17.setForeground(new java.awt.Color(255, 255, 255));
        label17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label17);
        label17.setBounds(630, 810, 20, 20);

        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label16);
        label16.setBounds(630, 780, 20, 20);

        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label13);
        label13.setBounds(630, 580, 20, 20);

        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label10);
        label10.setBounds(630, 450, 20, 20);

        Plabel2.setBackground(new java.awt.Color(0, 0, 0));
        Plabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel2.setForeground(new java.awt.Color(255, 255, 255));
        Plabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel2.setOpaque(true);
        jPanel1.add(Plabel2);
        Plabel2.setBounds(640, 160, 130, 60);

        Plabel1.setBackground(new java.awt.Color(0, 0, 0));
        Plabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel1.setForeground(new java.awt.Color(255, 255, 255));
        Plabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel1.setOpaque(true);
        jPanel1.add(Plabel1);
        Plabel1.setBounds(260, 170, 110, 60);

        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label5);
        label5.setBounds(950, 180, 20, 20);

        label19.setForeground(new java.awt.Color(255, 255, 255));
        label19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label19);
        label19.setBounds(810, 810, 20, 20);

        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label9);
        label9.setBounds(630, 420, 20, 20);

        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label6);
        label6.setBounds(950, 250, 20, 20);

        label7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label7);
        label7.setBounds(630, 370, 20, 20);

        Plabel4.setBackground(new java.awt.Color(0, 0, 0));
        Plabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel4.setForeground(new java.awt.Color(255, 255, 255));
        Plabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel4.setOpaque(true);
        jPanel1.add(Plabel4);
        Plabel4.setBounds(980, 230, 140, 60);

        Plabel3.setBackground(new java.awt.Color(0, 0, 0));
        Plabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel3.setForeground(new java.awt.Color(255, 255, 255));
        Plabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel3.setOpaque(true);
        jPanel1.add(Plabel3);
        Plabel3.setBounds(980, 160, 140, 60);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1350, 60, 80, 23);

        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label4);
        label4.setBounds(230, 190, 20, 20);

        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label15);
        label15.setBounds(630, 710, 20, 20);

        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label11);
        label11.setBounds(810, 420, 20, 20);

        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label12);
        label12.setBounds(630, 510, 20, 20);

        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label14);
        label14.setBounds(630, 640, 20, 20);

        Plabel6.setBackground(new java.awt.Color(0, 0, 0));
        Plabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel6.setForeground(new java.awt.Color(255, 255, 255));
        Plabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel6.setOpaque(true);
        jPanel1.add(Plabel6);
        Plabel6.setBounds(660, 410, 140, 70);

        Plabel5.setBackground(new java.awt.Color(0, 0, 0));
        Plabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel5.setForeground(new java.awt.Color(255, 255, 255));
        Plabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel5.setOpaque(true);
        jPanel1.add(Plabel5);
        Plabel5.setBounds(660, 330, 140, 70);

        Plabel9.setBackground(new java.awt.Color(0, 0, 0));
        Plabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel9.setForeground(new java.awt.Color(255, 255, 255));
        Plabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel9.setOpaque(true);
        jPanel1.add(Plabel9);
        Plabel9.setBounds(660, 560, 140, 60);

        Plabel7.setBackground(new java.awt.Color(0, 0, 0));
        Plabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel7.setForeground(new java.awt.Color(255, 255, 255));
        Plabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel7.setOpaque(true);
        jPanel1.add(Plabel7);
        Plabel7.setBounds(660, 490, 140, 60);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/rombooff.png"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(690, 850, 70, 50);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PARO");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(630, 860, 50, 17);

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label3);
        label3.setBounds(610, 180, 20, 20);

        boton17.setBackground(new java.awt.Color(0, 0, 0));
        boton17.setForeground(new java.awt.Color(255, 255, 255));
        boton17.setText("BOMBA DE REFRIGERACION OFF");
        boton17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton17MouseDragged(evt);
            }
        });
        boton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton17MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton17MouseReleased(evt);
            }
        });
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });
        jPanel1.add(boton17);
        boton17.setBounds(1130, 360, 240, 23);

        boton16.setBackground(new java.awt.Color(0, 0, 0));
        boton16.setForeground(new java.awt.Color(255, 255, 255));
        boton16.setText("VALVULA DE AISLAMIENTO CERRADA");
        boton16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton16MouseDragged(evt);
            }
        });
        boton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton16MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton16MouseReleased(evt);
            }
        });
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });
        jPanel1.add(boton16);
        boton16.setBounds(1130, 270, 260, 23);

        boton18.setBackground(new java.awt.Color(0, 0, 0));
        boton18.setForeground(new java.awt.Color(255, 255, 255));
        boton18.setText("JUNTA INFLABLE OPERACION APLICADA");
        boton18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton18MouseDragged(evt);
            }
        });
        boton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton18MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton18MouseReleased(evt);
            }
        });
        boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton18ActionPerformed(evt);
            }
        });
        jPanel1.add(boton18);
        boton18.setBounds(1130, 480, 280, 23);

        boton10.setBackground(new java.awt.Color(0, 0, 0));
        boton10.setForeground(new java.awt.Color(255, 255, 255));
        boton10.setText("VALVULA ESFERICA CERRADA");
        boton10.setFocusable(false);
        boton10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton10MouseDragged(evt);
            }
        });
        boton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton10MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton10MouseReleased(evt);
            }
        });
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });
        jPanel1.add(boton10);
        boton10.setBounds(1130, 210, 230, 23);

        boton13.setBackground(new java.awt.Color(0, 0, 0));
        boton13.setForeground(new java.awt.Color(255, 255, 255));
        boton13.setText("FRENOS APLICADOS");
        boton13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton13MouseDragged(evt);
            }
        });
        boton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton13MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton13MouseReleased(evt);
            }
        });
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });
        jPanel1.add(boton13);
        boton13.setBounds(1130, 240, 150, 23);

        boton9.setBackground(new java.awt.Color(0, 0, 0));
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setText("LUBRICACION FORZADA ON");
        boton9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton9MouseDragged(evt);
            }
        });
        boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton9MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton9MouseReleased(evt);
            }
        });
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        jPanel1.add(boton9);
        boton9.setBounds(1130, 300, 190, 23);

        boton19.setBackground(new java.awt.Color(0, 0, 0));
        boton19.setForeground(new java.awt.Color(255, 255, 255));
        boton19.setText("FRENOS DESAPLICADOS");
        boton19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton19.setDefaultCapable(false);
        boton19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton19MouseDragged(evt);
            }
        });
        boton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton19MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton19MouseReleased(evt);
            }
        });
        boton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton19ActionPerformed(evt);
            }
        });
        jPanel1.add(boton19);
        boton19.setBounds(1130, 330, 180, 23);

        boton5.setBackground(new java.awt.Color(0, 0, 0));
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setText("REGULADOR BLOQUEADO");
        boton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton5MouseDragged(evt);
            }
        });
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton5MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton5MouseReleased(evt);
            }
        });
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        jPanel1.add(boton5);
        boton5.setBounds(1130, 420, 190, 23);

        boton6.setBackground(new java.awt.Color(0, 0, 0));
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setText("REGULADOR DESENERGIZADO");
        boton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton6MouseDragged(evt);
            }
        });
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton6MouseReleased(evt);
            }
        });
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        jPanel1.add(boton6);
        boton6.setBounds(1130, 390, 220, 23);

        boton8.setBackground(new java.awt.Color(0, 0, 0));
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setText("VELOCIDAD <90%");
        boton8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton8MouseDragged(evt);
            }
        });
        boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton8MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton8MouseReleased(evt);
            }
        });
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        jPanel1.add(boton8);
        boton8.setBounds(1130, 450, 160, 23);

        boton4.setBackground(new java.awt.Color(0, 0, 0));
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setText("INTERRUPTOR DE CAMPO ABIERTO");
        boton4.setFocusable(false);
        boton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton4MouseDragged(evt);
            }
        });
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton4MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton4MouseReleased(evt);
            }
        });
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jPanel1.add(boton4);
        boton4.setBounds(1130, 510, 240, 23);

        boton15.setBackground(new java.awt.Color(0, 0, 0));
        boton15.setForeground(new java.awt.Color(255, 255, 255));
        boton15.setText("LUBRICACION FORZADA OFF");
        boton15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton15MouseDragged(evt);
            }
        });
        boton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton15MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton15MouseReleased(evt);
            }
        });
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });
        jPanel1.add(boton15);
        boton15.setBounds(1130, 540, 210, 23);

        boton11.setBackground(new java.awt.Color(0, 0, 0));
        boton11.setForeground(new java.awt.Color(255, 255, 255));
        boton11.setText("POSICION DE DISTRIBUIDOR 0%");
        boton11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton11MouseDragged(evt);
            }
        });
        boton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton11MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton11MouseReleased(evt);
            }
        });
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });
        jPanel1.add(boton11);
        boton11.setBounds(1130, 570, 220, 20);

        boton12.setBackground(new java.awt.Color(0, 0, 0));
        boton12.setForeground(new java.awt.Color(255, 255, 255));
        boton12.setText("VELOCIDAD MENOR 10%");
        boton12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton12MouseDragged(evt);
            }
        });
        boton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton12MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton12MouseReleased(evt);
            }
        });
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });
        jPanel1.add(boton12);
        boton12.setBounds(1130, 600, 180, 20);

        boton14.setBackground(new java.awt.Color(0, 0, 0));
        boton14.setForeground(new java.awt.Color(255, 255, 255));
        boton14.setText("VELOCIDAD MENOR 1%");
        boton14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton14MouseDragged(evt);
            }
        });
        boton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton14MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton14MouseReleased(evt);
            }
        });
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });
        jPanel1.add(boton14);
        boton14.setBounds(1130, 630, 180, 20);

        boton3.setBackground(new java.awt.Color(0, 0, 0));
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setText("INTERRUPTOR GENERADOR ABIERTO");
        boton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton3MouseDragged(evt);
            }
        });
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton3MouseReleased(evt);
            }
        });
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton3);
        boton3.setBounds(1130, 660, 250, 23);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Y");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(680, 280, 70, 40);

        boton7.setBackground(new java.awt.Color(0, 0, 0));
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setText("LIM APERTURA DISTRIBUIDOR 0%");
        boton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton7MouseDragged(evt);
            }
        });
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton7MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton7MouseReleased(evt);
            }
        });
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        jPanel1.add(boton7);
        boton7.setBounds(1130, 690, 250, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("9");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(700, 640, 60, 40);

        Plabel10.setBackground(new java.awt.Color(0, 0, 0));
        Plabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel10.setForeground(new java.awt.Color(255, 255, 255));
        Plabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel10.setOpaque(true);
        jPanel1.add(Plabel10);
        Plabel10.setBounds(660, 630, 140, 60);

        label18.setForeground(new java.awt.Color(255, 255, 255));
        label18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label18);
        label18.setBounds(810, 780, 20, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("11");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(700, 780, 60, 50);

        Plabel11.setBackground(new java.awt.Color(0, 0, 0));
        Plabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel11.setForeground(new java.awt.Color(255, 255, 255));
        Plabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel11.setOpaque(true);
        jPanel1.add(Plabel11);
        Plabel11.setBounds(660, 770, 140, 70);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("10");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(700, 710, 60, 40);

        Plabel12.setBackground(new java.awt.Color(0, 0, 0));
        Plabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel12.setForeground(new java.awt.Color(255, 255, 255));
        Plabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel12.setOpaque(true);
        jPanel1.add(Plabel12);
        Plabel12.setBounds(660, 700, 140, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEA.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(750, 290, 260, 20);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEA.png"))); // NOI18N
        jLabel19.setText("jLabel5");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(300, 120, 740, 20);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEA.png"))); // NOI18N
        jLabel20.setText("jLabel5");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(300, 290, 380, 20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEAVERTICAL.png"))); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(1010, 280, 10, 20);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEAVERTICAL.png"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(300, 130, 10, 40);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEAVERTICAL.png"))); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(710, 220, 10, 60);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEAVERTICAL.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(300, 230, 10, 70);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEAVERTICAL.png"))); // NOI18N
        jPanel1.add(jLabel25);
        jLabel25.setBounds(1020, 130, 10, 40);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEAVERTICAL.png"))); // NOI18N
        jPanel1.add(jLabel26);
        jLabel26.setBounds(710, 220, 10, 60);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/LINEAVERTICAL.png"))); // NOI18N
        jPanel1.add(jLabel27);
        jLabel27.setBounds(710, 120, 10, 40);

        jButton1.setText("PUNTUACIÓN");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 430, 140, 23);

        Reloj.setFont(new java.awt.Font("BankGothic Md BT", 0, 48)); // NOI18N
        Reloj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Reloj.setText("00:00:00");
        jPanel1.add(Reloj);
        Reloj.setBounds(90, 530, 310, 120);

        icono.setBackground(new java.awt.Color(153, 212, 94));
        icono.setForeground(new java.awt.Color(255, 255, 255));
        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfondo/color.png"))); // NOI18N
        icono.setToolTipText("");
        icono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(icono);
        icono.setBounds(-30, 0, 1490, 920);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//boton principal para arrancar la secuencia de ParoEmergencia
    private void ParoEMERGENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParoEMERGENCIAActionPerformed
        Segundo = 0;
        Minuto = 0;
        Hora = 0;
        calendario = new GregorianCalendar();
        jButton1.setEnabled(true);
        if (bandet == true) {
            timer.restart();
            bandet = false;
        } else {
            timer = new Timer(1000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    java.util.Date actual = new java.util.Date();

                    if (Segundo != 59) {
                        Segundo = Segundo + 1;

                    } else if (Minuto != 59) {
                        Minuto = Minuto + 1;
                        Segundo = 0;
                    } else {
                        Hora = Hora + 1;
                        Minuto = 0;
                    }

                    calendario.setTime(actual);
                    dia = calendario.get(Calendar.DAY_OF_MONTH);
                    mes = (calendario.get(Calendar.MONTH) + 1);
                    año = calendario.get(Calendar.YEAR);
                    hora = calendario.get(Calendar.HOUR_OF_DAY);
                    minutos = calendario.get(Calendar.MINUTE);
                    segundos = calendario.get(Calendar.SECOND);
                    String hour = String.format("%02d : %02d : %02d", Hora, Minuto, Segundo);
                    Reloj.setText("<html><center>" + hour);
                }
            });
            timer.start();
        }
        bandet = true;
        bbande1 = false;
        bbande2 = false;
        bbande3 = false;
        bbande4 = false;
        bbande5 = false;
        bbande6 = false;
        bbande7 = false;
        bbande8 = false;
        bbande9 = false;
        bbande10 = false;
        bbande11 = false;
        bbande12 = false;
        bbande13 = false;
        bbande14 = false;
        bbande15 = false;
        bbande16 = false;
        bbande17 = false;
        bbande18 = false;
        bbande19 = false;
        //coloca los botones macho en orden aleatorio (el 1130 es la posicion de manera horizontal en pixeles)
        convertiranegro();
        Stack<Integer> numero = generaNumeroAleatorio(170, 700);
        contador = 0;
        contgeneral = 0;
        CondicionesInicialesParoEM condi = new CondicionesInicialesParoEM();
        condi.setVisible(true);
        condi.setLocationRelativeTo(null);
        int num0 = numero.get(0);
        boton3.setLocation(1130, ubica[num0]);
        boton3.setBackground(color);
        int num1 = numero.get(1);
        boton4.setLocation(1130, ubica[num1]);
        boton4.setBackground(color);
        int num2 = numero.get(2);
        boton5.setLocation(1130, ubica[num2]);
        boton5.setBackground(color);
        int num3 = numero.get(3);
        boton6.setLocation(1130, ubica[num3]);
        boton6.setBackground(color);
        int num4 = numero.get(4);
        boton7.setLocation(1130, ubica[num4]);
        boton7.setBackground(color);
        int num5 = numero.get(5);
        boton8.setLocation(1130, ubica[num5]);
        boton8.setBackground(color);
        int num6 = numero.get(6);
        boton9.setLocation(1130, ubica[num6]);
        boton9.setBackground(color);
        int num7 = numero.get(7);
        boton10.setLocation(1130, ubica[num7]);
        boton10.setBackground(color);
        int num8 = numero.get(8);
        boton11.setLocation(1130, ubica[num8]);
        boton11.setBackground(color);
        int num9 = numero.get(9);
        boton12.setLocation(1130, ubica[num9]);
        boton12.setBackground(color);
        int num10 = numero.get(10);
        boton13.setLocation(1130, ubica[num10]);
        boton13.setBackground(color);
        int num11 = numero.get(11);
        boton14.setLocation(1130, ubica[num11]);
        boton14.setBackground(color);
        int num12 = numero.get(12);
        boton15.setLocation(1130, ubica[num12]);
        boton15.setBackground(color);
        int num13 = numero.get(13);
        boton16.setLocation(1130, ubica[num13]);
        boton16.setBackground(color);
        int num14 = numero.get(14);
        boton17.setLocation(1130, ubica[num14]);
        boton17.setBackground(color);
        int num15 = numero.get(15);
        boton18.setLocation(1130, ubica[num15]);
        boton18.setBackground(color);
        int num16 = numero.get(16);
        boton19.setLocation(1130, ubica[num16]);
        boton19.setBackground(color);
        //envia los label a la posicion antes definida 
        label3.setBounds(rec3);
        label4.setBounds(rec4);
        label5.setBounds(rec5);
        label6.setBounds(rec6);
        label7.setBounds(rec7);
        label8.setBounds(rec8);
        label9.setBounds(rec9);
        label10.setBounds(rec10);
        label11.setBounds(rec11);
        label12.setBounds(rec12);
        label13.setBounds(rec13);
        label14.setBounds(rec14);
        label15.setBounds(rec15);
        label16.setBounds(rec16);
        label17.setBounds(rec17);
        label18.setBounds(rec18);
        label19.setBounds(rec19);
        //trae la locacion de lo botones machos  
        location3 = boton3.getLocation();
        location4 = boton4.getLocation();
        location5 = boton5.getLocation();
        location6 = boton6.getLocation();
        location7 = boton7.getLocation();
        location8 = boton8.getLocation();
        location9 = boton9.getLocation();
        location10 = boton10.getLocation();
        location11 = boton11.getLocation();
        location12 = boton12.getLocation();
        location13 = boton13.getLocation();
        location14 = boton14.getLocation();
        location15 = boton15.getLocation();
        location16 = boton16.getLocation();
        location17 = boton17.getLocation();
        location18 = boton18.getLocation();
        location19 = boton19.getLocation();

        bande3 = true;
        bande4 = true;
        bande5 = true;
        bande6 = true;
        bande7 = true;
        bande8 = true;
        bande9 = true;
        bande10 = true;
        bande11 = true;
        bande12 = true;
        bande13 = true;
        bande14 = true;
        bande15 = true;
        bande16 = true;
        bande17 = true;
        bande18 = true;
        bande19 = true;

        boton17.setEnabled(true);
        boton16.setEnabled(true);
        boton18.setEnabled(true);
        boton13.setEnabled(true);
        boton10.setEnabled(true);
        boton19.setEnabled(true);
        boton9.setEnabled(true);
        boton5.setEnabled(true);
        boton6.setEnabled(true);
        boton8.setEnabled(true);
        boton7.setEnabled(true);
        boton3.setEnabled(true);
        boton14.setEnabled(true);
        boton12.setEnabled(true);
        boton11.setEnabled(true);
        boton15.setEnabled(true);
        boton4.setEnabled(true);
        superbande = true;
    }//GEN-LAST:event_ParoEMERGENCIAActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Evaluacion eva = new Evaluacion();
        eva.setVisible(true);
        eva.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton17MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MouseDragged

        if (bande17 = true) {
            mover(boton17);
        }

    }//GEN-LAST:event_boton17MouseDragged

    private void boton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MouseEntered
        if (boton17.getBackground() != green) {
            boton17.setBackground(color);
        }
    }//GEN-LAST:event_boton17MouseEntered

    private void boton17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MouseReleased
        if (superbande == true) {
            if (bande17 == true) {
                int tam[];
                //ubicacion del puntero en el presiso momento
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton17.getBounds();
                tam = tamaño(label17);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 13)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[17] = 1;
                    bbande17 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton17.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label17.setSize(boton17.getWidth(), boton17.getHeight());
                    label17.setLocation(tam[1] - a.width, tam[3] - a.height);
                    correct17.setBackground(Color.green);
                    bande17 = false;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(1,1);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton17.setLocation(location17);
                    boton17.setBackground(Color.red);
                    //codigo para la generacion del sonido
                    generarsonido();
                    pu2[17] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton17MouseReleased

    private void boton16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MouseDragged

        if (bande16 = true) {
            mover(boton16);
        }

    }//GEN-LAST:event_boton16MouseDragged

    private void boton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MouseEntered
        if (boton16.getBackground() != green) {
            boton16.setBackground(color);
        }
    }//GEN-LAST:event_boton16MouseEntered

    private void boton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MousePressed
        calcular_diferencia = true;
    }//GEN-LAST:event_boton16MousePressed

    private void boton16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MouseReleased
        if (superbande == true) {
            if (bande16 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton16.getBounds();
                tam = tamaño(label16);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 13)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[16] = 1;
                    bbande16 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton16.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label16.setSize(boton16.getWidth(), boton16.getHeight());
                    label16.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande16 = false;
                    //boton2.setBackground(Color.green);
                    correct16.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(3,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton16.setLocation(location16);
                    //codigo para el cambio de color del boton
                    boton16.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[16] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton16MouseReleased

    private void boton18MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton18MouseDragged

        if (bande18 = true) {
            mover(boton18);
        }

    }//GEN-LAST:event_boton18MouseDragged

    private void boton18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton18MouseEntered
        if (boton18.getBackground() != green) {
            boton18.setBackground(color);
        }// TODO add your handling code here:
    }//GEN-LAST:event_boton18MouseEntered

    private void boton18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton18MousePressed
        calcular_diferencia = true;
    }//GEN-LAST:event_boton18MousePressed

    private void boton18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton18MouseReleased
        if (superbande == true) {
            if (bande18 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton18.getBounds();
                tam = tamañoIz(label18);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 13)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[18] = 1;
                    bbande18 = true;
                    //(tam[0], tam[2] - 12)
                    //(tam[1] - a.width , tam[3] - a.height - 20)
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton18.setLocation(tam[0], tam[2] - 12);
                    System.out.println("correcto");
                    label18.setSize(boton18.getWidth(), boton18.getHeight());
                    label18.setLocation(tam[0], tam[2] - 12);
                    bande18 = false;
                    //boton4.setBackground(Color.green);
                    correct18.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(5,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);

                } else {
                    System.out.println("incorrecto");
                    boton18.setLocation(location18);
                    //codigo para el cambio de color del boton
                    boton18.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[18] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton18MouseReleased

    private void boton10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton10MouseDragged

        if (bande10 = true) {
            mover(boton10);
        }

    }//GEN-LAST:event_boton10MouseDragged

    private void boton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton10MouseEntered
        if (boton10.getBackground() != green) {
            boton10.setBackground(color);
        }
    }//GEN-LAST:event_boton10MouseEntered

    private void boton10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton10MouseReleased
        if (superbande == true) {
            if (bande10 == true) {

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton10.getBounds();
                tam = tamaño(label10);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 6)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[10] = 1;
                    bbande10 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton10.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label10.setSize(boton10.getWidth(), boton10.getHeight());
                    label10.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande10 = false;
                    //boton7.setBackground(Color.green);
                    correct10.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(7,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {

                    System.out.println("incorrecto");
                    boton10.setLocation(location10);
                    //codigo para el cambio de color del boton
                    boton10.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[10] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton10MouseReleased

    private void boton13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton13MouseDragged

        if (bande13 = true) {
            mover(boton13);
        }

    }//GEN-LAST:event_boton13MouseDragged

    private void boton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton13MouseEntered
        if (boton13.getBackground() != green) {
            boton13.setBackground(color);
        }
    }//GEN-LAST:event_boton13MouseEntered

    private void boton13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton13MouseReleased
        if (superbande == true) {
            if (bande13 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton13.getBounds();
                tam = tamaño(label13);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 10)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[13] = 1;
                    bbande13 = true;
                    //(tam[0], tam[2] - 12)
                    //(tam[1] - a.width - 20, tam[3] - a.height - 20)
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton13.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label13.setSize(boton13.getWidth(), boton13.getHeight());
                    label13.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande13 = false;
                    //boton6.setBackground(Color.green);
                    correct13.setBackground(Color.green);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(8,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton13.setLocation(location13);
                    //codigo para el cambio de color del boton
                    boton13.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[13] = 1;
                }
            }

        }
    }//GEN-LAST:event_boton13MouseReleased

    private void boton9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MouseDragged

        if (bande9 = true) {
            mover(boton9);
        }

    }//GEN-LAST:event_boton9MouseDragged

    private void boton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MouseEntered
        if (boton9.getBackground() != green) {
            boton9.setBackground(color);
        }
    }//GEN-LAST:event_boton9MouseEntered

    private void boton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MouseReleased
        if (superbande == true) {
            if (bande9 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton9.getBounds();
                tam = tamaño(label9);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 6)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[9] = 1;
                    bbande9 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton9.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label9.setSize(boton9.getWidth(), boton9.getHeight());
                    label9.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande9 = false;
                    //boton9.setBackground(Color.green);
                    correct9.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS2evaPE plano = null;
                    plano = new PlanoS2evaPE(2,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);

                } else {
                    System.out.println("incorrecto");
                    boton9.setLocation(location9);
                    //codigo para el cambio de color del boton
                    boton9.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[9] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton9MouseReleased

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton19MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton19MouseDragged

        if (bande19 = true) {
            mover(boton19);
        }

    }//GEN-LAST:event_boton19MouseDragged

    private void boton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton19MouseEntered
        if (boton19.getBackground() != green) {
            boton19.setBackground(color);
        }
    }//GEN-LAST:event_boton19MouseEntered

    private void boton19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton19MouseReleased
        if (superbande == true) {
            if (bande19 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton19.getBounds();
                tam = tamaño(label19);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 13)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[19] = 1;
                    bbande19 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton19.setLocation(tam[0], tam[2] - 12);
                    System.out.println("correcto");
                    label19.setSize(boton19.getWidth(), boton19.getHeight());
                    label19.setLocation(tam[0], tam[2] - 12);
                    bande19 = false;

                    //boton8.setBackground(Color.green);
                    correct19.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(8,1);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");

                    boton19.setLocation(location19);
                    //codigo para el cambio de color del boton
                    boton19.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[19] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton19MouseReleased

    private void boton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton19ActionPerformed

    private void boton5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseDragged

        if (bande5 = true) {
            mover(boton5);
        }

    }//GEN-LAST:event_boton5MouseDragged

    private void boton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseEntered
        if (boton5.getBackground() != green) {
            boton5.setBackground(color);
        }
    }//GEN-LAST:event_boton5MouseEntered

    private void boton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseReleased
        if (superbande == true) {
            if (bande5 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton5.getBounds();
                tam = tamaño(label5);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 2)) {
                    bbande5 = true;
                    generarsonidowell();
                    contGError--;
                    preguntas[5] = 1;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton5.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label5.setSize(boton5.getWidth(), boton5.getHeight());
                    label5.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande5 = false;
                    //boton10.setBackground(Color.green);
                    correct5.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(6,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);

                } else {
                    System.out.println("incorrecto");
                    boton5.setLocation(location5);
                    //codigo para el cambio de color del boton
                    boton5.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[5] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton5MouseReleased

    private void boton6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseDragged

        if (bande6 = true) {
            mover(boton6);
        }

    }//GEN-LAST:event_boton6MouseDragged

    private void boton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseEntered
        if (boton6.getBackground() != green) {
            boton6.setBackground(color);
        }
    }//GEN-LAST:event_boton6MouseEntered

    private void boton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton6MousePressed

    private void boton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseReleased
        if (superbande == true) {
            if (bande6 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton6.getBounds();
                tam = tamaño(label6);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 3)) {
                    bbande6 = true;
                    generarsonidowell();
                    contGError--;
                    preguntas[6] = 1;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);

                    boton6.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label6.setSize(boton6.getWidth(), boton6.getHeight());
                    label6.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande6 = false;
                    //boton11.setBackground(Color.green);
                    correct6.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(6,1);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);

                } else {
                    System.out.println("incorrecto");
                    boton6.setLocation(location6);
                    //codigo para el cambio de color del boton
                    boton6.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[6] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton6MouseReleased

    private void boton8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MouseDragged

        if (bande8 = true) {
            mover(boton8);
        }

    }//GEN-LAST:event_boton8MouseDragged

    private void boton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MouseEntered
        if (boton8.getBackground() != green) {
            boton8.setBackground(color);
        }
    }//GEN-LAST:event_boton8MouseEntered

    private void boton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MouseReleased
        if (superbande == true) {
            if (bande8 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton8.getBounds();
                tam = tamaño(label8);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 4)) {
                    // &&(contgeneral>=9)
                    generarsonidowell();
                    contGError--;
                    preguntas[8] = 1;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    bbande8 = true;
                    boton8.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label8.setSize(boton8.getWidth(), boton8.getHeight());
                    label8.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande8 = false;
                    //boton12.setBackground(Color.green);
                    correct8.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(6,3);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);

                } else {
                    System.out.println("incorrecto");
                    boton8.setLocation(location8);
                    //codigo para el cambio de color del boton
                    boton8.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[8] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton8MouseReleased

    private void boton4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseDragged

        if (bande4 = true) {
            mover(boton4);
        }

    }//GEN-LAST:event_boton4MouseDragged

    private void boton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseEntered
        if (boton4.getBackground() != green) {
            boton4.setBackground(color);
        }
    }//GEN-LAST:event_boton4MouseEntered

    private void boton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseReleased
        if (superbande == true) {
            if (bande4 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton4.getBounds();
                tam = tamaño(label4);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 1)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[4] = 1;
                    bbande4 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton4.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label4.setSize(boton4.getWidth(), boton4.getHeight());
                    label4.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande4 = false;
                    //boton13.setBackground(Color.green);
                    correct4.setBackground(Color.green);
                    Plabel1.setBackground(green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS2evaPE plano = null;
                    plano = new PlanoS2evaPE(1,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {

                    System.out.println("incorrecto");
                    boton4.setLocation(location4);
                    //codigo para el cambio de color del boton
                    boton4.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[4] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton4MouseReleased

    private void boton15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MouseDragged

        if (bande15 = true) {
            mover(boton15);
        }

    }//GEN-LAST:event_boton15MouseDragged

    private void boton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MouseEntered
        if (boton15.getBackground() != green) {
            boton15.setBackground(color);
        }
    }//GEN-LAST:event_boton15MouseEntered

    private void boton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton15MousePressed

    private void boton15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MouseReleased
        if (superbande == true) {
            if (bande15 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton15.getBounds();
                tam = tamaño(label15);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 12)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[15] = 1;
                    bbande15 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton15.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label15.setSize(boton15.getWidth(), boton15.getHeight());
                    label15.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande15 = false;
                    //boton14.setBackground(Color.green);
                    correct15.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS2evaPE plano = null;
                    plano = new PlanoS2evaPE(2,1);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton15.setLocation(location15);
                    //codigo para el cambio de color del boton
                    boton15.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[15] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton15MouseReleased

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MouseDragged

        if (bande11 = true) {
            mover(boton11);
        }

    }//GEN-LAST:event_boton11MouseDragged

    private void boton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MouseEntered
        if (boton11.getBackground() != green) {
            boton11.setBackground(color);
        }
    }//GEN-LAST:event_boton11MouseEntered

    private void boton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MouseReleased
        if (superbande == true) {
            if (bande11 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton11.getBounds();
                tam = tamaño(label11);
                //(tam[0], tam[2] - 12)
//(tam[1] - a.width - 20, tam[3] - a.height - 20)
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 6)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[11] = 1;
                    bbande11 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton11.setLocation(tam[0], tam[2] - 12);
                    System.out.println("correcto");
                    label11.setSize(boton11.getWidth(), boton11.getHeight());
                    label11.setLocation(tam[0], tam[2] - 12);
                    bande11 = false;
                    //boton15.setBackground(Color.green);
                    correct11.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(6,4);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {

                    System.out.println("incorrecto");
                    boton11.setLocation(location11);
                    //codigo para el cambio de color del boton
                    boton11.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[11] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton11MouseReleased

    private void boton12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MouseDragged

        if (bande12 = true) {
            mover(boton12);
        }

    }//GEN-LAST:event_boton12MouseDragged

    private void boton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MouseEntered
        if (boton12.getBackground() != green) {
            boton12.setBackground(color);
        }
    }//GEN-LAST:event_boton12MouseEntered

    private void boton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton12MousePressed

    private void boton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MouseReleased
        if (superbande == true) {
            if (bande12 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton12.getBounds();
                tam = tamañoIz(label12);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 9)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[12] = 1;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    bbande12 = true;
                    boton12.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label12.setSize(boton12.getWidth(), boton12.getHeight());
                    label12.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande12 = false;
                    correct12.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(6,5);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton12.setLocation(location12);
                    //codigo para el cambio de color del boton
                    boton12.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[12] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton12MouseReleased

    private void boton14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton14MouseDragged

        if (bande14 = true) {
            mover(boton14);
        }
    }//GEN-LAST:event_boton14MouseDragged

    private void boton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton14MouseEntered
        if (boton14.getBackground() != green) {
            boton14.setBackground(color);
        }
    }//GEN-LAST:event_boton14MouseEntered

    private void boton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14MousePressed

    private void boton14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton14MouseReleased
        if (superbande == true) {
            if (bande14 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton14.getBounds();
                tam = tamañoIz(label14);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 11)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[14] = 1;
                    bbande14 = true;
                    //(tam[0], tam[2] - 12)
//(tam[1] - a.width - 20, tam[3] - a.height - 20)
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton14.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label14.setSize(boton14.getWidth(), boton14.getHeight());
                    label14.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande14 = false;
                    //boton17.setBackground(Color.green);
                    correct14.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(6,6);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton14.setLocation(location14);
                    //codigo para el cambio de color del boton
                    boton14.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[14] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton14MouseReleased

    private void boton3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseDragged

        if (bande3 = true) {
            mover(boton3);
        }
    }//GEN-LAST:event_boton3MouseDragged

    private void boton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseEntered
        if (boton3.getBackground() != green) {
            boton3.setBackground(color);
        }
    }//GEN-LAST:event_boton3MouseEntered

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3MousePressed

    private void boton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseReleased
        if (superbande == true) {
            if (bande3 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton3.getBounds();
                tam = tamañoIz(label3);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 0)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[3] = 1;
                    bbande3 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton3.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label3.setSize(boton3.getWidth(), boton3.getHeight());
                    label3.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande3 = false;
                    //boton21.setBackground(Color.green);
                    correct3.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Plabel2.setBackground(green);
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS3evaPE plano = null;
                    plano = new PlanoS3evaPE(3,0);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton3.setLocation(location3);
                    //codigo para el cambio de color del boton
                    boton3.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[3] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton3MouseReleased

    private void boton7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MouseDragged
        if (bande7 = true) {
            mover(boton7);
        }
    }//GEN-LAST:event_boton7MouseDragged

    private void boton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MouseEntered
        if (boton7.getBackground() != green) {
            boton7.setBackground(color);
        }
    }//GEN-LAST:event_boton7MouseEntered

    private void boton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MouseReleased
        if (superbande == true) {
            if (bande7 == true) {
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton7.getBounds();
                tam = tamañoIz(label7);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 4)) {
                    generarsonidowell();
                    contGError--;
                    preguntas[7] = 1;
                    bbande7 = true;
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton7.setLocation(tam[1] - a.width, tam[3] - a.height);
                    System.out.println("correcto");
                    label7.setSize(boton7.getWidth(), boton7.getHeight());
                    label7.setLocation(tam[1] - a.width, tam[3] - a.height);
                    bande7 = false;
                    //boton23.setBackground(Color.green);
                    correct7.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    PlanoS1evaPE plano = null;
                    plano = new PlanoS1evaPE(6,2);
                    plano.setVisible(true);
                    plano.setLocationRelativeTo(null);
                } else {
                    System.out.println("incorrecto");
                    boton7.setLocation(location7);
                    //codigo para el cambio de color del boton
                    boton7.setBackground(Color.red);
                    //codigo para la generacion de el sonido
                    generarsonido();
                    pu2[7] = 1;
                }
            }
        }
    }//GEN-LAST:event_boton7MouseReleased

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed

    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton7ActionPerformed

    private void correct10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correct10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correct10ActionPerformed

    private void correct14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correct14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correct14ActionPerformed

    private void correct18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correct18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correct18ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton13ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton18ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int pre = suma(preguntas);
        int faltan = totalPreguntas - pre;
        if (pre != totalPreguntas) {
            int dialogButton = JOptionPane.showConfirmDialog(rootPane, "faltan" + faltan + "preguntas por responder, desea continuar con la evaluacion");
            if (dialogButton == JOptionPane.YES_OPTION) {

            } else {

                System.out.println(pu2 + "errores");
                contGError = contGError + suma(pu2);
                String[] cadena = new String[6];
                int j = 1;
                timer.stop();

                Metodos met = new Metodos();

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
                try {
                    met.guardaDatos(String.valueOf(Hora), 1);
                    met.guardaDatos(String.valueOf(Minuto), 1);
                    met.guardaDatos(String.valueOf(Segundo), 1);
                    met.guardaDatos(String.valueOf(contGError), 1);
                    met.guardaDatos(String.valueOf(contPreguntas), 1);

                } catch (IOException ex) {
                    Logger.getLogger(ArranqueEva.class.getName()).log(Level.SEVERE, null, ex);
                }
                Evaluacion eva = new Evaluacion();
                eva.setVisible(true);
                eva.setLocationRelativeTo(null);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public int suma(int[] numeros) {
        int sum = 0;
        for (int i = 0; i < totalPreguntas; i++) {
            sum = sum + numeros[i];
        }
        return sum;
    }

    public void generarsonido() {
        Clip sonido = null;
        try {
            sonido = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        File a = new File("src\\sonidos\\Track_No01_1.wav");
        try {
            sonido.open(AudioSystem.getAudioInputStream(a));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.start();
        System.out.println("Reproduciendo 10s. de sonido...");
        try {
            Thread.sleep(1000); // 1000 milisegundos (10 segundos)
        } catch (InterruptedException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.close();
    }

    public void generarsonidowell() {
        Clip sonido = null;
        try {
            sonido = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        File a = new File("src\\sonidos\\Well_1.wav");
        try {
            sonido.open(AudioSystem.getAudioInputStream(a));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.start();
        System.out.println("Reproduciendo 10s. de sonido...");
        try {
            Thread.sleep(500); // 1000 milisegundos (10 segundos)
        } catch (InterruptedException ex) {
            Logger.getLogger(ParoEmergenciaEVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.close();
    }

    public void convertiranegro() {
        Plabel1.setBackground(black);
        Plabel2.setBackground(black);
        Plabel3.setBackground(black);
        Plabel4.setBackground(black);
        Plabel5.setBackground(black);
        Plabel6.setBackground(black);
        Plabel7.setBackground(black);
        Plabel9.setBackground(black);
        Plabel1.setBackground(black);

        correct3.setBackground(black);
        correct4.setBackground(black);
        correct5.setBackground(black);
        correct6.setBackground(black);
        correct7.setBackground(black);
        correct8.setBackground(black);
        correct9.setBackground(black);
        correct10.setBackground(black);
        correct11.setBackground(black);
        correct12.setBackground(black);
        correct13.setBackground(black);
        correct14.setBackground(black);
        correct15.setBackground(black);
        correct16.setBackground(black);
        correct17.setBackground(black);
        correct18.setBackground(black);
        correct19.setBackground(black);

    }

    public void validarcuantos(int p) {
        contador = contador + 1;
        switch (p) {
            case 6:
                Plabel5.setBackground(green);
                break;
            case 9:
                Plabel6.setBackground(green);
                break;
            case 10:
                Plabel7.setBackground(green);
                break;
            case 11:
                Plabel9.setBackground(green);
                break;
            case 12:
                Plabel10.setBackground(green);
                break;
            case 13:
                Plabel12.setBackground(green);
                break;
            case 17:
                Plabel11.setBackground(green);
                break;
        }

    }

    private void tamaño() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cerro(int a) {

        if (a == 12) {
            contgeneral = a;
            contgeneral = contgeneral + 1;
            validarcuantos(contgeneral);
        } else {
            contgeneral = a;
            contgeneral = contgeneral + 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ParoEMERGENCIA;
    private javax.swing.JLabel Plabel1;
    private javax.swing.JLabel Plabel10;
    private javax.swing.JLabel Plabel11;
    private javax.swing.JLabel Plabel12;
    private javax.swing.JLabel Plabel2;
    private javax.swing.JLabel Plabel3;
    private javax.swing.JLabel Plabel4;
    private javax.swing.JLabel Plabel5;
    private javax.swing.JLabel Plabel6;
    private javax.swing.JLabel Plabel7;
    private javax.swing.JLabel Plabel9;
    private javax.swing.JTextField Reloj;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton19;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton correct10;
    private javax.swing.JButton correct11;
    private javax.swing.JButton correct12;
    private javax.swing.JButton correct13;
    private javax.swing.JButton correct14;
    private javax.swing.JButton correct15;
    private javax.swing.JButton correct16;
    private javax.swing.JButton correct17;
    private javax.swing.JButton correct18;
    private javax.swing.JButton correct19;
    private javax.swing.JButton correct3;
    private javax.swing.JButton correct4;
    private javax.swing.JButton correct5;
    private javax.swing.JButton correct6;
    private javax.swing.JButton correct7;
    private javax.swing.JButton correct8;
    private javax.swing.JButton correct9;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
