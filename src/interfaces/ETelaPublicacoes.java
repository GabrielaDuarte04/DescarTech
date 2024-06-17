package interfaces;

import java.util.Scanner;
import javax.swing.JOptionPane;
import tabelas.TabelaAdministrador;
import tabelas.TabelaUsuario;

public class ETelaPublicacoes extends javax.swing.JFrame {

    public ETelaPublicacoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnColeta = new javax.swing.JButton();
        btnInformacao = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DescarTech");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/5GIF Publicacao.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnHome.setBackground(new java.awt.Color(0,0,0,1));
        btnHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 80, 30));

        btnColeta.setBackground(new java.awt.Color(0,0,0,1));
        btnColeta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnColeta.setBorderPainted(false);
        btnColeta.setContentAreaFilled(false);
        btnColeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnColeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 90, 30));

        btnInformacao.setBackground(new java.awt.Color(0,0,0,1));
        btnInformacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInformacao.setBorderPainted(false);
        btnInformacao.setContentAreaFilled(false);
        btnInformacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 170, 30));

        comboBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 23)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desconectar-se", "Central de Suporte", "Membros", "Administradores" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, 210, -1));

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        DTelaMenu tm = new DTelaMenu();
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColetaActionPerformed
        FTelaColetas tc = new FTelaColetas();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnColetaActionPerformed

    private void btnInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacaoActionPerformed
        TelaSuporte ts = new TelaSuporte();
        ts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInformacaoActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        DTelaMenu testacombo = new DTelaMenu();
        Scanner sc = new Scanner(System.in);
        String contrasenha = "pimba";
        int Desconectar = comboBox.getSelectedIndex();
        int Suporte = comboBox.getSelectedIndex();
        int Membro = comboBox.getSelectedIndex();
        int Administrador = comboBox.getSelectedIndex();

        if (Desconectar == 0){
            BTelaLogin tl = new BTelaLogin();
            tl.setVisible(true);
            this.dispose();
        }
        else if (Suporte == 1){
            TelaSuporte ts = new TelaSuporte();
            ts.setVisible(true);
            this.dispose();
        }
        else if (Membro == 2){
            TabelaUsuario tu = new TabelaUsuario();
            tu.setVisible(true);
        }
        else if (Administrador == 3){
            String tentativa = JOptionPane.showInputDialog(null, "Digite a Senha de Segurança");
            if (tentativa.equals(contrasenha)) {
                JOptionPane.showMessageDialog(null, "Senha Correta.");
                TabelaAdministrador ta = new TabelaAdministrador();
                ta.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Senha de Segurança Incorreta.", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_comboBoxActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ETelaPublicacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColeta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInformacao;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
