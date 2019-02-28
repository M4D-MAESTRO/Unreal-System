/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Historia;

import rpg2.Utilitarios.CampoBatalha;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import rpg2.Sistema.Creditos;
import rpg2.Sistema.UnrealSystemRPGView;
import rpg2.Sistema.FundoTelas;
import rpg2.Sistema.Tela;

/**
 *
 * @author M4ESTRO
 */
public class CapView extends javax.swing.JFrame {

    ImageIcon iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone64.png"));
    EventoView evento = new EventoView();
    private static JRadioButton[] principais = new JRadioButton[231];
    private static JRadioButton[] secundarias = new JRadioButton[108];
    private static JTextField[] atividadesSecundarias = new JTextField[10];
    int progresso = 0;
    
    public static JRadioButton[] getPrincipais(){
        return principais;
    }
    
    public static JRadioButton[] getSecundarias(){
        return secundarias;
    }
    
    public static JTextField[] getAtividades(){
        return atividadesSecundarias;
    }

    public int getProgresso() {
        return progresso;
    }
    
    /**
     * Creates new form Cap01View
     */
    //<editor-fold defaultstate="collapsed" desc=" Metodoso ">
    public CapView() {
        initComponents();
    }

    public JPanel getjPanelCAP1() {
        return jPanelCAP1;
    }

    public JPanel getjPanelCAP2() {
        return jPanelCAP2;
    }

    public JPanel getjPanelCAP3() {
        return jPanelCAP3;
    }

    public JPanel getjPanelCAP4() {
        return jPanelCAP4;
    }

    public JPanel getjPanelCAP5() {
        return jPanelCAP5;
    }

