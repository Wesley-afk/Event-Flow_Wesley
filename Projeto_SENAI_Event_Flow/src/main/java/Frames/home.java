/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author m.intra
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtn_Cadastrar = new javax.swing.JButton();
        jlbl_Email = new javax.swing.JLabel();
        jtxtf_Email = new javax.swing.JTextField();
        jlbl_Senha = new javax.swing.JLabel();
        jpswdf_Password = new javax.swing.JPasswordField();
        jckb_Lembrar_Senha = new javax.swing.JCheckBox();
        jbtn_Entrar = new javax.swing.JButton();
        jlbl_recuperar_acesso = new javax.swing.JLabel();
        jbtn_Enviar = new javax.swing.JButton();
        jlbl_da_festa = new javax.swing.JLabel();
        jlbl_por_que = new javax.swing.JLabel();
        jlbl_Event = new javax.swing.JLabel();
        jlbl_Branco = new javax.swing.JLabel();
        jlbl_Flow = new javax.swing.JLabel();
        jlbl_todo_mundo_quer_estar_no_centro = new javax.swing.JLabel();
        jlbl_Logo_EF = new javax.swing.JLabel();
        jlbl_Roxo = new javax.swing.JLabel();
        jpnl_Fundo = new javax.swing.JLabel();

        jPasswordField2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jPasswordField2.setText("jPasswordField1");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel2.setText("senha");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel8.setText("Por que todo mundo quer estar no centro da festa");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel9.setText("Por que todo mundo quer estar no centro da festa");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel10.setText("Por que todo mundo quer estar no centro da festa");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(113, 100, 100));
        setMinimumSize(new java.awt.Dimension(920, 612));
        setName("frame_home"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_Cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Cadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtn_Cadastrar.setForeground(new java.awt.Color(135, 79, 255));
        jbtn_Cadastrar.setLabel("cadastrar");
        jbtn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        jlbl_Email.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Email.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Email.setText("Email");
        getContentPane().add(jlbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jtxtf_Email.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtf_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 180, -1));

        jlbl_Senha.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Senha.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Senha.setText("Senha");
        getContentPane().add(jlbl_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jpswdf_Password.setBackground(new java.awt.Color(255, 255, 255));
        jpswdf_Password.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jpswdf_Password.setText("  ");
        getContentPane().add(jpswdf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 180, -1));

        jckb_Lembrar_Senha.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jckb_Lembrar_Senha.setForeground(new java.awt.Color(255, 255, 255));
        jckb_Lembrar_Senha.setText("Lembrar senha");
        jckb_Lembrar_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jckb_Lembrar_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jckb_Lembrar_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jbtn_Entrar.setBackground(new java.awt.Color(135, 79, 255));
        jbtn_Entrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtn_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Entrar.setLabel("entrar");
        jbtn_Entrar.setMaximumSize(new java.awt.Dimension(75, 25));
        jbtn_Entrar.setMinimumSize(new java.awt.Dimension(75, 25));
        jbtn_Entrar.setPreferredSize(new java.awt.Dimension(75, 25));
        jbtn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 90, -1));

        jlbl_recuperar_acesso.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jlbl_recuperar_acesso.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_recuperar_acesso.setText("envie email para recuperar acesso");
        getContentPane().add(jlbl_recuperar_acesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, 20));

        jbtn_Enviar.setBackground(new java.awt.Color(135, 79, 255));
        jbtn_Enviar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Enviar.setText("enviar");
        jbtn_Enviar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, 20));

        jlbl_da_festa.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_da_festa.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_da_festa.setText("da festa");
        getContentPane().add(jlbl_da_festa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jlbl_por_que.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_por_que.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_por_que.setText("Por que ");
        getContentPane().add(jlbl_por_que, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        jlbl_por_que.getAccessibleContext().setAccessibleName("Por que todo mundo quer estar no centro da festa");

        jlbl_Event.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_Event.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        jlbl_Event.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Event.setText("EVENT");
        getContentPane().add(jlbl_Event, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 200, -1));
        getContentPane().add(jlbl_Branco, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 290, -1));

        jlbl_Flow.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Flow.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        jlbl_Flow.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Flow.setText("FLOW");
        getContentPane().add(jlbl_Flow, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 180, -1));

        jlbl_todo_mundo_quer_estar_no_centro.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_todo_mundo_quer_estar_no_centro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_todo_mundo_quer_estar_no_centro.setText("todo mundo quer estar no centro");
        getContentPane().add(jlbl_todo_mundo_quer_estar_no_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));
        getContentPane().add(jlbl_Logo_EF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));
        getContentPane().add(jlbl_Roxo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 190, 320, -1));

        jpnl_Fundo.setFocusable(false);
        jpnl_Fundo.setInheritsPopupMenu(false);
        getContentPane().add(jpnl_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_CadastrarActionPerformed
        cadastro_user cadastroUser = new cadastro_user();
        cadastroUser.setVisible(true);
        home.this.dispose();
    }//GEN-LAST:event_jbtn_CadastrarActionPerformed

    private void jckb_Lembrar_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jckb_Lembrar_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jckb_Lembrar_SenhaActionPerformed

    private void jtxtf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_EmailActionPerformed

    private void jbtn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_EntrarActionPerformed

        try {
            Connection conexao = null;
            PreparedStatement statement = null;
            
            String url = "jdbc:mysql://127.0.0.1:3306/EventFlow";
            String user = "root";
            String password = "";
            
            conexao = DriverManager.getConnection(url, user, password);
            String sql = "SELECT Nome_Usuario FROM Usuario WHERE Email_Usuario = ? AND Senha = ?";
            
            statement = conexao.prepareStatement(sql);
            statement.setString(1, jtxtf_Email.getText());  //Email_Usuario
            statement.setString(2, jpswdf_Password.getText()); //Senha
            
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                  Dashboard dashboard = new Dashboard();
                  dashboard.setVisible(true);
                  this.dispose(); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario não encontrado.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtn_EntrarActionPerformed

    private void jbtn_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_EnviarActionPerformed
        recuperar_user recuperarUser = new recuperar_user();
        recuperarUser.setVisible(true);
        home.this.dispose();
    }//GEN-LAST:event_jbtn_EnviarActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JButton jbtn_Cadastrar;
    private javax.swing.JButton jbtn_Entrar;
    private javax.swing.JButton jbtn_Enviar;
    private javax.swing.JCheckBox jckb_Lembrar_Senha;
    private javax.swing.JLabel jlbl_Branco;
    private javax.swing.JLabel jlbl_Email;
    private javax.swing.JLabel jlbl_Event;
    private javax.swing.JLabel jlbl_Flow;
    private javax.swing.JLabel jlbl_Logo_EF;
    private javax.swing.JLabel jlbl_Roxo;
    private javax.swing.JLabel jlbl_Senha;
    private javax.swing.JLabel jlbl_da_festa;
    private javax.swing.JLabel jlbl_por_que;
    private javax.swing.JLabel jlbl_recuperar_acesso;
    private javax.swing.JLabel jlbl_todo_mundo_quer_estar_no_centro;
    private javax.swing.JLabel jpnl_Fundo;
    private javax.swing.JPasswordField jpswdf_Password;
    private javax.swing.JTextField jtxtf_Email;
    // End of variables declaration//GEN-END:variables
}
