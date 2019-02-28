/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import rpg2.ArmasItens.Equipamentos;
import rpg2.Inimigos.Inimigos;
import rpg2.Historia.Save;
import rpg2.Historia.CapView;
import rpg2.Utilitarios.CampoBatalhaView;
import rpg2.Utilitarios.MapaView;
import rpg2.Utilitarios.CalculadoraSorte;
import rpg2.Utilitarios.DadoView;
import rpg2.Ficha.BauPanel;
import rpg2.Ficha.BauView;
import rpg2.Ajuda.AjudaStatusView;
import rpg2.Ajuda.ClassesView;
import rpg2.Ajuda.NPCView;
import rpg2.Ajuda.HistoriaView;
import rpg2.Ajuda.VeiculoView;
import rpg2.ArmasItens.Acessorios;
import rpg2.ArmasItens.Armas;
import java.awt.Color;
import javax.swing.*;
import rpg2.Imagens.Imagens;
import java.awt.Image;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import rpg2.ArmasItens.ModBranco;
import rpg2.Ficha.Codigo;
import rpg2.Ficha.JPanelFichaToin;
import rpg2.Inimigos.ControleInimigo;
import rpg2.Inimigos.InimigoMedievalOBJ;
import rpg2.Inimigos.InimigosOBJ;
import rpg2.Inimigos.PersistirInimigoMedieval;
import rpg2.Loja.Loja;

/**
 *
 * @author M4ESTRO
 */
public class MedievalRPGView extends javax.swing.JFrame {

    //<editor-fold defaultstate="collapsed" desc=" VARIAVEIS ">
    int resultado, inimigoSelecionado = 0, tipoArma = 0, armaSelecionada = 0, armaFinal = 0, acessorioSelecionado = 0;
    int tipoAcessorio = 0;
    String aux, hora;

    static boolean carregado = true;
    ImageIcon imagemFundoIcon = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Tela 01.jpg"));
    Image imagemFundoImage = imagemFundoIcon.getImage();
    JTextField[] nomes = new JTextField[4];
    int opcaoTema = 0;
    CapView cap = new CapView();

    static int numFicha = 0;

    public static int getNumFicha() {
        return numFicha;
    }

    //</editor-fold>
    //Ajuda
    HistoriaView historiaFrame = new HistoriaView();
    AjudaStatusView statusFrame = new AjudaStatusView();
    ClassesView classesFrame = new ClassesView();
    NPCView npcFrame = new NPCView();
    VeiculoView veiculoFrame = new VeiculoView();

    //Utilitarios
    CalculadoraSorte percentual = new CalculadoraSorte();
    DadoView dados = new DadoView();
    CampoBatalhaView campoBatalha = new CampoBatalhaView();
    BauView bau = new BauView();
    MapaView mapa = new MapaView();

    //Save - LOAD
    boolean isCarregado = false;
    String grupoSave = "";

    //
    ImageIcon iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone64.png"));

    static boolean autenticadorMMS = false;
    private final String senhaMMS = "M4ESTRO";

    List<InimigoMedievalOBJ> inimigos = new ArrayList<>();

    public void setListInimigo() {
        int numeracao = ControleInimigo.getNumeracaoAtual();
        String aux;
        for (int i = 1; i <= numeracao; i++) {
            aux = "2018" + String.valueOf(i);
            InimigoMedievalOBJ inimigoMedieval = PersistirInimigoMedieval.carregarMedieval((Integer.parseInt(aux)));
            inimigos.add(inimigoMedieval);
        }
    }

    public static boolean getMMSStatus() {
        return autenticadorMMS;
    }

    //<editor-fold defaultstate="collapsed" desc=" Campos para o MMS ">
    JTextField[] campoTextoE = new JTextField[78];
    JTextArea[] campoAreaE = new JTextArea[3];
    JComboBox[] comboBoxE = new JComboBox[8];

    /*
     public void passaCampos() {
     //<editor-fold defaultstate="collapsed" desc=" Campos dos inimigos e armas">
     campoAreaE[0] = jTextAreaDescInimigo;
     campoAreaE[1] = jTextAreaItensInimigo;
     campoAreaE[2] = jTextAreaDescAcessorio;
     campoTextoE[68] = jTextFieldNomeInimigo;
     campoTextoE[69] = jTextFieldXPInimigo;
     campoTextoE[70] = jTextFieldGoldInimigo;
     campoTextoE[71] = jTextFieldLevelInimigo;
     campoTextoE[72] = jTextFieldHPInimigo;
     campoTextoE[73] = jTextFieldFORInimigo;
     campoTextoE[74] = jTextFieldSTMInimigo;
     campoTextoE[75] = jTextFieldRESInimigo;
     campoTextoE[76] = jTextFieldPERInimigo;
     campoTextoE[77] = jTextFieldINTInimigo;
     //</editor-fold>

     //<editor-fold defaultstate="collapsed" desc=" Campos da primeira ficha">
     campoTextoE[0] = jTextFieldNome4;
     campoTextoE[1] = jTextFieldVIT4;
     campoTextoE[2] = jTextFieldFor4;
     campoTextoE[3] = jTextFieldStm4;
     campoTextoE[4] = jTextFieldPes4;
     campoTextoE[5] = jTextFieldCar4;
     campoTextoE[6] = jTextFieldESP4;
     campoTextoE[7] = jTextFieldPer4;
     campoTextoE[8] = jTextFieldRes4;
     campoTextoE[9] = jTextFieldInt4;
     campoTextoE[10] = jTextFieldPontosDisponiveis4;
     campoTextoE[11] = jTextFieldNivel4;
     campoTextoE[12] = jTextFieldXP4;
     campoTextoE[13] = jTextFieldXPPra4;
     campoTextoE[14] = jTextFieldKarma4;
     campoTextoE[15] = jTextFieldVITAtual4;
     campoTextoE[16] = jTextFieldAPE4;

     comboBoxE[0] = jComboBoxClasses4;
     comboBoxE[1] = jComboBoxSexo4;
     //</editor-fold>

     //<editor-fold defaultstate="collapsed" desc=" Campos da segunda ficha">
     campoTextoE[17] = jTextFieldNome1;
     campoTextoE[18] = jTextFieldVIT1;
     campoTextoE[19] = jTextFieldFor1;
     campoTextoE[20] = jTextFieldStm1;
     campoTextoE[21] = jTextFieldPes1;
     campoTextoE[22] = jTextFieldCar1;
     campoTextoE[23] = jTextFieldESP1;
     campoTextoE[24] = jTextFieldPer1;
     campoTextoE[25] = jTextFieldRes1;
     campoTextoE[26] = jTextFieldInt1;
     campoTextoE[27] = jTextFieldPontosDisponiveis1;
     campoTextoE[28] = jTextFieldNivel1;
     campoTextoE[29] = jTextFieldXP1;
     campoTextoE[30] = jTextFieldXPPra1;
     campoTextoE[31] = jTextFieldKarma1;
     campoTextoE[32] = jTextFieldVITAtual1;
     campoTextoE[33] = jTextFieldAPE1;

     comboBoxE[2] = jComboBoxClasses1;
     comboBoxE[3] = jComboBoxSexo1;
     //</editor-fold>

     //<editor-fold defaultstate="collapsed" desc=" Campos da terceira ficha">
     campoTextoE[34] = jTextFieldNome2;
     campoTextoE[35] = jTextFieldVIT2;
     campoTextoE[36] = jTextFieldFor2;
     campoTextoE[37] = jTextFieldStm2;
     campoTextoE[38] = jTextFieldPes2;
     campoTextoE[39] = jTextFieldCar2;
     campoTextoE[40] = jTextFieldESP2;
     campoTextoE[41] = jTextFieldPer2;
     campoTextoE[42] = jTextFieldRes2;
     campoTextoE[43] = jTextFieldInt2;
     campoTextoE[44] = jTextFieldPontosDisponiveis2;
     campoTextoE[45] = jTextFieldNivel2;
     campoTextoE[46] = jTextFieldXP2;
     campoTextoE[47] = jTextFieldXPPra2;
     campoTextoE[48] = jTextFieldKarma2;
     campoTextoE[49] = jTextFieldVITAtual2;
     campoTextoE[50] = jTextFieldAPE2;

     comboBoxE[4] = jComboBoxClasses2;
     comboBoxE[5] = jComboBoxSexo2;
     //</editor-fold>

     //<editor-fold defaultstate="collapsed" desc=" Campos da quarta ficha">
     campoTextoE[51] = jTextFieldNome3;
     campoTextoE[52] = jTextFieldVIT3;
     campoTextoE[53] = jTextFieldFor3;
     campoTextoE[54] = jTextFieldStm3;
     campoTextoE[55] = jTextFieldPes3;
     campoTextoE[56] = jTextFieldCar3;
     campoTextoE[57] = jTextFieldESP3;
     campoTextoE[58] = jTextFieldPer3;
     campoTextoE[59] = jTextFieldRes3;
     campoTextoE[60] = jTextFieldInt3;
     campoTextoE[61] = jTextFieldPontosDisponiveis3;
     campoTextoE[62] = jTextFieldNivel3;
     campoTextoE[63] = jTextFieldXP3;
     campoTextoE[64] = jTextFieldXPPra3;
     campoTextoE[65] = jTextFieldKarma3;
     campoTextoE[66] = jTextFieldVITAtual3;
     campoTextoE[67] = jTextFieldAPE3;

     comboBoxE[6] = jComboBoxClasses3;
     comboBoxE[7] = jComboBoxSexo3;
     //</editor-fold>

     }*/
    //</editor-fold>
    /*
     ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Tela Inicial.jpg"));
     Image img = img2.getImage();
     */
    //<editor-fold defaultstate="collapsed" desc=" Icones ">
    final ImageIcon iconTelaAjuda = new ImageIcon("C:\\Users\\M4ESTRO\\Desktop\\RPG - The Unreal System Project\\Historia - Conceitos - Ideia basica\\Caveira2.png");
    //</editor-fold>

