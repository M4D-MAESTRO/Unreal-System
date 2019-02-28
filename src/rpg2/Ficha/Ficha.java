/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

import java.awt.Color;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author M4ESTRO
 */
public class Ficha implements Serializable {

    
    //JTextField[] campoTexto = new JTextField[36];
    //JComboBox[] campoComboBox = new JComboBox[2];
    //JCheckBox[] campoCheckBox = new JCheckBox[8];
    static String player1, player2, player3, player4;

    public static boolean salvar(JTextField[] campoTexto, JComboBox<String>[] campoComboBox, JCheckBox[] campoCheckBox, JTextArea[] campoArea, String data) {

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
            out.println(campoComboBox[0].getSelectedItem()); // jComboBoxClasses
            out.println(campoComboBox[1].getSelectedItem()); // jComboBoxSexo
            out.println(campoTexto[1].getText()); // jTextFieldVIT
            out.println(campoTexto[2].getText()); // jTextFieldFor
            out.println(campoTexto[3].getText()); // jTextFieldStm
            out.println(campoTexto[4].getText()); // jTextFieldPes
            out.println(campoTexto[5].getText()); // jTextFieldCar
            out.println(campoTexto[6].getText()); // jTextFieldESP
            out.println(campoTexto[7].getText()); // jTextFieldPer
            out.println(campoTexto[8].getText()); // jTextFieldRes
            out.println(campoTexto[9].getText()); // jTextFieldInt

            //Parte direita
            out.println(campoTexto[10].getText()); // jTextFieldXP
            out.println(campoTexto[11].getText()); // jTextFieldXPPra
            out.println(campoTexto[12].getText()); // jTextFieldVITAtual
            out.println(campoTexto[13].getText()); // jTextFieldAPE
            out.println(campoTexto[14].getText()); // jTextFieldKarma
            out.println(campoTexto[15].getText()); // jTextFieldNivel

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

            //Bonus
            out.println(campoTexto[17].getText()); // jTextFieldForBonus
            out.println(campoTexto[18].getText()); // jTextFieldStmBonus
            out.println(campoTexto[19].getText()); // jTextFieldPesBonus
            out.println(campoTexto[20].getText()); // jTextFieldCarBonus
            out.println(campoTexto[21].getText()); // jTextFieldPerBonus
            out.println(campoTexto[22].getText()); // jTextFieldResBonus
            out.println(campoTexto[23].getText()); // jTextFieldIntBonus

            //Habilidades
            if (campoCheckBox[5].isSelected()) { // jCheckBoxHabilidade1
                out.println("true");
            } else {
                out.println("false");
            }

            if (campoCheckBox[6].isSelected()) { // jCheckBoxHabilidade2
                out.println("true");
            } else {
                out.println("false");
            }

            if (campoCheckBox[7].isSelected()) { // jCheckBoxHabilidade3
                out.println("true");
            } else {
                out.println("false");
            }

            //Itens
            out.println(campoTexto[24].getText()); // jTextFieldItem1
            out.println(campoTexto[25].getText()); // jTextFieldItem2
            out.println(campoTexto[26].getText()); // jTextFieldItem3
            out.println(campoTexto[27].getText()); // jTextFieldItem4
            out.println(campoTexto[28].getText()); // jTextFieldItem5
            out.println(campoTexto[29].getText()); // jTextFieldItem6
            out.println(campoTexto[30].getText()); // jTextFieldItem7
            out.println(campoTexto[31].getText()); // jTextFieldItem8
            out.println(campoTexto[32].getText()); // jTextFieldItem9
            out.println(campoTexto[33].getText()); // jTextFieldItem10
            out.println(campoTexto[34].getText()); // jTextFieldItemEspecial
            out.println(campoTexto[35].getText()); // jTextFieldItemBranca

            //SOBRE
            for (int i = 0; i < campoArea.length; i++) {
                campoArea[i].setText(campoArea[i].getText().replace("\n", "\t"));
                out.println(campoArea[i].getText()); // jTextArea - FichaNote - Hist - Medo - Arrepen
                campoArea[i].setText(campoArea[i].getText().replace("\t", "\n"));
            }

            out.println(data);//data do ultimo save
            Codigo.salvarLista(campoTexto[0].getText());
            //salvarLista(campoTexto[0].getText());

            out.close();
            status = true;
            return status;

        } catch (IOException erro) {
            return status;
        }

    }

    public static void abrir(JTextField[] campoTexto, JComboBox<String>[] campoComboBox, JCheckBox[] campoCheckBox, JTextArea[] campoArea, boolean desbloqueioSlot9, boolean desbloqueioSlot10, JTextField data) {

        try {

            String nome = JOptionPane.showInputDialog("Insira o nome do personagem: ");
            if (nome == null) {
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader("Saves/" + nome + ".sav"));

            //lado esquerdo
            campoTexto[0].setText(br.readLine()); // jTextFieldNome
            campoComboBox[0].setSelectedItem(br.readLine()); //jComboBoxClasses
            campoComboBox[1].setSelectedItem(br.readLine()); // jComboBoxSexo
            campoTexto[1].setText(br.readLine()); // jTextFieldVIT
            campoTexto[2].setText(br.readLine()); // jTextFieldFor
            campoTexto[3].setText(br.readLine()); // jTextFieldStm
            campoTexto[4].setText(br.readLine()); // jTextFieldPes
            campoTexto[5].setText(br.readLine()); // jTextFieldCar
            campoTexto[6].setText(br.readLine()); // jTextFieldESP
            campoTexto[7].setText(br.readLine()); // jTextFieldPer
            campoTexto[8].setText(br.readLine()); // jTextFieldRes
            campoTexto[9].setText(br.readLine()); // jTextFieldInt

            //lado direito
            campoTexto[10].setText(br.readLine()); // jTextFieldXP
            campoTexto[11].setText(br.readLine()); // jTextFieldXPPra
            campoTexto[12].setText(br.readLine()); // jTextFieldVITAtual
            campoTexto[13].setText(br.readLine()); // jTextFieldAPE
            campoTexto[14].setText(br.readLine()); // jTextFieldKarma
            campoTexto[15].setText(br.readLine()); // jTextFieldNivel 

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

            //Bonus
            campoTexto[17].setText(br.readLine()); // jTextFieldForBonus
            campoTexto[18].setText(br.readLine()); // jTextFieldStmBonus
            campoTexto[19].setText(br.readLine()); // jTextFieldPesBonus
            campoTexto[20].setText(br.readLine()); // jTextFieldCarBonus
            campoTexto[21].setText(br.readLine()); // jTextFieldPerBonus
            campoTexto[22].setText(br.readLine()); // jTextFieldResBonus
            campoTexto[23].setText(br.readLine()); // jTextFieldIntBonus

            //Habilidades
            teste = br.readLine();
            ativado = Boolean.parseBoolean(teste);
            campoCheckBox[5].setSelected(ativado); // jCheckBoxHabilidade1

            teste = br.readLine();
            ativado = Boolean.parseBoolean(teste);
            campoCheckBox[6].setSelected(ativado); // jCheckBoxHabilidade2

            teste = br.readLine();
            ativado = Boolean.parseBoolean(teste);
            campoCheckBox[7].setSelected(ativado); // jCheckBoxHabilidade3

            //Itens
            campoTexto[24].setText(br.readLine()); // jTextFieldItem1
            campoTexto[25].setText(br.readLine()); // jTextFieldItem2
            campoTexto[26].setText(br.readLine()); // jTextFieldItem3
            campoTexto[27].setText(br.readLine()); // jTextFieldItem4
            campoTexto[28].setText(br.readLine()); // jTextFieldItem5
            campoTexto[29].setText(br.readLine()); // jTextFieldItem6
            campoTexto[30].setText(br.readLine()); // jTextFieldItem7
            campoTexto[31].setText(br.readLine()); // jTextFieldItem8
            campoTexto[32].setText(br.readLine()); // jTextFieldItem9
            campoTexto[33].setText(br.readLine()); // jTextFieldItem10
            campoTexto[34].setText(br.readLine()); // jTextFieldItemEspecial
            campoTexto[35].setText(br.readLine()); // jTextFieldItemBranca

            //SOBRE
            for (int i = 0; i < campoArea.length; i++) {
                campoArea[i].setText(br.readLine()); //jTextAreaFichaNote
                campoArea[i].setText(campoArea[i].getText().replace("\t", "\n"));
            }

            data.setText(br.readLine());//data do ultimo save

            br.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir ficha\n" + erro.toString());
        }

        //Cores do KARMA
        String karmaS = campoTexto[14].getText();
        int karma = Integer.parseInt(karmaS);

        if (karma <= 20) {
            campoTexto[14].setForeground(Color.red);
        } else {
            if (karma >= 80) {
                campoTexto[14].setForeground(Color.blue);
            } else {
                campoTexto[14].setForeground(Color.black);
            }
        }

        //Bloqueio do nome - classe - sexo
        campoTexto[0].setEditable(false);
        campoComboBox[0].setEnabled(false);
        campoComboBox[1].setEnabled(false);

        //Desbloqueio dos slots
        String PesS = campoTexto[4].getText();
        int PesInt = Integer.parseInt(PesS);

        if (PesInt >= 10) {
            campoTexto[32].setEditable(true);
            campoTexto[32].setToolTipText("Insira o nome do equipamento no respectivo slot");
            desbloqueioSlot9 = true;

        }

        if (PesInt >= 20) {
            campoTexto[33].setEditable(true);
            campoTexto[33].setToolTipText("Insira o nome do equipamento no respectivo slot");
            desbloqueioSlot10 = true;

        }

    }

    public static void exportar(JTextField[] campoTexto, JComboBox<String>[] campoComboBox, JCheckBox[] campoCheckBox, JTextArea campoArea) {

        try {

            String aux = campoTexto[0].getText(); // jTextFieldNome
            if (aux.equals("")) {
                JOptionPane.showMessageDialog(null, "Não é possível exportar ficha sem o nome!");
                return;
            }

            PrintWriter out = new PrintWriter("Fichas/Player - " + campoTexto[0].getText() + ".txt"); // 

            //lado esquerdo
            out.println("Nome: " + campoTexto[0].getText()); // jTextFieldNome
            out.println("Classe: " + campoComboBox[0].getSelectedItem()); // jComboBoxClasses 
            out.println("Sexo: " + campoComboBox[1].getSelectedItem()); // jComboBoxSexo
            out.println("VIT: " + campoTexto[1].getText()); // jTextFieldVIT
            out.println("FOR: " + campoTexto[2].getText()); // jTextFieldFor
            out.println("STM: " + campoTexto[3].getText()); // jTextFieldStm
            out.println("PES: " + campoTexto[4].getText()); // jTextFieldPes
            out.println("CAR: " + campoTexto[5].getText()); // jTextFieldCar
            out.println("ESP: " + campoTexto[6].getText()); // jTextFieldESP
            out.println("PER: " + campoTexto[7].getText()); // jTextFieldPer
            out.println("RES: " + campoTexto[8].getText()); // jTextFieldRes
            out.println("INT: " + campoTexto[9].getText()); // jTextFieldInt

            out.println();

            //lado direito
            out.println("XP: " + campoTexto[10].getText()); // jTextFieldXP
            out.println("XP Pra: " + campoTexto[11].getText()); // jTextFieldXPPra
            out.println("VIT Atual:" + campoTexto[12].getText()); // jTextFieldVITAtual
            out.println("APE: " + campoTexto[13].getText()); // jTextFieldAPE
            out.println("Karma: " + campoTexto[14].getText()); // jTextFieldKarma
            out.println("Nível: " + campoTexto[15].getText()); // jTextFieldNivel

            out.println();

            //debuffer
            out.println("Seus debuffers: ");
            if (campoCheckBox[0].isSelected()) {  // jCheckBoxEnvenenado
                out.println("Está envenenado! ");
            } else {
                out.println("Não está envenenado!");
            }

            if (campoCheckBox[1].isSelected()) {  // jCheckBoxExausto
                out.println("Está exausto!");
            } else {
                out.println("Não está exausto!");
            }

            if (campoCheckBox[2].isSelected()) {  // jCheckBoxFerido
                out.println("Está ferido!");
            } else {
                out.println("Não está ferido!");
            }

            if (campoCheckBox[3].isSelected()) {  // jCheckBoxInfectado
                out.println("Está Infectado!");
            } else {
                out.println("Não está infectado!");
            }

            if (campoCheckBox[4].isSelected()) {  // jCheckBoxParanoico
                out.println("Está paranóico!");
            } else {
                out.println("Não está paranóico!");
            }

            out.println();
            out.println("Skill points disponíveis: " + campoTexto[16].getText());  // jTextFieldPontosDisponiveis

            out.println();
            //Bonus
            out.println("Bonus de Força: " + campoTexto[17].getText());  // jTextFieldForBonus
            out.println("Bonus de Stamina: " + campoTexto[18].getText());  // jTextFieldStmBonus
            out.println("Bonus de Peso: " + campoTexto[19].getText());  // jTextFieldPesBonus
            out.println("Bonus de Carisma: " + campoTexto[20].getText());  // jTextFieldCarBonus
            out.println("Bonus de Percepção: " + campoTexto[21].getText());  // jTextFieldPerBonus
            out.println("Bonus de Resistência: " + campoTexto[22].getText());  // jTextFieldResBonus
            out.println("Bonus de Inteligência: " + campoTexto[23].getText());  // jTextFieldIntBonus

            out.println();
            //Habilidades
            out.println("Suas habilidades: ");
            if (campoCheckBox[5].isSelected()) {  // jCheckBoxHabilidade1
                out.println("Habilidade 1 - Desbloqueada");
            } else {
                out.println("Habilidade 1 - Bloqueada");
            }

            if (campoCheckBox[6].isSelected()) {  // jCheckBoxHabilidade2
                out.println("Habilidade 2 - Desbloqueada");
            } else {
                out.println("Habilidade 2 - Bloqueada");
            }

            if (campoCheckBox[7].isSelected()) { // jCheckBoxHabilidade3
                out.println("Habilidade 3 - Desbloqueada");
            } else {
                out.println("Habilidade 3 - Bloqueada");
            }

            out.println();
            //Itens
            out.println("Slot 1: " + campoTexto[24].getText()); // jTextFieldItem1
            out.println("Slot 2: " + campoTexto[25].getText()); // jTextFieldItem2
            out.println("Slot 3: " + campoTexto[26].getText()); // jTextFieldItem3
            out.println("Slot 4: " + campoTexto[27].getText()); // jTextFieldItem4
            out.println("Slot 5: " + campoTexto[28].getText()); // jTextFieldItem5
            out.println("Slot 6: " + campoTexto[29].getText()); // jTextFieldItem6
            out.println("Slot 7: " + campoTexto[30].getText()); // jTextFieldItem7
            out.println("Slot 8: " + campoTexto[31].getText()); // jTextFieldItem8
            out.println("Slot 9: " + campoTexto[32].getText()); // jTextFieldItem9
            out.println("Slot 10: " + campoTexto[33].getText()); // jTextFieldItem10
            out.println("Slot Especial: " + campoTexto[34].getText()); // jTextFieldItemEspecial
            out.println("Slot da arma branca: " + campoTexto[35].getText()); // jTextFieldItemBranca

            out.println();
            campoArea.setText(campoArea.getText().replace("\n", " \t "));
            /*char auxCampoArea;
            for (int i = 0; i < campoArea.getText().length(); i++) {
                 auxCampoArea = campoArea.getText().charAt(i);
                if(auxCampoArea == '\n'){
                    out.println();
                }
            }*/
            out.println("Anotações na ficha e perícias: " + campoArea.getText()); // jTextAreaFichaNote
            campoArea.setText(campoArea.getText().replace(" \t ", "\n"));

            out.close();

            JOptionPane.showMessageDialog(null, "Ficha exportada com sucesso!");
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao exportar ficha\n" + erro.toString());
        }

    }

    public static void nova(JTextField[] campoTexto, JComboBox<String>[] campoComboBox, JCheckBox[] campoCheckBox, JTextArea[] campoArea, boolean desbloqueioSlot9, boolean desbloqueioSlot10) {
        //Desbloqueio do nome - classe - sexo
        campoTexto[0].setEditable(true); // jTextFieldNome
        campoComboBox[0].setEnabled(true); // jComboBoxClasses
        campoComboBox[1].setEnabled(true); // jComboBoxSexo

        //Limpagem dos campos
        campoArea[0].setText("Insira anotações sobre o personagem, a sua história, suas perícias e por ai vai..."); // jTextAreaFichaNote
        for (int i = 1; i < campoArea.length; i++) {
            campoArea[i].setText(" ");
        }

        campoTexto[1].setText("0"); // jTextFieldCar
        campoTexto[2].setText("100"); // jTextFieldAPE
        campoTexto[3].setText("0"); // jTextFieldCarBonus
        campoTexto[4].setText("1"); // jTextFieldESP
        campoTexto[5].setText("0"); // jTextFieldFor
        campoTexto[6].setText("0"); // jTextFieldForBonus
        campoTexto[7].setText("0"); // jTextFieldInt
        campoTexto[8].setText("0"); // jTextFieldIntBonus
        campoTexto[9].setText(""); // jTextFieldItem1
        campoTexto[10].setText(""); // jTextFieldItem2
        campoTexto[11].setText(""); // jTextFieldItem3
        campoTexto[12].setText(""); // jTextFieldItem4
        campoTexto[13].setText(""); // jTextFieldItem5
        campoTexto[14].setText(""); // jTextFieldItem6
        campoTexto[15].setText(""); // jTextFieldItem7
        campoTexto[16].setText(""); // jTextFieldItem8
        campoTexto[17].setText(""); // jTextFieldItem9
        campoTexto[18].setText(""); // jTextFieldItem10
        campoTexto[19].setText(""); // jTextFieldItemEspecial
        campoTexto[20].setText(""); // jTextFieldItemBranca
        campoTexto[21].setText("70"); // jTextFieldKarma
        campoTexto[22].setText("1"); // jTextFieldNivel
        campoTexto[0].setText(""); // jTextFieldNome
        campoTexto[23].setText("0"); // jTextFieldPer
        campoTexto[24].setText("0"); // jTextFieldPerBonus
        campoTexto[25].setText("0"); // jTextFieldRes
        campoTexto[26].setText("0"); // jTextFieldResBonus
        campoTexto[27].setText("0"); // jTextFieldPes
        campoTexto[28].setText("0"); //jTextFieldPesBonus 
        campoTexto[29].setText("0"); // jTextFieldStm
        campoTexto[30].setText("0"); // jTextFieldStmBonus
        campoTexto[31].setText("10"); // jTextFieldPontosDisponiveis
        campoTexto[32].setText("100"); // jTextFieldVIT
        campoTexto[33].setText("100"); // jTextFieldVITAtual
        campoTexto[34].setText("0"); // jTextFieldXP
        campoTexto[35].setText("100"); // jTextFieldXPPra
        campoComboBox[0].setSelectedIndex(0); // jComboBoxClasses
        campoComboBox[1].setSelectedIndex(0); // jComboBoxSexo
        campoCheckBox[0].setSelected(false); // jCheckBoxEnvenenado
        campoCheckBox[1].setSelected(false); // jCheckBoxParanoico
        campoCheckBox[2].setSelected(false); // jCheckBoxFerido
        campoCheckBox[3].setSelected(false); // jCheckBoxInfectado
        campoCheckBox[4].setSelected(false); // jCheckBoxExausto
        campoCheckBox[5].setSelected(false); // jCheckBoxHabilidade1
        campoCheckBox[6].setSelected(false); // jCheckBoxHabilidade2
        campoCheckBox[7].setSelected(false); // jCheckBoxHabilidade3

        if (desbloqueioSlot9) { // desbloqueioSlot9
            campoTexto[17].setToolTipText("Slots desbloqueados ao alcançar PESO 10"); // jTextFieldItem9
        }

        if (desbloqueioSlot10) { // desbloqueioSlot9
            campoTexto[18].setToolTipText("Slots desbloqueados ao alcançar PESO 20"); // jTextFieldItem10
        }

        //Desbloqueio dos slots
        String PesS = campoTexto[27].getText(); // jTextFieldPes
        int PesInt = Integer.parseInt(PesS);

        if (PesInt < 10) {
            campoTexto[17].setEditable(false); // 

        }

        if (PesInt < 20) {
            campoTexto[18].setEditable(false); // jTextFieldItem10

        }
    }

    public static void salvarLista(String nome) {
        try {
            boolean existe = false;

            String[] lista = carregarLista();
            PrintWriter out = new PrintWriter("Saves/" + "LISTA" + ".sav");
            for (int i = 0; i < lista.length; i++) {
                out.append(lista[i] + " \t");
                if (lista[i].contains(nome)) {
                    existe = true;
                }
            }

            if (!existe) {
                out.append(nome + " \t");
            }

            out.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar lista\n" + erro.toString());
        }
    }

    public static String[] carregarLista() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Saves/" + "LISTA" + ".sav"));
            String[] lista = br.lines().toArray(String[]::new);

            return lista;

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar lista\n" + erro.toString());
            return null;
        }
    }

    public static void carregarLista(JTextArea campo) {
        String[] lista = carregarLista();
        for (int i = 0; i < lista.length; i++) {
            campo.setText(lista[i].replace("\t", "\n"));
        }

    }

    public static void upar(JTextField atributo, JTextField ponto) {
        int aux;
        int pontos = Integer.parseInt(ponto.getText());
        aux = Integer.parseInt(atributo.getText());
        aux++;
        atributo.setText(String.valueOf(aux));
        pontos--;
        ponto.setText(String.valueOf(pontos));
    }
    
    public static void uparEspecial(JTextField atributo, JTextField ponto) {
        int aux;
        int pontos = Integer.parseInt(ponto.getText());
        aux = Integer.parseInt(atributo.getText());
        aux+=10;
        atributo.setText(String.valueOf(aux));
        pontos--;
        ponto.setText(String.valueOf(pontos));
    }

}
