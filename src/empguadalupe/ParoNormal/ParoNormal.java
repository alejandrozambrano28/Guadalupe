/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.ParoNormal;


import empguadalupe.arranque.EnMarcha.CerrarValvulaEsferica;
import empguadalupe.arranque.EnMarcha.AplicarFrenosParoNormal;
import empguadalupe.arranque.EnMarcha.BombaRefrigeracion;
import empguadalupe.arranque.EnMarcha.DesaplicarFrenos;
import empguadalupe.arranque.EnMarcha.JuntaInflable;
import empguadalupe.arranque.EnMarcha.LubricacionForzadaOn;
import empguadalupe.arranque.EnMarcha.ReguladorDesbloqueado;
import empguadalupe.arranque.EnMarcha.ReguladorEnergizado;
import empguadalupe.arranque.EnMarcha.ValvulaAlivio;
import empguadalupe.arranque.EnMarcha.ValvulaAislamiento;
import empguadalupe.arranque.EnMarcha.VelocidadM90;
import empguadalupe.arranque.EnMarcha.filtroAplicado;
import empguadalupe.arranque.Energizado.InterruptordeCampo;
import empguadalupe.arranque.Energizado.LubricacionForzadaOff;
import empguadalupe.arranque.Energizado.VoltajeInterruptor;
import empguadalupe.arranque.Sincronizado.ComunicacionG4ux;
import empguadalupe.arranque.Sincronizado.InterruptoGeneradorCerrado;
import empguadalupe.arranque.Sincronizado.LimitadorApertura100;
import empguadalupe.arranque.Sincronizado.SincroDisponible;
import empguadalupe.arranque.Sincronizado.SincroOk;
import empguadalupe.arranque.Sincronizado.SincroenMarcha;
import empguadalupe.arranque.Sincronizado.UnidadXSeleccionada;
import empguadalupe.arranque.Sincronizado.Unidaddes;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.green;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import empguadalupe.arranque.Sincronizado.VoltajeM63;

import javax.swing.JButton;


/**
 *
 * @author lzambrs
 */
public class ParoNormal extends javax.swing.JFrame {
    
     Thread hiloA;
    int contador = 0;
    private Point location1, location2, location3, location4, location5, location6, location7, location8, location9, location10, location11, location12;
    private Point location21, location22, location13, location14, location15, location16, location17, location18, location19, location20, location23, location24;
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
    boolean bande20 = true;
    boolean bande21 = true;
    boolean bande22 = true;
    boolean bande23 = true;
    boolean bande24 = true;
    
    Rectangle rec1,rec2,rec3,rec4,rec5,rec6,rec7,rec8,rec9,rec10,rec11,rec12,rec13,rec14,rec15,rec16,rec17,rec18,rec19,rec20,rec21,rec22,rec23,rec24;
    
    
    /**
     * Creates new form Vista
     */
    