    public JPanel getjPanelCAPFinal() {
        return jPanelCAPFinal;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JScrollPane getjScrollPaneCap1() {
        return jScrollPaneCap1;
    }

    public JScrollPane getjScrollPaneCap2() {
        return jScrollPaneCap2;
    }

    public JScrollPane getjScrollPaneCap3() {
        return jScrollPaneCap3;
    }

    public JScrollPane getjScrollPaneCap4() {
        return jScrollPaneCap4;
    }

    public JScrollPane getjScrollPaneCap5() {
        return jScrollPaneCap5;
    }
//</editor-fold>

    public void passePrincipais() {
        int i = 0;
        //<editor-fold defaultstate="collapsed" desc=" CAP 1 ">
        //PRINCIPAL 01
        principais[i] = jRadioButtonIncompleta1;
        i++;
        principais[i] = jRadioButtonFracassada1;
        i++;
        principais[i] = jRadioButtonCompletada1;
        i++;

        // PRINCIPAL 02
        principais[i] = jRadioButtonIncompleta2;
        i++;
        principais[i] = jRadioButtonFracassada2;
        i++;
        principais[i] = jRadioButtonCompletada2;
        i++;

        // PRINCIPAL 03
        principais[i] = jRadioButtonIncompleta3;
        i++;
        principais[i] = jRadioButtonFracassada3;
        i++;
        principais[i] = jRadioButtonCompletada3;
        i++;

        // PRINCIPAL 04
        principais[i] = jRadioButtonIncompleta4;
        i++;
        principais[i] = jRadioButtonFracassada4;
        i++;
        principais[i] = jRadioButtonCompletada4;
        i++;

        // PRINCIPAL 05
        principais[i] = jRadioButtonIncompleta5;
        i++;
        principais[i] = jRadioButtonFracassada5;
        i++;
        principais[i] = jRadioButtonCompletada5;
        i++;

        // PRINCIPAL 06
        principais[i] = jRadioButtonIncompleta6;
        i++;
        principais[i] = jRadioButtonFracassada6;
        i++;
        principais[i] = jRadioButtonCompletada6;
        i++;

        // PRINCIPAL 07
        principais[i] = jRadioButtonIncompleta7;
        i++;
        principais[i] = jRadioButtonFracassada7;
        i++;
        principais[i] = jRadioButtonCompletada7;
        i++;

        // PRINCIPAL 08
        principais[i] = jRadioButtonIncompleta8;
        i++;
        principais[i] = jRadioButtonFracassada8;
        i++;
        principais[i] = jRadioButtonCompletada8;
        i++;

        // PRINCIPAL 09
        principais[i] = jRadioButtonIncompleta9;
        i++;
        principais[i] = jRadioButtonFracassada9;
        i++;
        principais[i] = jRadioButtonCompletada9;
        i++;

        // PRINCIPAL 10
        principais[i] = jRadioButtonIncompleta10;
        i++;
        principais[i] = jRadioButtonFracassada10;
        i++;
        principais[i] = jRadioButtonCompletada10;
        i++;

        // PRINCIPAL 11
        principais[i] = jRadioButtonIncompleta11;
        i++;
        principais[i] = jRadioButtonFracassada11;
        i++;
        principais[i] = jRadioButtonCompletada11;
        i++;

        // PRINCIPAL 12
        principais[i] = jRadioButtonIncompleta12;
        i++;
        principais[i] = jRadioButtonFracassada12;
        i++;
        principais[i] = jRadioButtonCompletada12;
        i++;

        // PRINCIPAL 13
        principais[i] = jRadioButtonIncompleta13;
        i++;
        principais[i] = jRadioButtonFracassada13;
        i++;
        principais[i] = jRadioButtonCompletada13;
        i++;

        // PRINCIPAL 14
        principais[i] = jRadioButtonIncompleta14;
        i++;
        principais[i] = jRadioButtonFracassada14;
        i++;
        principais[i] = jRadioButtonCompletada14;
        i++;

        // PRINCIPAL 15
        principais[i] = jRadioButtonIncompleta15;
        i++;
        principais[i] = jRadioButtonFracassada15;
        i++;
        principais[i] = jRadioButtonCompletada15;
        i++;
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" CAP 2 ">
        // PRINCIPAL 16
        principais[i] = jRadioButtonIncompleta16;
        i++;
        principais[i] = jRadioButtonFracassada16;
        i++;
        principais[i] = jRadioButtonCompletada16;
        i++;

        // PRINCIPAL 17
        principais[i] = jRadioButtonIncompleta17;
        i++;
        principais[i] = jRadioButtonFracassada17;
        i++;
        principais[i] = jRadioButtonCompletada17;
        i++;

        // PRINCIPAL 18
        principais[i] = jRadioButtonIncompleta18;
        i++;
        principais[i] = jRadioButtonFracassada18;
        i++;
        principais[i] = jRadioButtonCompletada18;
        i++;

        // PRINCIPAL 19
        principais[i] = jRadioButtonIncompleta19;
        i++;
        principais[i] = jRadioButtonFracassada19;
        i++;
        principais[i] = jRadioButtonCompletada19;
        i++;

        // PRINCIPAL 20
        principais[i] = jRadioButtonIncompleta20;
        i++;
        principais[i] = jRadioButtonFracassada20;
        i++;
        principais[i] = jRadioButtonCompletada20;
        i++;

        // PRINCIPAL 21
        principais[i] = jRadioButtonIncompleta21;
        i++;
        principais[i] = jRadioButtonFracassada21;
        i++;
        principais[i] = jRadioButtonCompletada21;
        i++;

        // PRINCIPAL 22
        principais[i] = jRadioButtonIncompleta22;
        i++;
        principais[i] = jRadioButtonFracassada22;
        i++;
        principais[i] = jRadioButtonCompletada22;
        i++;

        // PRINCIPAL 23
        principais[i] = jRadioButtonIncompleta23;
        i++;
        principais[i] = jRadioButtonFracassada23;
        i++;
        principais[i] = jRadioButtonCompletada23;
        i++;

        // PRINCIPAL 24
        principais[i] = jRadioButtonIncompleta24;
        i++;
        principais[i] = jRadioButtonFracassada24;
        i++;
        principais[i] = jRadioButtonCompletada24;
        i++;

        // PRINCIPAL 25
        principais[i] = jRadioButtonIncompleta25;
        i++;
        principais[i] = jRadioButtonFracassada25;
        i++;
        principais[i] = jRadioButtonCompletada25;
        i++;

        // PRINCIPAL 26
        principais[i] = jRadioButtonIncompleta26;
        i++;
        principais[i] = jRadioButtonFracassada26;
        i++;
        principais[i] = jRadioButtonCompletada26;
        i++;

        // PRINCIPAL 27
        principais[i] = jRadioButtonIncompleta27;
        i++;
        principais[i] = jRadioButtonFracassada27;
        i++;
        principais[i] = jRadioButtonCompletada27;
        i++;

        // PRINCIPAL 28
        principais[i] = jRadioButtonIncompleta28;
        i++;
        principais[i] = jRadioButtonFracassada28;
        i++;
        principais[i] = jRadioButtonCompletada28;
        i++;

        // PRINCIPAL 29
        principais[i] = jRadioButtonIncompleta29;
        i++;
        principais[i] = jRadioButtonFracassada29;
        i++;
        principais[i] = jRadioButtonCompletada29;
        i++;

        // PRINCIPAL 30
        principais[i] = jRadioButtonIncompleta30;
        i++;
        principais[i] = jRadioButtonFracassada30;
        i++;
        principais[i] = jRadioButtonCompletada30;
        i++;
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" CAP 3 ">
        // PRINCIPAL 31
        principais[i] = jRadioButtonIncompleta31;
        i++;
        principais[i] = jRadioButtonFracassada31;
        i++;
        principais[i] = jRadioButtonCompletada31;
        i++;

        // PRINCIPAL 32
        principais[i] = jRadioButtonIncompleta32;
        i++;
        principais[i] = jRadioButtonFracassada32;
        i++;
        principais[i] = jRadioButtonCompletada32;
        i++;

        // PRINCIPAL 33
        principais[i] = jRadioButtonIncompleta33;
        i++;
        principais[i] = jRadioButtonFracassada33;
        i++;
        principais[i] = jRadioButtonCompletada33;
        i++;

        // PRINCIPAL 34
        principais[i] = jRadioButtonIncompleta34;
        i++;
        principais[i] = jRadioButtonFracassada34;
        i++;
        principais[i] = jRadioButtonCompletada34;
        i++;

        // PRINCIPAL 35
        principais[i] = jRadioButtonIncompleta35;
        i++;
        principais[i] = jRadioButtonFracassada35;
        i++;
        principais[i] = jRadioButtonCompletada35;
        i++;

        // PRINCIPAL 36
        principais[i] = jRadioButtonIncompleta36;
        i++;
        principais[i] = jRadioButtonFracassada36;
        i++;
        principais[i] = jRadioButtonCompletada36;
        i++;

        // PRINCIPAL 37
        principais[i] = jRadioButtonIncompleta37;
        i++;
        principais[i] = jRadioButtonFracassada37;
        i++;
        principais[i] = jRadioButtonCompletada37;
        i++;

        // PRINCIPAL 38
        principais[i] = jRadioButtonIncompleta38;
        i++;
        principais[i] = jRadioButtonFracassada38;
        i++;
        principais[i] = jRadioButtonCompletada38;
        i++;

        // PRINCIPAL 39
        principais[i] = jRadioButtonIncompleta39;
        i++;
        principais[i] = jRadioButtonFracassada39;
        i++;
        principais[i] = jRadioButtonCompletada39;
        i++;

        // PRINCIPAL 40
        principais[i] = jRadioButtonIncompleta40;
        i++;
        principais[i] = jRadioButtonFracassada40;
        i++;
        principais[i] = jRadioButtonCompletada40;
        i++;

        // PRINCIPAL 41
        principais[i] = jRadioButtonIncompleta41;
        i++;
        principais[i] = jRadioButtonFracassada41;
        i++;
        principais[i] = jRadioButtonCompletada41;
        i++;

        // PRINCIPAL 42
        principais[i] = jRadioButtonIncompleta42;
        i++;
        principais[i] = jRadioButtonFracassada42;
        i++;
        principais[i] = jRadioButtonCompletada42;
        i++;

        // PRINCIPAL 43
        principais[i] = jRadioButtonIncompleta43;
        i++;
        principais[i] = jRadioButtonFracassada43;
        i++;
        principais[i] = jRadioButtonCompletada43;
        i++;

        // PRINCIPAL 44
        principais[i] = jRadioButtonIncompleta44;
        i++;
        principais[i] = jRadioButtonFracassada44;
        i++;
        principais[i] = jRadioButtonCompletada44;
        i++;

        // PRINCIPAL 45
        principais[i] = jRadioButtonIncompleta45;
        i++;
        principais[i] = jRadioButtonFracassada45;
        i++;
        principais[i] = jRadioButtonCompletada45;
        i++;

        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" CAP 4 ">
        // PRINCIPAL 46
        principais[i] = jRadioButtonIncompleta46;
        i++;
        principais[i] = jRadioButtonFracassada46;
        i++;
        principais[i] = jRadioButtonCompletada46;
        i++;

        // PRINCIPAL 47
        principais[i] = jRadioButtonIncompleta47;
        i++;
        principais[i] = jRadioButtonFracassada47;
        i++;
        principais[i] = jRadioButtonCompletada47;
        i++;

        // PRINCIPAL 48
        principais[i] = jRadioButtonIncompleta48;
        i++;
        principais[i] = jRadioButtonFracassada48;
        i++;
        principais[i] = jRadioButtonCompletada48;
        i++;

        // PRINCIPAL 49
        principais[i] = jRadioButtonIncompleta49;
        i++;
        principais[i] = jRadioButtonFracassada49;
        i++;
        principais[i] = jRadioButtonCompletada49;
        i++;

        // PRINCIPAL 50
        principais[i] = jRadioButtonIncompleta50;
        i++;
        principais[i] = jRadioButtonFracassada50;
        i++;
        principais[i] = jRadioButtonCompletada50;
        i++;

        // PRINCIPAL 51
        principais[i] = jRadioButtonIncompleta51;
        i++;
        principais[i] = jRadioButtonFracassada51;
        i++;
        principais[i] = jRadioButtonCompletada51;
        i++;

        // PRINCIPAL 52
        principais[i] = jRadioButtonIncompleta52;
        i++;
        principais[i] = jRadioButtonFracassada52;
        i++;
        principais[i] = jRadioButtonCompletada52;
        i++;

        // PRINCIPAL 53
        principais[i] = jRadioButtonIncompleta53;
        i++;
        principais[i] = jRadioButtonFracassada53;
        i++;
        principais[i] = jRadioButtonCompletada53;
        i++;

        // PRINCIPAL 54
        principais[i] = jRadioButtonIncompleta54;
        i++;
        principais[i] = jRadioButtonFracassada54;
        i++;
        principais[i] = jRadioButtonCompletada54;
        i++;

        // PRINCIPAL 55
        principais[i] = jRadioButtonIncompleta55;
        i++;
        principais[i] = jRadioButtonFracassada55;
        i++;
        principais[i] = jRadioButtonCompletada55;
        i++;

        // PRINCIPAL 56
        principais[i] = jRadioButtonIncompleta56;
        i++;
        principais[i] = jRadioButtonFracassada56;
        i++;
        principais[i] = jRadioButtonCompletada56;
        i++;

        // PRINCIPAL 57
        principais[i] = jRadioButtonIncompleta57;
        i++;
        principais[i] = jRadioButtonFracassada57;
        i++;
        principais[i] = jRadioButtonCompletada57;
        i++;

        // PRINCIPAL 58
        principais[i] = jRadioButtonIncompleta58;
        i++;
        principais[i] = jRadioButtonFracassada58;
        i++;
        principais[i] = jRadioButtonCompletada58;
        i++;

        // PRINCIPAL 59
        principais[i] = jRadioButtonIncompleta59;
        i++;
        principais[i] = jRadioButtonFracassada59;
        i++;
        principais[i] = jRadioButtonCompletada59;
        i++;

        // PRINCIPAL 60
        principais[i] = jRadioButtonIncompleta60;
        i++;
        principais[i] = jRadioButtonFracassada60;
        i++;
        principais[i] = jRadioButtonCompletada60;
        i++;

        //</editor-fold>
    
        
        //<editor-fold defaultstate="collapsed" desc=" CAP 5 ">
        // PRINCIPAL 61
        principais[i] = jRadioButtonIncompleta61;
        i++;
        principais[i] = jRadioButtonFracassada61;
        i++;
        principais[i] = jRadioButtonCompletada61;
        i++;
        
        
        // PRINCIPAL 62
        principais[i] = jRadioButtonIncompleta62;
        i++;
        principais[i] = jRadioButtonFracassada62;
        i++;
        principais[i] = jRadioButtonCompletada62;
        i++;
        
        // PRINCIPAL 63
        principais[i] = jRadioButtonIncompleta63;
        i++;
        principais[i] = jRadioButtonFracassada63;
        i++;
        principais[i] = jRadioButtonCompletada63;
        i++;
        
        // PRINCIPAL 64
        principais[i] = jRadioButtonIncompleta64;
        i++;
        principais[i] = jRadioButtonFracassada64;
        i++;
        principais[i] = jRadioButtonCompletada64;
        i++;
        
        // PRINCIPAL 65
        principais[i] = jRadioButtonIncompleta65;
        i++;
        principais[i] = jRadioButtonFracassada65;
        i++;
        principais[i] = jRadioButtonCompletada65;
        i++;
        
        // PRINCIPAL 66
        principais[i] = jRadioButtonIncompleta66;
        i++;
        principais[i] = jRadioButtonFracassada66;
        i++;
        principais[i] = jRadioButtonCompletada66;
        i++;
        
        // PRINCIPAL 67
        principais[i] = jRadioButtonIncompleta67;
        i++;
        principais[i] = jRadioButtonFracassada67;
        i++;
        principais[i] = jRadioButtonCompletada67;
        i++;
        
        // PRINCIPAL 68
        principais[i] = jRadioButtonIncompleta68;
        i++;
        principais[i] = jRadioButtonFracassada68;
        i++;
        principais[i] = jRadioButtonCompletada68;
        i++;
        
        // PRINCIPAL 69
        principais[i] = jRadioButtonIncompleta69;
        i++;
        principais[i] = jRadioButtonFracassada69;
        i++;
        principais[i] = jRadioButtonCompletada69;
        i++;
        
        // PRINCIPAL 70
        principais[i] = jRadioButtonIncompleta70;
        i++;
        principais[i] = jRadioButtonFracassada70;
        i++;
        principais[i] = jRadioButtonCompletada70;
        i++;
        
        // PRINCIPAL 71
        principais[i] = jRadioButtonIncompleta71;
        i++;
        principais[i] = jRadioButtonFracassada71;
        i++;
        principais[i] = jRadioButtonCompletada71;
        i++;
        
        // PRINCIPAL 72
        principais[i] = jRadioButtonIncompleta72;
        i++;
        principais[i] = jRadioButtonFracassada72;
        i++;
        principais[i] = jRadioButtonCompletada72;
        i++;
        
        // PRINCIPAL 73
        principais[i] = jRadioButtonIncompleta73;
        i++;
        principais[i] = jRadioButtonFracassada73;
        i++;
        principais[i] = jRadioButtonCompletada73;
        i++;
        
        // PRINCIPAL 74
        principais[i] = jRadioButtonIncompleta74;
        i++;
        principais[i] = jRadioButtonFracassada74;
        i++;
        principais[i] = jRadioButtonCompletada74;
        i++;
        
        // PRINCIPAL 75
        principais[i] = jRadioButtonIncompleta75;
        i++;
        principais[i] = jRadioButtonFracassada75;
        i++;
        principais[i] = jRadioButtonCompletada75;
        i++;
        
        
        //</editor-fold>
    
    
        //<editor-fold defaultstate="collapsed" desc=" CAP FINAL ">
        // PRINCIPAL 76
        principais[i] = jRadioButtonIncompleta76;
        i++;
        principais[i] = jRadioButtonFracassada76;
        i++;
        principais[i] = jRadioButtonCompletada76;
        i++;
        
        // PRINCIPAL 77
        principais[i] = jRadioButtonIncompleta77;
        i++;
        principais[i] = jRadioButtonFracassada77;
        i++;
        principais[i] = jRadioButtonCompletada77;
        i++;
        
        //</editor-fold>
    
    }

    public void passeSecundarias() {
        int i = 0;
        //<editor-fold defaultstate="collapsed" desc=" CAP 1 ">

        //SECUNDARIAS 01
        secundarias[i] = jRadioButtonIncompletaS1;
        i++;
        secundarias[i] = jRadioButtonFracassadaS1;
        i++;
        secundarias[i] = jRadioButtonCompletadaS1;
        i++;

        // SECUNDARIAS 02
        secundarias[i] = jRadioButtonIncompletaS2;
        i++;
        secundarias[i] = jRadioButtonFracassadaS2;
        i++;
        secundarias[i] = jRadioButtonCompletadaS2;
        i++;

        // SECUNDARIAS 03
        secundarias[i] = jRadioButtonIncompletaS3;
        i++;
        secundarias[i] = jRadioButtonFracassadaS3;
        i++;
        secundarias[i] = jRadioButtonCompletadaS3;
        i++;

        // SECUNDARIAS 04
        secundarias[i] = jRadioButtonIncompletaS4;
        i++;
        secundarias[i] = jRadioButtonFracassadaS4;
        i++;
        secundarias[i] = jRadioButtonCompletadaS4;
        i++;

        // SECUNDARIAS 05
        secundarias[i] = jRadioButtonIncompletaS5;
        i++;
        secundarias[i] = jRadioButtonFracassadaS5;
        i++;
        secundarias[i] = jRadioButtonCompletadaS5;
        i++;

        // SECUNDARIAS 06
        secundarias[i] = jRadioButtonIncompletaS6;
        i++;
        secundarias[i] = jRadioButtonFracassadaS6;
        i++;
        secundarias[i] = jRadioButtonCompletadaS6;
        i++;

        // SECUNDARIAS 07
        secundarias[i] = jRadioButtonIncompletaS7;
        i++;
        secundarias[i] = jRadioButtonFracassadaS7;
        i++;
        secundarias[i] = jRadioButtonCompletadaS7;
        i++;

        // SECUNDARIAS 08
        secundarias[i] = jRadioButtonIncompletaS8;
        i++;
        secundarias[i] = jRadioButtonFracassadaS8;
        i++;
        secundarias[i] = jRadioButtonCompletadaS8;
        i++;

        // SECUNDARIAS 09
        secundarias[i] = jRadioButtonIncompletaS9;
        i++;
        secundarias[i] = jRadioButtonFracassadaS9;
        i++;
        secundarias[i] = jRadioButtonCompletadaS9;
        i++;

        // SECUNDARIAS 10
        secundarias[i] = jRadioButtonIncompletaS10;
        i++;
        secundarias[i] = jRadioButtonFracassadaS10;
        i++;
        secundarias[i] = jRadioButtonCompletadaS10;
        i++;

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" CAP 2 ">
        // PRINCIPAL 11
        secundarias[i] = jRadioButtonIncompletaS11;
        i++;
        secundarias[i] = jRadioButtonFracassadaS11;
        i++;
        secundarias[i] = jRadioButtonCompletadaS11;
        i++;

        // PRINCIPAL 12
        secundarias[i] = jRadioButtonIncompletaS12;
        i++;
        secundarias[i] = jRadioButtonFracassadaS12;
        i++;
        secundarias[i] = jRadioButtonCompletadaS12;
        i++;

        // PRINCIPAL 13
        secundarias[i] = jRadioButtonIncompletaS13;
        i++;
        secundarias[i] = jRadioButtonFracassadaS13;
        i++;
        secundarias[i] = jRadioButtonCompletadaS13;
        i++;

        // PRINCIPAL 14
        secundarias[i] = jRadioButtonIncompletaS14;
        i++;
        secundarias[i] = jRadioButtonFracassadaS14;
        i++;
        secundarias[i] = jRadioButtonCompletadaS14;
        i++;

        // PRINCIPAL 15
        secundarias[i] = jRadioButtonIncompletaS15;
        i++;
        secundarias[i] = jRadioButtonFracassada15;
        i++;
        secundarias[i] = jRadioButtonCompletadaS15;
        i++;

        // PRINCIPAL 16
        secundarias[i] = jRadioButtonIncompletaS16;
        i++;
        secundarias[i] = jRadioButtonFracassadaS16;
        i++;
        secundarias[i] = jRadioButtonCompletadaS16;
        i++;

        // PRINCIPAL 17
        secundarias[i] = jRadioButtonIncompletaS17;
        i++;
        secundarias[i] = jRadioButtonFracassadaS17;
        i++;
        secundarias[i] = jRadioButtonCompletadaS17;
        i++;

        // PRINCIPAL 18
        secundarias[i] = jRadioButtonIncompletaS18;
        i++;
        secundarias[i] = jRadioButtonFracassadaS18;
        i++;
        secundarias[i] = jRadioButtonCompletadaS18;
        i++;

        // PRINCIPAL 19
        secundarias[i] = jRadioButtonIncompletaS19;
        i++;
        secundarias[i] = jRadioButtonFracassadaS19;
        i++;
        secundarias[i] = jRadioButtonCompletadaS19;
        i++;

        // PRINCIPAL 20
        secundarias[i] = jRadioButtonIncompletaS20;
        i++;
        secundarias[i] = jRadioButtonFracassadaS20;
        i++;
        secundarias[i] = jRadioButtonCompletadaS20;
        i++;

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" CAP 3 ">
        // PRINCIPAL 21
        secundarias[i] = jRadioButtonIncompletaS21;
        i++;
        secundarias[i] = jRadioButtonFracassadaS21;
        i++;
        secundarias[i] = jRadioButtonCompletadaS21;
        i++;

        // PRINCIPAL 22
        secundarias[i] = jRadioButtonIncompletaS22;
        i++;
        secundarias[i] = jRadioButtonFracassadaS22;
        i++;
        secundarias[i] = jRadioButtonCompletadaS22;
        i++;

        // PRINCIPAL 23
        secundarias[i] = jRadioButtonIncompletaS23;
        i++;
        secundarias[i] = jRadioButtonFracassadaS23;
        i++;
        secundarias[i] = jRadioButtonCompletadaS23;
        i++;

        // PRINCIPAL 24
        secundarias[i] = jRadioButtonIncompletaS24;
        i++;
        secundarias[i] = jRadioButtonFracassadaS24;
        i++;
        secundarias[i] = jRadioButtonCompletadaS24;
        i++;

        // PRINCIPAL 25
        secundarias[i] = jRadioButtonIncompletaS25;
        i++;
        secundarias[i] = jRadioButtonFracassadaS25;
        i++;
        secundarias[i] = jRadioButtonCompletadaS25;
        i++;

        // PRINCIPAL 26
        secundarias[i] = jRadioButtonIncompletaS26;
        i++;
        secundarias[i] = jRadioButtonFracassadaS26;
        i++;
        secundarias[i] = jRadioButtonCompletadaS26;
        i++;

        // PRINCIPAL 27
        secundarias[i] = jRadioButtonIncompletaS27;
        i++;
        secundarias[i] = jRadioButtonFracassadaS27;
        i++;
        secundarias[i] = jRadioButtonCompletadaS27;
        i++;

        // PRINCIPAL 28
        secundarias[i] = jRadioButtonIncompletaS28;
        i++;
        secundarias[i] = jRadioButtonFracassadaS28;
        i++;
        secundarias[i] = jRadioButtonCompletadaS28;
        i++;

        // PRINCIPAL 29
        secundarias[i] = jRadioButtonIncompletaS29;
        i++;
        secundarias[i] = jRadioButtonFracassadaS29;
        i++;
        secundarias[i] = jRadioButtonCompletadaS29;
        i++;

        // PRINCIPAL 30
        secundarias[i] = jRadioButtonIncompletaS30;
        i++;
        secundarias[i] = jRadioButtonFracassadaS30;
        i++;
        secundarias[i] = jRadioButtonCompletadaS30;
        i++;

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" CAP 4 ">
        // PRINCIPAL 31
        secundarias[i] = jRadioButtonIncompletaS31;
        i++;
        secundarias[i] = jRadioButtonFracassadaS31;
        i++;
        secundarias[i] = jRadioButtonCompletadaS31;
        i++;
        
        // PRINCIPAL 32
        secundarias[i] = jRadioButtonIncompletaS32;
        i++;
        secundarias[i] = jRadioButtonFracassadaS32;
        i++;
        secundarias[i] = jRadioButtonCompletadaS32;
        i++;
        
        // PRINCIPAL 33
        secundarias[i] = jRadioButtonIncompletaS33;
        i++;
        secundarias[i] = jRadioButtonFracassadaS33;
        i++;
        secundarias[i] = jRadioButtonCompletadaS33;
        i++;
        
        // PRINCIPAL 34
        secundarias[i] = jRadioButtonIncompletaS34;
        i++;
        secundarias[i] = jRadioButtonFracassadaS34;
        i++;
        secundarias[i] = jRadioButtonCompletadaS34;
        i++;
        
        // PRINCIPAL 35
        secundarias[i] = jRadioButtonIncompletaS35;
        i++;
        secundarias[i] = jRadioButtonFracassadaS35;
        i++;
        secundarias[i] = jRadioButtonCompletadaS35;
        i++;
        
        // PRINCIPAL 36
        secundarias[i] = jRadioButtonIncompletaS36;
        i++;
        secundarias[i] = jRadioButtonFracassadaS36;
        i++;
        secundarias[i] = jRadioButtonCompletadaS36;
        i++;
        //</editor-fold>
    }

    public void passeAtividades() {
        int i = 0;

        //Retomada
        atividadesSecundarias[i] = jTextFieldRetomada;
        i++;

        //Servico de escolta
        atividadesSecundarias[i] = jTextFieldEscolta;
        i++;

        //Auxiliar do Capeta
        atividadesSecundarias[i] = jTextFieldAuxiliarCapt;
        i++;

        //Guerra ao terror
        atividadesSecundarias[i] = jTextFieldGuerraTerror;
        i++;

        //Selamento
        atividadesSecundarias[i] = jTextFieldSelamento;
        i++;

        //Desestabilização
        atividadesSecundarias[i] = jTextFieldDesestabilizacao;
        i++;

        //Reconectando
        atividadesSecundarias[i] = jTextFieldReconectando;
        i++;

        //Extinção
        atividadesSecundarias[i] = jTextFieldExtincao;
        i++;

        //Sem paz
        atividadesSecundarias[i] = jTextFieldSemPaz;
        i++;

        //Sem luz
        atividadesSecundarias[i] = jTextFieldSemLuz;
        i++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupP01 = new javax.swing.ButtonGroup();
        buttonGroupP02 = new javax.swing.ButtonGroup();
        buttonGroupP03 = new javax.swing.ButtonGroup();
        buttonGroupP04 = new javax.swing.ButtonGroup();
        buttonGroupP05 = new javax.swing.ButtonGroup();
        buttonGroupP06 = new javax.swing.ButtonGroup();
        buttonGroupP07 = new javax.swing.ButtonGroup();
        buttonGroupP08 = new javax.swing.ButtonGroup();
        buttonGroupP09 = new javax.swing.ButtonGroup();
        buttonGroupP10 = new javax.swing.ButtonGroup();
        buttonGroupP11 = new javax.swing.ButtonGroup();
        buttonGroupP12 = new javax.swing.ButtonGroup();
        buttonGroupP13 = new javax.swing.ButtonGroup();
        buttonGroupP14 = new javax.swing.ButtonGroup();
        buttonGroupP15 = new javax.swing.ButtonGroup();
        buttonGroupS01 = new javax.swing.ButtonGroup();
        buttonGroupS02 = new javax.swing.ButtonGroup();
        buttonGroupS03 = new javax.swing.ButtonGroup();
        buttonGroupS04 = new javax.swing.ButtonGroup();
        buttonGroupS05 = new javax.swing.ButtonGroup();
        buttonGroupS06 = new javax.swing.ButtonGroup();
        buttonGroupS07 = new javax.swing.ButtonGroup();
        buttonGroupS08 = new javax.swing.ButtonGroup();
        buttonGroupS09 = new javax.swing.ButtonGroup();
        buttonGroupS10 = new javax.swing.ButtonGroup();
        buttonGroupP16 = new javax.swing.ButtonGroup();
        buttonGroupP17 = new javax.swing.ButtonGroup();
        buttonGroupP18 = new javax.swing.ButtonGroup();
        buttonGroupP19 = new javax.swing.ButtonGroup();
        buttonGroupP20 = new javax.swing.ButtonGroup();
        buttonGroupP21 = new javax.swing.ButtonGroup();
        buttonGroupP22 = new javax.swing.ButtonGroup();
        buttonGroupP23 = new javax.swing.ButtonGroup();
        buttonGroupP24 = new javax.swing.ButtonGroup();
        buttonGroupP25 = new javax.swing.ButtonGroup();
        buttonGroupP26 = new javax.swing.ButtonGroup();
        buttonGroupP27 = new javax.swing.ButtonGroup();
        buttonGroupP28 = new javax.swing.ButtonGroup();
        buttonGroupP29 = new javax.swing.ButtonGroup();
        buttonGroupP30 = new javax.swing.ButtonGroup();
        buttonGroupP31 = new javax.swing.ButtonGroup();
        buttonGroupP32 = new javax.swing.ButtonGroup();
        buttonGroupP33 = new javax.swing.ButtonGroup();
        buttonGroupP34 = new javax.swing.ButtonGroup();
        buttonGroupP35 = new javax.swing.ButtonGroup();
        buttonGroupP36 = new javax.swing.ButtonGroup();
        buttonGroupP37 = new javax.swing.ButtonGroup();
        buttonGroupP38 = new javax.swing.ButtonGroup();
        buttonGroupP39 = new javax.swing.ButtonGroup();
        buttonGroupP40 = new javax.swing.ButtonGroup();
        buttonGroupP41 = new javax.swing.ButtonGroup();
        buttonGroupP42 = new javax.swing.ButtonGroup();
        buttonGroupP43 = new javax.swing.ButtonGroup();
        buttonGroupP44 = new javax.swing.ButtonGroup();
        buttonGroupP45 = new javax.swing.ButtonGroup();
        buttonGroupP46 = new javax.swing.ButtonGroup();
        buttonGroupP47 = new javax.swing.ButtonGroup();
        buttonGroupP48 = new javax.swing.ButtonGroup();
        buttonGroupP49 = new javax.swing.ButtonGroup();
        buttonGroupP50 = new javax.swing.ButtonGroup();
        buttonGroupP51 = new javax.swing.ButtonGroup();
        buttonGroupP52 = new javax.swing.ButtonGroup();
        buttonGroupP53 = new javax.swing.ButtonGroup();
        buttonGroupP54 = new javax.swing.ButtonGroup();
        buttonGroupP55 = new javax.swing.ButtonGroup();
        buttonGroupP56 = new javax.swing.ButtonGroup();
        buttonGroupP57 = new javax.swing.ButtonGroup();
        buttonGroupP58 = new javax.swing.ButtonGroup();
        buttonGroupP59 = new javax.swing.ButtonGroup();
        buttonGroupP60 = new javax.swing.ButtonGroup();
        buttonGroupS11 = new javax.swing.ButtonGroup();
        buttonGroupS12 = new javax.swing.ButtonGroup();
        buttonGroupS13 = new javax.swing.ButtonGroup();
        buttonGroupS14 = new javax.swing.ButtonGroup();
        buttonGroupS15 = new javax.swing.ButtonGroup();
        buttonGroupS16 = new javax.swing.ButtonGroup();
        buttonGroupS17 = new javax.swing.ButtonGroup();
        buttonGroupS18 = new javax.swing.ButtonGroup();
        buttonGroupS19 = new javax.swing.ButtonGroup();
        buttonGroupS20 = new javax.swing.ButtonGroup();
        buttonGroupS21 = new javax.swing.ButtonGroup();
        buttonGroupS22 = new javax.swing.ButtonGroup();
        buttonGroupS23 = new javax.swing.ButtonGroup();
        buttonGroupS24 = new javax.swing.ButtonGroup();
        buttonGroupS25 = new javax.swing.ButtonGroup();
        buttonGroupS26 = new javax.swing.ButtonGroup();
        buttonGroupS27 = new javax.swing.ButtonGroup();
        buttonGroupS29 = new javax.swing.ButtonGroup();
        buttonGroupS28 = new javax.swing.ButtonGroup();
        buttonGroupS30 = new javax.swing.ButtonGroup();
        buttonGroupP61 = new javax.swing.ButtonGroup();
        buttonGroupP62 = new javax.swing.ButtonGroup();
        buttonGroupP63 = new javax.swing.ButtonGroup();
        buttonGroupP64 = new javax.swing.ButtonGroup();
        buttonGroupP65 = new javax.swing.ButtonGroup();
        buttonGroupP66 = new javax.swing.ButtonGroup();
        buttonGroupP67 = new javax.swing.ButtonGroup();
        buttonGroupP68 = new javax.swing.ButtonGroup();
        buttonGroupP69 = new javax.swing.ButtonGroup();
        buttonGroupP70 = new javax.swing.ButtonGroup();
        buttonGroupP71 = new javax.swing.ButtonGroup();
        buttonGroupP72 = new javax.swing.ButtonGroup();
        buttonGroupP73 = new javax.swing.ButtonGroup();
        buttonGroupP74 = new javax.swing.ButtonGroup();
        buttonGroupP75 = new javax.swing.ButtonGroup();
        buttonGroupP76 = new javax.swing.ButtonGroup();
        buttonGroupP77 = new javax.swing.ButtonGroup();
        buttonGroupS31 = new javax.swing.ButtonGroup();
        buttonGroupS32 = new javax.swing.ButtonGroup();
        buttonGroupS33 = new javax.swing.ButtonGroup();
        buttonGroupS34 = new javax.swing.ButtonGroup();
        buttonGroupS35 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPaneCap1 = new javax.swing.JScrollPane();
        jPanelCAP1 = new FundoTelas(19);
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextAreaP01 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextAreaP2 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextAreaP3 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextAreaP4 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextAreaP5 = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextAreaP6 = new javax.swing.JTextArea();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextAreaP7 = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextAreaP8 = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextAreaP9 = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextAreaP10 = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextAreaP11 = new javax.swing.JTextArea();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextAreaP12 = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextAreaP13 = new javax.swing.JTextArea();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextAreaP14 = new javax.swing.JTextArea();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextAreaP15 = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jRadioButtonIncompleta1 = new javax.swing.JRadioButton();
        jRadioButtonFracassada1 = new javax.swing.JRadioButton();
        jRadioButtonCompletada1 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta2 = new javax.swing.JRadioButton();
        jRadioButtonFracassada2 = new javax.swing.JRadioButton();
        jRadioButtonCompletada2 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta3 = new javax.swing.JRadioButton();
        jRadioButtonFracassada3 = new javax.swing.JRadioButton();
        jRadioButtonCompletada3 = new javax.swing.JRadioButton();
        jRadioButtonCompletada4 = new javax.swing.JRadioButton();
        jRadioButtonFracassada4 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta4 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta5 = new javax.swing.JRadioButton();
        jRadioButtonFracassada5 = new javax.swing.JRadioButton();
        jRadioButtonCompletada5 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta6 = new javax.swing.JRadioButton();
        jRadioButtonFracassada6 = new javax.swing.JRadioButton();
        jRadioButtonCompletada6 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta7 = new javax.swing.JRadioButton();
        jRadioButtonFracassada7 = new javax.swing.JRadioButton();
        jRadioButtonCompletada7 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta8 = new javax.swing.JRadioButton();
        jRadioButtonFracassada8 = new javax.swing.JRadioButton();
        jRadioButtonCompletada8 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta9 = new javax.swing.JRadioButton();
        jRadioButtonFracassada9 = new javax.swing.JRadioButton();
        jRadioButtonCompletada9 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta10 = new javax.swing.JRadioButton();
        jRadioButtonFracassada10 = new javax.swing.JRadioButton();
        jRadioButtonCompletada10 = new javax.swing.JRadioButton();
        jRadioButtonCompletada11 = new javax.swing.JRadioButton();
        jRadioButtonFracassada11 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta11 = new javax.swing.JRadioButton();
        jRadioButtonCompletada12 = new javax.swing.JRadioButton();
        jRadioButtonFracassada12 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta12 = new javax.swing.JRadioButton();
        jRadioButtonCompletada13 = new javax.swing.JRadioButton();
        jRadioButtonFracassada13 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta13 = new javax.swing.JRadioButton();
        jRadioButtonCompletada14 = new javax.swing.JRadioButton();
        jRadioButtonFracassada14 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta14 = new javax.swing.JRadioButton();
        jRadioButtonCompletada15 = new javax.swing.JRadioButton();
        jRadioButtonFracassada15 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta15 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextAreaP16 = new javax.swing.JTextArea();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextAreaP17 = new javax.swing.JTextArea();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTextAreaP18 = new javax.swing.JTextArea();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextAreaP19 = new javax.swing.JTextArea();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextAreaP20 = new javax.swing.JTextArea();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextAreaP21 = new javax.swing.JTextArea();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextAreaP22 = new javax.swing.JTextArea();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextAreaP23 = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextAreaP24 = new javax.swing.JTextArea();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextAreaP25 = new javax.swing.JTextArea();
        jLabel77 = new javax.swing.JLabel();
        jRadioButtonIncompletaS1 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS1 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS1 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS2 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS2 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS2 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS3 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS3 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS3 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS4 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS4 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS4 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS5 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS5 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS5 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS6 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS6 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS6 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS7 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS7 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS7 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS8 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS8 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS8 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS9 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS9 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS9 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS10 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS10 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS10 = new javax.swing.JRadioButton();
        jScrollPaneCap2 = new javax.swing.JScrollPane();
        jPanelCAP2 = new FundoTelas(4);
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel24 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextAreaP26 = new javax.swing.JTextArea();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextAreaP27 = new javax.swing.JTextArea();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextAreaP28 = new javax.swing.JTextArea();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextAreaP29 = new javax.swing.JTextArea();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextAreaP30 = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextAreaP31 = new javax.swing.JTextArea();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextAreaP32 = new javax.swing.JTextArea();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextAreaP33 = new javax.swing.JTextArea();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTextAreaP34 = new javax.swing.JTextArea();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextAreaP35 = new javax.swing.JTextArea();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextAreaP36 = new javax.swing.JTextArea();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextAreaP37 = new javax.swing.JTextArea();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextAreaP38 = new javax.swing.JTextArea();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextAreaP39 = new javax.swing.JTextArea();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTextAreaP40 = new javax.swing.JTextArea();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jRadioButtonIncompleta16 = new javax.swing.JRadioButton();
        jRadioButtonFracassada16 = new javax.swing.JRadioButton();
        jRadioButtonCompletada16 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta17 = new javax.swing.JRadioButton();
        jRadioButtonFracassada17 = new javax.swing.JRadioButton();
        jRadioButtonCompletada17 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta18 = new javax.swing.JRadioButton();
        jRadioButtonFracassada18 = new javax.swing.JRadioButton();
        jRadioButtonCompletada18 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta19 = new javax.swing.JRadioButton();
        jRadioButtonFracassada19 = new javax.swing.JRadioButton();
        jRadioButtonCompletada19 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta20 = new javax.swing.JRadioButton();
        jRadioButtonFracassada20 = new javax.swing.JRadioButton();
        jRadioButtonCompletada20 = new javax.swing.JRadioButton();
        jRadioButtonCompletada21 = new javax.swing.JRadioButton();
        jRadioButtonFracassada21 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta21 = new javax.swing.JRadioButton();
        jRadioButtonCompletada22 = new javax.swing.JRadioButton();
        jRadioButtonFracassada22 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta22 = new javax.swing.JRadioButton();
        jRadioButtonCompletada23 = new javax.swing.JRadioButton();
        jRadioButtonFracassada23 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta23 = new javax.swing.JRadioButton();
        jRadioButtonCompletada24 = new javax.swing.JRadioButton();
        jRadioButtonFracassada24 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta24 = new javax.swing.JRadioButton();
        jRadioButtonCompletada25 = new javax.swing.JRadioButton();
        jRadioButtonFracassada25 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta25 = new javax.swing.JRadioButton();
        jRadioButtonCompletada26 = new javax.swing.JRadioButton();
        jRadioButtonFracassada26 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta26 = new javax.swing.JRadioButton();
        jRadioButtonCompletada27 = new javax.swing.JRadioButton();
        jRadioButtonFracassada27 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta27 = new javax.swing.JRadioButton();
        jRadioButtonCompletada28 = new javax.swing.JRadioButton();
        jRadioButtonFracassada28 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta28 = new javax.swing.JRadioButton();
        jRadioButtonCompletada29 = new javax.swing.JRadioButton();
        jRadioButtonFracassada29 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta29 = new javax.swing.JRadioButton();
        jRadioButtonCompletada30 = new javax.swing.JRadioButton();
        jRadioButtonFracassada30 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta30 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel25 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextAreaP41 = new javax.swing.JTextArea();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTextAreaP42 = new javax.swing.JTextArea();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane54 = new javax.swing.JScrollPane();
        jTextAreaP43 = new javax.swing.JTextArea();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jScrollPane55 = new javax.swing.JScrollPane();
        jTextAreaP44 = new javax.swing.JTextArea();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jScrollPane56 = new javax.swing.JScrollPane();
        jTextAreaP45 = new javax.swing.JTextArea();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jScrollPane57 = new javax.swing.JScrollPane();
        jTextAreaP46 = new javax.swing.JTextArea();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jScrollPane58 = new javax.swing.JScrollPane();
        jTextAreaP47 = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane59 = new javax.swing.JScrollPane();
        jTextAreaP48 = new javax.swing.JTextArea();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jScrollPane60 = new javax.swing.JScrollPane();
        jTextAreaP49 = new javax.swing.JTextArea();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jScrollPane61 = new javax.swing.JScrollPane();
        jTextAreaP50 = new javax.swing.JTextArea();
        jLabel127 = new javax.swing.JLabel();
        jRadioButtonIncompletaS11 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS11 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS11 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS12 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS12 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS12 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS13 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS13 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS13 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS14 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS14 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS14 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS15 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS15 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS15 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS16 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS16 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS16 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS17 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS17 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS17 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS18 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS18 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS18 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS19 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS19 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS19 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS20 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS20 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS20 = new javax.swing.JRadioButton();
        jScrollPaneCap3 = new javax.swing.JScrollPane();
        jPanelCAP3 = new FundoTelas(30);
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jLabel176 = new javax.swing.JLabel();
        jScrollPane77 = new javax.swing.JScrollPane();
        jTextAreaP66 = new javax.swing.JTextArea();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jScrollPane78 = new javax.swing.JScrollPane();
        jTextAreaP67 = new javax.swing.JTextArea();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jScrollPane79 = new javax.swing.JScrollPane();
        jTextAreaP68 = new javax.swing.JTextArea();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jScrollPane80 = new javax.swing.JScrollPane();
        jTextAreaP69 = new javax.swing.JTextArea();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jScrollPane81 = new javax.swing.JScrollPane();
        jTextAreaP70 = new javax.swing.JTextArea();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jScrollPane82 = new javax.swing.JScrollPane();
        jTextAreaP71 = new javax.swing.JTextArea();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jScrollPane83 = new javax.swing.JScrollPane();
        jTextAreaP72 = new javax.swing.JTextArea();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jScrollPane84 = new javax.swing.JScrollPane();
        jTextAreaP73 = new javax.swing.JTextArea();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jScrollPane85 = new javax.swing.JScrollPane();
        jTextAreaP74 = new javax.swing.JTextArea();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jScrollPane86 = new javax.swing.JScrollPane();
        jTextAreaP75 = new javax.swing.JTextArea();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jScrollPane87 = new javax.swing.JScrollPane();
        jTextAreaP76 = new javax.swing.JTextArea();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jScrollPane88 = new javax.swing.JScrollPane();
        jTextAreaP77 = new javax.swing.JTextArea();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jScrollPane89 = new javax.swing.JScrollPane();
        jTextAreaP78 = new javax.swing.JTextArea();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jScrollPane90 = new javax.swing.JScrollPane();
        jTextAreaP79 = new javax.swing.JTextArea();
        jLabel203 = new javax.swing.JLabel();
        jScrollPane91 = new javax.swing.JScrollPane();
        jTextAreaP80 = new javax.swing.JTextArea();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jRadioButtonIncompleta31 = new javax.swing.JRadioButton();
        jRadioButtonFracassada31 = new javax.swing.JRadioButton();
        jRadioButtonCompletada31 = new javax.swing.JRadioButton();
        jRadioButtonCompletada32 = new javax.swing.JRadioButton();
        jRadioButtonFracassada32 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta32 = new javax.swing.JRadioButton();
        jRadioButtonCompletada33 = new javax.swing.JRadioButton();
        jRadioButtonFracassada33 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta33 = new javax.swing.JRadioButton();
        jRadioButtonCompletada34 = new javax.swing.JRadioButton();
        jRadioButtonFracassada34 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta34 = new javax.swing.JRadioButton();
        jRadioButtonCompletada35 = new javax.swing.JRadioButton();
        jRadioButtonFracassada35 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta35 = new javax.swing.JRadioButton();
        jRadioButtonCompletada36 = new javax.swing.JRadioButton();
        jRadioButtonFracassada36 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta36 = new javax.swing.JRadioButton();
        jRadioButtonCompletada37 = new javax.swing.JRadioButton();
        jRadioButtonFracassada37 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta37 = new javax.swing.JRadioButton();
        jRadioButtonCompletada38 = new javax.swing.JRadioButton();
        jRadioButtonFracassada38 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta38 = new javax.swing.JRadioButton();
        jRadioButtonCompletada39 = new javax.swing.JRadioButton();
        jRadioButtonFracassada39 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta39 = new javax.swing.JRadioButton();
        jRadioButtonCompletada40 = new javax.swing.JRadioButton();
        jRadioButtonFracassada40 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta40 = new javax.swing.JRadioButton();
        jRadioButtonCompletada41 = new javax.swing.JRadioButton();
        jRadioButtonFracassada41 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta41 = new javax.swing.JRadioButton();
        jRadioButtonCompletada42 = new javax.swing.JRadioButton();
        jRadioButtonFracassada42 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta42 = new javax.swing.JRadioButton();
        jRadioButtonCompletada43 = new javax.swing.JRadioButton();
        jRadioButtonFracassada43 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta43 = new javax.swing.JRadioButton();
        jRadioButtonCompletada44 = new javax.swing.JRadioButton();
        jRadioButtonFracassada44 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta44 = new javax.swing.JRadioButton();
        jRadioButtonCompletada45 = new javax.swing.JRadioButton();
        jRadioButtonFracassada45 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta45 = new javax.swing.JRadioButton();
        jLabel206 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel28 = new javax.swing.JPanel();
        jLabel207 = new javax.swing.JLabel();
        jScrollPane92 = new javax.swing.JScrollPane();
        jTextAreaP81 = new javax.swing.JTextArea();
        jLabel208 = new javax.swing.JLabel();
        jScrollPane93 = new javax.swing.JScrollPane();
        jTextAreaP82 = new javax.swing.JTextArea();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jScrollPane94 = new javax.swing.JScrollPane();
        jTextAreaP83 = new javax.swing.JTextArea();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jScrollPane95 = new javax.swing.JScrollPane();
        jTextAreaP84 = new javax.swing.JTextArea();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jScrollPane96 = new javax.swing.JScrollPane();
        jTextAreaP85 = new javax.swing.JTextArea();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jScrollPane97 = new javax.swing.JScrollPane();
        jTextAreaP86 = new javax.swing.JTextArea();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jScrollPane98 = new javax.swing.JScrollPane();
        jTextAreaP87 = new javax.swing.JTextArea();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jScrollPane99 = new javax.swing.JScrollPane();
        jTextAreaP88 = new javax.swing.JTextArea();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jScrollPane100 = new javax.swing.JScrollPane();
        jTextAreaP89 = new javax.swing.JTextArea();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jScrollPane101 = new javax.swing.JScrollPane();
        jTextAreaP90 = new javax.swing.JTextArea();
        jLabel226 = new javax.swing.JLabel();
        jRadioButtonIncompletaS21 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS21 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS21 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS22 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS22 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS22 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS23 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS23 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS23 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS24 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS24 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS24 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS25 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS25 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS25 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS26 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS26 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS26 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS27 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS27 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS27 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS28 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS28 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS28 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS29 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS29 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS29 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS30 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS30 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS30 = new javax.swing.JRadioButton();
        jScrollPaneCap4 = new javax.swing.JScrollPane();
        jPanelCAP4 = new FundoTelas(8);
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel29 = new javax.swing.JPanel();
        jLabel227 = new javax.swing.JLabel();
        jScrollPane102 = new javax.swing.JScrollPane();
        jTextAreaP91 = new javax.swing.JTextArea();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jScrollPane103 = new javax.swing.JScrollPane();
        jTextAreaP92 = new javax.swing.JTextArea();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jScrollPane104 = new javax.swing.JScrollPane();
        jTextAreaP93 = new javax.swing.JTextArea();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jScrollPane105 = new javax.swing.JScrollPane();
        jTextAreaP94 = new javax.swing.JTextArea();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jScrollPane106 = new javax.swing.JScrollPane();
        jTextAreaP95 = new javax.swing.JTextArea();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jScrollPane107 = new javax.swing.JScrollPane();
        jTextAreaP96 = new javax.swing.JTextArea();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jScrollPane108 = new javax.swing.JScrollPane();
        jTextAreaP97 = new javax.swing.JTextArea();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jScrollPane109 = new javax.swing.JScrollPane();
        jTextAreaP98 = new javax.swing.JTextArea();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jScrollPane110 = new javax.swing.JScrollPane();
        jTextAreaP99 = new javax.swing.JTextArea();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jScrollPane111 = new javax.swing.JScrollPane();
        jTextAreaP100 = new javax.swing.JTextArea();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jScrollPane112 = new javax.swing.JScrollPane();
        jTextAreaP101 = new javax.swing.JTextArea();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jScrollPane113 = new javax.swing.JScrollPane();
        jTextAreaP102 = new javax.swing.JTextArea();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jScrollPane114 = new javax.swing.JScrollPane();
        jTextAreaP103 = new javax.swing.JTextArea();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jScrollPane115 = new javax.swing.JScrollPane();
        jTextAreaP104 = new javax.swing.JTextArea();
        jLabel254 = new javax.swing.JLabel();
        jScrollPane116 = new javax.swing.JScrollPane();
        jTextAreaP105 = new javax.swing.JTextArea();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jRadioButtonIncompleta46 = new javax.swing.JRadioButton();
        jRadioButtonFracassada46 = new javax.swing.JRadioButton();
        jRadioButtonCompletada46 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta47 = new javax.swing.JRadioButton();
        jRadioButtonFracassada47 = new javax.swing.JRadioButton();
        jRadioButtonCompletada47 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta48 = new javax.swing.JRadioButton();
        jRadioButtonFracassada48 = new javax.swing.JRadioButton();
        jRadioButtonCompletada48 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta49 = new javax.swing.JRadioButton();
        jRadioButtonFracassada49 = new javax.swing.JRadioButton();
        jRadioButtonCompletada49 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta50 = new javax.swing.JRadioButton();
        jRadioButtonFracassada50 = new javax.swing.JRadioButton();
        jRadioButtonCompletada50 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta51 = new javax.swing.JRadioButton();
        jRadioButtonFracassada51 = new javax.swing.JRadioButton();
        jRadioButtonCompletada51 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta52 = new javax.swing.JRadioButton();
        jRadioButtonFracassada52 = new javax.swing.JRadioButton();
        jRadioButtonCompletada52 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta53 = new javax.swing.JRadioButton();
        jRadioButtonFracassada53 = new javax.swing.JRadioButton();
        jRadioButtonCompletada53 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta54 = new javax.swing.JRadioButton();
        jRadioButtonFracassada54 = new javax.swing.JRadioButton();
        jRadioButtonCompletada54 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta55 = new javax.swing.JRadioButton();
        jRadioButtonFracassada55 = new javax.swing.JRadioButton();
        jRadioButtonCompletada55 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta56 = new javax.swing.JRadioButton();
        jRadioButtonFracassada56 = new javax.swing.JRadioButton();
        jRadioButtonCompletada56 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta57 = new javax.swing.JRadioButton();
        jRadioButtonFracassada57 = new javax.swing.JRadioButton();
        jRadioButtonCompletada57 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta58 = new javax.swing.JRadioButton();
        jRadioButtonFracassada58 = new javax.swing.JRadioButton();
        jRadioButtonCompletada58 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta59 = new javax.swing.JRadioButton();
        jRadioButtonFracassada59 = new javax.swing.JRadioButton();
        jRadioButtonCompletada59 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta60 = new javax.swing.JRadioButton();
        jRadioButtonFracassada60 = new javax.swing.JRadioButton();
        jRadioButtonCompletada60 = new javax.swing.JRadioButton();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel292 = new javax.swing.JLabel();
        jScrollPane134 = new javax.swing.JScrollPane();
        jTextAreaP123 = new javax.swing.JTextArea();
        jLabel293 = new javax.swing.JLabel();
        jScrollPane135 = new javax.swing.JScrollPane();
        jTextAreaP124 = new javax.swing.JTextArea();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jScrollPane136 = new javax.swing.JScrollPane();
        jTextAreaP125 = new javax.swing.JTextArea();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jScrollPane137 = new javax.swing.JScrollPane();
        jTextAreaP126 = new javax.swing.JTextArea();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jScrollPane138 = new javax.swing.JScrollPane();
        jTextAreaP127 = new javax.swing.JTextArea();
        jLabel301 = new javax.swing.JLabel();
        jRadioButtonIncompletaS31 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS31 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS31 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS32 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS32 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS32 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS33 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS33 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS33 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS34 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS34 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS34 = new javax.swing.JRadioButton();
        jRadioButtonIncompletaS35 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS35 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS35 = new javax.swing.JRadioButton();
        jLabel302 = new javax.swing.JLabel();
        jScrollPane139 = new javax.swing.JScrollPane();
        jTextAreaP128 = new javax.swing.JTextArea();
        jLabel303 = new javax.swing.JLabel();
        jRadioButtonIncompletaS36 = new javax.swing.JRadioButton();
        jRadioButtonFracassadaS36 = new javax.swing.JRadioButton();
        jRadioButtonCompletadaS36 = new javax.swing.JRadioButton();
        jScrollPaneCap5 = new javax.swing.JScrollPane();
        jPanelCAP5 = new FundoTelas(5);
        jLabel149 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel30 = new javax.swing.JPanel();
        jLabel257 = new javax.swing.JLabel();
        jScrollPane117 = new javax.swing.JScrollPane();
        jTextAreaP106 = new javax.swing.JTextArea();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jScrollPane118 = new javax.swing.JScrollPane();
        jTextAreaP107 = new javax.swing.JTextArea();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jScrollPane119 = new javax.swing.JScrollPane();
        jTextAreaP108 = new javax.swing.JTextArea();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jScrollPane120 = new javax.swing.JScrollPane();
        jTextAreaP109 = new javax.swing.JTextArea();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jScrollPane121 = new javax.swing.JScrollPane();
        jTextAreaP110 = new javax.swing.JTextArea();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jScrollPane122 = new javax.swing.JScrollPane();
        jTextAreaP111 = new javax.swing.JTextArea();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jScrollPane123 = new javax.swing.JScrollPane();
        jTextAreaP112 = new javax.swing.JTextArea();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jScrollPane124 = new javax.swing.JScrollPane();
        jTextAreaP113 = new javax.swing.JTextArea();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jScrollPane125 = new javax.swing.JScrollPane();
        jTextAreaP114 = new javax.swing.JTextArea();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jScrollPane126 = new javax.swing.JScrollPane();
        jTextAreaP115 = new javax.swing.JTextArea();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jScrollPane127 = new javax.swing.JScrollPane();
        jTextAreaP116 = new javax.swing.JTextArea();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jScrollPane128 = new javax.swing.JScrollPane();
        jTextAreaP117 = new javax.swing.JTextArea();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jScrollPane129 = new javax.swing.JScrollPane();
        jTextAreaP118 = new javax.swing.JTextArea();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jScrollPane130 = new javax.swing.JScrollPane();
        jTextAreaP119 = new javax.swing.JTextArea();
        jLabel284 = new javax.swing.JLabel();
        jScrollPane131 = new javax.swing.JScrollPane();
        jTextAreaP120 = new javax.swing.JTextArea();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jRadioButtonIncompleta61 = new javax.swing.JRadioButton();
        jRadioButtonFracassada61 = new javax.swing.JRadioButton();
        jRadioButtonCompletada61 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta62 = new javax.swing.JRadioButton();
        jRadioButtonFracassada62 = new javax.swing.JRadioButton();
        jRadioButtonCompletada62 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta63 = new javax.swing.JRadioButton();
        jRadioButtonFracassada63 = new javax.swing.JRadioButton();
        jRadioButtonCompletada63 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta64 = new javax.swing.JRadioButton();
        jRadioButtonFracassada64 = new javax.swing.JRadioButton();
        jRadioButtonCompletada64 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta65 = new javax.swing.JRadioButton();
        jRadioButtonFracassada65 = new javax.swing.JRadioButton();
        jRadioButtonCompletada65 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta66 = new javax.swing.JRadioButton();
        jRadioButtonFracassada66 = new javax.swing.JRadioButton();
        jRadioButtonCompletada66 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta67 = new javax.swing.JRadioButton();
        jRadioButtonFracassada67 = new javax.swing.JRadioButton();
        jRadioButtonCompletada67 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta68 = new javax.swing.JRadioButton();
        jRadioButtonFracassada68 = new javax.swing.JRadioButton();
        jRadioButtonCompletada68 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta69 = new javax.swing.JRadioButton();
        jRadioButtonFracassada69 = new javax.swing.JRadioButton();
        jRadioButtonCompletada69 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta70 = new javax.swing.JRadioButton();
        jRadioButtonFracassada70 = new javax.swing.JRadioButton();
        jRadioButtonCompletada70 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta71 = new javax.swing.JRadioButton();
        jRadioButtonFracassada71 = new javax.swing.JRadioButton();
        jRadioButtonCompletada71 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta72 = new javax.swing.JRadioButton();
        jRadioButtonFracassada72 = new javax.swing.JRadioButton();
        jRadioButtonCompletada72 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta73 = new javax.swing.JRadioButton();
        jRadioButtonFracassada73 = new javax.swing.JRadioButton();
        jRadioButtonCompletada73 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta74 = new javax.swing.JRadioButton();
        jRadioButtonFracassada74 = new javax.swing.JRadioButton();
        jRadioButtonCompletada74 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta75 = new javax.swing.JRadioButton();
        jRadioButtonFracassada75 = new javax.swing.JRadioButton();
        jRadioButtonCompletada75 = new javax.swing.JRadioButton();
        jPanelCAPFinal = new FundoTelas(18);
        jLabel150 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel287 = new javax.swing.JLabel();
        jScrollPane132 = new javax.swing.JScrollPane();
        jTextAreaP121 = new javax.swing.JTextArea();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jScrollPane133 = new javax.swing.JScrollPane();
        jTextAreaP122 = new javax.swing.JTextArea();
        jLabel290 = new javax.swing.JLabel();
        jRadioButtonIncompleta76 = new javax.swing.JRadioButton();
        jRadioButtonFracassada76 = new javax.swing.JRadioButton();
        jRadioButtonCompletada76 = new javax.swing.JRadioButton();
        jRadioButtonIncompleta77 = new javax.swing.JRadioButton();
        jRadioButtonFracassada77 = new javax.swing.JRadioButton();
        jRadioButtonCompletada77 = new javax.swing.JRadioButton();
        jPanelAtivSecundaria = new FundoTelas(25);
        jLabeRecompensaDesc = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaRecDesc = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jTextFieldReconectando = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jTextFieldSemLuz = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jTextFieldExtincao = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldDesestabilizacao = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jTextFieldEscolta = new javax.swing.JTextField();
        jTextFieldSelamento = new javax.swing.JTextField();
        jTextFieldRetomada = new javax.swing.JTextField();
        jTextFieldSemPaz = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jTextFieldGuerraTerror = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jTextFieldAuxiliarCapt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButtonDescRec = new javax.swing.JToggleButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuVoltar = new javax.swing.JMenu();
        jMenuEvento = new javax.swing.JMenu();
        jMenuSaveLoad = new javax.swing.JMenu();
        jMenuCreditos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("The Unreal System - Capítulos");
        setIconImage(iconeTela.getImage());
        setMinimumSize(Tela.telaFull());

        jPanelCAP1.setPreferredSize(Tela.telaFull());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Primárias");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(700, 1940));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(630, 1940));

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setMaximumSize(new java.awt.Dimension(650, 1955));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel28.setText("01 - Prólogo: ");

        jTextAreaP01.setEditable(false);
        jTextAreaP01.setColumns(20);
        jTextAreaP01.setLineWrap(true);
        jTextAreaP01.setRows(5);
        jTextAreaP01.setText("Após o surto, forças militares são depachadas à cidade \nenquanto forças locais tentam evacuar e proteger os civis que\npor sua vez tentam sobreviver como podem.\nXP: 100 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP01.setWrapStyleWord(true);
        jScrollPane12.setViewportView(jTextAreaP01);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel29.setText("Status: ");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel30.setText("02 - A estrada até Roma: ");

        jTextAreaP2.setEditable(false);
        jTextAreaP2.setColumns(20);
        jTextAreaP2.setLineWrap(true);
        jTextAreaP2.setRows(5);
        jTextAreaP2.setText("Duas semanas após o surto, o grupo sobrevivente se encontrou.\nChegando ao consesso de que juntos eles terão maior chance de\nsobreviverem, eles rumam à Roma, um abrigo protegido pelo que\nsobrou das forças militares remanescente e alguns civis.\nXP: 200 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP2.setWrapStyleWord(true);
        jScrollPane13.setViewportView(jTextAreaP2);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel31.setText("Status: ");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel32.setText("03 - As defesas de Roma");

        jTextAreaP3.setEditable(false);
        jTextAreaP3.setColumns(20);
        jTextAreaP3.setLineWrap(true);
        jTextAreaP3.setRows(5);
        jTextAreaP3.setText("Ao chegar em Roma, o grupo sobrevivente descobre que nem tudo\né o que parece, Roma está para ser atacada por um grupo de\ncriminosos, bandidos e terroristas. O grupo sobrevivente não\ntem outra escolha, se não ajuda-los.\nXP: 200 - GOLD: 100 - OUTROS: +10 de Karma.");
        jTextAreaP3.setWrapStyleWord(true);
        jScrollPane14.setViewportView(jTextAreaP3);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel33.setText("Status: ");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel34.setText("04 - Viver");

        jTextAreaP4.setEditable(false);
        jTextAreaP4.setColumns(20);
        jTextAreaP4.setLineWrap(true);
        jTextAreaP4.setRows(5);
        jTextAreaP4.setText("Após sobreviverem e ajudarem Roma com os atacantes, o general \nda B.H.C James Bianco, entra em contato com o grupo \nsobrevivente alegando possuir a chave para acabar com este \npesadelo.\nXP: 200 - GOLD: 100 - OUTROS: Nada.");
        jTextAreaP4.setWrapStyleWord(true);
        jScrollPane15.setViewportView(jTextAreaP4);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel35.setText("Status: ");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel36.setText("05 - Sofrimento pavimentado");

        jTextAreaP5.setEditable(false);
        jTextAreaP5.setColumns(20);
        jTextAreaP5.setLineWrap(true);
        jTextAreaP5.setRows(5);
        jTextAreaP5.setText("O grupo se encontra livre na cidade.\nExplore, cace, ajude, sobreviva! Cada escolha e vida salva\nconta para algo. Entrem em contato com o general James para\nprosseguir com sua missão principal.\nXP: 0 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP5.setWrapStyleWord(true);
        jScrollPane16.setViewportView(jTextAreaP5);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel37.setText("Status: ");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel38.setText("06 - Busca por evidências PARTE 1");

        jTextAreaP6.setEditable(false);
        jTextAreaP6.setColumns(20);
        jTextAreaP6.setLineWrap(true);
        jTextAreaP6.setRows(5);
        jTextAreaP6.setText("James revelou ao grupo que precisa de evidências que o auxilie\nna investigação da B.H.C, ele ordena para que o grupo comece\na investigação e busca por evidência no hospital Central\nXP: 200 - GOLD: 300 - OUTROS: 1x Remington 870.\n");
        jTextAreaP6.setWrapStyleWord(true);
        jScrollPane17.setViewportView(jTextAreaP6);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel39.setText("Status: ");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel40.setText("07 - Busca por evidências PARTE 2");

        jTextAreaP7.setEditable(false);
        jTextAreaP7.setColumns(20);
        jTextAreaP7.setLineWrap(true);
        jTextAreaP7.setRows(5);
        jTextAreaP7.setText("Após investigarem o hospital, o grupo parte em direção ao \nhospício Santa Dinfna, a busca por evidência continua.\nXP: 300 - GOLD: 500 - OUTROS: 1x MP5.\n");
        jTextAreaP7.setWrapStyleWord(true);
        jScrollPane18.setViewportView(jTextAreaP7);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel41.setText("Status: ");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel42.setText("08 - Afundados... em solidão");

        jTextAreaP8.setEditable(false);
        jTextAreaP8.setColumns(20);
        jTextAreaP8.setLineWrap(true);
        jTextAreaP8.setRows(5);
        jTextAreaP8.setText("Enquanto investigavam o hospício, algo bizarro e inesperado\naconteceu, separando o grupo em duplas e os levando a um local\nescuro, frio, enlouquecedor e cruel.\nXP: 500 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP8.setWrapStyleWord(true);
        jScrollPane19.setViewportView(jTextAreaP8);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel43.setText("Status: ");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel44.setText("09 - O conflito do beco");

        jTextAreaP9.setEditable(false);
        jTextAreaP9.setColumns(20);
        jTextAreaP9.setLineWrap(true);
        jTextAreaP9.setRows(5);
        jTextAreaP9.setText("Após conseguirem escapar com vida daquele local, e sem muito\naparente sucesso na investigação do hospício, o grupo se vê\nno beco do abatedouro, um local dominado por criminosos e \npsicopatas sádicos.\nXP: 600 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP9.setWrapStyleWord(true);
        jScrollPane20.setViewportView(jTextAreaP9);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel45.setText("Status: ");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel46.setText("10 - Afundados... em desespero");

        jTextAreaP10.setEditable(false);
        jTextAreaP10.setColumns(20);
        jTextAreaP10.setLineWrap(true);
        jTextAreaP10.setRows(5);
        jTextAreaP10.setText("Infelizmente a luta para escapar do beco não ocorreu muito bem\no grupo acabou sendo capturado pelos Carrascos, o grupo \ncriminoso que comanda o Abatedouro\nXP: 700 - GOLD: 0 - OUTROS: 5x Grandas Flags e 5x Semtex.");
        jTextAreaP10.setWrapStyleWord(true);
        jScrollPane21.setViewportView(jTextAreaP10);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel47.setText("Status: ");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel48.setText("11 - The Hunter");

        jTextAreaP11.setEditable(false);
        jTextAreaP11.setColumns(20);
        jTextAreaP11.setLineWrap(true);
        jTextAreaP11.setRows(5);
        jTextAreaP11.setText("Durante a tentativa de fuga do Abatedouro, o grupo se deparou\ncom uma criatura grande, rápida, forte e assustadora, o Hunter\nEle simplesmente apareceu e começou a destruir o local e os\ncriminosos ali presente.\nXP: 500 - GOLD: 0 - OUTROS: 1x Scar-L/+10 Karma.");
        jTextAreaP11.setWrapStyleWord(true);
        jScrollPane22.setViewportView(jTextAreaP11);

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel49.setText("Status: ");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel50.setText("12 - Centurião");

        jTextAreaP12.setEditable(false);
        jTextAreaP12.setColumns(20);
        jTextAreaP12.setLineWrap(true);
        jTextAreaP12.setRows(5);
        jTextAreaP12.setText("O grupo descobriu enquanto presos, que o Abatedouro pretnedia\nrealizar um ataque contra Roma, retorne a Roma e se prepare\npara a eventual luta!\nATENÇÃO! Fracassar nesta missão acarretará na perca de KARMA.\nXP: 500 - GOLD: 500 - OUTROS: 1x Rex 412/+10 Karma/ +1 Ponto de Habilidade.");
        jTextAreaP12.setWrapStyleWord(true);
        jScrollPane23.setViewportView(jTextAreaP12);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel51.setText("Status: ");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel52.setText("13 -  Busca por evidências PARTE 3");

        jTextAreaP13.setEditable(false);
        jTextAreaP13.setColumns(20);
        jTextAreaP13.setLineWrap(true);
        jTextAreaP13.setRows(5);
        jTextAreaP13.setText("Após tudo o que aconteceu o grupo se reconecta com James para\ncontinuar sua principal missão.\nAgora o grupo deve ir investigar a igreja Nova Vida\nXP: 1000 - GOLD: 300 - OUTROS: Nada.");
        jTextAreaP13.setWrapStyleWord(true);
        jScrollPane24.setViewportView(jTextAreaP13);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel53.setText("Status: ");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel54.setText("14 - O rio das Lágrimas");

        jTextAreaP14.setEditable(false);
        jTextAreaP14.setColumns(20);
        jTextAreaP14.setLineWrap(true);
        jTextAreaP14.setRows(5);
        jTextAreaP14.setText("Após investigar com sucesso a igreja, o grupo desce até seu\nnível inferior, chegando a uma passagem por um rio onde se deparam com a Cilla...\nXP: 1000 - GOLD: 500 - OUTROS: Munição.");
        jTextAreaP14.setWrapStyleWord(true);
        jScrollPane25.setViewportView(jTextAreaP14);

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel55.setText("Status: ");

        jTextAreaP15.setEditable(false);
        jTextAreaP15.setColumns(20);
        jTextAreaP15.setLineWrap(true);
        jTextAreaP15.setRows(5);
        jTextAreaP15.setText("Mesmo após quase morrerem no rio das Lágrimas, o grupo alcança\nseu objetivo, o laboratório do outro lado, e acham o que \nestavão procruando...\nXP: 1000 - GOLD: 500 - OUTROS: Munição/ +1 Ponto de habilidade\n.");
        jTextAreaP15.setWrapStyleWord(true);
        jScrollPane26.setViewportView(jTextAreaP15);

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel56.setText("15 - The Unreal ");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel57.setText("Status: ");

        buttonGroupP01.add(jRadioButtonIncompleta1);
        jRadioButtonIncompleta1.setSelected(true);
        jRadioButtonIncompleta1.setText("Incompleta");

        buttonGroupP01.add(jRadioButtonFracassada1);
        jRadioButtonFracassada1.setText("Fracassada");

        buttonGroupP01.add(jRadioButtonCompletada1);
        jRadioButtonCompletada1.setText("Completada");

        buttonGroupP02.add(jRadioButtonIncompleta2);
        jRadioButtonIncompleta2.setSelected(true);
        jRadioButtonIncompleta2.setText("Incompleta");

        buttonGroupP02.add(jRadioButtonFracassada2);
        jRadioButtonFracassada2.setText("Fracassada");

        buttonGroupP02.add(jRadioButtonCompletada2);
        jRadioButtonCompletada2.setText("Completada");

        buttonGroupP03.add(jRadioButtonIncompleta3);
        jRadioButtonIncompleta3.setSelected(true);
        jRadioButtonIncompleta3.setText("Incompleta");

        buttonGroupP03.add(jRadioButtonFracassada3);
        jRadioButtonFracassada3.setText("Fracassada");

        buttonGroupP03.add(jRadioButtonCompletada3);
        jRadioButtonCompletada3.setText("Completada");

        buttonGroupP04.add(jRadioButtonCompletada4);
        jRadioButtonCompletada4.setText("Completada");

        buttonGroupP04.add(jRadioButtonFracassada4);
        jRadioButtonFracassada4.setText("Fracassada");

        buttonGroupP04.add(jRadioButtonIncompleta4);
        jRadioButtonIncompleta4.setSelected(true);
        jRadioButtonIncompleta4.setText("Incompleta");

        buttonGroupP05.add(jRadioButtonIncompleta5);
        jRadioButtonIncompleta5.setSelected(true);
        jRadioButtonIncompleta5.setText("Incompleta");

        buttonGroupP05.add(jRadioButtonFracassada5);
        jRadioButtonFracassada5.setText("Fracassada");

        buttonGroupP05.add(jRadioButtonCompletada5);
        jRadioButtonCompletada5.setText("Completada");

        buttonGroupP06.add(jRadioButtonIncompleta6);
        jRadioButtonIncompleta6.setSelected(true);
        jRadioButtonIncompleta6.setText("Incompleta");

        buttonGroupP06.add(jRadioButtonFracassada6);
        jRadioButtonFracassada6.setText("Fracassada");

        buttonGroupP06.add(jRadioButtonCompletada6);
        jRadioButtonCompletada6.setText("Completada");

        buttonGroupP07.add(jRadioButtonIncompleta7);
        jRadioButtonIncompleta7.setSelected(true);
        jRadioButtonIncompleta7.setText("Incompleta");

        buttonGroupP07.add(jRadioButtonFracassada7);
        jRadioButtonFracassada7.setText("Fracassada");

        buttonGroupP07.add(jRadioButtonCompletada7);
        jRadioButtonCompletada7.setText("Completada");

        buttonGroupP08.add(jRadioButtonIncompleta8);
        jRadioButtonIncompleta8.setSelected(true);
        jRadioButtonIncompleta8.setText("Incompleta");

        buttonGroupP08.add(jRadioButtonFracassada8);
        jRadioButtonFracassada8.setText("Fracassada");

        buttonGroupP08.add(jRadioButtonCompletada8);
        jRadioButtonCompletada8.setText("Completada");

        buttonGroupP09.add(jRadioButtonIncompleta9);
        jRadioButtonIncompleta9.setSelected(true);
        jRadioButtonIncompleta9.setText("Incompleta");

        buttonGroupP09.add(jRadioButtonFracassada9);
        jRadioButtonFracassada9.setText("Fracassada");

        buttonGroupP09.add(jRadioButtonCompletada9);
        jRadioButtonCompletada9.setText("Completada");

        buttonGroupP10.add(jRadioButtonIncompleta10);
        jRadioButtonIncompleta10.setSelected(true);
        jRadioButtonIncompleta10.setText("Incompleta");

        buttonGroupP10.add(jRadioButtonFracassada10);
        jRadioButtonFracassada10.setText("Fracassada");

        buttonGroupP10.add(jRadioButtonCompletada10);
        jRadioButtonCompletada10.setText("Completada");

        buttonGroupP11.add(jRadioButtonCompletada11);
        jRadioButtonCompletada11.setText("Completada");

        buttonGroupP11.add(jRadioButtonFracassada11);
        jRadioButtonFracassada11.setText("Fracassada");

        buttonGroupP11.add(jRadioButtonIncompleta11);
        jRadioButtonIncompleta11.setSelected(true);
        jRadioButtonIncompleta11.setText("Incompleta");

        buttonGroupP12.add(jRadioButtonCompletada12);
        jRadioButtonCompletada12.setText("Completada");

        buttonGroupP12.add(jRadioButtonFracassada12);
        jRadioButtonFracassada12.setText("Fracassada");

        buttonGroupP12.add(jRadioButtonIncompleta12);
        jRadioButtonIncompleta12.setSelected(true);
        jRadioButtonIncompleta12.setText("Incompleta");

        buttonGroupP13.add(jRadioButtonCompletada13);
        jRadioButtonCompletada13.setText("Completada");

        buttonGroupP13.add(jRadioButtonFracassada13);
        jRadioButtonFracassada13.setText("Fracassada");

        buttonGroupP13.add(jRadioButtonIncompleta13);
        jRadioButtonIncompleta13.setSelected(true);
        jRadioButtonIncompleta13.setText("Incompleta");

        buttonGroupP14.add(jRadioButtonCompletada14);
        jRadioButtonCompletada14.setText("Completada");

        buttonGroupP14.add(jRadioButtonFracassada14);
        jRadioButtonFracassada14.setText("Fracassada");

        buttonGroupP14.add(jRadioButtonIncompleta14);
        jRadioButtonIncompleta14.setSelected(true);
        jRadioButtonIncompleta14.setText("Incompleta");

        buttonGroupP15.add(jRadioButtonCompletada15);
        jRadioButtonCompletada15.setText("Completada");
        jRadioButtonCompletada15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCompletada15ActionPerformed(evt);
            }
        });

        buttonGroupP15.add(jRadioButtonFracassada15);
        jRadioButtonFracassada15.setText("Fracassada");

        buttonGroupP15.add(jRadioButtonIncompleta15);
        jRadioButtonIncompleta15.setSelected(true);
        jRadioButtonIncompleta15.setText("Incompleta");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jRadioButtonIncompleta1)
                            .addComponent(jRadioButtonFracassada1)
                            .addComponent(jRadioButtonCompletada1)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jRadioButtonIncompleta2)
                            .addComponent(jRadioButtonFracassada2)
                            .addComponent(jRadioButtonCompletada2)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jRadioButtonIncompleta3)
                            .addComponent(jRadioButtonFracassada3)
                            .addComponent(jRadioButtonCompletada3)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jRadioButtonIncompleta4)
                            .addComponent(jRadioButtonFracassada4)
                            .addComponent(jRadioButtonCompletada4)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jRadioButtonIncompleta5)
                            .addComponent(jRadioButtonFracassada5)
                            .addComponent(jRadioButtonCompletada5)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jRadioButtonIncompleta6)
                            .addComponent(jRadioButtonFracassada6)
                            .addComponent(jRadioButtonCompletada6)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jRadioButtonIncompleta7)
                            .addComponent(jRadioButtonFracassada7)
                            .addComponent(jRadioButtonCompletada7)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jRadioButtonIncompleta8)
                            .addComponent(jRadioButtonFracassada8)
                            .addComponent(jRadioButtonCompletada8)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jRadioButtonIncompleta9)
                            .addComponent(jRadioButtonFracassada9)
                            .addComponent(jRadioButtonCompletada9)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jRadioButtonIncompleta10)
                            .addComponent(jRadioButtonFracassada10)
                            .addComponent(jRadioButtonCompletada10)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jRadioButtonIncompleta11)
                            .addComponent(jRadioButtonFracassada11)
                            .addComponent(jRadioButtonCompletada11)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jRadioButtonIncompleta12)
                            .addComponent(jRadioButtonFracassada12)
                            .addComponent(jRadioButtonCompletada12)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jRadioButtonIncompleta13)
                            .addComponent(jRadioButtonFracassada13)
                            .addComponent(jRadioButtonCompletada13)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jRadioButtonIncompleta14)
                            .addComponent(jRadioButtonFracassada14)
                            .addComponent(jRadioButtonCompletada14)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jRadioButtonIncompleta15)
                            .addComponent(jRadioButtonFracassada15)
                            .addComponent(jRadioButtonCompletada15)))
                    .addComponent(jLabel28)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42)
                    .addComponent(jLabel44)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48)
                    .addComponent(jLabel50)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54)
                    .addComponent(jLabel56))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonIncompleta7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada7)))
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada10))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(4, 4, 4)
                        .addComponent(jRadioButtonIncompleta11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada11))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada12))
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada13))
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada14))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada15))
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel22);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Secundárias");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(680, 1350));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(680, 1320));

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel23.setMaximumSize(new java.awt.Dimension(670, 1350));
        jPanel23.setPreferredSize(new java.awt.Dimension(670, 1350));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel58.setText("S01 - Ursinho de inocência");

        jTextAreaP16.setEditable(false);
        jTextAreaP16.setColumns(20);
        jTextAreaP16.setLineWrap(true);
        jTextAreaP16.setRows(5);
        jTextAreaP16.setText("Ajude a garotinha a encontra seu ursinho de pelúcia!\nDISPONÍVEL ENTRE AS MISSÕES: 05 e 13.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA\nXP: 200 - GOLD: 50 - OUTROS: +10 de KARMA.");
        jTextAreaP16.setWrapStyleWord(true);
        jScrollPane27.setViewportView(jTextAreaP16);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel59.setText("Status: ");

        jTextAreaP17.setEditable(false);
        jTextAreaP17.setColumns(20);
        jTextAreaP17.setLineWrap(true);
        jTextAreaP17.setRows(5);
        jTextAreaP17.setText("Ajude o coveiro a escapar do cimitério junto de sua família\nDISPONÍVEL ENTRE AS MISSÕES: 05 e 13.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 200 - GOLD: 150 - OUTROS: +10 de KARMA.");
        jTextAreaP17.setWrapStyleWord(true);
        jScrollPane28.setViewportView(jTextAreaP17);

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel60.setText("S02 - Cemitério maldito");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel61.setText("Status: ");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel62.setText("S03 - A Horda");

        jTextAreaP18.setEditable(false);
        jTextAreaP18.setColumns(20);
        jTextAreaP18.setLineWrap(true);
        jTextAreaP18.setRows(5);
        jTextAreaP18.setText("Você foi contactado por um capitão do corpo de Fuzileiros\nNavais para auxiliar sua tropa na eliminação de uma horda.\nDISPONÍVEL ENTRE AS MISSÕES: 05 e 13.\nXP: 300 - GOLD: 300 - OUTROS: +10 de KARMA/Munição.");
        jTextAreaP18.setWrapStyleWord(true);
        jScrollPane29.setViewportView(jTextAreaP18);

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel63.setText("Status: ");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel64.setText("S04 - Corrida médica");

        jTextAreaP19.setEditable(false);
        jTextAreaP19.setColumns(20);
        jTextAreaP19.setLineWrap(true);
        jTextAreaP19.setRows(5);
        jTextAreaP19.setText("Ao se deparar com um acampamento necessitado de suplimento\nmedicinais, o grupo não vê escolha se não ajuda-los.\nDISPONÍVEL ENTRE AS MISSÕES: 05 e 13.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 300 - GOLD: 100 - OUTROS: +3 Spray de primeiros socorros.");
        jTextAreaP19.setWrapStyleWord(true);
        jScrollPane30.setViewportView(jTextAreaP19);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel65.setText("Status: ");

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel66.setText("S05 - Caos urbano");

        jTextAreaP20.setEditable(false);
        jTextAreaP20.setColumns(20);
        jTextAreaP20.setLineWrap(true);
        jTextAreaP20.setRows(5);
        jTextAreaP20.setText("Auxilie as forças policiais a lidar com criminosos e grupos\nde caos que aterrorizam a cidade.\nDISPONÍVEL ENTRE AS MISSÕES: 05 e 13.\nXP: 300 - GOLD: 300 - OUTROS: Munição/ 1x Ranger/ \n1x Stun Rod.");
        jTextAreaP20.setWrapStyleWord(true);
        jScrollPane31.setViewportView(jTextAreaP20);

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel67.setText("Status: ");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel68.setText("S06 - Cães do inferno");

        jTextAreaP21.setEditable(false);
        jTextAreaP21.setColumns(20);
        jTextAreaP21.setLineWrap(true);
        jTextAreaP21.setRows(5);
        jTextAreaP21.setText("O grupo ficou sabendo sobre cães infectados que pertubava\num pequeno grupo de sobreviventes, e agora precisa ajuda-los\nDISPONÍVEL ENTRE AS MISSÕES: 05 e 13.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 300 - GOLD: 100 - OUTROS: + 10 Karma / +10 Componentes (Classe)");
        jTextAreaP21.setWrapStyleWord(true);
        jScrollPane32.setViewportView(jTextAreaP21);

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel69.setText("Status: ");

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel70.setText("S07 - Susurros na escuridão");

        jTextAreaP22.setEditable(false);
        jTextAreaP22.setColumns(20);
        jTextAreaP22.setLineWrap(true);
        jTextAreaP22.setRows(5);
        jTextAreaP22.setText("Enquanto andavam tentando fugir daquela escuridão, as duplas\nouviram barulhos, gritos e choros, assim,resolveram investigar\nDISPONÍVEL ENTRE AS MISSÕES: 08 apenas.\nXP: 500 - GOLD: 0 - OUTROS: + 10 Karma");
        jTextAreaP22.setWrapStyleWord(true);
        jScrollPane33.setViewportView(jTextAreaP22);

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel71.setText("Status: ");

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel72.setText("S08 - Doce insanidade");

        jTextAreaP23.setEditable(false);
        jTextAreaP23.setColumns(20);
        jTextAreaP23.setLineWrap(true);
        jTextAreaP23.setRows(5);
        jTextAreaP23.setText("Mesmo após tudo o que aconteceu, o grupo decide voltar ao\nhospício em busca de respostas e lá se deparam com o Reanimador...\nDISPONÍVEL ENTRE AS MISSÕES: 11 e 13.\nXP: 500 - GOLD: 0 - OUTROS: Nada");
        jTextAreaP23.setWrapStyleWord(true);
        jScrollPane34.setViewportView(jTextAreaP23);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel73.setText("Status: ");

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel74.setText("S09 - Roma in victa");

        jTextAreaP24.setEditable(false);
        jTextAreaP24.setColumns(20);
        jTextAreaP24.setLineWrap(true);
        jTextAreaP24.setRows(5);
        jTextAreaP24.setText("Após defender Roma com sucesso, a mesma se prepara para um\ncontra-ataque e conta com a ajuda do grupo para isso.\nDISPONÍVEL ENTRE AS MISSÕES: 12 e 13. Necessário também ter\ncompletado a missão 12!\nXP: 500 - GOLD: 500 - OUTROS: 2x C4/ 1x MP-7/ Munição");
        jTextAreaP24.setWrapStyleWord(true);
        jScrollPane35.setViewportView(jTextAreaP24);

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel75.setText("Status: ");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel76.setText("S10 -Pigsaw");

        jTextAreaP25.setEditable(false);
        jTextAreaP25.setColumns(20);
        jTextAreaP25.setLineWrap(true);
        jTextAreaP25.setRows(5);
        jTextAreaP25.setText("Roma consegue com sucesso destruir o que remanesceu do \nAbatedouro, mas Pigsaw, o líder, conseguiu escapar, caçe-o e\nelimine de vez esta ameaça\nDISPONÍVEL ENTRE AS MISSÕES: 12 e 13. Necessário também ter\nobtido sucesso na missão S09!\nXP: 500 - GOLD: 500 - OUTROS: 1x Mauser C96/ Munição");
        jTextAreaP25.setWrapStyleWord(true);
        jScrollPane36.setViewportView(jTextAreaP25);

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel77.setText("Status: ");

        buttonGroupS01.add(jRadioButtonIncompletaS1);
        jRadioButtonIncompletaS1.setSelected(true);
        jRadioButtonIncompletaS1.setText("Incompleta");

        buttonGroupS01.add(jRadioButtonFracassadaS1);
        jRadioButtonFracassadaS1.setText("Fracassada");

        buttonGroupS01.add(jRadioButtonCompletadaS1);
        jRadioButtonCompletadaS1.setText("Completada");

        buttonGroupS02.add(jRadioButtonIncompletaS2);
        jRadioButtonIncompletaS2.setSelected(true);
        jRadioButtonIncompletaS2.setText("Incompleta");

        buttonGroupS02.add(jRadioButtonFracassadaS2);
        jRadioButtonFracassadaS2.setText("Fracassada");

        buttonGroupS02.add(jRadioButtonCompletadaS2);
        jRadioButtonCompletadaS2.setText("Completada");

        buttonGroupS03.add(jRadioButtonIncompletaS3);
        jRadioButtonIncompletaS3.setSelected(true);
        jRadioButtonIncompletaS3.setText("Incompleta");

        buttonGroupS03.add(jRadioButtonFracassadaS3);
        jRadioButtonFracassadaS3.setText("Fracassada");

        buttonGroupS03.add(jRadioButtonCompletadaS3);
        jRadioButtonCompletadaS3.setText("Completada");

        buttonGroupS04.add(jRadioButtonIncompletaS4);
        jRadioButtonIncompletaS4.setSelected(true);
        jRadioButtonIncompletaS4.setText("Incompleta");

        buttonGroupS04.add(jRadioButtonFracassadaS4);
        jRadioButtonFracassadaS4.setText("Fracassada");

        buttonGroupS04.add(jRadioButtonCompletadaS4);
        jRadioButtonCompletadaS4.setText("Completada");

        buttonGroupS05.add(jRadioButtonIncompletaS5);
        jRadioButtonIncompletaS5.setSelected(true);
        jRadioButtonIncompletaS5.setText("Incompleta");

        buttonGroupS05.add(jRadioButtonFracassadaS5);
        jRadioButtonFracassadaS5.setText("Fracassada");

        buttonGroupS05.add(jRadioButtonCompletadaS5);
        jRadioButtonCompletadaS5.setText("Completada");

        buttonGroupS06.add(jRadioButtonIncompletaS6);
        jRadioButtonIncompletaS6.setSelected(true);
        jRadioButtonIncompletaS6.setText("Incompleta");

        buttonGroupS06.add(jRadioButtonFracassadaS6);
        jRadioButtonFracassadaS6.setText("Fracassada");

        buttonGroupS06.add(jRadioButtonCompletadaS6);
        jRadioButtonCompletadaS6.setText("Completada");

        buttonGroupS07.add(jRadioButtonIncompletaS7);
        jRadioButtonIncompletaS7.setSelected(true);
        jRadioButtonIncompletaS7.setText("Incompleta");

        buttonGroupS07.add(jRadioButtonFracassadaS7);
        jRadioButtonFracassadaS7.setText("Fracassada");

        buttonGroupS07.add(jRadioButtonCompletadaS7);
        jRadioButtonCompletadaS7.setText("Completada");

        buttonGroupS08.add(jRadioButtonIncompletaS8);
        jRadioButtonIncompletaS8.setSelected(true);
        jRadioButtonIncompletaS8.setText("Incompleta");

        buttonGroupS08.add(jRadioButtonFracassadaS8);
        jRadioButtonFracassadaS8.setText("Fracassada");

        buttonGroupS08.add(jRadioButtonCompletadaS8);
        jRadioButtonCompletadaS8.setText("Completada");

        buttonGroupS09.add(jRadioButtonIncompletaS9);
        jRadioButtonIncompletaS9.setSelected(true);
        jRadioButtonIncompletaS9.setText("Incompleta");

        buttonGroupS09.add(jRadioButtonFracassadaS9);
        jRadioButtonFracassadaS9.setText("Fracassada");

        buttonGroupS09.add(jRadioButtonCompletadaS9);
        jRadioButtonCompletadaS9.setText("Completada");

        buttonGroupS10.add(jRadioButtonIncompletaS10);
        jRadioButtonIncompletaS10.setSelected(true);
        jRadioButtonIncompletaS10.setText("Incompleta");

        buttonGroupS10.add(jRadioButtonFracassadaS10);
        jRadioButtonFracassadaS10.setText("Fracassada");

        buttonGroupS10.add(jRadioButtonCompletadaS10);
        jRadioButtonCompletadaS10.setText("Completada");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jRadioButtonIncompletaS1)
                            .addComponent(jRadioButtonFracassadaS1)
                            .addComponent(jRadioButtonCompletadaS1)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jRadioButtonIncompletaS2)
                            .addComponent(jRadioButtonFracassadaS2)
                            .addComponent(jRadioButtonCompletadaS2)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jRadioButtonIncompletaS3)
                            .addComponent(jRadioButtonFracassadaS3)
                            .addComponent(jRadioButtonCompletadaS3)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jRadioButtonIncompletaS4)
                            .addComponent(jRadioButtonFracassadaS4)
                            .addComponent(jRadioButtonCompletadaS4)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jRadioButtonIncompletaS5)
                            .addComponent(jRadioButtonFracassadaS5)
                            .addComponent(jRadioButtonCompletadaS5)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(jRadioButtonIncompletaS6)
                            .addComponent(jRadioButtonFracassadaS6)
                            .addComponent(jRadioButtonCompletadaS6)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jRadioButtonIncompletaS7)
                            .addComponent(jRadioButtonFracassadaS7)
                            .addComponent(jRadioButtonCompletadaS7)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(jRadioButtonIncompletaS8)
                            .addComponent(jRadioButtonFracassadaS8)
                            .addComponent(jRadioButtonCompletadaS8)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addComponent(jRadioButtonIncompletaS9)
                            .addComponent(jRadioButtonFracassadaS9)
                            .addComponent(jRadioButtonCompletadaS9)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jRadioButtonIncompletaS10)
                            .addComponent(jRadioButtonFracassadaS10)
                            .addComponent(jRadioButtonCompletadaS10)))
                    .addComponent(jLabel58)
                    .addComponent(jLabel60)
                    .addComponent(jLabel62)
                    .addComponent(jLabel64)
                    .addComponent(jLabel66)
                    .addComponent(jLabel68)
                    .addComponent(jLabel70)
                    .addComponent(jLabel72)
                    .addComponent(jLabel74)
                    .addComponent(jLabel76))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS10))
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel23);

        javax.swing.GroupLayout jPanelCAP1Layout = new javax.swing.GroupLayout(jPanelCAP1);
        jPanelCAP1.setLayout(jPanelCAP1Layout);
        jPanelCAP1Layout.setHorizontalGroup(
            jPanelCAP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelCAP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCAP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        jPanelCAP1Layout.setVerticalGroup(
            jPanelCAP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCAP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel26))
                .addGroup(jPanelCAP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCAP1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCAP1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPaneCap1.setViewportView(jPanelCAP1);

        jTabbedPane1.addTab("Capítulo 01", jScrollPaneCap1);

        jPanelCAP2.setPreferredSize(Tela.telaFull());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Primárias");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMaximumSize(new java.awt.Dimension(700, 1940));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(630, 1940));

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel24.setMaximumSize(new java.awt.Dimension(650, 1955));
        jPanel24.setPreferredSize(new java.awt.Dimension(650, 1955));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel78.setText("16 - Ignorando os sinais");

        jTextAreaP26.setEditable(false);
        jTextAreaP26.setColumns(20);
        jTextAreaP26.setLineWrap(true);
        jTextAreaP26.setRows(5);
        jTextAreaP26.setText("Após com sucesso investigarem o primeiro laboratório avançado da Unreal\nO grupo precisa agora escapar dele com as evidências enquanto enfrentam\nos soldados da Unreal e suas criações.\nXP: 1500 - GOLD: 0 - OUTROS: 1x Beretta M93R / Arquivo 01 - Os experimentos / Anotações 01 - Zona Florestal.");
        jTextAreaP26.setWrapStyleWord(true);
        jScrollPane37.setViewportView(jTextAreaP26);

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel79.setText("Status: ");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel80.setText("17 -  A floresta do silêncio");

        jTextAreaP27.setEditable(false);
        jTextAreaP27.setColumns(20);
        jTextAreaP27.setLineWrap(true);
        jTextAreaP27.setRows(5);
        jTextAreaP27.setText("Escapando com sucesso do laboratório, o grupo precisa agora alcançar\na temível \"Zona Florestal\" para continuar sua busca nos outros\nlaboratórios da Unreal\nXP: 1500 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP27.setWrapStyleWord(true);
        jScrollPane38.setViewportView(jTextAreaP27);

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel81.setText("Status: ");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel82.setText("18 - Sofrimento florestal");

        jTextAreaP28.setEditable(false);
        jTextAreaP28.setColumns(20);
        jTextAreaP28.setLineWrap(true);
        jTextAreaP28.setRows(5);
        jTextAreaP28.setText("Agora na zona florestal, o grupo se depara com uma imensa mata fechada\nExplore, caçe, ajude e sobreviva! Lembre-se que suas escolhas trazem\nconsequências! Entre em contato com o general James para prosseguir.\nXP: 0 - GOLD: 0 - OUTROS: 5x Granadas incendiárias/5x C4.");
        jTextAreaP28.setWrapStyleWord(true);
        jScrollPane39.setViewportView(jTextAreaP28);

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel83.setText("Status: ");

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel84.setText("19 - O laboratório do sul");

        jTextAreaP29.setEditable(false);
        jTextAreaP29.setColumns(20);
        jTextAreaP29.setLineWrap(true);
        jTextAreaP29.setRows(5);
        jTextAreaP29.setText("James enviou ao grupo a localização de mais 2 laboratórios avançados\nda Unreal. O grupo deve ir até eles, mas não para investigar, e sim\npara destruí-los por completo. Começando pelo laboratório ao sul.\nXP: 1500 - GOLD: 300 - OUTROS: 1 pílula - p [pra cada] / 10 componentes (classe) / Arquivo 02 - Criaturas / Anotações 02 - Anomalias.");
        jTextAreaP29.setWrapStyleWord(true);
        jScrollPane40.setViewportView(jTextAreaP29);

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel85.setText("Status: ");

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel86.setText("20 - Caçados");

        jTextAreaP30.setEditable(false);
        jTextAreaP30.setColumns(20);
        jTextAreaP30.setLineWrap(true);
        jTextAreaP30.setRows(5);
        jTextAreaP30.setText("Após destruirem o primeiro laboratório, o grupo ruma em direção ao segundo\nMas a Unreal envia algo atrás deles.\nXP: 1500 - GOLD: 0 - OUTROS: +1 skill point.");
        jTextAreaP30.setWrapStyleWord(true);
        jScrollPane41.setViewportView(jTextAreaP30);

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel87.setText("Status: ");

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel88.setText("21 -  A caverna");

        jTextAreaP31.setEditable(false);
        jTextAreaP31.setColumns(20);
        jTextAreaP31.setLineWrap(true);
        jTextAreaP31.setRows(5);
        jTextAreaP31.setText("Após derrotarem a serpente gigante o grupo se depara com uma caverna cujo eles precisam atravessa-la\nXP: 1500 - GOLD: 0 - OUTROS: 1 pílula - P [para cada] / 2x pílulas - M.\n");
        jTextAreaP31.setWrapStyleWord(true);
        jScrollPane42.setViewportView(jTextAreaP31);

        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel89.setText("Status: ");

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel90.setText("22 - Desestabilizado");

        jTextAreaP32.setEditable(false);
        jTextAreaP32.setColumns(20);
        jTextAreaP32.setLineWrap(true);
        jTextAreaP32.setRows(5);
        jTextAreaP32.setText("Após sairem da caverna, o grupo se encontra em um local totalmente fora\nde contexto. Agora com areia e até piramedes, o grupo não tem ideia de\npor onde ir ou como prosseguir.\nXP: 2000 - GOLD: 500 - OUTROS: 1x UMP 45.\n");
        jTextAreaP32.setWrapStyleWord(true);
        jScrollPane43.setViewportView(jTextAreaP32);

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel91.setText("Status: ");

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel92.setText("23 - Tumba maldita");

        jTextAreaP33.setEditable(false);
        jTextAreaP33.setColumns(20);
        jTextAreaP33.setLineWrap(true);
        jTextAreaP33.setRows(5);
        jTextAreaP33.setText("Após entrarem na piramide. O grupo busca por possíveis respostas\ndo que estaria acontecendo e de como voltar para onde eles estavam.\n\nXP: 2000 - GOLD: 500 - OUTROS: Nada.");
        jTextAreaP33.setWrapStyleWord(true);
        jScrollPane44.setViewportView(jTextAreaP33);

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel93.setText("Status: ");

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel94.setText("24 - O laboratório norte");

        jTextAreaP34.setEditable(false);
        jTextAreaP34.setColumns(20);
        jTextAreaP34.setLineWrap(true);
        jTextAreaP34.setRows(5);
        jTextAreaP34.setText("Após desvendarem o mistério ta tumba e retornarem ao seu mundo.\nO grupo parte em direção ao segundo laboratório para destruí-lo\n\nXP: 2000 - GOLD: 500 - OUTROS: RPG-7 / Arquivo 03 - Homem Misterioso.");
        jTextAreaP34.setWrapStyleWord(true);
        jScrollPane45.setViewportView(jTextAreaP34);

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel95.setText("Status: ");

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel96.setText("25 - Terror");

        jTextAreaP35.setEditable(false);
        jTextAreaP35.setColumns(20);
        jTextAreaP35.setLineWrap(true);
        jTextAreaP35.setRows(5);
        jTextAreaP35.setText("Após destruirem o laboratório, James avisa ao grupo sobre terroristas\nque estariam tentando espalhar ainda mais o vírus em Luisidiana.\nJames os envia para o Rancho dos Cultistas em Kranch, a cidade do interior para impedi-los\nXP: 2000 - GOLD: 250 - OUTROS: +10 Karma.");
        jTextAreaP35.setWrapStyleWord(true);
        jScrollPane46.setViewportView(jTextAreaP35);

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel97.setText("Status: ");

        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel98.setText("26 - Driver");

        jTextAreaP36.setEditable(false);
        jTextAreaP36.setColumns(20);
        jTextAreaP36.setLineWrap(true);
        jTextAreaP36.setRows(5);
        jTextAreaP36.setText("Embora tenham impedido os terroristas, o seu líder, Phantom conseguiu escapar portando o vírus. Persiga-o e impeça esse grupo de vez!\nXP: 2000 - GOLD: 0 - OUTROS: Munição.");
        jTextAreaP36.setWrapStyleWord(true);
        jScrollPane47.setViewportView(jTextAreaP36);

        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel99.setText("Status: ");

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel100.setText("27 - Quando um estranho chama");

        jTextAreaP37.setEditable(false);
        jTextAreaP37.setColumns(20);
        jTextAreaP37.setLineWrap(true);
        jTextAreaP37.setRows(5);
        jTextAreaP37.setText("O grupo persegue Phantom até o centro de Kranch, após derrota-lo em combate, um homem de terno e gravata misterioso aparece e diz que o grupo pagará por atrapalhar seus planos.\nXP: 2000 - GOLD: 0 - OUTROS: Registro 03 - Phantom.");
        jTextAreaP37.setWrapStyleWord(true);
        jScrollPane48.setViewportView(jTextAreaP37);

        jLabel101.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel101.setText("Status: ");

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel102.setText("28 -  Dor & Sofrimento PARTE 1");

        jTextAreaP38.setEditable(false);
        jTextAreaP38.setColumns(20);
        jTextAreaP38.setLineWrap(true);
        jTextAreaP38.setRows(5);
        jTextAreaP38.setText("O homem misterioso simplesmente abre um portal que suga o grupo sobrevivente para dentro dele, alegando que eles conhecerão a dor por estarem atrapalhando\nseus planos. Agora o grupo precisa sobreviver neste terrível local\nXP: 2000 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP38.setWrapStyleWord(true);
        jScrollPane49.setViewportView(jTextAreaP38);

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel103.setText("Status: ");

        jLabel104.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel104.setText("29 - Dor & Sofrimento PARTE 2");

        jTextAreaP39.setEditable(false);
        jTextAreaP39.setColumns(20);
        jTextAreaP39.setLineWrap(true);
        jTextAreaP39.setRows(5);
        jTextAreaP39.setText("O grupo investiga e tenta sobreviver naquele local extremamente hostíl enquanto enfrenta hordas de inimigos. Ao se depararem com uma porta gigante, o grupo deve obter três chaves para passar.\nXP: 2000 - GOLD: 500 - OUTROS: Munição.");
        jTextAreaP39.setWrapStyleWord(true);
        jScrollPane50.setViewportView(jTextAreaP39);

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel105.setText("Status: ");

        jTextAreaP40.setEditable(false);
        jTextAreaP40.setColumns(20);
        jTextAreaP40.setLineWrap(true);
        jTextAreaP40.setRows(5);
        jTextAreaP40.setText("Ao passarem pelo portão. O grupo se depara com duas bestas que guardam a passagem de volta ao mundo real.\nEles precisam agora derrota-los para poder prosseguir.\nXP: 2500 - GOLD: 1000 - OUTROS: Nada.");
        jTextAreaP40.setWrapStyleWord(true);
        jScrollPane51.setViewportView(jTextAreaP40);

        jLabel106.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel106.setText("30 - Besta");

        jLabel107.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel107.setText("Status: ");

        buttonGroupP16.add(jRadioButtonIncompleta16);
        jRadioButtonIncompleta16.setSelected(true);
        jRadioButtonIncompleta16.setText("Incompleta");

        buttonGroupP16.add(jRadioButtonFracassada16);
        jRadioButtonFracassada16.setText("Fracassada");

        buttonGroupP16.add(jRadioButtonCompletada16);
        jRadioButtonCompletada16.setText("Completada");

        buttonGroupP17.add(jRadioButtonIncompleta17);
        jRadioButtonIncompleta17.setSelected(true);
        jRadioButtonIncompleta17.setText("Incompleta");

        buttonGroupP17.add(jRadioButtonFracassada17);
        jRadioButtonFracassada17.setText("Fracassada");

        buttonGroupP17.add(jRadioButtonCompletada17);
        jRadioButtonCompletada17.setText("Completada");

        buttonGroupP18.add(jRadioButtonIncompleta18);
        jRadioButtonIncompleta18.setSelected(true);
        jRadioButtonIncompleta18.setText("Incompleta");

        buttonGroupP18.add(jRadioButtonFracassada18);
        jRadioButtonFracassada18.setText("Fracassada");

        buttonGroupP18.add(jRadioButtonCompletada18);
        jRadioButtonCompletada18.setText("Completada");

        buttonGroupP19.add(jRadioButtonIncompleta19);
        jRadioButtonIncompleta19.setSelected(true);
        jRadioButtonIncompleta19.setText("Incompleta");

        buttonGroupP19.add(jRadioButtonFracassada19);
        jRadioButtonFracassada19.setText("Fracassada");

        buttonGroupP19.add(jRadioButtonCompletada19);
        jRadioButtonCompletada19.setText("Completada");

        buttonGroupP20.add(jRadioButtonIncompleta20);
        jRadioButtonIncompleta20.setSelected(true);
        jRadioButtonIncompleta20.setText("Incompleta");

        buttonGroupP20.add(jRadioButtonFracassada20);
        jRadioButtonFracassada20.setText("Fracassada");

        buttonGroupP20.add(jRadioButtonCompletada20);
        jRadioButtonCompletada20.setText("Completada");

        buttonGroupP21.add(jRadioButtonCompletada21);
        jRadioButtonCompletada21.setText("Completada");

        buttonGroupP21.add(jRadioButtonFracassada21);
        jRadioButtonFracassada21.setText("Fracassada");

        buttonGroupP21.add(jRadioButtonIncompleta21);
        jRadioButtonIncompleta21.setSelected(true);
        jRadioButtonIncompleta21.setText("Incompleta");

        buttonGroupP22.add(jRadioButtonCompletada22);
        jRadioButtonCompletada22.setText("Completada");

        buttonGroupP22.add(jRadioButtonFracassada22);
        jRadioButtonFracassada22.setText("Fracassada");

        buttonGroupP22.add(jRadioButtonIncompleta22);
        jRadioButtonIncompleta22.setSelected(true);
        jRadioButtonIncompleta22.setText("Incompleta");

        buttonGroupP23.add(jRadioButtonCompletada23);
        jRadioButtonCompletada23.setText("Completada");

        buttonGroupP23.add(jRadioButtonFracassada23);
        jRadioButtonFracassada23.setText("Fracassada");

        buttonGroupP23.add(jRadioButtonIncompleta23);
        jRadioButtonIncompleta23.setSelected(true);
        jRadioButtonIncompleta23.setText("Incompleta");

        buttonGroupP24.add(jRadioButtonCompletada24);
        jRadioButtonCompletada24.setText("Completada");

        buttonGroupP24.add(jRadioButtonFracassada24);
        jRadioButtonFracassada24.setText("Fracassada");

        buttonGroupP24.add(jRadioButtonIncompleta24);
        jRadioButtonIncompleta24.setSelected(true);
        jRadioButtonIncompleta24.setText("Incompleta");

        buttonGroupP25.add(jRadioButtonCompletada25);
        jRadioButtonCompletada25.setText("Completada");

        buttonGroupP25.add(jRadioButtonFracassada25);
        jRadioButtonFracassada25.setText("Fracassada");

        buttonGroupP25.add(jRadioButtonIncompleta25);
        jRadioButtonIncompleta25.setSelected(true);
        jRadioButtonIncompleta25.setText("Incompleta");

        buttonGroupP26.add(jRadioButtonCompletada26);
        jRadioButtonCompletada26.setText("Completada");

        buttonGroupP26.add(jRadioButtonFracassada26);
        jRadioButtonFracassada26.setText("Fracassada");

        buttonGroupP26.add(jRadioButtonIncompleta26);
        jRadioButtonIncompleta26.setSelected(true);
        jRadioButtonIncompleta26.setText("Incompleta");

        buttonGroupP27.add(jRadioButtonCompletada27);
        jRadioButtonCompletada27.setText("Completada");

        buttonGroupP27.add(jRadioButtonFracassada27);
        jRadioButtonFracassada27.setText("Fracassada");

        buttonGroupP27.add(jRadioButtonIncompleta27);
        jRadioButtonIncompleta27.setSelected(true);
        jRadioButtonIncompleta27.setText("Incompleta");

        buttonGroupP28.add(jRadioButtonCompletada28);
        jRadioButtonCompletada28.setText("Completada");

        buttonGroupP28.add(jRadioButtonFracassada28);
        jRadioButtonFracassada28.setText("Fracassada");

        buttonGroupP28.add(jRadioButtonIncompleta28);
        jRadioButtonIncompleta28.setSelected(true);
        jRadioButtonIncompleta28.setText("Incompleta");

        buttonGroupP29.add(jRadioButtonCompletada29);
        jRadioButtonCompletada29.setText("Completada");

        buttonGroupP29.add(jRadioButtonFracassada29);
        jRadioButtonFracassada29.setText("Fracassada");

        buttonGroupP29.add(jRadioButtonIncompleta29);
        jRadioButtonIncompleta29.setSelected(true);
        jRadioButtonIncompleta29.setText("Incompleta");

        buttonGroupP30.add(jRadioButtonCompletada30);
        jRadioButtonCompletada30.setText("Completada");
        jRadioButtonCompletada30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCompletada30ActionPerformed(evt);
            }
        });

        buttonGroupP30.add(jRadioButtonFracassada30);
        jRadioButtonFracassada30.setText("Fracassada");

        buttonGroupP30.add(jRadioButtonIncompleta30);
        jRadioButtonIncompleta30.setSelected(true);
        jRadioButtonIncompleta30.setText("Incompleta");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonFracassada16)
                                    .addComponent(jRadioButtonIncompleta16)
                                    .addComponent(jRadioButtonCompletada16)))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jRadioButtonFracassada17)
                            .addComponent(jRadioButtonIncompleta17)
                            .addComponent(jRadioButtonCompletada17)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83)
                            .addComponent(jRadioButtonFracassada18)
                            .addComponent(jRadioButtonIncompleta18)
                            .addComponent(jRadioButtonCompletada18)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85)
                            .addComponent(jRadioButtonFracassada19)
                            .addComponent(jRadioButtonIncompleta19)
                            .addComponent(jRadioButtonCompletada19)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87)
                            .addComponent(jRadioButtonFracassada20)
                            .addComponent(jRadioButtonIncompleta20)
                            .addComponent(jRadioButtonCompletada20)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel89)
                            .addComponent(jRadioButtonFracassada21)
                            .addComponent(jRadioButtonIncompleta21)
                            .addComponent(jRadioButtonCompletada21)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91)
                            .addComponent(jRadioButtonFracassada22)
                            .addComponent(jRadioButtonIncompleta22)
                            .addComponent(jRadioButtonCompletada22)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel93)
                            .addComponent(jRadioButtonFracassada23)
                            .addComponent(jRadioButtonIncompleta23)
                            .addComponent(jRadioButtonCompletada23)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(jRadioButtonFracassada24)
                            .addComponent(jRadioButtonIncompleta24)
                            .addComponent(jRadioButtonCompletada24)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97)
                            .addComponent(jRadioButtonFracassada25)
                            .addComponent(jRadioButtonIncompleta25)
                            .addComponent(jRadioButtonCompletada25)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99)
                            .addComponent(jRadioButtonFracassada26)
                            .addComponent(jRadioButtonIncompleta26)
                            .addComponent(jRadioButtonCompletada26)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(jRadioButtonFracassada27)
                            .addComponent(jRadioButtonIncompleta27)
                            .addComponent(jRadioButtonCompletada27)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addComponent(jRadioButtonFracassada28)
                            .addComponent(jRadioButtonIncompleta28)
                            .addComponent(jRadioButtonCompletada28)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jRadioButtonFracassada29)
                            .addComponent(jRadioButtonIncompleta29)
                            .addComponent(jRadioButtonCompletada29)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(jRadioButtonFracassada30)
                            .addComponent(jRadioButtonIncompleta30)
                            .addComponent(jRadioButtonCompletada30)))
                    .addComponent(jLabel78)
                    .addComponent(jLabel80)
                    .addComponent(jLabel82)
                    .addComponent(jLabel84)
                    .addComponent(jLabel86)
                    .addComponent(jLabel88)
                    .addComponent(jLabel90)
                    .addComponent(jLabel92)
                    .addComponent(jLabel94)
                    .addComponent(jLabel96)
                    .addComponent(jLabel98)
                    .addComponent(jLabel100)
                    .addComponent(jLabel102)
                    .addComponent(jLabel104)
                    .addComponent(jLabel106))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada16)))
                .addGap(18, 18, 18)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButtonIncompleta18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada18)))
                .addGap(18, 18, 18)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada22)))
                .addGap(18, 18, 18)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada25))
                    .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addGap(5, 5, 5)
                        .addComponent(jRadioButtonIncompleta26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada26))
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada27))
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada28))
                    .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada29))
                    .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada30))
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel24);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Secundárias");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setMaximumSize(new java.awt.Dimension(680, 1350));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(680, 1320));

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel25.setMaximumSize(new java.awt.Dimension(670, 1350));
        jPanel25.setPreferredSize(new java.awt.Dimension(670, 1350));

        jLabel108.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel108.setText("S11 -  Sem humanidade");

        jTextAreaP41.setEditable(false);
        jTextAreaP41.setColumns(20);
        jTextAreaP41.setLineWrap(true);
        jTextAreaP41.setRows(5);
        jTextAreaP41.setText("Extermine de vez as cobaias humanas fracassadas no laboratório da Unreal\nDISPONÍVEL ENTRE AS MISSÕES: 16 apenas.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA\nXP: 800 - GOLD: 100 - OUTROS: +10 de KARMA.");
        jTextAreaP41.setWrapStyleWord(true);
        jScrollPane52.setViewportView(jTextAreaP41);

        jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel109.setText("Status: ");

        jTextAreaP42.setEditable(false);
        jTextAreaP42.setColumns(20);
        jTextAreaP42.setLineWrap(true);
        jTextAreaP42.setRows(5);
        jTextAreaP42.setText("César aproveita que o grupo se encontra no laboratório da Unreal para pedir que os mesmo desative a central de comunicação da Unreal, fazendo seus soldados em Luisidiana ficarem sem comunicação com a base central.\nDISPONÍVEL ENTRE AS MISSÕES: 16 apenas.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA\nXP: 800 - GOLD: 150 - OUTROS: Menos reforços da Unreal em Luisidiana");
        jTextAreaP42.setWrapStyleWord(true);
        jScrollPane53.setViewportView(jTextAreaP42);

        jLabel110.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel110.setText("S12 - Controle ");

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel111.setText("Status: ");

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel112.setText("S13 - Autodestruição");

        jTextAreaP43.setEditable(false);
        jTextAreaP43.setColumns(20);
        jTextAreaP43.setLineWrap(true);
        jTextAreaP43.setRows(5);
        jTextAreaP43.setText("General James avisa ao grupo de que é possível fazer o laboratório se autodestruir se eles chegarem a central de comando do mesmo. Deixando essa como uma escolha opcional ao grupo\nDISPONÍVEL ENTRE AS MISSÕES: 16 apenas.\nXP: 800 - GOLD: 500 - OUTROS: +20 de KARMA/Munição.");
        jTextAreaP43.setWrapStyleWord(true);
        jScrollPane54.setViewportView(jTextAreaP43);

        jLabel113.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel113.setText("Status: ");

        jLabel114.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel114.setText("S14 - Fogo na mata");

        jTextAreaP44.setEditable(false);
        jTextAreaP44.setColumns(20);
        jTextAreaP44.setLineWrap(true);
        jTextAreaP44.setRows(5);
        jTextAreaP44.setText("Ao chegarem na zona florestal, o grupo percebe um fogo vindo de um local próximo.\nAo chegarem no local, o grupo percebe que é um assentamento aliado sendo evacuado.\nDISPONÍVEL ENTRE AS MISSÕES: 17 e 19.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 800 - GOLD: 400 - OUTROS: +10 Componentes (Respectivas classes).");
        jTextAreaP44.setWrapStyleWord(true);
        jScrollPane55.setViewportView(jTextAreaP44);

        jLabel115.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel115.setText("Status: ");

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel116.setText("S15 - Chacal");

        jTextAreaP45.setEditable(false);
        jTextAreaP45.setColumns(20);
        jTextAreaP45.setLineWrap(true);
        jTextAreaP45.setRows(5);
        jTextAreaP45.setText("Enquanto vasculhavam a piramide, o grupo se deparou com uma gata falante, que pede ajuda a eles para eliminar múmias malditas na parte central da piramide\nDISPONÍVEL ENTRE AS MISSÕES: 22 e 23.\nXP: 1000 - GOLD: 1000 - OUTROS: Munição, +1 skill point");
        jTextAreaP45.setWrapStyleWord(true);
        jScrollPane56.setViewportView(jTextAreaP45);

        jLabel117.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel117.setText("Status: ");

        jLabel118.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel118.setText("S16 - Purficação");

        jTextAreaP46.setEditable(false);
        jTextAreaP46.setColumns(20);
        jTextAreaP46.setLineWrap(true);
        jTextAreaP46.setRows(5);
        jTextAreaP46.setText("Após destruirem o laboratório norte e resolverem ir para Kranch, o grupo se deparou com uma pequena fazenda logo no início de de Kranch.\nBarulhos estranhos e gritos vinham de lá, fazeno o grupo ir investigar.\nDISPONÍVEL ENTRE AS MISSÕES: 24 e 25.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -20 de KARMA.\nXP: 1000 - GOLD: 500 - OUTROS: +10 de KARMA/1x SG553-LB.");
        jTextAreaP46.setWrapStyleWord(true);
        jScrollPane57.setViewportView(jTextAreaP46);

        jLabel119.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel119.setText("Status: ");

        jLabel120.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel120.setText("S17 - The Kill Jack");

        jTextAreaP47.setEditable(false);
        jTextAreaP47.setColumns(20);
        jTextAreaP47.setLineWrap(true);
        jTextAreaP47.setRows(5);
        jTextAreaP47.setText("Após se depararem com os cultistas e descobrirem tudo o que acontecia naquela pequena fazenda, o grupo agora conflita contra os Irmãos Jack.\nDISPONÍVEL ENTRE AS MISSÕES: 24 e 25 / Necessário também ter obtido sucesso na missão S16.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -20 de KARMA.\nXP: 1000 - GOLD: 1000 - OUTROS: + 10 Karma / 1x P90 / Registro 02 - Irmãos Jack.");
        jTextAreaP47.setWrapStyleWord(true);
        jScrollPane58.setViewportView(jTextAreaP47);

        jLabel121.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel121.setText("Status: ");

        jLabel122.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel122.setText("S18 - VHS Viral");

        jTextAreaP48.setEditable(false);
        jTextAreaP48.setColumns(20);
        jTextAreaP48.setLineWrap(true);
        jTextAreaP48.setRows(5);
        jTextAreaP48.setText("Durante o conflito com os terroristas na sua própria base, General James pede ao grupo para que eles enviem a ele os dados dos computador central dos cultistas que se encontra na parte superior base terrorista. (os dados são sobre os próprios cultistas).\nDISPONÍVEL ENTRE AS MISSÕES: 25 apenas.\nXP: 1000 - GOLD: 0 - OUTROS: Munição/ 10 Componentes(classe).");
        jTextAreaP48.setWrapStyleWord(true);
        jScrollPane59.setViewportView(jTextAreaP48);

        jLabel123.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel123.setText("Status: ");

        jLabel124.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel124.setText("S19 - Tormento");

        jTextAreaP49.setEditable(false);
        jTextAreaP49.setColumns(20);
        jTextAreaP49.setLineWrap(true);
        jTextAreaP49.setRows(5);
        jTextAreaP49.setText("Libertar a primeira alma do tormento da dor.\nDISPONÍVEL ENTRE AS MISSÕES: 28 em diante.\nXP: 1300 - GOLD: 0 - OUTROS: +10 Karma.");
        jTextAreaP49.setWrapStyleWord(true);
        jScrollPane60.setViewportView(jTextAreaP49);

        jLabel125.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel125.setText("Status: ");

        jLabel126.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel126.setText("S20 - Lobinho da inocência");

        jTextAreaP50.setEditable(false);
        jTextAreaP50.setColumns(20);
        jTextAreaP50.setLineWrap(true);
        jTextAreaP50.setRows(5);
        jTextAreaP50.setText("O grupo se depara novamente com a menininha do ursinho, só que agora naquele local horrível e de perdição. \nEla pede ajuda para encontrar seu lobinho de extimação.\nDISPONÍVEL ENTRE AS MISSÕES: 28 e 29. Necessário também ter\nobtido sucesso na missão S1!\nXP: 1300 - GOLD: 0 - OUTROS: +10 Karma / Registro 04 - The Hunter / Anotações 04 - Os Baroes / +1 skill points");
        jTextAreaP50.setWrapStyleWord(true);
        jScrollPane61.setViewportView(jTextAreaP50);

        jLabel127.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel127.setText("Status: ");

        buttonGroupS11.add(jRadioButtonIncompletaS11);
        jRadioButtonIncompletaS11.setSelected(true);
        jRadioButtonIncompletaS11.setText("Incompleta");

        buttonGroupS11.add(jRadioButtonFracassadaS11);
        jRadioButtonFracassadaS11.setText("Fracassada");

        buttonGroupS11.add(jRadioButtonCompletadaS11);
        jRadioButtonCompletadaS11.setText("Completada");

        buttonGroupS12.add(jRadioButtonIncompletaS12);
        jRadioButtonIncompletaS12.setSelected(true);
        jRadioButtonIncompletaS12.setText("Incompleta");

        buttonGroupS12.add(jRadioButtonFracassadaS12);
        jRadioButtonFracassadaS12.setText("Fracassada");

        buttonGroupS12.add(jRadioButtonCompletadaS12);
        jRadioButtonCompletadaS12.setText("Completada");

        buttonGroupS13.add(jRadioButtonCompletadaS13);
        jRadioButtonCompletadaS13.setText("Completada");

        buttonGroupS13.add(jRadioButtonFracassadaS13);
        jRadioButtonFracassadaS13.setText("Fracassada");

        buttonGroupS13.add(jRadioButtonIncompletaS13);
        jRadioButtonIncompletaS13.setSelected(true);
        jRadioButtonIncompletaS13.setText("Incompleta");

        buttonGroupS14.add(jRadioButtonCompletadaS14);
        jRadioButtonCompletadaS14.setText("Completada");

        buttonGroupS14.add(jRadioButtonFracassadaS14);
        jRadioButtonFracassadaS14.setText("Fracassada");

        buttonGroupS14.add(jRadioButtonIncompletaS14);
        jRadioButtonIncompletaS14.setSelected(true);
        jRadioButtonIncompletaS14.setText("Incompleta");

        buttonGroupS15.add(jRadioButtonCompletadaS15);
        jRadioButtonCompletadaS15.setText("Completada");

        buttonGroupS15.add(jRadioButtonFracassadaS15);
        jRadioButtonFracassadaS15.setText("Fracassada");

        buttonGroupS15.add(jRadioButtonIncompletaS15);
        jRadioButtonIncompletaS15.setSelected(true);
        jRadioButtonIncompletaS15.setText("Incompleta");

        buttonGroupS16.add(jRadioButtonCompletadaS16);
        jRadioButtonCompletadaS16.setText("Completada");

        buttonGroupS16.add(jRadioButtonFracassadaS16);
        jRadioButtonFracassadaS16.setText("Fracassada");

        buttonGroupS16.add(jRadioButtonIncompletaS16);
        jRadioButtonIncompletaS16.setSelected(true);
        jRadioButtonIncompletaS16.setText("Incompleta");

        buttonGroupS17.add(jRadioButtonCompletadaS17);
        jRadioButtonCompletadaS17.setText("Completada");

        buttonGroupS17.add(jRadioButtonFracassadaS17);
        jRadioButtonFracassadaS17.setText("Fracassada");

        buttonGroupS17.add(jRadioButtonIncompletaS17);
        jRadioButtonIncompletaS17.setSelected(true);
        jRadioButtonIncompletaS17.setText("Incompleta");

        buttonGroupS18.add(jRadioButtonCompletadaS18);
        jRadioButtonCompletadaS18.setText("Completada");

        buttonGroupS18.add(jRadioButtonFracassadaS18);
        jRadioButtonFracassadaS18.setText("Fracassada");

        buttonGroupS18.add(jRadioButtonIncompletaS18);
        jRadioButtonIncompletaS18.setSelected(true);
        jRadioButtonIncompletaS18.setText("Incompleta");

        buttonGroupS19.add(jRadioButtonCompletadaS19);
        jRadioButtonCompletadaS19.setText("Completada");

        buttonGroupS19.add(jRadioButtonFracassadaS19);
        jRadioButtonFracassadaS19.setText("Fracassada");

        buttonGroupS19.add(jRadioButtonIncompletaS19);
        jRadioButtonIncompletaS19.setSelected(true);
        jRadioButtonIncompletaS19.setText("Incompleta");

        buttonGroupS20.add(jRadioButtonCompletadaS20);
        jRadioButtonCompletadaS20.setText("Completada");

        buttonGroupS20.add(jRadioButtonFracassadaS20);
        jRadioButtonFracassadaS20.setText("Fracassada");

        buttonGroupS20.add(jRadioButtonIncompletaS20);
        jRadioButtonIncompletaS20.setSelected(true);
        jRadioButtonIncompletaS20.setText("Incompleta");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel109)
                            .addComponent(jRadioButtonIncompletaS11)
                            .addComponent(jRadioButtonFracassadaS11)
                            .addComponent(jRadioButtonCompletadaS11)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111)
                            .addComponent(jRadioButtonIncompletaS12)
                            .addComponent(jRadioButtonFracassadaS12)
                            .addComponent(jRadioButtonCompletadaS12)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113)
                            .addComponent(jRadioButtonIncompletaS13)
                            .addComponent(jRadioButtonFracassadaS13)
                            .addComponent(jRadioButtonCompletadaS13)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(jRadioButtonIncompletaS14)
                            .addComponent(jRadioButtonFracassadaS14)
                            .addComponent(jRadioButtonCompletadaS14)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117)
                            .addComponent(jRadioButtonIncompletaS15)
                            .addComponent(jRadioButtonFracassadaS15)
                            .addComponent(jRadioButtonCompletadaS15)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119)
                            .addComponent(jRadioButtonIncompletaS16)
                            .addComponent(jRadioButtonFracassadaS16)
                            .addComponent(jRadioButtonCompletadaS16)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121)
                            .addComponent(jRadioButtonIncompletaS17)
                            .addComponent(jRadioButtonFracassadaS17)
                            .addComponent(jRadioButtonCompletadaS17)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123)
                            .addComponent(jRadioButtonIncompletaS18)
                            .addComponent(jRadioButtonFracassadaS18)
                            .addComponent(jRadioButtonCompletadaS18)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel125)
                            .addComponent(jRadioButtonIncompletaS19)
                            .addComponent(jRadioButtonFracassadaS19)
                            .addComponent(jRadioButtonCompletadaS19)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel127)
                            .addComponent(jRadioButtonIncompletaS20)
                            .addComponent(jRadioButtonFracassadaS20)
                            .addComponent(jRadioButtonCompletadaS20)))
                    .addComponent(jLabel108)
                    .addComponent(jLabel110)
                    .addComponent(jLabel112)
                    .addComponent(jLabel114)
                    .addComponent(jLabel116)
                    .addComponent(jLabel118)
                    .addComponent(jLabel120)
                    .addComponent(jLabel122)
                    .addComponent(jLabel124)
                    .addComponent(jLabel126))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS20))
                    .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel25);

        javax.swing.GroupLayout jPanelCAP2Layout = new javax.swing.GroupLayout(jPanelCAP2);
        jPanelCAP2.setLayout(jPanelCAP2Layout);
        jPanelCAP2Layout.setHorizontalGroup(
            jPanelCAP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelCAP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCAP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        jPanelCAP2Layout.setVerticalGroup(
            jPanelCAP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCAP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel27))
                .addGroup(jPanelCAP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCAP2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCAP2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPaneCap2.setViewportView(jPanelCAP2);

        jTabbedPane1.addTab("Capítulo 02", jScrollPaneCap2);

        jPanelCAP3.setPreferredSize(Tela.telaFull());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Primárias");

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setMaximumSize(new java.awt.Dimension(700, 1940));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(630, 1940));

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel27.setMaximumSize(new java.awt.Dimension(650, 1955));
        jPanel27.setPreferredSize(new java.awt.Dimension(650, 1955));

        jLabel176.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel176.setText("31 - Eclipse");

        jTextAreaP66.setEditable(false);
        jTextAreaP66.setColumns(20);
        jTextAreaP66.setLineWrap(true);
        jTextAreaP66.setRows(5);
        jTextAreaP66.setText("Ao conseguirem fugir do inferno da dor, o grupo retorna a Kranch, mas ela está diferente. Não há mais sol, a cidade está totalmente escura e está nevando, além disso, há um enorme espécie de eclipse vemelhor no céu.\nGeneral James pede para que o grupo fuja de lá com urgência para uma base da B.H.C em Kranch.\nXP: 2500 - GOLD: 0 - OUTROS: L96-AWM.");
        jTextAreaP66.setWrapStyleWord(true);
        jScrollPane77.setViewportView(jTextAreaP66);

        jLabel177.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel177.setText("Status: ");

        jLabel178.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel178.setText("32 - Sempre pode piorar");

        jTextAreaP67.setEditable(false);
        jTextAreaP67.setColumns(20);
        jTextAreaP67.setLineWrap(true);
        jTextAreaP67.setRows(5);
        jTextAreaP67.setText("General James pede para que o grupo se dirija até o centro urbano de Kranch a bordo do Carrie Truck e resgate os sobreviventes remanescente.\nXP: 2500 - GOLD: 0 - OUTROS: Munição / 3 Pílulas - M.");
        jTextAreaP67.setWrapStyleWord(true);
        jScrollPane78.setViewportView(jTextAreaP67);

        jLabel179.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel179.setText("Status: ");

        jLabel180.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel180.setText("33 - Sofrimento interior");

        jTextAreaP68.setEditable(false);
        jTextAreaP68.setColumns(20);
        jTextAreaP68.setLineWrap(true);
        jTextAreaP68.setRows(5);
        jTextAreaP68.setText("Após salvarem as pessoas, o grupo se depara livre naquela cidade obscura. General James diz que logo entrará em contato.\nExplore, caçe, ajude e sobreviva! Lembre-se que suas escolhas trazem consequências! Entre em contato com o general James para prosseguir.\nXP: 0 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP68.setWrapStyleWord(true);
        jScrollPane79.setViewportView(jTextAreaP68);

        jLabel181.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel181.setText("Status: ");

        jLabel182.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel182.setText("34 - Roma em chamas");

        jTextAreaP69.setEditable(false);
        jTextAreaP69.setColumns(20);
        jTextAreaP69.setLineWrap(true);
        jTextAreaP69.setRows(5);
        jTextAreaP69.setText("Antes mesmo de James retornar contato, César, pede para que todos os membros de Roma retornem imediatamente até ela para ajudar a defende-la. O grupo deve retornar a Luisidiana\nXP: 3000 - GOLD: 300 - OUTROS: Munição / 10 Componentes(Classe).");
        jTextAreaP69.setWrapStyleWord(true);
        jScrollPane80.setViewportView(jTextAreaP69);

        jLabel183.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel183.setText("Status: ");

        jLabel184.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel184.setText("35 - Infiltração inrreal");

        jTextAreaP70.setEditable(false);
        jTextAreaP70.setColumns(20);
        jTextAreaP70.setLineWrap(true);
        jTextAreaP70.setRows(5);
        jTextAreaP70.setText("Enquanto defendiam os portões dos infectados, agentes da Unreal desembarcaram dentro da própria cidade usando seus helicópteros. O grupo precisa agora eliminar a ameaça maior \nXP: 3000 - GOLD: 500 - OUTROS: Munição / 2 sprays de primeiros socorros / 20 Componentes (Classe) / 1 Pílula - M (para cada player).");
        jTextAreaP70.setWrapStyleWord(true);
        jScrollPane81.setViewportView(jTextAreaP70);

        jLabel185.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel185.setText("Status: ");

        jLabel186.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel186.setText("36 - A.Q.K");

        jTextAreaP71.setEditable(false);
        jTextAreaP71.setColumns(20);
        jTextAreaP71.setLineWrap(true);
        jTextAreaP71.setRows(5);
        jTextAreaP71.setText("Após repelirem grande parte dos agentes da Unreal, a Unreal envia o seu esquadrão de elite, o A.Q.K (Advanced Quick Kill), que desembarca em cima do prédio central de Roma.\nO grupo precisa agora ir atrás de César lá dentro.\nXP: 3000 - GOLD: 500 - OUTROS: Nada.\n");
        jTextAreaP71.setWrapStyleWord(true);
        jScrollPane82.setViewportView(jTextAreaP71);

        jLabel187.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel187.setText("Status: ");

        jLabel188.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel188.setText("37 - Fúria Infernal");

        jTextAreaP72.setEditable(false);
        jTextAreaP72.setColumns(20);
        jTextAreaP72.setLineWrap(true);
        jTextAreaP72.setRows(5);
        jTextAreaP72.setText("O grupo consegue salvar a vida de César, mas a A.Q.K conseguiu cumprir seu objetivo. Destruir toda a pesquisa e fonte de comunicação de Roma. Mas antes que pudessem comemorar, uma ruptura infernal se abre nos portões de Roma.\nO grupo com o auxílio de um esquadrão precisa agora adentrar o inferno da dor para matar o que está causando a ruptura.\nXP: 3000 - GOLD: 500 - OUTROS: 1x UMP 45.\n");
        jTextAreaP72.setWrapStyleWord(true);
        jScrollPane83.setViewportView(jTextAreaP72);

        jLabel189.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel189.setText("Status: ");

        jLabel190.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel190.setText("38 - Sombra Infernal");

        jTextAreaP73.setEditable(false);
        jTextAreaP73.setColumns(20);
        jTextAreaP73.setLineWrap(true);
        jTextAreaP73.setRows(5);
        jTextAreaP73.setText("Após chegar ao centro da essência que causava aquela ruptura, o grupo se depara com um Barão Infernal sentado no trono. Por sorte (ou azar), uma nova ruptura se abre levando o grupo ao inferno da solidão. Agora o grupo precisa achar a nova essência da ruptura para destruí-la\n\nXP: 3000 - GOLD: 500 - OUTROS: Nada.");
        jTextAreaP73.setWrapStyleWord(true);
        jScrollPane84.setViewportView(jTextAreaP73);

        jLabel191.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel191.setText("Status: ");

        jLabel192.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel192.setText("39 - Ghost");

        jTextAreaP74.setEditable(false);
        jTextAreaP74.setColumns(20);
        jTextAreaP74.setLineWrap(true);
        jTextAreaP74.setRows(5);
        jTextAreaP74.setText("O grupo chega ao centro da nova essência rupturial em um prédio escuro no inferno da solidão e se depara com o Ghost, um inimigo extremamente poderoso. O grupo precisa agora derrota-lo e acabar de vez com a essência rupturial.\n\nXP: 3500 - GOLD: 1000 - OUTROS: RPG-7.");
        jTextAreaP74.setWrapStyleWord(true);
        jScrollPane85.setViewportView(jTextAreaP74);

        jLabel193.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel193.setText("Status: ");

        jLabel194.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel194.setText("40 -  Conflito pessoal...");

        jTextAreaP75.setEditable(false);
        jTextAreaP75.setColumns(20);
        jTextAreaP75.setLineWrap(true);
        jTextAreaP75.setRows(5);
        jTextAreaP75.setText("Após derrotarem Ghost e destruirem a essência rupturial. O grupo desce o prédio, mas ao sair, cada um vai parar no seu próprio inferno pessoal para conflitar seus medos, e seu passado\nXP: 3500 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP75.setWrapStyleWord(true);
        jScrollPane86.setViewportView(jTextAreaP75);

        jLabel195.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel195.setText("Status: ");

        jLabel196.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel196.setText("41 - ... Por perdão");

        jTextAreaP76.setEditable(false);
        jTextAreaP76.setColumns(20);
        jTextAreaP76.setLineWrap(true);
        jTextAreaP76.setRows(5);
        jTextAreaP76.setText("Conseguindo conflitar seus medos, o grupo precisa agora conflitar seu passado e achar uma forma de se perdoar por algo que fizeram no seu passado.\nXP: 3500 - GOLD: 0 - OUTROS: +100 Karma.");
        jTextAreaP76.setWrapStyleWord(true);
        jScrollPane87.setViewportView(jTextAreaP76);

        jLabel197.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel197.setText("Status: ");

        jLabel198.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel198.setText("42 - B.H.C");

        jTextAreaP77.setEditable(false);
        jTextAreaP77.setColumns(20);
        jTextAreaP77.setLineWrap(true);
        jTextAreaP77.setRows(5);
        jTextAreaP77.setText("Ao por fim se perdoarem e voltarem a Roma, o grupo se depara com uma guarnição de soldados da B.H.C. O grupo ruma até a sala de César, onde lá conversarão com ele e James sobre uma investida da B.H.C. \nXP: 3500 - GOLD: 0 - OUTROS: Munição / 3 - Pílula - P/ 1 pílua - M / 20 Componentes (classe)[Pra cada] / 1x G36C.");
        jTextAreaP77.setWrapStyleWord(true);
        jScrollPane88.setViewportView(jTextAreaP77);

        jLabel199.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel199.setText("Status: ");

        jLabel200.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel200.setText("43 - Homefront");

        jTextAreaP78.setEditable(false);
        jTextAreaP78.setColumns(20);
        jTextAreaP78.setLineWrap(true);
        jTextAreaP78.setRows(5);
        jTextAreaP78.setText("O grupo em conjunto com a B.H.C e algumas forças militares de Roma, devem realizar um ataque contra o portão principal do prédio Geral da Unreal com a esperança de adentrar o seu laboratório geral subterrâneo. James avisa que iria pesquisar outra possível entrada enquanto isso.\nXP: 3500 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP78.setWrapStyleWord(true);
        jScrollPane89.setViewportView(jTextAreaP78);

        jLabel201.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel201.setText("Status: ");

        jLabel202.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel202.setText("44 - Contorno");

        jTextAreaP79.setEditable(false);
        jTextAreaP79.setColumns(20);
        jTextAreaP79.setLineWrap(true);
        jTextAreaP79.setRows(5);
        jTextAreaP79.setText("Conforme a luta no portão norte ia ficando mais díficil, ainda mais com o barulho atraindo os infectados. James avisa ao grupo que descobriu uma possível entrada contornando pelo subsolo de uma loja ali perto.\nXP: 3500 - GOLD: 1000 - OUTROS: Munição.");
        jTextAreaP79.setWrapStyleWord(true);
        jScrollPane90.setViewportView(jTextAreaP79);

        jLabel203.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel203.setText("Status: ");

        jTextAreaP80.setEditable(false);
        jTextAreaP80.setColumns(20);
        jTextAreaP80.setLineWrap(true);
        jTextAreaP80.setRows(5);
        jTextAreaP80.setText("O grupo conseguiu com sucesso obter acesso à porta sul do laboratório geral da Unreal. Porém se depararam com os Beta do esquadrão A.Q.K...\nXP: 4000 - GOLD: 1500 - OUTROS: 1x USAS12 / 1x PP19.");
        jTextAreaP80.setWrapStyleWord(true);
        jScrollPane91.setViewportView(jTextAreaP80);

        jLabel204.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel204.setText("45 - Beta");

        jLabel205.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel205.setText("Status: ");

        buttonGroupP31.add(jRadioButtonIncompleta31);
        jRadioButtonIncompleta31.setSelected(true);
        jRadioButtonIncompleta31.setText("Incompleta");

        buttonGroupP31.add(jRadioButtonFracassada31);
        jRadioButtonFracassada31.setText("Fracassada");

        buttonGroupP31.add(jRadioButtonCompletada31);
        jRadioButtonCompletada31.setText("Completada");

        buttonGroupP32.add(jRadioButtonCompletada32);
        jRadioButtonCompletada32.setText("Completada");

        buttonGroupP32.add(jRadioButtonFracassada32);
        jRadioButtonFracassada32.setText("Fracassada");

        buttonGroupP32.add(jRadioButtonIncompleta32);
        jRadioButtonIncompleta32.setSelected(true);
        jRadioButtonIncompleta32.setText("Incompleta");

        buttonGroupP33.add(jRadioButtonCompletada33);
        jRadioButtonCompletada33.setText("Completada");

        buttonGroupP33.add(jRadioButtonFracassada33);
        jRadioButtonFracassada33.setText("Fracassada");

        buttonGroupP33.add(jRadioButtonIncompleta33);
        jRadioButtonIncompleta33.setSelected(true);
        jRadioButtonIncompleta33.setText("Incompleta");

        buttonGroupP34.add(jRadioButtonCompletada34);
        jRadioButtonCompletada34.setText("Completada");

        buttonGroupP34.add(jRadioButtonFracassada34);
        jRadioButtonFracassada34.setText("Fracassada");

        buttonGroupP34.add(jRadioButtonIncompleta34);
        jRadioButtonIncompleta34.setSelected(true);
        jRadioButtonIncompleta34.setText("Incompleta");

        buttonGroupP35.add(jRadioButtonCompletada35);
        jRadioButtonCompletada35.setText("Completada");

        buttonGroupP35.add(jRadioButtonFracassada35);
        jRadioButtonFracassada35.setText("Fracassada");

        buttonGroupP35.add(jRadioButtonIncompleta35);
        jRadioButtonIncompleta35.setSelected(true);
        jRadioButtonIncompleta35.setText("Incompleta");

        buttonGroupP36.add(jRadioButtonCompletada36);
        jRadioButtonCompletada36.setText("Completada");

        buttonGroupP36.add(jRadioButtonFracassada36);
        jRadioButtonFracassada36.setText("Fracassada");

        buttonGroupP36.add(jRadioButtonIncompleta36);
        jRadioButtonIncompleta36.setSelected(true);
        jRadioButtonIncompleta36.setText("Incompleta");

        buttonGroupP37.add(jRadioButtonCompletada37);
        jRadioButtonCompletada37.setText("Completada");

        buttonGroupP37.add(jRadioButtonFracassada37);
        jRadioButtonFracassada37.setText("Fracassada");

        buttonGroupP37.add(jRadioButtonIncompleta37);
        jRadioButtonIncompleta37.setSelected(true);
        jRadioButtonIncompleta37.setText("Incompleta");

        buttonGroupP38.add(jRadioButtonCompletada38);
        jRadioButtonCompletada38.setText("Completada");

        buttonGroupP38.add(jRadioButtonFracassada38);
        jRadioButtonFracassada38.setText("Fracassada");

        buttonGroupP38.add(jRadioButtonIncompleta38);
        jRadioButtonIncompleta38.setSelected(true);
        jRadioButtonIncompleta38.setText("Incompleta");

        buttonGroupP39.add(jRadioButtonCompletada39);
        jRadioButtonCompletada39.setText("Completada");

        buttonGroupP39.add(jRadioButtonFracassada39);
        jRadioButtonFracassada39.setText("Fracassada");

        buttonGroupP39.add(jRadioButtonIncompleta39);
        jRadioButtonIncompleta39.setSelected(true);
        jRadioButtonIncompleta39.setText("Incompleta");

        buttonGroupP40.add(jRadioButtonCompletada40);
        jRadioButtonCompletada40.setText("Completada");

        buttonGroupP40.add(jRadioButtonFracassada40);
        jRadioButtonFracassada40.setText("Fracassada");

        buttonGroupP40.add(jRadioButtonIncompleta40);
        jRadioButtonIncompleta40.setSelected(true);
        jRadioButtonIncompleta40.setText("Incompleta");

        buttonGroupP41.add(jRadioButtonCompletada41);
        jRadioButtonCompletada41.setText("Completada");

        buttonGroupP41.add(jRadioButtonFracassada41);
        jRadioButtonFracassada41.setText("Fracassada");

        buttonGroupP41.add(jRadioButtonIncompleta41);
        jRadioButtonIncompleta41.setSelected(true);
        jRadioButtonIncompleta41.setText("Incompleta");

        buttonGroupP42.add(jRadioButtonCompletada42);
        jRadioButtonCompletada42.setText("Completada");

        buttonGroupP42.add(jRadioButtonFracassada42);
        jRadioButtonFracassada42.setText("Fracassada");

        buttonGroupP42.add(jRadioButtonIncompleta42);
        jRadioButtonIncompleta42.setSelected(true);
        jRadioButtonIncompleta42.setText("Incompleta");

        buttonGroupP43.add(jRadioButtonCompletada43);
        jRadioButtonCompletada43.setText("Completada");

        buttonGroupP43.add(jRadioButtonFracassada43);
        jRadioButtonFracassada43.setText("Fracassada");

        buttonGroupP43.add(jRadioButtonIncompleta43);
        jRadioButtonIncompleta43.setSelected(true);
        jRadioButtonIncompleta43.setText("Incompleta");

        buttonGroupP44.add(jRadioButtonCompletada44);
        jRadioButtonCompletada44.setText("Completada");

        buttonGroupP44.add(jRadioButtonFracassada44);
        jRadioButtonFracassada44.setText("Fracassada");

        buttonGroupP44.add(jRadioButtonIncompleta44);
        jRadioButtonIncompleta44.setSelected(true);
        jRadioButtonIncompleta44.setText("Incompleta");

        buttonGroupP45.add(jRadioButtonCompletada45);
        jRadioButtonCompletada45.setText("Completada");
        jRadioButtonCompletada45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCompletada45ActionPerformed(evt);
            }
        });

        buttonGroupP45.add(jRadioButtonFracassada45);
        jRadioButtonFracassada45.setText("Fracassada");

        buttonGroupP45.add(jRadioButtonIncompleta45);
        jRadioButtonIncompleta45.setSelected(true);
        jRadioButtonIncompleta45.setText("Incompleta");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel177)
                            .addComponent(jRadioButtonIncompleta31)
                            .addComponent(jRadioButtonFracassada31)
                            .addComponent(jRadioButtonCompletada31)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel179)
                            .addComponent(jRadioButtonIncompleta32)
                            .addComponent(jRadioButtonFracassada32)
                            .addComponent(jRadioButtonCompletada32)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel181)
                            .addComponent(jRadioButtonIncompleta33)
                            .addComponent(jRadioButtonFracassada33)
                            .addComponent(jRadioButtonCompletada33)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel183)
                            .addComponent(jRadioButtonIncompleta34)
                            .addComponent(jRadioButtonFracassada34)
                            .addComponent(jRadioButtonCompletada34)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane81, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel185)
                            .addComponent(jRadioButtonIncompleta35)
                            .addComponent(jRadioButtonFracassada35)
                            .addComponent(jRadioButtonCompletada35)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel187)
                            .addComponent(jRadioButtonIncompleta36)
                            .addComponent(jRadioButtonFracassada36)
                            .addComponent(jRadioButtonCompletada36)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel189)
                            .addComponent(jRadioButtonIncompleta37)
                            .addComponent(jRadioButtonFracassada37)
                            .addComponent(jRadioButtonCompletada37)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel191)
                            .addComponent(jRadioButtonIncompleta38)
                            .addComponent(jRadioButtonFracassada38)
                            .addComponent(jRadioButtonCompletada38)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel193)
                            .addComponent(jRadioButtonIncompleta39)
                            .addComponent(jRadioButtonFracassada39)
                            .addComponent(jRadioButtonCompletada39)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane86, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel195)
                            .addComponent(jRadioButtonIncompleta40)
                            .addComponent(jRadioButtonFracassada40)
                            .addComponent(jRadioButtonCompletada40)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane87, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel197)
                            .addComponent(jRadioButtonIncompleta41)
                            .addComponent(jRadioButtonFracassada41)
                            .addComponent(jRadioButtonCompletada41)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane88, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel199)
                            .addComponent(jRadioButtonIncompleta42)
                            .addComponent(jRadioButtonFracassada42)
                            .addComponent(jRadioButtonCompletada42)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane89, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel201)
                            .addComponent(jRadioButtonIncompleta43)
                            .addComponent(jRadioButtonFracassada43)
                            .addComponent(jRadioButtonCompletada43)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane90, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel203)
                            .addComponent(jRadioButtonIncompleta44)
                            .addComponent(jRadioButtonFracassada44)
                            .addComponent(jRadioButtonCompletada44)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane91, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel205)
                            .addComponent(jRadioButtonIncompleta45)
                            .addComponent(jRadioButtonFracassada45)
                            .addComponent(jRadioButtonCompletada45)))
                    .addComponent(jLabel176)
                    .addComponent(jLabel178)
                    .addComponent(jLabel180)
                    .addComponent(jLabel182)
                    .addComponent(jLabel184)
                    .addComponent(jLabel186)
                    .addComponent(jLabel188)
                    .addComponent(jLabel190)
                    .addComponent(jLabel192)
                    .addComponent(jLabel194)
                    .addComponent(jLabel196)
                    .addComponent(jLabel198)
                    .addComponent(jLabel200)
                    .addComponent(jLabel202)
                    .addComponent(jLabel204))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada31)))
                .addGap(18, 18, 18)
                .addComponent(jLabel178)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel179)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel180)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel181)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonIncompleta33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada33)))
                .addGap(18, 18, 18)
                .addComponent(jLabel182)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel183)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel184)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel185)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel186)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel187)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel188)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel189)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada37)))
                .addGap(18, 18, 18)
                .addComponent(jLabel190)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel191)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel192)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel194)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel195)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada40))
                    .addComponent(jScrollPane86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel196)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel197)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada41))
                    .addComponent(jScrollPane87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel198)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel199)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada42))
                    .addComponent(jScrollPane88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel200)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel201)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada43))
                    .addComponent(jScrollPane89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel202)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel203)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada44))
                    .addComponent(jScrollPane90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel204)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel205)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada45))
                    .addComponent(jScrollPane91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel27);

        jLabel206.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel206.setText("Secundárias");

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setMaximumSize(new java.awt.Dimension(680, 1350));
        jScrollPane7.setPreferredSize(new java.awt.Dimension(680, 1320));

        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel28.setMaximumSize(new java.awt.Dimension(670, 1350));
        jPanel28.setPreferredSize(new java.awt.Dimension(670, 1350));

        jLabel207.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel207.setText("S21 -  Evolução");

        jTextAreaP81.setEditable(false);
        jTextAreaP81.setColumns(20);
        jTextAreaP81.setLineWrap(true);
        jTextAreaP81.setRows(5);
        jTextAreaP81.setText("Um dos sobreviventes na base da B.H.C afirma que seria útil para sua pesquisa conseguir o corpo de dois infectados aprimorados, consiga para ele!\nDISPONÍVEL ENTRE AS MISSÕES: 33 e 34.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA\nXP: 1500 - GOLD: 300 - OUTROS: Munição / Descobrir todas as vantagens e desvantagens sobre o Infectado Aprimorado.");
        jTextAreaP81.setWrapStyleWord(true);
        jScrollPane92.setViewportView(jTextAreaP81);

        jLabel208.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel208.setText("Status: ");

        jTextAreaP82.setEditable(false);
        jTextAreaP82.setColumns(20);
        jTextAreaP82.setLineWrap(true);
        jTextAreaP82.setRows(5);
        jTextAreaP82.setText("Uma das sobreviventes na base da B.H.C pede para que o grupo lide com um grupo de mercenários que havia invadido sua casa, estuprado e matado sua filha de 10 aninhos.\nDISPONÍVEL ENTRE AS MISSÕES: 33 e 34.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA\nXP: 1500 - GOLD: 500 - OUTROS: +20 de Karma / 1x Katana");
        jTextAreaP82.setWrapStyleWord(true);
        jScrollPane93.setViewportView(jTextAreaP82);

        jLabel209.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel209.setText("S22 - Mercy");

        jLabel210.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel210.setText("Status: ");

        jLabel211.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel211.setText("S23 - No escuro");

        jTextAreaP83.setEditable(false);
        jTextAreaP83.setColumns(20);
        jTextAreaP83.setLineWrap(true);
        jTextAreaP83.setRows(5);
        jTextAreaP83.setText("Um dos sobreviventes avisa ao grupo de que é possível aumentar as luzes, não só do centro urbano de Kranch, mas da base da B.H.C ali. Para isso o grupo precisava ir até o centro de distribuição de energia e redirecionar a rede elétrica.\nDISPONÍVEL ENTRE AS MISSÕES: 33 e 34.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA / Mais ataques de infectados aos abrigos e assentamentos.\nXP: 1500 - GOLD: 300 - OUTROS: +10 de KARMA/ 1x pílula - G [Para cada] / Menos ataques de infectados aos abrigos e assentamentos.");
        jTextAreaP83.setWrapStyleWord(true);
        jScrollPane94.setViewportView(jTextAreaP83);

        jLabel212.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel212.setText("Status: ");

        jLabel213.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel213.setText("S24 - Salém");

        jTextAreaP84.setEditable(false);
        jTextAreaP84.setColumns(20);
        jTextAreaP84.setLineWrap(true);
        jTextAreaP84.setRows(5);
        jTextAreaP84.setText("Um dos sobreviventes avisa ao grupo sobre um grupo de mulheres loucas que sacrificavam homens e crianças do sexo masculino dando como comida aos infectados.\nDISPONÍVEL ENTRE AS MISSÕES: 33 e 34.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -20 de KARMA.\nXP: 1500 - GOLD: 300 - OUTROS: +10 de KARMA/ 1x Colt 1911");
        jTextAreaP84.setWrapStyleWord(true);
        jScrollPane95.setViewportView(jTextAreaP84);

        jLabel214.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel214.setText("Status: ");

        jLabel215.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel215.setText("S25 -  O mistério");

        jTextAreaP85.setEditable(false);
        jTextAreaP85.setColumns(20);
        jTextAreaP85.setLineWrap(true);
        jTextAreaP85.setRows(5);
        jTextAreaP85.setText("O grupo se depara com um cultista tremendo de medo em um beco da cidade. Ao ser confrontado, ele afirma que não sabia que \"era real\" e que pra ele não passava de uma \"brincadeira\". O grupo sem entender muito continua confrontando até ele revelar que falava sobre o Homem misterioso. Após isso ele diz que se o grupo quiser, poderia saber mais voltando ao rancho dos cultistas.\nDISPONÍVEL ENTRE AS MISSÕES: 33 e 34.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 1500 - GOLD: 0 - OUTROS: 10x Componentes(classe) / Arquivo 00 - Diario do Homem Misterioso");
        jTextAreaP85.setWrapStyleWord(true);
        jScrollPane96.setViewportView(jTextAreaP85);

        jLabel216.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel216.setText("Status: ");

        jLabel217.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel217.setText("S26 - Cuidados Intensivos");

        jTextAreaP86.setEditable(false);
        jTextAreaP86.setColumns(20);
        jTextAreaP86.setLineWrap(true);
        jTextAreaP86.setRows(5);
        jTextAreaP86.setText("James e César pediram um tempo para preparar suas tropas, mas outras pessoas tem tarefas para você, ao começar por Katie. Ela afirma estar com baixos suprimentos médicos e que o hospital central de Luisidana já não é mais víavel, fazendo com que o grupo tenha que ir ao hospital do sul de Luisidiana em busca de tais suprimentos\nDISPONÍVEL ENTRE AS MISSÕES: 42 apenas.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 2000 - GOLD: 200 - OUTROS: +10 de KARMA/1x Vacina de cura - M [para cada] / 3x Vacinas anti-infecção.");
        jTextAreaP86.setWrapStyleWord(true);
        jScrollPane97.setViewportView(jTextAreaP86);

        jLabel218.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel218.setText("Status: ");

        jLabel219.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel219.setText("S27 - Derrubada");

        jTextAreaP87.setEditable(false);
        jTextAreaP87.setColumns(20);
        jTextAreaP87.setLineWrap(true);
        jTextAreaP87.setRows(5);
        jTextAreaP87.setText("Major Luke diz ao grupo que precisa da ajuda deles com sua operação de derrubar prédios próximos para criar obstruções.\nO grupo deve pôr C4 na base de quatro prédios próximos a Roma\nDISPONÍVEL ENTRE AS MISSÕES: 42 Apenas.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 2000 - GOLD: 300 - OUTROS: + 10 Karma / 1x M249.");
        jTextAreaP87.setWrapStyleWord(true);
        jScrollPane98.setViewportView(jTextAreaP87);

        jLabel220.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel220.setText("Status: ");

        jLabel221.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel221.setText("S28 - Armamento pesado");

        jTextAreaP88.setEditable(false);
        jTextAreaP88.setColumns(20);
        jTextAreaP88.setLineWrap(true);
        jTextAreaP88.setRows(5);
        jTextAreaP88.setText("Suzie afirma que é perca de tempo pensar só em defesa e que o grupo precisa ajuda-la a conseguir as armas do centro militar ao sul de Luisidana para ajudar na investida.\nDISPONÍVEL ENTRE AS MISSÕES: 42 Apenas.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 2000 - GOLD: 300 - OUTROS: + 10 Karma / Soldados melhores equipados para a investida / Munição / RPG-7");
        jTextAreaP88.setWrapStyleWord(true);
        jScrollPane99.setViewportView(jTextAreaP88);

        jLabel222.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel222.setText("Status: ");

        jLabel223.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel223.setText("S29 - Reforço veícular");

        jTextAreaP89.setEditable(false);
        jTextAreaP89.setColumns(20);
        jTextAreaP89.setLineWrap(true);
        jTextAreaP89.setRows(5);
        jTextAreaP89.setText("Rodrigo pede ao grupo para que tragam peças e metal para que possa reparar e reforçar os veículos para a investida.\nDISPONÍVEL ENTRE AS MISSÕES: 42 Apenas.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 2000 - GOLD: 300 - OUTROS: + 10 Karma / Melhores veículos disponíveis para o grupo além do reforço para os veículos na investida");
        jTextAreaP89.setWrapStyleWord(true);
        jScrollPane100.setViewportView(jTextAreaP89);

        jLabel224.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel224.setText("Status: ");

        jLabel225.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel225.setText("S30 - Lillian Turner");

        jTextAreaP90.setEditable(false);
        jTextAreaP90.setColumns(20);
        jTextAreaP90.setLineWrap(true);
        jTextAreaP90.setRows(5);
        jTextAreaP90.setText("Lillian Turner pede para que o grupo investigue o que aconteceu com o seu marido (Marcus Turner) uma vez dentro do laboratório geral da Unreal fornecendo uma cartão de acesso exclusivo a algo.\nDISPONÍVEL ENTRE AS MISSÕES: 42 Apenas.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 0 - GOLD: 0 - OUTROS: Cartão de acesso a uma parte importante no laboratório da Unreal.");
        jTextAreaP90.setWrapStyleWord(true);
        jScrollPane101.setViewportView(jTextAreaP90);

        jLabel226.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel226.setText("Status: ");

        buttonGroupS21.add(jRadioButtonIncompletaS21);
        jRadioButtonIncompletaS21.setText("Incompleta");

        buttonGroupS21.add(jRadioButtonFracassadaS21);
        jRadioButtonFracassadaS21.setText("Fracassada");

        buttonGroupS21.add(jRadioButtonCompletadaS21);
        jRadioButtonCompletadaS21.setText("Completada");

        buttonGroupS22.add(jRadioButtonIncompletaS22);
        jRadioButtonIncompletaS22.setText("Incompleta");

        buttonGroupS22.add(jRadioButtonFracassadaS22);
        jRadioButtonFracassadaS22.setText("Fracassada");

        buttonGroupS22.add(jRadioButtonCompletadaS22);
        jRadioButtonCompletadaS22.setText("Completada");

        buttonGroupS23.add(jRadioButtonIncompletaS23);
        jRadioButtonIncompletaS23.setText("Incompleta");

        buttonGroupS23.add(jRadioButtonFracassadaS23);
        jRadioButtonFracassadaS23.setText("Fracassada");

        buttonGroupS23.add(jRadioButtonCompletadaS23);
        jRadioButtonCompletadaS23.setText("Completada");

        buttonGroupS24.add(jRadioButtonIncompletaS24);
        jRadioButtonIncompletaS24.setText("Incompleta");

        buttonGroupS24.add(jRadioButtonFracassadaS24);
        jRadioButtonFracassadaS24.setText("Fracassada");

        buttonGroupS24.add(jRadioButtonCompletadaS24);
        jRadioButtonCompletadaS24.setText("Completada");

        buttonGroupS25.add(jRadioButtonIncompletaS25);
        jRadioButtonIncompletaS25.setText("Incompleta");

        buttonGroupS25.add(jRadioButtonFracassadaS25);
        jRadioButtonFracassadaS25.setText("Fracassada");

        buttonGroupS25.add(jRadioButtonCompletadaS25);
        jRadioButtonCompletadaS25.setText("Completada");

        buttonGroupS26.add(jRadioButtonIncompletaS26);
        jRadioButtonIncompletaS26.setText("Incompleta");

        buttonGroupS26.add(jRadioButtonFracassadaS26);
        jRadioButtonFracassadaS26.setText("Fracassada");

        buttonGroupS26.add(jRadioButtonCompletadaS26);
        jRadioButtonCompletadaS26.setText("Completada");

        buttonGroupS27.add(jRadioButtonIncompletaS27);
        jRadioButtonIncompletaS27.setText("Incompleta");

        buttonGroupS27.add(jRadioButtonFracassadaS27);
        jRadioButtonFracassadaS27.setText("Fracassada");

        buttonGroupS27.add(jRadioButtonCompletadaS27);
        jRadioButtonCompletadaS27.setText("Completada");

        buttonGroupS28.add(jRadioButtonIncompletaS28);
        jRadioButtonIncompletaS28.setText("Incompleta");

        buttonGroupS28.add(jRadioButtonFracassadaS28);
        jRadioButtonFracassadaS28.setText("Fracassada");

        buttonGroupS28.add(jRadioButtonCompletadaS28);
        jRadioButtonCompletadaS28.setText("Completada");

        buttonGroupS29.add(jRadioButtonIncompletaS29);
        jRadioButtonIncompletaS29.setText("Incompleta");

        buttonGroupS29.add(jRadioButtonFracassadaS29);
        jRadioButtonFracassadaS29.setText("Fracassada");

        buttonGroupS29.add(jRadioButtonCompletadaS29);
        jRadioButtonCompletadaS29.setText("Completada");

        buttonGroupS30.add(jRadioButtonIncompletaS30);
        jRadioButtonIncompletaS30.setText("Incompleta");

        buttonGroupS30.add(jRadioButtonFracassadaS30);
        jRadioButtonFracassadaS30.setText("Fracassada");

        buttonGroupS30.add(jRadioButtonCompletadaS30);
        jRadioButtonCompletadaS30.setText("Completada");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane92, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel208)
                            .addComponent(jRadioButtonIncompletaS21)
                            .addComponent(jRadioButtonFracassadaS21)
                            .addComponent(jRadioButtonCompletadaS21)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane93, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel210)
                            .addComponent(jRadioButtonIncompletaS22)
                            .addComponent(jRadioButtonFracassadaS22)
                            .addComponent(jRadioButtonCompletadaS22)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane94, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel212)
                            .addComponent(jRadioButtonIncompletaS23)
                            .addComponent(jRadioButtonFracassadaS23)
                            .addComponent(jRadioButtonCompletadaS23)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane95, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel214)
                            .addComponent(jRadioButtonIncompletaS24)
                            .addComponent(jRadioButtonFracassadaS24)
                            .addComponent(jRadioButtonCompletadaS24)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane96, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel216)
                            .addComponent(jRadioButtonIncompletaS25)
                            .addComponent(jRadioButtonFracassadaS25)
                            .addComponent(jRadioButtonCompletadaS25)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane97, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel218)
                            .addComponent(jRadioButtonIncompletaS26)
                            .addComponent(jRadioButtonFracassadaS26)
                            .addComponent(jRadioButtonCompletadaS26)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane98, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel220)
                            .addComponent(jRadioButtonIncompletaS27)
                            .addComponent(jRadioButtonFracassadaS27)
                            .addComponent(jRadioButtonCompletadaS27)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane99, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel222)
                            .addComponent(jRadioButtonIncompletaS28)
                            .addComponent(jRadioButtonFracassadaS28)
                            .addComponent(jRadioButtonCompletadaS28)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel224)
                            .addComponent(jRadioButtonIncompletaS29)
                            .addComponent(jRadioButtonFracassadaS29)
                            .addComponent(jRadioButtonCompletadaS29)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jScrollPane101, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel226)
                            .addComponent(jRadioButtonIncompletaS30)
                            .addComponent(jRadioButtonFracassadaS30)
                            .addComponent(jRadioButtonCompletadaS30)))
                    .addComponent(jLabel207)
                    .addComponent(jLabel209)
                    .addComponent(jLabel211)
                    .addComponent(jLabel213)
                    .addComponent(jLabel215)
                    .addComponent(jLabel217)
                    .addComponent(jLabel219)
                    .addComponent(jLabel221)
                    .addComponent(jLabel223)
                    .addComponent(jLabel225))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel207)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel208)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel209)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel210)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel211)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel212)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel213)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel214)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel215)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel216)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel217)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel218)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel219)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel220)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel221)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel222)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel223)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel224)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel225)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel226)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS30))
                    .addComponent(jScrollPane101, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel28);

        javax.swing.GroupLayout jPanelCAP3Layout = new javax.swing.GroupLayout(jPanelCAP3);
        jPanelCAP3.setLayout(jPanelCAP3Layout);
        jPanelCAP3Layout.setHorizontalGroup(
            jPanelCAP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelCAP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCAP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel206)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        jPanelCAP3Layout.setVerticalGroup(
            jPanelCAP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCAP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel206, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCAP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPaneCap3.setViewportView(jPanelCAP3);

        jTabbedPane1.addTab("Capítulo 03", jScrollPaneCap3);

        jPanelCAP4.setPreferredSize(Tela.telaFull());

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setMaximumSize(new java.awt.Dimension(700, 1940));
        jScrollPane8.setPreferredSize(new java.awt.Dimension(630, 1940));

        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel29.setMaximumSize(new java.awt.Dimension(650, 1955));
        jPanel29.setPreferredSize(new java.awt.Dimension(650, 1955));

        jLabel227.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel227.setText("46 - Cavalo de Roma");

        jTextAreaP91.setEditable(false);
        jTextAreaP91.setColumns(20);
        jTextAreaP91.setLineWrap(true);
        jTextAreaP91.setRows(5);
        jTextAreaP91.setText("Após com muita dificuldade derrotarem os Beta, o grupo consegue se infiltrar no laboratório geral da Unreal Pela entrada sul.\nAgora precisam restabelecer a comunicação da cidade, Roma e B.H.C na central de comunicação da Unreal\nXP: 4000 - GOLD: 0 - OUTROS: 10 Componentes (classe).");
        jTextAreaP91.setWrapStyleWord(true);
        jScrollPane102.setViewportView(jTextAreaP91);

        jLabel228.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel228.setText("Status: ");

        jLabel229.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel229.setText("47 - The Unreal System Tecnologies");

        jTextAreaP92.setEditable(false);
        jTextAreaP92.setColumns(20);
        jTextAreaP92.setLineWrap(true);
        jTextAreaP92.setRows(5);
        jTextAreaP92.setText("Após reestabelecerem a comunicação na cidade, James manda o grupo ir até a central de segurança da Unreal para desarmar as defesas automatizadas da mesma.\nXP: 4000 - GOLD: 0 - OUTROS: Munição / Exo-Esqueleto de Combate.");
        jTextAreaP92.setWrapStyleWord(true);
        jScrollPane103.setViewportView(jTextAreaP92);

        jLabel230.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel230.setText("Status: ");

        jLabel231.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel231.setText("48 - O lar das abominações");

        jTextAreaP93.setEditable(false);
        jTextAreaP93.setColumns(20);
        jTextAreaP93.setLineWrap(true);
        jTextAreaP93.setRows(5);
        jTextAreaP93.setText("Obtendo êxito em desativar as defesas da Unreal, o grupo deve agora capturar todos os dados das pesquisas e experimentos que a Unreal fazia.\nCaso tenham aceitado o pedido de Lillian, o grupo ganha acesso à uma sala secreta e à missão secundária 36.\nXP: 4000 - GOLD: 0 - OUTROS: Munição / 1 pílula - M [para cada] / 10 Componentes (classe) / Arquivo 04 - Baphomet.");
        jTextAreaP93.setWrapStyleWord(true);
        jScrollPane104.setViewportView(jTextAreaP93);

        jLabel232.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel232.setText("Status: ");

        jLabel233.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel233.setText("49 - Poder & Influência");

        jTextAreaP94.setEditable(false);
        jTextAreaP94.setColumns(20);
        jTextAreaP94.setLineWrap(true);
        jTextAreaP94.setRows(5);
        jTextAreaP94.setText("Após capturarem todos os dados, o grupo ruma novamente a central de comunicação para transmitir os dados, mas, o Homem misterioso os aguarda lá.\nXP: 4000 - GOLD: 0 - OUTROS: Arquivo 05 - A maquina.");
        jTextAreaP94.setWrapStyleWord(true);
        jScrollPane105.setViewportView(jTextAreaP94);

        jLabel234.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel234.setText("Status: ");

        jLabel235.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel235.setText("50 - Ômega");

        jTextAreaP95.setEditable(false);
        jTextAreaP95.setColumns(20);
        jTextAreaP95.setLineWrap(true);
        jTextAreaP95.setRows(5);
        jTextAreaP95.setText("Após o Homem misterioso ter aberto o portal do inferno, convocado reforços da Unreal e liberado as Bocejos na cidade. O grupo deve agora rumar para fora do laboratório, mas ao tentar fazer isso, acabam confrontando Ômega. \nXP: 4500 - GOLD: 0 - OUTROS: Munição / 2 sprays de primeiros socorros / 20 Componentes (Classe) / 1 Pílula - M (para cada player).");
        jTextAreaP95.setWrapStyleWord(true);
        jScrollPane106.setViewportView(jTextAreaP95);

        jLabel236.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel236.setText("Status: ");

        jLabel237.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel237.setText("51 - Ponto Zero");

        jTextAreaP96.setEditable(false);
        jTextAreaP96.setColumns(20);
        jTextAreaP96.setLineWrap(true);
        jTextAreaP96.setRows(5);
        jTextAreaP96.setText("O grupo põem fim a vida de Ômega e conseguem fugir do laboratório.\nCésar e o Major Luke dizem ao grupo que a situação está crítica, e que precisam não só exterminar os terroristas de vez, mas tomar sua base principal para ser vir de apoio para o reforço militar que está chegando.\nXP: 4500 - GOLD: 0 - OUTROS: Nada / M60.\n");
        jTextAreaP96.setWrapStyleWord(true);
        jScrollPane107.setViewportView(jTextAreaP96);

        jLabel238.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel238.setText("Status: ");

        jLabel239.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel239.setText("52 - A horda infernal");

        jTextAreaP97.setEditable(false);
        jTextAreaP97.setColumns(20);
        jTextAreaP97.setLineWrap(true);
        jTextAreaP97.setRows(5);
        jTextAreaP97.setText("Mesmo tomando o Ponto Zero, ainda não se pode comemorar, o grupo precisa agora defende-lo da horda infernal de Chacais, Infectados aprimorados, Bestas e outras criaturas que se aproximam...\nXP: 4500 - GOLD: 500 - OUTROS: NADA\n");
        jTextAreaP97.setWrapStyleWord(true);
        jScrollPane108.setViewportView(jTextAreaP97);

        jLabel240.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel240.setText("Status: ");

        jLabel241.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel241.setText("53 - Uma nova esperança");

        jTextAreaP98.setEditable(false);
        jTextAreaP98.setColumns(20);
        jTextAreaP98.setLineWrap(true);
        jTextAreaP98.setRows(5);
        jTextAreaP98.setText("Os reforços do Major Luke, César e James finalmente chegam, todos agora se preparam para uma grande investida contra o portal do inferno na esperança de suprimi-lo.\nXP: 4500 - GOLD: 500 - OUTROS: Granadas, munições e componentes (classes).");
        jTextAreaP98.setWrapStyleWord(true);
        jScrollPane109.setViewportView(jTextAreaP98);

        jLabel242.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel242.setText("Status: ");

        jLabel243.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel243.setText("54 - Vozes");

        jTextAreaP99.setEditable(false);
        jTextAreaP99.setColumns(20);
        jTextAreaP99.setLineWrap(true);
        jTextAreaP99.setRows(5);
        jTextAreaP99.setText("Enquanto ajudavam na investida, o grupo ouviu uma voz esquisita vindo apenas de dentro de suas cabeças... Ela mandava o grupo ir até a Igreja Nova Vida, e afirmava que iria explicar tudo ao chegar lá.\nXP: 4500 - GOLD: 0 - OUTROS: 3 pílula - G / componentes (classes).\n");
        jTextAreaP99.setWrapStyleWord(true);
        jScrollPane110.setViewportView(jTextAreaP99);

        jLabel244.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel244.setText("Status: ");

        jLabel245.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel245.setText("55 - Pro inferno");

        jTextAreaP100.setEditable(false);
        jTextAreaP100.setColumns(20);
        jTextAreaP100.setLineWrap(true);
        jTextAreaP100.setRows(5);
        jTextAreaP100.setText("Ao chegarem na igreja, a voz diz que eles precisam voltar ao inferno da dor para matar o Barão Infernal, só assim o portal infernal iria parar de crescer, porém, não iria se fechar ainda. O grupo precisa agora voltar às ruas do Inferno da dor\nXP: 5000 - GOLD: 0 - OUTROS: 1x F2000 / 1x Taurus 44 / Munição / 2x Vacina de cura - M .");
        jTextAreaP100.setWrapStyleWord(true);
        jScrollPane111.setViewportView(jTextAreaP100);

        jLabel246.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel246.setText("Status: ");

        jLabel247.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel247.setText("56 - O Barão");

        jTextAreaP101.setEditable(false);
        jTextAreaP101.setColumns(20);
        jTextAreaP101.setLineWrap(true);
        jTextAreaP101.setRows(5);
        jTextAreaP101.setText("Finalmente o grupo chega ao lar do Barão Infernal, uma criatura simplesmente abominável, o grupo precisa agora derrota-lo\nXP: 5000 - GOLD: 1000 - OUTROS: Nada.");
        jTextAreaP101.setWrapStyleWord(true);
        jScrollPane112.setViewportView(jTextAreaP101);

        jLabel248.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel248.setText("Status: ");

        jLabel249.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel249.setText("57 - O circo dos horrores");

        jTextAreaP102.setEditable(false);
        jTextAreaP102.setColumns(20);
        jTextAreaP102.setLineWrap(true);
        jTextAreaP102.setRows(5);
        jTextAreaP102.setText("O grupo acorda em meio a um circo cheio de armadilhas e criaturas bizarras. \nXP: 5000 - GOLD: 0 - OUTROS: Munição / 3 - Pílula - P/ 1 pílua - M / 20 Componentes (classe)[Pra cada]");
        jTextAreaP102.setWrapStyleWord(true);
        jScrollPane113.setViewportView(jTextAreaP102);

        jLabel250.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel250.setText("Status: ");

        jLabel251.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel251.setText("58 - Anjos");

        jTextAreaP103.setEditable(false);
        jTextAreaP103.setColumns(20);
        jTextAreaP103.setLineWrap(true);
        jTextAreaP103.setRows(5);
        jTextAreaP103.setText("O grupo consegue fugir do circo.\nGeneral James pede para que o grupo volte até a base da B.H.C em Kranch para ajudar na remoção dos sobreviventes.\nXP: 5000 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP103.setWrapStyleWord(true);
        jScrollPane114.setViewportView(jTextAreaP103);

        jLabel252.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel252.setText("Status: ");

        jLabel253.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel253.setText("59 - A fortaleza ");

        jTextAreaP104.setEditable(false);
        jTextAreaP104.setColumns(20);
        jTextAreaP104.setLineWrap(true);
        jTextAreaP104.setRows(5);
        jTextAreaP104.setText("Após removerem os sobreviventes, Lillian Turner aparece pedindo ajuda do grupo, alegando que sabe onde o marido dela pode estar. O grupo ruma para a Fortaleza Grey em busca de respostas\nXP: 5000 - GOLD: 0 - OUTROS: Munição / 1x Jackhammer.");
        jTextAreaP104.setWrapStyleWord(true);
        jScrollPane115.setViewportView(jTextAreaP104);

        jLabel254.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel254.setText("Status: ");

        jTextAreaP105.setEditable(false);
        jTextAreaP105.setColumns(20);
        jTextAreaP105.setLineWrap(true);
        jTextAreaP105.setRows(5);
        jTextAreaP105.setText("Enquanto o grupo vasculhava a fortaleza, eles se depararam com uma Exo-esqueleto completamente diferentes, quando uma nova e misteriosa figura surge, Lúcifer, apareceu e contou a verdade sobre a armadura possuída e sobre Marcus Turner, agora, The Hunter.\nLúcifer também marcou com sua maldição o membro com maior karma e com melhores boas ações feitas [o membro tem sua classe alterada para AMALDIÇOADO]\nXP: 5000 - GOLD: 1000 - OUTROS: +10 Karma /\nAnotações 06 - Marcus Turner [COMPLETO] / Arquivo 06 - A armadura possuída.");
        jTextAreaP105.setWrapStyleWord(true);
        jScrollPane116.setViewportView(jTextAreaP105);

        jLabel255.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel255.setText("60 - A armadura possuída & O escolhido");

        jLabel256.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel256.setText("Status: ");

        buttonGroupP46.add(jRadioButtonIncompleta46);
        jRadioButtonIncompleta46.setSelected(true);
        jRadioButtonIncompleta46.setText("Incompleta");

        buttonGroupP46.add(jRadioButtonFracassada46);
        jRadioButtonFracassada46.setText("Fracassada");

        buttonGroupP46.add(jRadioButtonCompletada46);
        jRadioButtonCompletada46.setText("Completada");

        buttonGroupP47.add(jRadioButtonIncompleta47);
        jRadioButtonIncompleta47.setSelected(true);
        jRadioButtonIncompleta47.setText("Incompleta");

        buttonGroupP47.add(jRadioButtonFracassada47);
        jRadioButtonFracassada47.setText("Fracassada");

        buttonGroupP47.add(jRadioButtonCompletada47);
        jRadioButtonCompletada47.setText("Completada");

        buttonGroupP48.add(jRadioButtonIncompleta48);
        jRadioButtonIncompleta48.setSelected(true);
        jRadioButtonIncompleta48.setText("Incompleta");

        buttonGroupP48.add(jRadioButtonFracassada48);
        jRadioButtonFracassada48.setText("Fracassada");

        buttonGroupP48.add(jRadioButtonCompletada48);
        jRadioButtonCompletada48.setText("Completada");

        buttonGroupP49.add(jRadioButtonIncompleta49);
        jRadioButtonIncompleta49.setSelected(true);
        jRadioButtonIncompleta49.setText("Incompleta");

        buttonGroupP49.add(jRadioButtonFracassada49);
        jRadioButtonFracassada49.setText("Fracassada");

        buttonGroupP49.add(jRadioButtonCompletada49);
        jRadioButtonCompletada49.setText("Completada");

        buttonGroupP50.add(jRadioButtonIncompleta50);
        jRadioButtonIncompleta50.setSelected(true);
        jRadioButtonIncompleta50.setText("Incompleta");

        buttonGroupP50.add(jRadioButtonFracassada50);
        jRadioButtonFracassada50.setText("Fracassada");

        buttonGroupP50.add(jRadioButtonCompletada50);
        jRadioButtonCompletada50.setText("Completada");

        buttonGroupP51.add(jRadioButtonIncompleta51);
        jRadioButtonIncompleta51.setSelected(true);
        jRadioButtonIncompleta51.setText("Incompleta");

        buttonGroupP51.add(jRadioButtonFracassada51);
        jRadioButtonFracassada51.setText("Fracassada");

        buttonGroupP51.add(jRadioButtonCompletada51);
        jRadioButtonCompletada51.setText("Completada");

        buttonGroupP52.add(jRadioButtonIncompleta52);
        jRadioButtonIncompleta52.setSelected(true);
        jRadioButtonIncompleta52.setText("Incompleta");

        buttonGroupP52.add(jRadioButtonFracassada52);
        jRadioButtonFracassada52.setText("Fracassada");

        buttonGroupP52.add(jRadioButtonCompletada52);
        jRadioButtonCompletada52.setText("Completada");

        buttonGroupP53.add(jRadioButtonIncompleta53);
        jRadioButtonIncompleta53.setSelected(true);
        jRadioButtonIncompleta53.setText("Incompleta");

        buttonGroupP53.add(jRadioButtonFracassada53);
        jRadioButtonFracassada53.setText("Fracassada");

        buttonGroupP53.add(jRadioButtonCompletada53);
        jRadioButtonCompletada53.setText("Completada");

        buttonGroupP54.add(jRadioButtonIncompleta54);
        jRadioButtonIncompleta54.setSelected(true);
        jRadioButtonIncompleta54.setText("Incompleta");

        buttonGroupP54.add(jRadioButtonFracassada54);
        jRadioButtonFracassada54.setText("Fracassada");

        buttonGroupP54.add(jRadioButtonCompletada54);
        jRadioButtonCompletada54.setText("Completada");

        buttonGroupP55.add(jRadioButtonIncompleta55);
        jRadioButtonIncompleta55.setSelected(true);
        jRadioButtonIncompleta55.setText("Incompleta");

        buttonGroupP55.add(jRadioButtonFracassada55);
        jRadioButtonFracassada55.setText("Fracassada");

        buttonGroupP55.add(jRadioButtonCompletada55);
        jRadioButtonCompletada55.setText("Completada");

        buttonGroupP56.add(jRadioButtonIncompleta56);
        jRadioButtonIncompleta56.setSelected(true);
        jRadioButtonIncompleta56.setText("Incompleta");

        buttonGroupP56.add(jRadioButtonFracassada56);
        jRadioButtonFracassada56.setText("Fracassada");

        buttonGroupP56.add(jRadioButtonCompletada56);
        jRadioButtonCompletada56.setText("Completada");

        buttonGroupP57.add(jRadioButtonIncompleta57);
        jRadioButtonIncompleta57.setSelected(true);
        jRadioButtonIncompleta57.setText("Incompleta");

        buttonGroupP57.add(jRadioButtonFracassada57);
        jRadioButtonFracassada57.setText("Fracassada");

        buttonGroupP57.add(jRadioButtonCompletada57);
        jRadioButtonCompletada57.setText("Completada");

        buttonGroupP58.add(jRadioButtonIncompleta58);
        jRadioButtonIncompleta58.setSelected(true);
        jRadioButtonIncompleta58.setText("Incompleta");

        buttonGroupP58.add(jRadioButtonFracassada58);
        jRadioButtonFracassada58.setText("Fracassada");

        buttonGroupP58.add(jRadioButtonCompletada58);
        jRadioButtonCompletada58.setText("Completada");

        buttonGroupP59.add(jRadioButtonIncompleta59);
        jRadioButtonIncompleta59.setSelected(true);
        jRadioButtonIncompleta59.setText("Incompleta");

        buttonGroupP59.add(jRadioButtonFracassada59);
        jRadioButtonFracassada59.setText("Fracassada");

        buttonGroupP59.add(jRadioButtonCompletada59);
        jRadioButtonCompletada59.setText("Completada");

        buttonGroupP60.add(jRadioButtonIncompleta60);
        jRadioButtonIncompleta60.setSelected(true);
        jRadioButtonIncompleta60.setText("Incompleta");

        buttonGroupP60.add(jRadioButtonFracassada60);
        jRadioButtonFracassada60.setText("Fracassada");

        buttonGroupP60.add(jRadioButtonCompletada60);
        jRadioButtonCompletada60.setText("Completada");
        jRadioButtonCompletada60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCompletada60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane116, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel256)
                            .addComponent(jRadioButtonIncompleta60)
                            .addComponent(jRadioButtonFracassada60)
                            .addComponent(jRadioButtonCompletada60)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane102, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel228)
                            .addComponent(jRadioButtonIncompleta46)
                            .addComponent(jRadioButtonFracassada46)
                            .addComponent(jRadioButtonCompletada46)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane103, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel230)
                            .addComponent(jRadioButtonIncompleta47)
                            .addComponent(jRadioButtonFracassada47)
                            .addComponent(jRadioButtonCompletada47)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane104, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel232)
                            .addComponent(jRadioButtonIncompleta48)
                            .addComponent(jRadioButtonFracassada48)
                            .addComponent(jRadioButtonCompletada48)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane105, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel234)
                            .addComponent(jRadioButtonIncompleta49)
                            .addComponent(jRadioButtonFracassada49)
                            .addComponent(jRadioButtonCompletada49)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane106, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel236)
                            .addComponent(jRadioButtonIncompleta50)
                            .addComponent(jRadioButtonFracassada50)
                            .addComponent(jRadioButtonCompletada50)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane107, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel238)
                            .addComponent(jRadioButtonIncompleta51)
                            .addComponent(jRadioButtonFracassada51)
                            .addComponent(jRadioButtonCompletada51)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane108, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel240)
                            .addComponent(jRadioButtonIncompleta52)
                            .addComponent(jRadioButtonFracassada52)
                            .addComponent(jRadioButtonCompletada52)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane109, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel242)
                            .addComponent(jRadioButtonIncompleta53)
                            .addComponent(jRadioButtonFracassada53)
                            .addComponent(jRadioButtonCompletada53)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane110, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel244)
                            .addComponent(jRadioButtonIncompleta54)
                            .addComponent(jRadioButtonFracassada54)
                            .addComponent(jRadioButtonCompletada54)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane111, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel246)
                            .addComponent(jRadioButtonIncompleta55)
                            .addComponent(jRadioButtonFracassada55)
                            .addComponent(jRadioButtonCompletada55)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane112, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel248)
                            .addComponent(jRadioButtonIncompleta56)
                            .addComponent(jRadioButtonFracassada56)
                            .addComponent(jRadioButtonCompletada56)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane113, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel250)
                            .addComponent(jRadioButtonIncompleta57)
                            .addComponent(jRadioButtonFracassada57)
                            .addComponent(jRadioButtonCompletada57)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane114, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel252)
                            .addComponent(jRadioButtonIncompleta58)
                            .addComponent(jRadioButtonFracassada58)
                            .addComponent(jRadioButtonCompletada58)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane115, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel254)
                            .addComponent(jRadioButtonIncompleta59)
                            .addComponent(jRadioButtonFracassada59)
                            .addComponent(jRadioButtonCompletada59)))
                    .addComponent(jLabel227)
                    .addComponent(jLabel229)
                    .addComponent(jLabel231)
                    .addComponent(jLabel233)
                    .addComponent(jLabel235)
                    .addComponent(jLabel237)
                    .addComponent(jLabel239)
                    .addComponent(jLabel241)
                    .addComponent(jLabel243)
                    .addComponent(jLabel245)
                    .addComponent(jLabel247)
                    .addComponent(jLabel249)
                    .addComponent(jLabel251)
                    .addComponent(jLabel253)
                    .addComponent(jLabel255))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel227)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel228)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonIncompleta46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada46)))
                .addGap(18, 18, 18)
                .addComponent(jLabel229)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel230)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada47)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel231)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel232)
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButtonIncompleta48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada48)))
                .addGap(18, 18, 18)
                .addComponent(jLabel233)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel234)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada49)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel235)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel236)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada50)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel237)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel238)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada51)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel239)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel240)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada52)))
                .addGap(18, 18, 18)
                .addComponent(jLabel241)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel242)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada53)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel243)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel244)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada54)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel245)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel246)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada55))
                    .addComponent(jScrollPane111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel247)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel248)
                        .addGap(4, 4, 4)
                        .addComponent(jRadioButtonIncompleta56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada56))
                    .addComponent(jScrollPane112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel249)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel250)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada57))
                    .addComponent(jScrollPane113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel251)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel252)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada58))
                    .addComponent(jScrollPane114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel253)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel254)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada59))
                    .addComponent(jScrollPane115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel255)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel256)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada60))
                    .addComponent(jScrollPane116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jScrollPane8.setViewportView(jPanel29);

        jLabel146.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("Primárias");

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setText("Secundárias");

        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel32.setMaximumSize(new java.awt.Dimension(670, 1350));
        jPanel32.setPreferredSize(new java.awt.Dimension(670, 1350));

        jLabel292.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel292.setText("S31 -  Mad Maestro ");

        jTextAreaP123.setEditable(false);
        jTextAreaP123.setColumns(20);
        jTextAreaP123.setLineWrap(true);
        jTextAreaP123.setRows(5);
        jTextAreaP123.setText("Enquanto rumava para a igreja Nova vida, o grupo percebeu uma casa de festas... Dando uma festa...? O grupo parte para investigar o local e encontrar um insano DJ\nDISPONÍVEL ENTRE AS MISSÕES: 54.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA\nXP: 3000 - GOLD: 300 - OUTROS: Munição, +10 de KARMA.");
        jTextAreaP123.setWrapStyleWord(true);
        jScrollPane134.setViewportView(jTextAreaP123);

        jLabel293.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel293.setText("Status: ");

        jTextAreaP124.setEditable(false);
        jTextAreaP124.setColumns(20);
        jTextAreaP124.setLineWrap(true);
        jTextAreaP124.setRows(5);
        jTextAreaP124.setText("Enquanto presos pelo The Clown, o mesmo propõem uma série de desafios extras ao grupo enquanto eles tentam fugir da sua casa dos horrores.\nO primeiro desafio é ter que sobreviver duas rodadas dentro da jaula contra um [] usando apenas armas brancas \nDISPONÍVEL ENTRE AS MISSÕES: 57.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA\nXP: 3000 - GOLD: 500 - OUTROS: +20 de Karma / granadas / Uma criança liberada");
        jTextAreaP124.setWrapStyleWord(true);
        jScrollPane135.setViewportView(jTextAreaP124);

        jLabel294.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel294.setText("S32 -  Desafio da risada 01 ");

        jLabel295.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel295.setText("Status: ");

        jLabel296.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel296.setText("S33 - Desafio da risada 02 ");

        jTextAreaP125.setEditable(false);
        jTextAreaP125.setColumns(20);
        jTextAreaP125.setLineWrap(true);
        jTextAreaP125.setRows(5);
        jTextAreaP125.setText("O próximo desafio é conseguir resgatar um homem sem pernas que está em uma jaula cercada de infectados\nDISPONÍVEL ENTRE AS MISSÕES: 57.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -10 de KARMA.\nXP: 3500 - GOLD: 300 - OUTROS: +10 de KARMA/ 1x pílula - G [Para cada] / Uma criança libertada.");
        jTextAreaP125.setWrapStyleWord(true);
        jScrollPane136.setViewportView(jTextAreaP125);

        jLabel297.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel297.setText("Status: ");

        jLabel298.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel298.setText("S34 -  Desafio da risada 03 ");

        jTextAreaP126.setEditable(false);
        jTextAreaP126.setColumns(20);
        jTextAreaP126.setLineWrap(true);
        jTextAreaP126.setRows(5);
        jTextAreaP126.setText("O último desafio, o grupo realizar uma escolha moral.\nEscolher salvar a vida de uma criança que porta uma doença letal, não contagiosa, mas que não a permitirá passar dos 20 anos. Ou a vida de uma criança que é filha de um criminoso notório\nDISPONÍVEL ENTRE AS MISSÕES: 57.\nFRACASSAR OU DEIXAR DE FAZE-LA: Perca de -20 de KARMA.\nXP: 3500 - GOLD: 300 - OUTROS: +10 de KARMA/ Uma criança libertada / +1 Skill point ");
        jTextAreaP126.setWrapStyleWord(true);
        jScrollPane137.setViewportView(jTextAreaP126);

        jLabel299.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel299.setText("Status: ");

        jLabel300.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel300.setText("S35 - A última gargalhada ");

        jTextAreaP127.setEditable(false);
        jTextAreaP127.setColumns(20);
        jTextAreaP127.setLineWrap(true);
        jTextAreaP127.setRows(5);
        jTextAreaP127.setText("Um pouco antes de sairem de escaparem do circo, o grupo ganha a opção de ir atrás de The Clown e pôr fim a sua vida\nDISPONÍVEL ENTRE AS MISSÕES: 57.\nFRACASSAR OU DEIXAR DE FAZE-LA: NADA.\nXP: 4000 - GOLD: 0 - OUTROS: +20 de KARMA");
        jTextAreaP127.setWrapStyleWord(true);
        jScrollPane138.setViewportView(jTextAreaP127);

        jLabel301.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel301.setText("Status: ");

        buttonGroupS31.add(jRadioButtonIncompletaS31);
        jRadioButtonIncompletaS31.setSelected(true);
        jRadioButtonIncompletaS31.setText("Incompleta");

        buttonGroupS31.add(jRadioButtonFracassadaS31);
        jRadioButtonFracassadaS31.setText("Fracassada");

        buttonGroupS31.add(jRadioButtonCompletadaS31);
        jRadioButtonCompletadaS31.setText("Completada");

        buttonGroupS32.add(jRadioButtonIncompletaS32);
        jRadioButtonIncompletaS32.setSelected(true);
        jRadioButtonIncompletaS32.setText("Incompleta");

        buttonGroupS32.add(jRadioButtonFracassadaS32);
        jRadioButtonFracassadaS32.setText("Fracassada");

        buttonGroupS32.add(jRadioButtonCompletadaS32);
        jRadioButtonCompletadaS32.setText("Completada");

        buttonGroupS33.add(jRadioButtonIncompletaS33);
        jRadioButtonIncompletaS33.setSelected(true);
        jRadioButtonIncompletaS33.setText("Incompleta");

        buttonGroupS33.add(jRadioButtonFracassadaS33);
        jRadioButtonFracassadaS33.setText("Fracassada");

        buttonGroupS33.add(jRadioButtonCompletadaS33);
        jRadioButtonCompletadaS33.setText("Completada");

        buttonGroupS34.add(jRadioButtonIncompletaS34);
        jRadioButtonIncompletaS34.setSelected(true);
        jRadioButtonIncompletaS34.setText("Incompleta");

        buttonGroupS34.add(jRadioButtonFracassadaS34);
        jRadioButtonFracassadaS34.setText("Fracassada");

        buttonGroupS34.add(jRadioButtonCompletadaS34);
        jRadioButtonCompletadaS34.setText("Completada");

        buttonGroupS35.add(jRadioButtonIncompletaS35);
        jRadioButtonIncompletaS35.setText("Incompleta");

        buttonGroupS35.add(jRadioButtonFracassadaS35);
        jRadioButtonFracassadaS35.setText("Fracassada");

        buttonGroupS35.add(jRadioButtonCompletadaS35);
        jRadioButtonCompletadaS35.setText("Completada");

        jLabel302.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel302.setText("S36 - Marcus Turner");

        jTextAreaP128.setEditable(false);
        jTextAreaP128.setColumns(20);
        jTextAreaP128.setLineWrap(true);
        jTextAreaP128.setRows(5);
        jTextAreaP128.setText("Enquanto estavam no laboratório da Unreal, o grupo usa o cartão de Lillian Turner para adentrar uma sala secreta. \nDISPONÍVEL ENTRE AS MISSÕES: 48.\nFRACASSAR OU DEIXAR DE FAZE-LA: NADA.\nXP: 4000 - GOLD: 0 - OUTROS: +20 de KARMA / Anotações 05 - Marcus Turner");
        jTextAreaP128.setWrapStyleWord(true);
        jScrollPane139.setViewportView(jTextAreaP128);

        jLabel303.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel303.setText("Status: ");

        buttonGroupS35.add(jRadioButtonIncompletaS36);
        jRadioButtonIncompletaS36.setSelected(true);
        jRadioButtonIncompletaS36.setText("Incompleta");

        buttonGroupS35.add(jRadioButtonFracassadaS36);
        jRadioButtonFracassadaS36.setText("Fracassada");

        buttonGroupS35.add(jRadioButtonCompletadaS36);
        jRadioButtonCompletadaS36.setText("Completada");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jScrollPane134, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel293)
                            .addComponent(jRadioButtonIncompletaS31)
                            .addComponent(jRadioButtonFracassadaS31)
                            .addComponent(jRadioButtonCompletadaS31)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jScrollPane135, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel295)
                            .addComponent(jRadioButtonIncompletaS32)
                            .addComponent(jRadioButtonFracassadaS32)
                            .addComponent(jRadioButtonCompletadaS32)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jScrollPane136, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel297)
                            .addComponent(jRadioButtonIncompletaS33)
                            .addComponent(jRadioButtonFracassadaS33)
                            .addComponent(jRadioButtonCompletadaS33)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jScrollPane137, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel299)
                            .addComponent(jRadioButtonIncompletaS34)
                            .addComponent(jRadioButtonFracassadaS34)
                            .addComponent(jRadioButtonCompletadaS34)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jScrollPane138, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel301)
                            .addComponent(jRadioButtonIncompletaS35)
                            .addComponent(jRadioButtonFracassadaS35)
                            .addComponent(jRadioButtonCompletadaS35)))
                    .addComponent(jLabel292)
                    .addComponent(jLabel294)
                    .addComponent(jLabel296)
                    .addComponent(jLabel298)
                    .addComponent(jLabel300)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jScrollPane139, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel303)
                            .addComponent(jRadioButtonIncompletaS36)
                            .addComponent(jRadioButtonFracassadaS36)
                            .addComponent(jRadioButtonCompletadaS36)))
                    .addComponent(jLabel302))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel292)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel293)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel294)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel295)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel296)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel297)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel298)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel299)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompletaS34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel300)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel301)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS35)))
                .addGap(18, 18, 18)
                .addComponent(jLabel302)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel303)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompletaS36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassadaS36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletadaS36)))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCAP4Layout = new javax.swing.GroupLayout(jPanelCAP4);
        jPanelCAP4.setLayout(jPanelCAP4Layout);
        jPanelCAP4Layout.setHorizontalGroup(
            jPanelCAP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelCAP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCAP4Layout.createSequentialGroup()
                        .addComponent(jLabel146)
                        .addGap(616, 616, 616))
                    .addGroup(jPanelCAP4Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelCAP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCAP4Layout.setVerticalGroup(
            jPanelCAP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCAP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel146)
                    .addComponent(jLabel147))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCAP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPaneCap4.setViewportView(jPanelCAP4);

        jTabbedPane1.addTab("Capítulo 04", jScrollPaneCap4);

        jPanelCAP5.setPreferredSize(Tela.telaFull());

        jLabel149.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Primárias");

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setMaximumSize(new java.awt.Dimension(700, 1940));
        jScrollPane9.setPreferredSize(new java.awt.Dimension(630, 1940));

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel30.setMaximumSize(new java.awt.Dimension(650, 1955));
        jPanel30.setPreferredSize(new java.awt.Dimension(650, 1955));

        jLabel257.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel257.setText("61 -  666");

        jTextAreaP106.setEditable(false);
        jTextAreaP106.setColumns(20);
        jTextAreaP106.setLineWrap(true);
        jTextAreaP106.setRows(5);
        jTextAreaP106.setText("Após o encontro com Lúcifer, o grupo precisa fugir da fortaleza enquanto o marcado com a maldição está gravemente ferido, mas, descobrindo suas novas capacidades\nXP: 5000 - GOLD: 1000 - OUTROS: 10 Componentes (classe).");
        jTextAreaP106.setWrapStyleWord(true);
        jScrollPane117.setViewportView(jTextAreaP106);

        jLabel258.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel258.setText("Status: ");

        jLabel259.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel259.setText("62 -  Cartada final");

        jTextAreaP107.setEditable(false);
        jTextAreaP107.setColumns(20);
        jTextAreaP107.setLineWrap(true);
        jTextAreaP107.setRows(5);
        jTextAreaP107.setText("Ainda na Fortaleza, o grupo descobre o último recurso da Unreal, disparar um míssel localizado na montanha Elevate portando o vírus demoníaco.\nXP: 5000 - GOLD: 0 - OUTROS: Munição / 1x RPG-7.");
        jTextAreaP107.setWrapStyleWord(true);
        jScrollPane118.setViewportView(jTextAreaP107);

        jLabel260.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel260.setText("Status: ");

        jLabel261.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel261.setText("63 -  Rumo à montanha");

        jTextAreaP108.setEditable(false);
        jTextAreaP108.setColumns(20);
        jTextAreaP108.setLineWrap(true);
        jTextAreaP108.setRows(5);
        jTextAreaP108.setText("O grupo precisa rumar toda a montanha em direção ao observatório da Unreal enfentando os perigos demoníacos durante o caminho\nXP: 5000 - GOLD: 0 - OUTROS: Munição / 1 pílula - M [para cada] / 10 Componentes (classe).");
        jTextAreaP108.setWrapStyleWord(true);
        jScrollPane119.setViewportView(jTextAreaP108);

        jLabel262.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel262.setText("Status: ");

        jLabel263.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel263.setText("64 - Reanimação ");

        jTextAreaP109.setEditable(false);
        jTextAreaP109.setColumns(20);
        jTextAreaP109.setLineWrap(true);
        jTextAreaP109.setRows(5);
        jTextAreaP109.setText("Ao atingir metade da montanha, o grupo se depara novamente com o Reanimador, mas ele está diferente desta vez.\nXP: 5500 - GOLD: 0 - OUTROS: 1x Type 88 / 2x Mauser.");
        jTextAreaP109.setWrapStyleWord(true);
        jScrollPane120.setViewportView(jTextAreaP109);

        jLabel264.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel264.setText("Status: ");

        jLabel265.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel265.setText("65 - Observatório");

        jTextAreaP110.setEditable(false);
        jTextAreaP110.setColumns(20);
        jTextAreaP110.setLineWrap(true);
        jTextAreaP110.setRows(5);
        jTextAreaP110.setText("O grupo invade o observatório matando as forças de segurança da Unreal. Ao entrarem se deparam com uma sala de armamento que usam para se recuperar e partem em direção ao silo do míssel \nXP: 5500 - GOLD: 1000 - OUTROS: Munição completa / 2 sprays de primeiros socorros / 20 Componentes (Classe) / 1 Pílula - M (para cada player).");
        jTextAreaP110.setWrapStyleWord(true);
        jScrollPane121.setViewportView(jTextAreaP110);

        jLabel266.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel266.setText("Status: ");

        jLabel267.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel267.setText("66 - Alfa ");

        jTextAreaP111.setEditable(false);
        jTextAreaP111.setColumns(20);
        jTextAreaP111.setLineWrap(true);
        jTextAreaP111.setRows(5);
        jTextAreaP111.setText("Ao chegarem no silo do míssel, Alfa, o líder do A.Q.K se encontra esperando para impedir o grupo de uma vez por todas.\nXP: 6000 - GOLD: 1000 - OUTROS: 1x G3 / 1x L85A2 / Anotações 07 -  Os lordes do inferno.\n");
        jTextAreaP111.setWrapStyleWord(true);
        jScrollPane122.setViewportView(jTextAreaP111);

        jLabel268.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel268.setText("Status: ");

        jLabel269.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel269.setText("67 - O fim do começo");

        jTextAreaP112.setEditable(false);
        jTextAreaP112.setColumns(20);
        jTextAreaP112.setLineWrap(true);
        jTextAreaP112.setRows(5);
        jTextAreaP112.setText("O grupo derrota Alfa, mas ele é bem sucedido em proteger o lançamento de 4 dos 5 mísseis. James retorna contato pedindo para o grupo retornar imediatamente à Luisidiana alegando que uma nova e abominável criatura aguarda lá. O grupo precisa alcançar o Helicóptero Apache na saída do silo\nXP: 6000 - GOLD: 0 - OUTROS: NADA.\n");
        jTextAreaP112.setWrapStyleWord(true);
        jScrollPane123.setViewportView(jTextAreaP112);

        jLabel270.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel270.setText("Status: ");

        jLabel271.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel271.setText("68 - O fim do começo");

        jTextAreaP113.setEditable(false);
        jTextAreaP113.setColumns(20);
        jTextAreaP113.setLineWrap(true);
        jTextAreaP113.setRows(5);
        jTextAreaP113.setText("O grupo chega ao Helicóptero Apache na saída do silo, mas antes que pudesse ir até ele, Alfa em sua nova forma, aguarda novamente\nXP: 6000 - GOLD: 0 - OUTROS: Gattligun.\n");
        jTextAreaP113.setWrapStyleWord(true);
        jScrollPane124.setViewportView(jTextAreaP113);

        jLabel272.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel272.setText("Status: ");

        jLabel273.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel273.setText("69 - Asses indomáveis ");

        jTextAreaP114.setEditable(false);
        jTextAreaP114.setColumns(20);
        jTextAreaP114.setLineWrap(true);
        jTextAreaP114.setRows(5);
        jTextAreaP114.setText("O grupo precisa manter o helicóptero intacto enquanto enfrentam Demónios Alado, e Sucubus rumando de volta à Luisidana.\nXP: 6000 - GOLD: 0 - OUTROS: Munição.");
        jTextAreaP114.setWrapStyleWord(true);
        jScrollPane125.setViewportView(jTextAreaP114);

        jLabel274.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel274.setText("Status: ");

        jLabel275.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel275.setText("70 -  O guardião do inferno parte 1 ");

        jTextAreaP115.setEditable(false);
        jTextAreaP115.setColumns(20);
        jTextAreaP115.setLineWrap(true);
        jTextAreaP115.setRows(5);
        jTextAreaP115.setText("Conseguindo chegar em Luisidiana, o grupo descobre que o míssel na verdade abriu uma passagem para o inferno, onde de lá, Cerberus, o cachorro gigante de três cabeças escapou, agora desesperadamente o grupo precisa para-lo.\nXP: 6000 - GOLD: 1000 - OUTROS: 1x RPG-7 / 1x Jackhammer.");
        jTextAreaP115.setWrapStyleWord(true);
        jScrollPane126.setViewportView(jTextAreaP115);

        jLabel276.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel276.setText("Status: ");

        jLabel277.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel277.setText("71 -  O guardião do inferno parte 2");

        jTextAreaP116.setEditable(false);
        jTextAreaP116.setColumns(20);
        jTextAreaP116.setLineWrap(true);
        jTextAreaP116.setRows(5);
        jTextAreaP116.setText("Cérberus começa a se modificar após quase ser derrotado, entrando em sua segunda forma. O grupo precisará de mais para derrota-lo. James manda o grupo utilizar o raio designador para poder atacar com o Satélite de luz.\nXP: 7000 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP116.setWrapStyleWord(true);
        jScrollPane127.setViewportView(jTextAreaP116);

        jLabel278.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel278.setText("Status: ");

        jLabel279.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel279.setText("72 - Pausa ");

        jTextAreaP117.setEditable(false);
        jTextAreaP117.setColumns(20);
        jTextAreaP117.setLineWrap(true);
        jTextAreaP117.setRows(5);
        jTextAreaP117.setText("O grupo derrota Cérberus e retorna para Roma, a mesma se encontra em reconstrução, Roma está com parte da estrutura danificada, mas seus muros se encontram de pé ainda, bem como sua comunicação e eletrecidade ao custo de muitas mortes. O grupo agora precisa de um descanso.\nO grupo enquanto descansava vê as notícias do mundo exterior, onde descobre que novos surtos nos locais que os mísseis cairam começaram. Um nos EUA, um no Brasil e um na China.\nXP: 0 - GOLD: 0 - OUTROS: +10 de Karma.");
        jTextAreaP117.setWrapStyleWord(true);
        jScrollPane128.setViewportView(jTextAreaP117);

        jLabel280.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel280.setText("Status: ");

        jLabel281.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel281.setText("73 - Ainda não acabou ");

        jTextAreaP118.setEditable(false);
        jTextAreaP118.setColumns(20);
        jTextAreaP118.setLineWrap(true);
        jTextAreaP118.setRows(5);
        jTextAreaP118.setText("Enquanto descansavam um dos membros do grupo teve um sonho, onde no mesmo, ele era avisado que as coisas ainda não acabaram. No sonho era mostrado Baphomet e uma criatura colossal abrindo assas ao seu lado. No sonho o grupo é mandado voltar à Igreja Nova Vida\nXP: 7000 - GOLD: 0 - OUTROS: Nada.");
        jTextAreaP118.setWrapStyleWord(true);
        jScrollPane129.setViewportView(jTextAreaP118);

        jLabel282.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel282.setText("Status: ");

        jLabel283.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel283.setText("74 - Baphomet ");

        jTextAreaP119.setEditable(false);
        jTextAreaP119.setColumns(20);
        jTextAreaP119.setLineWrap(true);
        jTextAreaP119.setRows(5);
        jTextAreaP119.setText("Ao chegar na igreja, o grupo encontra-se com Baphomet em sua terceira forma, a igreja, desmoronada, revela sua máquina feita pelas mãos do próprio homem. A maquina que afasta os defensores do mundo. Baphomet diz que agora é tarde e que nada mais pode impedi-lo. O grupo sente um tremor horrendo. Baphomet desaparece, mas a voz manda eles destruirem a máquina e rumarem para o centro de Luisidiana mais uma vez\nXP: 8000 - GOLD: 0 - OUTROS: Munição.");
        jTextAreaP119.setWrapStyleWord(true);
        jScrollPane130.setViewportView(jTextAreaP119);

        jLabel284.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel284.setText("Status: ");

        jTextAreaP120.setEditable(false);
        jTextAreaP120.setColumns(20);
        jTextAreaP120.setLineWrap(true);
        jTextAreaP120.setRows(5);
        jTextAreaP120.setText("O grupo chega ao centro de Luisidiana onde se depara com a criatura colossal, a Besta Apocalíptica de Baphomet\nXP: 8000 - GOLD: 1000 - OUTROS: NADA.");
        jTextAreaP120.setWrapStyleWord(true);
        jScrollPane131.setViewportView(jTextAreaP120);

        jLabel285.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel285.setText("75 - Fim de estrada ");

        jLabel286.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel286.setText("Status: ");

        buttonGroupP61.add(jRadioButtonIncompleta61);
        jRadioButtonIncompleta61.setSelected(true);
        jRadioButtonIncompleta61.setText("Incompleta");

        buttonGroupP61.add(jRadioButtonFracassada61);
        jRadioButtonFracassada61.setText("Fracassada");

        buttonGroupP61.add(jRadioButtonCompletada61);
        jRadioButtonCompletada61.setText("Completada");

        buttonGroupP62.add(jRadioButtonIncompleta62);
        jRadioButtonIncompleta62.setSelected(true);
        jRadioButtonIncompleta62.setText("Incompleta");

        buttonGroupP62.add(jRadioButtonFracassada62);
        jRadioButtonFracassada62.setText("Fracassada");

        buttonGroupP62.add(jRadioButtonCompletada62);
        jRadioButtonCompletada62.setText("Completada");

        buttonGroupP63.add(jRadioButtonIncompleta63);
        jRadioButtonIncompleta63.setSelected(true);
        jRadioButtonIncompleta63.setText("Incompleta");

        buttonGroupP63.add(jRadioButtonFracassada63);
        jRadioButtonFracassada63.setText("Fracassada");

        buttonGroupP63.add(jRadioButtonCompletada63);
        jRadioButtonCompletada63.setText("Completada");

        buttonGroupP64.add(jRadioButtonIncompleta64);
        jRadioButtonIncompleta64.setSelected(true);
        jRadioButtonIncompleta64.setText("Incompleta");

        buttonGroupP64.add(jRadioButtonFracassada64);
        jRadioButtonFracassada64.setText("Fracassada");

        buttonGroupP64.add(jRadioButtonCompletada64);
        jRadioButtonCompletada64.setText("Completada");

        buttonGroupP65.add(jRadioButtonIncompleta65);
        jRadioButtonIncompleta65.setSelected(true);
        jRadioButtonIncompleta65.setText("Incompleta");

        buttonGroupP65.add(jRadioButtonFracassada65);
        jRadioButtonFracassada65.setText("Fracassada");

        buttonGroupP65.add(jRadioButtonCompletada65);
        jRadioButtonCompletada65.setText("Completada");

        buttonGroupP66.add(jRadioButtonIncompleta66);
        jRadioButtonIncompleta66.setSelected(true);
        jRadioButtonIncompleta66.setText("Incompleta");

        buttonGroupP66.add(jRadioButtonFracassada66);
        jRadioButtonFracassada66.setText("Fracassada");

        buttonGroupP66.add(jRadioButtonCompletada66);
        jRadioButtonCompletada66.setText("Completada");

        buttonGroupP67.add(jRadioButtonIncompleta67);
        jRadioButtonIncompleta67.setSelected(true);
        jRadioButtonIncompleta67.setText("Incompleta");

        buttonGroupP67.add(jRadioButtonFracassada67);
        jRadioButtonFracassada67.setText("Fracassada");

        buttonGroupP67.add(jRadioButtonCompletada67);
        jRadioButtonCompletada67.setText("Completada");

        buttonGroupP68.add(jRadioButtonIncompleta68);
        jRadioButtonIncompleta68.setSelected(true);
        jRadioButtonIncompleta68.setText("Incompleta");

        buttonGroupP68.add(jRadioButtonFracassada68);
        jRadioButtonFracassada68.setText("Fracassada");

        buttonGroupP68.add(jRadioButtonCompletada68);
        jRadioButtonCompletada68.setText("Completada");

        buttonGroupP69.add(jRadioButtonIncompleta69);
        jRadioButtonIncompleta69.setSelected(true);
        jRadioButtonIncompleta69.setText("Incompleta");

        buttonGroupP69.add(jRadioButtonFracassada69);
        jRadioButtonFracassada69.setText("Fracassada");

        buttonGroupP69.add(jRadioButtonCompletada69);
        jRadioButtonCompletada69.setText("Completada");

        buttonGroupP70.add(jRadioButtonIncompleta70);
        jRadioButtonIncompleta70.setSelected(true);
        jRadioButtonIncompleta70.setText("Incompleta");

        buttonGroupP70.add(jRadioButtonFracassada70);
        jRadioButtonFracassada70.setText("Fracassada");

        buttonGroupP70.add(jRadioButtonCompletada70);
        jRadioButtonCompletada70.setText("Completada");

        buttonGroupP71.add(jRadioButtonIncompleta71);
        jRadioButtonIncompleta71.setSelected(true);
        jRadioButtonIncompleta71.setText("Incompleta");

        buttonGroupP71.add(jRadioButtonFracassada71);
        jRadioButtonFracassada71.setText("Fracassada");

        buttonGroupP71.add(jRadioButtonCompletada71);
        jRadioButtonCompletada71.setText("Completada");

        buttonGroupP72.add(jRadioButtonIncompleta72);
        jRadioButtonIncompleta72.setSelected(true);
        jRadioButtonIncompleta72.setText("Incompleta");

        buttonGroupP72.add(jRadioButtonFracassada72);
        jRadioButtonFracassada72.setText("Fracassada");

        buttonGroupP72.add(jRadioButtonCompletada72);
        jRadioButtonCompletada72.setText("Completada");

        buttonGroupP73.add(jRadioButtonIncompleta73);
        jRadioButtonIncompleta73.setSelected(true);
        jRadioButtonIncompleta73.setText("Incompleta");

        buttonGroupP73.add(jRadioButtonFracassada73);
        jRadioButtonFracassada73.setText("Fracassada");

        buttonGroupP73.add(jRadioButtonCompletada73);
        jRadioButtonCompletada73.setText("Completada");

        buttonGroupP74.add(jRadioButtonIncompleta74);
        jRadioButtonIncompleta74.setSelected(true);
        jRadioButtonIncompleta74.setText("Incompleta");

        buttonGroupP74.add(jRadioButtonFracassada74);
        jRadioButtonFracassada74.setText("Fracassada");

        buttonGroupP74.add(jRadioButtonCompletada74);
        jRadioButtonCompletada74.setText("Completada");

        buttonGroupP75.add(jRadioButtonIncompleta75);
        jRadioButtonIncompleta75.setSelected(true);
        jRadioButtonIncompleta75.setText("Incompleta");

        buttonGroupP75.add(jRadioButtonFracassada75);
        jRadioButtonFracassada75.setText("Fracassada");

        buttonGroupP75.add(jRadioButtonCompletada75);
        jRadioButtonCompletada75.setText("Completada");
        jRadioButtonCompletada75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCompletada75ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane131, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel286)
                            .addComponent(jRadioButtonIncompleta75)
                            .addComponent(jRadioButtonFracassada75)
                            .addComponent(jRadioButtonCompletada75)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane117, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel258)
                            .addComponent(jRadioButtonIncompleta61)
                            .addComponent(jRadioButtonFracassada61)
                            .addComponent(jRadioButtonCompletada61)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane118, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel260)
                            .addComponent(jRadioButtonIncompleta62)
                            .addComponent(jRadioButtonFracassada62)
                            .addComponent(jRadioButtonCompletada62)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane119, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel262)
                            .addComponent(jRadioButtonIncompleta63)
                            .addComponent(jRadioButtonFracassada63)
                            .addComponent(jRadioButtonCompletada63)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane120, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel264)
                            .addComponent(jRadioButtonIncompleta64)
                            .addComponent(jRadioButtonFracassada64)
                            .addComponent(jRadioButtonCompletada64)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane121, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel266)
                            .addComponent(jRadioButtonIncompleta65)
                            .addComponent(jRadioButtonFracassada65)
                            .addComponent(jRadioButtonCompletada65)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane122, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel268)
                            .addComponent(jRadioButtonIncompleta66)
                            .addComponent(jRadioButtonFracassada66)
                            .addComponent(jRadioButtonCompletada66)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane123, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel270)
                            .addComponent(jRadioButtonIncompleta67)
                            .addComponent(jRadioButtonFracassada67)
                            .addComponent(jRadioButtonCompletada67)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane124, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel272)
                            .addComponent(jRadioButtonIncompleta68)
                            .addComponent(jRadioButtonFracassada68)
                            .addComponent(jRadioButtonCompletada68)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane125, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel274)
                            .addComponent(jRadioButtonIncompleta69)
                            .addComponent(jRadioButtonFracassada69)
                            .addComponent(jRadioButtonCompletada69)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane126, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel276)
                            .addComponent(jRadioButtonIncompleta70)
                            .addComponent(jRadioButtonFracassada70)
                            .addComponent(jRadioButtonCompletada70)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane127, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel278)
                            .addComponent(jRadioButtonIncompleta71)
                            .addComponent(jRadioButtonFracassada71)
                            .addComponent(jRadioButtonCompletada71)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane128, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel280)
                            .addComponent(jRadioButtonIncompleta72)
                            .addComponent(jRadioButtonFracassada72)
                            .addComponent(jRadioButtonCompletada72)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane129, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel282)
                            .addComponent(jRadioButtonIncompleta73)
                            .addComponent(jRadioButtonFracassada73)
                            .addComponent(jRadioButtonCompletada73)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jScrollPane130, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel284)
                            .addComponent(jRadioButtonIncompleta74)
                            .addComponent(jRadioButtonFracassada74)
                            .addComponent(jRadioButtonCompletada74)))
                    .addComponent(jLabel257)
                    .addComponent(jLabel259)
                    .addComponent(jLabel261)
                    .addComponent(jLabel263)
                    .addComponent(jLabel265)
                    .addComponent(jLabel267)
                    .addComponent(jLabel269)
                    .addComponent(jLabel271)
                    .addComponent(jLabel273)
                    .addComponent(jLabel275)
                    .addComponent(jLabel277)
                    .addComponent(jLabel279)
                    .addComponent(jLabel281)
                    .addComponent(jLabel283)
                    .addComponent(jLabel285))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel257)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel258)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonIncompleta61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada61)))
                .addGap(18, 18, 18)
                .addComponent(jLabel259)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel260)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada62)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel261)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel262)
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButtonIncompleta63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada63)))
                .addGap(18, 18, 18)
                .addComponent(jLabel263)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel264)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada64)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel265)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel266)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada65)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel267)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel268)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada66)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel269)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel270)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada67)))
                .addGap(18, 18, 18)
                .addComponent(jLabel271)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel272)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada68)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel273)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel274)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada69)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel275)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel276)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada70))
                    .addComponent(jScrollPane126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel277)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel278)
                        .addGap(4, 4, 4)
                        .addComponent(jRadioButtonIncompleta71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada71))
                    .addComponent(jScrollPane127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel279)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel280)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonIncompleta72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada72))
                    .addComponent(jScrollPane128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel281)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel282)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada73))
                    .addComponent(jScrollPane129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel283)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel284)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada74))
                    .addComponent(jScrollPane130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel285)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel286)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada75))
                    .addComponent(jScrollPane131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel30);

        javax.swing.GroupLayout jPanelCAP5Layout = new javax.swing.GroupLayout(jPanelCAP5);
        jPanelCAP5.setLayout(jPanelCAP5Layout);
        jPanelCAP5Layout.setHorizontalGroup(
            jPanelCAP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelCAP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCAP5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel149))
                .addContainerGap(449, Short.MAX_VALUE))
        );
        jPanelCAP5Layout.setVerticalGroup(
            jPanelCAP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAP5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPaneCap5.setViewportView(jPanelCAP5);

        jTabbedPane1.addTab("Capítulo 05", jScrollPaneCap5);

        jPanelCAPFinal.setPreferredSize(Tela.telaFull());

        jLabel150.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setText("Primárias");

        jPanel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel31.setMaximumSize(new java.awt.Dimension(650, 1955));
        jPanel31.setPreferredSize(new java.awt.Dimension(650, 1955));

        jLabel287.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel287.setText("76 -  Besta apocalíptica");

        jTextAreaP121.setEditable(false);
        jTextAreaP121.setColumns(20);
        jTextAreaP121.setLineWrap(true);
        jTextAreaP121.setRows(5);
        jTextAreaP121.setText("O grupo precisa agora derrotar a Besta apocalíptica\nXP: 10000 - GOLD: 10000 - OUTROS: NADA.");
        jTextAreaP121.setWrapStyleWord(true);
        jScrollPane132.setViewportView(jTextAreaP121);

        jLabel288.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel288.setText("Status: ");

        jLabel289.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel289.setText("77 -  Epílogo");

        jTextAreaP122.setEditable(false);
        jTextAreaP122.setColumns(20);
        jTextAreaP122.setLineWrap(true);
        jTextAreaP122.setRows(5);
        jTextAreaP122.setText("LÊR NA JANELA SOBRE A HISTÓRIA NA ABA 'O FINAL'");
        jTextAreaP122.setWrapStyleWord(true);
        jScrollPane133.setViewportView(jTextAreaP122);

        jLabel290.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel290.setText("Status: ");

        buttonGroupP76.add(jRadioButtonIncompleta76);
        jRadioButtonIncompleta76.setSelected(true);
        jRadioButtonIncompleta76.setText("Incompleta");

        buttonGroupP76.add(jRadioButtonFracassada76);
        jRadioButtonFracassada76.setText("Fracassada");

        buttonGroupP76.add(jRadioButtonCompletada76);
        jRadioButtonCompletada76.setText("Completada");

        buttonGroupP77.add(jRadioButtonIncompleta77);
        jRadioButtonIncompleta77.setSelected(true);
        jRadioButtonIncompleta77.setText("Incompleta");

        buttonGroupP77.add(jRadioButtonFracassada77);
        jRadioButtonFracassada77.setText("Fracassada");

        buttonGroupP77.add(jRadioButtonCompletada77);
        jRadioButtonCompletada77.setText("Completada");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jScrollPane132, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel288)
                            .addComponent(jRadioButtonIncompleta76)
                            .addComponent(jRadioButtonFracassada76)
                            .addComponent(jRadioButtonCompletada76)))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jScrollPane133, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel290)
                            .addComponent(jRadioButtonIncompleta77)
                            .addComponent(jRadioButtonFracassada77)
                            .addComponent(jRadioButtonCompletada77)))
                    .addComponent(jLabel287)
                    .addComponent(jLabel289))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel287)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel288)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonIncompleta76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada76)))
                .addGap(18, 18, 18)
                .addComponent(jLabel289)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel290)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIncompleta77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFracassada77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCompletada77)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCAPFinalLayout = new javax.swing.GroupLayout(jPanelCAPFinal);
        jPanelCAPFinal.setLayout(jPanelCAPFinalLayout);
        jPanelCAPFinalLayout.setHorizontalGroup(
            jPanelCAPFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAPFinalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelCAPFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCAPFinalLayout.setVerticalGroup(
            jPanelCAPFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCAPFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capítulo Final", jPanelCAPFinal);

        jPanelAtivSecundaria.setPreferredSize(Tela.telaFull());

        jLabeRecompensaDesc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabeRecompensaDesc.setForeground(new java.awt.Color(255, 255, 255));
        jLabeRecompensaDesc.setText("Recompensas: ");

        jTextAreaRecDesc.setEditable(false);
        jTextAreaRecDesc.setColumns(20);
        jTextAreaRecDesc.setRows(5);
        jTextAreaRecDesc.setText("Retomada: Munição, 1 pílula - P, 400xp, 1 assentamento aliado a mais. \n\nServiço de escolta: Munição, granadas, 400xp.\n\nAuxiliar do capeta: 400xp, vacina anti-infecção, 5 componentes de cada tipo.\n\nGuerra ao terror: Munição, uma arma de fogo aleatória ou um equipamento, 400xp.\n\nSelamento: 500xp, vacina anti-infecção, 1 spray de primeiros socorros.\n\nDesestabilização: 800xp, uma arma de fogo especial.\n\nReconectando: 600xp, 15 componentes eletrônicos.\n\nExtinção: 1000xp.\n\nSem paz/luz: 600xp, 300 gold, +10 Karma + (Remoção de todo debuffer ativo).\n");
        jTextAreaRecDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane6.setViewportView(jTextAreaRecDesc);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));

        jLabel135.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel135.setText("/3");

        jLabel24.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel24.setText("/14");

        jLabel140.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel140.setText("/7");

        jLabel129.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel129.setText("Auxiliar do capeta:");

        jLabel137.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel137.setText("Reconectando:");

        jLabel136.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel136.setText("Desestabilização: ");

        jLabel133.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel133.setText("Selamento: ");

        jTextFieldReconectando.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldReconectando.setText("0");
        jTextFieldReconectando.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldReconectandoKeyTyped(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel134.setText("/11");

        jTextFieldSemLuz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldSemLuz.setText("0");
        jTextFieldSemLuz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSemLuzKeyTyped(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel130.setText("/6");

        jLabel138.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel138.setText("/7");

        jTextFieldExtincao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldExtincao.setText("0");
        jTextFieldExtincao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldExtincaoKeyTyped(evt);
            }
        });

        jLabel141.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel141.setText("Sem paz");

        jLabel23.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel23.setText("Retomada: ");

        jLabel128.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel128.setText("/6");

        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel25.setText("Serviço de Escolta:");

        jTextFieldDesestabilizacao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDesestabilizacao.setText("0");
        jTextFieldDesestabilizacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDesestabilizacaoKeyTyped(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel142.setText("/6");

        jTextFieldEscolta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldEscolta.setText("0");
        jTextFieldEscolta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEscoltaKeyTyped(evt);
            }
        });

        jTextFieldSelamento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldSelamento.setText("0");
        jTextFieldSelamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSelamentoKeyTyped(evt);
            }
        });

        jTextFieldRetomada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldRetomada.setText("0");
        jTextFieldRetomada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRetomadaKeyTyped(evt);
            }
        });

        jTextFieldSemPaz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldSemPaz.setText("0");
        jTextFieldSemPaz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSemPazKeyTyped(evt);
            }
        });

        jLabel132.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel132.setText("/11");

        jTextFieldGuerraTerror.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldGuerraTerror.setText("0");
        jTextFieldGuerraTerror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldGuerraTerrorKeyTyped(evt);
            }
        });

        jLabel143.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel143.setText("Sem luz");

        jLabel144.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel144.setText("/4");

        jLabel131.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel131.setText("Guerra ao terror: ");

        jLabel139.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel139.setText("Extinção");

        jTextFieldAuxiliarCapt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldAuxiliarCapt.setText("0");
        jTextFieldAuxiliarCapt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAuxiliarCaptKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRetomada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEscolta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel128))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAuxiliarCapt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel130))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldGuerraTerror, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel132))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel134))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDesestabilizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel135))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldReconectando, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel138))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel139)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExtincao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel140))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel141)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSemPaz, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel142))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSemLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel144)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldRetomada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextFieldEscolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(jTextFieldAuxiliarCapt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(jTextFieldGuerraTerror, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(jTextFieldSelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jTextFieldDesestabilizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(jTextFieldReconectando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(jTextFieldExtincao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(jTextFieldSemPaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel142))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(jTextFieldSemLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel144))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButtonDescRec.setText("Descrição");
        jToggleButtonDescRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonDescRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAtivSecundariaLayout = new javax.swing.GroupLayout(jPanelAtivSecundaria);
        jPanelAtivSecundaria.setLayout(jPanelAtivSecundariaLayout);
        jPanelAtivSecundariaLayout.setHorizontalGroup(
            jPanelAtivSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtivSecundariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(jPanelAtivSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeRecompensaDesc)
                    .addGroup(jPanelAtivSecundariaLayout.createSequentialGroup()
                        .addGroup(jPanelAtivSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButtonDescRec)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAtivSecundariaLayout.setVerticalGroup(
            jPanelAtivSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtivSecundariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAtivSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAtivSecundariaLayout.createSequentialGroup()
                        .addComponent(jLabeRecompensaDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonDescRec)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAtivSecundariaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jTabbedPane1.addTab("Atividades Secundárias", jPanelAtivSecundaria);

        jMenuBar.setToolTipText("Dúvidas e Dicas");

        jMenuVoltar.setText("Voltar ao jogo");
        jMenuVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVoltarMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuVoltar);

        jMenuEvento.setText("Gerador de Eventos");
        jMenuEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEventoMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuEvento);

        jMenuSaveLoad.setText("Save/Load");
        jMenuSaveLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSaveLoadMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuSaveLoad);

        jMenuCreditos.setText("Creditos");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//<editor-fold defaultstate="collapsed" desc=" Campos ">
    private void jMenuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenuVoltarMouseClicked

    private void jMenuCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCreditosMouseClicked
        Creditos.creditos();
    }//GEN-LAST:event_jMenuCreditosMouseClicked

    private void jMenuCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCreditosActionPerformed

    }//GEN-LAST:event_jMenuCreditosActionPerformed

    private void jMenuEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEventoMouseClicked
        evento.setEnabled(true);
        evento.setVisible(true);
        evento.toFront();
    }//GEN-LAST:event_jMenuEventoMouseClicked

    private void jTextFieldRetomadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRetomadaKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldRetomadaKeyTyped

    private void jTextFieldEscoltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEscoltaKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldEscoltaKeyTyped

    private void jTextFieldAuxiliarCaptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAuxiliarCaptKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldAuxiliarCaptKeyTyped

    private void jTextFieldGuerraTerrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGuerraTerrorKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldGuerraTerrorKeyTyped

    private void jTextFieldSelamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSelamentoKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldSelamentoKeyTyped

    private void jTextFieldDesestabilizacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDesestabilizacaoKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldDesestabilizacaoKeyTyped

    private void jTextFieldReconectandoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldReconectandoKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldReconectandoKeyTyped

    private void jTextFieldExtincaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldExtincaoKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldExtincaoKeyTyped

    private void jTextFieldSemPazKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSemPazKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldSemPazKeyTyped

    private void jTextFieldSemLuzKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSemLuzKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldSemLuzKeyTyped
