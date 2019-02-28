/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Utilitarios;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import rpg2.Imagens.Imagens;
import rpg2.Inimigos.Inimigos;
import rpg2.Sistema.FundoTelas;
import rpg2.Sistema.Tela;
import rpg2.domain.guerra.Guerreiros;

/**
 *
 * @author M4ESTRO
 */
public class CampoGuerraView extends javax.swing.JFrame {

    /*Temos que terminar o combate, paramos na hora d epassar a jList, precisamos passar o atacante e o defensor*/
    private String jogadores[] = new String[10];
    private String classes[] = new String[10];

    private JList listaEmATK = new JList(new DefaultListModel());
    private JList listaEmDEF = new JList(new DefaultListModel());
    private JTextField moralAtual = new JTextField();
    private JButton botaoMoral = new JButton();
    private JButton combaterAtual = new JButton();

    private String lider;
    private String suporte1;
    private String suporte2;

    private boolean modoAtk = false;

    /*List<Guarnicao> guarnicoesJogadores = new ArrayList<>();
    List<Guarnicao> guarnicoesInimigos = new ArrayList<>();*/
    public void setJogador(String nome, int index) {
        this.jogadores[index] = nome;

        int i;
        for (i = 0; i < jogadores.length; i++) {
            if (jogadores[i] == null) {
                break;
            }
        }

        String jogadoresAtuais[] = new String[i];

        for (i = 0; i < jogadoresAtuais.length; i++) {
            jogadoresAtuais[i] = jogadores[i];
        }

        jComboBoxLiderAtk.setModel(new DefaultComboBoxModel<>(jogadoresAtuais));
        jComboBoxSupAtk1.setModel(new DefaultComboBoxModel<>(jogadoresAtuais));
        jComboBoxSupAtk2.setModel(new DefaultComboBoxModel<>(jogadoresAtuais));
    }

    public void setInimigosLideres() {
        String inimigosLideres[] = Inimigos.getFullLista();
        jComboBoxLiderDef.setModel(new DefaultComboBoxModel<>(inimigosLideres));
        jComboBoxSupDef1.setModel(new DefaultComboBoxModel<>(inimigosLideres));
        jComboBoxSupDef2.setModel(new DefaultComboBoxModel<>(inimigosLideres));
    }

    public void setClasses(String nome, int index) {
        this.classes[index] = nome;

        int i;
        for (i = 0; i < classes.length; i++) {
            if (classes[i] == null) {
                break;
            }
        }

        String classesAtuais[] = new String[i];

        for (i = 0; i < classesAtuais.length; i++) {
            classesAtuais[i] = jogadores[i];
        }

    }

    public CampoGuerraView() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        //<editor-fold defaultstate="collapsed" desc=" Tema Inferno do Sofrimento (DEFAULT COLOR - RED) ">
        UIManager.put("nimbusBase", new Color(135, 0, 0));
        UIManager.put("nimbusBlueGrey", new Color(103, 81, 81));
        UIManager.put("control", new Color(212, 204, 207));
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // System.out.println("LAF: " + info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CampoGuerraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CampoGuerraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CampoGuerraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CampoGuerraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        setInimigosLideres();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAjuda = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jEditorPaneTropasDisp = new javax.swing.JEditorPane();
        jButtonRomaTrop = new javax.swing.JButton();
        jButtonBhcTrop = new javax.swing.JButton();
        jButtonExercTrop = new javax.swing.JButton();
        jButtonSobrevTrop = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jEditorPaneTropasVeic = new javax.swing.JEditorPane();
        jButtonRomaVeic = new javax.swing.JButton();
        jButtonBhcVeic = new javax.swing.JButton();
        jButtonExercVeic = new javax.swing.JButton();
        jButtonSobrevVeic = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        jEditorPane3 = new javax.swing.JEditorPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jEditorPane4 = new javax.swing.JEditorPane();
        jPanel5 = new javax.swing.JPanel();
        jComboBoxAjudaClasse = new javax.swing.JComboBox<>();
        jLabelAjudaImgClasse = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jEditorPaneAjudaLider = new javax.swing.JEditorPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        jEditorPaneAjudaSuporte = new javax.swing.JEditorPane();
        jDialogCombate = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldVitATK = new javax.swing.JTextField();
        jTextFieldAtkATK = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldDefATK = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldStealATK = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldFuncATK = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldBonusATK = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldQuantATK = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldVitATKTotal = new javax.swing.JTextField();
        jTextFieldAtkATKTotal = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldDefATKTotal = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldStealATKTotal = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldFuncATKTotal = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldBonusATKTotal = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldVitDEF = new javax.swing.JTextField();
        jTextFieldAtkDEF = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldDefDEF = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldStealDEF = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldFuncDEF = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextFieldBonusDEF = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextFieldQuantDEF = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jTextFieldVitDEFTotal = new javax.swing.JTextField();
        jTextFieldAtkDEFTotal = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextFieldDefDEFTotal = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextFieldStealDEFTotal = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextFieldFuncDEFTotal = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextFieldBonusDEFTotal = new javax.swing.JTextField();
        jButtonGeraResult = new javax.swing.JButton();
        jTextFieldNomeATK = new javax.swing.JTextField();
        jTextFieldNomeDEF = new javax.swing.JTextField();
        jListAtkNorte1 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelGuerra =  new FundoTelas(31);
        jScrollPaneDefesa = new javax.swing.JScrollPane();
        jPanelDefesa = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jComboBoxLiderDef = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jComboBoxSupDef1 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jComboBoxSupDef2 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jScrollPaneGuarnicao1 = new javax.swing.JScrollPane();
        jPanelGuarnicao1 = new javax.swing.JPanel();
        jButtonAddGuarniDef = new javax.swing.JButton();
        jButtonRemovGuar1 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jEditorPaneLiderDef = new javax.swing.JEditorPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        jEditorPaneSupDef1 = new javax.swing.JEditorPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        jEditorPaneSupDef2 = new javax.swing.JEditorPane();
        jScrollPaneAtaque = new javax.swing.JScrollPane();
        jPanelAtaque1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxLiderAtk = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxSupAtk1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxSupAtk2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPaneGuarnicao = new javax.swing.JScrollPane();
        jPanelGuarnicao = new javax.swing.JPanel();
        jButtonAddGuarniAtk = new javax.swing.JButton();
        jButtonRemovGuar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jEditorPaneLiderAtk = new javax.swing.JEditorPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jEditorPaneSup1 = new javax.swing.JEditorPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jEditorPaneSup2 = new javax.swing.JEditorPane();
        jScrollPaneNorte = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jListDefNorte = new javax.swing.JList<>();
        jScrollPane23 = new javax.swing.JScrollPane();
        jListAtkNorte = new javax.swing.JList<>();
        jButtonRemovAtkNorte = new javax.swing.JButton();
        jButtonRemovDefNorte = new javax.swing.JButton();
        jButtonCombaterNorte = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldMoralNorte = new javax.swing.JTextField();
        jButtonMoralNorte = new javax.swing.JButton();
        jScrollPaneLeste = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jListDefLeste = new javax.swing.JList<>();
        jScrollPane24 = new javax.swing.JScrollPane();
        jListAtkLeste = new javax.swing.JList<>();
        jButtonRemovAtkLeste = new javax.swing.JButton();
        jButtonRemovDefLeste = new javax.swing.JButton();
        jButtonCombaterLeste = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jTextFieldMoralLeste = new javax.swing.JTextField();
        jButtonMoralLeste = new javax.swing.JButton();
        jScrollPaneSul = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jListDefSul = new javax.swing.JList<>();
        jScrollPane26 = new javax.swing.JScrollPane();
        jListAtkSul = new javax.swing.JList<>();
        jButtonRemovAtkSul = new javax.swing.JButton();
        jButtonRemovDefSul = new javax.swing.JButton();
        jButtonCombaterSul = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextFieldMoralSul = new javax.swing.JTextField();
        jButtonMoralSul = new javax.swing.JButton();
        jScrollPaneOeste = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jListDefOeste = new javax.swing.JList<>();
        jScrollPane28 = new javax.swing.JScrollPane();
        jListAtkOeste = new javax.swing.JList<>();
        jButtonRemovAtkOeste = new javax.swing.JButton();
        jButtonRemovDefOeste = new javax.swing.JButton();
        jButtonCombaterOeste = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jTextFieldMoralOeste = new javax.swing.JTextField();
        jButtonMoralOeste = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuResetar = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuDefesa = new javax.swing.JMenu();
        jMenuAtaque = new javax.swing.JMenu();

