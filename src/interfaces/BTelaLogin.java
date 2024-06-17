package interfaces;

import model.Usuario;
import java.sql.ResultSet;
import dao.UsuarioDao;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.Administrador;

public class BTelaLogin extends javax.swing.JFrame {

    public BTelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbAdministrador = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DescarTech");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbAdministrador.setBackground(new java.awt.Color(0,0,0,1));
        cbAdministrador.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        cbAdministrador.setText("Administrador");
        cbAdministrador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbAdministrador.setContentAreaFilled(false);
        cbAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(cbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 140, 60));

        btnVoltar.setBackground(new java.awt.Color(0,0,0,1));
        btnVoltar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 180, 50));

        btnEntrar.setBackground(new java.awt.Color(0,0,0,1));
        btnEntrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 180, 50));

        txtSenha.setBackground(new java.awt.Color(24, 188, 97));
        txtSenha.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(249, 245, 249));
        txtSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 320, 50));

        txtNome.setBackground(new java.awt.Color(24, 188, 97));
        txtNome.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 320, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/2GIF Login.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (cbAdministrador.isSelected()){
            try {
            Administrador administrador = new Administrador();
            String apelido, senha;
            apelido = txtNome.getText();
            senha = new String(txtSenha.getPassword());

            administrador.setApelido(apelido);
            administrador.setSenha(senha);

            if (apelido.trim().equals("") || senha.trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos.");
            }
            else {
                UsuarioDao dao = new UsuarioDao();
                ResultSet rs = dao.autenticacaoAdministrador(administrador);

            if (rs.next()) {
                DTelaMenu tm = new DTelaMenu();
                tm.setVisible(true);

                this.dispose();
                }
            else {
                JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha inválido.");
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(rootPane, "TelaLogin" + erro);
        }
        }
        else {
        
        // Caso seja login de usuário, segue código abaixo.
        try {
            Usuario usuario = new Usuario();
            String nome, senha;
            nome = txtNome.getText();
            senha = new String(txtSenha.getPassword());

            usuario.setNome(nome);
            usuario.setSenha(senha);

            if (nome.trim().equals("") || senha.trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos.");
            }
            else {
                UsuarioDao dao = new UsuarioDao();
                ResultSet rs = dao.autenticacaoUsuario(usuario);

            if (rs.next()) {
                DTelaMenu tm = new DTelaMenu();
                tm.setVisible(true);

                this.dispose();
                }
            else {
                JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha inválido.");
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(rootPane, "TelaLogin" + erro);
        }

        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        ATelaApresentacao telaapresentacao = new ATelaApresentacao();
        telaapresentacao.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void cbAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdministradorActionPerformed
        
    }//GEN-LAST:event_cbAdministradorActionPerformed

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
            java.util.logging.Logger.getLogger(BTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BTelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox cbAdministrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
