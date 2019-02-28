/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static rpg2.Ficha.Ficha.salvarLista;

/**
 *
 * @author M4ESTRO
 */
public class FichaToin extends Ficha {

    //<editor-fold defaultstate="collapsed" desc=" Classes">
    private static String classesHumano[] = {"Selecione a classe", "Cavaleiro", "Guerreiro", "Arqueiro", "Assassino", "Ladino", "Samurai", "Clérico", "Mago", "Druída", "Feiticeiro", "Lanceiro", "Lutador", "Piromancer", "Paladino", "Ranger", "Mestre Assassino", "Necromancer", "Arcanista", "Bárbaro", "Monge", "Elementista", "Berserk"};
    private static String classesDemonio[] = {"Selecione a classe", "Rank D-", "Rank D", "Rank D+", "Rank C-", "Rank C", "Rank C+", "Rank B-", "Rank B", "Rank B+", "Rank A-", "Rank A", "Rank A+"};
    private static String classesElfo[] = {"Selecione a classe"};
    private static String classesAnao[] = {"Selecione a classe"};

    public static String[] getClassesElfo() {
        return classesElfo;
    }

    public static String[] getClassesAnao() {
        return classesAnao;
    }

    public static String[] getClassesHumano() {
        return classesHumano;
    }

    public static String[] getClassesDemonio() {
        return classesDemonio;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Divindades">
    private static String doFogo[] = {"Selecione a divindade", "Isalti", "Flogos", "Theires", "Salvinar", "Lyara"};
    private static String doSol[] = {"Selecione a divindade", "Sunlíver", "Khisgymn", "Iryni", "Fleyre"};
    private static String daMorte[] = {"Selecione a divindade", "Sysrimia", "Schaicar", "Safiar", "Navren"};
    private static String doInferno[] = {"Selecione a divindade", "Azariel", "Lucinel", "Daclel", "Jesiel"};

    private static String doFogoSol[] = {"Selecione a divindade", "Isalti", "Flogos", "Theires", "Salvinar", "Sunlíver", "Khisgymn", "Iryni", "Fleyre", "Lyara"};
    private static String doFogoMorte[] = {"Selecione a divindade", "Isalti", "Flogos", "Theires", "Salvinar", "Sysrimia", "Schaicar", "Safiar", "Navren", "Lyara"};
    private static String doSolMorte[] = {"Selecione a divindade", "Sunlíver", "Khisgymn", "Iryni", "Fleyre", "Sysrimia", "Schaicar", "Safiar", "Navren"};
    private static String deTodos[] = {"Selecione a divindade", "Isalti", "Flogos", "Theires", "Salvinar", "Sunlíver", "Khisgymn", "Iryni", "Fleyre", "Sysrimia", "Schaicar", "Safiar", "Navren", "Lyara"};

    private static String completo[] = {"Selecione a divindade", "Isalti", "Flogos", "Theires", "Salvinar", "Sunlíver", "Khisgymn", "Iryni", "Fleyre", "Sysrimia", "Schaicar", "Safiar", "Navren", "Lyara", "Azariel", "Lucinel", "Daclel", "Jesiel"};

    public static String[] getCompleto() {
        return completo;
    }

    public static String[] getDoFogo() {
        return doFogo;
    }

    public static String[] getDoSol() {
        return doSol;
    }

    public static String[] getDoSolMorte() {
        return doSolMorte;
    }

    public static String[] getDaMorte() {
        return daMorte;
    }

    public static String[] getDoInferno() {
        return doInferno;
    }

    public static String[] getDeTodos() {
        return deTodos;
    }

    public static String[] getDoFogoSol() {
        return doFogoSol;
    }

    public static String[] getDoFogoMorte() {
        return doFogoMorte;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Metodos">
    public static void setClasse(int raca, JComboBox classe) {
        if (raca != 0) {
            classe.setEnabled(true);
            switch (raca) {
                case 1://1 - Humano
                    classe.setModel(new DefaultComboBoxModel(FichaToin.getClassesHumano()));
                    break;

                case 2://2 - Elfo
                    classe.setModel(new DefaultComboBoxModel(FichaToin.getClassesElfo()));
                    break;

                case 3://3 - Anao
                    classe.setModel(new DefaultComboBoxModel(FichaToin.getClassesAnao()));
                    break;

                case 4://4 - Demónio
                    classe.setModel(new DefaultComboBoxModel(FichaToin.getClassesDemonio()));
                    break;

                case 5://5 - Celestial
                    classe.setModel(new DefaultComboBoxModel(FichaToin.getClassesDemonio()));
                    break;
            }

        } else {
            classe.setSelectedIndex(0);
            classe.setEnabled(false);
        }
    }

    public static void setDivindade(int raca, int classe, JComboBox divindade) {
        if (classe != 0) {
            divindade.setEnabled(true);

            if (raca == 1) {//humano
                switch (classe) {
                    case 1:// "Cavaleiro", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDoSolMorte()));
                        break;

                    case 2:// "Guerreiro", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 3:// "Arqueiro", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 4://"Assassino",
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 5: //"Ladino", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 6:// "Samurai",
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDoFogoSol()));
                        break;

                    case 7:// Cláerico
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDoSolMorte()));
                        break;

                    case 8:// "Mago", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 9://"Druída",
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 10: //"Feiticeiro", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 11:// "Lanceiro", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 12:// "Lutador", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 13:// "Piromancer", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 14://"Paladino", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDoSolMorte()));
                        break;

                    case 15: //"Ranger", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 16:// Mestre Assassino
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 17:// "Necromancer", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDoFogoMorte()));
                        break;

                    case 18:// "Arcanista", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 19://"Bárbaro", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 20: //"Monge", 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;

                    case 21: //Elementista 
                        divindade.setModel(new DefaultComboBoxModel(FichaToin.getDeTodos()));
                        break;
                }

                return;
            }

