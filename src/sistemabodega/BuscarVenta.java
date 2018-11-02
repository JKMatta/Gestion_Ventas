/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabodega;

import Objetos.objeto;
import Registros.RegistroVenta;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import Conexion.conexion;
import Objetos.venta;

/**
 *
 * @author Javier
 */
public class BuscarVenta extends javax.swing.JFrame {
    
    String url="jdbc:mysql://localhost:3306/bd";
    String user="root";   //estamos iniciando la connecion a la base de datos
    String pass="";

    /**
     * Creates new form Buscar
     */
    public BuscarVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnbuscartodo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondopantalla = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jopciones = new javax.swing.JMenu();
        jmenu = new javax.swing.JMenuItem();
        jayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL", "CORREO", "JUEGO", "CANTIDAD", "VALOR"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 167, 910, 330));

        btnbuscartodo.setText("All View");
        btnbuscartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscartodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("SALE LIST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        fondopantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstract-Minimalist-Shapes-4k.jpg"))); // NOI18N
        getContentPane().add(fondopantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jopciones.setText("Opciones");

        jmenu.setText("Menu");
        jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuActionPerformed(evt);
            }
        });
        jopciones.add(jmenu);

        jMenuBar1.add(jopciones);

        jayuda.setText("Ayuda");
        jMenuBar1.add(jayuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmenuActionPerformed

    private void btnbuscartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscartodoActionPerformed
        // TODO add your handling code here:       
        ArrayList<venta> listaventa = RegistroVenta.mostrarCompraVentas();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        modelo.removeRow(modelo.getRowCount()-1);
        } 
        String resultado = "";
        for (int i = 0; i < listaventa.size(); i++) {
            modelo.addRow(new Object[]{listaventa.get(i).getId(),listaventa.get(i).getCorreo(),listaventa.get(i).getJuego(),
                                       listaventa.get(i).getCantidad(),listaventa.get(i).getTotal()});
            
            
        }
    }//GEN-LAST:event_btnbuscartodoActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscartodo;
    private javax.swing.JLabel fondopantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu jayuda;
    private javax.swing.JMenuItem jmenu;
    private javax.swing.JMenu jopciones;
    // End of variables declaration//GEN-END:variables
}
