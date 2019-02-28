/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Inimigos;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import rpg2.Ficha.Codigo;
import rpg2.Sistema.FundoTelas;
import rpg2.Imagens.Imagens;
import rpg2.Sistema.PegaData;
import rpg2.Sistema.Tela;

/**
 *
 * @author M4ESTRO
 */
public class ADDInimigoView extends javax.swing.JFrame {

    private int tipoRPGSelecionado = 0;
    private boolean isRPGSelecionado = false;
    private boolean isClasseSelecionado = false;
    private String vantagens = "", desvantagens = "";
    private ImageIcon imagem = null;
    private int numeracaoFicha = 0;
    
    private InimigoMedievalPanel panelMedieval = new InimigoMedievalPanel();

    private JTextField campos[] = new JTextField[4];
    private JTextArea camposArea[] = new JTextArea[4];

    void passaCampos(boolean campo) {
        if (campo) {
            jTextFieldNomeInimigo.setText("");
            jTextAreaDescInimigo.setText("");
            jTextFieldXPInimigo.setText("XP: ");
            jTextFieldGoldInimigo.setText("GOLD: ");
            jTextAreaItensInimigo.setText("Itens: ");
            jTextAreaDesvantagens.setText("O dia é meu inimigo - Toma o dobro de dano elétrico/solar\n");
            jTextAreaVantagens.setText("Escuridão - Imune a magia das trevas\n");
            jComboBoxTipoRPG.setSelectedIndex(0);
            jTextFieldCod.setText("");
            jTextFieldStatus.setText("");
        } else {
            campos[0] = jTextFieldNomeInimigo;
            campos[1] = jTextFieldXPInimigo;
            campos[2] = jTextFieldGoldInimigo;
            campos[3] = jTextFieldCod;
            camposArea[0] = jTextAreaDescInimigo;
            camposArea[1] = jTextAreaItensInimigo;
            camposArea[2] = jTextAreaVantagens;
            camposArea[3] = jTextAreaDesvantagens;

        }
    }

    public ADDInimigoView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogVantagens = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaVantagens = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jDialogDesvantagens = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDesvantagens = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jDialogLista = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextAreaListaInimigos = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new FundoTelas(11);
        jComboBoxTipoRPG = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNomeInimigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jTextFieldXPInimigo = new javax.swing.JTextField();
        jTextFieldGoldInimigo = new javax.swing.JTextField();
        jLabelImagemInimigo = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaItensInimigo = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextAreaDescInimigo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButtonDesvantagensInimigo = new javax.swing.JButton();
        jButtonVantagensInimigo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonSalvarInimigo = new javax.swing.JButton();
        jButtonNovoInimigo = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jButtonAbrir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPaneStatus = new javax.swing.JScrollPane();
        jPanelStatus = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();

        jDialogVantagens.setMinimumSize(new java.awt.Dimension(525, 350));
        jDialogVantagens.setResizable(false);

        jTextAreaVantagens.setColumns(20);
        jTextAreaVantagens.setRows(5);
        jTextAreaVantagens.setText("Escuridão - Imune a magia das trevas\n");
        jTextAreaVantagens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vantagens", 2, 0, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N
        jScrollPane1.setViewportView(jTextAreaVantagens);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Nome da Vantagem - Descrição da vantagem");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel7)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogVantagensLayout = new javax.swing.GroupLayout(jDialogVantagens.getContentPane());
        jDialogVantagens.getContentPane().setLayout(jDialogVantagensLayout);
        jDialogVantagensLayout.setHorizontalGroup(
            jDialogVantagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogVantagensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogVantagensLayout.setVerticalGroup(
            jDialogVantagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogVantagensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogDesvantagens.setMinimumSize(new java.awt.Dimension(525, 350));
        jDialogDesvantagens.setResizable(false);

        jTextAreaDesvantagens.setColumns(20);
        jTextAreaDesvantagens.setRows(5);
        jTextAreaDesvantagens.setText("O dia é meu inimigo - Toma o dobro de dano elétrico/solar\n");
        jTextAreaDesvantagens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vantagens", 2, 0, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N
        jScrollPane2.setViewportView(jTextAreaDesvantagens);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Nome da Desvantagem - Descrição da desvantagem");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogDesvantagensLayout = new javax.swing.GroupLayout(jDialogDesvantagens.getContentPane());
        jDialogDesvantagens.getContentPane().setLayout(jDialogDesvantagensLayout);
        jDialogDesvantagensLayout.setHorizontalGroup(
            jDialogDesvantagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogDesvantagensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogDesvantagensLayout.setVerticalGroup(
            jDialogDesvantagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogDesvantagensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogLista.setTitle("Lista de inimigos");
        jDialogLista.setMinimumSize(new java.awt.Dimension(600, 400));
        jDialogLista.setResizable(false);

        jTextAreaListaInimigos.setEditable(false);
        jTextAreaListaInimigos.setColumns(20);
        jTextAreaListaInimigos.setRows(5);
        jScrollPane19.setViewportView(jTextAreaListaInimigos);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Lista de inimigos já criados:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogListaLayout = new javax.swing.GroupLayout(jDialogLista.getContentPane());
        jDialogLista.getContentPane().setLayout(jDialogListaLayout);
        jDialogListaLayout.setHorizontalGroup(
            jDialogListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogListaLayout.setVerticalGroup(
            jDialogListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração de Inimigos");
        setMinimumSize(Tela.telaFull());
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jPanel15.setMaximumSize(Tela.telaFull());
        jPanel15.setMinimumSize(Tela.telaFull());
        jPanel15.setPreferredSize(Tela.telaFull());

        jComboBoxTipoRPG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo de RPG", "Medieval ", "Steampunk", "Cyberpunk", "Apocalíptico", " " }));
        jComboBoxTipoRPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoRPGActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nome: ");

        jTextFieldNomeInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Descrição: ");

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Drop de XP: ");

        jTextFieldXPInimigo.setText("XP: ");
        jTextFieldXPInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextFieldGoldInimigo.setText("GOLD:");
        jTextFieldGoldInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelImagemInimigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/defaultT.png"))); // NOI18N
        jLabelImagemInimigo.setToolTipText("Selecione uma imagem - 405x520");
        jLabelImagemInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabelImagemInimigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelImagemInimigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagemInimigoMouseClicked(evt);
            }
        });

        jTextAreaItensInimigo.setColumns(20);
        jTextAreaItensInimigo.setRows(5);
        jTextAreaItensInimigo.setText("ITENS:");
        jTextAreaItensInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane8.setViewportView(jTextAreaItensInimigo);

        jTextAreaDescInimigo.setColumns(20);
        jTextAreaDescInimigo.setLineWrap(true);
        jTextAreaDescInimigo.setRows(5);
        jTextAreaDescInimigo.setWrapStyleWord(true);
        jTextAreaDescInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane9.setViewportView(jTextAreaDescInimigo);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "Vantagens & Desvantagens", 2, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButtonDesvantagensInimigo.setText("Adicionar Desvantagem");
        jButtonDesvantagensInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesvantagensInimigoActionPerformed(evt);
            }
        });

