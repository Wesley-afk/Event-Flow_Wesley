/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author h.moreira
 */
public class recuperar_user extends javax.swing.JFrame {

    /**
     * Creates new form Event_Flow
     */
    public recuperar_user() {
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

        jlbl_Salvar = new javax.swing.JLabel();
        jpswdf_Confirmar_Password = new javax.swing.JPasswordField();
        jlbl_Confirmar_Senha = new javax.swing.JLabel();
        jpswdf_Novo_Password = new javax.swing.JPasswordField();
        jlbl_Nova_Senha = new javax.swing.JLabel();
        jtxtf_Codigo_Confirmacao = new javax.swing.JTextField();
        jlbl_Codigo_Confirmacao = new javax.swing.JLabel();
        jlbl_por_que = new javax.swing.JLabel();
        jlbl_todo_mundo_quer_estar_no_centro = new javax.swing.JLabel();
        jlbl_da_festa = new javax.swing.JLabel();
        jlbl_Event = new javax.swing.JLabel();
        jlbl_Flow = new javax.swing.JLabel();
        jlbl_Logo_EF = new javax.swing.JLabel();
        jpnl_Fundo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 153));
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setForeground(new java.awt.Color(102, 0, 153));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(460, 640));
        setName("recuperar_user"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Salvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\src\\main\\java\\Imagens\\btn_salvar.png")); // NOI18N
        jlbl_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_SalvarMouseClicked(evt);
            }
        });
        getContentPane().add(jlbl_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jpswdf_Confirmar_Password.setBackground(new java.awt.Color(255, 255, 255));
        jpswdf_Confirmar_Password.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 10)); // NOI18N
        jpswdf_Confirmar_Password.setText("jPasswordField1");
        jpswdf_Confirmar_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpswdf_Confirmar_Password.setMinimumSize(new java.awt.Dimension(65, 25));
        jpswdf_Confirmar_Password.setPreferredSize(new java.awt.Dimension(65, 25));
        getContentPane().add(jpswdf_Confirmar_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 240, -1));

        jlbl_Confirmar_Senha.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Confirmar_Senha.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Confirmar_Senha.setText("Confirme a senha");
        getContentPane().add(jlbl_Confirmar_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jpswdf_Novo_Password.setBackground(new java.awt.Color(255, 255, 255));
        jpswdf_Novo_Password.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 10)); // NOI18N
        jpswdf_Novo_Password.setText("jPasswordField1");
        jpswdf_Novo_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpswdf_Novo_Password.setMinimumSize(new java.awt.Dimension(65, 25));
        jpswdf_Novo_Password.setPreferredSize(new java.awt.Dimension(65, 25));
        getContentPane().add(jpswdf_Novo_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 240, -1));

        jlbl_Nova_Senha.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Nova_Senha.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Nova_Senha.setText("Nova senha");
        getContentPane().add(jlbl_Nova_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jtxtf_Codigo_Confirmacao.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Codigo_Confirmacao.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 10)); // NOI18N
        jtxtf_Codigo_Confirmacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jtxtf_Codigo_Confirmacao.setMinimumSize(new java.awt.Dimension(65, 25));
        jtxtf_Codigo_Confirmacao.setPreferredSize(new java.awt.Dimension(65, 25));
        jtxtf_Codigo_Confirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_Codigo_ConfirmacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtf_Codigo_Confirmacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 240, -1));

        jlbl_Codigo_Confirmacao.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Codigo_Confirmacao.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Codigo_Confirmacao.setText("Código confirmação");
        getContentPane().add(jlbl_Codigo_Confirmacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jlbl_por_que.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_por_que.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_por_que.setText("Por que ");
        getContentPane().add(jlbl_por_que, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jlbl_todo_mundo_quer_estar_no_centro.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_todo_mundo_quer_estar_no_centro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_todo_mundo_quer_estar_no_centro.setText("todo mundo quer estar no centro");
        getContentPane().add(jlbl_todo_mundo_quer_estar_no_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jlbl_da_festa.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_da_festa.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_da_festa.setText("da festa");
        getContentPane().add(jlbl_da_festa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jlbl_Event.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_Event.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        jlbl_Event.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Event.setText("EVENT");
        getContentPane().add(jlbl_Event, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, -1));

        jlbl_Flow.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Flow.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        jlbl_Flow.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Flow.setText("FLOW");
        getContentPane().add(jlbl_Flow, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 180, -1));

        jlbl_Logo_EF.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\src\\main\\java\\Imagens\\logo.png")); // NOI18N
        getContentPane().add(jlbl_Logo_EF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jpnl_Fundo.setBackground(java.awt.Color.darkGray);
        getContentPane().add(jpnl_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtf_Codigo_ConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_Codigo_ConfirmacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_Codigo_ConfirmacaoActionPerformed

    private void jlbl_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_SalvarMouseClicked
        home telaHomer = new home();
        telaHomer.setVisible(true);
        recuperar_user.this.dispose();
    }//GEN-LAST:event_jlbl_SalvarMouseClicked

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
            java.util.logging.Logger.getLogger(recuperar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recuperar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recuperar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recuperar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recuperar_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbl_Codigo_Confirmacao;
    private javax.swing.JLabel jlbl_Confirmar_Senha;
    private javax.swing.JLabel jlbl_Event;
    private javax.swing.JLabel jlbl_Flow;
    private javax.swing.JLabel jlbl_Logo_EF;
    private javax.swing.JLabel jlbl_Nova_Senha;
    private javax.swing.JLabel jlbl_Salvar;
    private javax.swing.JLabel jlbl_da_festa;
    private javax.swing.JLabel jlbl_por_que;
    private javax.swing.JLabel jlbl_todo_mundo_quer_estar_no_centro;
    private javax.swing.JPanel jpnl_Fundo;
    private javax.swing.JPasswordField jpswdf_Confirmar_Password;
    private javax.swing.JPasswordField jpswdf_Novo_Password;
    private javax.swing.JTextField jtxtf_Codigo_Confirmacao;
    // End of variables declaration//GEN-END:variables
}