    public ParoNormal() {
        
        
        initComponents();
        correct1.setBackground(black);
        correct2.setBackground(black);
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
       
        correct21.setBackground(black);

        correct23.setBackground(black);
      
        
        
        rec1 =label1.getBounds();
        rec2 =label2.getBounds();
        rec3 =label3.getBounds();
        rec4 =label4.getBounds();
        rec5 =label5.getBounds();
        rec6 =label6.getBounds();
        rec7 =label7.getBounds();
        rec8 =label8.getBounds();
        rec9 =label9.getBounds();
        rec10 =label10.getBounds();
        rec11 =label11.getBounds();
        rec12 =label12.getBounds();
        rec13 =label13.getBounds();
        rec14 =label14.getBounds();
        rec15 =label15.getBounds();
        rec16 =label16.getBounds();
        rec17 =label17.getBounds();
  
        rec21 =label21.getBounds();

        rec23 =label23.getBounds();
     
        
        

        ubica[0] = 70;
        ubica[1] = 100;
        ubica[2] = 130;
        ubica[3] = 160;
        ubica[4] = 190;
        ubica[5] = 220;
        ubica[6] = 250;
        ubica[7] = 280;
        ubica[8] = 310;
        ubica[9] = 340;
        ubica[10] = 370;
        ubica[11] = 400;
        ubica[12] = 430;
        ubica[13] = 460;
        ubica[14] = 490;
        ubica[15] = 520;
        ubica[16] = 550;
        ubica[17] = 580;
        ubica[18] = 610;
        ubica[19] = 640;
        ubica[20] = 670;
        ubica[21] = 700;
        ubica[22] = 730;
        ubica[23] = 760;

        color = boton1.getBackground();
        boton1.setEnabled(false);
        boton2.setEnabled(false);
        boton3.setEnabled(false);
        boton4.setEnabled(false);
        boton5.setEnabled(false);
        boton6.setEnabled(false);
        boton7.setEnabled(false);
        boton8.setEnabled(false);
        boton9.setEnabled(false);
        boton10.setEnabled(false);
        boton11.setEnabled(false);
        boton12.setEnabled(false);
   
        boton23.setEnabled(false);
   
        boton21.setEnabled(false);
 
        boton17.setEnabled(false);
        boton16.setEnabled(false);
        boton15.setEnabled(false);
        boton14.setEnabled(false);
        boton13.setEnabled(false);
        
      
        
    }
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
            java.util.logging.Logger.getLogger(empguadalupe.arranque.CondicionesIniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empguadalupe.arranque.CondicionesIniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empguadalupe.arranque.CondicionesIniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empguadalupe.arranque.CondicionesIniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParoNormal().setVisible(true);
            }
        });
    }
    //crea numeros aleatorios para poner los botones en diferentes posiciones
    public static Stack<Integer> generaNumeroAleatorio(int minimo, int maximo) {
        int pos;
        int nCartas = 19;
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

        posmenorx = a.x;
        posmayorx = a.x + 40;
        posmenory = a.y + 10;
        posmayory = a.y + 40;
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

        posmenorx = a.x;
        posmayorx = a.x + 40;
        posmenory = a.y + 10;
        posmayory = a.y + 40;
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        correct1 = new javax.swing.JButton();
        correct2 = new javax.swing.JButton();
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
        correct21 = new javax.swing.JButton();
        correct23 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        arranqueNormal = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        Plabel2 = new javax.swing.JLabel();
        Plabel1 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        Plabel4 = new javax.swing.JLabel();
        Plabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        label13 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        Plabel6 = new javax.swing.JLabel();
        Plabel5 = new javax.swing.JLabel();
        Plabel9 = new javax.swing.JLabel();
        Plabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        label21 = new javax.swing.JLabel();
        label23 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Secuencia de Arranque\n");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/thumbGRUPO20EPM20CON20CIERRE202013.jpg"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(0, 0, 170, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 270, 70, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 430, 70, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 610, 60, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/rombo.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(360, 510, 70, 59);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("5");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(790, 190, 60, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("6");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(790, 300, 60, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("7");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(790, 390, 60, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("8");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(790, 480, 60, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EN MARCHA");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(270, 530, 74, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/rombo.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(360, 340, 70, 59);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ENERGIZADA");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(260, 350, 81, 17);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 180, 60, 50);

        correct1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct1);
        correct1.setBounds(900, 480, 20, 20);

        correct2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct2);
        correct2.setBounds(760, 480, 20, 20);

        correct3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct3);
        correct3.setBounds(330, 180, 20, 20);

        correct4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct4);
        correct4.setBounds(860, 510, 20, 20);

        correct5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct5);
        correct5.setBounds(330, 210, 20, 20);

        correct6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct6);
        correct6.setBounds(900, 300, 20, 20);

        correct7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct7);
        correct7.setBounds(760, 210, 20, 20);

        correct8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct8);
        correct8.setBounds(900, 540, 20, 20);

        correct9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct9);
        correct9.setBounds(760, 180, 20, 20);

        correct10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct10);
        correct10.setBounds(330, 600, 20, 20);

        correct11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct11);
        correct11.setBounds(330, 630, 20, 20);

        correct12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct12);
        correct12.setBounds(330, 660, 20, 20);

        correct13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct13);
        correct13.setBounds(330, 430, 20, 20);

        correct14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct14);
        correct14.setBounds(900, 390, 20, 20);

        correct15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct15);
        correct15.setBounds(760, 240, 20, 20);

        correct16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct16);
        correct16.setBounds(860, 180, 20, 20);

        correct17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct17);
        correct17.setBounds(860, 330, 20, 20);

        correct21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct21);
        correct21.setBounds(330, 270, 20, 20);

        correct23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(correct23);
        correct23.setBounds(430, 600, 20, 20);

        titulo.setBackground(new java.awt.Color(60, 188, 28));
        titulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SECUENCIA DE PARO NORMAL UNIDAD X GUADALUPE IV");
        titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 0), null, null));
        titulo.setOpaque(true);
        jPanel1.add(titulo);
        titulo.setBounds(200, 0, 1120, 50);

        arranqueNormal.setText("SECUENCIA PARO NORMAL");
        arranqueNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arranqueNormalActionPerformed(evt);
            }
        });
        jPanel1.add(arranqueNormal);
        arranqueNormal.setBounds(550, 60, 180, 23);

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label3);
        label3.setBounds(290, 180, 20, 20);

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label1);
        label1.setBounds(860, 480, 20, 20);

        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label4);
        label4.setBounds(900, 510, 20, 20);

        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label5);
        label5.setBounds(290, 210, 20, 20);

        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label2);
        label2.setBounds(720, 480, 20, 20);

        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label6);
        label6.setBounds(860, 300, 20, 20);

        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label7);
        label7.setBounds(720, 210, 20, 20);

        Plabel2.setBackground(new java.awt.Color(0, 0, 0));
        Plabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel2.setForeground(new java.awt.Color(255, 255, 255));
        Plabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel2.setOpaque(true);
        jPanel1.add(Plabel2);
        Plabel2.setBounds(320, 260, 140, 70);

        Plabel1.setBackground(new java.awt.Color(0, 0, 0));
        Plabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel1.setForeground(new java.awt.Color(255, 255, 255));
        Plabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel1.setOpaque(true);
        jPanel1.add(Plabel1);
        Plabel1.setBounds(320, 170, 140, 70);

        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label10);
        label10.setBounds(290, 600, 20, 20);

        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label8);
        label8.setBounds(860, 540, 20, 20);

        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label9);
        label9.setBounds(720, 180, 20, 20);

        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label11);
        label11.setBounds(290, 630, 20, 20);

        label12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label12);
        label12.setBounds(290, 660, 20, 20);

        Plabel4.setBackground(new java.awt.Color(0, 0, 0));
        Plabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel4.setForeground(new java.awt.Color(255, 255, 255));
        Plabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel4.setOpaque(true);
        jPanel1.add(Plabel4);
        Plabel4.setBounds(320, 590, 140, 100);

        Plabel3.setBackground(new java.awt.Color(0, 0, 0));
        Plabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel3.setForeground(new java.awt.Color(255, 255, 255));
        Plabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel3.setOpaque(true);
        jPanel1.add(Plabel3);
        Plabel3.setBounds(320, 420, 140, 70);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(810, 60, 80, 23);

        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label13);
        label13.setBounds(290, 430, 20, 20);

        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label14);
        label14.setBounds(860, 390, 20, 20);

        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label15);
        label15.setBounds(720, 240, 20, 20);

        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label16);
        label16.setBounds(900, 180, 20, 20);

        label17.setForeground(new java.awt.Color(255, 255, 255));
        label17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label17);
        label17.setBounds(900, 330, 20, 20);

        Plabel6.setBackground(new java.awt.Color(0, 0, 0));
        Plabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel6.setForeground(new java.awt.Color(255, 255, 255));
        Plabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel6.setOpaque(true);
        jPanel1.add(Plabel6);
        Plabel6.setBounds(750, 290, 140, 70);

        Plabel5.setBackground(new java.awt.Color(0, 0, 0));
        Plabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel5.setForeground(new java.awt.Color(255, 255, 255));
        Plabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel5.setOpaque(true);
        jPanel1.add(Plabel5);
        Plabel5.setBounds(750, 170, 140, 100);

        Plabel9.setBackground(new java.awt.Color(0, 0, 0));
        Plabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel9.setForeground(new java.awt.Color(255, 255, 255));
        Plabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel9.setOpaque(true);
        jPanel1.add(Plabel9);
        Plabel9.setBounds(750, 470, 140, 100);

        Plabel7.setBackground(new java.awt.Color(0, 0, 0));
        Plabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Plabel7.setForeground(new java.awt.Color(255, 255, 255));
        Plabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Plabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Plabel7.setOpaque(true);
        jPanel1.add(Plabel7);
        Plabel7.setBounds(750, 380, 140, 70);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/rombo.png"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(780, 610, 70, 59);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PARO");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(790, 590, 50, 17);

        label21.setForeground(new java.awt.Color(255, 255, 255));
        label21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label21);
        label21.setBounds(280, 270, 20, 20);

        label23.setForeground(new java.awt.Color(255, 255, 255));
        label23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(label23);
        label23.setBounds(470, 600, 20, 20);

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("BOMBA DE REFRIGERACION OFF");
        boton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton1MouseDragged(evt);
            }
        });
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton1MouseReleased(evt);
            }
        });
        jPanel1.add(boton1);
        boton1.setBounds(1130, 280, 200, 23);

        boton2.setBackground(new java.awt.Color(0, 0, 0));
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("VALVULA DE AISLAMIENTO CERRADA");
        boton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton2MouseDragged(evt);
            }
        });
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton2MouseReleased(evt);
            }
        });
        jPanel1.add(boton2);
        boton2.setBounds(1130, 190, 220, 23);

        boton3.setBackground(new java.awt.Color(0, 0, 0));
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setText("POTENCIA ACTIVA MENOR 5%");
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
        boton3.setBounds(1130, 100, 190, 23);

        boton4.setBackground(new java.awt.Color(0, 0, 0));
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setText("JUNTA INFLABLE OPERACION APLICADA");
        boton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton4MouseDragged(evt);
            }
        });
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton4MouseReleased(evt);
            }
        });
        jPanel1.add(boton4);
        boton4.setBounds(1130, 400, 240, 23);

        boton5.setBackground(new java.awt.Color(0, 0, 0));
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setText("POTENCIA REACTIVA MENOR 5%");
        boton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton5MouseDragged(evt);
            }
        });
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton5MouseReleased(evt);
            }
        });
        jPanel1.add(boton5);
        boton5.setBounds(1130, 160, 200, 23);

        boton7.setBackground(new java.awt.Color(0, 0, 0));
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setText("VALVULA ESFERICA CERRADA");
        boton7.setFocusable(false);
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
        jPanel1.add(boton7);
        boton7.setBounds(1130, 70, 200, 23);

        boton6.setBackground(new java.awt.Color(0, 0, 0));
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setText("FRENOS APLICADOS");
        boton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton6MouseDragged(evt);
            }
        });
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton6MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton6MouseReleased(evt);
            }
        });
        jPanel1.add(boton6);
        boton6.setBounds(1130, 130, 150, 23);

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
        boton9.setBounds(1130, 220, 190, 23);

        boton8.setBackground(new java.awt.Color(0, 0, 0));
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setText("FRENOS DESAPLICADOS");
        boton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton8.setDefaultCapable(false);
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
        boton8.setBounds(1130, 250, 160, 23);

        boton10.setBackground(new java.awt.Color(0, 0, 0));
        boton10.setForeground(new java.awt.Color(255, 255, 255));
        boton10.setText("REGULADOR BLOQUEADO");
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
        jPanel1.add(boton10);
        boton10.setBounds(1130, 340, 160, 23);

        boton11.setBackground(new java.awt.Color(0, 0, 0));
        boton11.setForeground(new java.awt.Color(255, 255, 255));
        boton11.setText("REGULADOR DESENERGIZADO");
        boton11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton11MouseDragged(evt);
            }
        });
        boton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton11MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton11MouseReleased(evt);
            }
        });
        jPanel1.add(boton11);
        boton11.setBounds(1130, 310, 190, 23);

        boton12.setBackground(new java.awt.Color(0, 0, 0));
        boton12.setForeground(new java.awt.Color(255, 255, 255));
        boton12.setText("VELOCIDAD <90%");
        boton12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton12MouseDragged(evt);
            }
        });
        boton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton12MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton12MouseReleased(evt);
            }
        });
        jPanel1.add(boton12);
        boton12.setBounds(1130, 370, 140, 23);

        boton13.setBackground(new java.awt.Color(0, 0, 0));
        boton13.setForeground(new java.awt.Color(255, 255, 255));
        boton13.setText("INTERRUPTOR DE CAMPO ABIERTO");
        boton13.setFocusable(false);
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
        jPanel1.add(boton13);
        boton13.setBounds(1130, 430, 220, 23);

        boton14.setBackground(new java.awt.Color(0, 0, 0));
        boton14.setForeground(new java.awt.Color(255, 255, 255));
        boton14.setText("LUBRICACION FORZADA OFF");
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
        boton14.setBounds(1130, 460, 180, 23);

        boton15.setBackground(new java.awt.Color(0, 0, 0));
        boton15.setForeground(new java.awt.Color(255, 255, 255));
        boton15.setText("POSICION DE DISTRIBUIDOR 0%");
        boton15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton15MouseDragged(evt);
            }
        });
        boton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton15MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton15MouseReleased(evt);
            }
        });
        jPanel1.add(boton15);
        boton15.setBounds(1130, 490, 200, 20);

        boton16.setBackground(new java.awt.Color(0, 0, 0));
        boton16.setForeground(new java.awt.Color(255, 255, 255));
        boton16.setText("VELOCIDAD MENOR 10%");
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
        jPanel1.add(boton16);
        boton16.setBounds(1130, 520, 160, 20);

        boton17.setBackground(new java.awt.Color(0, 0, 0));
        boton17.setForeground(new java.awt.Color(255, 255, 255));
        boton17.setText("VELOCIDAD MENOR 1%");
        boton17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton17MouseDragged(evt);
            }
        });
        boton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton17MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton17MouseReleased(evt);
            }
        });
        jPanel1.add(boton17);
        boton17.setBounds(1130, 550, 150, 20);

        boton21.setBackground(new java.awt.Color(0, 0, 0));
        boton21.setForeground(new java.awt.Color(255, 255, 255));
        boton21.setText("INTERRUPTOR GENERADOR ABIERTO");
        boton21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton21MouseDragged(evt);
            }
        });
        boton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton21MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton21MouseReleased(evt);
            }
        });
        jPanel1.add(boton21);
        boton21.setBounds(1130, 580, 250, 23);

        boton23.setBackground(new java.awt.Color(0, 0, 0));
        boton23.setForeground(new java.awt.Color(255, 255, 255));
        boton23.setText("LIM APERTURA DISTRIBUIDOR 0%");
        boton23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boton23MouseDragged(evt);
            }
        });
        boton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton23MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton23MouseReleased(evt);
            }
        });
        jPanel1.add(boton23);
        boton23.setBounds(1130, 620, 220, 23);

        icono.setBackground(new java.awt.Color(153, 212, 94));
        icono.setForeground(new java.awt.Color(255, 255, 255));
        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/color.png"))); // NOI18N
        icono.setToolTipText("");
        icono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(icono);
        icono.setBounds(0, 0, 1440, 850);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//boton principal para arrancar la secuencia de arranque
    private void arranqueNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arranqueNormalActionPerformed
        Stack<Integer> numero = generaNumeroAleatorio(170, 700);
        int num0 = numero.get(0);
        boton1.setLocation(1130, ubica[num0]);
        boton1.setBackground(color);
        int num1 = numero.get(1);
        boton2.setLocation(1130, ubica[num1]);
        boton2.setBackground(color);
        int num2 = numero.get(2);
        boton3.setLocation(1130, ubica[num2]);
        boton3.setBackground(color);
        int num3 = numero.get(3);
        boton4.setLocation(1130, ubica[num3]);
        boton4.setBackground(color);
        int num4 = numero.get(4);
        boton5.setLocation(1130, ubica[num4]);
        boton5.setBackground(color);
        int num5 = numero.get(5);
        boton6.setLocation(1130, ubica[num5]);
        boton6.setBackground(color);
        int num6 = numero.get(6);
        boton7.setLocation(1130, ubica[num6]);
        boton7.setBackground(color);
        int num7 = numero.get(7);
        boton8.setLocation(1130, ubica[num7]);
        boton8.setBackground(color);
        int num8 = numero.get(8);
        boton9.setLocation(1130, ubica[num8]);
        boton9.setBackground(color);
        int num9 = numero.get(9);
        boton10.setLocation(1130, ubica[num9]);
        boton10.setBackground(color);
        int num10 = numero.get(10);
        boton11.setLocation(1130, ubica[num10]);
        boton11.setBackground(color);
        int num11 = numero.get(11);
        boton12.setLocation(1130, ubica[num11]);
        boton12.setBackground(color);
        int num12 = numero.get(12);
        boton13.setLocation(1130, ubica[num12]);
        boton13.setBackground(color);
        int num13 = numero.get(13);
        boton14.setLocation(1130, ubica[num13]);
        boton14.setBackground(color);
        int num14 = numero.get(14);
        boton15.setLocation(1130, ubica[num14]);
        boton15.setBackground(color);
        int num15 = numero.get(15);
        boton16.setLocation(1130, ubica[num15]);
        boton16.setBackground(color);
        int num16 = numero.get(16);
        boton17.setLocation(1130, ubica[num16]);
        boton17.setBackground(color);
        int num20 = numero.get(20);
        boton21.setLocation(1130, ubica[num20]);
        boton21.setBackground(color);
        int num22 = numero.get(22);
        boton23.setLocation(1130, ubica[num22]);
        boton23.setBackground(color);
       
        label1.setBounds(rec1);
        label2.setBounds(rec2);
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
        label21.setBounds(rec21);
        label23.setBounds(rec23);
        location1 = boton1.getLocation();
        location2 = boton2.getLocation();
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

        location21 = boton21.getLocation();
        
        location23 = boton23.getLocation();
        
        
        bande1 = true;
        bande2 = true;
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
        bande20 = true;
        bande21 = true;
        bande22 = true;
        bande23 = true;
        bande24 = true;

        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton4.setEnabled(true);
        boton5.setEnabled(true);
        boton6.setEnabled(true);
        boton7.setEnabled(true);
        boton8.setEnabled(true);
        boton9.setEnabled(true);
        boton10.setEnabled(true);
        boton11.setEnabled(true);
        boton12.setEnabled(true);
        boton23.setEnabled(true);
        boton21.setEnabled(true);
        boton17.setEnabled(true);
        boton16.setEnabled(true);
        boton15.setEnabled(true);
        boton14.setEnabled(true);
        boton13.setEnabled(true);

        superbande = true;
    }//GEN-LAST:event_arranqueNormalActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseDragged
     if (superbande == true) {
            if (bande1 == true) {
                mover(boton1);
                int tam[];
                //ubicacion del puntero en el presiso momento
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton1.getBounds();
                tam = tamaño(label1);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])) {
                    try {
                        generarsonidowell();
                        contgeneral = contgeneral + 1;
                        validarcuantos(contgeneral);
                        boton1.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                        System.out.println("correcto");
                        label1.setSize(boton1.getWidth(), boton1.getHeight());
                        label1.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                        //boton1.setBackground(Color.black);
                        
                        correct1.setBackground(Color.green);
                        bande1 = false;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //llamado a la ventana de la bomba de refrigeracion
                        BombaRefrigeracion bomba = null;
                        bomba = new BombaRefrigeracion();
                        bomba.setSize(734, 494);
                        bomba.setVisible(true);
                        bomba.setLocationRelativeTo(null);

                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }
       
    }//GEN-LAST:event_boton1MouseDragged

    private void boton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseEntered
        if (boton1.getBackground() != green) {
            boton1.setBackground(color);
        }
    }//GEN-LAST:event_boton1MouseEntered

    private void boton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseReleased
        if (superbande == true) {
            if (bande1 == true) {
                System.out.println("incorrecto");
                boton1.setLocation(location1);
                boton1.setBackground(Color.red);
                //codigo para la generacion del sonido
                generarsonido();

            }
        }
    }//GEN-LAST:event_boton1MouseReleased

    private void boton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseDragged
        if (superbande == true) {
            if (bande2 == true) {
                mover(boton2);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton2.getBounds();
                tam = tamaño(label2);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton2.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label2.setSize(boton2.getWidth(), boton2.getHeight());
                    label2.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande2 = false;
                    //boton2.setBackground(Color.green);
                    correct2.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ValvulaAislamiento valvula = null;
                    try {
                        valvula = new ValvulaAislamiento();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    valvula.setSize(720, 484);
                    valvula.setVisible(true);
                    valvula.setLocationRelativeTo(null);
                }

            }
        }
    }//GEN-LAST:event_boton2MouseDragged

    private void boton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseEntered
        if (boton2.getBackground() != green) {
            boton2.setBackground(color);
        }
    }//GEN-LAST:event_boton2MouseEntered

    private void boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MousePressed
        calcular_diferencia = true;
    }//GEN-LAST:event_boton2MousePressed

    private void boton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseReleased
        if (superbande == true) {
            if (bande2 == true) {
                System.out.println("incorrecto");
                boton2.setLocation(location2);
                //codigo para el cambio de color del boton
                boton2.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton2MouseReleased

    private void boton3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseDragged
        if (superbande == true) {
            if (bande3 == true) {
                mover(boton3);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton3.getBounds();
                tam = tamaño(label3);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton3.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label3.setSize(boton3.getWidth(), boton3.getHeight());
                    label3.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande3 = false;
                    //boton3.setBackground(Color.green);
                    correct3.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ValvulaAlivio valvulaA = null;

                    try {
                        valvulaA = new ValvulaAlivio();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    valvulaA.setSize(630, 471);
                    valvulaA.setVisible(true);
                    valvulaA.setLocationRelativeTo(null);

                }
            }
        }
    }//GEN-LAST:event_boton3MouseDragged

    private void boton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseEntered
        if (boton3.getBackground() != green) {
            boton3.setBackground(color);
        }
    }//GEN-LAST:event_boton3MouseEntered

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
        calcular_diferencia = true;
    }//GEN-LAST:event_boton3MousePressed

    private void boton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseReleased
        if (superbande == true) {
            if (bande3 == true) {
                System.out.println("incorrecto");
                boton3.setLocation(location3);
                //codigo para el cambio de color del boton
                boton3.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton3MouseReleased

    private void boton4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseDragged
        if (superbande == true) {
            if (bande4 == true) {
                mover(boton4);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton4.getBounds();
                tam = tamañoIz(label4);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton4.setLocation(tam[0], tam[2] - 20);
                    System.out.println("correcto");
                    label4.setSize(boton4.getWidth(), boton4.getHeight());
                    label4.setLocation(tam[0], tam[2] - 20);
                    bande4 = false;
                    //boton4.setBackground(Color.green);
                    correct4.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JuntaInflable junta = null;

                    try {
                        junta = new JuntaInflable();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    junta.setSize(884, 499);
                    junta.setVisible(true);
                    junta.setLocationRelativeTo(null);

                }
            }
        }
    }//GEN-LAST:event_boton4MouseDragged

    private void boton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseEntered
        if (boton4.getBackground() != green) {
            boton4.setBackground(color);
        }// TODO add your handling code here:
    }//GEN-LAST:event_boton4MouseEntered

    private void boton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MousePressed
        calcular_diferencia = true;
    }//GEN-LAST:event_boton4MousePressed

    private void boton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseReleased
        if (superbande == true) {
            if (bande4 == true) {
                System.out.println("incorrecto");
                boton4.setLocation(location4);
                //codigo para el cambio de color del boton
                boton4.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton4MouseReleased

    private void boton5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseDragged
        if (superbande == true) {
            if (bande5 == true) {
                mover(boton5);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton5.getBounds();
                tam = tamañoIz(label5);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton5.setLocation(tam[0], tam[2] - 20);
                    System.out.println("correcto");
                    label5.setSize(boton5.getWidth(), boton5.getHeight());
                    label5.setLocation(tam[0], tam[2] - 20);
                    bande5 = false;
                    //boton5.setBackground(Color.green);
                    correct5.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    filtroAplicado filtro = null;

                    try {
                        filtro = new filtroAplicado();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    filtro.setSize(720, 520);
                    filtro.setVisible(true);
                    filtro.setLocationRelativeTo(null);

                }

            }
        }
    }//GEN-LAST:event_boton5MouseDragged

    private void boton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseEntered
        if (boton5.getBackground() != green) {
            boton5.setBackground(color);
        }
    }//GEN-LAST:event_boton5MouseEntered

    private void boton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MousePressed
        calcular_diferencia = true;
    }//GEN-LAST:event_boton5MousePressed

    private void boton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseReleased
        if (superbande == true) {
            if (bande5 == true) {
                System.out.println("incorrecto");
                boton5.setLocation(location5);
                //codigo para el cambio de color del boton
                boton5.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton5MouseReleased

    private void boton7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MouseDragged
        if (superbande == true) {
            if (bande7 == true) {
                mover(boton7);

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton7.getBounds();
                tam = tamaño(label7);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 5)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton7.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label7.setSize(boton7.getWidth(), boton7.getHeight());
                    label7.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande7 = false;
                    //boton7.setBackground(Color.green);
                    correct7.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    CerrarValvulaEsferica valvulaE = null;
                    try {
                        valvulaE = new CerrarValvulaEsferica();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    valvulaE.setSize(734, 400);
                    valvulaE.setVisible(true);
                    valvulaE.setLocationRelativeTo(null);
                }

            }
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
                System.out.println("incorrecto");
                boton7.setLocation(location7);
                //codigo para el cambio de color del boton
                boton7.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton7MouseReleased

    private void boton6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseDragged
        if (superbande == true) {
            if (bande6 == true) {
                mover(boton6);

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton6.getBounds();
                tam = tamaño(label6);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])&& (contgeneral >= 5)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton6.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label6.setSize(boton6.getWidth(), boton6.getHeight());
                    label6.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande6 = false;
                    //boton6.setBackground(Color.green);
                    correct6.setBackground(Color.green);
                    
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    AplicarFrenosParoNormal frenos = null;
                    try {
                        frenos = new AplicarFrenosParoNormal();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    frenos.setSize(734, 425);
                    frenos.setVisible(true);
                    frenos.setLocationRelativeTo(null);
                }
            }
        }
    }//GEN-LAST:event_boton6MouseDragged

    private void boton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseEntered
        if (boton6.getBackground() != green) {
            boton6.setBackground(color);
        }
    }//GEN-LAST:event_boton6MouseEntered

    private void boton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseReleased
        if (superbande == true) {
            if (bande6 == true) {
                System.out.println("incorrecto");
                boton6.setLocation(location6);
                //codigo para el cambio de color del boton
                boton6.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }

        }
    }//GEN-LAST:event_boton6MouseReleased

    private void boton9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MouseDragged
        if (superbande == true) {
            if (bande9 == true) {
                mover(boton9);

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton9.getBounds();
                tam = tamaño(label9);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 7)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton9.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label9.setSize(boton9.getWidth(), boton9.getHeight());
                    label9.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande9 = false;
                    //boton9.setBackground(Color.green);
                    correct9.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    LubricacionForzadaOn lubricar = null;
                    try {
                        lubricar = new LubricacionForzadaOn();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    lubricar.setSize(700, 499);
                    lubricar.setVisible(true);
                    lubricar.setLocationRelativeTo(null);

                }
            }
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
                System.out.println("incorrecto");
                boton9.setLocation(location9);
                //codigo para el cambio de color del boton
                boton9.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton9MouseReleased

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MouseDragged
        if (superbande == true) {
            if (bande8 == true) {
                mover(boton8);

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton8.getBounds();
                tam = tamaño(label8);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 7)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton8.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label8.setSize(boton8.getWidth(), boton8.getHeight());
                    label8.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande8 = false;

                    //boton8.setBackground(Color.green);
                    correct8.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    DesaplicarFrenos frenosd = null;
                    try {
                        frenosd = new DesaplicarFrenos();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    frenosd.setSize(734, 429);
                    frenosd.setVisible(true);
                    frenosd.setLocationRelativeTo(null);
                }
            }
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
                System.out.println("incorrecto");

                boton8.setLocation(location8);
                //codigo para el cambio de color del boton
                boton8.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton8MouseReleased

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton10MouseDragged
        if (superbande == true) {
            if (bande10 == true) {
                mover(boton10);

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton10.getBounds();
                tam = tamaño(label10);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 9)) {

                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton10.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label10.setSize(boton10.getWidth(), boton10.getHeight());
                    label10.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande10 = false;
                    //boton10.setBackground(Color.green);
                    correct10.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ReguladorDesbloqueado reguladordes = null;
                    try {
                        reguladordes = new ReguladorDesbloqueado(contgeneral);
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    reguladordes.setSize(660, 410);
                    reguladordes.setVisible(true);
                    reguladordes.setLocationRelativeTo(null);

                }
            }
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
                System.out.println("incorrecto");
                boton10.setLocation(location10);
                //codigo para el cambio de color del boton
                boton10.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton10MouseReleased

    private void boton11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MouseDragged
        if (superbande == true) {
            if (bande11 == true) {
                mover(boton11);

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton11.getBounds();
                tam = tamaño(label11);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 9)) {
                    //
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton11.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label11.setSize(boton11.getWidth(), boton11.getHeight());
                    label11.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande11 = false;
                    //boton11.setBackground(Color.green);
                    correct11.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ReguladorEnergizado reguladorene = null;
                    try {
                        reguladorene = new ReguladorEnergizado(contgeneral);
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    reguladorene.setSize(660, 410);
                    reguladorene.setVisible(true);
                    reguladorene.setLocationRelativeTo(null);

                }
            }
        }
    }//GEN-LAST:event_boton11MouseDragged

    private void boton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MouseEntered
        if (boton11.getBackground() != green) {
            boton11.setBackground(color);
        }
    }//GEN-LAST:event_boton11MouseEntered

    private void boton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton11MousePressed

    private void boton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MouseReleased
        if (superbande == true) {
            if (bande11 == true) {
                System.out.println("incorrecto");
                boton11.setLocation(location11);
                //codigo para el cambio de color del boton
                boton11.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton11MouseReleased

    private void boton12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MouseDragged
        if (superbande == true) {
            if (bande12 == true) {
                mover(boton12);

                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton12.getBounds();
                tam = tamaño(label12);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 9)) {
                    // &&(contgeneral>=9)
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton12.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label12.setSize(boton12.getWidth(), boton12.getHeight());
                    label12.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande12 = false;
                    //boton12.setBackground(Color.green);
                    correct12.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    VelocidadM90 velocidad = null;
                    try {
                        velocidad = new VelocidadM90(contgeneral);
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    velocidad.setSize(660, 380);
                    velocidad.setVisible(true);
                    velocidad.setLocationRelativeTo(null);

                }
            }
        }
    }//GEN-LAST:event_boton12MouseDragged

    private void boton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MouseEntered
        if (boton12.getBackground() != green) {
            boton12.setBackground(color);
        }
    }//GEN-LAST:event_boton12MouseEntered

    private void boton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MouseReleased
        if (superbande == true) {
            if (bande12 == true) {
                System.out.println("incorrecto");
                boton12.setLocation(location12);
                //codigo para el cambio de color del boton
                boton12.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton12MouseReleased

    private void boton13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton13MouseDragged
        if (superbande == true) {
            if (bande13 == true) {
                mover(boton13);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton13.getBounds();
                tam = tamaño(label13);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])&& (contgeneral >= 12)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton13.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label13.setSize(boton13.getWidth(), boton13.getHeight());
                    label13.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande13 = false;
                    //boton13.setBackground(Color.green);
                    correct13.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    InterruptordeCampo interruptor = null;
                    try {
                        interruptor = new InterruptordeCampo(contgeneral);
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    interruptor.setSize(613, 474);
                    interruptor.setVisible(true);
                    interruptor.setLocationRelativeTo(null);
                }

            }
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
                System.out.println("incorrecto");
                boton13.setLocation(location13);
                //codigo para el cambio de color del boton
                boton13.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton13MouseReleased

    private void boton14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton14MouseDragged
        if (superbande == true) {
            if (bande14 == true) {
                mover(boton14);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton14.getBounds();
                tam = tamaño(label14);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])&& (contgeneral >= 12)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton14.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label14.setSize(boton14.getWidth(), boton14.getHeight());
                    label14.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande14 = false;
                    //boton14.setBackground(Color.green);
                    correct14.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    LubricacionForzadaOff lubrica = null;
                    try {
                        lubrica = new LubricacionForzadaOff(contgeneral);
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    lubrica.setSize(734, 424);
                    lubrica.setVisible(true);
                    lubrica.setLocationRelativeTo(null);
                }

            }
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
                System.out.println("incorrecto");
                boton14.setLocation(location14);
                //codigo para el cambio de color del boton
                boton14.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton14MouseReleased

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MouseDragged
        if (superbande == true) {
            if (bande15 == true) {
                mover(boton15);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton15.getBounds();
                tam = tamaño(label15);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3])&& (contgeneral >= 12)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton15.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    System.out.println("correcto");
                    label15.setSize(boton15.getWidth(), boton15.getHeight());
                    label15.setLocation(tam[1] - a.width - 20, tam[3] - a.height - 20);
                    bande15 = false;
                    //boton15.setBackground(Color.green);
                    correct15.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    VoltajeInterruptor interruptor = null;
                    try {
                        interruptor = new VoltajeInterruptor(contgeneral);
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    interruptor.setSize(494, 494);
                    interruptor.setVisible(true);
                    interruptor.setLocationRelativeTo(null);
                }

            }
        }
    }//GEN-LAST:event_boton15MouseDragged

    private void boton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MouseEntered
        if (boton15.getBackground() != green) {
            boton15.setBackground(color);
        }
    }//GEN-LAST:event_boton15MouseEntered

    private void boton15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MouseReleased
        if (superbande == true) {
            if (bande15 == true) {
                System.out.println("incorrecto");
                boton15.setLocation(location15);
                //codigo para el cambio de color del boton
                boton15.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton15MouseReleased

    private void boton16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MouseDragged
        if (superbande == true) {
            if (bande16 == true) {
                mover(boton16);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton16.getBounds();
                tam = tamañoIz(label16);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 15)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton16.setLocation(tam[0], tam[2] - 20);
                    System.out.println("correcto");
                    label16.setSize(boton16.getWidth(), boton16.getHeight());
                    label16.setLocation(tam[0], tam[2] - 20);
                    bande16 = false;
                    //boton16.setBackground(Color.green);
                    correct16.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    SincroDisponible sincro = null;
                    try {
                        sincro = new SincroDisponible();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   // sincro.setSize(734, 494);
                    sincro.setVisible(true);
                    sincro.setLocationRelativeTo(null);
                }

            }
        }
    }//GEN-LAST:event_boton16MouseDragged

    private void boton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MouseEntered
        if (boton16.getBackground() != green) {
            boton16.setBackground(color);
        }
    }//GEN-LAST:event_boton16MouseEntered

    private void boton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton16MousePressed

    private void boton16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MouseReleased
        if (superbande == true) {
            if (bande16 == true) {
                System.out.println("incorrecto");
                boton16.setLocation(location16);
                //codigo para el cambio de color del boton
                boton16.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton16MouseReleased

    private void boton17MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MouseDragged
        if (superbande == true) {
            if (bande17 == true) {
                mover(boton17);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton17.getBounds();
                tam = tamañoIz(label17);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 16)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton17.setLocation(tam[0], tam[2] - 20);
                    System.out.println("correcto");
                    label17.setSize(boton17.getWidth(), boton17.getHeight());
                    label17.setLocation(tam[0], tam[2] - 20);
                    bande17 = false;
                    //boton17.setBackground(Color.green);
                    correct17.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    UnidadXSeleccionada unidad = null;
                    try {
                        unidad = new UnidadXSeleccionada();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //unidad.setSize(734, 494);
                    unidad.setVisible(true);
                    unidad.setLocationRelativeTo(null);
                }

            }
        }
    }//GEN-LAST:event_boton17MouseDragged

    private void boton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MouseEntered
        if (boton17.getBackground() != green) {
            boton17.setBackground(color);
        }
    }//GEN-LAST:event_boton17MouseEntered

    private void boton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton17MousePressed

    private void boton17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MouseReleased
        if (superbande == true) {
            if (bande17 == true) {
                System.out.println("incorrecto");
                boton17.setLocation(location17);
                //codigo para el cambio de color del boton
                boton17.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton17MouseReleased

    private void boton21MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton21MouseDragged
        if (superbande == true) {
            if (bande21 == true) {
                mover(boton21);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton21.getBounds();
                tam = tamañoIz(label21);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 19)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton21.setLocation(tam[0], tam[2] - 20);
                    System.out.println("correcto");
                    label21.setSize(boton21.getWidth(), boton21.getHeight());
                    label21.setLocation(tam[0], tam[2] - 20);
                    bande21 = false;
                    //boton21.setBackground(Color.green);
                    correct21.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    InterruptoGeneradorCerrado interruptor = null;
                    try {
                        interruptor = new InterruptoGeneradorCerrado();
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   // interruptor.setSize(734, 494);
                    interruptor.setVisible(true);
                    interruptor.setLocationRelativeTo(null);
                }

            }
        }
    }//GEN-LAST:event_boton21MouseDragged

    private void boton21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton21MouseEntered
        if (boton21.getBackground() != green) {
            boton21.setBackground(color);
        }
    }//GEN-LAST:event_boton21MouseEntered

    private void boton21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton21MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton21MousePressed

    private void boton21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton21MouseReleased
        if (superbande == true) {
            if (bande21 == true) {
                System.out.println("incorrecto");
                boton21.setLocation(location21);
                //codigo para el cambio de color del boton
                boton21.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton21MouseReleased

    private void boton23MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton23MouseDragged
        if (superbande == true) {
            if (bande23 == true) {
                mover(boton23);
                int tam[];
                p = MouseInfo.getPointerInfo().getLocation();
                Rectangle a = boton23.getBounds();
                tam = tamañoIz(label23);
                //valida si la pisicion del boton es igual a la del lugar donde deberia estar
                //si es afirmativo lo ancla a esta posicion de lo contrario cuando deja de dar click da la señal de error
                if ((tam[0] <= p.x && p.x <= tam[1]) && (tam[2] <= p.y && p.y <= tam[3]) && (contgeneral >= 22)) {
                    generarsonidowell();
                    contgeneral = contgeneral + 1;
                    validarcuantos(contgeneral);
                    boton23.setLocation(tam[0], tam[2] - 20);
                    System.out.println("correcto");
                    label23.setSize(boton23.getWidth(), boton23.getHeight());
                    label23.setLocation(tam[0], tam[2] - 20);
                    bande23 = false;
                    //boton23.setBackground(Color.green);
                    correct23.setBackground(Color.green);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //llamado a la ventana de la bomba de refrigeracion
                    LimitadorApertura100 limite = null;
                    try {
                        limite = new LimitadorApertura100(contgeneral);
                    } catch (IOException ex) {
                        Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //limite.setSize(734, 494);
                    limite.setVisible(true);
                    limite.setLocationRelativeTo(null);
                }

            }
        }
    }//GEN-LAST:event_boton23MouseDragged

    private void boton23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton23MouseEntered
        if (boton23.getBackground() != green) {
            boton23.setBackground(color);
        }
    }//GEN-LAST:event_boton23MouseEntered

    private void boton23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton23MouseReleased
        if (superbande == true) {
            if (bande23 == true) {
                System.out.println("incorrecto");
                boton23.setLocation(location23);
                //codigo para el cambio de color del boton
                boton23.setBackground(Color.red);
                //codigo para la generacion de el sonido
                generarsonido();
            }
        }
    }//GEN-LAST:event_boton23MouseReleased

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed
 

    public void generarsonido() {
        Clip sonido = null;
        try {
            sonido = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
        File a = new File("C:\\Users\\lzambrs\\Documents\\NetBeansProjects\\EpmGudalupeIV\\src\\sonidos\\Track_No01_1.wav");
        try {
            sonido.open(AudioSystem.getAudioInputStream(a));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.start();
        System.out.println("Reproduciendo 10s. de sonido...");
        try {
            Thread.sleep(1000); // 1000 milisegundos (10 segundos)
        } catch (InterruptedException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.close();
    }

    public void generarsonidowell() {
        Clip sonido = null;
        try {
            sonido = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
        File a = new File("C:\\Users\\lzambrs\\Documents\\NetBeansProjects\\EpmGudalupeIV\\src\\sonidos\\Well_1.wav");
        try {
            sonido.open(AudioSystem.getAudioInputStream(a));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.start();
        System.out.println("Reproduciendo 10s. de sonido...");
        try {
            Thread.sleep(500); // 1000 milisegundos (10 segundos)
        } catch (InterruptedException ex) {
            Logger.getLogger(ParoNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
        sonido.close();
    }

    public void validarcuantos(int p) {
        contador = contador + 1;
        switch (p) {

            case 5:
                Plabel1.setBackground(green);
                break;
            case 7:
                Plabel2.setBackground(green);
                break;
            case 9:
                Plabel3.setBackground(green);
                break;
            case 12:
                Plabel4.setBackground(green);
                break;
            case 15:
                Plabel5.setBackground(green);
                break;
            case 16:
                Plabel6.setBackground(green);
                break;
            case 18:
                Plabel7.setBackground(green);
                break;
            case 19:
                Plabel9.setBackground(green);
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
    private javax.swing.JLabel Plabel1;
    private javax.swing.JLabel Plabel2;
    private javax.swing.JLabel Plabel3;
    private javax.swing.JLabel Plabel4;
    private javax.swing.JLabel Plabel5;
    private javax.swing.JLabel Plabel6;
    private javax.swing.JLabel Plabel7;
    private javax.swing.JLabel Plabel9;
    private javax.swing.JButton arranqueNormal;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton correct1;
    private javax.swing.JButton correct10;
    private javax.swing.JButton correct11;
    private javax.swing.JButton correct12;
    private javax.swing.JButton correct13;
    private javax.swing.JButton correct14;
    private javax.swing.JButton correct15;
    private javax.swing.JButton correct16;
    private javax.swing.JButton correct17;
    private javax.swing.JButton correct2;
    private javax.swing.JButton correct21;
    private javax.swing.JButton correct23;
    private javax.swing.JButton correct3;
    private javax.swing.JButton correct4;
    private javax.swing.JButton correct5;
    private javax.swing.JButton correct6;
    private javax.swing.JButton correct7;
    private javax.swing.JButton correct8;
    private javax.swing.JButton correct9;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label23;
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