    /**
     * Creates new form DadoJFrame
     */
    public MedievalRPGView() {
        opcaoTema = LoadingView.getTema();
        //<editor-fold defaultstate="collapsed" desc=" OPCOES DOS TEMAS) ">

        if (opcaoTema == 1) {
            //<editor-fold defaultstate="collapsed" desc=" Tema Fort (DEFAULT COLOR - VERMELHO/CINZA) ">
            UIManager.put("nimbusBase", new Color(51, 51, 0));//
            UIManager.put("nimbusBlueGrey", new Color(31, 31, 45));//242, 242, 242
            UIManager.put("control", new Color(200, 200, 200));//
            //</editor-fold>
        } else if (opcaoTema == 2) {
            //<editor-fold defaultstate="collapsed" desc=" Tema Inferno da solidão (DEFAULT COLOR - ROXO/PRETO) ">
            UIManager.put("nimbusBase", new Color(51, 0, 51));
            UIManager.put("nimbusBlueGrey", new Color(98, 102, 108));
            UIManager.put("control", new Color(105, 100, 102));
            //</editor-fold>    
        } else {
            //<editor-fold defaultstate="collapsed" desc=" Tema Salvacao (DEFAULT COLOR - AZUL/BRANCO) ">
            UIManager.put("nimbusBase", new Color(81, 236, 241));
            UIManager.put("nimbusBlueGrey", new Color(81, 81, 235));
            UIManager.put("control", new Color(235, 235, 235));
            //</editor-fold> 
        }

        //</editor-fold>
        initComponents();
        jComboBoxLoja.setSelectedIndex(0);
        setListInimigo();
        for (int i = 0; i < inimigos.size(); i++) {
            jComboBoxInimigoList.addItem(inimigos.get(i).getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupProgressao = new javax.swing.ButtonGroup();
        jDialogLogin = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabeMMSStatus = new javax.swing.JLabel();
        jPasswordFieldModoMestre = new javax.swing.JPasswordField();
        jLabel28 = new javax.swing.JLabel();
        jButtonEncerrarMMS = new javax.swing.JButton();
        jButtonLoginMMS = new javax.swing.JButton();
        jDialogProgressao = new javax.swing.JDialog();
        jPanelProgressao = new javax.swing.JPanel();
        UIManager.put("ProgressBar.foreground", Color.RED);
        UIManager.put("ProgressBar.selectionForeground", Color.RED);
        UIManager.put("ProgressBar.selectionBackground", Color.RED);
        UIManager.put("ProgressBar.background", Color.RED);
        //UIManager.put("ProgressBar.foreground", Color.RED);
        jProgressBaEstoria = new javax.swing.JProgressBar();
        jButtonSalvarProgressao = new javax.swing.JButton();
        jButtonCarregarProgressao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSaveAtual = new javax.swing.JTextField();
        jButtonNovaProgressao = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldUltimoSave = new javax.swing.JTextField();
        jTextFieldUltimaModificacao = new javax.swing.JTextField();
        jDialogListaFicha = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextAreaListaFichas = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jDialogSobreInimigo = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPaneInimigoVant = new javax.swing.JEditorPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jEditorPaneInimigoDesvant = new javax.swing.JEditorPane();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTabbedPaneArquivo = new javax.swing.JTabbedPane();
        jScrollPaneHome = new javax.swing.JScrollPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();
        jPanelEquipamentos = new FundoTelas(22);
        jComboBoxEquipamento = new javax.swing.JComboBox<String>();
        jLabelImagemEquipamento = new javax.swing.JLabel();
        jLabelImagemItem = new javax.swing.JLabel();
        jComboBoxItem = new javax.swing.JComboBox<String>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPaneItem = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPaneDescEquip = new javax.swing.JEditorPane();
        jPanelArmas = new FundoTelas(8)
        ;
        jPanel2 = new FundoTelas(8);
        jComboBoxTipoArma = new javax.swing.JComboBox<String>();
        jComboBoxClasseArma = new javax.swing.JComboBox<String>();
        jLabelImagemArma = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNomeArma = new javax.swing.JTextField();
        jTextFieldPoderArma = new javax.swing.JTextField();
        jTextFieldCapacidadeArma = new javax.swing.JTextField();
        jTextFieldRecargaArma = new javax.swing.JTextField();
        jTextFieldRequisitoArma = new javax.swing.JTextField();
        jTextFieldAcessorioArma = new javax.swing.JTextField();
        jTextFieldEspecialArma = new javax.swing.JTextField();
        jComboBoxTipoAcessorio = new javax.swing.JComboBox<String>();
        jComboBoxAcessorio = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldNomeAcessorio = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPaneDescAcessorio = new javax.swing.JEditorPane();
        jLabelImagemAcessorio = new javax.swing.JLabel();
        jComboBoxArma = new javax.swing.JComboBox<String>();
        jButtonSobreAcessorios = new javax.swing.JButton();
        jButtonMunicaoQuimica = new javax.swing.JButton();
        jComboBoxTipoModBranca = new javax.swing.JComboBox<String>();
        jLabelImagemModBranca = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldNomeModBranca = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPaneDescModBranca = new javax.swing.JEditorPane();
        jComboBoxModBranco = new javax.swing.JComboBox<String>();
        jPanelInimigos = new FundoTelas(11)
        ;
        jPanel15 = new FundoTelas(11);
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNomeInimigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jTextFieldXPInimigo = new javax.swing.JTextField();
        jTextFieldGoldInimigo = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jTextFieldPVInimigo = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jTextFieldLevelInimigo = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        jTextFieldFORInimigo = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jTextFieldDESInimigo = new javax.swing.JTextField();
        jTextFieldSABInimigo = new javax.swing.JTextField();
        jTextFieldINTInimigo = new javax.swing.JTextField();
        jTextFieldSORInimigo = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        jTextFieldPMInimigo = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jTextFieldRESInimigo = new javax.swing.JTextField();
        jLabelImagemInimigo = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaItensInimigo = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextAreaDescInimigo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButtonSobreInimigo = new javax.swing.JButton();
        jComboBoxInimigoList = new javax.swing.JComboBox<String>();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldSexoInimigo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldRacaInimigo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldClasseInimigo = new javax.swing.JTextField();
        jScrollPaneLoja = new javax.swing.JScrollPane();
        jPanel5 = new FundoTelas(31);
        jComboBoxLoja = new javax.swing.JComboBox<String>();
        jTextFieldValorItem1 = new javax.swing.JTextField();
        jLabelValorLoja1 = new javax.swing.JLabel();
        jLabelDescLoja1 = new javax.swing.JLabel();
        jLabelImagemAmostra1 = new javax.swing.JLabel();
        jLabelImagemAmostra2 = new javax.swing.JLabel();
        jLabelDescLoja2 = new javax.swing.JLabel();
        jLabelValorLoja2 = new javax.swing.JLabel();
        jTextFieldValorItem2 = new javax.swing.JTextField();
        jLabelImagemAmostra3 = new javax.swing.JLabel();
        jLabelDescLoja3 = new javax.swing.JLabel();
        jLabelValorLoja3 = new javax.swing.JLabel();
        jTextFieldValorItem3 = new javax.swing.JTextField();
        jLabelImagemAmostra4 = new javax.swing.JLabel();
        jLabelDescLoja4 = new javax.swing.JLabel();
        jLabelValorLoja4 = new javax.swing.JLabel();
        jTextFieldValorItem4 = new javax.swing.JTextField();
        jLabelImagemAmostra5 = new javax.swing.JLabel();
        jLabelDescLoja5 = new javax.swing.JLabel();
        jLabelValorLoja5 = new javax.swing.JLabel();
        jTextFieldValorItem5 = new javax.swing.JTextField();
        jLabelImagemAmostra6 = new javax.swing.JLabel();
        jLabelDescLoja6 = new javax.swing.JLabel();
        jLabelValorLoja6 = new javax.swing.JLabel();
        jTextFieldValorItem6 = new javax.swing.JTextField();
        jLabelImagemAmostra7 = new javax.swing.JLabel();
        jLabelDescLoja7 = new javax.swing.JLabel();
        jTextFieldValorItem7 = new javax.swing.JTextField();
        jLabelImagemAmostra8 = new javax.swing.JLabel();
        jLabelDescLoja8 = new javax.swing.JLabel();
        jTextFieldValorItem8 = new javax.swing.JTextField();
        jLabelImagemAmostra9 = new javax.swing.JLabel();
        jLabelDescLoja9 = new javax.swing.JLabel();
        jTextFieldValorItem9 = new javax.swing.JTextField();
        jLabelImagemAmostra10 = new javax.swing.JLabel();
        jLabelDescLoja10 = new javax.swing.JLabel();
        jTextFieldValorItem10 = new javax.swing.JTextField();
        jLabelImagemAmostra11 = new javax.swing.JLabel();
        jLabelDescLoja11 = new javax.swing.JLabel();
        jTextFieldValorItem11 = new javax.swing.JTextField();
        jLabelImagemAmostra12 = new javax.swing.JLabel();
        jLabelDescLoja12 = new javax.swing.JLabel();
        jTextFieldValorItem12 = new javax.swing.JTextField();
        jLabelValorLoja7 = new javax.swing.JLabel();
        jLabelValorLoja8 = new javax.swing.JLabel();
        jLabelValorLoja9 = new javax.swing.JLabel();
        jLabelValorLoja10 = new javax.swing.JLabel();
        jLabelValorLoja11 = new javax.swing.JLabel();
        jLabelValorLoja12 = new javax.swing.JLabel();
        jScrollPaneAmostra1 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra1 = new javax.swing.JEditorPane();
        jScrollPaneAmostra2 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra2 = new javax.swing.JEditorPane();
        jScrollPaneAmostra3 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra4 = new javax.swing.JEditorPane();
        jScrollPaneAmostra4 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra3 = new javax.swing.JEditorPane();
        jScrollPaneAmostra5 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra5 = new javax.swing.JEditorPane();
        jScrollPaneAmostra6 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra6 = new javax.swing.JEditorPane();
        jScrollPaneAmostra7 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra7 = new javax.swing.JEditorPane();
        jScrollPaneAmostra8 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra8 = new javax.swing.JEditorPane();
        jScrollPaneAmostra9 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra9 = new javax.swing.JEditorPane();
        jScrollPaneAmostra10 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra10 = new javax.swing.JEditorPane();
        jScrollPaneAmostra11 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra11 = new javax.swing.JEditorPane();
        jScrollPaneAmostra12 = new javax.swing.JScrollPane();
        jEditorPaneAreaAmostra12 = new javax.swing.JEditorPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel26 = new FundoTelas(6);
        jLabelCAP1 = new javax.swing.JLabel();
        jLabelCAP2 = new javax.swing.JLabel();
        jLabelCAP3 = new javax.swing.JLabel();
        jLabelCAP4 = new javax.swing.JLabel();
        jLabelCAP5 = new javax.swing.JLabel();
        jLabelCAPFinal = new javax.swing.JLabel();
        jLabelCap2 = new javax.swing.JLabel();
        jLabelCap1 = new javax.swing.JLabel();
        jLabelCap3 = new javax.swing.JLabel();
        jLabelCap4 = new javax.swing.JLabel();
        jLabelCap5 = new javax.swing.JLabel();
        jLabelCapFinal = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuHistoria = new javax.swing.JMenu();
        jMenuStatus = new javax.swing.JMenu();
        jMenuClasses = new javax.swing.JMenu();
        jMenuNPCs = new javax.swing.JMenu();
        jMenuVeiculos = new javax.swing.JMenu();
        jMenuModoMestre = new javax.swing.JMenu();
        jMenuUtilitarios = new javax.swing.JMenu();
        jMenuDado = new javax.swing.JMenu();
        jMenuPercentual = new javax.swing.JMenu();
        jMenuMapa = new javax.swing.JMenu();
        jMenuBau = new javax.swing.JMenu();
        jMenuCampo = new javax.swing.JMenu();
        jMenuProgressao = new javax.swing.JMenu();
        jMenuFichas = new javax.swing.JMenu();
        jMenuADDFicha = new javax.swing.JMenu();
        jMenuRemoverFicha = new javax.swing.JMenu();
        jMenuListarFichas = new javax.swing.JMenu();
        jMenuCreditos = new javax.swing.JMenu();

        jDialogLogin.setTitle("Modo Mestre Supremo - Login");
        jDialogLogin.setIconImage(iconeTela.getImage());
        jDialogLogin.setMinimumSize(new java.awt.Dimension(315, 150));
        jDialogLogin.setModal(true);
        jDialogLogin.setResizable(false);

        jPanel20.setMaximumSize(new java.awt.Dimension(315, 150));
        jPanel20.setPreferredSize(new java.awt.Dimension(315, 150));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Modo Mestre Supremo: ");

        jLabeMMSStatus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeMMSStatus.setForeground(new java.awt.Color(255, 0, 0));
        jLabeMMSStatus.setText("DESATIVADO");

        jPasswordFieldModoMestre.setText("jPasswordField1kkkkkkkkk");
        jPasswordFieldModoMestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldModoMestreMouseClicked(evt);
            }
        });
        jPasswordFieldModoMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldModoMestreActionPerformed(evt);
            }
        });

        jLabel28.setText("Senha de ativação: ");

        jButtonEncerrarMMS.setText("Encerrar");
        jButtonEncerrarMMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncerrarMMSActionPerformed(evt);
            }
        });

        jButtonLoginMMS.setText("Logar");
        jButtonLoginMMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginMMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeMMSStatus))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jButtonEncerrarMMS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLoginMMS))
                            .addComponent(jPasswordFieldModoMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabeMMSStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jPasswordFieldModoMestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLoginMMS)
                    .addComponent(jButtonEncerrarMMS))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout jDialogLoginLayout = new javax.swing.GroupLayout(jDialogLogin.getContentPane());
        jDialogLogin.getContentPane().setLayout(jDialogLoginLayout);
        jDialogLoginLayout.setHorizontalGroup(
            jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialogLoginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jDialogLoginLayout.setVerticalGroup(
            jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialogLoginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jDialogProgressao.setTitle("Save/Load - Game");
        jDialogProgressao.setIconImage(Imagens.getIconeTela(0));
        jDialogProgressao.setMinimumSize(new java.awt.Dimension(350, 305));
        jDialogProgressao.setResizable(false);

        jPanelProgressao.setVisible(true);
        jPanelProgressao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jProgressBaEstoria.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBaEstoria.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBaEstoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jProgressBaEstoria.setStringPainted(true);

        jButtonSalvarProgressao.setText("Salvar");
        jButtonSalvarProgressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarProgressaoActionPerformed(evt);
            }
        });

        jButtonCarregarProgressao.setText("Carregar");
        jButtonCarregarProgressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarProgressaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Save atualmente carregado: ");

        jTextFieldSaveAtual.setEditable(false);

        jButtonNovaProgressao.setText("Novo");
        jButtonNovaProgressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaProgressaoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BARRA DE PROGRESSÃO");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel9.setText("Útilma vez salvo: ");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel17.setText("Última modificação: ");

        jTextFieldUltimoSave.setEditable(false);

        jTextFieldUltimaModificacao.setEditable(false);

        javax.swing.GroupLayout jPanelProgressaoLayout = new javax.swing.GroupLayout(jPanelProgressao);
        jPanelProgressao.setLayout(jPanelProgressaoLayout);
        jPanelProgressaoLayout.setHorizontalGroup(
            jPanelProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgressaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBaEstoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgressaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovaProgressao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonSalvarProgressao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarregarProgressao))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelProgressaoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaveAtual))
                    .addGroup(jPanelProgressaoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldUltimoSave))
                    .addGroup(jPanelProgressaoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUltimaModificacao)))
                .addContainerGap())
        );
        jPanelProgressaoLayout.setVerticalGroup(
            jPanelProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgressaoLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jProgressBaEstoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarProgressao)
                    .addComponent(jButtonCarregarProgressao)
                    .addComponent(jButtonNovaProgressao))
                .addGap(18, 18, 18)
                .addGroup(jPanelProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldSaveAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldUltimoSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldUltimaModificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogProgressaoLayout = new javax.swing.GroupLayout(jDialogProgressao.getContentPane());
        jDialogProgressao.getContentPane().setLayout(jDialogProgressaoLayout);
        jDialogProgressaoLayout.setHorizontalGroup(
            jDialogProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogProgressaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProgressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogProgressaoLayout.setVerticalGroup(
            jDialogProgressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogProgressaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProgressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogListaFicha.setMinimumSize(new java.awt.Dimension(400, 335));
        jDialogListaFicha.setResizable(false);

        jTextAreaListaFichas.setEditable(false);
        jTextAreaListaFichas.setColumns(20);
        jTextAreaListaFichas.setRows(5);
        jScrollPane19.setViewportView(jTextAreaListaFichas);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Lista de fichas já criadas:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
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
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogListaFichaLayout = new javax.swing.GroupLayout(jDialogListaFicha.getContentPane());
        jDialogListaFicha.getContentPane().setLayout(jDialogListaFichaLayout);
        jDialogListaFichaLayout.setHorizontalGroup(
            jDialogListaFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaFichaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogListaFichaLayout.setVerticalGroup(
            jDialogListaFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaFichaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialogSobreInimigo.setTitle("Vantagens/Desvantagens");
        jDialogSobreInimigo.setMinimumSize(new java.awt.Dimension(730, 380));
        jDialogSobreInimigo.setResizable(false);

        jLabel23.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel23.setText("Vantagens: ");

        jLabel24.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel24.setText("Desvantagens: ");

        jEditorPaneInimigoVant.setEditable(false);
        jScrollPane2.setViewportView(jEditorPaneInimigoVant);

        jEditorPaneInimigoDesvant.setEditable(false);
        jScrollPane6.setViewportView(jEditorPaneInimigoDesvant);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogSobreInimigoLayout = new javax.swing.GroupLayout(jDialogSobreInimigo.getContentPane());
        jDialogSobreInimigo.getContentPane().setLayout(jDialogSobreInimigoLayout);
        jDialogSobreInimigoLayout.setHorizontalGroup(
            jDialogSobreInimigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogSobreInimigoLayout.setVerticalGroup(
            jDialogSobreInimigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSobreInimigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel21.setText("jLabel21");

        jLabel22.setText("jLabel22");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Unreal System Project - RPG");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(iconeTela.getImage());
        setMinimumSize(Tela.telaFull());
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jTabbedPaneArquivo.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPaneArquivo.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPaneArquivo.setPreferredSize(Tela.telaFull());

        jScrollPaneHome.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPaneHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelHome.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder(0, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanelHome.setMaximumSize(new java.awt.Dimension(1900, 1080));
        jPanelHome.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanelHome.setPreferredSize(Tela.telaFull());
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 0));
        jLabel11.setText("Versão: Beta");
        jLabel11.setToolTipText("");
        jPanelHome.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        jLabelFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Medievais/Home.jpg"))); // NOI18N
        jLabelFundo.setToolTipText("Naqueles dias os homens procurarão a morte, mas não a encontrará; desejarão morrer, mas a morte fugirá deles. Apocalipse 9:6");
        jLabelFundo.setAlignmentX(0.5F);
        jLabelFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelFundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelFundo.setMaximumSize(new java.awt.Dimension(2222222, 2222222));
        jLabelFundo.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabelFundo.setPreferredSize(new java.awt.Dimension(2000, 1000));
        jPanelHome.add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        jScrollPaneHome.setViewportView(jPanelHome);

        jTabbedPaneArquivo.addTab("Home", jScrollPaneHome);

        jComboBoxEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um equipamento", "Máscara de Gás ", "Colete leve", "Colete médio", "Colete pesado", "Exo-esqueleto leve", "Exo-esqueleto médio", "Exo-esqueleto pesado" }));
        jComboBoxEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquipamentoActionPerformed(evt);
            }
        });

        jLabelImagemEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Exo-Esqueleto.jpg"))); // NOI18N
        jLabelImagemEquipamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabelImagemItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Spray de Primeiros Socorros.jpg"))); // NOI18N
        jLabelImagemItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jComboBoxItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o item", "Munição - Pistola", "Munição - Submetralhadora", "Munição - Escopeta", "Munição - Fuzil", "Munição - Sniper", "Munição - Magnum", "Munição - Especial", "Componente de Construção", "Componente Químico-Explosivo", "Componente Químico-Hospitalar", "Componente Eletrónico de Hackeamento", "Pílula - P", "Pílula - M", "Pílula - G", "Spray de Primeiros Socorros", "Kit de Primeiros Socorros", "Vacina de Cura - M", "Vacina de Cura - G", "Vacina Anti-infecção" }));
        jComboBoxItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxItemActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Soldados ao chao.png"))); // NOI18N

        jEditorPaneItem.setEditable(false);
        jEditorPaneItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item", 1, 0, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N
        jEditorPaneItem.setContentType("text/html"); // NOI18N
        jEditorPaneItem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jEditorPaneItem);

        jEditorPaneDescEquip.setEditable(false);
        jEditorPaneDescEquip.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipamento", 1, 0, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N
        jEditorPaneDescEquip.setContentType("text/html"); // NOI18N
        jEditorPaneDescEquip.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(jEditorPaneDescEquip);

        javax.swing.GroupLayout jPanelEquipamentosLayout = new javax.swing.GroupLayout(jPanelEquipamentos);
        jPanelEquipamentos.setLayout(jPanelEquipamentosLayout);
        jPanelEquipamentosLayout.setHorizontalGroup(
            jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipamentosLayout.createSequentialGroup()
                .addGroup(jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEquipamentosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelImagemEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxEquipamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(372, 372, 372)
                        .addGroup(jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEquipamentosLayout.createSequentialGroup()
                                .addComponent(jLabelImagemItem)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxItem, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEquipamentosLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEquipamentosLayout.createSequentialGroup()
                    .addGap(325, 325, 325)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(735, Short.MAX_VALUE)))
        );
        jPanelEquipamentosLayout.setVerticalGroup(
            jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagemItem)
                    .addComponent(jLabelImagemEquipamento)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEquipamentosLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(440, Short.MAX_VALUE)))
        );

        jTabbedPaneArquivo.addTab("Equipamentos & Itens", jPanelEquipamentos);

        jComboBoxTipoArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo de arma", "Fogo", "Branca", "Usavel" }));
        jComboBoxTipoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoArmaActionPerformed(evt);
            }
        });

        jComboBoxClasseArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a classe da arma" }));
        jComboBoxClasseArma.setEnabled(false);
        jComboBoxClasseArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClasseArmaActionPerformed(evt);
            }
        });

        jLabelImagemArma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemArma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arma", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Nome: ");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Poder de Fogo: ");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Capacidade: ");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Velocidade de Recarga: ");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("Requesito: ");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("Acessórios: ");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Especial: ");

        jTextFieldNomeArma.setEditable(false);
        jTextFieldNomeArma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextFieldPoderArma.setEditable(false);

        jTextFieldCapacidadeArma.setEditable(false);

        jTextFieldRecargaArma.setEditable(false);

        jTextFieldRequisitoArma.setEditable(false);

        jTextFieldAcessorioArma.setEditable(false);

        jTextFieldEspecialArma.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeArma))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPoderArma))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCapacidadeArma))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRecargaArma, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRequisitoArma))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEspecialArma)
                            .addComponent(jTextFieldAcessorioArma))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNomeArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPoderArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCapacidadeArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldRecargaArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRequisitoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAcessorioArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldEspecialArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBoxTipoAcessorio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo de acessório", "Cano", "Mira", "Barri", "Parte Inferior", "Punho & Pente" }));
        jComboBoxTipoAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoAcessorioActionPerformed(evt);
            }
        });

        jComboBoxAcessorio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o acessório" }));
        jComboBoxAcessorio.setEnabled(false);
        jComboBoxAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAcessorioActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acessórios", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Nome: ");

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel25.setText("Descrição: ");

        jTextFieldNomeAcessorio.setEditable(false);
        jTextFieldNomeAcessorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jScrollPane4.setViewportView(jEditorPaneDescAcessorio);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 231, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNomeAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabelImagemAcessorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Acessorios/defaultImg.png"))); // NOI18N
        jLabelImagemAcessorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a arma" }));
        jComboBoxArma.setEnabled(false);
        jComboBoxArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArmaActionPerformed(evt);
            }
        });

        jButtonSobreAcessorios.setText("Divisão-Acessórios");
        jButtonSobreAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreAcessoriosActionPerformed(evt);
            }
        });

        jButtonMunicaoQuimica.setText("Sobre as munições");
        jButtonMunicaoQuimica.setVisible(false);
        jButtonMunicaoQuimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMunicaoQuimicaActionPerformed(evt);
            }
        });

        jComboBoxTipoModBranca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo Modificação", "Ponta ", "Modificadores", "Empunhadeira" }));
        jComboBoxTipoModBranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoModBrancaActionPerformed(evt);
            }
        });

        jLabelImagemModBranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/Acessorios/defaultImg.png"))); // NOI18N
        jLabelImagemModBranca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificação", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel19.setText("Nome: ");

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel26.setText("Descrição: ");

        jTextFieldNomeModBranca.setEditable(false);
        jTextFieldNomeModBranca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jEditorPaneDescModBranca.setContentType("text/html"); // NOI18N
        jScrollPane5.setViewportView(jEditorPaneDescModBranca);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeModBranca, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldNomeModBranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );

        jComboBoxModBranco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o MOD" }));
        jComboBoxModBranco.setEnabled(false);
        jComboBoxModBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModBrancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxTipoAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxAcessorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxTipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxClasseArma, 0, 167, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSobreAcessorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelImagemAcessorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jComboBoxArma, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelImagemArma)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButtonMunicaoQuimica)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBoxTipoModBranca, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jComboBoxModBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelImagemModBranca)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipoModBranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxModBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelImagemModBranca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxTipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxClasseArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImagemArma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMunicaoQuimica))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxTipoAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImagemAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSobreAcessorios))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelArmasLayout = new javax.swing.GroupLayout(jPanelArmas);
        jPanelArmas.setLayout(jPanelArmasLayout);
        jPanelArmasLayout.setHorizontalGroup(
            jPanelArmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArmasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelArmasLayout.setVerticalGroup(
            jPanelArmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArmasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneArquivo.addTab("Armas", jPanelArmas);

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nome: ");

        jTextFieldNomeInimigo.setEditable(false);
        jTextFieldNomeInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Descrição: ");

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Drops: ");

        jTextFieldXPInimigo.setEditable(false);
        jTextFieldXPInimigo.setText("XP: ");
        jTextFieldXPInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextFieldGoldInimigo.setEditable(false);
        jTextFieldGoldInimigo.setText("GOLD:");
        jTextFieldGoldInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 0, 0), null), "Status", 0, 0, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));

        jLabel149.setText("PV:");

        jTextFieldPVInimigo.setEditable(false);

        jLabel150.setText("Level: ");

        jTextFieldLevelInimigo.setEditable(false);

        jLabel151.setText("FOR: ");

        jTextFieldFORInimigo.setEditable(false);

        jLabel152.setText("DES:");

        jLabel153.setText("SAB:");

        jLabel154.setText("INT:");

        jLabel155.setText("SOR:");

        jTextFieldDESInimigo.setEditable(false);

        jTextFieldSABInimigo.setEditable(false);

        jTextFieldINTInimigo.setEditable(false);

        jTextFieldSORInimigo.setEditable(false);

        jLabel156.setText("PM:");

        jTextFieldPMInimigo.setEditable(false);

        jLabel157.setText("RES:");

        jTextFieldRESInimigo.setEditable(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel151)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFORInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel153)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSABInimigo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel152)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDESInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel155)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSORInimigo)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel154)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldINTInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel157)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRESInimigo)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel150)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLevelInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel149)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPVInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPMInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLevelInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150)
                    .addComponent(jLabel149)
                    .addComponent(jTextFieldPVInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156)
                    .addComponent(jTextFieldPMInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel152)
                        .addComponent(jLabel154)
                        .addComponent(jTextFieldDESInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldINTInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldFORInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel153)
                        .addComponent(jTextFieldSABInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel157)
                        .addComponent(jTextFieldRESInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel155)
                        .addComponent(jTextFieldSORInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelImagemInimigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/defaultT.png"))); // NOI18N
        jLabelImagemInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextAreaItensInimigo.setEditable(false);
        jTextAreaItensInimigo.setColumns(20);
        jTextAreaItensInimigo.setLineWrap(true);
        jTextAreaItensInimigo.setRows(5);
        jTextAreaItensInimigo.setText("ITENS:");
        jTextAreaItensInimigo.setWrapStyleWord(true);
        jTextAreaItensInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane8.setViewportView(jTextAreaItensInimigo);

        jTextAreaDescInimigo.setEditable(false);
        jTextAreaDescInimigo.setColumns(20);
        jTextAreaDescInimigo.setLineWrap(true);
        jTextAreaDescInimigo.setRows(5);
        jTextAreaDescInimigo.setWrapStyleWord(true);
        jTextAreaDescInimigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane9.setViewportView(jTextAreaDescInimigo);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "Vantagens & Desvantagens", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButtonSobreInimigo.setText("Vantagens/Desvantagens");
        jButtonSobreInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreInimigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButtonSobreInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonSobreInimigo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jComboBoxInimigoList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o inimigo" }));
        jComboBoxInimigoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInimigoListActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Sexo:");

        jTextFieldSexoInimigo.setEditable(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Raça:");

        jTextFieldRacaInimigo.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Classe: ");

        jTextFieldClasseInimigo.setEditable(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane9))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel148)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldGoldInimigo)
                                            .addComponent(jTextFieldXPInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel29))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jTextFieldRacaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel30)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldClasseInimigo))
                                            .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jTextFieldNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldSexoInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jComboBoxInimigoList, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(336, 336, 336))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabelImagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jComboBoxInimigoList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextFieldNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jTextFieldSexoInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextFieldRacaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jTextFieldClasseInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel148)
                            .addComponent(jTextFieldXPInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldGoldInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelInimigosLayout = new javax.swing.GroupLayout(jPanelInimigos);
        jPanelInimigos.setLayout(jPanelInimigosLayout);
        jPanelInimigosLayout.setHorizontalGroup(
            jPanelInimigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInimigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInimigosLayout.setVerticalGroup(
            jPanelInimigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInimigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneArquivo.addTab("Inimigos", jPanelInimigos);

        jComboBoxLoja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a loja", "Loja Médica", "Loja de Equipamentos & Itens", "Loja de Armas de Fogo ", "Loja de Acessórios para armas de fogo", "Loja de Acessórios para armas brancas", "Loja de Armas Brancas " }));
        jComboBoxLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLojaActionPerformed(evt);
            }
        });

        jTextFieldValorItem1.setEditable(false);
        jTextFieldValorItem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelValorLoja1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja1.setText("Valor:");

        jLabelDescLoja1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja1.setText("Descrição");

        jLabelImagemAmostra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra1.setEnabled(false);

        jLabelImagemAmostra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra2.setEnabled(false);

        jLabelDescLoja2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja2.setText("Descrição");

        jLabelValorLoja2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja2.setText("Valor:");

        jTextFieldValorItem2.setEditable(false);
        jTextFieldValorItem2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra3.setEnabled(false);

        jLabelDescLoja3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja3.setText("Descrição");

        jLabelValorLoja3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja3.setText("Valor:");

        jTextFieldValorItem3.setEditable(false);
        jTextFieldValorItem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra4.setEnabled(false);

        jLabelDescLoja4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja4.setText("Descrição");

        jLabelValorLoja4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja4.setText("Valor:");

        jTextFieldValorItem4.setEditable(false);
        jTextFieldValorItem4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra5.setEnabled(false);

        jLabelDescLoja5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja5.setText("Descrição");

        jLabelValorLoja5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja5.setText("Valor:");

        jTextFieldValorItem5.setEditable(false);
        jTextFieldValorItem5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra6.setEnabled(false);

        jLabelDescLoja6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja6.setText("Descrição");

        jLabelValorLoja6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja6.setText("Valor:");

        jTextFieldValorItem6.setEditable(false);
        jTextFieldValorItem6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra7.setEnabled(false);

        jLabelDescLoja7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja7.setText("Descrição");

        jTextFieldValorItem7.setEditable(false);
        jTextFieldValorItem7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra8.setEnabled(false);

        jLabelDescLoja8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja8.setText("Descrição");

        jTextFieldValorItem8.setEditable(false);
        jTextFieldValorItem8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra9.setEnabled(false);

        jLabelDescLoja9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja9.setText("Descrição");

        jTextFieldValorItem9.setEditable(false);
        jTextFieldValorItem9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra10.setEnabled(false);

        jLabelDescLoja10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja10.setText("Descrição");

        jTextFieldValorItem10.setEditable(false);
        jTextFieldValorItem10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra11.setEnabled(false);

        jLabelDescLoja11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja11.setText("Descrição");

        jTextFieldValorItem11.setEditable(false);
        jTextFieldValorItem11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelImagemAmostra12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/ArmaPadrao.jpg"))); // NOI18N
        jLabelImagemAmostra12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabelImagemAmostra12.setEnabled(false);

        jLabelDescLoja12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDescLoja12.setText("Descrição");

        jTextFieldValorItem12.setEditable(false);
        jTextFieldValorItem12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelValorLoja7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja7.setText("Valor:");

        jLabelValorLoja8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja8.setText("Valor:");

        jLabelValorLoja9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja9.setText("Valor:");

        jLabelValorLoja10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja10.setText("Valor:");

        jLabelValorLoja11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja11.setText("Valor:");

        jLabelValorLoja12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelValorLoja12.setText("Valor:");

        jEditorPaneAreaAmostra1.setEditable(false);
        jEditorPaneAreaAmostra1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra1.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra1.setViewportView(jEditorPaneAreaAmostra1);

        jEditorPaneAreaAmostra2.setEditable(false);
        jEditorPaneAreaAmostra2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra2.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra2.setViewportView(jEditorPaneAreaAmostra2);

        jEditorPaneAreaAmostra4.setEditable(false);
        jEditorPaneAreaAmostra4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra4.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra3.setViewportView(jEditorPaneAreaAmostra4);

        jEditorPaneAreaAmostra3.setEditable(false);
        jEditorPaneAreaAmostra3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra3.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra4.setViewportView(jEditorPaneAreaAmostra3);

        jEditorPaneAreaAmostra5.setEditable(false);
        jEditorPaneAreaAmostra5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra5.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra5.setViewportView(jEditorPaneAreaAmostra5);

        jEditorPaneAreaAmostra6.setEditable(false);
        jEditorPaneAreaAmostra6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra6.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra6.setViewportView(jEditorPaneAreaAmostra6);

        jEditorPaneAreaAmostra7.setEditable(false);
        jEditorPaneAreaAmostra7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra7.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra7.setViewportView(jEditorPaneAreaAmostra7);

        jEditorPaneAreaAmostra8.setEditable(false);
        jEditorPaneAreaAmostra8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra8.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra8.setViewportView(jEditorPaneAreaAmostra8);

        jEditorPaneAreaAmostra9.setEditable(false);
        jEditorPaneAreaAmostra9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra9.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra9.setViewportView(jEditorPaneAreaAmostra9);

        jEditorPaneAreaAmostra10.setEditable(false);
        jEditorPaneAreaAmostra10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra10.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra10.setViewportView(jEditorPaneAreaAmostra10);

        jEditorPaneAreaAmostra11.setEditable(false);
        jEditorPaneAreaAmostra11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra11.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra11.setViewportView(jEditorPaneAreaAmostra11);

        jEditorPaneAreaAmostra12.setEditable(false);
        jEditorPaneAreaAmostra12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPaneAreaAmostra12.setContentType("text/html"); // NOI18N
        jEditorPaneAreaAmostra12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jScrollPaneAmostra12.setViewportView(jEditorPaneAreaAmostra12);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelImagemAmostra4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelValorLoja4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValorItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescLoja4)
                            .addComponent(jScrollPaneAmostra3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImagemAmostra5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelValorLoja5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValorItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescLoja5)
                            .addComponent(jScrollPaneAmostra5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImagemAmostra6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelValorLoja6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValorItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescLoja6)
                            .addComponent(jScrollPaneAmostra6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelImagemAmostra7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDescLoja7))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelValorLoja7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneAmostra7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagemAmostra8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelValorLoja8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValorItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescLoja8)
                            .addComponent(jScrollPaneAmostra8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImagemAmostra9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelValorLoja9)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldValorItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescLoja9)
                            .addComponent(jScrollPaneAmostra9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxLoja, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelImagemAmostra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelValorLoja1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldValorItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDescLoja1)
                                    .addComponent(jScrollPaneAmostra1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImagemAmostra2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelValorLoja2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldValorItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDescLoja2)
                                    .addComponent(jScrollPaneAmostra2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImagemAmostra3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelValorLoja3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldValorItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDescLoja3)
                                    .addComponent(jScrollPaneAmostra4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelImagemAmostra10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelValorLoja10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldValorItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDescLoja10)
                                    .addComponent(jScrollPaneAmostra10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImagemAmostra11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelValorLoja11)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFieldValorItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDescLoja11)
                                    .addComponent(jScrollPaneAmostra11, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImagemAmostra12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelValorLoja12)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFieldValorItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDescLoja12)
                                    .addComponent(jScrollPaneAmostra12, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jComboBoxLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPaneAmostra2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja2)))
                        .addComponent(jLabelImagemAmostra2))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPaneAmostra1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja1)))
                        .addComponent(jLabelImagemAmostra1))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPaneAmostra4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja3)))
                        .addComponent(jLabelImagemAmostra3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneAmostra3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja4)))
                        .addComponent(jLabelImagemAmostra4))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneAmostra5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja5)))
                        .addComponent(jLabelImagemAmostra5))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPaneAmostra6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja6)))
                        .addComponent(jLabelImagemAmostra6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneAmostra7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja7)))
                        .addComponent(jLabelImagemAmostra7))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneAmostra8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja8)))
                        .addComponent(jLabelImagemAmostra8))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneAmostra9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja9)))
                        .addComponent(jLabelImagemAmostra9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneAmostra10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja10)))
                        .addComponent(jLabelImagemAmostra10))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneAmostra11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja11)))
                        .addComponent(jLabelImagemAmostra11))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabelDescLoja12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPaneAmostra12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorItem12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelValorLoja12)))
                        .addComponent(jLabelImagemAmostra12)))
                .addGap(335, 335, 335))
        );

        jScrollPaneLoja.setViewportView(jPanel5);

        jTabbedPaneArquivo.addTab("Mercado", jScrollPaneLoja);

        jScrollPane11.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCAP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/cap1.png"))); // NOI18N
        jLabelCAP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCAP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCAP1MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCAP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, -1));

        jLabelCAP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/cap2.png"))); // NOI18N
        jLabelCAP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCAP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCAP2MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCAP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 240, 570));

        jLabelCAP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/cap3.png"))); // NOI18N
        jLabelCAP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCAP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCAP3MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCAP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabelCAP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/cap4.png"))); // NOI18N
        jLabelCAP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCAP4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCAP4MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCAP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        jLabelCAP5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/cap5.png"))); // NOI18N
        jLabelCAP5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCAP5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCAP5MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCAP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, -1));

        jLabelCAPFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/capF.png"))); // NOI18N
        jLabelCAPFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCAPFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCAPFinalMouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCAPFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 10, -1, -1));

        jLabelCap2.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabelCap2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCap2.setText("Capítulo 2");
        jLabelCap2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCap2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCap2MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        jLabelCap1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabelCap1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCap1.setText("Capítulo 1");
        jLabelCap1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCap1MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabelCap3.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabelCap3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCap3.setText("Capítulo 4");
        jLabelCap3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCap3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCap3MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCap3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, -1, -1));

        jLabelCap4.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabelCap4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCap4.setText("Capítulo 3");
        jLabelCap4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCap4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCap4MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCap4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, -1, -1));

        jLabelCap5.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabelCap5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCap5.setText("Capítulo 5");
        jLabelCap5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCap5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCap5MouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCap5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 580, -1, -1));

        jLabelCapFinal.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabelCapFinal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCapFinal.setText("Capítulo 6");
        jLabelCapFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCapFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCapFinalMouseClicked(evt);
            }
        });
        jPanel26.add(jLabelCapFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 580, -1, -1));

        jScrollPane11.setViewportView(jPanel26);

        jTabbedPaneArquivo.addTab("Quest's", jScrollPane11);

        getContentPane().add(jTabbedPaneArquivo);

        jMenuBar.setToolTipText("");

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.setToolTipText("Obtenha ajuda necessária para iniciar seu RPG");
        jMenuAjuda.setRolloverEnabled(false);

        jMenuHistoria.setText("História & Gameplay");
        jMenuHistoria.setToolTipText("Obtenha ajuda sobre a história e gameplay");
        jMenuHistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHistoriaMouseClicked(evt);
            }
        });
        jMenuAjuda.add(jMenuHistoria);

        jMenuStatus.setText("Status");
        jMenuStatus.setToolTipText("Obtenha ajuda sobre os status");
        jMenuStatus.setRolloverEnabled(false);
        jMenuStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuStatusMouseClicked(evt);
            }
        });
        jMenuAjuda.add(jMenuStatus);

        jMenuClasses.setText("Classes");
        jMenuClasses.setToolTipText("Obtenha ajuda sobre os NPC's");
        jMenuClasses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuClassesMouseClicked(evt);
            }
        });
        jMenuAjuda.add(jMenuClasses);

        jMenuNPCs.setText("NPC's");
        jMenuNPCs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuNPCsMouseClicked(evt);
            }
        });
        jMenuAjuda.add(jMenuNPCs);

        jMenuVeiculos.setText("Veículos");
        jMenuVeiculos.setToolTipText("Obtenha ajuda sobre os veículos");
        jMenuVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVeiculosMouseClicked(evt);
            }
        });
        jMenuAjuda.add(jMenuVeiculos);

        jMenuBar.add(jMenuAjuda);

        jMenuModoMestre.setText("Modo Mestre ");
        jMenuModoMestre.setToolTipText("Clique para fazer login ou logout do MMS");
        jMenuModoMestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuModoMestreMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuModoMestre);

        jMenuUtilitarios.setText("Utilitários");

        jMenuDado.setText("Dado");
        jMenuDado.setToolTipText("Clique para iniciar um dado");
        jMenuDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDadoMouseClicked(evt);
            }
        });
        jMenuUtilitarios.add(jMenuDado);

        jMenuPercentual.setText("Porcentagens");
        jMenuPercentual.setToolTipText("Clique para iniciar um indíce de porcentagens");
        jMenuPercentual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPercentualMouseClicked(evt);
            }
        });
        jMenuUtilitarios.add(jMenuPercentual);

        jMenuMapa.setText("Mapa");
        jMenuMapa.setToolTipText("Clique para iniciar a tela dos mapas");
        jMenuMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMapaMouseClicked(evt);
            }
        });
        jMenuUtilitarios.add(jMenuMapa);

        jMenuBau.setText("Baú dos Players");
        jMenuBau.setToolTipText("Clique para o baú dos jogadores");
        jMenuBau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBauMouseClicked(evt);
            }
        });
        jMenuUtilitarios.add(jMenuBau);

        jMenuCampo.setText("Campo de Batalha");
        jMenuCampo.setToolTipText("Clique para iniciar um campo de batalha");
        jMenuCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCampoMouseClicked(evt);
            }
        });
        jMenuUtilitarios.add(jMenuCampo);

        jMenuBar.add(jMenuUtilitarios);

        jMenuProgressao.setText("Save/Load");
        jMenuProgressao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProgressaoMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuProgressao);

        jMenuFichas.setText("Fichas");

        jMenuADDFicha.setText("Adicionar Ficha");
        jMenuADDFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuADDFichaMouseClicked(evt);
            }
        });
        jMenuFichas.add(jMenuADDFicha);

        jMenuRemoverFicha.setText("Remover Ficha");
        jMenuRemoverFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRemoverFichaMouseClicked(evt);
            }
        });
        jMenuFichas.add(jMenuRemoverFicha);

        jMenuListarFichas.setText("Listar Fichas");
        jMenuListarFichas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListarFichasMouseClicked(evt);
            }
        });
        jMenuFichas.add(jMenuListarFichas);

        jMenuBar.add(jMenuFichas);

        jMenuCreditos.setText("Creditos");
        jMenuCreditos.setToolTipText("Créditos ");
        jMenuCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCreditosMouseClicked(evt);
            }
        });
        jMenuCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCreditosActionPerformed(evt);
            }
        });
        jMenuBar.add(jMenuCreditos);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc=" TELA DE AJUDA ">

    private void jMenuCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCreditosActionPerformed

    }//GEN-LAST:event_jMenuCreditosActionPerformed

    private void jMenuCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCreditosMouseClicked
        Creditos.creditos();
    }//GEN-LAST:event_jMenuCreditosMouseClicked
    //</editor-fold>