        jDialogAjuda.setAlwaysOnTop(true);
        jDialogAjuda.setMinimumSize(new java.awt.Dimension(910, 600));
        jDialogAjuda.setResizable(false);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(3145, 588));

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setText("<b>O modo guerra </b> constitui um modo onde os jogadores comandarão as tropas de Roma,  de sobreviventes, ou mesmo da BHC para conquistar um objetivo.<br><br>\nOs objetivos variam de acordo com a missão, pode ser desde de defender uma determinada área, até mesmo a conquista de outra, ou até luta contra boss!<br><br>\nO modo guerra possui dois modos, o de defesa e o de ataque onde cada um possui sua especificações.<br><br>\n\nNo modo guerra os jogadores  deverão escolher um líder e dois suportes para comandar as tropas. Os escolhidos não participarão diretamente da batalha, pois, estarão comandando as tropas.\nOs membros não escolhidos poderão participar diretamente da batalha como bem entenderem, desde atacando diretamente a bolando novas estratégias.<br><br>\n\nCada classe atribui um bónus diferente as suas respectivas tropas de acordo com sua função, seja líder ou suporte.<br><br>\n\nHá quatro áreas a serem defendidas ou tomadas/destruídas, <b>NORTE, SUL, LESTE e OESTE</b>. Em cada área, suas guarnições enfrentará as guarnições inimigas pela supremacia daquela área\n");
        jScrollPane5.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 3120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modo Guerra", jPanel1);

        jEditorPaneTropasDisp.setEditable(false);
        jEditorPaneTropasDisp.setContentType("text/html"); // NOI18N
        jEditorPaneTropasDisp.setText("<b>Selecione um exército</b>");
        jScrollPane6.setViewportView(jEditorPaneTropasDisp);

        jButtonRomaTrop.setText("Roma");
        jButtonRomaTrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRomaTropActionPerformed(evt);
            }
        });

        jButtonBhcTrop.setText("BHC");
        jButtonBhcTrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBhcTropActionPerformed(evt);
            }
        });

        jButtonExercTrop.setText("Exercíto");
        jButtonExercTrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExercTropActionPerformed(evt);
            }
        });

        jButtonSobrevTrop.setText("Sobreviventes");
        jButtonSobrevTrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobrevTropActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Selecione um exército para saber sobre suas tropas: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRomaTrop, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBhcTrop, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExercTrop, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSobrevTrop)
                        .addGap(0, 2325, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRomaTrop)
                    .addComponent(jButtonBhcTrop)
                    .addComponent(jButtonExercTrop)
                    .addComponent(jButtonSobrevTrop)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tropas disponíveis", jPanel2);

        jEditorPaneTropasVeic.setEditable(false);
        jEditorPaneTropasVeic.setContentType("text/html"); // NOI18N
        jEditorPaneTropasVeic.setText("<b>Selecione um exército</b>");
        jScrollPane7.setViewportView(jEditorPaneTropasVeic);

        jButtonRomaVeic.setText("Roma");
        jButtonRomaVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRomaVeicActionPerformed(evt);
            }
        });

        jButtonBhcVeic.setText("BHC");
        jButtonBhcVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBhcVeicActionPerformed(evt);
            }
        });

        jButtonExercVeic.setText("Exercíto");
        jButtonExercVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExercVeicActionPerformed(evt);
            }
        });

        jButtonSobrevVeic.setText("Sobreviventes");
        jButtonSobrevVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobrevVeicActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Selecione um exército para saber sobre seus veículos: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRomaVeic, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBhcVeic, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExercVeic, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSobrevVeic)
                        .addGap(0, 2313, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButtonRomaVeic)
                    .addComponent(jButtonBhcVeic)
                    .addComponent(jButtonExercVeic)
                    .addComponent(jButtonSobrevVeic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Veículos disponíveis", jPanel3);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Tropas");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Moral: ");

        jEditorPane2.setEditable(false);
        jEditorPane2.setContentType("text/html"); // NOI18N
        jEditorPane2.setText("A moral é o equivalente à VITALIDADE de uma área, sua função é diminuir a moral da área até o valor ZERO para assim toma a área. <br>\nEm contra-partida, a função do inimigo é aumentar a moral da área até o valor 5.000 <br>\nA moral de uma área é reduziada devido ao dano de uma guarnição sua à uma guarnição inimiga, ou, diretamente à um ataque em sua moral.<br>\nA moral de uma área é aumentada devido ao dano que uma guarnição inimiga causa à sua guarnição, ou, diretamente à um ataque em sua moral. <br>\nVale lembrar que para ambos os casos, a DEFESA TOTAL da guarnição sobre ataque servirá para reduzir o dano que seria causado à moral da área.<br>\n\nUm exemplo de ataque feito pelo jogador, uma guarnição de 10 soldados da B.H.C possui 120 de dano e 100 de defesa no total.<br>\nUma guarnição de 10 bandidos possui 30 de dano e 20 de defesa no total.<br>\nUm dano desta guarnição da BHC nessa guarnição de bandidos resultaria em 100 de dano na moral do inimigo, pois, o dano total da BHC é 120 e a defesa total dos bandidos é 20, logo, o dano de sobra é 100.<br><br>\n\nUm exemplo de ataque feito pelo inimigo, uma guarnição de 10 soldados da B.H.C possui 120 de dano e 100 de defesa no total.<br>\nUma guarnição de 10 combatentes da Unreal possui 150 de dano e 130 de defesa no total.<br>\nUm dano desta guarnição de combatentes da Unreal nessa guarnição da BHC resultaria em um aumento de 50 de moral, pois, a defesa total da BHC é 100 e o ataque total doscombatentes é de 150, logo, o dano de sobra é 50.<br><br>");
        jScrollPane13.setViewportView(jEditorPane2);

        jEditorPane3.setEditable(false);
        jEditorPane3.setContentType("text/html"); // NOI18N
        jEditorPane3.setText("Todas as tropas possuiem uma VITALIDADE, e uma VITALIDADE TOTAL que é a multiplicação da VITALIDADE pela quantidade de tropas naquele local.<br>\nAo atacar ou ser atacado, o dano será causado diretamente a esta VITALIDADE TOTAL, e a partir aí o sistema calculará a quantidade de tropas que foram atacadas remanescente.<br>\nUma vez que não ha tropas em uma área, o jogador ou inimigo ganha a opção de realizar um ataque diretamente à moral da área, reduzindo-a ou aumentando-a sem qualquer penalidade.<br><br>\n\nPara todas as ações de ATAQUE ou DEFESA,  deverá ser lançado 1D20. <br>\nMovimentações de guarnições no campo de batalha resulta em perca de rodada, o número de áreas que uma guarnição pode andar é determinado pelo atributo <b>STEALTH</b>,<br>\nexeceto no caso dos veículos onde cada um possui sua própria movimentação. <br>\nO atributo <b>STEALTH</b> também é responsável por ações realizadas em STEALTH ou infiltrações. Caso o valor do STEALTH seja maior ou igual a 4, deverar lançar-se 1D20 para a ação,<br>\ncaso  o valor do STEALTH seha menor do que 4, deverar lançar-se 1D10 para a ação.\n");
        jScrollPane14.setViewportView(jEditorPane3);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Como jogar: ");

        jEditorPane4.setEditable(false);
        jEditorPane4.setContentType("text/html"); // NOI18N
        jEditorPane4.setText("O jogador terá uma ou várias guarnições com tropas ou veículos para desginar a uma área de combate. <br>\n<b>Norte</b>, <b>sul</b>, <b>leste</b> e <b>oeste</b>, são as quatro áreas para se atacar/defender. O exército inimigo também enviará tropas de sua guarnição para essas respectivas áreas na esperança de toma-las, ou mante-las.<br>\nCada guarnição presente possui uma VITALIDADE, ATAQUE e DEFESA total, cujo é calculado de acordo com a quantidade e tropa presente.<br>\nPor exemplo, um soldado da B.H.C possui:<br> \nVIT: 50; <br>\nATK: 12; <br>\nDEF: 10; <br>\nLogo, uma guarnição de 10 soldados da B.H.C possui 120 de dano e 100 de defesa e 500 de vitalidade no total.<br><br>\n\nA defesa <b>NÃO REDUZ O DANO DO INIMIGO NEM O SEU</b>, todo dano causado ou levado é calculado em sua totalidade.<br>\nPor exemplo:  uma guarnição de 10 soldados da B.H.C possui 120 de dano e 100 de defesa e 500 de vitalidade no total.<br>\nUma guarnição de 10 bandidos possui 30 de dano e 20 de defesa no total e 150 de vitalidade no total.<br>\nLogo, um ataque da BHC nessa guarnição de bandidos causaria uma redução de 150 para 30 de vitalidade total desta guarnição de bandidos.<br>\nO status de defesa serve única e exclusivamente para a função de proteger à <b>MORAL</b> da área sendo atacada ou defendida.<br><br>\n\nO jogador líder será responsável pelas áreas norte e sul, enquanto o suporte 1 e suporte 2 serão responsáveis pelas áreas leste e oeste respectivamente.<br>\nO giro de combate roda em: NORTE, LESTE, SUL e por fim, OESTE.<br>\nEm cada área, o jogador responsável pela mesma poderá adicionar tropas na guarnição para a sua área e então realizar suas ações com sua guarnição.<br>\nCada guarnição tem sua própria ação. O combate daquela área termina quando o jogador realiza ação com cada uma de suas tropas, ou, quando ele resolver passar.<br>\nJogadores que não estejam liderando ou dando suporte poderão participar da batalha diretamente, seja seguindo o comando de seus amigos, atacando diretamente inimigos, ou realizandos estratégias específicas.<br>\nO jogadores livres de tarefas terão uma rodada para realizar sua ação, após o fim de cada rodada terminada em uma área. Caso haja mais de um jogador livre, apenas um poderá realizar uma ação, o outro terá sua rodada no próximo giro.\n\n\n\n");
        jScrollPane15.setViewportView(jEditorPane4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 129, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modos & Como jogar", jPanel4);

        jComboBoxAjudaClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a classe", "Fuzileiro Naval", "Força Policial", "B.H.C", "Hacker", "Químico", "Médico", "Engenheiro" }));
        jComboBoxAjudaClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAjudaClasseActionPerformed(evt);
            }
        });

        jLabelAjudaImgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Default_classe.jpg"))); // NOI18N
        jLabelAjudaImgClasse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Bónus como líder: ");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Bónus como suporte: ");

        jEditorPaneAjudaLider.setEditable(false);
        jEditorPaneAjudaLider.setContentType("text/html"); // NOI18N
        jEditorPaneAjudaLider.setText("<b>Não há uma classe selecionada!</b>");
        jScrollPane16.setViewportView(jEditorPaneAjudaLider);

        jEditorPaneAjudaSuporte.setEditable(false);
        jEditorPaneAjudaSuporte.setContentType("text/html"); // NOI18N
        jEditorPaneAjudaSuporte.setText("<b>Não há uma classe selecionada!</b>");
        jScrollPane17.setViewportView(jEditorPaneAjudaSuporte);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxAjudaClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelAjudaImgClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 2573, Short.MAX_VALUE)
                            .addComponent(jScrollPane17))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxAjudaClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel17)
                        .addGap(295, 306, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelAjudaImgClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Bónus", jPanel5);

        javax.swing.GroupLayout jDialogAjudaLayout = new javax.swing.GroupLayout(jDialogAjuda.getContentPane());
        jDialogAjuda.getContentPane().setLayout(jDialogAjudaLayout);
        jDialogAjudaLayout.setHorizontalGroup(
            jDialogAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogAjudaLayout.setVerticalGroup(
            jDialogAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogCombate.setMinimumSize(new java.awt.Dimension(720, 480));
        jDialogCombate.setResizable(false);

        jPanel7.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Sobreviventes:");

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setText("VIT: ");

        jTextFieldVitATK.setEditable(false);

        jTextFieldAtkATK.setEditable(false);

        jLabel20.setText("ATK:");

        jTextFieldDefATK.setEditable(false);

        jLabel21.setText("DEF:");

        jLabel22.setText("STEALTH: ");

        jTextFieldStealATK.setEditable(false);

        jLabel23.setText("FUNÇÃO: ");

        jTextFieldFuncATK.setEditable(false);

        jLabel24.setText("BÓNUS: ");

        jTextFieldBonusATK.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBonusATK, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFuncATK, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVitATK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAtkATK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDefATK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStealATK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldVitATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAtkATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldDefATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldStealATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldFuncATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldBonusATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setText("Quantidade: ");

        jTextFieldQuantATK.setEditable(false);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setText("VIT: ");

        jTextFieldVitATKTotal.setEditable(false);

        jTextFieldAtkATKTotal.setEditable(false);

        jLabel27.setText("ATK:");

        jTextFieldDefATKTotal.setEditable(false);

        jLabel28.setText("DEF:");

        jLabel29.setText("STEALTH: ");

        jTextFieldStealATKTotal.setEditable(false);

        jLabel30.setText("FUNÇÃO: ");

        jTextFieldFuncATKTotal.setEditable(false);

        jLabel31.setText("BÓNUS: ");

        jTextFieldBonusATKTotal.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBonusATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFuncATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVitATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAtkATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDefATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStealATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldVitATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAtkATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextFieldDefATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jTextFieldStealATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextFieldFuncATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextFieldBonusATKTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Inimigos:");

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setText("VIT: ");

        jTextFieldVitDEF.setEditable(false);

        jTextFieldAtkDEF.setEditable(false);

        jLabel34.setText("ATK:");

        jTextFieldDefDEF.setEditable(false);

        jLabel35.setText("DEF:");

        jLabel36.setText("STEALTH: ");

        jTextFieldStealDEF.setEditable(false);

        jLabel37.setText("FUNÇÃO: ");

        jTextFieldFuncDEF.setEditable(false);

        jLabel38.setText("BÓNUS: ");

        jTextFieldBonusDEF.setEditable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBonusDEF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFuncDEF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldVitDEF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAtkDEF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDefDEF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldStealDEF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldVitDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAtkDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextFieldDefDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jTextFieldStealDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextFieldFuncDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextFieldBonusDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel39.setText("Quantidade: ");

        jTextFieldQuantDEF.setEditable(false);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setText("VIT: ");

        jTextFieldVitDEFTotal.setEditable(false);

        jTextFieldAtkDEFTotal.setEditable(false);

        jLabel41.setText("ATK:");

        jTextFieldDefDEFTotal.setEditable(false);

        jLabel42.setText("DEF:");

        jLabel43.setText("STEALTH: ");

        jTextFieldStealDEFTotal.setEditable(false);

        jLabel44.setText("FUNÇÃO: ");

        jTextFieldFuncDEFTotal.setEditable(false);

        jLabel45.setText("BÓNUS: ");

        jTextFieldBonusDEFTotal.setEditable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBonusDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFuncDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldVitDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAtkDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDefDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldStealDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldVitDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAtkDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextFieldDefDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jTextFieldStealDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextFieldFuncDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextFieldBonusDEFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButtonGeraResult.setText("Gerar Resultado");
        jButtonGeraResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeraResultActionPerformed(evt);
            }
        });

        jTextFieldNomeATK.setEditable(false);

        jTextFieldNomeDEF.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantATK))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNomeATK))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonGeraResult)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantDEF))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeDEF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel32)
                            .addComponent(jTextFieldNomeATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextFieldQuantATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGeraResult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextFieldQuantDEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogCombateLayout = new javax.swing.GroupLayout(jDialogCombate.getContentPane());
        jDialogCombate.getContentPane().setLayout(jDialogCombateLayout);
        jDialogCombateLayout.setHorizontalGroup(
            jDialogCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogCombateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDialogCombateLayout.setVerticalGroup(
            jDialogCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogCombateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        jListAtkNorte1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas Atacantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jListAtkNorte1.setModel(new DefaultListModel());
        jListAtkNorte1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListAtkNorte1.setMaximumSize(new java.awt.Dimension(260, 132));
        jListAtkNorte1.setMinimumSize(new java.awt.Dimension(260, 132));
        jListAtkNorte1.setPreferredSize(new java.awt.Dimension(260, 132));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(Tela.telaFull());

        jPanelGuerra.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanelGuerra.setLayout(null);

        jPanelDefesa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "INIMIGOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanelDefesa.setMaximumSize(new java.awt.Dimension(480, 845));
        jPanelDefesa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel46.setText("Líder");
        jPanelDefesa.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 36, 60, -1));

        jPanelDefesa.add(jComboBoxLiderDef, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 35, 390, -1));

        jLabel47.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel47.setText("Primeiro suporte");
        jPanelDefesa.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 178, 108, -1));

        jPanelDefesa.add(jComboBoxSupDef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 177, 321, -1));

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel48.setText("Segundo suporte");
        jPanelDefesa.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 318, 108, -1));

        jPanelDefesa.add(jComboBoxSupDef2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 317, 321, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Tropas na guarnição");
        jPanelDefesa.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 457, 447, -1));

        jPanelGuarnicao1.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPaneGuarnicao1.setViewportView(jPanelGuarnicao1);

        jPanelDefesa.add(jScrollPaneGuarnicao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 503, 447, 252));

        jButtonAddGuarniDef.setText("Adicionar");
        jButtonAddGuarniDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddGuarniDefActionPerformed(evt);
            }
        });
        jPanelDefesa.add(jButtonAddGuarniDef, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 770, -1, -1));

        jButtonRemovGuar1.setText("Remover");
        jButtonRemovGuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovGuar1ActionPerformed(evt);
            }
        });
        jPanelDefesa.add(jButtonRemovGuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 770, -1, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel50.setText("Opções de guarnição: ");
        jPanelDefesa.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 269, -1));

        jLabel51.setText("-");
        jPanelDefesa.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, 440, -1));

        jEditorPaneLiderDef.setContentType("text/html"); // NOI18N
        jEditorPaneLiderDef.setText("<b>Inimigos não possuem qualquer tipo de bónus </b>");
        jScrollPane20.setViewportView(jEditorPaneLiderDef);

        jPanelDefesa.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 110));

        jEditorPaneSupDef1.setContentType("text/html"); // NOI18N
        jEditorPaneSupDef1.setText("<b>Inimigos não possuem qualquer tipo de bónus</b>");
        jScrollPane21.setViewportView(jEditorPaneSupDef1);

        jPanelDefesa.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 440, 100));

        jEditorPaneSupDef2.setContentType("text/html"); // NOI18N
        jEditorPaneSupDef2.setText("<b>Inimigos não possuem qualquer tipo de bónus</b>");
        jScrollPane22.setViewportView(jEditorPaneSupDef2);

        jPanelDefesa.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 440, 100));

        jScrollPaneDefesa.setViewportView(jPanelDefesa);

        jPanelGuerra.add(jScrollPaneDefesa);
        jScrollPaneDefesa.setBounds(1379, 150, 540, 590);

        jScrollPaneAtaque.setMaximumSize(new java.awt.Dimension(485, 850));

        jPanelAtaque1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "JOGADORES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanelAtaque1.setMaximumSize(new java.awt.Dimension(480, 845));
        jPanelAtaque1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Líder ");
        jPanelAtaque1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 36, 60, -1));

        jComboBoxLiderAtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLiderAtkActionPerformed(evt);
            }
        });
        jPanelAtaque1.add(jComboBoxLiderAtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 35, 400, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Primeiro suporte");
        jPanelAtaque1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 178, 108, -1));

        jComboBoxSupAtk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSupAtk1ActionPerformed(evt);
            }
        });
        jPanelAtaque1.add(jComboBoxSupAtk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 177, 321, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Segundo suporte");
        jPanelAtaque1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 318, 108, -1));

        jComboBoxSupAtk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSupAtk2ActionPerformed(evt);
            }
        });
        jPanelAtaque1.add(jComboBoxSupAtk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 317, 321, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tropas na guarnição");
        jPanelAtaque1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 457, 447, -1));

        jPanelGuarnicao.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPaneGuarnicao.setViewportView(jPanelGuarnicao);

        jPanelAtaque1.add(jScrollPaneGuarnicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 503, 447, 252));

        jButtonAddGuarniAtk.setText("Adicionar");
        jButtonAddGuarniAtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddGuarniAtkActionPerformed(evt);
            }
        });
        jPanelAtaque1.add(jButtonAddGuarniAtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 770, -1, -1));

        jButtonRemovGuar.setText("Remover");
        jButtonRemovGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovGuarActionPerformed(evt);
            }
        });
        jPanelAtaque1.add(jButtonRemovGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 770, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Opções de guarnição: ");
        jPanelAtaque1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 269, -1));

        jLabel9.setText("-");
        jPanelAtaque1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, 440, -1));

        jEditorPaneLiderAtk.setContentType("text/html"); // NOI18N
        jEditorPaneLiderAtk.setText("<b>Bónus: </b>");
        jScrollPane10.setViewportView(jEditorPaneLiderAtk);

        jPanelAtaque1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 110));

        jEditorPaneSup1.setContentType("text/html"); // NOI18N
        jEditorPaneSup1.setText("<b>Bónus: </b>");
        jScrollPane11.setViewportView(jEditorPaneSup1);

        jPanelAtaque1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 440, 100));

        jEditorPaneSup2.setContentType("text/html"); // NOI18N
        jEditorPaneSup2.setText("<b>Bónus: </b>");
        jScrollPane12.setViewportView(jEditorPaneSup2);

        jPanelAtaque1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 440, 100));

        jScrollPaneAtaque.setViewportView(jPanelAtaque1);

        jPanelGuerra.add(jScrollPaneAtaque);
        jScrollPaneAtaque.setBounds(0, 150, 500, 580);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "NORTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jListDefNorte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas Inimigas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel1 = new DefaultListModel();
        listModel1.addElement("MORAL");
        jListDefNorte.setModel(listModel1);
        jListDefNorte.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane18.setViewportView(jListDefNorte);

        jListAtkNorte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas dos Jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("MORAL");
        jListAtkNorte.setModel(listModel);
        jListAtkNorte.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane23.setViewportView(jListAtkNorte);

        jButtonRemovAtkNorte.setText("Remover");
        jButtonRemovAtkNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovAtkNorteActionPerformed(evt);
            }
        });

        jButtonRemovDefNorte.setText("Remover");
        jButtonRemovDefNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovDefNorteActionPerformed(evt);
            }
        });

        jButtonCombaterNorte.setText("Combater");
        jButtonCombaterNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCombaterNorteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Moral: ");

        jTextFieldMoralNorte.setEditable(false);
        jTextFieldMoralNorte.setText("2500");

        jButtonMoralNorte.setText("Opções da Moral");
        jButtonMoralNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoralNorteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMoralNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMoralNorte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMoralNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jButtonMoralNorte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButtonRemovAtkNorte)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonCombaterNorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemovDefNorte)))
                .addContainerGap())
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRemovAtkNorte)
                    .addComponent(jButtonRemovDefNorte)
                    .addComponent(jButtonCombaterNorte))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jScrollPaneNorte.setViewportView(jPanel6);

        jPanelGuerra.add(jScrollPaneNorte);
        jScrollPaneNorte.setBounds(730, 0, 414, 351);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "LESTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jListDefLeste.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas Inimigas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel5 = new DefaultListModel();
        listModel5.addElement("MORAL");
        jListDefLeste.setModel(listModel5);
        jListDefLeste.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane19.setViewportView(jListDefLeste);

        jListAtkLeste.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas dos Jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel4 = new DefaultListModel();
        listModel4.addElement("MORAL");
        jListAtkLeste.setModel(listModel4);
        jListAtkLeste.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane24.setViewportView(jListAtkLeste);

        jButtonRemovAtkLeste.setText("Remover");
        jButtonRemovAtkLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovAtkLesteActionPerformed(evt);
            }
        });

        jButtonRemovDefLeste.setText("Remover");
        jButtonRemovDefLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovDefLesteActionPerformed(evt);
            }
        });

        jButtonCombaterLeste.setText("Combater");
        jButtonCombaterLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCombaterLesteActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel52.setText("Moral: ");

        jTextFieldMoralLeste.setEditable(false);
        jTextFieldMoralLeste.setText("2500");

        jButtonMoralLeste.setText("Opções da Moral");
        jButtonMoralLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoralLesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMoralLeste, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMoralLeste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMoralLeste, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jButtonMoralLeste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jButtonRemovAtkLeste)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonCombaterLeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemovDefLeste)))
                .addContainerGap())
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRemovAtkLeste)
                    .addComponent(jButtonRemovDefLeste)
                    .addComponent(jButtonCombaterLeste))
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jScrollPaneLeste.setViewportView(jPanel13);

        jPanelGuerra.add(jScrollPaneLeste);
        jScrollPaneLeste.setBounds(960, 360, 414, 351);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "SUL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jListDefSul.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas Inimigas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel7 = new DefaultListModel();
        listModel7.addElement("MORAL");
        jListDefSul.setModel(listModel7);
        jListDefSul.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane25.setViewportView(jListDefSul);

        jListAtkSul.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas dos Jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel6 = new DefaultListModel();
        listModel6.addElement("MORAL");
        jListAtkSul.setModel(listModel6);
        jListAtkSul.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane26.setViewportView(jListAtkSul);

        jButtonRemovAtkSul.setText("Remover");
        jButtonRemovAtkSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovAtkSulActionPerformed(evt);
            }
        });

        jButtonRemovDefSul.setText("Remover");
        jButtonRemovDefSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovDefSulActionPerformed(evt);
            }
        });

        jButtonCombaterSul.setText("Combater");
        jButtonCombaterSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCombaterSulActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setText("Moral: ");

        jTextFieldMoralSul.setEditable(false);
        jTextFieldMoralSul.setText("2500");

        jButtonMoralSul.setText("Opções da Moral");
        jButtonMoralSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoralSulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMoralSul, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMoralSul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMoralSul, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(jButtonMoralSul))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jButtonRemovAtkSul)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonCombaterSul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemovDefSul)))
                .addContainerGap())
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRemovAtkSul)
                    .addComponent(jButtonRemovDefSul)
                    .addComponent(jButtonCombaterSul))
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jScrollPaneSul.setViewportView(jPanel15);

        jPanelGuerra.add(jScrollPaneSul);
        jScrollPaneSul.setBounds(740, 720, 414, 351);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "OESTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jListDefOeste.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas Inimigas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel3 = new DefaultListModel();
        listModel3.addElement("MORAL");
        jListDefOeste.setModel(listModel3);
        jListDefOeste.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane27.setViewportView(jListDefOeste);

        jListAtkOeste.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tropas dos Jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        DefaultListModel listModel2 = new DefaultListModel();
        listModel2.addElement("MORAL");
        jListAtkOeste.setModel(listModel2);
        jListAtkOeste.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane28.setViewportView(jListAtkOeste);

        jButtonRemovAtkOeste.setText("Remover");
        jButtonRemovAtkOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovAtkOesteActionPerformed(evt);
            }
        });

        jButtonRemovDefOeste.setText("Remover");
        jButtonRemovDefOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovDefOesteActionPerformed(evt);
            }
        });

        jButtonCombaterOeste.setText("Combater");
        jButtonCombaterOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCombaterOesteActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setText("Moral: ");

        jTextFieldMoralOeste.setEditable(false);
        jTextFieldMoralOeste.setText("2500");

        jButtonMoralOeste.setText("Opções da Moral");
        jButtonMoralOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoralOesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMoralOeste, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMoralOeste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMoralOeste, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(jButtonMoralOeste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButtonRemovAtkOeste)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonCombaterOeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemovDefOeste)))
                .addContainerGap())
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRemovAtkOeste)
                    .addComponent(jButtonRemovDefOeste)
                    .addComponent(jButtonCombaterOeste))
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jScrollPaneOeste.setViewportView(jPanel17);

        jPanelGuerra.add(jScrollPaneOeste);
        jScrollPaneOeste.setBounds(510, 360, 414, 351);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Guerra_Defesa.jpg"))); // NOI18N
        jLabelFundo.setMaximumSize(new java.awt.Dimension(3000, 3000));
        jLabelFundo.setMinimumSize(new java.awt.Dimension(1, 1));
        jPanelGuerra.add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 1920, 1080);

        jScrollPane1.setViewportView(jPanelGuerra);

        jMenu1.setText("Voltar ao jogo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAjudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAjuda);

        jMenuResetar.setText("Resetar Campo");
        jMenuResetar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuResetarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuResetar);

        jMenu2.setText("Modos");
        jMenu2.setEnabled(false);

        jMenuDefesa.setText("Defesa");
        jMenuDefesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDefesaMouseClicked(evt);
            }
        });
        jMenu2.add(jMenuDefesa);

        jMenuAtaque.setText("Ataque");
        jMenuAtaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAtaqueMouseClicked(evt);
            }
        });
        jMenu2.add(jMenuAtaque);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1213, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuDefesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDefesaMouseClicked
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Guerra_Defesa.jpg"));
        jLabelFundo.setIcon(icon);


    }//GEN-LAST:event_jMenuDefesaMouseClicked

    private void jMenuAtaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAtaqueMouseClicked
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Guerra_Ataque.jpg"));
        jLabelFundo.setIcon(icon);
    }//GEN-LAST:event_jMenuAtaqueMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButtonAddGuarniAtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddGuarniAtkActionPerformed
        try {
            Guarnicao guarnicao = new Guarnicao(jListAtkNorte, jListAtkSul, jListAtkLeste, jListAtkOeste, true);
            guarnicao.setVisible(true);
            guarnicao.setEnabled(true);
            Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de tropas referente a essa guarnição: "));

            if (opcao == -1) {
                return;
            }
            guarnicao.setQuantidadeMaxima(opcao);

            jPanelGuarnicao.add(guarnicao);
            jPanelGuarnicao.revalidate();
            jPanelGuarnicao.repaint();
            //guarnicoesJogadores.add(guarnicao);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira apenas valores númericos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido!\n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonAddGuarniAtkActionPerformed

    private void jButtonRemovGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovGuarActionPerformed
        try {
            jPanelGuarnicao.remove(jPanelGuarnicao.getComponentCount() - 1);
            jPanelGuarnicao.revalidate();
            jPanelGuarnicao.repaint();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Não há guarnições para se remover");
        }

    }//GEN-LAST:event_jButtonRemovGuarActionPerformed

    private void jComboBoxLiderAtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLiderAtkActionPerformed
        setBonusLider(jComboBoxLiderAtk, jEditorPaneLiderAtk);
    }//GEN-LAST:event_jComboBoxLiderAtkActionPerformed

    private void jComboBoxSupAtk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSupAtk1ActionPerformed
        setBonusSuporte(jComboBoxSupAtk1, jEditorPaneSup1, true);
    }//GEN-LAST:event_jComboBoxSupAtk1ActionPerformed

    private void jComboBoxSupAtk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSupAtk2ActionPerformed
        setBonusSuporte(jComboBoxSupAtk2, jEditorPaneSup2, true);
    }//GEN-LAST:event_jComboBoxSupAtk2ActionPerformed

    private void jButtonRomaTropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRomaTropActionPerformed
        jEditorPaneTropasDisp.setText(setTropa(1));
    }//GEN-LAST:event_jButtonRomaTropActionPerformed

    private void jButtonBhcTropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBhcTropActionPerformed
        jEditorPaneTropasDisp.setText(setTropa(2));
    }//GEN-LAST:event_jButtonBhcTropActionPerformed

    private void jButtonExercTropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExercTropActionPerformed
        jEditorPaneTropasDisp.setText(setTropa(3));
    }//GEN-LAST:event_jButtonExercTropActionPerformed

    private void jButtonSobrevTropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobrevTropActionPerformed
        jEditorPaneTropasDisp.setText(setTropa(4));
    }//GEN-LAST:event_jButtonSobrevTropActionPerformed

    private void jButtonRomaVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRomaVeicActionPerformed
        jEditorPaneTropasVeic.setText(setVeiculo(1));
    }//GEN-LAST:event_jButtonRomaVeicActionPerformed

    private void jButtonBhcVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBhcVeicActionPerformed
        jEditorPaneTropasVeic.setText(setVeiculo(2));
    }//GEN-LAST:event_jButtonBhcVeicActionPerformed

    private void jButtonExercVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExercVeicActionPerformed
        jEditorPaneTropasVeic.setText(setVeiculo(3));
    }//GEN-LAST:event_jButtonExercVeicActionPerformed

    private void jButtonSobrevVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobrevVeicActionPerformed
        jEditorPaneTropasVeic.setText(setVeiculo(4));
    }//GEN-LAST:event_jButtonSobrevVeicActionPerformed

    private void jMenuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAjudaMouseClicked
        jDialogAjuda.setEnabled(true);
        jDialogAjuda.setVisible(true);
        jDialogAjuda.toFront();
    }//GEN-LAST:event_jMenuAjudaMouseClicked

    private void jComboBoxAjudaClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAjudaClasseActionPerformed
        setBonusLiderAjuda(jComboBoxAjudaClasse, jEditorPaneAjudaLider);
        setBonusSuporteAjuda(jComboBoxAjudaClasse, jEditorPaneAjudaSuporte);

        ImageIcon imagem = Imagens.getClasseImagem(jComboBoxAjudaClasse.getSelectedIndex());
        imagem.setImage(getScaledImage(imagem.getImage(), 366, 440));
        jLabelAjudaImgClasse.setIcon(imagem);
    }//GEN-LAST:event_jComboBoxAjudaClasseActionPerformed

    private void setCombate(JTextField[] jTextField, JList jList, boolean aliado) {
        String guarnicaoAtacante = tratamentoGetNome(jList.getSelectedValue().toString());
        Guerreiros guerreiros = new Guerreiros(guarnicaoAtacante, aliado);
        tratamentoGetQuant(jList.getSelectedValue().toString());
        // <editor-fold defaultstate="collapsed" desc="Status normal "> 
        jTextField[0].setText(guerreiros.getNome());//Nome
        jTextField[1].setText(guerreiros.getVit().toString());//VIT
        jTextField[2].setText(guerreiros.getAtk().toString());//ATK
        jTextField[3].setText(guerreiros.getDef().toString());//DEF
        jTextField[4].setText(guerreiros.getStealth().toString());//STEALTH
        jTextField[5].setText(guerreiros.getFuncao());//FUNCAO
        jTextField[6].setText(guerreiros.getBonus());//BÓNUS
        // </editor-fold>

        Integer quant = tratamentoGetQuant(jList.getSelectedValue().toString()); //jTextField[6].getText();

        // <editor-fold defaultstate="collapsed" desc="Status total "> 
        jTextField[8].setText(String.valueOf(guerreiros.getVit() * quant));//VIT
        jTextField[9].setText(String.valueOf(guerreiros.getAtk() * quant));//ATK
        jTextField[10].setText(String.valueOf(guerreiros.getDef() * quant));//DEF
        jTextField[11].setText(guerreiros.getStealth().toString());//STEALTH
        jTextField[12].setText(guerreiros.getFuncao());//FUNCAO
        jTextField[13].setText(guerreiros.getBonus());//BÓNUS
        // </editor-fold>
    }

    private String tratamentoGetNome(String tratar) {
        Integer comeco = tratar.indexOf("-") + 2;
        String nome = tratar.substring(comeco);
        // System.out.println(nome);
        return nome;
    }

    private Integer tratamentoGetQuant(String tratar) {
        Integer comeco = tratar.indexOf(" ");
        Integer fim = tratar.indexOf(")");
        String quant = tratar.substring(comeco, fim).trim();
        Integer quantidade = Integer.parseInt(quant);
        //System.out.println(quantidade);
        return quantidade;
    }

    private boolean vereficador(JList listAtacante, JList listDefesa) {
        boolean vereficado = true;

        if (listAtacante.isSelectionEmpty()) {
            vereficado = false;
        }

        if (listDefesa.isSelectionEmpty()) {
            vereficado = false;
        }

        if (vereficado) {
            if ((listAtacante.getSelectedValue().equals("MORAL")) && (listDefesa.getSelectedValue().equals("MORAL"))) {
                vereficado = false;
            }
        }

        return vereficado;
    }

    private void ataqueMoral(boolean sobreviventes, JList atacador) {
        String guarnicaoAtacante = tratamentoGetNome(atacador.getSelectedValue().toString());
        Guerreiros guerreiros = new Guerreiros(guarnicaoAtacante, sobreviventes);
        Integer quant = tratamentoGetQuant(atacador.getSelectedValue().toString());
        Integer dano = guerreiros.getAtk() * quant;
        Integer moral = Integer.parseInt(moralAtual.getText());

        Integer resultado = 0;
        if (sobreviventes) {
            if (moral > dano) {
                resultado = moral - dano;
            }
            this.moralAtual.setText(resultado.toString());
            JOptionPane.showMessageDialog(null, "Dano reduzido diretamente à moral dos inimigos: " + dano.toString());

            if (resultado <= 0) {
                tomaPonto(this.listaEmATK, this.listaEmDEF, this.botaoMoral, this.moralAtual, true);
            }

        } else {
            resultado = moral + dano;

            this.moralAtual.setText(resultado.toString());
            JOptionPane.showMessageDialog(null, "Dano aumentado diretamente à moral dos sobreviventes: " + dano.toString());

            if (resultado >= 6000) {
                tomaPonto(this.listaEmATK, this.listaEmDEF, this.botaoMoral, this.moralAtual, false);
            }

        }

    }

    private void jButtonCombaterNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCombaterNorteActionPerformed
        boolean vereficado = vereficador(jListAtkNorte, jListDefNorte);
        if (vereficado) {
            this.listaEmATK = jListAtkNorte;
            this.listaEmDEF = jListDefNorte;
            this.moralAtual = jTextFieldMoralNorte;

            if (jListAtkNorte.getSelectedValue().equals("MORAL")) {
                ataqueMoral(false, jListDefNorte);
                return;
            } else {
                if (jListDefNorte.getSelectedValue().equals("MORAL")) {
                    ataqueMoral(true, jListAtkNorte);
                    return;
                }
            }

            //Set do ataque
            JTextField[] jTextField = new JTextField[14];
            jTextField[0] = jTextFieldNomeATK;
            jTextField[1] = jTextFieldVitATK;
            jTextField[2] = jTextFieldAtkATK;
            jTextField[3] = jTextFieldDefATK;
            jTextField[4] = jTextFieldStealATK;
            jTextField[5] = jTextFieldFuncATK;
            jTextField[6] = jTextFieldBonusATK;

            String aux = String.valueOf(tratamentoGetQuant(jListAtkNorte.getSelectedValue()));
            jTextFieldQuantATK.setText(aux);
            jTextField[7] = jTextFieldQuantATK;

            jTextField[8] = jTextFieldVitATKTotal;
            jTextField[9] = jTextFieldAtkATKTotal;
            jTextField[10] = jTextFieldDefATKTotal;
            jTextField[11] = jTextFieldStealATKTotal;
            jTextField[12] = jTextFieldFuncATKTotal;
            jTextField[13] = jTextFieldBonusATKTotal;

            setCombate(jTextField, jListAtkNorte, true);

            //Set da defesa
            JTextField[] jTextFieldDEF = new JTextField[14];
            jTextFieldDEF[0] = jTextFieldNomeDEF;
            jTextFieldDEF[1] = jTextFieldVitDEF;
            jTextFieldDEF[2] = jTextFieldAtkDEF;
            jTextFieldDEF[3] = jTextFieldDefDEF;
            jTextFieldDEF[4] = jTextFieldStealDEF;
            jTextFieldDEF[5] = jTextFieldFuncDEF;
            jTextFieldDEF[6] = jTextFieldBonusDEF;

            String auxDEF = String.valueOf(tratamentoGetQuant(jListDefNorte.getSelectedValue()));
            jTextFieldQuantDEF.setText(auxDEF);
            jTextField[7] = jTextFieldQuantDEF;

            jTextFieldDEF[8] = jTextFieldVitDEFTotal;
            jTextFieldDEF[9] = jTextFieldAtkDEFTotal;
            jTextFieldDEF[10] = jTextFieldDefDEFTotal;
            jTextFieldDEF[11] = jTextFieldStealDEFTotal;
            jTextFieldDEF[12] = jTextFieldFuncDEFTotal;
            jTextFieldDEF[13] = jTextFieldBonusDEFTotal;

            setCombate(jTextFieldDEF, jListDefNorte, false);

            jDialogCombate.setEnabled(true);
            jDialogCombate.setVisible(true);
            jDialogCombate.toFront();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma guarnição atacante e uma guarnição defensora!");
        }

    }//GEN-LAST:event_jButtonCombaterNorteActionPerformed

    private void jButtonGeraResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeraResultActionPerformed

        JFrame frame = new JFrame();
        String[] options = {"Sobreviventes", "inimigos"};
        int opcao = JOptionPane.showOptionDialog(frame.getContentPane(), "Quem está realizando o ataque?", "Sobreviventes/Inimigos", 0, JOptionPane.WARNING_MESSAGE, null, options, null);
        // -1 = cancela; 0 - Sobreviventes; 1 - inimigos;
        if (opcao == -1) {
            return;
        }

        if (opcao == 0) {
            realizaAtaque(this.listaEmDEF);
            jDialogCombate.dispose();
        } else {
            realizaDefesa(this.listaEmATK);
            jDialogCombate.dispose();
        }

    }//GEN-LAST:event_jButtonGeraResultActionPerformed

    private void realizaAtaque(JList jList) {
        //caculo do dano à vitalidade inimiga:
        Integer vitPosAtk = Integer.parseInt(jTextFieldAtkATKTotal.getText()) - Integer.parseInt(jTextFieldVitDEFTotal.getText());
        if (vitPosAtk < 0) {
            vitPosAtk = vitPosAtk * -1;
        }

        Integer quantPosAtk = (Integer) Math.round(vitPosAtk / Integer.parseInt(jTextFieldVitDEF.getText()));
        Integer index = jList.getSelectedIndex();
        jTextFieldQuantDEF.setText(quantPosAtk.toString());

        String mudancaQuant = jList.getSelectedValue().toString();
        Integer comeco = mudancaQuant.indexOf(" ");
        Integer fim = mudancaQuant.indexOf(")");
        String quant = mudancaQuant.substring(comeco, fim).trim();

        DefaultListModel listModel = (DefaultListModel) jList.getModel();
        if (Integer.parseInt(quant) <= 1) {
            listModel.removeElementAt(index);
        } else {
            mudancaQuant = mudancaQuant.replace(quant, quantPosAtk.toString());
            listModel.setElementAt(mudancaQuant, index);
        }
        jList.setModel(listModel);

        //calculo para o dano à moral
        Integer dano = Integer.parseInt(jTextFieldAtkATKTotal.getText()) - Integer.parseInt(jTextFieldDefDEFTotal.getText());

        if (dano >= 0) {
            Integer moral = Integer.parseInt(this.moralAtual.getText());
            Integer moralNova = moral - dano;
            this.moralAtual.setText(moralNova.toString());

            if (moralNova <= 0) {
                tomaPonto(this.listaEmATK, this.listaEmDEF, this.botaoMoral, this.moralAtual, true);
            } else {
                if (moralNova >= 6000) {
                    tomaPonto(this.listaEmATK, this.listaEmDEF, this.botaoMoral, this.moralAtual, false);
                }
            }

        }

    }

    private void realizaDefesa(JList jList) {
        //caculo do dano à vitalidade inimiga:
        Integer vitPosAtk = Integer.parseInt(jTextFieldAtkDEFTotal.getText()) - Integer.parseInt(jTextFieldVitATKTotal.getText());
        if (vitPosAtk < 0) {
            vitPosAtk = vitPosAtk * -1;
        }

        Integer quantPosAtk = (Integer) Math.round(vitPosAtk / Integer.parseInt(jTextFieldVitATK.getText()));
        Integer index = jList.getSelectedIndex();
        jTextFieldQuantATK.setText(quantPosAtk.toString());

        String mudancaQuant = jList.getSelectedValue().toString();
        Integer comeco = mudancaQuant.indexOf(" ");
        Integer fim = mudancaQuant.indexOf(")");
        String quant = mudancaQuant.substring(comeco, fim).trim();

        DefaultListModel listModel = (DefaultListModel) jList.getModel();
        if (Integer.parseInt(quant) <= 1) {
            listModel.removeElementAt(index);
        } else {
            mudancaQuant = mudancaQuant.replace(quant, quantPosAtk.toString());
            listModel.setElementAt(mudancaQuant, index);
        }
        jList.setModel(listModel);

        //calculo para o dano à moral
        Integer dano = Integer.parseInt(jTextFieldAtkDEFTotal.getText()) - Integer.parseInt(jTextFieldDefATKTotal.getText());

        if (dano >= 0) {
            Integer moral = Integer.parseInt(this.moralAtual.getText());
            Integer moralNova = moral + dano;
            this.moralAtual.setText(moralNova.toString());

            if (moralNova <= 0) {
                tomaPonto(this.listaEmATK, this.listaEmDEF, this.botaoMoral, this.moralAtual, true);
            } else {
                if (moralNova >= 6000) {
                    tomaPonto(this.listaEmATK, this.listaEmDEF, this.botaoMoral, this.moralAtual, false);
                }
            }
        }

    }

    private void tomaPonto(JList atacante, JList defensor, JButton moral, JTextField moralCampo, boolean vencedor) {
        // true - atacante; false - perdedor
        atacante.setSelectedIndex(0);
        defensor.setSelectedIndex(0);

        atacante.setEnabled(false);
        defensor.setEnabled(false);
        moral.setEnabled(false);

        if (vencedor) {
            moralCampo.setText("SOBREVIVENTES");
        } else {
            moralCampo.setText("INIMIGOS");
        }
    }


    private void jButtonRemovAtkNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovAtkNorteActionPerformed
        remocao(jListAtkNorte, true, jPanelGuarnicao, true);
    }//GEN-LAST:event_jButtonRemovAtkNorteActionPerformed

    private void jButtonMoralNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoralNorteActionPerformed
        modificarMoral(jTextFieldMoralNorte);
    }//GEN-LAST:event_jButtonMoralNorteActionPerformed

    private void jButtonAddGuarniDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddGuarniDefActionPerformed
        try {
            Guarnicao guarnicao = new Guarnicao(jListDefNorte, jListDefSul, jListDefLeste, jListDefOeste, false);
            guarnicao.setVisible(true);
            guarnicao.setEnabled(true);
            Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de tropas referente a essa guarnição: "));

            if (opcao == -1) {
                return;
            }
            guarnicao.setQuantidadeMaxima(opcao);

            jPanelGuarnicao1.add(guarnicao);
            jPanelGuarnicao1.revalidate();
            jPanelGuarnicao1.repaint();

            //guarnicoesInimigos.add(guarnicao);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira apenas valores númericos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido!\n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddGuarniDefActionPerformed

    private void jButtonRemovGuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovGuar1ActionPerformed
        try {
            jPanelGuarnicao1.remove(jPanelGuarnicao1.getComponentCount() - 1);
            jPanelGuarnicao1.revalidate();
            jPanelGuarnicao1.repaint();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Não há guarnições para se remover");
        }
    }//GEN-LAST:event_jButtonRemovGuar1ActionPerformed

    private void jButtonRemovDefNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovDefNorteActionPerformed
        remocao(jListDefNorte, false, jPanelGuarnicao1, false);
    }//GEN-LAST:event_jButtonRemovDefNorteActionPerformed

    private void jButtonRemovAtkLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovAtkLesteActionPerformed
        remocao(jListAtkLeste, true, jPanelGuarnicao, true);
    }//GEN-LAST:event_jButtonRemovAtkLesteActionPerformed

    private void jButtonRemovDefLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovDefLesteActionPerformed
        remocao(jListDefLeste, false, jPanelGuarnicao1, false);
    }//GEN-LAST:event_jButtonRemovDefLesteActionPerformed

    private void jButtonCombaterLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCombaterLesteActionPerformed
        boolean vereficado = vereficador(jListAtkLeste, jListDefLeste);
        //Fazer a defesa!!!!!!!
        if (vereficado) {
            this.listaEmATK = jListAtkLeste;
            this.listaEmDEF = jListDefLeste;
            this.moralAtual = jTextFieldMoralLeste;

            if (jListAtkLeste.getSelectedValue().equals("MORAL")) {
                ataqueMoral(false, jListDefLeste);
                return;
            } else {
                if (jListDefLeste.getSelectedValue().equals("MORAL")) {
                    ataqueMoral(true, jListAtkLeste);
                    return;
                }
            }
            //Set do ataque
            JTextField[] jTextField = new JTextField[14];
            jTextField[0] = jTextFieldNomeATK;
            jTextField[1] = jTextFieldVitATK;
            jTextField[2] = jTextFieldAtkATK;
            jTextField[3] = jTextFieldDefATK;
            jTextField[4] = jTextFieldStealATK;
            jTextField[5] = jTextFieldFuncATK;
            jTextField[6] = jTextFieldBonusATK;

            String aux = String.valueOf(tratamentoGetQuant(jListAtkLeste.getSelectedValue()));
            jTextFieldQuantATK.setText(aux);
            jTextField[7] = jTextFieldQuantATK;

            jTextField[8] = jTextFieldVitATKTotal;
            jTextField[9] = jTextFieldAtkATKTotal;
            jTextField[10] = jTextFieldDefATKTotal;
            jTextField[11] = jTextFieldStealATKTotal;
            jTextField[12] = jTextFieldFuncATKTotal;
            jTextField[13] = jTextFieldBonusATKTotal;

            setCombate(jTextField, jListAtkLeste, true);

            //Set da defesa
            JTextField[] jTextFieldDEF = new JTextField[14];
            jTextFieldDEF[0] = jTextFieldNomeDEF;
            jTextFieldDEF[1] = jTextFieldVitDEF;
            jTextFieldDEF[2] = jTextFieldAtkDEF;
            jTextFieldDEF[3] = jTextFieldDefDEF;
            jTextFieldDEF[4] = jTextFieldStealDEF;
            jTextFieldDEF[5] = jTextFieldFuncDEF;
            jTextFieldDEF[6] = jTextFieldBonusDEF;

            String auxDEF = String.valueOf(tratamentoGetQuant(jListDefLeste.getSelectedValue()));
            jTextFieldQuantDEF.setText(auxDEF);
            jTextField[7] = jTextFieldQuantDEF;

            jTextFieldDEF[8] = jTextFieldVitDEFTotal;
            jTextFieldDEF[9] = jTextFieldAtkDEFTotal;
            jTextFieldDEF[10] = jTextFieldDefDEFTotal;
            jTextFieldDEF[11] = jTextFieldStealDEFTotal;
            jTextFieldDEF[12] = jTextFieldFuncDEFTotal;
            jTextFieldDEF[13] = jTextFieldBonusDEFTotal;

            setCombate(jTextFieldDEF, jListDefLeste, false);

            jDialogCombate.setEnabled(true);
            jDialogCombate.setVisible(true);
            jDialogCombate.toFront();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma guarnição atacante e uma guarnição defensora!");
        }
    }//GEN-LAST:event_jButtonCombaterLesteActionPerformed

    private void jButtonMoralLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoralLesteActionPerformed
        modificarMoral(jTextFieldMoralLeste);
    }//GEN-LAST:event_jButtonMoralLesteActionPerformed

    private void jButtonRemovAtkSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovAtkSulActionPerformed
        remocao(jListAtkSul, true, jPanelGuarnicao, true);
    }//GEN-LAST:event_jButtonRemovAtkSulActionPerformed

    private void jButtonRemovDefSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovDefSulActionPerformed
        remocao(jListDefSul, false, jPanelGuarnicao1, false);
    }//GEN-LAST:event_jButtonRemovDefSulActionPerformed

    private void jButtonCombaterSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCombaterSulActionPerformed
        boolean vereficado = vereficador(jListAtkSul, jListDefSul);
        //Fazer a defesa!!!!!!!
        if (vereficado) {
            this.listaEmATK = jListAtkSul;
            this.listaEmDEF = jListDefSul;
            this.moralAtual = jTextFieldMoralSul;

            if (jListAtkSul.getSelectedValue().equals("MORAL")) {
                ataqueMoral(false, jListDefSul);
                return;
            } else {
                if (jListDefSul.getSelectedValue().equals("MORAL")) {
                    ataqueMoral(true, jListAtkSul);
                    return;
                }
            }

            //Set do ataque
            JTextField[] jTextField = new JTextField[14];
            jTextField[0] = jTextFieldNomeATK;
            jTextField[1] = jTextFieldVitATK;
            jTextField[2] = jTextFieldAtkATK;
            jTextField[3] = jTextFieldDefATK;
            jTextField[4] = jTextFieldStealATK;
            jTextField[5] = jTextFieldFuncATK;
            jTextField[6] = jTextFieldBonusATK;

            String aux = String.valueOf(tratamentoGetQuant(jListAtkSul.getSelectedValue()));
            jTextFieldQuantATK.setText(aux);
            jTextField[7] = jTextFieldQuantATK;

            jTextField[8] = jTextFieldVitATKTotal;
            jTextField[9] = jTextFieldAtkATKTotal;
            jTextField[10] = jTextFieldDefATKTotal;
            jTextField[11] = jTextFieldStealATKTotal;
            jTextField[12] = jTextFieldFuncATKTotal;
            jTextField[13] = jTextFieldBonusATKTotal;

            setCombate(jTextField, jListAtkSul, true);

            //Set da defesa
            JTextField[] jTextFieldDEF = new JTextField[14];
            jTextFieldDEF[0] = jTextFieldNomeDEF;
            jTextFieldDEF[1] = jTextFieldVitDEF;
            jTextFieldDEF[2] = jTextFieldAtkDEF;
            jTextFieldDEF[3] = jTextFieldDefDEF;
            jTextFieldDEF[4] = jTextFieldStealDEF;
            jTextFieldDEF[5] = jTextFieldFuncDEF;
            jTextFieldDEF[6] = jTextFieldBonusDEF;

            String auxDEF = String.valueOf(tratamentoGetQuant(jListDefSul.getSelectedValue()));
            jTextFieldQuantDEF.setText(auxDEF);
            jTextField[7] = jTextFieldQuantDEF;

            jTextFieldDEF[8] = jTextFieldVitDEFTotal;
            jTextFieldDEF[9] = jTextFieldAtkDEFTotal;
            jTextFieldDEF[10] = jTextFieldDefDEFTotal;
            jTextFieldDEF[11] = jTextFieldStealDEFTotal;
            jTextFieldDEF[12] = jTextFieldFuncDEFTotal;
            jTextFieldDEF[13] = jTextFieldBonusDEFTotal;

            setCombate(jTextFieldDEF, jListDefSul, false);

            jDialogCombate.setEnabled(true);
            jDialogCombate.setVisible(true);
            jDialogCombate.toFront();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma guarnição atacante e uma guarnição defensora!");
        }
    }//GEN-LAST:event_jButtonCombaterSulActionPerformed

    private void jButtonMoralSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoralSulActionPerformed
        modificarMoral(jTextFieldMoralSul);
    }//GEN-LAST:event_jButtonMoralSulActionPerformed

    private void jButtonRemovAtkOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovAtkOesteActionPerformed
        remocao(jListAtkOeste, true, jPanelGuarnicao, true);
    }//GEN-LAST:event_jButtonRemovAtkOesteActionPerformed

    private void jButtonRemovDefOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovDefOesteActionPerformed
        remocao(jListDefOeste, false, jPanelGuarnicao1, false);
    }//GEN-LAST:event_jButtonRemovDefOesteActionPerformed

    private void jButtonCombaterOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCombaterOesteActionPerformed
        boolean vereficado = vereficador(jListAtkOeste, jListDefOeste);
        //Fazer a defesa!!!!!!!
        if (vereficado) {
            this.listaEmATK = jListAtkOeste;
            this.listaEmDEF = jListDefOeste;
            this.moralAtual = jTextFieldMoralOeste;

            if (jListAtkOeste.getSelectedValue().equals("MORAL")) {
                ataqueMoral(false, jListDefOeste);
                return;
            } else {
                if (jListDefOeste.getSelectedValue().equals("MORAL")) {
                    ataqueMoral(true, jListAtkOeste);
                    return;
                }
            }

            //Set do ataque
            JTextField[] jTextField = new JTextField[14];
            jTextField[0] = jTextFieldNomeATK;
            jTextField[1] = jTextFieldVitATK;
            jTextField[2] = jTextFieldAtkATK;
            jTextField[3] = jTextFieldDefATK;
            jTextField[4] = jTextFieldStealATK;
            jTextField[5] = jTextFieldFuncATK;
            jTextField[6] = jTextFieldBonusATK;

            String aux = String.valueOf(tratamentoGetQuant(jListAtkOeste.getSelectedValue()));
            jTextFieldQuantATK.setText(aux);
            jTextField[7] = jTextFieldQuantATK;

            jTextField[8] = jTextFieldVitATKTotal;
            jTextField[9] = jTextFieldAtkATKTotal;
            jTextField[10] = jTextFieldDefATKTotal;
            jTextField[11] = jTextFieldStealATKTotal;
            jTextField[12] = jTextFieldFuncATKTotal;
            jTextField[13] = jTextFieldBonusATKTotal;

            setCombate(jTextField, jListAtkOeste, true);

            //Set da defesa
            JTextField[] jTextFieldDEF = new JTextField[14];
            jTextFieldDEF[0] = jTextFieldNomeDEF;
            jTextFieldDEF[1] = jTextFieldVitDEF;
            jTextFieldDEF[2] = jTextFieldAtkDEF;
            jTextFieldDEF[3] = jTextFieldDefDEF;
            jTextFieldDEF[4] = jTextFieldStealDEF;
            jTextFieldDEF[5] = jTextFieldFuncDEF;
            jTextFieldDEF[6] = jTextFieldBonusDEF;

            String auxDEF = String.valueOf(tratamentoGetQuant(jListDefOeste.getSelectedValue()));
            jTextFieldQuantDEF.setText(auxDEF);
            jTextField[7] = jTextFieldQuantDEF;

            jTextFieldDEF[8] = jTextFieldVitDEFTotal;
            jTextFieldDEF[9] = jTextFieldAtkDEFTotal;
            jTextFieldDEF[10] = jTextFieldDefDEFTotal;
            jTextFieldDEF[11] = jTextFieldStealDEFTotal;
            jTextFieldDEF[12] = jTextFieldFuncDEFTotal;
            jTextFieldDEF[13] = jTextFieldBonusDEFTotal;

            setCombate(jTextFieldDEF, jListDefOeste, false);

            jDialogCombate.setEnabled(true);
            jDialogCombate.setVisible(true);
            jDialogCombate.toFront();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma guarnição atacante e uma guarnição defensora!");
        }
    }//GEN-LAST:event_jButtonCombaterOesteActionPerformed

    private void jButtonMoralOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoralOesteActionPerformed
        modificarMoral(jTextFieldMoralOeste);
    }//GEN-LAST:event_jButtonMoralOesteActionPerformed

    private void jMenuResetarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuResetarMouseClicked
        resetAreas(jListAtkNorte, jListDefNorte, jTextFieldMoralNorte);
        resetAreas(jListAtkSul, jListDefSul, jTextFieldMoralSul);
        resetAreas(jListAtkLeste, jListDefLeste, jTextFieldMoralLeste);
        resetAreas(jListAtkOeste, jListDefOeste, jTextFieldMoralOeste);

        resetJogadores(jPanelGuarnicao);
        resetJogadores(jPanelGuarnicao1);
        
        this.listaEmATK = null;
        this.listaEmDEF = null;
        this.moralAtual = null;
    }//GEN-LAST:event_jMenuResetarMouseClicked

    private void resetAreas(JList jlistAtaque, JList jlistDefesa, JTextField jTextFieldMoral) {
        jlistAtaque.setEnabled(true);
        jlistDefesa.setEnabled(true);
        jTextFieldMoral.setEnabled(true);

        
        DefaultListModel listagem1 = new DefaultListModel();
        listagem1.addElement("MORAL");
        jlistAtaque.setModel(listagem1);
        
        DefaultListModel listagem2 = new DefaultListModel();
        listagem2.addElement("MORAL");
        jlistDefesa.setModel(listagem2);

        jTextFieldMoral.setText("2500");
    }

    private void resetJogadores(JPanel painel) {
        do {
            try {
                painel.remove(painel.getComponentCount() - 1);
                painel.revalidate();
                painel.repaint();
            } catch (ArrayIndexOutOfBoundsException e) {
                return;
            }

        } while (true);

    }

    private void modificarMoral(JTextField jTextField) {
        JFrame frame = new JFrame();
        String[] options = {"Aumentar", "Diminuir"};
        int opcao = JOptionPane.showOptionDialog(frame.getContentPane(), "O que desejas fazer?", "Aumentar/Diminuir", 0, JOptionPane.WARNING_MESSAGE, null, options, null);
        // -1 = cancela; 0 - creditar; 1 - debitar;
        if (opcao == -1) {
            return;
        }
        try {
            Integer valor, atual = Integer.parseInt(jTextField.getText());
            if (opcao == 0) {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de moral a ser aumentada: ", "Insira o valor", JOptionPane.QUESTION_MESSAGE));
                atual += valor;
            } else {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de moral a ser diminuida: ", "Insira o valor", JOptionPane.QUESTION_MESSAGE));
                atual -= valor;
            }

            jTextField.setText(String.valueOf(atual));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Este ponto já está sob controle, não é mais possível realizar ações nele");
        }

    }

    private void remocao(JList jList, boolean modoAtk, JPanel painel, boolean aliado) {
        if (!jList.isSelectionEmpty() && !jList.isSelectionEmpty()) {
            String selecionado = jList.getSelectedValue().toString();

            if (selecionado.equals("MORAL")) {
                JOptionPane.showMessageDialog(null, "Não é possível remover o item \"MORAL\"");
                return;
            }

            String guarnicaoAtacante = tratamentoGetNome(jList.getSelectedValue().toString());

            Integer quantidade = tratamentoGetQuant(jList.getSelectedValue().toString());
            Guerreiros g = new Guerreiros(guarnicaoAtacante, aliado);
            String forca = g.getForca();

            Guarnicao guarnicao = new Guarnicao(jListAtkNorte, jListDefNorte, null, null, forca, guarnicaoAtacante, quantidade, modoAtk);
            guarnicao.setVisible(true);
            guarnicao.setEnabled(true);

            painel.add(guarnicao);
            painel.revalidate();
            painel.repaint();

            DefaultListModel listModel = (DefaultListModel) jList.getModel();
            listModel.removeElementAt(jList.getSelectedIndex());
            jList.setModel(listModel);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma guarnição para remover");
        }
    }

    private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

    private String setTropa(Integer opcao) {
        String aux = "";

        switch (opcao) {

            case 1: //Roma
                aux = "<b> <font size=\"8\"> Soldados policiais </font> </b>- \n<br>"
                        + "<b>VIT:</b> 40; <br>\n"
                        + "<b>ATK:</b> 8; <br>\n"
                        + "<b>DEF:</b> 10; <br>\n"
                        + "<b>STEALTH:</b> 1;<br>\n"
                        + "<b>Função:</b> Defesa da linha de frente.<br>\n"
                        + "<b>Bónus:</b> Nenhum.<br><br>\n"
                        + "<br><b> <font size=\"8\"> Sargento policiais </font> </b>-  <br>\n"
                        + "<b>VIT:</b> 50; <br>\n"
                        + "<b>ATK:</b> 10; <br>\n"
                        + "<b>DEF:</b> 12; <br>\n"
                        + "<b>STEALTH:</b> 3;<br>\n"
                        + "<b>Função:</b> Defesa da linha de frente.<br>\n"
                        + "<b>Bónus:</b> Aumenta a DEF em +1 de todas as tropas policiais.<br><br>\n"
                        + "<br><b><font size=\"8\"> Comandante policial </font></b> - <br>\n"
                        + "<b>VIT:</b> 60; <br>\n"
                        + "<b>ATK:</b> 15; <br>\n"
                        + "<b>DEF:</b> 20; <br>\n"
                        + "<b>STEALTH:</b> 5;<br>\n"
                        + "<b>Função:</b> Defesa da linha de frente.<br>\n"
                        + "<b>Bónus:</b> Aumenta a DEF em +2 de todas as tropas.<br><br>\n"
                        + "<br><b><font size=\"8\"> Soldados militar </font></b> - <br>\n"
                        + "<b>VIT:</b> 40; <br>\n"
                        + "<b>ATK:</b> 10; <br>\n"
                        + "<b>DEF:</b> 8; <br>\n"
                        + "<b>STEALTH:</b> 1;<br>\n"
                        + "<b>Função:</b> Dano da linha de frente<br>\n"
                        + "<b>Bónus:</b> Nenhum.<br><br>\n"
                        + "<br><b><font size=\"8\"> Sargento militar </font></b> - \n<br>"
                        + "<b>VIT:</b> 50; <br>\n"
                        + "<b>ATK:</b> 12; <br>\n"
                        + "<b>DEF:</b> 10; \n"
                        + "<b>STEALTH:</b> 3;<br>\n"
                        + "<b>Função:</b> Dano da linha de frente<br>\n"
                        + "<b>Bónus:</b> Aumenta o ATK em +1 de todas as tropas militares.<br><br>\n"
                        + "<br><b><font size=\"8\"> Comandante militar </font></b> - <br>\n"
                        + "<b>VIT:</b> 60; <br>\n"
                        + "<b>ATK:</b> 20; <br>\n"
                        + "<b>DEF:</b> 15; <br>\n"
                        + "<b>STEALTH:</b> 5;<br>\n"
                        + "<b>Função:</b> Dano da linha de frente<br>\n"
                        + "<b>Bónus:</b> Aumenta o ATK em +2 de todas as tropas.<br><br>\n"
                        + "<br><b><font size=\"8\"> Médicos assistentes </font></b> - <br>\n"
                        + "<b>VIT:</b> 10; <br>\n"
                        + "<b>ATK:</b> 5; <br>\n"
                        + "<b>DEF:</b> 2; <br>\n"
                        + "<b>STEALTH:</b> 2;<br>\n"
                        + "<b>Função:</b> Suporte na linha de frente<br>\n"
                        + "<b>Bónus:</b> Recupera 5 de VIT de todas as tropas.<br><br>\n"
                        + "<br><b><font size=\"8\"> Médicos chefes </font></b> - <br>\n"
                        + "<b>VIT:</b> 20; <br>\n"
                        + "<b>ATK:</b> 8; <br>\n"
                        + "<b>DEF:</b> 5; <br>\n"
                        + "<b>STEALTH:</b> 3;<br>\n"
                        + "<b>Função:</b> Suporte na linha de frente<br>\n"
                        + "<b>Bónus:</b> Recupera 10 de VIT de todas as tropas.<br>";
                break;

            case 2://BHC
                aux = "<b><font size=\"8\">Soldado da BHC</font></b>  - <br>\n"
                        + "<b>VIT:</b> 50; <br>\n"
                        + "<b>ATK:</b> 12; <br>\n"
                        + "<b>DEF:</b> 10; <br>\n"
                        + "<b>STEALTH:</b> 4;<br>\n"
                        + "<b>Função:</b> Combate Stealth<br>\n"
                        + "<b>Bónus:</b> Quando com tropas de outras legiões, soldados da BHC atacam em turnos diferentes.<br>\n"
                        + "<br><br><b><font size=\"8\">Infiltrador da BHC</font></b> - <br>\n"
                        + "<b>VIT:</b> 60; <br>\n"
                        + "<b>ATK:</b> 16; <br>\n"
                        + "<b>DEF:</b> 12; <br>\n"
                        + "<b>STEALTH:</b> 5;<br>\n"
                        + "<b>Função:</b> Combate Stealth/Sabotagem<br>\n"
                        + "<b>Bónus:</b> Pode sabotar veículos inimigos bem como defesas automatizadas.<br>\n"
                        + "<br><br><b><font size=\"8\">Especialista da BHC</font></b> - <br>\n"
                        + "<b>VIT:</b> 70; <br>\n"
                        + "<b>ATK:</b> 25; <br>\n"
                        + "<b>DEF:</b> 20; <br>\n"
                        + "<b>STEALTH:</b> 5;<br>\n"
                        + "<b>Função:</b> Suporte geral<br>\n"
                        + "<b>Bónus:</b> Gera +1 de vantagem no dado para todas as ações na designação em que se encontra.<br>\n"
                        + "<br><br><b><font size=\"8\">Suporte da BHC</font></b>- <br>\n"
                        + "<b>VIT:</b> 40; <br>\n"
                        + "<b>ATK:</b> 10; <br>\n"
                        + "<b>DEF:</b> 8; <br>\n"
                        + "<b>STEALTH:</b> 3;<br>\n"
                        + "<b>Função:</b> Suporte na linha de frente / Combate na linha de frente<br>\n"
                        + "<b>Bónus:</b> Recupera 5 de VIT de todas as tropas / Ataca com lançadores químicos.<br>";
                break;

            case 3://Exercito
                aux = "<b><font size=\"8\">Soldados fuzileiros</font></b>  - \n<br>"
                        + "<b>VIT:</b> 50; \n<br>"
                        + "<b>ATK:</b> 12; \n<br>"
                        + "<b>DEF:</b> 10; \n<br>"
                        + "<b>STEALTH:</b> 2;\n<br>"
                        + "<b>Função:</b> Dano da linha de frente\n<br>"
                        + "<b>Bónus:</b> Nenhum.<br>\n"
                        + "<br><br><b><font size=\"8\">Sargento fuzileiros</font></b>  - \n<br>"
                        + "<b>VIT:</b> 60; \n<br>"
                        + "<b>ATK:</b> 16; \n<br>"
                        + "<b>DEF:</b> 12; \n<br>"
                        + "<b>STEALTH:</b> 4;\n<br>"
                        + "<b>Função:</b> Dano da linha de frente\n<br>"
                        + "<b>Bónus:</b> Aumenta o ATK em +1 de todas as tropas militares.<br>\n"
                        + "<br><br><b><font size=\"8\">Comandante fuzileiro</font></b> - \n<br>"
                        + "<b>VIT:</b> 70; \n<br>"
                        + "<b>ATK:</b> 25; \n<br>"
                        + "<b>DEF:</b> 20; \n<br>"
                        + "<b>STEALTH:</b> 5;\n<br>"
                        + "<b>Função:</b> Dano da linha de frente\n<br>"
                        + "<b>Bónus:</b> Aumenta o ATK em +2 de todas as tropas.<br>\n"
                        + "<br><br><b><font size=\"8\">Médicos fuzileiros</font></b>  - \n<br>"
                        + "<b>VIT:</b> 30; \n<br>"
                        + "<b>ATK:</b> 8; \n<br>"
                        + "<b>DEF:</b> 8; \n<br>"
                        + "<b>STEALTH:</b> 3;\n<br>"
                        + "<b>Função:</b> Suporte na linha de frente\n<br>"
                        + "<b>Bónus:</b> Recupera 5 de VIT de todas as tropas.<br>\n<br>"
                        + "<br><br><b><font size=\"8\">Cirurgiões fuzileiros</font></b> - \n<br>"
                        + "<b>VIT:</b> 40; \n<br>"
                        + "<b>ATK:</b> 12; \n<br>"
                        + "<b>DEF:</b> 10; \n<br>"
                        + "<b>STEALTH:</b> 4;\n<br>"
                        + "<b>Função:</b> Suporte na linha de frente\n<br>"
                        + "<b>Bónus:</b> Recupera 10 de VIT de todas as tropas.<br>";

                break;

            case 4:
                aux = "<b><font size=\"8\">Sobrevivente civil</font></b> - <br>\n"
                        + "<b>VIT:</b>  15; <br>\n"
                        + "<b>ATK:</b>  5; <br>\n"
                        + "<b>DEF:</b>  4; <br>\n"
                        + "<b>STEALTH:</b>  1;<br>\n"
                        + "<b>Função:</b>  Defesa da linha de frente.<br>\n"
                        + "<b>Bónus:</b>  Nenhum.<br>\n"
                        + "<br><br><b><font size=\"8\">Sobrevivente militar</font></b> - <br>\n"
                        + "<b>VIT:</b>  25; <br>\n"
                        + "<b>ATK:</b>  15; <br>\n"
                        + "<b>DEF:</b>  12; <br>\n"
                        + "<b>STEALTH:</b>  3;<br>\n"
                        + "<b>Função:</b>  Ataque na linha de frente.<br>\n"
                        + "<b>Bónus:</b>  Aumenta a ATK em +1 de todas as tropas.<br>\n"
                        + "<br><br><b><font size=\"8\">Sobrevivente especialista</font></b> - <br>\n"
                        + "<b>VIT:</b>  20; <br>\n"
                        + "<b>ATK:</b>  10; <br>\n"
                        + "<b>DEF:</b>  8; <br>\n"
                        + "<b>STEALTH:</b>  3;<br>\n"
                        + "<b>Função:</b>  Suporte geral.<br>\n"
                        + "<b>Bónus:</b>  Aumenta o ATK e a DEF em +2 de todas as tropas.<br>\n"
                        + "<br><br><b><font size=\"8\">Sobrevivente médico</font></b> - <br>\n"
                        + "<b>VIT:</b>  15; <br>\n"
                        + "<b>ATK:</b>  10; <br>\n"
                        + "<b>DEF:</b>  8; <br>\n"
                        + "<b>STEALTH:</b>  1;<br>\n"
                        + "<b>Função:</b>  Suporte na linha de frente.<br>\n"
                        + "<b>Bónus:</b>  Aumenta a VIT de toda a tropa em +5. Recupera +10 de VIT por rodada.<br>";
                break;

        }

        return aux;
    }

    private String setVeiculo(Integer opcao) {
        String aux = "";

        switch (opcao) {
            case 1://roma
                aux = "<b><font size=\"8\"> Carros civis com modificações </font></b> - \n<br>"
                        + "<b>VIT:</b> 50; \n<br>"
                        + "<b>ATK:</b> 10; \n<br>"
                        + "<b>DEF:</b> 6; \n<br>"
                        + "<b>Função:</b> Transporte/Combate defensivo\n<br>"
                        + "<b>Bónus:</b> Nenhum.\n<br>"
                        + "<b><font size=\"8\"> Hammer de combate </font></b> - \n<br>"
                        + "<b>VIT:</b> 80; \n<br>"
                        + "<b>ATK:</b> 20; \n<br>"
                        + "<b>DEF:</b> 15; \n<br>"
                        + "<b>Função:</b> Transporte/Combate ofensivo\n<br>"
                        + "<b>Bónus:</b> Aprova de bala, pistolas e submetralhadoras. \n<br>"
                        + "<b><font size=\"8\"> Tank </font></b> - \n<br>"
                        + "<b>VIT:</b> 200; \n<br>"
                        + "<b>ATK:</b> 50; \n<br>"
                        + "<b>DEF:</b> 50; \n<br>"
                        + "<b>Função:</b> Combate ofensivo\n<br>"
                        + "<b>Bónus:</b> Só pode ser destruído com lançadores de mísseis. \n<br>";
                break;

            case 2:
                aux = "<b><font size=\"8\">Carros civis esportivos</font></b> - <br>\n"
                        + "<b>VIT:</b> 30; <br>\n"
                        + "<b>ATK:</b>10; <br>\n"
                        + "<b>DEF:</b> 10; <br>\n"
                        + "<b>Função:</b> Transporte/Infiltração dinâmica<br>\n"
                        + "<b>Bónus:</b> +1 no dado para ações defensivas.<br>\n"
                        + "<br><br><b><font size=\"8\">Carrie Truck</font></b> - <br>\n"
                        + "<b>VIT:</b> 80; <br>\n"
                        + "<b>ATK:</b> 10; <br>\n"
                        + "<b>DEF:</b> 20; <br>\n"
                        + "<b>Função:</b> Transporte/Infiltração estática<br>\n"
                        + "<b>Bónus:</b> nenhum. <br>\n"
                        + "<br><br><b><font size=\"8\">Eagle</font></b> - <br>\n"
                        + "<b>VIT:</b> 100; <br>\n"
                        + "<b>ATK:</b> 10; <br>\n"
                        + "<b>DEF:</b> 20; <br>\n"
                        + "<b>Função:</b> Aéreo/ Infiltração<br>\n"
                        + "<b>Bónus:</b> +1 de vantagem no dado quando não for atacado por criaturas aladas ou lançadores Stingers.<br>\n"
                        + "<br><br><b><font size=\"8\">Apache</font></b>- <br>\n"
                        + "<b>VIT:</b> 150; <br>\n"
                        + "<b>ATK:</b> 40; <br>\n"
                        + "<b>DEF:</b> 30; <br>\n"
                        + "<b>Função:</b> Aéreo/ Combate ofensivo<br>\n"
                        + "<b>Bónus:</b> +1 de vantagem no dado quando não for atacado por criaturas aladas ou lançadores Stingers. <br>";
                break;

            case 3:
                aux = "<b><font size=\"8\">Hover terrestre</font></b> - \n<br>"
                        + "<b>VIT:</b> 80; <br>\n"
                        + "<b>ATK:</b> 15; <br>\n"
                        + "<b>DEF:</b> 10; <br>\n"
                        + "<b>Função:</b> Transporte/Combate defensivo<br>\n"
                        + "<b>Bónus:</b> Nenhum. <br>\n"
                        + "<br><br><b><font size=\"8\">Hammer de combate</font></b> - \n<br>"
                        + "<b>VIT:</b> 100; <br>\n"
                        + "<b>ATK:</b> 25; <br>\n"
                        + "<b>DEF:</b> 20; <br>\n"
                        + "<b>Função:</b> Transporte/Combate ofensivo<br>\n"
                        + "<b>Bónus:</b> Aprova de bala, pistolas e submetralhadoras. <br>\n"
                        + "<br><br><b><font size=\"8\">Tank</font></b> - \n<br>"
                        + "<b>VIT:</b> 200; <br>\n"
                        + "<b>ATK:</b> 50; <br>\n"
                        + "<b>DEF:</b> 50; <br>\n"
                        + "<b>Função:</b> Combate ofensivo<br>\n"
                        + "<b>Bónus:</b> Só pode ser destruído com lançadores de mísseis. <br>\n"
                        + "<br><br><b><font size=\"8\">Apache </font></b> - \n<br>"
                        + "<b>VIT:</b> 150; <br>\n"
                        + "<b>ATK:</b> 40; <br>\n"
                        + "<b>DEF:</b> 30; <br>\n"
                        + "<b>Função:</b> Aéreo/ Combate ofensivo<br>\n"
                        + "<b>Bónus:</b> +1 de vantagem no dado quando não for atacado por criaturas aladas ou lançadores Stingers. <br>";
                break;

            case 4:
                aux = "<b><font size=\"8\">Carros civis</font></b> - <br>\n"
                        + "<b>VIT:</b> 50; <br>\n"
                        + "<b>ATK:</b> 10; <br>\n"
                        + "<b>DEF:</b> 6; <br>\n"
                        + "<b>Função:</b> Transporte/Combate defensivo<br>\n"
                        + "<b>Bónus:</b> Nenhum.<br>\n"
                        + "<br><br><b><font size=\"8\">Carros civis esportivos</font></b> - <br>\n"
                        + "<b>VIT:</b> 30; <br>\n"
                        + "<b>ATK:</b> 10; <br>\n"
                        + "<b>DEF:</b> 10; <br>\n"
                        + "<b>Função:</b> Transporte/Infiltração dinâmica<br>\n"
                        + "<b>Bónus:</b> +1 no dado para ações defensivas.<br>\n"
                        + "<br><br><b><font size=\"8\">Hover terrestre</font></b> - <br>\n"
                        + "<b>VIT:</b> 80; <br>\n"
                        + "<b>ATK:</b> 15; <br>\n"
                        + "<b>DEF:</b> 15; <br>\n"
                        + "<b>Função:</b> Transporte/Combate ofensivo<br>\n"
                        + "<b>Bónus:</b> Aprova de bala, pistolas e submetralhadoras. <br>";
                break;
        }

        return aux;
    }

    private void setBonusLider(JComboBox comboBox, JEditorPane editorPane) {
        String classe = classes[comboBox.getSelectedIndex()];

        switch (classe) {
            case "Fuzileiro Naval":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>FUZILEIROS NAVAIS</u> fornecem um bónus de dano [30%] as suas tropas de infantaria contra humanos.");
                break;

            case "Força Policial":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>POLICIAIS</u> fornecem um bónus de defesa [30%] as suas tropas de infantaria.");
                break;

            case "B.H.C":
                editorPane.setText("<b>Bónus: </b> Como líderes, os membros da <u>B.H.C</u> fornecem um bónus de dano [30%] as suas tropas de infantaria contra infectados.");
                break;

            case "Hacker":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>HACKERS</u> fornecem um bónus de precisão, ganhando +1 de vantagem no dado para todas as ações.");
                break;

            case "Químico":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>QUÍMICOS</u> ganham ao final da última rodada antes de reiniciar o combate, uma rodada extra com a designação desejada.<br>Além disso, suas tropas ganham imunidade a veneno.");
                break;

            case "Médico":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>MÉDICOS</u> ao final de todas rodadas, recupera +10 de VITALIDADE de todos os membros das tropas em todas as designações.");
                break;

            case "Engenheiro":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>ENGENHEIROS</u> fornecem bónus de dano e defesa [30%] para seus veículos.");
                break;
        }
        this.lider = classe;

    }

    private void setBonusLiderAjuda(JComboBox comboBox, JEditorPane editorPane) {
        String classe = comboBox.getSelectedItem().toString();

        switch (classe) {
            case "Fuzileiro Naval":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>FUZILEIROS NAVAIS</u> fornecem um bónus de dano [30%] as suas tropas de infantaria contra humanos.");
                break;

            case "Força Policial":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>POLICIAIS</u> fornecem um bónus de defesa [30%] as suas tropas de infantaria.");
                break;

            case "B.H.C":
                editorPane.setText("<b>Bónus: </b> Como líderes, os membros da <u>B.H.C</u> fornecem um bónus de dano [30%] as suas tropas de infantaria contra infectados.");
                break;

            case "Hacker":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>HACKERS</u> fornecem um bónus de precisão, ganhando +1 de vantagem no dado para todas as ações.");
                break;

            case "Químico":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>QUÍMICOS</u> ganham ao final da última rodada antes de reiniciar o combate, uma rodada extra com a designação desejada.<br>Além disso, suas tropas ganham imunidade a veneno.");
                break;

            case "Médico":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>MÉDICOS</u> ao final de todas rodadas, recupera +10 de VITALIDADE de todos os membros das tropas em todas as designações.");
                break;

            case "Engenheiro":
                editorPane.setText("<b>Bónus: </b> Como líderes, <u>ENGENHEIROS</u> fornecem bónus de dano e defesa [30%] para seus veículos.");
                break;

            default:
                editorPane.setText("<b>Não há uma classe selecionada!</b>");
                break;
        }

    }

    private void setBonusSuporte(JComboBox comboBox, JEditorPane editorPane, boolean sup1) {
        String classe = classes[comboBox.getSelectedIndex()];

        switch (classe) {
            case "Fuzileiro Naval":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>FUZILEIROS NAVAIS</u> fornecem um bónus de dano [10%] as suas tropas de infantaria contra humanos.");
                break;

            case "Força Policial":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>POLICIAIS</u> fornecem um bónus de defesa [10%] as suas tropas de infantaria.");
                break;

            case "B.H.C":
                editorPane.setText("<b>Bónus: </b> Como suporte, os membros da <u>B.H.C</u> fornecem um bónus de dano [10%] as suas tropas de infantaria contra infectados.");
                break;

            case "Hacker":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>HACKERS</u> fornecem um bónus de precisão, ganhando +1 de vantagem no dado para uma ação de escolha.<br>O responsável deverá escolher antes de começar o combate entre ação de ataque ou de defesa");
                break;

            case "Químico":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>QUÍMICOS</u> fornecem imunidade à veneno para as tropas.");
                break;

            case "Médico":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>MÉDICOS</u> ao final de todas rodadas, recupera +10 de VITALIDADE de todos os membros das tropas de uma designação escolhida.");
                break;

            case "Engenheiro":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>ENGENHEIROS</u> fornecem bónus de dano e defesa [10%] para seus veículos.");
                break;

        }

        if (sup1) {
            this.suporte1 = classe;
        } else {
            this.suporte2 = classe;
        }

    }

    private void setBonusSuporteAjuda(JComboBox comboBox, JEditorPane editorPane) {
        String classe = comboBox.getSelectedItem().toString();

        switch (classe) {
            case "Fuzileiro Naval":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>FUZILEIROS NAVAIS</u> fornecem um bónus de dano [10%] as suas tropas de infantaria contra humanos.");
                break;

            case "Força Policial":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>POLICIAIS</u> fornecem um bónus de defesa [10%] as suas tropas de infantaria.");
                break;

            case "B.H.C":
                editorPane.setText("<b>Bónus: </b> Como suporte, os membros da <u>B.H.C</u> fornecem um bónus de dano [10%] as suas tropas de infantaria contra infectados.");
                break;

            case "Hacker":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>HACKERS</u> fornecem um bónus de precisão, ganhando +1 de vantagem no dado para uma ação de escolha.<br>O responsável deverá escolher antes de começar o combate entre ação de ataque ou de defesa");
                break;

            case "Químico":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>QUÍMICOS</u> fornecem imunidade à veneno para as tropas.");
                break;

            case "Médico":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>MÉDICOS</u> ao final de todas rodadas, recupera +10 de VITALIDADE de todos os membros das tropas de uma designação escolhida.");
                break;

            case "Engenheiro":
                editorPane.setText("<b>Bónus: </b> Como suporte, <u>ENGENHEIROS</u> fornecem bónus de dano e defesa [10%] para seus veículos.");
                break;

            default:
                editorPane.setText("<b>Não há uma classe selecionada!</b>");
                break;
        }

    }

    private String[] setQuant() {
        String aux[] = new String[100];
        for (Integer i = 1; i <= 100; i++) {
            aux[i - 1] = i.toString();
        }

        return aux;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new CampoGuerraView().setVisible(true);
            }
        });
    }