        jButtonVantagensInimigo.setText("Adicionar Vantagem");
        jButtonVantagensInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVantagensInimigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVantagensInimigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButtonDesvantagensInimigo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonVantagensInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonDesvantagensInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar/Remover - Inimigo", 2, 0, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jButtonSalvarInimigo.setText("Salvar");
        jButtonSalvarInimigo.setEnabled(false);
        jButtonSalvarInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarInimigoActionPerformed(evt);
            }
        });

        jButtonNovoInimigo.setText("Limpar");
        jButtonNovoInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoInimigoActionPerformed(evt);
            }
        });

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Situação: ");

        jTextFieldStatus.setEditable(false);

        jButtonAbrir.setText("Abrir");
        jButtonAbrir.setEnabled(false);
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonNovoInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonListar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAbrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvarInimigo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStatus)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovoInimigo)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalvarInimigo)
                        .addComponent(jButtonAbrir)
                        .addComponent(jButtonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Drop de GOLD:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Drop de ITENS");

        jPanelStatus.setBackground(new java.awt.Color(0, 0, 0));
        jPanelStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelStatus.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        jScrollPaneStatus.setViewportView(jPanelStatus);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Código: ");

        jTextFieldCod.setEditable(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jComboBoxTipoRPG, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeInimigo))))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel148)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldGoldInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                            .addComponent(jTextFieldXPInimigo))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPaneStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipoRPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextFieldNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel148)
                                    .addComponent(jTextFieldXPInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldGoldInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jScrollPaneStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoRPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoRPGActionPerformed
        tipoRPGSelecionado = jComboBoxTipoRPG.getSelectedIndex();

        if (tipoRPGSelecionado != 0) {
            isRPGSelecionado = true;
            jButtonSalvarInimigo.setEnabled(true);
            jButtonAbrir.setEnabled(true);

            switch (tipoRPGSelecionado) {

                case 1:
                    Imagens.setImagemRPG(tipoRPGSelecionado, jLabelImagemInimigo);
                    jScrollPaneStatus.getViewport().add(panelMedieval);
                    jScrollPaneStatus.getViewport().setLayout(new FlowLayout(FlowLayout.CENTER));
                    break;
            }

        } else {
            tipoRPGSelecionado = 0;
            Imagens.setImagemRPG(tipoRPGSelecionado, jLabelImagemInimigo);
            isRPGSelecionado = false;
            jButtonSalvarInimigo.setEnabled(false);
            jButtonAbrir.setEnabled(false);
        }

    }//GEN-LAST:event_jComboBoxTipoRPGActionPerformed

    private void jButtonDesvantagensInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesvantagensInimigoActionPerformed
        //desvantagens = desvantagens + JOptionPane.showInputDialog("Insira o nome e o efeito da desvantagem: ");
        jDialogDesvantagens.setModal(true);
        jDialogDesvantagens.setEnabled(true);
        jDialogDesvantagens.setVisible(true);
        jDialogDesvantagens.toFront();
    }//GEN-LAST:event_jButtonDesvantagensInimigoActionPerformed

    private void jButtonVantagensInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVantagensInimigoActionPerformed
        /*        vantagens = vantagens + JOptionPane.showInputDialog("Insira o nome e o efeito da vantagem: ") + "\n";
        JOptionPane.showMessageDialog(null, vantagens);*/
        jDialogVantagens.setModal(true);
        jDialogVantagens.setEnabled(true);
        jDialogVantagens.setVisible(true);
        jDialogVantagens.toFront();

    }//GEN-LAST:event_jButtonVantagensInimigoActionPerformed

    private void jButtonSalvarInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarInimigoActionPerformed
        passaCampos(false);
        String status = "null";        
        switch (tipoRPGSelecionado) {
            case 1:
                PersistirInimigoMedieval inimigoMedieval = new PersistirInimigoMedieval();
                ControleInimigo.setCodigo(jTextFieldCod, inimigoMedieval, numeracaoFicha);
                String data = PegaData.getUltimoSave();
                status = PersistirInimigoMedieval.salvarMedieval(jComboBoxTipoRPG.getSelectedItem().toString(), campos, camposArea, panelMedieval, inimigoMedieval, imagem, data);
                int aux = inimigoMedieval.getCod();
                break;
        }
        jTextFieldStatus.setText(status);

    }//GEN-LAST:event_jButtonSalvarInimigoActionPerformed

    private void jButtonNovoInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoInimigoActionPerformed
        passaCampos(true);
    }//GEN-LAST:event_jButtonNovoInimigoActionPerformed

    private void jLabelImagemInimigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagemInimigoMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(null);
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Todas as imagens", "jpg", "jpeg", "png"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Imagens em JPEG", "jpg", "jpeg"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Imagens em PNG", "png"));
        fc.setMultiSelectionEnabled(false);
        fc.setDialogTitle("Selecione uma imagem 405x520");
        int file = fc.showOpenDialog(this);

        imagem = Imagens.setImageFile(file, jLabelImagemInimigo, fc);

    }//GEN-LAST:event_jLabelImagemInimigoMouseClicked

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        jDialogLista.setVisible(true);
        jDialogLista.toFront();
        ListaInimigo.carregarLista(jTextAreaListaInimigos);
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        try {
            String cod = JOptionPane.showInputDialog("Insira o código do inimigo: ");
            if (cod == null) {
                return;
            }

            switch (tipoRPGSelecionado) {
                case 1:
                    InimigoMedievalOBJ inimigoMedieval =  PersistirInimigoMedieval.carregarMedieval((Integer.parseInt(cod)));
                    if (inimigoMedieval == null) {
                        jTextFieldStatus.setText("Erro ao carregar inimigo!");
                    }

                    jComboBoxTipoRPG.setSelectedItem(inimigoMedieval.getTipoRPG());
                    tipoRPGSelecionado = jComboBoxTipoRPG.getSelectedIndex();

                    jTextFieldNomeInimigo.setText(inimigoMedieval.getNome());
                    jTextFieldCod.setText(String.valueOf(inimigoMedieval.getCod()));
                    jTextAreaDescInimigo.setText(inimigoMedieval.getDesc());
                    jTextFieldXPInimigo.setText(inimigoMedieval.getDrops(0));
                    jTextFieldGoldInimigo.setText(inimigoMedieval.getDrops(1));
                    jTextAreaItensInimigo.setText(inimigoMedieval.getDrops(2));
                    jTextAreaVantagens.setText(inimigoMedieval.getVantagens());
                    jTextAreaDesvantagens.setText(inimigoMedieval.getDesvantagens());
                    PersistirInimigoMedieval.carregarMedieval(panelMedieval, inimigoMedieval);
                    imagem = inimigoMedieval.getFoto();
                    jLabelImagemInimigo.setIcon(imagem);
                    numeracaoFicha = inimigoMedieval.getNumeracao();
                    break;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira apenas númereos!");
        }


    }//GEN-LAST:event_jButtonAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(ADDInimigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDInimigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDInimigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDInimigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDInimigoView().setVisible(true);
            }
        });
    }

//<editor-fold defaultstate="collapsed" desc=" var">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonDesvantagensInimigo;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonNovoInimigo;
    private javax.swing.JButton jButtonSalvarInimigo;
    private javax.swing.JButton jButtonVantagensInimigo;
    private javax.swing.JComboBox<String> jComboBoxTipoRPG;
    private javax.swing.JDialog jDialogDesvantagens;
    private javax.swing.JDialog jDialogLista;
    private javax.swing.JDialog jDialogVantagens;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImagemInimigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneStatus;
    private javax.swing.JTextArea jTextAreaDescInimigo;
    private javax.swing.JTextArea jTextAreaDesvantagens;
    private javax.swing.JTextArea jTextAreaItensInimigo;
    private javax.swing.JTextArea jTextAreaListaInimigos;
    private javax.swing.JTextArea jTextAreaVantagens;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldGoldInimigo;
    private javax.swing.JTextField jTextFieldNomeInimigo;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldXPInimigo;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

}
