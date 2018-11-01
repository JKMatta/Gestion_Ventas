
package sistemabodega;
import Controlador.Correo;
import Controlador.Controlador;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Login extends javax.swing.JFrame {
    
    Correo c=new Correo();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void HeOlvidadoLaCuenta(){
        c.setContraseña("ymzzmvzgxqymatrb");
        c.setUsuariocorreo("bodegatemporalcuadroverde@gmail.com");
        c.setAsunto("Recuperar Contraseña");
        c.setMensaje("Hola. Te quiero informar que tu contraseña es [BNX66K318143] y tu Usuario es [jcarlos]. Suerte. :)");
        c.setDestino(txt_correo.getText());
        c.setNombreArchivo("FriendBot.png");
        c.setRutaArchivo("FriendBot.png");
        Controlador co=new Controlador();
        co.enviarCorreo(c);
        if(co.enviarCorreo(c)){
            JOptionPane.showMessageDialog(null, "Envio Correo");
        }else{
           JOptionPane.showMessageDialog(null, "Error"); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        btnayuda = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btniniciarsesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondopantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(748, 421));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("DondePanxitoGames");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("USUARIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        txt_correo.setBackground(new java.awt.Color(0, 0, 0));
        txt_correo.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 280, 30));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 280, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("CONTRASEÑA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 280, -1));

        btnayuda.setText("HE OLVIDADO LA CONTRASEÑA");
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 200, 20));

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        btniniciarsesion.setText("INICIAR SESION");
        btniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsesionActionPerformed(evt);
            }
        });
        getContentPane().add(btniniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 180, -1));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FriendBot.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 20, -1, -1));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FriendBot.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        fondopantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/black-abstract-wallpaper-minimalism-triangle-black-abstract-wallpaper-desktop-background-black-and-red-abstract-wallpaper-4k.jpg"))); // NOI18N
        getContentPane().add(fondopantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
        // TODO add your handling code here:
        HeOlvidadoLaCuenta();
    }//GEN-LAST:event_btnayudaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsesionActionPerformed
        // TODO add your handling code here:
    String u1="javier";
    String c1="Camaro007";
    String u2="jcarlos";
    String c2="BNX66K318143";
    
    String pass=new String(txtcontraseña.getPassword());
    
    if(txtusuario.getText().equals(u1)&& pass.equals(c1)){
        Menu m=new Menu();
        m.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Bienvenido "+txtusuario.getText().trim());
        }
    
    if(txtusuario.getText().equals(u2)&& pass.equals(c2)){
        Menu m=new Menu();
        m.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Bienvenido "+txtusuario.getText().trim());
        }
    
    else{
           JOptionPane.showMessageDialog(null, "Usuario/Contraseña Incorrecta");
           JOptionPane.showMessageDialog(null, "Si el error persiste, Contacte con el administrador");
    }

    }//GEN-LAST:event_btniniciarsesionActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnayuda;
    private javax.swing.JButton btniniciarsesion;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel fondopantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
