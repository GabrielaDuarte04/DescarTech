package interfaces;

import dao.UsuarioDao;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.Administrador;
import model.Usuario;

public class CTelaCadastro extends javax.swing.JFrame {

    public CTelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbAdministrador = new javax.swing.JCheckBox();
        txtNome = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtConfirme = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DescarTech");
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
        getContentPane().add(cbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 140, 60));

        txtNome.setBackground(new java.awt.Color(24, 188, 97));
        txtNome.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.setOpaque(true);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 290, 40));

        btnVoltar.setBackground(new java.awt.Color(0,0,0,1));
        btnVoltar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 180, 50));

        btnCadastrar.setBackground(new java.awt.Color(0,0,0,1));
        btnCadastrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 180, 50));

        txtEmail.setBackground(new java.awt.Color(24, 188, 97));
        txtEmail.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 280, 50));

        txtCelular.setBackground(new java.awt.Color(24, 188, 97));
        txtCelular.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(255, 255, 255));
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCelular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 280, 50));

        txtConfirme.setBackground(new java.awt.Color(24, 188, 97));
        txtConfirme.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        txtConfirme.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirme.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirme.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(txtConfirme, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 280, 40));

        txtSenha.setBackground(new java.awt.Color(24, 188, 97));
        txtSenha.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/3GIF Cadastro.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
  
        String nome, celular, email, senha, confirme;
        
            if (cbAdministrador.isSelected()) {
            
            Administrador administrador = new Administrador();  
        
        nome = (txtNome.getText());
        celular = (txtCelular.getText());
        email = (txtEmail.getText());
        senha = new String(txtSenha.getPassword());
        confirme = new String (txtConfirme.getPassword());
            
        if (nome.trim().equals("") || celular.trim().equals("")
        || email.trim().equals("") || senha.trim().equals("") || confirme.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos.");
        }
        else if(!senha.equals(confirme)){
        JOptionPane.showMessageDialog(rootPane, "A Senha não confere.");
        }
        else {
            
            Scanner sc = new Scanner(System.in);
            String contrasenha = "pimba";
            String tentativa = JOptionPane.showInputDialog(null, "Digite a Senha de Segurança");

            if (tentativa.equals(contrasenha)) {
                JOptionPane.showMessageDialog(null, "Senha Correta.");
            
            administrador.setApelido(txtNome.getText());
            administrador.setCelular(txtCelular.getText());
            administrador.setEmail(txtEmail.getText());
            administrador.setSenha(senha);
            UsuarioDao dao = new UsuarioDao();
            dao.adicionaAdministrador(administrador);
            JOptionPane.showMessageDialog(rootPane, "Administrador cadastrado com sucesso!");

        BTelaLogin telalogin = new BTelaLogin();
        telalogin.setVisible(true);
        this.dispose();
        }    
        else {
            JOptionPane.showMessageDialog(null, "Senha de Segurança Incorreta.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }
            
        else {
            
        // Se não for Administrador então segue a linha abaixo.
           
        Usuario usuario = new Usuario();  
        
        nome = (txtNome.getText());
        celular = (txtCelular.getText());
        email = (txtEmail.getText());
        senha = new String(txtSenha.getPassword());
        confirme = new String(txtConfirme.getPassword());
        
        if (nome.trim().equals("") || celular.trim().equals("")
        || email.trim().equals("") || senha.trim().equals("") || confirme.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos.");
        }
        else if (!senha.equals(confirme)){
        JOptionPane.showMessageDialog(rootPane, "A Senha não confere.");
        }
        else {
            usuario.setNome(txtNome.getText());
            usuario.setCelular(txtCelular.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setSenha(senha);
            UsuarioDao dao = new UsuarioDao();
            dao.adicionaUsuario(usuario);
            JOptionPane.showMessageDialog(rootPane, "Usuario cadastrado com sucesso!");

        BTelaLogin telalogin = new BTelaLogin();
        telalogin.setVisible(true);
        this.dispose();
        }
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja sair do cadastro?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (resposta==JOptionPane.YES_OPTION) {
        BTelaLogin telalogin = new BTelaLogin();
        telalogin.setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cbAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdministradorActionPerformed
        
    }//GEN-LAST:event_cbAdministradorActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CTelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox cbAdministrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtConfirme;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