//</editor-fold>

    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc=" ARMAS">

    private void jComboBoxTipoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoArmaActionPerformed
        int TipoArma = jComboBoxTipoArma.getSelectedIndex();

        if (TipoArma != 0) {
            jComboBoxClasseArma.setEnabled(true);
            jButtonMunicaoQuimica.setVisible(false);
            //jComboBoxInimigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"T", "E", "S", "T"}));
            switch (TipoArma) {
                case 0:
                    Imagens.setImagemDefaultArma(TipoArma, jLabelImagemArma);
                    break;

                case 1:
                    Imagens.setImagemDefaultArma(TipoArma, jLabelImagemArma);
                    jComboBoxClasseArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getListaFogo()));
                    jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getDefaultSet()));
                    tipoArma = 1;
                    break;

                case 2:
                    Imagens.setImagemDefaultArma(TipoArma, jLabelImagemArma);
                    jComboBoxClasseArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getListaBranca()));
                    jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getDefaultSet()));
                    tipoArma = 2;
                    break;

                case 3:
                    Imagens.setImagemDefaultArma(TipoArma, jLabelImagemArma);
                    jComboBoxClasseArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getListaUsavel()));
                    jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getDefaultSet()));
                    tipoArma = 3;
                    break;

            }

        } else {

            jComboBoxClasseArma.setEnabled(false);
            jComboBoxClasseArma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione a classe da arma"}));
            jComboBoxClasseArma.setSelectedIndex(0);
            tipoArma = 0;

            jComboBoxArma.setEnabled(false);
            jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione a arma"}));
            jComboBoxArma.setSelectedIndex(0);
            armaSelecionada = 0;
            Imagens.setImagemDefaultArma(TipoArma, jLabelImagemArma);
        }
        JTextField[] campoTexto = new JTextField[8];

        campoTexto[0] = jTextFieldNomeArma;
        campoTexto[1] = jTextFieldPoderArma;
        campoTexto[2] = jTextFieldCapacidadeArma;
        campoTexto[3] = jTextFieldRecargaArma;
        campoTexto[4] = jTextFieldRequisitoArma;
        campoTexto[5] = jTextFieldAcessorioArma;
        campoTexto[6] = jTextFieldEspecialArma;
        Armas.limpaTela(campoTexto);

    }//GEN-LAST:event_jComboBoxTipoArmaActionPerformed

    private void jComboBoxClasseArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClasseArmaActionPerformed
        int ClasseArma = jComboBoxClasseArma.getSelectedIndex();

        if (ClasseArma != 0) {
            jComboBoxArma.setEnabled(true);
            jButtonMunicaoQuimica.setVisible(false);
            //jComboBoxInimigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"T", "E", "S", "T"}));
            if (tipoArma == 1) {
                //FOGO
                switch (ClasseArma) {

                    case 1:
                        Imagens.setPistola(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getPistola()));
                        armaSelecionada = 1;
                        break;

                    case 2:
                        Imagens.setSub(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getSubmetralhadora()));
                        armaSelecionada = 2;
                        break;

                    case 3:
                        Imagens.setFuzil(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getFuzil()));
                        armaSelecionada = 3;
                        break;

                    case 4:
                        Imagens.setEscopeta(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getEscopeta()));
                        armaSelecionada = 4;
                        break;

                    case 5:
                        Imagens.setSniper(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getSniper()));
                        armaSelecionada = 5;
                        break;

                    case 6:
                        Imagens.setMagnum(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getMagnum()));
                        armaSelecionada = 6;
                        break;

                    case 7:
                        Imagens.setEspecial(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getEspecial()));
                        armaSelecionada = 7;
                        break;
                }
            } else //BRANCAS
            if (tipoArma == 2) {
                switch (ClasseArma) {

                    case 1:
                        Imagens.setBruta(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getBruta()));
                        armaSelecionada = 1;
                        break;

                    case 2:
                        Imagens.setCorte(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getCorte()));
                        armaSelecionada = 2;
                        break;

                    case 3:
                        try {
                            Imagens.setCorte(7, jLabelImagemArma);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.toString());
                        }
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getTatica()));
                        armaSelecionada = 3;

                        break;
                }
            } else {
                //USÁVEIS
                switch (ClasseArma) {

                    case 1:
                        Imagens.setGranada(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getGranada()));
                        armaSelecionada = 1;
                        break;

                    case 2:
                        Imagens.setTaticaEspecial(0, jLabelImagemArma);
                        jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getTaticaUsavel()));
                        armaSelecionada = 2;
                        break;

                    /* case 3:
                     jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel(Armas.getEspecialUsavel()));
                     armaSelecionada = 3;
                     break;*/
                }

            }
        } else {
            jComboBoxArma.setEnabled(false);
            jComboBoxArma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione a arma"}));
            jComboBoxArma.setSelectedIndex(0);
            armaSelecionada = 0;
        }
        JTextField[] campoTexto = new JTextField[8];

        campoTexto[0] = jTextFieldNomeArma;
        campoTexto[1] = jTextFieldPoderArma;
        campoTexto[2] = jTextFieldCapacidadeArma;
        campoTexto[3] = jTextFieldRecargaArma;
        campoTexto[4] = jTextFieldRequisitoArma;
        campoTexto[5] = jTextFieldAcessorioArma;
        campoTexto[6] = jTextFieldEspecialArma;
        Armas.limpaTela(campoTexto);

    }//GEN-LAST:event_jComboBoxClasseArmaActionPerformed

    //<editor-fold defaultstate="collapsed" desc=" jComboBoxArmaActionPerformed">

    private void jComboBoxArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArmaActionPerformed
        JTextField[] campoTexto = new JTextField[7];

        campoTexto[0] = jTextFieldNomeArma;
        campoTexto[1] = jTextFieldPoderArma;
        campoTexto[2] = jTextFieldCapacidadeArma;
        campoTexto[3] = jTextFieldRecargaArma;
        campoTexto[4] = jTextFieldRequisitoArma;
        campoTexto[5] = jTextFieldAcessorioArma;
        campoTexto[6] = jTextFieldEspecialArma;

        armaFinal = jComboBoxArma.getSelectedIndex();

        switch (tipoArma) {
            case 1:
                jButtonMunicaoQuimica.setVisible(false);
                //FOGO
                //<editor-fold defaultstate="collapsed" desc=" FOGO">
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                 */
                switch (armaSelecionada) {
                    //PISTOLA
                    //<editor-fold defaultstate="collapsed" desc=" PISTOLA">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 1:
                        Imagens.setPistola(0, jLabelImagemArma);

                        switch (armaFinal) {
                            //Colt - M1911
                            case 1:
                                Armas.getColt1911(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;

                            //M9
                            case 2:
                                Armas.getBerettaM9(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;

                            //M9-Flashlight
                            case 3:
                                Armas.getBerettaM9F(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;

                            //Glock17
                            case 4:
                                Armas.getGlock17(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;

                            //Glock17-Silenced
                            case 5:
                                Armas.getGlock17S(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;
                            //M3-SOCOM
                            case 6:
                                Armas.getMK3Socom(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;

                            //MP443 Grach
                            case 7:
                                Armas.getMP443(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;

                            //PMR30
                            case 8:
                                Armas.getPMR30(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;

                            //M93R
                            case 9:
                                Armas.getM93r(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;
                            //MAUSER    
                            case 10:
                                Armas.getMauser(campoTexto);
                                Imagens.setPistola(armaFinal, jLabelImagemArma);

                                break;
                        }

                        break;
//</editor-fold>

                    //SUBMETRALHADORA
                    //<editor-fold defaultstate="collapsed" desc=" SUBMETRALHADORA">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 2:
                        Imagens.setSub(0, jLabelImagemArma);
                        switch (armaFinal) {
                            //MP5
                            case 1:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getMP5(campoTexto);
                                break;

                            //MP5-Silenced
                            case 2:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getMP5S(campoTexto);
                                break;

                            //MP5K
                            case 3:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getMP5k(campoTexto);
                                break;

                            //MP7
                            case 4:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getMP7(campoTexto);
                                break;

                            //P90
                            case 5:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getP90(campoTexto);
                                break;

                            //PP2000
                            case 6:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getPP2000(campoTexto);
                                break;

                            //UMP-45
                            case 7:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getUMP(campoTexto);
                                break;

                            //FAMAS
                            case 8:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getFamas(campoTexto);
                                break;

                            //PP19
                            case 9:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getPP19(campoTexto);
                                break;

                            //MTAR    
                            case 10:
                                Imagens.setSub(armaFinal, jLabelImagemArma);
                                Armas.getMtar(campoTexto);
                                break;
                        }

                        break;
//</editor-fold>

                    //FUZIL
                    //<editor-fold defaultstate="collapsed" desc=" FUZIL">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 3:
                        Imagens.setFuzil(0, jLabelImagemArma);

                        switch (armaFinal) {
                            //M4A1
                            case 1:
                                Armas.getM4A1(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //M16A4
                            case 2:
                                Armas.getM16A4(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //M416
                            case 3:
                                Armas.getM416(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //AK74M
                            case 4:
                                Armas.getAK74M(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //SCAR-H
                            case 5:
                                Armas.getScarH(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //SCAR-L
                            case 6:
                                Armas.getScarL(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //ACR
                            case 7:
                                Armas.getACR(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //SG553-LB
                            case 8:
                                Armas.getSG553(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //A91
                            case 9:
                                Armas.getA91(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;
                            //G36C    
                            case 10:
                                Armas.getG36C(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //F200    
                            case 11:
                                Armas.getF2000(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //M14E    
                            case 12:
                                Armas.getM14E(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //G3    
                            case 13:
                                Armas.getG3(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //L85A2    
                            case 14:
                                Armas.getL85A2(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //M249    
                            case 15:
                                Armas.getM249(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //M60    
                            case 16:
                                Armas.getM60(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;

                            //TYPE88    
                            case 17:
                                Armas.getType88(campoTexto);
                                Imagens.setFuzil(armaFinal, jLabelImagemArma);

                                break;
                        }

                        break;
//</editor-fold>

                    //ESCOPETA
                    //<editor-fold defaultstate="collapsed" desc=" ESCOPETA">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 4:
                        Imagens.setEscopeta(0, jLabelImagemArma);

                        switch (armaFinal) {
                            //RANGER
                            case 1:
                                Armas.getRanger(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //STAKEOUT
                            case 2:
                                Armas.getM37Stakeout(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //REMINGTON 870
                            case 3:
                                Armas.getRemington870(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //DAO 12
                            case 4:
                                Armas.getDAO(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //XM1014
                            case 5:
                                Armas.getXM1014(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //SPAS 12
                            case 6:
                                Armas.getSPAS(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //USAS 12
                            case 7:
                                Armas.getUSAS12(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //SAIGA 12
                            case 8:
                                Armas.getSaiga(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                            //JACKHAMMER
                            case 9:
                                Armas.getJackhammer(campoTexto);
                                Imagens.setEscopeta(armaFinal, jLabelImagemArma);

                                break;

                        }

                        break;
//</editor-fold>

                    //SNIPER
                    //<editor-fold defaultstate="collapsed" desc=" Listas">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 5:
                        Imagens.setSniper(0, jLabelImagemArma);

                        switch (armaFinal) {
                            //BARRET .50
                            case 1:
                                Armas.getBarret(campoTexto);
                                Imagens.setSniper(armaFinal, jLabelImagemArma);

                                break;

                            //AWM
                            case 2:
                                Armas.getAWM(campoTexto);
                                Imagens.setSniper(armaFinal, jLabelImagemArma);

                                break;

                            //PSG
                            case 3:
                                Armas.getPSG(campoTexto);
                                Imagens.setSniper(armaFinal, jLabelImagemArma);

                                break;
                        }

                        break;
                    //</editor-fold>

                    //MAGNUM
                    //<editor-fold defaultstate="collapsed" desc=" Listas">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 6:
                        Imagens.setMagnum(0, jLabelImagemArma);

                        switch (armaFinal) {
                            //MP412-Rex
                            case 1:
                                Armas.getRex(campoTexto);
                                Imagens.setMagnum(armaFinal, jLabelImagemArma);

                                break;

                            //PYTHON
                            case 2:
                                Armas.getPython(campoTexto);
                                Imagens.setMagnum(armaFinal, jLabelImagemArma);

                                break;

                            //TAURUS 44
                            case 3:
                                Armas.getTaurus(campoTexto);
                                Imagens.setMagnum(armaFinal, jLabelImagemArma);

                                break;
                        }

                        break;
                    //</editor-fold>

                    //ESPECIAL
                    //<editor-fold defaultstate="collapsed" desc=" Listas">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 7:
                        Imagens.setEspecial(0, jLabelImagemArma);
                        jButtonMunicaoQuimica.setVisible(false);

                        switch (armaFinal) {
                            //RPG-7
                            case 1:
                                Armas.getRPG(campoTexto);
                                Imagens.setEspecial(armaFinal, jLabelImagemArma);

                                break;

                            //GATLING GUN
                            case 2:
                                Armas.getGiratoria(campoTexto);
                                Imagens.setEspecial(armaFinal, jLabelImagemArma);

                                break;

                            //FLAMETROWER
                            case 3:
                                Armas.getFlame(campoTexto);
                                Imagens.setEspecial(armaFinal, jLabelImagemArma);

                                break;

                            //LANÇADORA QUÍMICA
                            case 4:
                                Armas.getLancadora(campoTexto);
                                Imagens.setEspecial(armaFinal, jLabelImagemArma);
                                jButtonMunicaoQuimica.setVisible(true);

                                break;

                            //STINGER
                            case 5:
                                Armas.getStinger(campoTexto);
                                Imagens.setEspecial(armaFinal, jLabelImagemArma);

                                break;
                        }

                        break;
                }
                //</editor-fold>

                break;
            //</editor-fold>

            case 2:
                //BRANCA
                //<editor-fold defaultstate="collapsed" desc=" Listas">

                switch (armaSelecionada) {

                    //<editor-fold defaultstate="collapsed" desc=" BRUTA">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 1:
                        Imagens.setBruta(0, jLabelImagemArma);
                        switch (armaFinal) {
                            //Soco Inglês
                            case 1:
                                Imagens.setBruta(armaFinal, jLabelImagemArma);
                                Armas.getSoco(campoTexto);

                                break;

                            //Bastão Policial
                            case 2:
                                Imagens.setBruta(armaFinal, jLabelImagemArma);
                                Armas.getBastaoP(campoTexto);
                                break;

                            //Taco de Baseball
                            case 3:
                                Imagens.setBruta(armaFinal, jLabelImagemArma);
                                Armas.getBastao(campoTexto);
                                break;

                            //Bastão Retrátil
                            case 4:
                                Imagens.setBruta(armaFinal, jLabelImagemArma);
                                Armas.getBastaoR(campoTexto);
                                break;

                            //Pá
                            case 5:
                                Imagens.setBruta(armaFinal, jLabelImagemArma);
                                Armas.getPa(campoTexto);
                                break;

                        }
                        break;
                    //</editor-fold>

                    ///<editor-fold defaultstate="collapsed" desc=" CORTE">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 2:
                        Imagens.setCorte(0, jLabelImagemArma);
                        switch (armaFinal) {

                            //FACA
                            case 1:
                                Armas.getFaca(campoTexto);
                                Imagens.setCorte(armaFinal, jLabelImagemArma);

                                break;

                            //KATANA
                            case 2:
                                Armas.getKatana(campoTexto);
                                Imagens.setCorte(armaFinal, jLabelImagemArma);

                                break;

                            //KUKRI    
                            case 3:
                                Armas.getKukri(campoTexto);
                                Imagens.setCorte(armaFinal, jLabelImagemArma);

                                break;

                            //KRIS    
                            case 4:
                                Armas.getKris(campoTexto);
                                Imagens.setCorte(armaFinal, jLabelImagemArma);

                                break;
                        }
                        break;
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc=" TÁTICA">
                    case 3:
                        Imagens.setCorte(7, jLabelImagemArma);
                        switch (armaFinal) {
                            //Stun gun
                            case 1:
                                Armas.getStunG(campoTexto);
                                Imagens.setCorte(5, jLabelImagemArma);
                                break;

                            //Stun rod
                            case 2:
                                Armas.getStunR(campoTexto);
                                Imagens.setCorte(6, jLabelImagemArma);
                                break;

                            //Escudo 
                            case 3:
                                Armas.getEscudo(campoTexto);
                                Imagens.setCorte(7, jLabelImagemArma);
                                break;
                        }
                        break;
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc=" ESPECIAL">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    //</editor-fold>
                }

                break;
            //</editor-fold>

            case 3:

                //<editor-fold defaultstate="collapsed" desc=" Usavel">
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                 */
                switch (armaSelecionada) {
                    //<editor-fold defaultstate="collapsed" desc=" GRANADA">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 1:
                        Imagens.setGranada(0, jLabelImagemArma);
                        switch (armaFinal) {
                            //Distração
                            case 1:
                                Armas.getDistrativa(campoTexto);
                                Imagens.setGranada(armaFinal, jLabelImagemArma);
                                break;

                            //Flashbang
                            case 2:
                                Armas.getFlash(campoTexto);
                                Imagens.setGranada(armaFinal, jLabelImagemArma);
                                break;

                            //Frag
                            case 3:
                                Armas.getFrag(campoTexto);
                                Imagens.setGranada(armaFinal, jLabelImagemArma);
                                break;

                            //Incendiária
                            case 4:
                                Armas.getIncendiaria(campoTexto);
                                Imagens.setGranada(armaFinal, jLabelImagemArma);
                                break;

                            //Semtex
                            case 5:
                                Armas.getSemtex(campoTexto);
                                Imagens.setGranada(armaFinal, jLabelImagemArma);
                                break;

                            //Veneno
                            case 6:
                                Armas.getVenenosa(campoTexto);
                                Imagens.setGranada(armaFinal, jLabelImagemArma);
                                break;
                        }

                        break;
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc=" Taticas & Especiais">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    case 2:
                        Imagens.setTaticaEspecial(0, jLabelImagemArma);
                        jButtonMunicaoQuimica.setVisible(false);
                        switch (armaFinal) {

                            //FacaB
                            case 1:
                                Armas.getFacaB(campoTexto);
                                Imagens.setTaticaEspecial(armaFinal, jLabelImagemArma);
                                break;

                            //C4
                            case 2:
                                Armas.getC4(campoTexto);
                                Imagens.setTaticaEspecial(armaFinal, jLabelImagemArma);
                                break;

                            //Claymore
                            case 3:
                                Armas.getClaymore(campoTexto);
                                Imagens.setTaticaEspecial(armaFinal, jLabelImagemArma);
                                break;

                            //Granadas-quimicas
                            case 4:
                                Armas.getGranadasQ(campoTexto);
                                Imagens.setTaticaEspecial(armaFinal, jLabelImagemArma);
                                jButtonMunicaoQuimica.setVisible(true);
                                break;

                        }
                }

            //</editor-fold>
        }


    }//GEN-LAST:event_jComboBoxArmaActionPerformed

    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    private void jButtonSobreAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreAcessoriosActionPerformed
        Imagens.getDivAcessorios();
    }//GEN-LAST:event_jButtonSobreAcessoriosActionPerformed

    private void jButtonMunicaoQuimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMunicaoQuimicaActionPerformed
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/TaticaEspecial/Granadas-quimicas.png"));
        JOptionPane.showMessageDialog(null, "Explosiva (amarela) - Dano: 5.0 em área / Pode destruir certos locais, veículos e obstruções.\n"
                + "\n"
                + "Neutralizadora (azul) - Paralisa por 2 rodadas infectados de níveis 1 e 2. Deixam de nível 3 mais lentos e com -1 no dado.\n"
                + "\n"
                + "Venenosa (preta) - Dano de 3.0 em inimigos humanos (apenas), uma vez sobre efeito do veneno, eles tomarão dano por mais 2 rodadas.\n"
                + "\n"
                + "Incendiária (vermelha) - Dano de 3.0 em qualquer inimigo, uma vez sobre efeito do fogo, eles tomarão dano por mais 2 rodadas. O fogo permanece por 2 rodadas no local também.", "SOBRE AS MUNIÇÕES QUÍMICAS", JOptionPane.PLAIN_MESSAGE, icon);

    }//GEN-LAST:event_jButtonMunicaoQuimicaActionPerformed

    //<editor-fold defaultstate="collapsed" desc=" Acessórios">

    private void jComboBoxTipoAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoAcessorioActionPerformed
        tipoAcessorio = jComboBoxTipoAcessorio.getSelectedIndex();
        if (tipoAcessorio != 0) {
            jComboBoxAcessorio.setEnabled(true);
            switch (tipoAcessorio) {
                case 1:
                    Imagens.setCano(0, jLabelImagemAcessorio);
                    jComboBoxAcessorio.setModel(new DefaultComboBoxModel(Acessorios.getListaCano()));
                    Acessorios.limpaTela(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                    break;

                case 2:
                    Imagens.setCano(0, jLabelImagemAcessorio);
                    jComboBoxAcessorio.setModel(new DefaultComboBoxModel(Acessorios.getListaMira()));
                    Acessorios.limpaTela(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                    break;

                case 3:
                    Imagens.setCano(0, jLabelImagemAcessorio);
                    jComboBoxAcessorio.setModel(new DefaultComboBoxModel(Acessorios.getListaBarril()));
                    Acessorios.limpaTela(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                    break;

                case 4:
                    Imagens.setCano(0, jLabelImagemAcessorio);
                    jComboBoxAcessorio.setModel(new DefaultComboBoxModel(Acessorios.getListaInferior()));
                    Acessorios.limpaTela(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                    break;

                case 5:
                    Imagens.setCano(0, jLabelImagemAcessorio);
                    jComboBoxAcessorio.setModel(new DefaultComboBoxModel(Acessorios.getListaPente()));
                    Acessorios.limpaTela(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                    break;
            }
        } else {
            jComboBoxAcessorio.setEnabled(false);
            jComboBoxAcessorio.setSelectedIndex(0);
            Imagens.setCano(0, jLabelImagemAcessorio);
        }
    }//GEN-LAST:event_jComboBoxTipoAcessorioActionPerformed

    private void jComboBoxAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAcessorioActionPerformed
        int acessorio = jComboBoxAcessorio.getSelectedIndex();
        switch (tipoAcessorio) {
            //CANO
            case 1:
                switch (acessorio) {
                    case 1:
                        Acessorios.getPerfurante(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setCano(acessorio, jLabelImagemAcessorio);
                        break;

                    case 2:
                        Acessorios.getSilenciador(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setCano(acessorio, jLabelImagemAcessorio);
                        break;
                }
                break;

            //MIRA
            case 2:
                switch (acessorio) {
                    case 1:
                        Acessorios.getAcog(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setMira(acessorio, jLabelImagemAcessorio);
                        break;

                    case 2:
                        Acessorios.getRed(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setMira(acessorio, jLabelImagemAcessorio);
                        break;

                    case 3:
                        Acessorios.getMiraLonga(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setMira(acessorio, jLabelImagemAcessorio);
                        break;
                }
                break;

            //Barril
            case 3:
                switch (acessorio) {
                    case 1:
                        Acessorios.getLaser(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setBarril(acessorio, jLabelImagemAcessorio);
                        break;
                }
                break;

            //Inferior
            case 4:
                switch (acessorio) {
                    case 1:
                        Acessorios.getGrip(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setParteInf(acessorio, jLabelImagemAcessorio);
                        break;

                    case 2:
                        Acessorios.getEscopetaA(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setParteInf(acessorio, jLabelImagemAcessorio);
                        break;
                }
                break;

            //Pente
            case 5:
                switch (acessorio) {
                    case 1:
                        Acessorios.getPenteD(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setPente(acessorio, jLabelImagemAcessorio);
                        break;

                    case 2:
                        Acessorios.getPenteE(jTextFieldNomeAcessorio, jEditorPaneDescAcessorio);
                        Imagens.setPente(acessorio, jLabelImagemAcessorio);
                        break;
                }
                break;
        }
    }//GEN-LAST:event_jComboBoxAcessorioActionPerformed
//</editor-fold>

    private void jLabelCAP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCAP1MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap1());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }

    }//GEN-LAST:event_jLabelCAP1MouseClicked

    private void jLabelCap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCap1MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap1());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCap1MouseClicked

    private void jLabelCAP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCAP2MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap2());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCAP2MouseClicked

    private void jLabelCap2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCap2MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap2());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }

    }//GEN-LAST:event_jLabelCap2MouseClicked

    private void jLabelCAP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCAP3MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap3());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCAP3MouseClicked

    private void jLabelCap4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCap4MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap3());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCap4MouseClicked

    private void jLabelCAP4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCAP4MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap4());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCAP4MouseClicked

    private void jLabelCap3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCap3MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap4());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCap3MouseClicked

    private void jLabelCAP5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCAP5MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap5());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCAP5MouseClicked

    private void jLabelCap5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCap5MouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjScrollPaneCap5());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCap5MouseClicked

    private void jLabelCAPFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCAPFinalMouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjPanelCAPFinal());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCAPFinalMouseClicked

    private void jLabelCapFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCapFinalMouseClicked
        if (autenticadorMMS) {
            cap.setVisible(true);
            cap.toFront();
            cap.getjTabbedPane1().setSelectedComponent(cap.getjPanelCAPFinal());
        } else {
            JOptionPane.showMessageDialog(null, "Faça login no modo Mestre para obter acesso à lista de Quest's");
        }
    }//GEN-LAST:event_jLabelCapFinalMouseClicked
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MMS">
    private void jButtonEncerrarMMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncerrarMMSActionPerformed
        if (autenticadorMMS) {
            autenticadorMMS = false;
            jLabeMMSStatus.setText("DESATIVADO");
            jLabeMMSStatus.setForeground(new java.awt.Color(255, 0, 0));
            JOptionPane.showMessageDialog(null, "Modo Mestre Supremo DESATIVADO!");
        } else {
            JOptionPane.showMessageDialog(null, "Modo Mestre Supremo já se encontra DESATIVADO!");
        }

        //passaCampos();
        MapaView.acessoConteudo(autenticadorMMS);
        HistoriaView.acessoConteudo(autenticadorMMS);

        if (autenticadorMMS) {
            MMS.MMSAtivo(campoTextoE, campoAreaE, comboBoxE);
        } else {
            MMS.MMSInativo(campoTextoE, campoAreaE, comboBoxE);
        }
    }//GEN-LAST:event_jButtonEncerrarMMSActionPerformed

    private void jButtonLoginMMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginMMSActionPerformed
        char senha[] = jPasswordFieldModoMestre.getPassword();
        String senhaS = Arrays.toString(senha);
        senhaS = senhaS.replace(",", "");
        senhaS = senhaS.replace("[", "");
        senhaS = senhaS.replace("]", "");
        senhaS = senhaS.replace(" ", "");
        if (senhaS.equals(senhaMMS)) {
            autenticadorMMS = true;
            jLabeMMSStatus.setText("ATIVADO");
            jLabeMMSStatus.setForeground(new java.awt.Color(51, 204, 0));
            JOptionPane.showMessageDialog(null, "Modo Mestre Supremo ATIVADO!");
            jPasswordFieldModoMestre.setText("");

            jDialogLogin.dispose();
        } else if (autenticadorMMS) {
            JOptionPane.showMessageDialog(null, "Modo Mestre Supremo já está ativado! \nCaso Deseje, encerre-o clickando no botão ao lado");
        } else {
            JOptionPane.showMessageDialog(null, "Senha inválida! \nTente novamente.");
        }

//        passaCampos();
        MapaView.acessoConteudo(autenticadorMMS);
        HistoriaView.acessoConteudo(autenticadorMMS);

        if (autenticadorMMS) {
            MMS.MMSAtivo(campoTextoE, campoAreaE, comboBoxE);
        } else {
            MMS.MMSInativo(campoTextoE, campoAreaE, comboBoxE);
        }

    }//GEN-LAST:event_jButtonLoginMMSActionPerformed


    private void jMenuModoMestreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuModoMestreMouseClicked
        jDialogLogin.setModal(true);
        jDialogLogin.setEnabled(true);
        jDialogLogin.setVisible(true);
        jDialogLogin.toFront();

    }//GEN-LAST:event_jMenuModoMestreMouseClicked

    private void jPasswordFieldModoMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldModoMestreActionPerformed
        jButtonLoginMMS.doClick();
    }//GEN-LAST:event_jPasswordFieldModoMestreActionPerformed

    private void jPasswordFieldModoMestreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldModoMestreMouseClicked
        jPasswordFieldModoMestre.setText("");
    }//GEN-LAST:event_jPasswordFieldModoMestreMouseClicked
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc=" Utilitarios">
    private void jMenuDadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDadoMouseClicked
        dados.setEnabled(true);
        dados.setVisible(true);
        dados.toFront();
    }//GEN-LAST:event_jMenuDadoMouseClicked

    private void jMenuStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuStatusMouseClicked
        statusFrame.setVisible(true);
        statusFrame.toFront();
    }//GEN-LAST:event_jMenuStatusMouseClicked

    private void jMenuPercentualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPercentualMouseClicked
        percentual.setEnabled(true);
        percentual.setVisible(true);
        percentual.toFront();
    }//GEN-LAST:event_jMenuPercentualMouseClicked
//</editor-fold>
    //</editor-fold>

    private void jMenuClassesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClassesMouseClicked
        classesFrame.setEnabled(true);
        classesFrame.setVisible(true);
        classesFrame.toFront();
    }//GEN-LAST:event_jMenuClassesMouseClicked

    private void jMenuVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVeiculosMouseClicked
        veiculoFrame.setEnabled(true);
        veiculoFrame.setVisible(true);
        veiculoFrame.toFront();
    }//GEN-LAST:event_jMenuVeiculosMouseClicked

    private void jComboBoxEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentoActionPerformed
        int opcaoEquip = jComboBoxEquipamento.getSelectedIndex();

        switch (opcaoEquip) {
            case 1:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
                break;
            case 2:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
                break;
            case 3:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
                break;
            case 4:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
                break;
            case 5:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
                break;
            case 6:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
                break;
            case 7:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
                break;

            default:
                Equipamentos.setEquipamento(jLabelImagemEquipamento, jEditorPaneDescEquip, opcaoEquip);
        }
    }//GEN-LAST:event_jComboBoxEquipamentoActionPerformed

    private void jComboBoxItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxItemActionPerformed
        int opcaoEquip = jComboBoxItem.getSelectedIndex();

        switch (opcaoEquip) {
            case 1:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 2:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 3:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 4:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 5:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 6:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 7:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 8:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 9:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 10:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 11:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 12:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 13:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 14:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 15:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 16:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 17:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 18:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            case 19:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
                break;

            default:
                Equipamentos.setItem(jLabelImagemItem, jEditorPaneItem, opcaoEquip);
        }
    }//GEN-LAST:event_jComboBoxItemActionPerformed

    private void jMenuNPCsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNPCsMouseClicked
        npcFrame.setEnabled(true);
        npcFrame.setVisible(true);
        npcFrame.toFront();
    }//GEN-LAST:event_jMenuNPCsMouseClicked

    private void jMenuHistoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHistoriaMouseClicked
        historiaFrame.setEnabled(true);
        historiaFrame.setVisible(true);
        historiaFrame.toFront();
    }//GEN-LAST:event_jMenuHistoriaMouseClicked

    private void jMenuCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCampoMouseClicked
        campoBatalha.setVisible(true);
        campoBatalha.setEnabled(true);
        campoBatalha.toFront();
    }//GEN-LAST:event_jMenuCampoMouseClicked

    private void jMenuBauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBauMouseClicked
        bau.setEnabled(true);
        bau.setVisible(true);
        bau.toFront();

    }//GEN-LAST:event_jMenuBauMouseClicked

    private void jMenuMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMapaMouseClicked
        mapa.setEnabled(true);
        mapa.setVisible(true);
        mapa.toFront();
    }//GEN-LAST:event_jMenuMapaMouseClicked

    private void jMenuProgressaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProgressaoMouseClicked
        jDialogProgressao.setEnabled(true);
        jDialogProgressao.setVisible(true);
        jDialogProgressao.toFront();
    }//GEN-LAST:event_jMenuProgressaoMouseClicked

    private void jButtonNovaProgressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaProgressaoActionPerformed
        cap.passePrincipais();
        cap.passeSecundarias();
        cap.passeAtividades();

        isCarregado = false;
        Save.nova(cap.getPrincipais(), cap.getSecundarias(), cap.getAtividades(), jProgressBaEstoria);
        jTextFieldSaveAtual.setText("");
        jTextFieldUltimaModificacao.setText("");
        jTextFieldUltimoSave.setText("");
    }//GEN-LAST:event_jButtonNovaProgressaoActionPerformed

    private void jButtonSalvarProgressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarProgressaoActionPerformed
        cap.passePrincipais();
        cap.passeSecundarias();
        cap.passeAtividades();
        int progresso = cap.getProgresso();
        String nome = "";

        if (isCarregado) {
            nome = grupoSave;
        } else {
            nome = JOptionPane.showInputDialog("Insira o nome do grupo: ");
            if (nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Não é possível salvar o jogo sem o nome do grupo!");
                return;
            }
            isCarregado = true;
        }

        Save.salvar(cap.getPrincipais(), cap.getSecundarias(), cap.getAtividades(), nome, progresso, jTextFieldSaveAtual, PegaData.getLog());
        jTextFieldUltimaModificacao.setText(PegaData.getLog());
    }//GEN-LAST:event_jButtonSalvarProgressaoActionPerformed

    private void jButtonCarregarProgressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarProgressaoActionPerformed
        cap.passePrincipais();
        cap.passeSecundarias();
        cap.passeAtividades();

        String nome = JOptionPane.showInputDialog("Insira o nome do grupo: ");
        if (nome == null) {
            return;
        }

        Save.carregar(cap.getPrincipais(), cap.getSecundarias(), cap.getAtividades(), nome, jProgressBaEstoria, jTextFieldSaveAtual, jTextFieldUltimoSave);
        grupoSave = nome;
        isCarregado = true;
        jTextFieldUltimaModificacao.setText(PegaData.getLog());
    }//GEN-LAST:event_jButtonCarregarProgressaoActionPerformed

    private void jMenuADDFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuADDFichaMouseClicked
        if (numFicha >= 10) {
            JOptionPane.showMessageDialog(null, "Limite de fichas alcançado!");
        } else {
            numFicha++;
            JPanelFichaToin ficha = new JPanelFichaToin(numFicha);
            jTabbedPaneArquivo.addTab("Ficha " + String.valueOf(numFicha), ficha);
            //JOptionPane.showMessageDialog(null, "Ficha " + String.valueOf(numFicha) + " adicionada com sucesso!");

            BauPanel bauP = ficha.getBauP();

            bau.jTabbedPaneConteudo.addTab("Ficha " + String.valueOf(numFicha), bauP);
            //bauP.setJogador(ficha.getNomeJogador());
        }

    }//GEN-LAST:event_jMenuADDFichaMouseClicked

    private void jMenuRemoverFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRemoverFichaMouseClicked
        if (numFicha <= 0) {
            JOptionPane.showMessageDialog(null, "Não há fichas a serem removidas!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Você está prestes a remover a última ficha adicionada. \nVocê a salvou?", "REMOÇÃO DE FICHA", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            if (opcao == 0) {
                jTabbedPaneArquivo.remove(numFicha + 5);
                numFicha--;
                bau.jTabbedPaneConteudo.remove(numFicha);
            } else {
                return;
            }
        }


    }//GEN-LAST:event_jMenuRemoverFichaMouseClicked

    private void jComboBoxLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLojaActionPerformed
        int lojaSelecionada = jComboBoxLoja.getSelectedIndex();

        //<editor-fold defaultstate="collapsed" desc=" Declaração dos parametros">
        JLabel[] imagens = new JLabel[12];
        imagens[0] = jLabelImagemAmostra1;
        imagens[1] = jLabelImagemAmostra2;
        imagens[2] = jLabelImagemAmostra3;
        imagens[3] = jLabelImagemAmostra4;
        imagens[4] = jLabelImagemAmostra5;
        imagens[5] = jLabelImagemAmostra6;
        imagens[6] = jLabelImagemAmostra7;
        imagens[7] = jLabelImagemAmostra8;
        imagens[8] = jLabelImagemAmostra9;
        imagens[9] = jLabelImagemAmostra10;
        imagens[10] = jLabelImagemAmostra11;
        imagens[11] = jLabelImagemAmostra12;

        JTextField[] valores = new JTextField[12];
        valores[0] = jTextFieldValorItem1;
        valores[1] = jTextFieldValorItem2;
        valores[2] = jTextFieldValorItem3;
        valores[3] = jTextFieldValorItem4;
        valores[4] = jTextFieldValorItem5;
        valores[5] = jTextFieldValorItem6;
        valores[6] = jTextFieldValorItem7;
        valores[7] = jTextFieldValorItem8;
        valores[8] = jTextFieldValorItem9;
        valores[9] = jTextFieldValorItem10;
        valores[10] = jTextFieldValorItem11;
        valores[11] = jTextFieldValorItem12;

        JEditorPane[] descricoes = new JEditorPane[12];
        descricoes[0] = jEditorPaneAreaAmostra1;
        descricoes[1] = jEditorPaneAreaAmostra2;
        descricoes[2] = jEditorPaneAreaAmostra3;
        descricoes[3] = jEditorPaneAreaAmostra4;
        descricoes[4] = jEditorPaneAreaAmostra5;
        descricoes[5] = jEditorPaneAreaAmostra6;
        descricoes[6] = jEditorPaneAreaAmostra7;
        descricoes[7] = jEditorPaneAreaAmostra8;
        descricoes[8] = jEditorPaneAreaAmostra9;
        descricoes[9] = jEditorPaneAreaAmostra10;
        descricoes[10] = jEditorPaneAreaAmostra11;
        descricoes[11] = jEditorPaneAreaAmostra12;

        JScrollPane[] scrolls = new JScrollPane[12];
        scrolls[0] = jScrollPaneAmostra1;
        scrolls[1] = jScrollPaneAmostra2;
        scrolls[2] = jScrollPaneAmostra3;
        scrolls[3] = jScrollPaneAmostra4;
        scrolls[4] = jScrollPaneAmostra5;
        scrolls[5] = jScrollPaneAmostra6;
        scrolls[6] = jScrollPaneAmostra7;
        scrolls[7] = jScrollPaneAmostra8;
        scrolls[8] = jScrollPaneAmostra9;
        scrolls[9] = jScrollPaneAmostra10;
        scrolls[10] = jScrollPaneAmostra11;
        scrolls[11] = jScrollPaneAmostra12;

        JLabel[] labelValores = new JLabel[12];
        labelValores[0] = jLabelValorLoja1;
        labelValores[1] = jLabelValorLoja2;
        labelValores[2] = jLabelValorLoja3;
        labelValores[3] = jLabelValorLoja4;
        labelValores[4] = jLabelValorLoja5;
        labelValores[5] = jLabelValorLoja6;
        labelValores[6] = jLabelValorLoja7;
        labelValores[7] = jLabelValorLoja8;
        labelValores[8] = jLabelValorLoja9;
        labelValores[9] = jLabelValorLoja10;
        labelValores[10] = jLabelValorLoja11;
        labelValores[11] = jLabelValorLoja12;

        JLabel[] labelDesc = new JLabel[12];
        labelDesc[0] = jLabelDescLoja1;
        labelDesc[1] = jLabelDescLoja2;
        labelDesc[2] = jLabelDescLoja3;
        labelDesc[3] = jLabelDescLoja4;
        labelDesc[4] = jLabelDescLoja5;
        labelDesc[5] = jLabelDescLoja6;
        labelDesc[6] = jLabelDescLoja7;
        labelDesc[7] = jLabelDescLoja8;
        labelDesc[8] = jLabelDescLoja9;
        labelDesc[9] = jLabelDescLoja10;
        labelDesc[10] = jLabelDescLoja11;
        labelDesc[11] = jLabelDescLoja12;
        //</editor-fold>

        switch (lojaSelecionada) {
            case 0://Selecione a loja
                Loja.desativarLoja(imagens, valores, descricoes, scrolls, labelValores, labelDesc, 0);
                break;

            case 1://Loja Médica
                Loja.setLojaMedica(imagens, valores, descricoes, scrolls, labelValores, labelDesc);
                break;

            case 2://Loja de Equipamentos & Itens
                Loja.setLojaEquItem(imagens, valores, descricoes, scrolls, labelValores, labelDesc);
                break;

            case 3://Loja de Armas 
                Loja.setLojaArma(imagens, valores, descricoes, scrolls, labelValores, labelDesc);
                break;

            case 4://Loja de Acessórios para armas de fogo
                Loja.setLojaModFogo(imagens, valores, descricoes, scrolls, labelValores, labelDesc);
                break;

            case 5://Loja de Acessórios para armas brancas
                Loja.setLojaModBranco(imagens, valores, descricoes, scrolls, labelValores, labelDesc);
                break;

            case 6://Loja Veícular
                Loja.setLojaMecanica(imagens, valores, descricoes, scrolls, labelValores, labelDesc);
                break;

        }

    }//GEN-LAST:event_jComboBoxLojaActionPerformed

    private void jMenuListarFichasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListarFichasMouseClicked
        //jTextAreaListaFichas
        jDialogListaFicha.setEnabled(true);
        jDialogListaFicha.setVisible(true);
        jDialogListaFicha.toFront();
        Codigo.carregarLista(jTextAreaListaFichas);
    }//GEN-LAST:event_jMenuListarFichasMouseClicked

    private void jComboBoxTipoModBrancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoModBrancaActionPerformed
        int opcao = jComboBoxTipoModBranca.getSelectedIndex();

        if (opcao != 0) {
            jComboBoxModBranco.setEnabled(true);
            switch (opcao) {
                case 1:
                    jComboBoxModBranco.setModel(new DefaultComboBoxModel(ModBranco.getListaPonta()));
                    Acessorios.limpaTela(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                    Imagens.setMOD(1, jLabelImagemModBranca);
                    break;

                case 2:
                    jComboBoxModBranco.setModel(new DefaultComboBoxModel(ModBranco.getListaModificador()));
                    Acessorios.limpaTela(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                    Imagens.setMOD(7, jLabelImagemModBranca);
                    break;

                case 3:
                    jComboBoxModBranco.setModel(new DefaultComboBoxModel(ModBranco.getListaEmpunhadeira()));
                    Acessorios.limpaTela(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                    Imagens.setMOD(11, jLabelImagemModBranca);
                    break;

            }
        } else {
            jComboBoxModBranco.setSelectedIndex(0);
            jComboBoxModBranco.setEnabled(false);
            Imagens.setMOD(0, jLabelImagemModBranca);
        }
    }//GEN-LAST:event_jComboBoxTipoModBrancaActionPerformed

    private void jComboBoxModBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModBrancoActionPerformed
        int tipo = jComboBoxTipoModBranca.getSelectedIndex();
        int mod = jComboBoxModBranco.getSelectedIndex();

        switch (tipo) {
            //Ponta
            case 1:
                switch (mod) {
                    case 0:
                        Acessorios.limpaTela(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(1, jLabelImagemModBranca);
                        break;

                    case 1:
                        ModBranco.getArame(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(1, jLabelImagemModBranca);
                        break;

                    case 2:
                        ModBranco.getGarra(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(2, jLabelImagemModBranca);
                        break;

                    case 3:
                        ModBranco.getAfiada(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(3, jLabelImagemModBranca);
                        break;

                    case 4:
                        ModBranco.getPregos(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(4, jLabelImagemModBranca);
                        break;

                    case 5:
                        ModBranco.getLigaFerro(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(5, jLabelImagemModBranca);
                        break;
                }
                break;
            //Modificadores    
            case 2:
                switch (mod) {
                    case 0:
                        Acessorios.limpaTela(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(7, jLabelImagemModBranca);
                        break;

                    case 1:
                        ModBranco.getToxico(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(6, jLabelImagemModBranca);
                        break;

                    case 2:
                        ModBranco.getParalitico(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(7, jLabelImagemModBranca);
                        break;

                    case 3:
                        ModBranco.getIncendiario(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(8, jLabelImagemModBranca);
                        break;

                    case 4:
                        ModBranco.getEletrico(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(9, jLabelImagemModBranca);
                        break;
                }
                break;

            //Empunhadeira    
            case 3:
                switch (mod) {
                    case 0:
                        Acessorios.limpaTela(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(11, jLabelImagemModBranca);
                        break;

                    case 1:
                        ModBranco.getCampeao(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(10, jLabelImagemModBranca);
                        break;

                    case 2:
                        ModBranco.getBerserk(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(11, jLabelImagemModBranca);
                        break;

                    case 3:
                        ModBranco.getGuardiao(jTextFieldNomeModBranca, jEditorPaneDescModBranca);
                        Imagens.setMOD(12, jLabelImagemModBranca);
                        break;
                }
                break;

        }

    }//GEN-LAST:event_jComboBoxModBrancoActionPerformed

    private void jButtonSobreInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreInimigoActionPerformed
        jDialogSobreInimigo.setEnabled(true);
        jDialogSobreInimigo.setVisible(true);
        jDialogSobreInimigo.toFront();
    }//GEN-LAST:event_jButtonSobreInimigoActionPerformed

    private void jComboBoxInimigoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInimigoListActionPerformed
        String nomeInimigo = jComboBoxInimigoList.getSelectedItem().toString();
        int inimigoEscolhido = jComboBoxInimigoList.getSelectedIndex();
        if (inimigoEscolhido >= 1) {
            inimigoEscolhido--;
        } else {
            jTextFieldNomeInimigo.setText("");
            jTextFieldRacaInimigo.setText("");
            jTextFieldSexoInimigo.setText("");
            jTextFieldClasseInimigo.setText("");
            jTextAreaDescInimigo.setText("");
            jTextFieldXPInimigo.setText("");
            jTextFieldGoldInimigo.setText("");
            jTextAreaItensInimigo.setText("");
            jTextFieldLevelInimigo.setText("");
            jTextFieldPVInimigo.setText("");
            jTextFieldPMInimigo.setText("");
            jTextFieldFORInimigo.setText("");
            jTextFieldDESInimigo.setText("");
            jTextFieldINTInimigo.setText("");
            jTextFieldSABInimigo.setText("");
            jTextFieldSORInimigo.setText("");
            jTextFieldRESInimigo.setText("");
            Imagens.setImagemDefault(1, jLabelImagemInimigo);
            jEditorPaneInimigoVant.setText("");
            jEditorPaneInimigoDesvant.setText("");
            return;
        }
        InimigoMedievalOBJ inimigo = inimigos.get(inimigoEscolhido);
        if (inimigo != null) {
            jTextFieldNomeInimigo.setText(inimigo.getNome());
            jTextFieldRacaInimigo.setText(inimigo.getRaca());
            jTextFieldSexoInimigo.setText(inimigo.getSexo());
            jTextFieldClasseInimigo.setText(inimigo.getClasseInimigo());
            jTextAreaDescInimigo.setText(inimigo.getDesc());
            jTextFieldXPInimigo.setText(inimigo.getDrops(0));
            jTextFieldGoldInimigo.setText(inimigo.getDrops(1));
            jTextAreaItensInimigo.setText(inimigo.getDrops(2));
            jTextFieldLevelInimigo.setText(String.valueOf(inimigo.getLevel()));
            jTextFieldPVInimigo.setText(String.valueOf(inimigo.getHp()));
            jTextFieldPMInimigo.setText(String.valueOf(inimigo.getPm()));
            jTextFieldFORInimigo.setText(String.valueOf(inimigo.getFor1()));
            jTextFieldDESInimigo.setText(String.valueOf(inimigo.getDes()));
            jTextFieldINTInimigo.setText(String.valueOf(inimigo.getInt1()));
            jTextFieldSABInimigo.setText(String.valueOf(inimigo.getSab()));
            jTextFieldSORInimigo.setText(String.valueOf(inimigo.getSorte()));
            jTextFieldRESInimigo.setText(String.valueOf(inimigo.getRes()));
            jLabelImagemInimigo.setIcon(inimigo.getFoto());
            jEditorPaneInimigoVant.setText(inimigo.getVantagens());
            jEditorPaneInimigoDesvant.setText(inimigo.getDesvantagens());
        }


    }//GEN-LAST:event_jComboBoxInimigoListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        //<editor-fold defaultstate="collapsed" desc=" Tema Inferno do Sofrimento (DEFAULT COLOR - RED) ">
        // UIManager.put("nimbusBase", new Color(135, 0, 0));
        // UIManager.put("nimbusBlueGrey", new Color(103, 81, 81));
        // UIManager.put("control", new Color(212, 204, 207));
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedievalRPGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedievalRPGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedievalRPGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedievalRPGView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MedievalRPGView dadoJFrame = new MedievalRPGView();
                dadoJFrame.setVisible(true);
            }
        }
        );
    }
    //<editor-fold defaultstate="collapsed" desc=" Declaração das variáveis NÃO MODIFICAR">

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Declaração das variáveis NÃO MODIFICAR">

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupProgressao;
    private javax.swing.JButton jButtonCarregarProgressao;
    private javax.swing.JButton jButtonEncerrarMMS;
    private javax.swing.JButton jButtonLoginMMS;
    private javax.swing.JButton jButtonMunicaoQuimica;
    private javax.swing.JButton jButtonNovaProgressao;
    private javax.swing.JButton jButtonSalvarProgressao;
    private javax.swing.JButton jButtonSobreAcessorios;
    private javax.swing.JButton jButtonSobreInimigo;
    private javax.swing.JComboBox<String> jComboBoxAcessorio;
    private javax.swing.JComboBox<String> jComboBoxArma;
    private javax.swing.JComboBox<String> jComboBoxClasseArma;
    private javax.swing.JComboBox<String> jComboBoxEquipamento;
    private javax.swing.JComboBox<String> jComboBoxInimigoList;
    private javax.swing.JComboBox<String> jComboBoxItem;
    private javax.swing.JComboBox<String> jComboBoxLoja;
    private javax.swing.JComboBox<String> jComboBoxModBranco;
    private javax.swing.JComboBox<String> jComboBoxTipoAcessorio;
    private javax.swing.JComboBox<String> jComboBoxTipoArma;
    private javax.swing.JComboBox<String> jComboBoxTipoModBranca;
    private javax.swing.JDialog jDialogListaFicha;
    private javax.swing.JDialog jDialogLogin;
    public static javax.swing.JDialog jDialogProgressao;
    private javax.swing.JDialog jDialogSobreInimigo;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra1;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra10;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra11;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra12;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra2;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra3;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra4;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra5;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra6;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra7;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra8;
    private javax.swing.JEditorPane jEditorPaneAreaAmostra9;
    private javax.swing.JEditorPane jEditorPaneDescAcessorio;
    private javax.swing.JEditorPane jEditorPaneDescEquip;
    private javax.swing.JEditorPane jEditorPaneDescModBranca;
    private javax.swing.JEditorPane jEditorPaneInimigoDesvant;
    private javax.swing.JEditorPane jEditorPaneInimigoVant;
    private javax.swing.JEditorPane jEditorPaneItem;
    private javax.swing.JLabel jLabeMMSStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCAP1;
    private javax.swing.JLabel jLabelCAP2;
    private javax.swing.JLabel jLabelCAP3;
    private javax.swing.JLabel jLabelCAP4;
    private javax.swing.JLabel jLabelCAP5;
    private javax.swing.JLabel jLabelCAPFinal;
    private javax.swing.JLabel jLabelCap1;
    private javax.swing.JLabel jLabelCap2;
    private javax.swing.JLabel jLabelCap3;
    private javax.swing.JLabel jLabelCap4;
    private javax.swing.JLabel jLabelCap5;
    private javax.swing.JLabel jLabelCapFinal;
    private javax.swing.JLabel jLabelDescLoja1;
    private javax.swing.JLabel jLabelDescLoja10;
    private javax.swing.JLabel jLabelDescLoja11;
    private javax.swing.JLabel jLabelDescLoja12;
    private javax.swing.JLabel jLabelDescLoja2;
    private javax.swing.JLabel jLabelDescLoja3;
    private javax.swing.JLabel jLabelDescLoja4;
    private javax.swing.JLabel jLabelDescLoja5;
    private javax.swing.JLabel jLabelDescLoja6;
    private javax.swing.JLabel jLabelDescLoja7;
    private javax.swing.JLabel jLabelDescLoja8;
    private javax.swing.JLabel jLabelDescLoja9;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelImagemAcessorio;
    private javax.swing.JLabel jLabelImagemAmostra1;
    private javax.swing.JLabel jLabelImagemAmostra10;
    private javax.swing.JLabel jLabelImagemAmostra11;
    private javax.swing.JLabel jLabelImagemAmostra12;
    private javax.swing.JLabel jLabelImagemAmostra2;
    private javax.swing.JLabel jLabelImagemAmostra3;
    private javax.swing.JLabel jLabelImagemAmostra4;
    private javax.swing.JLabel jLabelImagemAmostra5;
    private javax.swing.JLabel jLabelImagemAmostra6;
    private javax.swing.JLabel jLabelImagemAmostra7;
    private javax.swing.JLabel jLabelImagemAmostra8;
    private javax.swing.JLabel jLabelImagemAmostra9;
    private javax.swing.JLabel jLabelImagemArma;
    private javax.swing.JLabel jLabelImagemEquipamento;
    private javax.swing.JLabel jLabelImagemInimigo;
    private javax.swing.JLabel jLabelImagemItem;
    private javax.swing.JLabel jLabelImagemModBranca;
    private javax.swing.JLabel jLabelValorLoja1;
    private javax.swing.JLabel jLabelValorLoja10;
    private javax.swing.JLabel jLabelValorLoja11;
    private javax.swing.JLabel jLabelValorLoja12;
    private javax.swing.JLabel jLabelValorLoja2;
    private javax.swing.JLabel jLabelValorLoja3;
    private javax.swing.JLabel jLabelValorLoja4;
    private javax.swing.JLabel jLabelValorLoja5;
    private javax.swing.JLabel jLabelValorLoja6;
    private javax.swing.JLabel jLabelValorLoja7;
    private javax.swing.JLabel jLabelValorLoja8;
    private javax.swing.JLabel jLabelValorLoja9;
    private javax.swing.JMenu jMenuADDFicha;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuBau;
    private javax.swing.JMenu jMenuCampo;
    private javax.swing.JMenu jMenuClasses;
    private javax.swing.JMenu jMenuCreditos;
    private javax.swing.JMenu jMenuDado;
    private javax.swing.JMenu jMenuFichas;
    private javax.swing.JMenu jMenuHistoria;
    private javax.swing.JMenu jMenuListarFichas;
    private javax.swing.JMenu jMenuMapa;
    private javax.swing.JMenu jMenuModoMestre;
    private javax.swing.JMenu jMenuNPCs;
    private javax.swing.JMenu jMenuPercentual;
    private javax.swing.JMenu jMenuProgressao;
    private javax.swing.JMenu jMenuRemoverFicha;
    private javax.swing.JMenu jMenuStatus;
    private javax.swing.JMenu jMenuUtilitarios;
    private javax.swing.JMenu jMenuVeiculos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelArmas;
    private javax.swing.JPanel jPanelEquipamentos;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelInimigos;
    private javax.swing.JPanel jPanelProgressao;
    private javax.swing.JPasswordField jPasswordFieldModoMestre;
    public static javax.swing.JProgressBar jProgressBaEstoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneAmostra1;
    private javax.swing.JScrollPane jScrollPaneAmostra10;
    private javax.swing.JScrollPane jScrollPaneAmostra11;
    private javax.swing.JScrollPane jScrollPaneAmostra12;
    private javax.swing.JScrollPane jScrollPaneAmostra2;
    private javax.swing.JScrollPane jScrollPaneAmostra3;
    private javax.swing.JScrollPane jScrollPaneAmostra4;
    private javax.swing.JScrollPane jScrollPaneAmostra5;
    private javax.swing.JScrollPane jScrollPaneAmostra6;
    private javax.swing.JScrollPane jScrollPaneAmostra7;
    private javax.swing.JScrollPane jScrollPaneAmostra8;
    private javax.swing.JScrollPane jScrollPaneAmostra9;
    private javax.swing.JScrollPane jScrollPaneHome;
    private javax.swing.JScrollPane jScrollPaneLoja;
    private javax.swing.JTabbedPane jTabbedPaneArquivo;
    private javax.swing.JTextArea jTextAreaDescInimigo;
    private javax.swing.JTextArea jTextAreaItensInimigo;
    private javax.swing.JTextArea jTextAreaListaFichas;
    private javax.swing.JTextField jTextFieldAcessorioArma;
    private javax.swing.JTextField jTextFieldCapacidadeArma;
    private javax.swing.JTextField jTextFieldClasseInimigo;
    private javax.swing.JTextField jTextFieldDESInimigo;
    private javax.swing.JTextField jTextFieldEspecialArma;
    private javax.swing.JTextField jTextFieldFORInimigo;
    private javax.swing.JTextField jTextFieldGoldInimigo;
    private javax.swing.JTextField jTextFieldINTInimigo;
    private javax.swing.JTextField jTextFieldLevelInimigo;
    private javax.swing.JTextField jTextFieldNomeAcessorio;
    private javax.swing.JTextField jTextFieldNomeArma;
    private javax.swing.JTextField jTextFieldNomeInimigo;
    private javax.swing.JTextField jTextFieldNomeModBranca;
    private javax.swing.JTextField jTextFieldPMInimigo;
    private javax.swing.JTextField jTextFieldPVInimigo;
    private javax.swing.JTextField jTextFieldPoderArma;
    private javax.swing.JTextField jTextFieldRESInimigo;
    private javax.swing.JTextField jTextFieldRacaInimigo;
    private javax.swing.JTextField jTextFieldRecargaArma;
    private javax.swing.JTextField jTextFieldRequisitoArma;
    private javax.swing.JTextField jTextFieldSABInimigo;
    private javax.swing.JTextField jTextFieldSORInimigo;
    private javax.swing.JTextField jTextFieldSaveAtual;
    private javax.swing.JTextField jTextFieldSexoInimigo;
    private javax.swing.JTextField jTextFieldUltimaModificacao;
    private javax.swing.JTextField jTextFieldUltimoSave;
    private javax.swing.JTextField jTextFieldValorItem1;
    private javax.swing.JTextField jTextFieldValorItem10;
    private javax.swing.JTextField jTextFieldValorItem11;
    private javax.swing.JTextField jTextFieldValorItem12;
    private javax.swing.JTextField jTextFieldValorItem2;
    private javax.swing.JTextField jTextFieldValorItem3;
    private javax.swing.JTextField jTextFieldValorItem4;
    private javax.swing.JTextField jTextFieldValorItem5;
    private javax.swing.JTextField jTextFieldValorItem6;
    private javax.swing.JTextField jTextFieldValorItem7;
    private javax.swing.JTextField jTextFieldValorItem8;
    private javax.swing.JTextField jTextFieldValorItem9;
    private javax.swing.JTextField jTextFieldXPInimigo;
    // End of variables declaration//GEN-END:variables

    //</editor-fold>
}
