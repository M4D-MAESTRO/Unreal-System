/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Utilitarios;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import rpg2.Ficha.Status;
import rpg2.Inimigos.Inimigos;

/**
 *
 * @author M4ESTRO
 */
public class CampoBatalhaToin extends CampoBatalha{

    //<editor-fold defaultstate="collapsed" desc=" Cálculo dos danos">
    //DANO
    public static void dano(JTextField[] campoTexto, JCheckBox[] debuffers) {
        float danoRecebido = 0;
        boolean flag = true;
        int opcaoCritica;

        do {

            ImageIcon imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Critico.png"));
            opcaoCritica = JOptionPane.showConfirmDialog(null, "Dano Crítico?", "Dano Crítico?", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, imagem);
            if (opcaoCritica == -1) {
                return;
            }

            try {
                String s = JOptionPane.showInputDialog("Insira a quantidade de dano: ");

                if (s == null) {
                    return;
                }

                danoRecebido = Float.parseFloat(s);
                flag = false;

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "INSIRA APENAS NÚMEROS!\n" + ex.toString());
                flag = true;
            }
        } while (flag);

        //caso seja CRÍTICO
        if (opcaoCritica == 0) {
            CampoBatalhaToin.danoCritico(campoTexto, debuffers, danoRecebido);
        } else { //caso seja NÃO CRÍTICO
            CampoBatalhaToin.danoNormal(campoTexto, debuffers, danoRecebido);
        }
    }

    //DANO NORMAL
    public static void danoNormal(JTextField[] campoTexto, JCheckBox[] debuffers, float danoRecebido) {
        int hp;
        float def;
        try {

            hp = Integer.parseInt(campoTexto[0].getText());
            def = Float.parseFloat(campoTexto[1].getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Certifique-se de que todos os campos corretamente preenchidos com NÚMEROS e APENAS NÚMEROS\n"
                    + "Caso algum campo do combatente seja inexistente, preencha com 0 (ZERO)");
            return;
        }

        boolean envenenado = debuffers[0].isSelected();
        boolean ferido = debuffers[1].isSelected();
        int envenenadoINT = 0;
        float feridoINT = 0;

        if (envenenado) {
            envenenadoINT = 10;
        } else {
            envenenadoINT = 0;
        }

        if (ferido) {
            feridoINT = (float) (danoRecebido * 0.1);
        } else {
            feridoINT = 0;
        }

        danoRecebido = (int) ((int) (danoRecebido + feridoINT) - def);

        if (!(danoRecebido <= 0)) {
            hp = (int) (hp - danoRecebido - envenenadoINT);
        }
        hp = (int) (hp - envenenadoINT);
        campoTexto[0].setText(String.valueOf(hp));

    }

    //DANO CRÍTICO
    public static void danoCritico(JTextField[] campoTexto, JCheckBox[] debuffers, float danoRecebido) {
        int hp;
        try {

            hp = Integer.parseInt(campoTexto[0].getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Certifique-se de que os campos HP e DEF-TOTAL estão corretamente preenchidos com NÚMEROS e APENAS NÚMEROS\n"
                    + "Caso a resistência do inimigo seja inexistente, preencha com 0 (ZERO)");
            return;
        }

        boolean envenenado = debuffers[0].isSelected();
        boolean ferido = debuffers[1].isSelected();
        int envenenadoINT = 0;
        float feridoINT = 0;

        if (envenenado) {
            envenenadoINT = 10;
        } else {
            envenenadoINT = 0;
        }

        if (ferido) {
            feridoINT = (float) 0.1;
        } else {
            feridoINT = 0;
        }

        danoRecebido = (int) ((int) danoRecebido + (danoRecebido * feridoINT));
        hp = (int) (hp - danoRecebido - envenenadoINT);
        campoTexto[0].setText(String.valueOf(hp));
    }

    //</editor-fold>
    //Limitação dos caracteres
    public static void formatarCampo(java.awt.event.KeyEvent evt) {
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    //<editor-fold defaultstate="collapsed" desc=" Lista dos players">
    static String[] listaPlayer = new String[11];

    public static void setTodasFichas(JTextField nomeFicha, int numFicha) {
        listaPlayer[0] = "Selecione";
        listaPlayer[numFicha] = nomeFicha.getText();
    }

    public static String[] getListaPlayer() {
        return listaPlayer;
    }

    //<editor-fold defaultstate="collapsed" desc=" Atributos">
    static String[][] atributos = new String[10][16];

    public static void setAtributo(String[] atributo, int player) {
        for (int i = 0; i < 16; i++) {
            //atributos[i][player-1] = atributo[i];
            atributos[player-1][i] = atributo[i];
        }

    }

    public static void getAtributo(JTextField[] campo, JComboBox box) {
        int aux = box.getSelectedIndex();
        if (aux == 0) {
            limpaAtributo(campo);
        } else {
            for (int i = 3; i < 10; i++) {
                campo[i].setText(atributos[box.getSelectedIndex() - 1][i]);
            }
        }

        String def1 = campo[7].getText();
        int defT = Integer.parseInt(def1);
        campo[10].setText(String.valueOf(defT));

    }

    public static void getDefTotal(JTextField jTextFieldRES, JTextField jTextFieldDEF, int bonus) {
        String aux = jTextFieldRES.getText();
        float defT = (float) Float.parseFloat(aux);
        defT = (float) ((defT / 2) + bonus);

        jTextFieldDEF.setText(String.valueOf(defT));
    }

    public static void getAtkTotal(JTextField jTextFieldFOR, JTextField jTextFieldATK, float[] bonus, int quant) {
        float atkT;
        String atk1 = jTextFieldFOR.getText();

        if (bonus[0] == 0) {
            //jTextFieldATK.setText(atk1);
            for (int i = 1; i < quant; i++) {
                atk1 += " | " + bonus[i];
            }
            jTextFieldATK.setText(atk1);
        } else {
            float aux = Float.parseFloat(atk1);
            atkT = (float) (bonus[0] + (aux / 10));
            String aux2 = String.valueOf(atkT);
            for (int i = 1; i < quant; i++) {
                aux2 += " | " + bonus[i];
            }
            jTextFieldATK.setText(aux2);
        }
    }

    public static void setaCampo(int tipo, int atacante, JTextField[] campos, JTextArea[] campoArea, float bonus[], JTextField jTextFieldFORCombatente1, JTextField jTextFieldDTCombatente1, JTextField jTextFieldRESCombatente1, JTextField jTextFieldDEFCombatente1, JComboBox jComboBoxCombatente1) {
        switch (tipo) {
            case 0: // selecione                
                CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                break;

            case 1: // Player
                CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                switch (atacante) {
                    case 0:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 1:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 2:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 3:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 4:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 5:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 6:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 7:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 8:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 9:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;

                    case 10:
                        CampoBatalhaToin.getAtributo(campos, jComboBoxCombatente1);
                        break;
                }

                break;

            case 2: // Inimigo
                CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                switch (atacante) {
                    case 0:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 1:
                        Inimigos.getSobreBandido(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0.5;
                        bonus[1] = (float) 1.0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 2:
                        Inimigos.getSobreTerrorista(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 1);

                        bonus[0] = (float) 0.5;
                        bonus[1] = (float) 1.0;
                        bonus[2] = (float) 3.3;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 3:
                        Inimigos.getSobreMercenario(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 2);

                        bonus[0] = (float) 0.8;
                        bonus[1] = (float) 1.5;
                        bonus[2] = (float) 3.5;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 4:
                        Inimigos.getSobreAgenteUnreal(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 1);

                        bonus[0] = (float) 1.5;
                        bonus[1] = (float) 0.8;
                        bonus[2] = (float) 1.7;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 5:
                        Inimigos.getSobreCacadorUnreal(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 1);

                        bonus[0] = (float) 1.5;
                        bonus[1] = (float) 1.2;
                        bonus[2] = (float) 3.5;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 6:
                        Inimigos.getSobreCombatenteUnreal(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 2);

                        bonus[0] = (float) 1.5;
                        bonus[1] = (float) 1.2;
                        bonus[2] = (float) 4.0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 7:
                        Inimigos.getSobreInfectado(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 5.5;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 8:
                        Inimigos.getSobreCachorroInfectado(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 9:
                        Inimigos.getSobreInfectadoMaldito(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 30;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 10:
                        Inimigos.getSobreCacadoresSombras(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 20;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 11:
                        Inimigos.getSobreMumiasMalditas(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 12:
                        Inimigos.getSobreAberracao(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 13:
                        Inimigos.getSobreInfecAprimorado(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 14:
                        Inimigos.getSobreDemoAlado(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 200;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 15:
                        Inimigos.getSobreScorpion(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 5;
                        bonus[2] = (float) 30;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 16:
                        Inimigos.getSobreLesmaNegra(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 17:
                        Inimigos.getSobreAranhaG(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 18:
                        Inimigos.getSobreChacal(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 19:
                        Inimigos.getSobreBesta(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 22;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                }

                break;

            case 3: //Horda
                CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                switch (atacante) {
                    case 0:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 1:
                        Inimigos.getSobreInfectado(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 5.5;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 2:
                        Inimigos.getSobreCachorroInfectado(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 3:
                        Inimigos.getSobreInfectadoMaldito(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 30;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 4:
                        Inimigos.getSobreMumiasMalditas(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 5:
                        Inimigos.getSobreInfecAprimorado(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 6:
                        Inimigos.getSobreScorpion(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 5;
                        bonus[2] = (float) 30;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 7:
                        Inimigos.getSobreAranhaG(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;
                }
                break;

            case 4: // Boss & outros
                CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                switch (atacante) {
                    case 0:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 1:
                        Inimigos.getSobrePigsaw(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 16.5;
                        bonus[2] = (float) 3.0;
                        bonus[2] = (float) 200.0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 4);
                        break;

                    case 2:
                        Inimigos.getSobreIrmaosJack(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 2;
                        bonus[1] = (float) 1.0;
                        bonus[2] = (float) 2.0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 3:
                        Inimigos.getSobrePhantom(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 1);

                        bonus[0] = (float) 0.5;
                        bonus[1] = (float) 1.2;
                        bonus[2] = (float) 4.0;
                        bonus[2] = (float) 10.0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 4);
                        break;

                    case 4:
                        Inimigos.getSobreTheClown(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 2);

                        bonus[0] = (float) 2;
                        bonus[1] = (float) 1.2;
                        bonus[2] = (float) 3.8;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 5:
                        Inimigos.getSobreBeta02(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 1);

                        bonus[0] = (float) 0.5;
                        bonus[1] = (float) 1.2;
                        bonus[2] = (float) 5.0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 6:
                        Inimigos.getSobreBeta01(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 3);

                        bonus[0] = (float) 1.5;
                        bonus[1] = (float) 3.0;
                        bonus[2] = (float) 10.0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 7:
                        Inimigos.getSobreOmega(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 1.8;
                        bonus[1] = (float) 0.8;
                        bonus[2] = (float) 1.1;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 8:
                        Inimigos.getSobreAlfa(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 1.5;
                        bonus[1] = (float) 10.0;
                        bonus[2] = (float) 4.5;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 9:
                        Inimigos.getSobreTheHunter(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 20);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 50;
                        bonus[2] = (float) 200;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 10:
                        Inimigos.getSobreBaraoInfernal(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 30;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 2);
                        break;

                    case 11:
                        Inimigos.getSobreBocejo(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        bonus[1] = (float) 50;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 3);
                        break;

                    case 12:
                        Inimigos.getSobreGhost(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 13:
                        Inimigos.getSobreCerberus(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 14:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 15:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 16:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 17:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;
                }
                break;
            case 5: // Boss & outros
                CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                switch (atacante) {
                    case 0:
                        CampoBatalhaToin.limpaAtributo(campos, jTextFieldDTCombatente1);
                        break;

                    case 1:
                        Inimigos.getSobreCabecaDemoniaca(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 2:
                        Inimigos.getSobreAparicoes(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 3:
                        Inimigos.getSobreManifestacoes(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                    case 4:
                        Inimigos.getSobrePoltergeist(campos, campoArea);
                        CampoBatalhaToin.getDefTotal(jTextFieldRESCombatente1, jTextFieldDEFCombatente1, 0);

                        bonus[0] = (float) 0;
                        CampoBatalhaToin.getAtkTotal(jTextFieldFORCombatente1, jTextFieldDTCombatente1, bonus, 0);
                        break;

                }
        }
    }

    //</editor-fold>
    public static void limpaAtributo(JTextField[] campo) {
        for (int i = 0; i < 11; i++) {
            campo[i].setText("0");
        }
    }

    public static void limpaAtributo(JTextField[] campo, JTextField ataque) {
        for (int i = 0; i < 11; i++) {
            campo[i].setText("0");
        }
        ataque.setText("0");
    }

    //<editor-fold defaultstate="collapsed" desc=" inimigos">
    static String[] listaInimigos = {"Selecione", "Bandido", "Terrorista", "Mercenarios", "Agente da Unreal", "Caçador da Unreal",
        "Combatente da Unreal", "Infectado", "Cachorro Zumbi", "Infectado maldito", "Caçador das sombras", "Múmia maldita", "Aberração demoniáca",
        "Infectado aprimorado", "Demónio alado", "Scorpion", "Lesma Negra", "Aranha gigante", "Chacal", "Besta"};

    public static String[] getListaInimigos() {
        return listaInimigos;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Horda">
    static String[] listaHorda = {"Selecione", "Infectado", "Cachorro zumbi", "Infectado maldito", "Múmia maldita",
        "Infectado aprimorado", "Scorpion", "Aranhas gigantes"};

    public static String[] getListaHorda() {
        return listaHorda;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Boss e Outros">
    static String[] listaOutros = {"Selecione", "Pigsaw", "Os irmãos Jack", "Phantom", "The Clown", "Beta-02", "Beta-01", "Ômega", "Alfa", "The Hunter",
        "Barão Infernal", "Bocejo", "Ghost", "Cerberus", "Alfa(Versão Besta)", "Cerberus 2.0", "Besta apocalíptica", "Evento do Contexto"};

    public static String[] getListaOutros() {
        return listaOutros;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Aparicoes">
    static String[] listaAparicoes = {"Selecione", "Cabeça demoniaca", "Aparições", "Manifestações", "Poltergeist"};

    public static String[] getListaAparicoes() {
        return listaAparicoes;
    }

    //</editor-fold>
    public static void setComboBoxOrdemAtaque(JComboBox jComboBoxOrdemAtaqueTipo, JComboBox jComboBoxOrdemAtaquePlayer, JComboBox jComboBoxTipoCombatente, JComboBox jComboBoxCombatente, JComboBox jComboBoxQuantidadeInimigo) {
        int atacante = jComboBoxOrdemAtaqueTipo.getSelectedIndex();
        jComboBoxTipoCombatente.setSelectedIndex(0);
        jComboBoxTipoCombatente.setEnabled(false);
        jComboBoxCombatente.setEnabled(false);

        jComboBoxQuantidadeInimigo.setEnabled(false);
        jComboBoxQuantidadeInimigo.setSelectedIndex(0);
        switch (atacante) {

            case 0: //DEFAULT
                jComboBoxOrdemAtaquePlayer.setEnabled(false);
                jComboBoxOrdemAtaquePlayer.setSelectedIndex(0);

                jComboBoxTipoCombatente.setSelectedIndex(0);
                jComboBoxTipoCombatente.setEnabled(false);

                break;

            case 1://PLAYER
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaPlayer()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                jComboBoxTipoCombatente.setSelectedIndex(1);
                break;

            case 2://INIMIGO
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaInimigos()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                jComboBoxTipoCombatente.setSelectedIndex(2);
                break;

            case 3://HORDA
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaHorda()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                jComboBoxTipoCombatente.setSelectedIndex(3);
                jComboBoxQuantidadeInimigo.setEnabled(true);
                break;

            case 4://OUTRO
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaOutros()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                jComboBoxTipoCombatente.setSelectedIndex(4);
                break;

            case 5://APARICOES
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaAparicoes()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                jComboBoxTipoCombatente.setSelectedIndex(5);

                break;
        }
        jComboBoxCombatente.setEnabled(false);

    }

    public static void setComboBoxOrdemAtaque(JComboBox jComboBoxOrdemAtaqueTipo, JComboBox jComboBoxOrdemAtaquePlayer) {
        int atacante = jComboBoxOrdemAtaqueTipo.getSelectedIndex();
        switch (atacante) {

            case 0: //DEFAULT
                jComboBoxOrdemAtaquePlayer.setEnabled(false);
                jComboBoxOrdemAtaquePlayer.setSelectedIndex(0);
                break;

            case 1://PLAYER
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaPlayer()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                break;

            case 2://INIMIGO
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaInimigos()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                break;

            case 3://HORDA
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaHorda()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                break;

            case 4://OUTRO
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaOutros()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                break;

            case 5://APARICOES
                jComboBoxOrdemAtaquePlayer.setModel(new javax.swing.DefaultComboBoxModel(CampoBatalhaToin.getListaAparicoes()));
                jComboBoxOrdemAtaquePlayer.setEnabled(true);
                break;
        }

    }

    //Caso mais inimigos sejam adicionados, aumentar o número de cases proporcionalmente
    //ao maior número de inimigos de uma lista
    public static void setComboBoxCombatente(JComboBox jComboBoxOrdemAtaquePlayer, JComboBox jComboBoxCombatente) {
        int ataque = jComboBoxOrdemAtaquePlayer.getSelectedIndex();

        switch (ataque) {
            case 0:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;
            case 1:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 2:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 3:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 4:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 5:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 6:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 7:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 8:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 9:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 10:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 11:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 12:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 13:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 14:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 15:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 16:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 17:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 18:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 19:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

            case 20:
                jComboBoxCombatente.setSelectedIndex(ataque);
                jComboBoxCombatente.setEnabled(false);
                break;

        }

    }

    //<editor-fold defaultstate="collapsed" desc=" Checar combatente">
    public static void setVantDesvant(int tipo, int atacante) {
        JFrame frame = new JFrame();
        String[] options = {"Vantagens", "Desvantagens"}; //0 - vantagem | 1 - desvantagem       
        int opcao = JOptionPane.showOptionDialog(frame.getContentPane(), "O que desejas saber?", "Vantagem/Desvantagem", 0, JOptionPane.WARNING_MESSAGE, null, options, null);

        if (opcao == -1) {
            return;
        }

        switch (tipo) {
            case 0://Selecione
                JOptionPane.showMessageDialog(null, "Não há inimigo selecionado!");
                break;

            case 1://Player
                try {
                    CampoBatalhaToin.getClasse(atacante, sexos[atacante], opcao);
                } catch (ArrayIndexOutOfBoundsException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione um jogador válido!");
                }
                break;

            case 2://Inimigo
                CampoBatalhaToin.getInimigo(atacante, opcao);
                break;

            case 3://Horda
                CampoBatalhaToin.getHorda(atacante, opcao);
                break;

            case 4://Boss & Outros
                CampoBatalhaToin.getBoss(atacante, opcao);
                break;

            case 5://Aparições 
                CampoBatalhaToin.getAparicao(atacante, opcao);
                break;
        }
    }

    static int[] classes = new int[11];

    public static void setClasse(int classe, int player) {
        classes[player] = classe;
    }

    static int[] sexos = new int[11];

    public static void setSexo(int sexo, int player) {
        sexos[player] = sexo;
    }

    public static void getClasse(int pos, int sexo, int opcao) {
        switch (opcao) {
            case 0:
                //<editor-fold defaultstate="collapsed" desc=" Vantagens">
                if (pos < 0) {
                    Status.getVantagens(0, 0);
                } else {
                    switch (classes[pos]) {
                        case 0://Selecione a classe
                            Status.getVantagens(0, sexo);
                            break;

                        case 1://Fuzileiro Naval
                            Status.getVantagens(1, sexo);
                            break;

                        case 2://Força Policial
                            Status.getVantagens(2, sexo);
                            break;

                        case 3://B.H.C
                            Status.getVantagens(3, sexo);
                            break;

                        case 4://Hacker
                            Status.getVantagens(4, sexo);
                            break;

                        case 5://Químico
                            Status.getVantagens(5, sexo);
                            break;

                        case 6://Médico
                            Status.getVantagens(6, sexo);
                            break;

                        case 7://Engenheiro
                            Status.getVantagens(7, sexo);
                            break;

                        default:
                            Status.getVantagens(0, sexo);
                    }
                }
                //</editor-fold>
                break;

            case 1:
                //<editor-fold defaultstate="collapsed" desc=" Vantagens">
                if (pos < 0) {
                    Status.getVantagens(0, 0);
                } else {
                    switch (classes[pos]) {
                        case 0://Selecione a classe
                            Status.getVantagens(0, sexo);
                            break;

                        case 1://Fuzileiro Naval
                            Status.getDesvantagens(1, sexo);
                            break;

                        case 2://Força Policial
                            Status.getDesvantagens(2, sexo);
                            break;

                        case 3://B.H.C
                            Status.getDesvantagens(3, sexo);
                            break;

                        case 4://Hacker
                            Status.getDesvantagens(4, sexo);
                            break;

                        case 5://Químico
                            Status.getDesvantagens(5, sexo);
                            break;

                        case 6://Médico
                            Status.getDesvantagens(6, sexo);
                            break;

                        case 7://Engenheiro
                            Status.getDesvantagens(7, sexo);
                            break;

                        default:
                            Status.getVantagens(0, sexo);
                    }
                }
                //</editor-fold>                
                break;

            default:
                return;
        }
    }

    public static void getInimigo(int atacante, int opcao) {

        switch (opcao) {
            case 0:
                //<editor-fold defaultstate="collapsed" desc=" Vantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Bandido
                        Inimigos.getVantagensHumano(1);
                        break;

                    case 2://Terrorista
                        Inimigos.getVantagensHumano(2);
                        break;

                    case 3://Mercenarios
                        Inimigos.getVantagensHumano(3);
                        break;

                    case 4://Agente da Unreal
                        Inimigos.getVantagensHumano(4);
                        break;

                    case 5://Caçador da Unreal
                        Inimigos.getVantagensHumano(5);
                        break;

                    case 6://Combatente da Unreal
                        Inimigos.getVantagensHumano(6);
                        break;

                    case 7://Infectado
                        Inimigos.getVantagensInfect1(1);
                        break;

                    case 8://Cachorro Zumbi
                        Inimigos.getVantagensInfect1(2);
                        break;

                    case 9://Infectado maldito
                        Inimigos.getVantagensInfect1(3);
                        break;

                    case 10://Caçador das sombras
                        Inimigos.getVantagensInfect1(4);
                        break;

                    case 11://Múmia maldita
                        Inimigos.getVantagensInfect1(5);
                        break;

                    case 12://Aberração demoniáca
                        Inimigos.getVantagensInfect2(1);
                        break;

                    case 13://Infectado aprimorado
                        Inimigos.getVantagensInfect2(2);
                        break;

                    case 14://Demónio alado
                        Inimigos.getVantagensInfect2(3);
                        break;

                    case 15://Scorpion
                        Inimigos.getVantagensInfect2(4);
                        break;

                    case 16://Lesma Negra
                        Inimigos.getVantagensInfect2(5);
                        break;

                    case 17://Aranha gigante
                        Inimigos.getVantagensInfect2(6);
                        break;

                    case 18://Chacal
                        Inimigos.getVantagensInfect2(7);
                        break;

                    case 19://Besta
                        Inimigos.getVantagensInfect2(8);

                        break;
                    //</editor-fold>
                }
                break;

            case 1:
                //<editor-fold defaultstate="collapsed" desc=" desvantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Bandido
                        Inimigos.getDesvantagensHumano(1);
                        break;

                    case 2://Terrorista
                        Inimigos.getDesvantagensHumano(2);
                        break;

                    case 3://Mercenarios
                        Inimigos.getDesvantagensHumano(3);
                        break;

                    case 4://Agente da Unreal
                        Inimigos.getDesvantagensHumano(4);
                        break;

                    case 5://Caçador da Unreal  
                        Inimigos.getDesvantagensHumano(5);
                        break;

                    case 6://Combatente da Unreal
                        Inimigos.getDesvantagensHumano(6);
                        break;

                    case 7://Infectado
                        Inimigos.getDesvantagensInfect1(1);
                        break;

                    case 8://Cachorro Zumbi
                        Inimigos.getDesvantagensInfect1(2);
                        break;

                    case 9://Infectado maldito
                        Inimigos.getDesvantagensInfect1(3);
                        break;

                    case 10://Caçador das sombras
                        Inimigos.getDesvantagensInfect1(4);
                        break;

                    case 11://Múmia maldita
                        Inimigos.getDesvantagensInfect1(5);
                        break;

                    case 12://Aberração demoniáca
                        Inimigos.getDesvantagensInfect2(1);
                        break;

                    case 13://Infectado aprimorado
                        Inimigos.getDesvantagensInfect2(2);
                        break;

                    case 14://Demónio alado
                        Inimigos.getDesvantagensInfect2(3);
                        break;

                    case 15://Scorpion
                        Inimigos.getDesvantagensInfect2(4);
                        break;

                    case 16://Lesma Negra
                        Inimigos.getDesvantagensInfect2(5);
                        break;

                    case 17://Aranha gigante
                        Inimigos.getDesvantagensInfect2(6);
                        break;

                    case 18://Chacal
                        Inimigos.getDesvantagensInfect2(7);
                        break;

                    case 19://Besta
                        Inimigos.getDesvantagensInfect2(8);
                        break;
                    //</editor-fold>
                }
                break;

            default:
                return;
        }

    }

    public static void getHorda(int atacante, int opcao) {
        switch (opcao) {
            case 0:
                //<editor-fold defaultstate="collapsed" desc=" Vantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Infectado
                        Inimigos.getVantagensInfect1(1);
                        break;

                    case 2://Cachorro Zumbi
                        Inimigos.getVantagensInfect1(2);
                        break;

                    case 3://Infectado maldito
                        Inimigos.getVantagensInfect1(3);
                        break;

                    case 4://Múmia maldita
                        Inimigos.getVantagensInfect1(5);
                        break;

                    case 5://Infectado aprimorado
                        Inimigos.getVantagensInfect2(2);
                        break;

                    case 6://Scorpion
                        Inimigos.getVantagensInfect2(4);
                        break;

                    case 7://Aranha gigante
                        Inimigos.getVantagensInfect2(6);
                        break;
                }
                //</editor-fold>

                break;

            case 1:
                //<editor-fold defaultstate="collapsed" desc=" Desvantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Infectado
                        Inimigos.getDesvantagensInfect1(1);
                        break;

                    case 2://Cachorro Zumbi
                        Inimigos.getDesvantagensInfect1(2);
                        break;

                    case 3://Infectado maldito
                        Inimigos.getDesvantagensInfect1(3);
                        break;

                    case 4://Múmia maldita
                        Inimigos.getDesvantagensInfect1(5);
                        break;

                    case 5://Infectado aprimorado
                        Inimigos.getDesvantagensInfect2(2);
                        break;

                    case 6://Scorpion
                        Inimigos.getDesvantagensInfect2(4);
                        break;

                    case 7://Aranha gigante
                        Inimigos.getDesvantagensInfect2(6);
                        break;
                }
                //</editor-fold>
                break;

            default:
                return;
        }

    }

    public static void getBoss(int atacante, int opcao) {
        switch (opcao) {
            case 0:
                //<editor-fold defaultstate="collapsed" desc=" Vantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Pigsaw
                        Inimigos.getVantagensHumano(7);
                        break;

                    case 2://Os irmãos Jack
                        Inimigos.getVantagensHumano(8);
                        break;

                    case 3://Phantom
                        Inimigos.getVantagensHumano(9);
                        break;

                    case 4://The Clown
                        Inimigos.getVantagensHumano(10);
                        break;

                    case 5://Beta-02
                        Inimigos.getVantagensHumano(11);
                        break;

                    case 6://Beta-01
                        Inimigos.getVantagensHumano(12);
                        break;

                    case 7://Ômega
                        Inimigos.getVantagensHumano(13);
                        break;

                    case 8://Alfa
                        Inimigos.getVantagensHumano(14);
                        break;

                    case 9://The Hunter
                        Inimigos.getVantagensInfect3(1);
                        break;

                    case 10://Barão Infernal
                        Inimigos.getVantagensInfect3(2);
                        break;

                    case 11://Bocejo
                        Inimigos.getVantagensInfect3(3);
                        break;

                    case 12://Ghost
                        Inimigos.getVantagensInfect3(4);
                        break;

                    case 13://Cerberus
                        Inimigos.getVantagensInfect3(5);
                        break;

                    case 14://Alfa(Versão Besta)
                        Inimigos.getVantagensInfect3(0);
                        break;

                    case 15://Cerberus 2.0
                        Inimigos.getVantagensInfect4(1);
                        break;

                    case 16://Besta apocalíptica
                        Inimigos.getVantagensInfect3(0);
                        break;

                    case 17://Evento do Contexto
                        Inimigos.getVantagensHumano(0);
                        break;
                }
                //</editor-fold>                 
                break;
            case 1:
                //<editor-fold defaultstate="collapsed" desc=" Desvantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Pigsaw
                        Inimigos.getDesvantagensHumano(7);
                        break;

                    case 2://Os irmãos Jack
                        Inimigos.getDesvantagensHumano(8);
                        break;

                    case 3://Phantom
                        Inimigos.getDesvantagensHumano(9);
                        break;

                    case 4://The Clown
                        Inimigos.getDesvantagensHumano(10);
                        break;

                    case 5://Beta-02
                        Inimigos.getDesvantagensHumano(11);
                        break;

                    case 6://Beta-01
                        Inimigos.getDesvantagensHumano(12);
                        break;

                    case 7://Ômega
                        Inimigos.getDesvantagensHumano(13);
                        break;

                    case 8://Alfa
                        Inimigos.getDesvantagensHumano(14);
                        break;

                    case 9://The Hunter
                        Inimigos.getDesvantagensInfect3(1);
                        break;

                    case 10://Barão Infernal
                        Inimigos.getDesvantagensInfect3(2);
                        break;

                    case 11://Bocejo
                        Inimigos.getDesvantagensInfect3(3);
                        break;

                    case 12://Ghost
                        Inimigos.getDesvantagensInfect3(4);
                        break;

                    case 13://Cerberus
                        Inimigos.getDesvantagensInfect3(5);
                        break;

                    case 14://Alfa(Versão Besta)
                        Inimigos.getDesvantagensInfect3(0);
                        break;

                    case 15://Cerberus 2.0
                        Inimigos.getDesvantagensInfect4(1);
                        break;

                    case 16://Besta apocalíptica
                        Inimigos.getDesvantagensInfect3(0);
                        break;

                    case 17://Evento do Contexto
                        Inimigos.getVantagensHumano(0);
                        break;
                }
                //</editor-fold>
                break;

            default:
                return;
        }

    }

    public static void getAparicao(int atacante, int opcao) {
        switch (opcao) {
            case 0:
                //<editor-fold defaultstate="collapsed" desc=" Vantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Cabeça demoniaca
                        Inimigos.getVantagensAparicoes(1);
                        break;

                    case 2://Aparições
                        Inimigos.getVantagensAparicoes(2);
                        break;

                    case 3://Manifestações 
                        Inimigos.getVantagensAparicoes(3);
                        break;

                    case 4://Poltergeist
                        Inimigos.getVantagensAparicoes(4);
                        break;
                }
                //</editor-fold>
                break;

            case 1:
                //<editor-fold defaultstate="collapsed" desc=" Vantagens">
                switch (atacante) {
                    case 0://Selecione
                        Inimigos.getVantagensHumano(0);
                        break;

                    case 1://Cabeça demoniaca
                        Inimigos.getDesvantagensAparicoes(1);
                        break;

                    case 2://Aparições
                        Inimigos.getDesvantagensAparicoes(2);
                        break;

                    case 3://Manifestações 
                        Inimigos.getDesvantagensAparicoes(3);
                        break;

                    case 4://Poltergeist
                        Inimigos.getDesvantagensAparicoes(4);
                        break;
                }
                //</editor-fold>
                break;

            default:
                return;
        }

    }

    public static void configButao(JComboBox jComboBoxOrdemAtaqueTipo, JComboBox jComboBoxOrdemAtaquePlayer, JButton jButtonChecar) {
        int tipo = jComboBoxOrdemAtaqueTipo.getSelectedIndex();
        int atacante = jComboBoxOrdemAtaquePlayer.getSelectedIndex();
        if (tipo == 0 || atacante == 0) {
            jButtonChecar.setEnabled(false);
        } else {
            jButtonChecar.setEnabled(true);
        }
    }

//</editor-fold>
}
