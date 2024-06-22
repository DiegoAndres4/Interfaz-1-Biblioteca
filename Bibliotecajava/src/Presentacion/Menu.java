/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Registro;
import Datos.Usuario;
import Datos.UsuarioLogin;

/**
 *
 * @author javier
 */
public class Menu extends javax.swing.JFrame {
Registro doc;
    /**
     * Creates new form Menu
     */
    public Menu(Usuario usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        doc=new Registro();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuIngresar = new javax.swing.JMenu();
        menuEliminar = new javax.swing.JMenu();
        MenuListar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 102));

        jMenu2.setText("Opciones");

        menuIngresar.setText("Seleccionar");
        menuIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuIngresarMouseClicked(evt);
            }
        });
        jMenu2.add(menuIngresar);

        menuEliminar.setText("Eliminar");
        menuEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEliminarMouseClicked(evt);
            }
        });
        jMenu2.add(menuEliminar);

        MenuListar.setText("Listar");
        MenuListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuListarMouseClicked(evt);
            }
        });
        jMenu2.add(MenuListar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("File");

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
      System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

    private void menuIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIngresarMouseClicked
       Ingresar in=new Ingresar();
       in.setVisible(true);
    
    }//GEN-LAST:event_menuIngresarMouseClicked

    private void menuEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEliminarMouseClicked
        Eliminar el=new Eliminar();
        el.setVisible(true);
        
    }//GEN-LAST:event_menuEliminarMouseClicked

    private void MenuListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuListarMouseClicked
        Listar li=new Listar();
        li.setVisible(true);
        
    }//GEN-LAST:event_MenuListarMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenu menuIngresar;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}