//</editor-fold>
    private void jMenuSaveLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSaveLoadMouseClicked
        UnrealSystemRPGView.jDialogProgressao.setEnabled(true);
        UnrealSystemRPGView.jDialogProgressao.setVisible(true);
        UnrealSystemRPGView.jDialogProgressao.toFront();
    }//GEN-LAST:event_jMenuSaveLoadMouseClicked

    private void jRadioButtonCompletada60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCompletada60ActionPerformed
        JOptionPane.showMessageDialog(null, "Capítulo 4 concluído!");
        progresso = 80;
        UnrealSystemRPGView.jProgressBaEstoria.setValue(progresso);    
    }//GEN-LAST:event_jRadioButtonCompletada60ActionPerformed

    private void jRadioButtonCompletada45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCompletada45ActionPerformed
        JOptionPane.showMessageDialog(null, "Capítulo 3 concluído!");
        progresso = 60;
        UnrealSystemRPGView.jProgressBaEstoria.setValue(progresso);
    }//GEN-LAST:event_jRadioButtonCompletada45ActionPerformed

    private void jRadioButtonCompletada30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCompletada30ActionPerformed
        JOptionPane.showMessageDialog(null, "Capítulo 2 concluído!");
        progresso = 40;
        UnrealSystemRPGView.jProgressBaEstoria.setValue(progresso);
    }//GEN-LAST:event_jRadioButtonCompletada30ActionPerformed

    private void jRadioButtonCompletada15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCompletada15ActionPerformed
        JOptionPane.showMessageDialog(null, "Capítulo 1 concluído!");
        progresso = 20;
        UnrealSystemRPGView.jProgressBaEstoria.setValue(progresso);
    }//GEN-LAST:event_jRadioButtonCompletada15ActionPerformed

    private void jRadioButtonCompletada75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCompletada75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCompletada75ActionPerformed

    private void jToggleButtonDescRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDescRecActionPerformed
        boolean aux = jToggleButtonDescRec.isSelected();
        
        if(aux){
            jLabeRecompensaDesc.setText("Descrição");
            Atividades.setDesc(jTextAreaRecDesc);
            jToggleButtonDescRec.setText("Recompensa");
        }else{
            jLabeRecompensaDesc.setText("Recompensa");
            Atividades.setRecompensa(jTextAreaRecDesc);
            jToggleButtonDescRec.setText("Descrição");
        }
        
    }//GEN-LAST:event_jToggleButtonDescRecActionPerformed

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
            java.util.logging.Logger.getLogger(CapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapView().setVisible(true);
            }
        });
    }

