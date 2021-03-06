/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabodega;

/**
 *
 * @author Javier
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Menu() {
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

        btnsalir = new javax.swing.JButton();
        btninrgesar = new javax.swing.JButton();
        btn_venta = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnbuscar1 = new javax.swing.JButton();
        fondopantalla = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jopciones = new javax.swing.JMenu();
        jmenu = new javax.swing.JMenuItem();
        jayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalir.setText("SALIR");
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        btninrgesar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btninrgesar.setForeground(new java.awt.Color(240, 240, 240));
        btninrgesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new_file.png"))); // NOI18N
        btninrgesar.setText("NEW GAME");
        btninrgesar.setContentAreaFilled(false);
        btninrgesar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninrgesar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btninrgesar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btninrgesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninrgesarActionPerformed(evt);
            }
        });
        getContentPane().add(btninrgesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 190));

        btn_venta.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_venta.setForeground(new java.awt.Color(240, 240, 240));
        btn_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Line_ui_icons_Svg-10_icon-icons.com_72171 (1).png"))); // NOI18N
        btn_venta.setText("SALE");
        btn_venta.setContentAreaFilled(false);
        btn_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_venta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_venta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 140, 190));

        btnmodificar.setBackground(new java.awt.Color(102, 102, 102));
        btnmodificar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(240, 240, 240));
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/writing_file.png"))); // NOI18N
        btnmodificar.setText("GAME EDIT");
        btnmodificar.setContentAreaFilled(false);
        btnmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmodificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 140, 190));

        btnbuscar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(240, 240, 240));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/my_documents.png"))); // NOI18N
        btnbuscar.setText("SEARCH GAME");
        btnbuscar.setBorder(null);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 190));

        btnbuscar1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnbuscar1.setForeground(new java.awt.Color(240, 240, 240));
        btnbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/my_documents.png"))); // NOI18N
        btnbuscar1.setText("SEARCH SALE");
        btnbuscar1.setBorder(null);
        btnbuscar1.setContentAreaFilled(false);
        btnbuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 140, 190));

        fondopantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstract-Minimalist-Shapes-4k.jpg"))); // NOI18N
        getContentPane().add(fondopantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 540));

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
    }//GEN-LAST:event_jmenuActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btninrgesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninrgesarActionPerformed
        // TODO add your handling code here:
        V_INGRESAR i=new V_INGRESAR();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btninrgesarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        Buscar b=new Buscar();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed
        // TODO add your handling code here:
        V_VENTA v = new V_VENTA();
        v.show();
        this.dispose();
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        // TODO add your handling code here:
            BuscarVenta b = new BuscarVenta();
            b.show();
            this.dispose();
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        GameEdit g = new GameEdit();
        g.show();
        this.dispose();
    }//GEN-LAST:event_btnmodificarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_venta;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton btninrgesar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel fondopantalla;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jayuda;
    private javax.swing.JMenuItem jmenu;
    private javax.swing.JMenu jopciones;
    // End of variables declaration//GEN-END:variables
}