            if (raca == 2) {//elfo 

                return;
            }

            if (raca == 3) {//anao

                return;
            }

            if (raca == 4) {//demonio
                divindade.setModel(new DefaultComboBoxModel(FichaToin.getDoInferno()));
                return;
            }

            if (raca == 5) {//demonio
                divindade.setModel(new DefaultComboBoxModel(FichaToin.getDoSol()));
                return;
            }

        } else {
            divindade.setSelectedIndex(0);
            divindade.setEnabled(false);
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Salvamento">
    public static boolean salvar(JTextField[] campoTexto, JComboBox<String>[] campoComboBox, JCheckBox[] campoCheckBox, JTextArea[] campoArea, String data, JEditorPane[] pane) {

        boolean status = false;

        try {

            String aux = campoTexto[0].getText(); // jTextFieldNome
            int codigo = 0;
            if (aux.equals("")) {
                JOptionPane.showMessageDialog(null, "Não é possível salvar ficha sem o nome!");
                return status;
            }

            PrintWriter out = new PrintWriter("Saves/" + campoTexto[0].getText() + ".sav"); // jTextFieldNome

            //Parte esquerda
            out.println(campoTexto[0].getText()); // jTextFieldNome
            out.println(campoComboBox[0].getSelectedItem()); // jComboBoxReino
            out.println(campoComboBox[1].getSelectedItem()); // jComboBoxRaca
            out.println(campoComboBox[2].getSelectedItem()); // jComboBoxClasses
            out.println(campoComboBox[3].getSelectedItem()); // jComboBoxSexo
            out.println(campoComboBox[4].getSelectedItem()); // jComboBoxTedencia
            out.println(campoComboBox[5].getSelectedItem()); // jComboBoxDivindade  

            out.println(campoTexto[1].getText()); // jTextFieldPV
            out.println(campoTexto[2].getText()); // jTextFieldPM
            out.println(campoTexto[3].getText()); // jTextFieldFOR
            out.println(campoTexto[4].getText()); // jTextFieldDES
            out.println(campoTexto[5].getText()); // jTextFieldINT
            out.println(campoTexto[6].getText()); // jTextFieldSAB
            out.println(campoTexto[7].getText()); // jTextFieldSOR
            out.println(campoTexto[8].getText()); // jTextFieldRES

            //Parte direita
            out.println(campoTexto[9].getText()); // jTextFieldXP
            out.println(campoTexto[10].getText()); // jTextFieldXPPra
            out.println(campoTexto[11].getText()); // jTextFieldPVAtual
            out.println(campoTexto[12].getText()); // jTextFieldPMAtual
            out.println(campoTexto[13].getText()); // jTextFieldKarma
            out.println(campoTexto[14].getText()); // jTextFieldNivel
            out.println(campoTexto[15].getText()); // jTextFieldIdade

            //Debuffers
            if (campoCheckBox[0].isSelected()) { // jCheckBoxEnvenenado
                out.println("true");
            } else {
                out.println("false");
            }

            if (campoCheckBox[1].isSelected()) { // jCheckBoxExausto
                out.println("true");
            } else {
                out.println("false");
            }

            if (campoCheckBox[2].isSelected()) { // jCheckBoxFerido
                out.println("true");
            } else {
                out.println("false");
            }

            if (campoCheckBox[3].isSelected()) { // jCheckBoxInfectado
                out.println("true");
            } else {
                out.println("false");
            }

            if (campoCheckBox[4].isSelected()) { // jCheckBoxParanoico
                out.println("true");
            } else {
                out.println("false");
            }

            out.println(campoTexto[16].getText()); // jTextFieldPontosDisponiveis
            out.println(campoTexto[17].getText()); // jTextFieldGold
            out.println(data);//data do ultimo save

            //SOBRE
            for (int i = 0; i < campoArea.length; i++) {
                campoArea[i].setText(campoArea[i].getText().replace("\n", "\t"));
                out.println(campoArea[i].getText()); // jTextArea - FichaNote - Hist - Medo - Arrepen
                campoArea[i].setText(campoArea[i].getText().replace("\t", "\n"));
            }

            for (int i = 0; i < pane.length; i++) {
                pane[i].setText(pane[i].getText().replace("\n", "\t"));
                pane[i].setText(pane[i].getText().replaceAll("<html>", "\t\t"));
                pane[i].setText(pane[i].getText().replaceAll("</html>", "\t\t"));
                out.println(pane[i].getText()); // jTextArea - FichaNote - Hist - Medo - Arrepen
                pane[i].setText(pane[i].getText().replace("\t", "\n"));
                pane[i].setText(pane[i].getText().replaceAll("\t\t", "<html>"));
                pane[i].setText(pane[i].getText().replaceAll("\t\t", "</html>"));
            }

            salvarLista(campoTexto[0].getText());

            out.close();
            status = true;
            return status;

        } catch (IOException erro) {
            return status;
        }

    }

    public static void abrir(JTextField[] campoTexto, JComboBox<String>[] campoComboBox, JCheckBox[] campoCheckBox, JTextArea[] campoArea, JTextField data, JEditorPane[] pane) {

        try {

            String nome = JOptionPane.showInputDialog("Insira o nome do personagem: ");
            if (nome == null) {
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader("Saves/" + nome + ".sav"));

            //lado esquerdo
            campoTexto[0].setText(br.readLine()); // jTextFieldNome
            campoComboBox[0].setSelectedItem(br.readLine()); // jComboBoxReino
            campoComboBox[1].setSelectedItem(br.readLine()); // jComboBoxRaca
            campoComboBox[2].setSelectedItem(br.readLine()); // jComboBoxClasses
            campoComboBox[3].setSelectedItem(br.readLine()); // jComboBoxSexo
            campoComboBox[4].setSelectedItem(br.readLine()); // jComboBoxTedencia
            campoComboBox[5].setSelectedItem(br.readLine()); // jComboBoxDivindade  

            campoTexto[1].setText(br.readLine()); // jTextFieldPV
            campoTexto[2].setText(br.readLine()); // jTextFieldPM
            campoTexto[3].setText(br.readLine()); // jTextFieldFOR
            campoTexto[4].setText(br.readLine()); // jTextFieldDES
            campoTexto[5].setText(br.readLine()); // jTextFieldINT
            campoTexto[6].setText(br.readLine()); // jTextFieldSAB
            campoTexto[7].setText(br.readLine()); // jTextFieldSOR
            campoTexto[8].setText(br.readLine()); // jTextFieldRES 

            //Parte direita
            campoTexto[9].setText(br.readLine()); // jTextFieldXP
            campoTexto[10].setText(br.readLine()); // jTextFieldXPPra
            campoTexto[11].setText(br.readLine()); // jTextFieldPVAtual
            campoTexto[12].setText(br.readLine()); // jTextFieldPMAtual
            campoTexto[13].setText(br.readLine()); // jTextFieldKarma
            campoTexto[14].setText(br.readLine()); // jTextFieldNivel 
            campoTexto[15].setText(br.readLine()); // jTextFieldIdade

            //Debuffers
            String teste = br.readLine();
            boolean ativado = Boolean.parseBoolean(teste);
            campoCheckBox[0].setSelected(ativado); // jCheckBoxEnvenenado

            teste = br.readLine();
            ativado = Boolean.parseBoolean(teste);
            campoCheckBox[1].setSelected(ativado); // jCheckBoxExausto

            teste = br.readLine();
            ativado = Boolean.parseBoolean(teste);
            campoCheckBox[2].setSelected(ativado); // jCheckBoxFerido

            teste = br.readLine();
            ativado = Boolean.parseBoolean(teste);
            campoCheckBox[3].setSelected(ativado); // jCheckBoxInfectado

            teste = br.readLine();
            ativado = Boolean.parseBoolean(teste);
            campoCheckBox[4].setSelected(ativado); // jCheckBoxParanoico

            //Skills
            campoTexto[16].setText(br.readLine()); // jTextFieldPontosDisponiveis
            campoTexto[17].setText(br.readLine()); // jTextFieldGold
            data.setText(br.readLine());//data do ultimo save

            //SOBRE
            for (int i = 0; i < campoArea.length; i++) {
                campoArea[i].setText(br.readLine()); //jTextAreaFichaNote
                campoArea[i].setText(campoArea[i].getText().replace("\t", "\n"));
            }

            for (int i = 0; i < pane.length; i++) {
                pane[i].setText(br.readLine()); //jTextAreaFichaNote
                pane[i].setText(pane[i].getText().replace("\t", "\n"));
                pane[i].setText(pane[i].getText().replace("\t\t", "<html>"));
                pane[i].setText(pane[i].getText().replace("\t\t", "</html>"));
            }

            br.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir ficha\n" + erro.toString());
        }

        //Cores do KARMA
        String karmaS = campoTexto[13].getText();
        int karma = Integer.parseInt(karmaS);

        if (karma <= 20) {
            campoTexto[13].setForeground(Color.red);
        } else {
            if (karma >= 80) {
                campoTexto[13].setForeground(Color.blue);
            } else {
                campoTexto[13].setForeground(Color.black);
            }
        }

        //Bloqueio do nome - classe - sexo
        /*campoTexto[0].setEditable(false);
        campoComboBox[0].setEnabled(false);
        campoComboBox[1].setEnabled(false);*/
    }

    public static void nova(JTextField[] campoTexto, JComboBox<String>[] campoComboBox, JCheckBox[] campoCheckBox, JTextArea[] campoArea, JEditorPane[] pane) {
        //Desbloqueio do nome - classe - sexo
        campoTexto[0].setEditable(true); // jTextFieldNome
        campoComboBox[0].setEnabled(true); // jComboBoxClasses
        campoComboBox[1].setEnabled(true); // jComboBoxSexo

        campoTexto[0].setText(""); // jTextFieldNome4
        campoTexto[1].setText("0"); // jTextFieldPV;
        campoTexto[2].setText("0"); // jTextFieldPM;
        campoTexto[3].setText("0"); // jTextFieldFOR;
        campoTexto[4].setText("0"); // jTextFieldDES;
        campoTexto[5].setText("0"); // jTextFieldINT;
        campoTexto[6].setText("0"); // jTextFieldSAB;
        campoTexto[7].setText("0"); // jTextFieldSOR;
        campoTexto[8].setText("0"); // jTextFieldRES;
        campoTexto[9].setText("0"); // jTextFieldXP;
        campoTexto[10].setText("150"); // jTextFieldXPPra;
        campoTexto[11].setText("0"); // jTextFieldPVAtual;
        campoTexto[12].setText("0"); // jTextFieldPMAtual;
        campoTexto[13].setText("50"); // jTextFieldKarma;
        campoTexto[14].setText("1"); // jTextFieldNivel;
        campoTexto[15].setText("20"); // jTextFieldPontosDisponiveis4;
        campoTexto[16].setText("0"); // jTextFieldIdade;
        campoTexto[17].setText("0"); // jTextFieldGold;
        campoTexto[18].setText("0"); //jTextFieldATKF;
        campoTexto[19].setText("0"); //jTextFieldATKD;
        campoTexto[20].setText("0"); //jTextFieldATKI;
        campoTexto[21].setText("0"); //jTextFieldATKS;
        campoTexto[22].setText("0");//jTextFieldDEF;

        campoComboBox[0].setSelectedIndex(0); // jComboBoxReino;
        campoComboBox[1].setSelectedIndex(0); // jComboBoxRaca;  
        campoComboBox[2].setSelectedIndex(0); // jComboBoxClasses;       ;
        campoComboBox[3].setSelectedIndex(0); // jComboBoxSexo;        ; 
        campoComboBox[4].setSelectedIndex(0); // jComboBoxTedencia;        ;        
        campoComboBox[5].setSelectedIndex(0); //jComboBoxDivindade;

        campoArea[0].setText("Insira anotações extras sobre o personagem ou sua ficha, suas perícias, ofícios e por ai vai...\n"); // jTextAreaFichaNote4;
        campoArea[1].setText(""); // jTextAreaHist;
        campoArea[2].setText(""); // jTextAreaMedo;
        campoArea[3].setText(""); // jTextAreaArrepen;
        campoArea[4].setText(""); // jTextAreaHabilidade;
        campoArea[5].setText(""); // jTextAreaVantagens;
        campoArea[6].setText(""); // jTextAreaDesvantagens;

        pane[0].setText("<br>"); // jEditorPaneArmas;
        pane[1].setText("<br>"); // jEditorPanePoderes;
        pane[2].setText("<br>"); // jEditorPaneAneis;
        pane[3].setText("<br>"); // jEditorPanePocoes;

        campoCheckBox[0].setSelected(false); // jCheckBoxEnvenenado
        campoCheckBox[1].setSelected(false); // jCheckBoxParanoico
        campoCheckBox[2].setSelected(false); // jCheckBoxFerido
        campoCheckBox[3].setSelected(false); // jCheckBoxInfectado
        campoCheckBox[4].setSelected(false); // jCheckBoxExausto

    }

    //</editor-fold>    
    //<editor-fold defaultstate="collapsed" desc=" Salvamento">
    //</editor-fold>  
}
