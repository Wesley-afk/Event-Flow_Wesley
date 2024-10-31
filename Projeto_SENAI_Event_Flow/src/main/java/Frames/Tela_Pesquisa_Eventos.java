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

/**
 *
 * @author m.schmidt
 */
public class Tela_Pesquisa_Eventos extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Pesquisa_Eventos
     */
    public Tela_Pesquisa_Eventos() {
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

        jPanel1 = new javax.swing.JPanel();
        Jtxt_Pesquisar_Tela_Pesquisa_Eventos = new javax.swing.JTextField();
        Jlbl_IconeLupa_Tela_Pesquisa_Eventos = new javax.swing.JLabel();
        Jbtn_codigo_Tela_Pesquisa_Eventos = new javax.swing.JButton();
        Jbtn_Titulo_Tela_Pesquisa_Eventos = new javax.swing.JButton();
        Jbtn_Tipo_Tela_Pesquisa_Eventos = new javax.swing.JButton();
        Jbtn_status_Tela_Pesquisa_Eventos = new javax.swing.JButton();
        jPanel_Tipo_Evento = new javax.swing.JPanel();
        jLabel_Tipo_Evento = new javax.swing.JLabel();
        jPanel_Data_Evento = new javax.swing.JPanel();
        jLabel_Data_Evento = new javax.swing.JLabel();
        jPanel_Titulo_Evento = new javax.swing.JPanel();
        jLabel_Titulo_Evento = new javax.swing.JLabel();
        jPanel_Status_Evento = new javax.swing.JPanel();
        jLabel_Status_Evento = new javax.swing.JLabel();
        Jsp_TabelaEventos_Tela_Pesquisa_Eventos = new javax.swing.JScrollPane();
        Tabela_Eventos = new javax.swing.JTable();
        Jlbl_Status = new javax.swing.JLabel();
        Jlbl_Background_Tela_Pesquisa_Eventos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 612));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jtxt_Pesquisar_Tela_Pesquisa_Eventos.setBackground(new java.awt.Color(255, 255, 255));
        Jtxt_Pesquisar_Tela_Pesquisa_Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_Pesquisar_Tela_Pesquisa_EventosActionPerformed(evt);
            }
        });
        getContentPane().add(Jtxt_Pesquisar_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 550, 40));

        Jlbl_IconeLupa_Tela_Pesquisa_Eventos.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.schmidt\\Desktop\\Event Flow\\Projeto_SENAI_Event_Flow\\src\\main\\java\\Imagens\\icone_lupa1.png")); // NOI18N
        getContentPane().add(Jlbl_IconeLupa_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 30, 40));

        Jbtn_codigo_Tela_Pesquisa_Eventos.setBackground(new java.awt.Color(135, 79, 255));
        Jbtn_codigo_Tela_Pesquisa_Eventos.setText("CODIGO");
        Jbtn_codigo_Tela_Pesquisa_Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_codigo_Tela_Pesquisa_EventosActionPerformed(evt);
            }
        });
        getContentPane().add(Jbtn_codigo_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, -1));

        Jbtn_Titulo_Tela_Pesquisa_Eventos.setBackground(new java.awt.Color(135, 79, 255));
        Jbtn_Titulo_Tela_Pesquisa_Eventos.setText("TITULO");
        Jbtn_Titulo_Tela_Pesquisa_Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Titulo_Tela_Pesquisa_EventosActionPerformed(evt);
            }
        });
        getContentPane().add(Jbtn_Titulo_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 90, 150, -1));

        Jbtn_Tipo_Tela_Pesquisa_Eventos.setBackground(new java.awt.Color(135, 79, 255));
        Jbtn_Tipo_Tela_Pesquisa_Eventos.setText("TIPO");
        Jbtn_Tipo_Tela_Pesquisa_Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Tipo_Tela_Pesquisa_EventosActionPerformed(evt);
            }
        });
        getContentPane().add(Jbtn_Tipo_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 90, 150, -1));

        Jbtn_status_Tela_Pesquisa_Eventos.setBackground(new java.awt.Color(135, 79, 255));
        Jbtn_status_Tela_Pesquisa_Eventos.setText("STATUS");
        Jbtn_status_Tela_Pesquisa_Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_status_Tela_Pesquisa_EventosActionPerformed(evt);
            }
        });
        getContentPane().add(Jbtn_status_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 90, 140, -1));

        jPanel_Tipo_Evento.add(jLabel_Tipo_Evento);

        getContentPane().add(jPanel_Tipo_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, 30));

        jPanel_Data_Evento.add(jLabel_Data_Evento);

        getContentPane().add(jPanel_Data_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 120, 30));

        jPanel_Titulo_Evento.add(jLabel_Titulo_Evento);

        getContentPane().add(jPanel_Titulo_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 130, 30));

        jPanel_Status_Evento.add(jLabel_Status_Evento);

        getContentPane().add(jPanel_Status_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 30));

        Tabela_Eventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TITULO", "TIPO", "STATUS", "DATA"
            }
        ));
        Jsp_TabelaEventos_Tela_Pesquisa_Eventos.setViewportView(Tabela_Eventos);

        getContentPane().add(Jsp_TabelaEventos_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 650, 90));

        Jlbl_Status.setToolTipText("");
        getContentPane().add(Jlbl_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 250, -1));

        Jlbl_Background_Tela_Pesquisa_Eventos.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.schmidt\\Desktop\\Event Flow\\Projeto_SENAI_Event_Flow\\src\\main\\java\\Imagens\\jpnl_fundo.png")); // NOI18N
        getContentPane().add(Jlbl_Background_Tela_Pesquisa_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 920, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtxt_Pesquisar_Tela_Pesquisa_EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_Pesquisar_Tela_Pesquisa_EventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_Pesquisar_Tela_Pesquisa_EventosActionPerformed

    private void Jbtn_codigo_Tela_Pesquisa_EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_codigo_Tela_Pesquisa_EventosActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            Connection conexao = null;
            PreparedStatement statement = null;

            String url = "jdbc:mysql://127.0.0.1:3306/EventFlow";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "SELECT TituloEvento,TipoEvento,StatusEvento,DataEvento FROM Evento WHERE ID_Evento = ?";

            statement = conexao.prepareStatement(sql);

            statement.setString(1, Jtxt_Pesquisar_Tela_Pesquisa_Eventos.getText());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Jlbl_Status.setText("Cadastro Encontrado");
                String titulo_evento = resultSet.getString("TituloEvento");
                String tipo_evento = resultSet.getString("TipoEvento");
                String status_evento = resultSet.getString("StatusEvento");
                String data_evento = resultSet.getString("DataEvento");

                jLabel_Titulo_Evento.setText(titulo_evento);
                jLabel_Tipo_Evento.setText(tipo_evento);
                jLabel_Status_Evento.setText(status_evento);
                jLabel_Data_Evento.setText(data_evento);
            } else {
                Jlbl_Status.setText("Cadastro Não Encontrado");
            }

            resultSet.close();
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Jbtn_codigo_Tela_Pesquisa_EventosActionPerformed

    private void Jbtn_Titulo_Tela_Pesquisa_EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Titulo_Tela_Pesquisa_EventosActionPerformed
        // TODO add your handling code here:
        try {

            Connection conexao = null;
            PreparedStatement statement = null;

            String url = "jdbc:mysql://127.0.0.1:3306/EventFlow";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "SELECT TituloEvento,TipoEvento,StatusEvento,DataEvento FROM Evento WHERE TituloEvento LIKE ?";

            statement = conexao.prepareStatement(sql);

            statement.setString(1, Jtxt_Pesquisar_Tela_Pesquisa_Eventos.getText());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Jlbl_Status.setText("Cadastro Encontrado");
                String titulo_evento = resultSet.getString("TituloEvento");
                String tipo_evento = resultSet.getString("TipoEvento");
                String status_evento = resultSet.getString("StatusEvento");
                String data_evento = resultSet.getString("DataEvento");

                jLabel_Titulo_Evento.setText(titulo_evento);
                jLabel_Tipo_Evento.setText(tipo_evento);
                jLabel_Status_Evento.setText(status_evento);
                jLabel_Data_Evento.setText(data_evento);
            } else {
                Jlbl_Status.setText("Cadastro Não Encontrado");
            }

            resultSet.close();
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Jbtn_Titulo_Tela_Pesquisa_EventosActionPerformed

    private void Jbtn_Tipo_Tela_Pesquisa_EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Tipo_Tela_Pesquisa_EventosActionPerformed
        // TODO add your handling code here:
        try {

            Connection conexao = null;
            PreparedStatement statement = null;

            String url = "jdbc:mysql://127.0.0.1:3306/EventFlow";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "SELECT TituloEvento,TipoEvento,StatusEvento,DataEvento FROM Evento WHERE TipoEvento = ?";

            statement = conexao.prepareStatement(sql);

            statement.setString(1, Jtxt_Pesquisar_Tela_Pesquisa_Eventos.getText());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Jlbl_Status.setText("Cadastro Encontrado");
                String titulo_evento = resultSet.getString("TituloEvento");
                String tipo_evento = resultSet.getString("TipoEvento");
                String status_evento = resultSet.getString("StatusEvento");
                String data_evento = resultSet.getString("DataEvento");

                jLabel_Titulo_Evento.setText(titulo_evento);
                jLabel_Tipo_Evento.setText(tipo_evento);
                jLabel_Status_Evento.setText(status_evento);
                jLabel_Data_Evento.setText(data_evento);
            } else {
                Jlbl_Status.setText("Cadastro Não Encontrado");
            }

            resultSet.close();
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Jbtn_Tipo_Tela_Pesquisa_EventosActionPerformed

    private void Jbtn_status_Tela_Pesquisa_EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_status_Tela_Pesquisa_EventosActionPerformed
        // TODO add your handling code here:
                try {

            Connection conexao = null;
            PreparedStatement statement = null;

            String url = "jdbc:mysql://127.0.0.1:3306/EventFlow";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);

            String sql = "SELECT TituloEvento,TipoEvento,StatusEvento,DataEvento FROM Evento WHERE StatusEvento = ?";

            statement = conexao.prepareStatement(sql);

            statement.setString(1, Jtxt_Pesquisar_Tela_Pesquisa_Eventos.getText());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Jlbl_Status.setText("Cadastro Encontrado");
                String titulo_evento = resultSet.getString("TituloEvento");
                String tipo_evento = resultSet.getString("TipoEvento");
                String status_evento = resultSet.getString("StatusEvento");
                String data_evento = resultSet.getString("DataEvento");

                jLabel_Titulo_Evento.setText(titulo_evento);
                jLabel_Tipo_Evento.setText(tipo_evento);
                jLabel_Status_Evento.setText(status_evento);
                jLabel_Data_Evento.setText(data_evento);
            } else {
                Jlbl_Status.setText("Cadastro Não Encontrado");
            }

            resultSet.close();
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Jbtn_status_Tela_Pesquisa_EventosActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Pesquisa_Eventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Tipo_Tela_Pesquisa_Eventos;
    private javax.swing.JButton Jbtn_Titulo_Tela_Pesquisa_Eventos;
    private javax.swing.JButton Jbtn_codigo_Tela_Pesquisa_Eventos;
    private javax.swing.JButton Jbtn_status_Tela_Pesquisa_Eventos;
    private javax.swing.JLabel Jlbl_Background_Tela_Pesquisa_Eventos;
    private javax.swing.JLabel Jlbl_IconeLupa_Tela_Pesquisa_Eventos;
    private javax.swing.JLabel Jlbl_Status;
    private javax.swing.JScrollPane Jsp_TabelaEventos_Tela_Pesquisa_Eventos;
    private javax.swing.JTextField Jtxt_Pesquisar_Tela_Pesquisa_Eventos;
    private javax.swing.JTable Tabela_Eventos;
    private javax.swing.JLabel jLabel_Data_Evento;
    private javax.swing.JLabel jLabel_Status_Evento;
    private javax.swing.JLabel jLabel_Tipo_Evento;
    private javax.swing.JLabel jLabel_Titulo_Evento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Data_Evento;
    private javax.swing.JPanel jPanel_Status_Evento;
    private javax.swing.JPanel jPanel_Tipo_Evento;
    private javax.swing.JPanel jPanel_Titulo_Evento;
    // End of variables declaration//GEN-END:variables
}
