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
public class CondicionesfrenosDESAPLICADOS extends javax.swing.JFrame {

    /**
     * Creates new form BombaRefrigeracion
     */
    public CondicionesfrenosDESAPLICADOS() throws IOException {
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONDICIONES INICIALES DESAPLICAR FRENOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 11, -1, 26));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Velocidad menor 1%");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 55, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgdiseño/color.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 400, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

	public static void main(String H[]) throws IOException
	{
		CondicionesfrenosDESAPLICADOS p = new CondicionesfrenosDESAPLICADOS();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
