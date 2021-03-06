/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabodega;
import Objetos.objeto;
import Registros.RegistroVenta;
import Conexion.conexion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public class GameEdit extends javax.swing.JFrame {

    String url="jdbc:mysql://localhost:3306/bd";
    String user="root";   //estamos iniciando la connecion a la base de datos
    String pass="";
    /**
     * Creates new form V_INGRESAR
     */
    public GameEdit() {
        initComponents();
        this.setLocationRelativeTo(null);
        ArrayList<objeto> listainventario = RegistroVenta.mostrarVentas();
        for (int i = 0; i < listainventario.size(); i++) {
            cbox_juego.addItem(listainventario.get(i).getNombre());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        na1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        nombre3 = new javax.swing.JLabel();
        txt_descrip = new javax.swing.JTextField();
        nombre4 = new javax.swing.JLabel();
        cboxtipo = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombre5 = new javax.swing.JLabel();
        cbox_juego = new javax.swing.JComboBox<>();
        fondopantalla1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jopciones = new javax.swing.JMenu();
        jmenu = new javax.swing.JMenuItem();
        jayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        na1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        na1.setForeground(new java.awt.Color(255, 255, 255));
        na1.setText("MODIFICAR INVENTARIO");
        getContentPane().add(na1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("NOMBRE :");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 210, -1));

        nombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setText("VALOR :");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));
        getContentPane().add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 210, -1));

        nombre3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre3.setForeground(new java.awt.Color(255, 255, 255));
        nombre3.setText("RESTRICCION :");
        getContentPane().add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));
        getContentPane().add(txt_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 210, -1));

        nombre4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre4.setForeground(new java.awt.Color(255, 255, 255));
        nombre4.setText("DESCRIPCION :");
        getContentPane().add(nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        cboxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "E", "E10+", "T", "M", "AO", "RP" }));
        cboxtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxtipoActionPerformed(evt);
            }
        });
        getContentPane().add(cboxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 210, -1));

        btn_guardar.setText("GUARDAR CAMBIOS");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 170, 30));

        jButton2.setText("LIMPIAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 170, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "serial", "nombre", "descripcion", "restriccion", "valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 480, 110));

        jButton3.setText("ACTUALIZAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FriendBot.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        nombre5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre5.setForeground(new java.awt.Color(255, 255, 255));
        nombre5.setText("JUEGO:");
        getContentPane().add(nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        cbox_juego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cbox_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_juegoActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 210, 20));

        fondopantalla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstract-Minimalist-Shapes-4k.jpg"))); // NOI18N
        getContentPane().add(fondopantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jopciones.setText("Opciones");
        jopciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        jmenu.setText("Menu");
        jmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuActionPerformed(evt);
            }
        });
        jopciones.add(jmenu);

        jMenuBar1.add(jopciones);

        jayuda.setText("Ayuda");
        jayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtnombre.setText(null);
        txt_descrip.setText(null);
        txt_valor.setText(null);
        cboxtipo.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String juego = cbox_juego.getSelectedItem().toString();
        String qry = "SELECT * FROM game WHERE nombre = '"+juego+"'";
        ArrayList<objeto> listainventario = RegistroVenta.mostrarValor(qry);
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        modelo.removeRow(modelo.getRowCount()-1);
        } 
        int resultado = 0;
        for (int i = 0; i < listainventario.size(); i++) {
            resultado = listainventario.get(i).getSerial();
        }
        String tipo = "";
        objeto o = new objeto();
        o.setSerial(resultado);
        o.setNombre(this.txtnombre.getText().trim());
        o.setDescripcion(this.txt_descrip.getText().trim());
        tipo = cboxtipo.getSelectedItem().toString();
        o.setRestriccion(tipo.trim());
        o.setValor(Integer.parseInt(this.txt_valor.getText().trim()));
        if(RegistroVenta.ModificarVenta(o,resultado))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Objeto Modificado :)");
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(this, "[ERROR] No pudo ser Modificado  :( ");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void cboxtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxtipoActionPerformed

    private void cbox_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_juegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_juegoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String juego = cbox_juego.getSelectedItem().toString();
        String qry = "SELECT * FROM game WHERE nombre = '"+juego+"'";
        ArrayList<objeto> listainventario = RegistroVenta.mostrarValor(qry);
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        modelo.removeRow(modelo.getRowCount()-1);
        } 
        String resultado = "";
        for (int i = 0; i < listainventario.size(); i++) {
            modelo.addRow(new Object[]{listainventario.get(i).getSerial(),listainventario.get(i).getNombre(),listainventario.get(i).getDescripcion(),
                                       listainventario.get(i).getRestriccion(),listainventario.get(i).getValor()});
            
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GameEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cbox_juego;
    private javax.swing.JComboBox<String> cboxtipo;
    private javax.swing.JLabel fondopantalla1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu jayuda;
    private javax.swing.JMenuItem jmenu;
    private javax.swing.JMenu jopciones;
    private javax.swing.JLabel na1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JTextField txt_descrip;
    private javax.swing.JTextField txt_valor;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
