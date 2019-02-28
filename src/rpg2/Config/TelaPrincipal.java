/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Config;

import java.awt.Color;
import javax.swing.*;
import rpg2.Inimigos.ADDInimigoView;
import rpg2.Sistema.Creditos;
import rpg2.Sistema.LoadingView;
import rpg2.Imagens.*;

/**
 *
 * @author M4ESTRO
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private static int tema = 1;
    private static int tipo = 2;
    private String[] frases = new String[3];
    private static ImageIcon imagem;
    ADDInimigoView configInimigos = new ADDInimigoView();

    public TelaPrincipal() {
        UIManager.put("nimbusBase", new Color(135, 0, 0));
        UIManager.put("nimbusBlueGrey", new Color(103, 81, 81));
        UIManager.put("control", new Color(212, 204, 207));
        initComponents();
    }

    public static int getTema() {
        return tema;
    }

    public static int getTipo() {
        return tipo;
    }

    public void config(int opcao) {
        switch (opcao) {
            case 2:
                frases[0] = "Levantando as pontes";
                frases[1] = "Alertando os paladinos";
                frases[2] = "Avistando Dragões";
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Medievais/Loading.jpg"));
                break;

            case 6:
                frases[0] = "Infectando a população";
                frases[1] = "Montando a equipe da Unreal";
                frases[2] = "Inicializando o inferno";
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 00.gif"));
                break;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroupTemas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBoxTema = new javax.swing.JComboBox<>();
        jButtonReiniciar = new javax.swing.JButton();
        jButtonCriar = new javax.swing.JButton();
        jComboBoxTemaTela = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpcao = new javax.swing.JMenu();
        jMenuConfigInimigo = new javax.swing.JMenu();
        jMenuCredito = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("R.P.G - System");
        setMinimumSize(new java.awt.Dimension(501, 280));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Configure o RPG a ser criado");

        jComboBoxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo de  RPG", "Genérico", "Medieval", "Steampunk", "Cyberpunk", "Vampiros & Lobisomens", "Unreal System" }));
        jComboBoxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTemaActionPerformed(evt);
            }
        });

        jButtonReiniciar.setText("Limpar");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jButtonCriar.setText("Criar");
        jButtonCriar.setEnabled(false);
        jButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarActionPerformed(evt);
            }
        });

        jComboBoxTemaTela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tema primeiro" }));
        jComboBoxTemaTela.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel2.setText("Tipo: ");

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel3.setText("Tema: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonReiniciar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCriar))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxTema, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBoxTemaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTemaTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReiniciar)
                    .addComponent(jButtonCriar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMenuOpcao.setText("Opções");

        jMenuConfigInimigo.setText("Inimigos");
        jMenuConfigInimigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConfigInimigoMouseClicked(evt);
            }
        });
        jMenuOpcao.add(jMenuConfigInimigo);

        jMenuBar1.add(jMenuOpcao);

        jMenuCredito.setText("Créditos");
        jMenuCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCreditoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCredito);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTemaActionPerformed
        int opcao = jComboBoxTema.getSelectedIndex();

        switch (opcao) {
            case 0:
                jButtonCriar.setEnabled(false);
                jComboBoxTemaTela.setModel(new DefaultComboBoxModel<>(TemasRPG.getLista(opcao)));
                jComboBoxTemaTela.setEnabled(false);
                jButtonCriar.setEnabled(false);
                break;

            case 1:
                jComboBoxTemaTela.setModel(new DefaultComboBoxModel<>(TemasRPG.getLista(opcao)));
                jComboBoxTemaTela.setEnabled(true);
                jButtonCriar.setEnabled(false);
                break;

            case 2:
                jComboBoxTemaTela.setModel(new DefaultComboBoxModel<>(TemasRPG.getLista(opcao)));
                jComboBoxTemaTela.setEnabled(true);
                jButtonCriar.setEnabled(true);
                break;

            case 3:
                jComboBoxTemaTela.setModel(new DefaultComboBoxModel<>(TemasRPG.getLista(opcao)));
                jComboBoxTemaTela.setEnabled(true);
                jButtonCriar.setEnabled(false);
                break;

            case 4:
                jComboBoxTemaTela.setModel(new DefaultComboBoxModel<>(TemasRPG.getLista(opcao)));
                jComboBoxTemaTela.setEnabled(true);
                jButtonCriar.setEnabled(false);
                break;

            case 5:
                jComboBoxTemaTela.setModel(new DefaultComboBoxModel<>(TemasRPG.getLista(opcao)));
                jComboBoxTemaTela.setEnabled(true);
                jButtonCriar.setEnabled(false);
                break;

            case 6:
                jComboBoxTemaTela.setModel(new DefaultComboBoxModel<>(TemasRPG.getLista(opcao)));
                jComboBoxTemaTela.setEnabled(true);
                jButtonCriar.setEnabled(true);

                break;
        }

        config(opcao);
    }//GEN-LAST:event_jComboBoxTemaActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        jComboBoxTema.setSelectedIndex(0);
        jComboBoxTemaTela.setSelectedIndex(0);
        jButtonCriar.setEnabled(false);
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void jButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarActionPerformed
        tema = jComboBoxTemaTela.getSelectedIndex() + 1;
        tipo = jComboBoxTema.getSelectedIndex();

        LoadingView load = new LoadingView(frases, tipo, tema, imagem);
        load.setEnabled(true);
        load.setVisible(true);
        load.toFront();
        this.dispose();
    }//GEN-LAST:event_jButtonCriarActionPerformed

    private void jMenuCreditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCreditoMouseClicked
        Creditos.creditos();
    }//GEN-LAST:event_jMenuCreditoMouseClicked

    private void jMenuConfigInimigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConfigInimigoMouseClicked
        configInimigos.setVisible(true);
        configInimigos.toFront();
    }//GEN-LAST:event_jMenuConfigInimigoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTemas;
    private javax.swing.JButton jButtonCriar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JComboBox<String> jComboBoxTema;
    private javax.swing.JComboBox<String> jComboBoxTemaTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfigInimigo;
    private javax.swing.JMenu jMenuCredito;
    private javax.swing.JMenu jMenuOpcao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