//<editor-fold defaultstate="collapsed" desc=" ... ">

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupP01;
    private javax.swing.ButtonGroup buttonGroupP02;
    private javax.swing.ButtonGroup buttonGroupP03;
    private javax.swing.ButtonGroup buttonGroupP04;
    private javax.swing.ButtonGroup buttonGroupP05;
    private javax.swing.ButtonGroup buttonGroupP06;
    private javax.swing.ButtonGroup buttonGroupP07;
    private javax.swing.ButtonGroup buttonGroupP08;
    private javax.swing.ButtonGroup buttonGroupP09;
    private javax.swing.ButtonGroup buttonGroupP10;
    private javax.swing.ButtonGroup buttonGroupP11;
    private javax.swing.ButtonGroup buttonGroupP12;
    private javax.swing.ButtonGroup buttonGroupP13;
    private javax.swing.ButtonGroup buttonGroupP14;
    private javax.swing.ButtonGroup buttonGroupP15;
    private javax.swing.ButtonGroup buttonGroupP16;
    private javax.swing.ButtonGroup buttonGroupP17;
    private javax.swing.ButtonGroup buttonGroupP18;
    private javax.swing.ButtonGroup buttonGroupP19;
    private javax.swing.ButtonGroup buttonGroupP20;
    private javax.swing.ButtonGroup buttonGroupP21;
    private javax.swing.ButtonGroup buttonGroupP22;
    private javax.swing.ButtonGroup buttonGroupP23;
    private javax.swing.ButtonGroup buttonGroupP24;
    private javax.swing.ButtonGroup buttonGroupP25;
    private javax.swing.ButtonGroup buttonGroupP26;
    private javax.swing.ButtonGroup buttonGroupP27;
    private javax.swing.ButtonGroup buttonGroupP28;
    private javax.swing.ButtonGroup buttonGroupP29;
    private javax.swing.ButtonGroup buttonGroupP30;
    private javax.swing.ButtonGroup buttonGroupP31;
    private javax.swing.ButtonGroup buttonGroupP32;
    private javax.swing.ButtonGroup buttonGroupP33;
    private javax.swing.ButtonGroup buttonGroupP34;
    private javax.swing.ButtonGroup buttonGroupP35;
    private javax.swing.ButtonGroup buttonGroupP36;
    private javax.swing.ButtonGroup buttonGroupP37;
    private javax.swing.ButtonGroup buttonGroupP38;
    private javax.swing.ButtonGroup buttonGroupP39;
    private javax.swing.ButtonGroup buttonGroupP40;
    private javax.swing.ButtonGroup buttonGroupP41;
    private javax.swing.ButtonGroup buttonGroupP42;
    private javax.swing.ButtonGroup buttonGroupP43;
    private javax.swing.ButtonGroup buttonGroupP44;
    private javax.swing.ButtonGroup buttonGroupP45;
    private javax.swing.ButtonGroup buttonGroupP46;
    private javax.swing.ButtonGroup buttonGroupP47;
    private javax.swing.ButtonGroup buttonGroupP48;
    private javax.swing.ButtonGroup buttonGroupP49;
    private javax.swing.ButtonGroup buttonGroupP50;
    private javax.swing.ButtonGroup buttonGroupP51;
    private javax.swing.ButtonGroup buttonGroupP52;
    private javax.swing.ButtonGroup buttonGroupP53;
    private javax.swing.ButtonGroup buttonGroupP54;
    private javax.swing.ButtonGroup buttonGroupP55;
    private javax.swing.ButtonGroup buttonGroupP56;
    private javax.swing.ButtonGroup buttonGroupP57;
    private javax.swing.ButtonGroup buttonGroupP58;
    private javax.swing.ButtonGroup buttonGroupP59;
    private javax.swing.ButtonGroup buttonGroupP60;
    private javax.swing.ButtonGroup buttonGroupP61;
    private javax.swing.ButtonGroup buttonGroupP62;
    private javax.swing.ButtonGroup buttonGroupP63;
    private javax.swing.ButtonGroup buttonGroupP64;
    private javax.swing.ButtonGroup buttonGroupP65;
    private javax.swing.ButtonGroup buttonGroupP66;
    private javax.swing.ButtonGroup buttonGroupP67;
    private javax.swing.ButtonGroup buttonGroupP68;
    private javax.swing.ButtonGroup buttonGroupP69;
    private javax.swing.ButtonGroup buttonGroupP70;
    private javax.swing.ButtonGroup buttonGroupP71;
    private javax.swing.ButtonGroup buttonGroupP72;
    private javax.swing.ButtonGroup buttonGroupP73;
    private javax.swing.ButtonGroup buttonGroupP74;
    private javax.swing.ButtonGroup buttonGroupP75;
    private javax.swing.ButtonGroup buttonGroupP76;
    private javax.swing.ButtonGroup buttonGroupP77;
    private javax.swing.ButtonGroup buttonGroupS01;
    private javax.swing.ButtonGroup buttonGroupS02;
    private javax.swing.ButtonGroup buttonGroupS03;
    private javax.swing.ButtonGroup buttonGroupS04;
    private javax.swing.ButtonGroup buttonGroupS05;
    private javax.swing.ButtonGroup buttonGroupS06;
    private javax.swing.ButtonGroup buttonGroupS07;
    private javax.swing.ButtonGroup buttonGroupS08;
    private javax.swing.ButtonGroup buttonGroupS09;
    private javax.swing.ButtonGroup buttonGroupS10;
    private javax.swing.ButtonGroup buttonGroupS11;
    private javax.swing.ButtonGroup buttonGroupS12;
    private javax.swing.ButtonGroup buttonGroupS13;
    private javax.swing.ButtonGroup buttonGroupS14;
    private javax.swing.ButtonGroup buttonGroupS15;
    private javax.swing.ButtonGroup buttonGroupS16;
    private javax.swing.ButtonGroup buttonGroupS17;
    private javax.swing.ButtonGroup buttonGroupS18;
    private javax.swing.ButtonGroup buttonGroupS19;
    private javax.swing.ButtonGroup buttonGroupS20;
    private javax.swing.ButtonGroup buttonGroupS21;
    private javax.swing.ButtonGroup buttonGroupS22;
    private javax.swing.ButtonGroup buttonGroupS23;
    private javax.swing.ButtonGroup buttonGroupS24;
    private javax.swing.ButtonGroup buttonGroupS25;
    private javax.swing.ButtonGroup buttonGroupS26;
    private javax.swing.ButtonGroup buttonGroupS27;
    private javax.swing.ButtonGroup buttonGroupS28;
    private javax.swing.ButtonGroup buttonGroupS29;
    private javax.swing.ButtonGroup buttonGroupS30;
    private javax.swing.ButtonGroup buttonGroupS31;
    private javax.swing.ButtonGroup buttonGroupS32;
    private javax.swing.ButtonGroup buttonGroupS33;
    private javax.swing.ButtonGroup buttonGroupS34;
    private javax.swing.ButtonGroup buttonGroupS35;
    private javax.swing.JLabel jLabeRecompensaDesc;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCreditos;
    private javax.swing.JMenu jMenuEvento;
    private javax.swing.JMenu jMenuSaveLoad;
    private javax.swing.JMenu jMenuVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanelAtivSecundaria;
    private javax.swing.JPanel jPanelCAP1;
    private javax.swing.JPanel jPanelCAP2;
    private javax.swing.JPanel jPanelCAP3;
    private javax.swing.JPanel jPanelCAP4;
    private javax.swing.JPanel jPanelCAP5;
    private javax.swing.JPanel jPanelCAPFinal;
    private javax.swing.JRadioButton jRadioButtonCompletada1;
    private javax.swing.JRadioButton jRadioButtonCompletada10;
    private javax.swing.JRadioButton jRadioButtonCompletada11;
    private javax.swing.JRadioButton jRadioButtonCompletada12;
    private javax.swing.JRadioButton jRadioButtonCompletada13;
    private javax.swing.JRadioButton jRadioButtonCompletada14;
    private javax.swing.JRadioButton jRadioButtonCompletada15;
    private javax.swing.JRadioButton jRadioButtonCompletada16;
    private javax.swing.JRadioButton jRadioButtonCompletada17;
    private javax.swing.JRadioButton jRadioButtonCompletada18;
    private javax.swing.JRadioButton jRadioButtonCompletada19;
    private javax.swing.JRadioButton jRadioButtonCompletada2;
    private javax.swing.JRadioButton jRadioButtonCompletada20;
    private javax.swing.JRadioButton jRadioButtonCompletada21;
    private javax.swing.JRadioButton jRadioButtonCompletada22;
    private javax.swing.JRadioButton jRadioButtonCompletada23;
    private javax.swing.JRadioButton jRadioButtonCompletada24;
    private javax.swing.JRadioButton jRadioButtonCompletada25;
    private javax.swing.JRadioButton jRadioButtonCompletada26;
    private javax.swing.JRadioButton jRadioButtonCompletada27;
    private javax.swing.JRadioButton jRadioButtonCompletada28;
    private javax.swing.JRadioButton jRadioButtonCompletada29;
    private javax.swing.JRadioButton jRadioButtonCompletada3;
    private javax.swing.JRadioButton jRadioButtonCompletada30;
    private javax.swing.JRadioButton jRadioButtonCompletada31;
    private javax.swing.JRadioButton jRadioButtonCompletada32;
    private javax.swing.JRadioButton jRadioButtonCompletada33;
    private javax.swing.JRadioButton jRadioButtonCompletada34;
    private javax.swing.JRadioButton jRadioButtonCompletada35;
    private javax.swing.JRadioButton jRadioButtonCompletada36;
    private javax.swing.JRadioButton jRadioButtonCompletada37;
    private javax.swing.JRadioButton jRadioButtonCompletada38;
    private javax.swing.JRadioButton jRadioButtonCompletada39;
    private javax.swing.JRadioButton jRadioButtonCompletada4;
    private javax.swing.JRadioButton jRadioButtonCompletada40;
    private javax.swing.JRadioButton jRadioButtonCompletada41;
    private javax.swing.JRadioButton jRadioButtonCompletada42;
    private javax.swing.JRadioButton jRadioButtonCompletada43;
    private javax.swing.JRadioButton jRadioButtonCompletada44;
    private javax.swing.JRadioButton jRadioButtonCompletada45;
    private javax.swing.JRadioButton jRadioButtonCompletada46;
    private javax.swing.JRadioButton jRadioButtonCompletada47;
    private javax.swing.JRadioButton jRadioButtonCompletada48;
    private javax.swing.JRadioButton jRadioButtonCompletada49;
    private javax.swing.JRadioButton jRadioButtonCompletada5;
    private javax.swing.JRadioButton jRadioButtonCompletada50;
    private javax.swing.JRadioButton jRadioButtonCompletada51;
    private javax.swing.JRadioButton jRadioButtonCompletada52;
    private javax.swing.JRadioButton jRadioButtonCompletada53;
    private javax.swing.JRadioButton jRadioButtonCompletada54;
    private javax.swing.JRadioButton jRadioButtonCompletada55;
    private javax.swing.JRadioButton jRadioButtonCompletada56;
    private javax.swing.JRadioButton jRadioButtonCompletada57;
    private javax.swing.JRadioButton jRadioButtonCompletada58;
    private javax.swing.JRadioButton jRadioButtonCompletada59;
    private javax.swing.JRadioButton jRadioButtonCompletada6;
    private javax.swing.JRadioButton jRadioButtonCompletada60;
    private javax.swing.JRadioButton jRadioButtonCompletada61;
    private javax.swing.JRadioButton jRadioButtonCompletada62;
    private javax.swing.JRadioButton jRadioButtonCompletada63;
    private javax.swing.JRadioButton jRadioButtonCompletada64;
    private javax.swing.JRadioButton jRadioButtonCompletada65;
    private javax.swing.JRadioButton jRadioButtonCompletada66;
    private javax.swing.JRadioButton jRadioButtonCompletada67;
    private javax.swing.JRadioButton jRadioButtonCompletada68;
    private javax.swing.JRadioButton jRadioButtonCompletada69;
    private javax.swing.JRadioButton jRadioButtonCompletada7;
    private javax.swing.JRadioButton jRadioButtonCompletada70;
    private javax.swing.JRadioButton jRadioButtonCompletada71;
    private javax.swing.JRadioButton jRadioButtonCompletada72;
    private javax.swing.JRadioButton jRadioButtonCompletada73;
    private javax.swing.JRadioButton jRadioButtonCompletada74;
    private javax.swing.JRadioButton jRadioButtonCompletada75;
    private javax.swing.JRadioButton jRadioButtonCompletada76;
    private javax.swing.JRadioButton jRadioButtonCompletada77;
    private javax.swing.JRadioButton jRadioButtonCompletada8;
    private javax.swing.JRadioButton jRadioButtonCompletada9;
    private javax.swing.JRadioButton jRadioButtonCompletadaS1;
    private javax.swing.JRadioButton jRadioButtonCompletadaS10;
    private javax.swing.JRadioButton jRadioButtonCompletadaS11;
    private javax.swing.JRadioButton jRadioButtonCompletadaS12;
    private javax.swing.JRadioButton jRadioButtonCompletadaS13;
    private javax.swing.JRadioButton jRadioButtonCompletadaS14;
    private javax.swing.JRadioButton jRadioButtonCompletadaS15;
    private javax.swing.JRadioButton jRadioButtonCompletadaS16;
    private javax.swing.JRadioButton jRadioButtonCompletadaS17;
    private javax.swing.JRadioButton jRadioButtonCompletadaS18;
    private javax.swing.JRadioButton jRadioButtonCompletadaS19;
    private javax.swing.JRadioButton jRadioButtonCompletadaS2;
    private javax.swing.JRadioButton jRadioButtonCompletadaS20;
    private javax.swing.JRadioButton jRadioButtonCompletadaS21;
    private javax.swing.JRadioButton jRadioButtonCompletadaS22;
    private javax.swing.JRadioButton jRadioButtonCompletadaS23;
    private javax.swing.JRadioButton jRadioButtonCompletadaS24;
    private javax.swing.JRadioButton jRadioButtonCompletadaS25;
    private javax.swing.JRadioButton jRadioButtonCompletadaS26;
    private javax.swing.JRadioButton jRadioButtonCompletadaS27;
    private javax.swing.JRadioButton jRadioButtonCompletadaS28;
    private javax.swing.JRadioButton jRadioButtonCompletadaS29;
    private javax.swing.JRadioButton jRadioButtonCompletadaS3;
    private javax.swing.JRadioButton jRadioButtonCompletadaS30;
    private javax.swing.JRadioButton jRadioButtonCompletadaS31;
    private javax.swing.JRadioButton jRadioButtonCompletadaS32;
    private javax.swing.JRadioButton jRadioButtonCompletadaS33;
    private javax.swing.JRadioButton jRadioButtonCompletadaS34;
    private javax.swing.JRadioButton jRadioButtonCompletadaS35;
    private javax.swing.JRadioButton jRadioButtonCompletadaS36;
    private javax.swing.JRadioButton jRadioButtonCompletadaS4;
    private javax.swing.JRadioButton jRadioButtonCompletadaS5;
    private javax.swing.JRadioButton jRadioButtonCompletadaS6;
    private javax.swing.JRadioButton jRadioButtonCompletadaS7;
    private javax.swing.JRadioButton jRadioButtonCompletadaS8;
    private javax.swing.JRadioButton jRadioButtonCompletadaS9;
    private javax.swing.JRadioButton jRadioButtonFracassada1;
    private javax.swing.JRadioButton jRadioButtonFracassada10;
    private javax.swing.JRadioButton jRadioButtonFracassada11;
    private javax.swing.JRadioButton jRadioButtonFracassada12;
    private javax.swing.JRadioButton jRadioButtonFracassada13;
    private javax.swing.JRadioButton jRadioButtonFracassada14;
    private javax.swing.JRadioButton jRadioButtonFracassada15;
    private javax.swing.JRadioButton jRadioButtonFracassada16;
    private javax.swing.JRadioButton jRadioButtonFracassada17;
    private javax.swing.JRadioButton jRadioButtonFracassada18;
    private javax.swing.JRadioButton jRadioButtonFracassada19;
    private javax.swing.JRadioButton jRadioButtonFracassada2;
    private javax.swing.JRadioButton jRadioButtonFracassada20;
    private javax.swing.JRadioButton jRadioButtonFracassada21;
    private javax.swing.JRadioButton jRadioButtonFracassada22;
    private javax.swing.JRadioButton jRadioButtonFracassada23;
    private javax.swing.JRadioButton jRadioButtonFracassada24;
    private javax.swing.JRadioButton jRadioButtonFracassada25;
    private javax.swing.JRadioButton jRadioButtonFracassada26;
    private javax.swing.JRadioButton jRadioButtonFracassada27;
    private javax.swing.JRadioButton jRadioButtonFracassada28;
    private javax.swing.JRadioButton jRadioButtonFracassada29;
    private javax.swing.JRadioButton jRadioButtonFracassada3;
    private javax.swing.JRadioButton jRadioButtonFracassada30;
    private javax.swing.JRadioButton jRadioButtonFracassada31;
    private javax.swing.JRadioButton jRadioButtonFracassada32;
    private javax.swing.JRadioButton jRadioButtonFracassada33;
    private javax.swing.JRadioButton jRadioButtonFracassada34;
    private javax.swing.JRadioButton jRadioButtonFracassada35;
    private javax.swing.JRadioButton jRadioButtonFracassada36;
    private javax.swing.JRadioButton jRadioButtonFracassada37;
    private javax.swing.JRadioButton jRadioButtonFracassada38;
    private javax.swing.JRadioButton jRadioButtonFracassada39;
    private javax.swing.JRadioButton jRadioButtonFracassada4;
    private javax.swing.JRadioButton jRadioButtonFracassada40;
    private javax.swing.JRadioButton jRadioButtonFracassada41;
    private javax.swing.JRadioButton jRadioButtonFracassada42;
    private javax.swing.JRadioButton jRadioButtonFracassada43;
    private javax.swing.JRadioButton jRadioButtonFracassada44;
    private javax.swing.JRadioButton jRadioButtonFracassada45;
    private javax.swing.JRadioButton jRadioButtonFracassada46;
    private javax.swing.JRadioButton jRadioButtonFracassada47;
    private javax.swing.JRadioButton jRadioButtonFracassada48;
    private javax.swing.JRadioButton jRadioButtonFracassada49;
    private javax.swing.JRadioButton jRadioButtonFracassada5;
    private javax.swing.JRadioButton jRadioButtonFracassada50;
    private javax.swing.JRadioButton jRadioButtonFracassada51;
    private javax.swing.JRadioButton jRadioButtonFracassada52;
    private javax.swing.JRadioButton jRadioButtonFracassada53;
    private javax.swing.JRadioButton jRadioButtonFracassada54;
    private javax.swing.JRadioButton jRadioButtonFracassada55;
    private javax.swing.JRadioButton jRadioButtonFracassada56;
    private javax.swing.JRadioButton jRadioButtonFracassada57;
    private javax.swing.JRadioButton jRadioButtonFracassada58;
    private javax.swing.JRadioButton jRadioButtonFracassada59;
    private javax.swing.JRadioButton jRadioButtonFracassada6;
    private javax.swing.JRadioButton jRadioButtonFracassada60;
    private javax.swing.JRadioButton jRadioButtonFracassada61;
    private javax.swing.JRadioButton jRadioButtonFracassada62;
    private javax.swing.JRadioButton jRadioButtonFracassada63;
    private javax.swing.JRadioButton jRadioButtonFracassada64;
    private javax.swing.JRadioButton jRadioButtonFracassada65;
    private javax.swing.JRadioButton jRadioButtonFracassada66;
    private javax.swing.JRadioButton jRadioButtonFracassada67;
    private javax.swing.JRadioButton jRadioButtonFracassada68;
    private javax.swing.JRadioButton jRadioButtonFracassada69;
    private javax.swing.JRadioButton jRadioButtonFracassada7;
    private javax.swing.JRadioButton jRadioButtonFracassada70;
    private javax.swing.JRadioButton jRadioButtonFracassada71;
    private javax.swing.JRadioButton jRadioButtonFracassada72;
    private javax.swing.JRadioButton jRadioButtonFracassada73;
    private javax.swing.JRadioButton jRadioButtonFracassada74;
    private javax.swing.JRadioButton jRadioButtonFracassada75;
    private javax.swing.JRadioButton jRadioButtonFracassada76;
    private javax.swing.JRadioButton jRadioButtonFracassada77;
    private javax.swing.JRadioButton jRadioButtonFracassada8;
    private javax.swing.JRadioButton jRadioButtonFracassada9;
    private javax.swing.JRadioButton jRadioButtonFracassadaS1;
    private javax.swing.JRadioButton jRadioButtonFracassadaS10;
    private javax.swing.JRadioButton jRadioButtonFracassadaS11;
    private javax.swing.JRadioButton jRadioButtonFracassadaS12;
    private javax.swing.JRadioButton jRadioButtonFracassadaS13;
    private javax.swing.JRadioButton jRadioButtonFracassadaS14;
    private javax.swing.JRadioButton jRadioButtonFracassadaS15;
    private javax.swing.JRadioButton jRadioButtonFracassadaS16;
    private javax.swing.JRadioButton jRadioButtonFracassadaS17;
    private javax.swing.JRadioButton jRadioButtonFracassadaS18;
    private javax.swing.JRadioButton jRadioButtonFracassadaS19;
    private javax.swing.JRadioButton jRadioButtonFracassadaS2;
    private javax.swing.JRadioButton jRadioButtonFracassadaS20;
    private javax.swing.JRadioButton jRadioButtonFracassadaS21;
    private javax.swing.JRadioButton jRadioButtonFracassadaS22;
    private javax.swing.JRadioButton jRadioButtonFracassadaS23;
    private javax.swing.JRadioButton jRadioButtonFracassadaS24;
    private javax.swing.JRadioButton jRadioButtonFracassadaS25;
    private javax.swing.JRadioButton jRadioButtonFracassadaS26;
    private javax.swing.JRadioButton jRadioButtonFracassadaS27;
    private javax.swing.JRadioButton jRadioButtonFracassadaS28;
    private javax.swing.JRadioButton jRadioButtonFracassadaS29;
    private javax.swing.JRadioButton jRadioButtonFracassadaS3;
    private javax.swing.JRadioButton jRadioButtonFracassadaS30;
    private javax.swing.JRadioButton jRadioButtonFracassadaS31;
    private javax.swing.JRadioButton jRadioButtonFracassadaS32;
    private javax.swing.JRadioButton jRadioButtonFracassadaS33;
    private javax.swing.JRadioButton jRadioButtonFracassadaS34;
    private javax.swing.JRadioButton jRadioButtonFracassadaS35;
    private javax.swing.JRadioButton jRadioButtonFracassadaS36;
    private javax.swing.JRadioButton jRadioButtonFracassadaS4;
    private javax.swing.JRadioButton jRadioButtonFracassadaS5;
    private javax.swing.JRadioButton jRadioButtonFracassadaS6;
    private javax.swing.JRadioButton jRadioButtonFracassadaS7;
    private javax.swing.JRadioButton jRadioButtonFracassadaS8;
    private javax.swing.JRadioButton jRadioButtonFracassadaS9;
    private javax.swing.JRadioButton jRadioButtonIncompleta1;
    private javax.swing.JRadioButton jRadioButtonIncompleta10;
    private javax.swing.JRadioButton jRadioButtonIncompleta11;
    private javax.swing.JRadioButton jRadioButtonIncompleta12;
    private javax.swing.JRadioButton jRadioButtonIncompleta13;
    private javax.swing.JRadioButton jRadioButtonIncompleta14;
    private javax.swing.JRadioButton jRadioButtonIncompleta15;
    private javax.swing.JRadioButton jRadioButtonIncompleta16;
    private javax.swing.JRadioButton jRadioButtonIncompleta17;
    private javax.swing.JRadioButton jRadioButtonIncompleta18;
    private javax.swing.JRadioButton jRadioButtonIncompleta19;
    private javax.swing.JRadioButton jRadioButtonIncompleta2;
    private javax.swing.JRadioButton jRadioButtonIncompleta20;
    private javax.swing.JRadioButton jRadioButtonIncompleta21;
    private javax.swing.JRadioButton jRadioButtonIncompleta22;
    private javax.swing.JRadioButton jRadioButtonIncompleta23;
    private javax.swing.JRadioButton jRadioButtonIncompleta24;
    private javax.swing.JRadioButton jRadioButtonIncompleta25;
    private javax.swing.JRadioButton jRadioButtonIncompleta26;
    private javax.swing.JRadioButton jRadioButtonIncompleta27;
    private javax.swing.JRadioButton jRadioButtonIncompleta28;
    private javax.swing.JRadioButton jRadioButtonIncompleta29;
    private javax.swing.JRadioButton jRadioButtonIncompleta3;
    private javax.swing.JRadioButton jRadioButtonIncompleta30;
    private javax.swing.JRadioButton jRadioButtonIncompleta31;
    private javax.swing.JRadioButton jRadioButtonIncompleta32;
    private javax.swing.JRadioButton jRadioButtonIncompleta33;
    private javax.swing.JRadioButton jRadioButtonIncompleta34;
    private javax.swing.JRadioButton jRadioButtonIncompleta35;
    private javax.swing.JRadioButton jRadioButtonIncompleta36;
    private javax.swing.JRadioButton jRadioButtonIncompleta37;
    private javax.swing.JRadioButton jRadioButtonIncompleta38;
    private javax.swing.JRadioButton jRadioButtonIncompleta39;
    private javax.swing.JRadioButton jRadioButtonIncompleta4;
    private javax.swing.JRadioButton jRadioButtonIncompleta40;
    private javax.swing.JRadioButton jRadioButtonIncompleta41;
    private javax.swing.JRadioButton jRadioButtonIncompleta42;
    private javax.swing.JRadioButton jRadioButtonIncompleta43;
    private javax.swing.JRadioButton jRadioButtonIncompleta44;
    private javax.swing.JRadioButton jRadioButtonIncompleta45;
    private javax.swing.JRadioButton jRadioButtonIncompleta46;
    private javax.swing.JRadioButton jRadioButtonIncompleta47;
    private javax.swing.JRadioButton jRadioButtonIncompleta48;
    private javax.swing.JRadioButton jRadioButtonIncompleta49;
    private javax.swing.JRadioButton jRadioButtonIncompleta5;
    private javax.swing.JRadioButton jRadioButtonIncompleta50;
    private javax.swing.JRadioButton jRadioButtonIncompleta51;
    private javax.swing.JRadioButton jRadioButtonIncompleta52;
    private javax.swing.JRadioButton jRadioButtonIncompleta53;
    private javax.swing.JRadioButton jRadioButtonIncompleta54;
    private javax.swing.JRadioButton jRadioButtonIncompleta55;
    private javax.swing.JRadioButton jRadioButtonIncompleta56;
    private javax.swing.JRadioButton jRadioButtonIncompleta57;
    private javax.swing.JRadioButton jRadioButtonIncompleta58;
    private javax.swing.JRadioButton jRadioButtonIncompleta59;
    private javax.swing.JRadioButton jRadioButtonIncompleta6;
    private javax.swing.JRadioButton jRadioButtonIncompleta60;
    private javax.swing.JRadioButton jRadioButtonIncompleta61;
    private javax.swing.JRadioButton jRadioButtonIncompleta62;
    private javax.swing.JRadioButton jRadioButtonIncompleta63;
    private javax.swing.JRadioButton jRadioButtonIncompleta64;
    private javax.swing.JRadioButton jRadioButtonIncompleta65;
    private javax.swing.JRadioButton jRadioButtonIncompleta66;
    private javax.swing.JRadioButton jRadioButtonIncompleta67;
    private javax.swing.JRadioButton jRadioButtonIncompleta68;
    private javax.swing.JRadioButton jRadioButtonIncompleta69;
    private javax.swing.JRadioButton jRadioButtonIncompleta7;
    private javax.swing.JRadioButton jRadioButtonIncompleta70;
    private javax.swing.JRadioButton jRadioButtonIncompleta71;
    private javax.swing.JRadioButton jRadioButtonIncompleta72;
    private javax.swing.JRadioButton jRadioButtonIncompleta73;
    private javax.swing.JRadioButton jRadioButtonIncompleta74;
    private javax.swing.JRadioButton jRadioButtonIncompleta75;
    private javax.swing.JRadioButton jRadioButtonIncompleta76;
    private javax.swing.JRadioButton jRadioButtonIncompleta77;
    private javax.swing.JRadioButton jRadioButtonIncompleta8;
    private javax.swing.JRadioButton jRadioButtonIncompleta9;
    private javax.swing.JRadioButton jRadioButtonIncompletaS1;
    private javax.swing.JRadioButton jRadioButtonIncompletaS10;
    private javax.swing.JRadioButton jRadioButtonIncompletaS11;
    private javax.swing.JRadioButton jRadioButtonIncompletaS12;
    private javax.swing.JRadioButton jRadioButtonIncompletaS13;
    private javax.swing.JRadioButton jRadioButtonIncompletaS14;
    private javax.swing.JRadioButton jRadioButtonIncompletaS15;
    private javax.swing.JRadioButton jRadioButtonIncompletaS16;
    private javax.swing.JRadioButton jRadioButtonIncompletaS17;
    private javax.swing.JRadioButton jRadioButtonIncompletaS18;
    private javax.swing.JRadioButton jRadioButtonIncompletaS19;
    private javax.swing.JRadioButton jRadioButtonIncompletaS2;
    private javax.swing.JRadioButton jRadioButtonIncompletaS20;
    private javax.swing.JRadioButton jRadioButtonIncompletaS21;
    private javax.swing.JRadioButton jRadioButtonIncompletaS22;
    private javax.swing.JRadioButton jRadioButtonIncompletaS23;
    private javax.swing.JRadioButton jRadioButtonIncompletaS24;
    private javax.swing.JRadioButton jRadioButtonIncompletaS25;
    private javax.swing.JRadioButton jRadioButtonIncompletaS26;
    private javax.swing.JRadioButton jRadioButtonIncompletaS27;
    private javax.swing.JRadioButton jRadioButtonIncompletaS28;
    private javax.swing.JRadioButton jRadioButtonIncompletaS29;
    private javax.swing.JRadioButton jRadioButtonIncompletaS3;
    private javax.swing.JRadioButton jRadioButtonIncompletaS30;
    private javax.swing.JRadioButton jRadioButtonIncompletaS31;
    private javax.swing.JRadioButton jRadioButtonIncompletaS32;
    private javax.swing.JRadioButton jRadioButtonIncompletaS33;
    private javax.swing.JRadioButton jRadioButtonIncompletaS34;
    private javax.swing.JRadioButton jRadioButtonIncompletaS35;
    private javax.swing.JRadioButton jRadioButtonIncompletaS36;
    private javax.swing.JRadioButton jRadioButtonIncompletaS4;
    private javax.swing.JRadioButton jRadioButtonIncompletaS5;
    private javax.swing.JRadioButton jRadioButtonIncompletaS6;
    private javax.swing.JRadioButton jRadioButtonIncompletaS7;
    private javax.swing.JRadioButton jRadioButtonIncompletaS8;
    private javax.swing.JRadioButton jRadioButtonIncompletaS9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane100;
    private javax.swing.JScrollPane jScrollPane101;
    private javax.swing.JScrollPane jScrollPane102;
    private javax.swing.JScrollPane jScrollPane103;
    private javax.swing.JScrollPane jScrollPane104;
    private javax.swing.JScrollPane jScrollPane105;
    private javax.swing.JScrollPane jScrollPane106;
    private javax.swing.JScrollPane jScrollPane107;
    private javax.swing.JScrollPane jScrollPane108;
    private javax.swing.JScrollPane jScrollPane109;
    private javax.swing.JScrollPane jScrollPane110;
    private javax.swing.JScrollPane jScrollPane111;
    private javax.swing.JScrollPane jScrollPane112;
    private javax.swing.JScrollPane jScrollPane113;
    private javax.swing.JScrollPane jScrollPane114;
    private javax.swing.JScrollPane jScrollPane115;
    private javax.swing.JScrollPane jScrollPane116;
    private javax.swing.JScrollPane jScrollPane117;
    private javax.swing.JScrollPane jScrollPane118;
    private javax.swing.JScrollPane jScrollPane119;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane120;
    private javax.swing.JScrollPane jScrollPane121;
    private javax.swing.JScrollPane jScrollPane122;
    private javax.swing.JScrollPane jScrollPane123;
    private javax.swing.JScrollPane jScrollPane124;
    private javax.swing.JScrollPane jScrollPane125;
    private javax.swing.JScrollPane jScrollPane126;
    private javax.swing.JScrollPane jScrollPane127;
    private javax.swing.JScrollPane jScrollPane128;
    private javax.swing.JScrollPane jScrollPane129;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane130;
    private javax.swing.JScrollPane jScrollPane131;
    private javax.swing.JScrollPane jScrollPane132;
    private javax.swing.JScrollPane jScrollPane133;
    private javax.swing.JScrollPane jScrollPane134;
    private javax.swing.JScrollPane jScrollPane135;
    private javax.swing.JScrollPane jScrollPane136;
    private javax.swing.JScrollPane jScrollPane137;
    private javax.swing.JScrollPane jScrollPane138;
    private javax.swing.JScrollPane jScrollPane139;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane77;
    private javax.swing.JScrollPane jScrollPane78;
    private javax.swing.JScrollPane jScrollPane79;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane80;
    private javax.swing.JScrollPane jScrollPane81;
    private javax.swing.JScrollPane jScrollPane82;
    private javax.swing.JScrollPane jScrollPane83;
    private javax.swing.JScrollPane jScrollPane84;
    private javax.swing.JScrollPane jScrollPane85;
    private javax.swing.JScrollPane jScrollPane86;
    private javax.swing.JScrollPane jScrollPane87;
    private javax.swing.JScrollPane jScrollPane88;
    private javax.swing.JScrollPane jScrollPane89;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPane90;
    private javax.swing.JScrollPane jScrollPane91;
    private javax.swing.JScrollPane jScrollPane92;
    private javax.swing.JScrollPane jScrollPane93;
    private javax.swing.JScrollPane jScrollPane94;
    private javax.swing.JScrollPane jScrollPane95;
    private javax.swing.JScrollPane jScrollPane96;
    private javax.swing.JScrollPane jScrollPane97;
    private javax.swing.JScrollPane jScrollPane98;
    private javax.swing.JScrollPane jScrollPane99;
    private javax.swing.JScrollPane jScrollPaneCap1;
    private javax.swing.JScrollPane jScrollPaneCap2;
    private javax.swing.JScrollPane jScrollPaneCap3;
    private javax.swing.JScrollPane jScrollPaneCap4;
    private javax.swing.JScrollPane jScrollPaneCap5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaP01;
    private javax.swing.JTextArea jTextAreaP10;
    private javax.swing.JTextArea jTextAreaP100;
    private javax.swing.JTextArea jTextAreaP101;
    private javax.swing.JTextArea jTextAreaP102;
    private javax.swing.JTextArea jTextAreaP103;
    private javax.swing.JTextArea jTextAreaP104;
    private javax.swing.JTextArea jTextAreaP105;
    private javax.swing.JTextArea jTextAreaP106;
    private javax.swing.JTextArea jTextAreaP107;
    private javax.swing.JTextArea jTextAreaP108;
    private javax.swing.JTextArea jTextAreaP109;
    private javax.swing.JTextArea jTextAreaP11;
    private javax.swing.JTextArea jTextAreaP110;
    private javax.swing.JTextArea jTextAreaP111;
    private javax.swing.JTextArea jTextAreaP112;
    private javax.swing.JTextArea jTextAreaP113;
    private javax.swing.JTextArea jTextAreaP114;
    private javax.swing.JTextArea jTextAreaP115;
    private javax.swing.JTextArea jTextAreaP116;
    private javax.swing.JTextArea jTextAreaP117;
    private javax.swing.JTextArea jTextAreaP118;
    private javax.swing.JTextArea jTextAreaP119;
    private javax.swing.JTextArea jTextAreaP12;
    private javax.swing.JTextArea jTextAreaP120;
    private javax.swing.JTextArea jTextAreaP121;
    private javax.swing.JTextArea jTextAreaP122;
    private javax.swing.JTextArea jTextAreaP123;
    private javax.swing.JTextArea jTextAreaP124;
    private javax.swing.JTextArea jTextAreaP125;
    private javax.swing.JTextArea jTextAreaP126;
    private javax.swing.JTextArea jTextAreaP127;
    private javax.swing.JTextArea jTextAreaP128;
    private javax.swing.JTextArea jTextAreaP13;
    private javax.swing.JTextArea jTextAreaP14;
    private javax.swing.JTextArea jTextAreaP15;
    private javax.swing.JTextArea jTextAreaP16;
    private javax.swing.JTextArea jTextAreaP17;
    private javax.swing.JTextArea jTextAreaP18;
    private javax.swing.JTextArea jTextAreaP19;
    private javax.swing.JTextArea jTextAreaP2;
    private javax.swing.JTextArea jTextAreaP20;
    private javax.swing.JTextArea jTextAreaP21;
    private javax.swing.JTextArea jTextAreaP22;
    private javax.swing.JTextArea jTextAreaP23;
    private javax.swing.JTextArea jTextAreaP24;
    private javax.swing.JTextArea jTextAreaP25;
    private javax.swing.JTextArea jTextAreaP26;
    private javax.swing.JTextArea jTextAreaP27;
    private javax.swing.JTextArea jTextAreaP28;
    private javax.swing.JTextArea jTextAreaP29;
    private javax.swing.JTextArea jTextAreaP3;
    private javax.swing.JTextArea jTextAreaP30;
    private javax.swing.JTextArea jTextAreaP31;
    private javax.swing.JTextArea jTextAreaP32;
    private javax.swing.JTextArea jTextAreaP33;
    private javax.swing.JTextArea jTextAreaP34;
    private javax.swing.JTextArea jTextAreaP35;
    private javax.swing.JTextArea jTextAreaP36;
    private javax.swing.JTextArea jTextAreaP37;
    private javax.swing.JTextArea jTextAreaP38;
    private javax.swing.JTextArea jTextAreaP39;
    private javax.swing.JTextArea jTextAreaP4;
    private javax.swing.JTextArea jTextAreaP40;
    private javax.swing.JTextArea jTextAreaP41;
    private javax.swing.JTextArea jTextAreaP42;
    private javax.swing.JTextArea jTextAreaP43;
    private javax.swing.JTextArea jTextAreaP44;
    private javax.swing.JTextArea jTextAreaP45;
    private javax.swing.JTextArea jTextAreaP46;
    private javax.swing.JTextArea jTextAreaP47;
    private javax.swing.JTextArea jTextAreaP48;
    private javax.swing.JTextArea jTextAreaP49;
    private javax.swing.JTextArea jTextAreaP5;
    private javax.swing.JTextArea jTextAreaP50;
    private javax.swing.JTextArea jTextAreaP6;
    private javax.swing.JTextArea jTextAreaP66;
    private javax.swing.JTextArea jTextAreaP67;
    private javax.swing.JTextArea jTextAreaP68;
    private javax.swing.JTextArea jTextAreaP69;
    private javax.swing.JTextArea jTextAreaP7;
    private javax.swing.JTextArea jTextAreaP70;
    private javax.swing.JTextArea jTextAreaP71;
    private javax.swing.JTextArea jTextAreaP72;
    private javax.swing.JTextArea jTextAreaP73;
    private javax.swing.JTextArea jTextAreaP74;
    private javax.swing.JTextArea jTextAreaP75;
    private javax.swing.JTextArea jTextAreaP76;
    private javax.swing.JTextArea jTextAreaP77;
    private javax.swing.JTextArea jTextAreaP78;
    private javax.swing.JTextArea jTextAreaP79;
    private javax.swing.JTextArea jTextAreaP8;
    private javax.swing.JTextArea jTextAreaP80;
    private javax.swing.JTextArea jTextAreaP81;
    private javax.swing.JTextArea jTextAreaP82;
    private javax.swing.JTextArea jTextAreaP83;
    private javax.swing.JTextArea jTextAreaP84;
    private javax.swing.JTextArea jTextAreaP85;
    private javax.swing.JTextArea jTextAreaP86;
    private javax.swing.JTextArea jTextAreaP87;
    private javax.swing.JTextArea jTextAreaP88;
    private javax.swing.JTextArea jTextAreaP89;
    private javax.swing.JTextArea jTextAreaP9;
    private javax.swing.JTextArea jTextAreaP90;
    private javax.swing.JTextArea jTextAreaP91;
    private javax.swing.JTextArea jTextAreaP92;
    private javax.swing.JTextArea jTextAreaP93;
    private javax.swing.JTextArea jTextAreaP94;
    private javax.swing.JTextArea jTextAreaP95;
    private javax.swing.JTextArea jTextAreaP96;
    private javax.swing.JTextArea jTextAreaP97;
    private javax.swing.JTextArea jTextAreaP98;
    private javax.swing.JTextArea jTextAreaP99;
    private javax.swing.JTextArea jTextAreaRecDesc;
    private javax.swing.JTextField jTextFieldAuxiliarCapt;
    private javax.swing.JTextField jTextFieldDesestabilizacao;
    private javax.swing.JTextField jTextFieldEscolta;
    private javax.swing.JTextField jTextFieldExtincao;
    private javax.swing.JTextField jTextFieldGuerraTerror;
    private javax.swing.JTextField jTextFieldReconectando;
    private javax.swing.JTextField jTextFieldRetomada;
    private javax.swing.JTextField jTextFieldSelamento;
    private javax.swing.JTextField jTextFieldSemLuz;
    private javax.swing.JTextField jTextFieldSemPaz;
    private javax.swing.JToggleButton jToggleButtonDescRec;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

}
