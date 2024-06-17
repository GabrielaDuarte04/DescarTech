package interfaces;

import dao.UsuarioDao;
import javax.swing.JOptionPane;

public class ATelaApresentacao extends javax.swing.JFrame {

    public ATelaApresentacao() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnVisitante = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imgIncio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DescarTech");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(0,0,0,1));
        btnLogin.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 170, 50));

        btnVisitante.setBackground(new java.awt.Color(0,0,0,1));
        btnVisitante.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnVisitante.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitante.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVisitante.setBorderPainted(false);
        btnVisitante.setContentAreaFilled(false);
        btnVisitante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 170, 50));

        btnCadastro.setBackground(new java.awt.Color(0,0,0,1));
        btnCadastro.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 34)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 190, 50));

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
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/9GIF Complementar.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 520, 650));

        imgIncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/1GIF Inicio.gif"))); // NOI18N
        getContentPane().add(imgIncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitanteActionPerformed
        HTelaVisitante tv = new HTelaVisitante();
        tv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVisitanteActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        CTelaCadastro tc = new CTelaCadastro();
        tc.setVisible(true);
                
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        BTelaLogin tl = new BTelaLogin();
        tl.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        ATelaApresentacao telaapresentacao = new ATelaApresentacao();
        telaapresentacao.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATelaApresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnVisitante;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgIncio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}