//<editor-fold defaultstate="collapsed" desc=" Declaração das variáveis NÃO MODIFICAR">

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddGuarniAtk;
    private javax.swing.JButton jButtonAddGuarniDef;
    private javax.swing.JButton jButtonBhcTrop;
    private javax.swing.JButton jButtonBhcVeic;
    private javax.swing.JButton jButtonCombaterLeste;
    private javax.swing.JButton jButtonCombaterNorte;
    private javax.swing.JButton jButtonCombaterOeste;
    private javax.swing.JButton jButtonCombaterSul;
    private javax.swing.JButton jButtonExercTrop;
    private javax.swing.JButton jButtonExercVeic;
    private javax.swing.JButton jButtonGeraResult;
    private javax.swing.JButton jButtonMoralLeste;
    private javax.swing.JButton jButtonMoralNorte;
    private javax.swing.JButton jButtonMoralOeste;
    private javax.swing.JButton jButtonMoralSul;
    private javax.swing.JButton jButtonRemovAtkLeste;
    private javax.swing.JButton jButtonRemovAtkNorte;
    private javax.swing.JButton jButtonRemovAtkOeste;
    private javax.swing.JButton jButtonRemovAtkSul;
    private javax.swing.JButton jButtonRemovDefLeste;
    private javax.swing.JButton jButtonRemovDefNorte;
    private javax.swing.JButton jButtonRemovDefOeste;
    private javax.swing.JButton jButtonRemovDefSul;
    private javax.swing.JButton jButtonRemovGuar;
    private javax.swing.JButton jButtonRemovGuar1;
    private javax.swing.JButton jButtonRomaTrop;
    private javax.swing.JButton jButtonRomaVeic;
    private javax.swing.JButton jButtonSobrevTrop;
    private javax.swing.JButton jButtonSobrevVeic;
    private javax.swing.JComboBox<String> jComboBoxAjudaClasse;
    private javax.swing.JComboBox<String> jComboBoxLiderAtk;
    private javax.swing.JComboBox<String> jComboBoxLiderDef;
    private javax.swing.JComboBox<String> jComboBoxSupAtk1;
    private javax.swing.JComboBox<String> jComboBoxSupAtk2;
    private javax.swing.JComboBox<String> jComboBoxSupDef1;
    private javax.swing.JComboBox<String> jComboBoxSupDef2;
    private javax.swing.JDialog jDialogAjuda;
    private javax.swing.JDialog jDialogCombate;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JEditorPane jEditorPane3;
    private javax.swing.JEditorPane jEditorPane4;
    private javax.swing.JEditorPane jEditorPaneAjudaLider;
    private javax.swing.JEditorPane jEditorPaneAjudaSuporte;
    private javax.swing.JEditorPane jEditorPaneLiderAtk;
    private javax.swing.JEditorPane jEditorPaneLiderDef;
    private javax.swing.JEditorPane jEditorPaneSup1;
    private javax.swing.JEditorPane jEditorPaneSup2;
    private javax.swing.JEditorPane jEditorPaneSupDef1;
    private javax.swing.JEditorPane jEditorPaneSupDef2;
    private javax.swing.JEditorPane jEditorPaneTropasDisp;
    private javax.swing.JEditorPane jEditorPaneTropasVeic;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAjudaImgClasse;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JList<String> jListAtkLeste;
    private javax.swing.JList<String> jListAtkNorte;
    private javax.swing.JList<String> jListAtkNorte1;
    private javax.swing.JList<String> jListAtkOeste;
    private javax.swing.JList<String> jListAtkSul;
    private javax.swing.JList<String> jListDefLeste;
    private javax.swing.JList<String> jListDefNorte;
    private javax.swing.JList<String> jListDefOeste;
    private javax.swing.JList<String> jListDefSul;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuAtaque;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDefesa;
    private javax.swing.JMenu jMenuResetar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAtaque1;
    private javax.swing.JPanel jPanelDefesa;
    private javax.swing.JPanel jPanelGuarnicao;
    private javax.swing.JPanel jPanelGuarnicao1;
    private javax.swing.JPanel jPanelGuerra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPaneAtaque;
    private javax.swing.JScrollPane jScrollPaneDefesa;
    private javax.swing.JScrollPane jScrollPaneGuarnicao;
    private javax.swing.JScrollPane jScrollPaneGuarnicao1;
    private javax.swing.JScrollPane jScrollPaneLeste;
    private javax.swing.JScrollPane jScrollPaneNorte;
    private javax.swing.JScrollPane jScrollPaneOeste;
    private javax.swing.JScrollPane jScrollPaneSul;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAtkATK;
    private javax.swing.JTextField jTextFieldAtkATKTotal;
    private javax.swing.JTextField jTextFieldAtkDEF;
    private javax.swing.JTextField jTextFieldAtkDEFTotal;
    private javax.swing.JTextField jTextFieldBonusATK;
    private javax.swing.JTextField jTextFieldBonusATKTotal;
    private javax.swing.JTextField jTextFieldBonusDEF;
    private javax.swing.JTextField jTextFieldBonusDEFTotal;
    private javax.swing.JTextField jTextFieldDefATK;
    private javax.swing.JTextField jTextFieldDefATKTotal;
    private javax.swing.JTextField jTextFieldDefDEF;
    private javax.swing.JTextField jTextFieldDefDEFTotal;
    private javax.swing.JTextField jTextFieldFuncATK;
    private javax.swing.JTextField jTextFieldFuncATKTotal;
    private javax.swing.JTextField jTextFieldFuncDEF;
    private javax.swing.JTextField jTextFieldFuncDEFTotal;
    private javax.swing.JTextField jTextFieldMoralLeste;
    private javax.swing.JTextField jTextFieldMoralNorte;
    private javax.swing.JTextField jTextFieldMoralOeste;
    private javax.swing.JTextField jTextFieldMoralSul;
    private javax.swing.JTextField jTextFieldNomeATK;
    private javax.swing.JTextField jTextFieldNomeDEF;
    private javax.swing.JTextField jTextFieldQuantATK;
    private javax.swing.JTextField jTextFieldQuantDEF;
    private javax.swing.JTextField jTextFieldStealATK;
    private javax.swing.JTextField jTextFieldStealATKTotal;
    private javax.swing.JTextField jTextFieldStealDEF;
    private javax.swing.JTextField jTextFieldStealDEFTotal;
    private javax.swing.JTextField jTextFieldVitATK;
    private javax.swing.JTextField jTextFieldVitATKTotal;
    private javax.swing.JTextField jTextFieldVitDEF;
    private javax.swing.JTextField jTextFieldVitDEFTotal;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
