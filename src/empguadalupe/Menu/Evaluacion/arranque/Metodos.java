/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empguadalupe.Menu.Evaluacion.arranque;

import static java.awt.SystemColor.text;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author lzambrs
 */
public class Metodos {
     String ruta = "archivo.txt";
 
   public void guardaDatos(String a) throws IOException { 
      
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true)));
            bw.write(a+"\r\n");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
      
            bw.write(a+"\r\n");
        }
        bw.close();
    }
   public void eliminar(){
        String ruta = "archivo.txt";
        File archivo = new File(ruta);
        archivo.delete();
    
   }
   
   public String[] muestraContenido(String archivo) throws FileNotFoundException, IOException {
      String cadena;
       String [] cad = new String[11];
      int i=1;    
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          
          cad[i]=cadena;
          i++;
         
      }
      b.close();
      cad[0]=String.valueOf(i);
      return cad;
}
   public void verificarNum(java.awt.event.KeyEvent evt,String a) { 

      
       if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
            {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            }
     int k = (int) evt.getKeyChar();
     if (a.length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de caracteres!!! (20)", "Validando Datos",
            JOptionPane.ERROR_MESSAGE);
     }
   }
   
      public void verificarTxt(java.awt.event.KeyEvent evt,String a) { 

      
        if(!Character.isAlphabetic(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
            {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            }
     int k = (int) evt.getKeyChar();
     if (a.length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de caracteres!!! (20)", "Validando Datos",
            JOptionPane.ERROR_MESSAGE);
     }
   }
      
       public static Stack<Integer> generaNumeroAleatorio(int minimo, int maximo) {
        int pos;
        int nCartas = 24;
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

} 
    

