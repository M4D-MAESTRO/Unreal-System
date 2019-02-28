/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author M4ESTRO
 */
public class Status {

    static ImageIcon icone = null;

    //Método referente aos status
    public static void setStatus(JTextField status, JTextField pontos) {
        String statusS = status.getText();
        int statusInt = Integer.parseInt(statusS);

        String skillPointDisponiveisS = pontos.getText();
        int skillPointDisponiveisInt = Integer.parseInt(skillPointDisponiveisS);

        if ((statusInt < 30) && (skillPointDisponiveisInt > 0)) {
            status.setText(String.valueOf(statusInt + 1));
            pontos.setText(String.valueOf(skillPointDisponiveisInt - 1));
        } else {
            JOptionPane.showMessageDialog(null, "Status no máximo: 30 \nOU \nNão há skill points suficiente");
        }
    }

    public static void setVitalidade(JTextField status, JTextField pontos) {

        String vitS = status.getText();
        int vitInt = Integer.parseInt(vitS) + 1;
        vitS = String.valueOf(vitInt);
        String skillPointsS = pontos.getText();
        int skillPontsInt = Integer.parseInt(skillPointsS);

        if ((vitInt - 1 < 130) && (skillPontsInt > 0)) {
            status.setText(vitS);
            skillPontsInt -= 1;
            pontos.setText(String.valueOf(skillPontsInt));
        } else {
            JOptionPane.showMessageDialog(null, "Vitalidade no máximo: 130 \nOU \nNão há skill points suficiente.");
        }

    }

    public static void addBonus(JTextField campo, JLabel maisOuMenos) {
        boolean tenteNovamente = false;

        do {
            tenteNovamente = false;

            try {

                String bonusS = JOptionPane.showInputDialog("Insira a quantidade de bonus a ser adicionada: ");
                int bonusInt = Integer.parseInt(bonusS);
                String bonusAnterior;
                int bonusAnteriorInt;
                bonusAnterior = campo.getText();
                bonusAnteriorInt = Integer.parseInt(bonusAnterior);
                bonusInt = bonusInt + bonusAnteriorInt;
                bonusS = String.valueOf(bonusInt);
                if (bonusInt < 0) {
                    maisOuMenos.setText("-");
                } else {
                    maisOuMenos.setText("+");
                }
                campo.setText(bonusS);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "INSIRA APENAS NÚMEROS! \n" + e.toString());
                tenteNovamente = true;
            }

        } while (tenteNovamente);
    }

    public static int opcaoBonus() {
        boolean tenteNovamente = false;
        boolean selecao = false;
        int opcaoInt = -1;

        do {
            tenteNovamente = false;
            try {
                do {
                    String opcaoS = JOptionPane.showInputDialog("Selecione o status \n1 - FOR \n2 - STM \n3 - RES \n4 - PER \n5 - INT \n6 - PES \n7- CAR");

                    if (opcaoS == null) {
                        return JOptionPane.CLOSED_OPTION;
                    }

                    opcaoInt = Integer.parseInt(opcaoS);
                    selecao = false;

                    if ((opcaoInt < 1) || (opcaoInt > 7)) {
                        JOptionPane.showMessageDialog(null, "Você selecionou uma opção inválida! \nTente novamente.");
                        selecao = true;
                    }

                } while (selecao);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "INSIRA APENAS NÚMEROS! \n" + e.toString());
                tenteNovamente = true;
            }
        } while (tenteNovamente);

        return opcaoInt;
    }

    public static void removerBonus(JTextField campo, JLabel maisOuMenos) {
        boolean tenteNovamente = false;

        do {
            tenteNovamente = false;

            try {

                String bonusS = JOptionPane.showInputDialog("Insira a quantidade de bonus a ser adicionada: ");
                int bonusInt = Integer.parseInt(bonusS);
                String bonusAnterior;
                int bonusAnteriorInt;
                bonusAnterior = campo.getText();
                bonusAnteriorInt = Integer.parseInt(bonusAnterior);
                bonusInt = bonusAnteriorInt - bonusInt;
                bonusS = String.valueOf(bonusInt);
                if (bonusInt < 0) {
                    maisOuMenos.setText("-");
                } else {
                    maisOuMenos.setText("+");
                }
                campo.setText(bonusS);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "INSIRA APENAS NÚMEROS! \n" + e.toString());
                tenteNovamente = true;
            }

        } while (tenteNovamente);
    }

    //Método referente aos status modificáveis.
    public static void removerVit(JTextField vitAtual, JTextField vit, JCheckBox ferido, JCheckBox envenenado) {
        boolean flag;
        do {

            flag = false;
            try {
                String aux = JOptionPane.showInputDialog("Insira a quantidade de vitalidade a ser REMOVIDA: ");
                if (aux == null) {
                    return;
                }

                String vitAtualS = vitAtual.getText();
                int vitAtualInt = Integer.parseInt(vitAtualS);
                int vitRemovida = Integer.parseInt(aux);
                String vitTotalS = vit.getText();
                int vitTotalInt = Integer.parseInt(vitTotalS);

                //Debuffers
                //Ferido:
                int debufferFerido = 0;
                if (ferido.isSelected()) {
                    debufferFerido = (int) ((int) vitRemovida * 0.1);
                }
                //Envenenado:
                int debufferEnvenenado = 0;
                if (envenenado.isSelected()) {
                    debufferEnvenenado = 10;
                }

                if (vitAtualInt - vitRemovida >= 0) {
                    aux = String.valueOf(vitAtualInt - vitRemovida - debufferFerido - debufferEnvenenado);
                    vitAtual.setText(aux);
                } else {
                    vitAtual.setText("0");
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void removerVit(JTextField vitAtual, JTextField vit, boolean atrib, int sangrando, int envenenado) {
        boolean flag;
        String atributo;

        if (atrib) {
            atributo = "PV";
        } else {
            atributo = "PM";
        }
        do {

            flag = false;
            try {
                String aux = JOptionPane.showInputDialog("Insira a quantidade de " + atributo + " a ser REMOVIDA: ");
                if (aux == null) {
                    return;
                }

                String vitAtualS = vitAtual.getText();
                int vitAtualInt = Integer.parseInt(vitAtualS);
                int vitRemovida = Integer.parseInt(aux);
                String vitTotalS = vit.getText();
                int vitTotalInt = Integer.parseInt(vitTotalS);

                if (atrib) {
                    float porcentagem = (float) (sangrando * 0.01);
                    sangrando = (int) (vitRemovida * porcentagem);

                    if (vitAtualInt - vitRemovida >= 0) {
                        aux = String.valueOf(vitAtualInt - (vitRemovida + sangrando + envenenado));
                        vitAtual.setText(aux);
                    } else {
                        vitAtual.setText("0");
                    }
                } else {
                    if (vitAtualInt - vitRemovida >= 0) {
                        aux = String.valueOf(vitAtualInt - vitRemovida);
                        vitAtual.setText(aux);
                    } else {
                        vitAtual.setText("0");
                    }
                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void removerVitNaoCritica(JTextField vitAtual, JTextField vit, JCheckBox ferido, JCheckBox envenenado, int res, int def) {
        boolean flag;
        do {

            flag = false;
            try {
                String aux = JOptionPane.showInputDialog("Insira a quantidade de vitalidade a ser REMOVIDA: ");
                if (aux == null) {
                    return;
                }

                String vitAtualS = vitAtual.getText();
                int vitAtualInt = Integer.parseInt(vitAtualS);
                int vitRemovida = Integer.parseInt(aux);
                String vitTotalS = vit.getText();
                int vitTotalInt = Integer.parseInt(vitTotalS);

                //Debuffers
                //Ferido:
                int debufferFerido = 0;
                if (ferido.isSelected()) {
                    debufferFerido = (int) ((int) vitRemovida * 0.1);
                }
                //Envenenado:
                int debufferEnvenenado = 0;
                if (envenenado.isSelected()) {
                    debufferEnvenenado = 10;
                }

                //Calculo da defesa + resistencia
                res = res / 2;
                def = def + res;

                if (vitAtualInt - vitRemovida >= 0) {
                    aux = String.valueOf(vitAtualInt + (def - vitRemovida - debufferFerido - debufferEnvenenado));
                    vitAtual.setText(aux);
                } else {
                    vitAtual.setText("0");
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void removerVitNaoCritica(JTextField vitAtual, JTextField vit, int def, int sangrando, int envenenado) {
        boolean flag;
        do {

            flag = false;
            try {
                String aux = JOptionPane.showInputDialog("Insira a quantidade de vitalidade a ser REMOVIDA: ");
                if (aux == null) {
                    return;
                }

                String vitAtualS = vitAtual.getText();
                int vitAtualInt = Integer.parseInt(vitAtualS);
                int vitRemovida = Integer.parseInt(aux);
                String vitTotalS = vit.getText();
                int vitTotalInt = Integer.parseInt(vitTotalS);

                float porcentagem = (float) (sangrando * 0.01);
                sangrando = (int) (vitRemovida * porcentagem);
                if (vitAtualInt - vitRemovida >= 0) {
                    aux = String.valueOf(vitAtualInt - (vitRemovida - def));
                    aux = String.valueOf(Integer.parseInt(aux) - (sangrando + envenenado));
                    vitAtual.setText(aux);
                } else {
                    vitAtual.setText("0");
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void removerVitNaoCritica(JTextField vitAtual, JTextField vit, int res, int def) {
        boolean flag;
        do {

            flag = false;
            try {
                String aux = JOptionPane.showInputDialog("Insira a quantidade de vitalidade a ser REMOVIDA: ");
                if (aux == null) {
                    return;
                }

                String vitAtualS = vitAtual.getText();
                int vitAtualInt = Integer.parseInt(vitAtualS);
                int vitRemovida = Integer.parseInt(aux);
                String vitTotalS = vit.getText();
                int vitTotalInt = Integer.parseInt(vitTotalS);

                //Calculo da defesa + resistencia
                res = res / 2;
                def = def + res;

                if (vitAtualInt - vitRemovida >= 0) {
                    aux = String.valueOf(vitAtualInt + (def - vitRemovida));
                    vitAtual.setText(aux);
                } else {
                    vitAtual.setText("0");
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void removerKarma(JTextField karma) {
        boolean flag;
        do {

            flag = false;
            try {

                String aux = JOptionPane.showInputDialog(null, "Insira a quantidade de karma a ser REMOVIDA: ");
                int teste;

                if (aux == null) {
                    return;
                }

                int karmaRemovido = Integer.parseInt(aux);
                String karmaAnterior = karma.getText();
                int karmaAnteriorInt = Integer.parseInt(karmaAnterior);

                if (karmaAnteriorInt > 0) {
                    karma.setText(String.valueOf(karmaAnteriorInt - karmaRemovido));
                }

                if (karmaAnteriorInt - karmaRemovido < 0) {
                    karma.setText("0");
                }

                //Desvantagem e vantagem do Karma CORES
                if (karmaAnteriorInt <= 20 || karmaAnteriorInt - karmaRemovido <= 20) {
                    karma.setForeground(Color.red);
                } else if (karmaAnteriorInt > 81 || karmaAnteriorInt - karmaRemovido > 81) {
                    karma.setForeground(Color.blue);
                } else {
                    karma.setForeground(Color.black);
                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void addAPE(JTextField ape) {
        int addAPE = 10;

        String apeAtualS = ape.getText();
        int apeAtualInt = Integer.parseInt(apeAtualS);
        apeAtualS = String.valueOf(apeAtualInt + addAPE);

        if (apeAtualInt + addAPE <= 100) {
            ape.setText(apeAtualS);
        } else {
            ape.setText("100");
        }
    }

    public static void addXP(JTextField xpC, JTextField xpPraU, JTextField nivelO, JTextField skillPoints, boolean recurso, JTextField[] atributos, String divindade) {
        boolean flag;
        do {

            flag = false;
            try {

                //Calculo para pegar o nivel e ir somando O xp
                int xpTinha, xpAdiqurida;
                String xpObtida = xpC.getText();
                xpTinha = Integer.parseInt(xpObtida);

                if (!recurso) {
                    String aux = JOptionPane.showInputDialog("Insira a quantidade de XP adiquirida: ");
                    if (aux == null) {
                        return;
                    }
                    xpAdiqurida = Integer.parseInt(aux);
                    aux = String.valueOf(xpTinha + xpAdiqurida);
                    xpC.setText(aux);
                }

                //Fim
                //Calculo do XP pra upar
                String xp = xpC.getText();
                String xpPra = xpPraU.getText();
                String nivelAtual = nivelO.getText();
                String nivelAntigo = nivelAtual;
                int xpObtido = Integer.parseInt(xp), xpPraUpar = Integer.parseInt(xpPra), nivel = Integer.parseInt(nivelAtual);

                if (xpObtido >= xpPraUpar) {
                    xpObtido = xpObtido - xpPraUpar;
                    if (xpObtido < 0) {
                        xpC.setText("0");
                    } else {
                        xpC.setText(String.valueOf(xpObtido));
                    }

                    xpPra = String.valueOf(xpPraUpar + 150);
                    xpPraU.setText(xpPra);
                    nivelAtual = String.valueOf(nivel + 1);
                    nivelO.setText(nivelAtual);
                    Status.setSkillDivindade(atributos, divindade);
                    if (xpObtido >= (xpPraUpar + 150)) {
                        addXP(xpC, xpPraU, nivelO, skillPoints, true, atributos, divindade);
                    }
                }

                /*//Limite de niveil 50
                if (Integer.parseInt(nivelAtual) >= 50) {
                    nivelO.setText("50");
                    JOptionPane.showMessageDialog(null, "NÍVEL MÁXIMO ALCANÇADO!");
                    addXP.setEnabled(false);
                }*/
                //calculo para pegas skill points
                int nivelAtualInt = Integer.parseInt(nivelAtual);
                int nivelAntigoInt = Integer.parseInt(nivelAntigo);
                int skillPoint = Integer.parseInt(skillPoints.getText());
                if (nivelAtualInt > nivelAntigoInt) {
                    skillPoints.setText(String.valueOf(skillPoint + 1));
                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void setSkillDivindade(JTextField[] atributos, String divindade) {
        int forca = Integer.parseInt(atributos[0].getText());
        int des = Integer.parseInt(atributos[1].getText());
        int inte = Integer.parseInt(atributos[2].getText());
        int sab = Integer.parseInt(atributos[3].getText());
        int sor = Integer.parseInt(atributos[4].getText());
        int res = Integer.parseInt(atributos[5].getText());

        switch (divindade) {
            case "Isalti":
                inte += 4;
                res += 3;
                atributos[2].setText(String.valueOf(inte));
                atributos[5].setText(String.valueOf(res));

                break;

            case "Flogos":
                forca += 4;
                des += 3;
                atributos[0].setText(String.valueOf(forca));
                atributos[1].setText(String.valueOf(des));

                break;

            case "Theires":
                inte += 2;
                des += 5;
                atributos[1].setText(String.valueOf(des));
                atributos[2].setText(String.valueOf(inte));

                break;

            case "Salvinar":
                des += 2;
                forca += 2;
                inte += 3;
                atributos[0].setText(String.valueOf(forca));
                atributos[1].setText(String.valueOf(des));
                atributos[2].setText(String.valueOf(inte));

                break;

            case "Sunlíver":
                forca += 5;
                sab += 2;
                atributos[0].setText(String.valueOf(forca));
                atributos[3].setText(String.valueOf(sab));

                break;

            case "Khisgymn":
                des += 2;
                sab += 3;
                res += 2;
                atributos[1].setText(String.valueOf(des));
                atributos[3].setText(String.valueOf(sab));
                atributos[5].setText(String.valueOf(res));

                break;

            case "Iryni":
                inte += 3;
                sab += 4;
                atributos[2].setText(String.valueOf(inte));
                atributos[3].setText(String.valueOf(sab));

                break;

            case "Fleyre":
                forca += 2;
                des += 2;
                inte += 2;
                sab += 2;
                atributos[0].setText(String.valueOf(forca));
                atributos[1].setText(String.valueOf(des));
                atributos[3].setText(String.valueOf(sab));
                atributos[2].setText(String.valueOf(inte));

                break;

            case "Sysrimia":
                inte += 5;
                sor += 2;
                atributos[2].setText(String.valueOf(inte));
                atributos[4].setText(String.valueOf(sor));

                break;

            case "Schaicar":
                forca += 4;
                res += 3;
                atributos[0].setText(String.valueOf(forca));
                atributos[5].setText(String.valueOf(res));

                break;

            case "Safiar":
                inte += 6;
                sab += 1;
                atributos[2].setText(String.valueOf(inte));
                atributos[3].setText(String.valueOf(sab));

                break;

            case "Navren":
                forca += 6;
                sab += 1;
                atributos[0].setText(String.valueOf(forca));
                atributos[3].setText(String.valueOf(sab));

                break;

            case "Lyara":
                inte += 4;
                sab += 3;
                atributos[2].setText(String.valueOf(inte));
                atributos[3].setText(String.valueOf(sab));

                break;

            case "Azariel":
                des += 3;
                forca += 2;
                res += 2;
                atributos[0].setText(String.valueOf(forca));
                atributos[1].setText(String.valueOf(des));
                atributos[5].setText(String.valueOf(res));

                break;

            case "Lucinel":
                inte += 3;
                forca += 2;
                res += 2;
                atributos[0].setText(String.valueOf(forca));
                atributos[2].setText(String.valueOf(inte));
                atributos[5].setText(String.valueOf(res));

                break;

            case "Daclel":
                des += 3;
                inte += 2;
                res += 2;
                atributos[1].setText(String.valueOf(des));
                atributos[2].setText(String.valueOf(inte));
                atributos[5].setText(String.valueOf(res));

                break;

            case "Jesiel":
                sab += 3;
                inte += 4;
                res += 2;
                atributos[3].setText(String.valueOf(sab));
                atributos[2].setText(String.valueOf(inte));
                //atributos[6].setText(String.valueOf(res));

                break;

        }
    }

    public static void skillDivindade(String divindade) {
        switch (divindade) {
            case "Isalti":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +4;\nResistência +3;", "Isalti", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Flogos":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nForça +4;\nDestreza +3;", "Flogos", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Theires":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +2;\nDestreza +5;", "Theires", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Salvinar":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +3;\nDestreza +2;\nForça +2", "Salvinar", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Sunlíver":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nSabedoria +2;\nForça +5", "Sunlíver", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Khisgymn":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nDestreza +2;\nSabedoria +3;\nResistência +2", "Khisgymn", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Iryni":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nSabedoria +4;\nInteligência +3", "Iryni", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Fleyre":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nForça +2;\nDestreza +2\nSabedoria +2;\nInteligência +2", "Fleyre", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Sysrimia":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +5;\nSorte +2", "Sysrimia", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Schaicar":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nForça +4;\nResistência +3", "Schaicar", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Safiar":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +6;\nSabedoria +1", "Safiar", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Navren":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nForça +6;\nSabedoria +1", "Navren", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Lyara":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +4;\nSabedoria +3", "Lyara", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Azariel":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nDestreza +4;\nForça +3;\nResistência +2", "Azariel", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Lucinel":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +3;\nForça +2;\nResistência +2", "Lucinel", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Daclel":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nInteligência +2;\nDestreza +3;\nResistência +2", "Lucinel", JOptionPane.PLAIN_MESSAGE, null);
                break;

            case "Jesiel":
                JOptionPane.showMessageDialog(null, "Bónus por level upado:\nSabedoria +3;\nInteligência +4;", "Jesiel", JOptionPane.PLAIN_MESSAGE, null);
                //atributos[6].setText(String.valueOf(res)); Resistência +2

                break;

        }
    }

    public static void addXP(JTextField xpC, JTextField xpPraU, JTextField nivelO, JButton addXP, JTextField skillPoints) {
        boolean flag;
        do {

            flag = false;
            try {

                //Calculo para pegar o nivel e ir somando O xp
                int xpTinha, xpAdiqurida;
                String xpObtida = xpC.getText();
                xpTinha = Integer.parseInt(xpObtida);

                String aux = JOptionPane.showInputDialog("Insira a quantidade de XP adiquirida: ");
                if (aux == null) {
                    return;
                }
                xpAdiqurida = Integer.parseInt(aux);
                aux = String.valueOf(xpTinha + xpAdiqurida);
                xpC.setText(aux);
                //Fim

                //Calculo do XP pra upar
                String xp = xpC.getText();
                String xpPra = xpPraU.getText();
                String nivelAtual = nivelO.getText();
                String nivelAntigo = nivelAtual;
                int xpObtido = Integer.parseInt(xp), xpPraUpar = Integer.parseInt(xpPra), nivel = Integer.parseInt(nivelAtual);

                if (xpObtido >= xpPraUpar) {
                    xpC.setText("0");
                    xpPra = String.valueOf(xpPraUpar + 100);
                    xpPraU.setText(xpPra);
                    nivelAtual = String.valueOf(nivel + 1);
                    nivelO.setText(nivelAtual);
                }

                //Limite de niveil 50
                if (Integer.parseInt(nivelAtual) >= 50) {
                    nivelO.setText("50");
                    JOptionPane.showMessageDialog(null, "NÍVEL MÁXIMO ALCANÇADO!");
                    addXP.setEnabled(false);
                }

                //calculo para pegas skill points
                int nivelAtualInt = Integer.parseInt(nivelAtual);
                int nivelAntigoInt = Integer.parseInt(nivelAntigo);
                int skillPoint = Integer.parseInt(skillPoints.getText());
                if (nivelAtualInt > nivelAntigoInt) {
                    skillPoints.setText(String.valueOf(skillPoint + 1));
                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void addXP(JButton addXP, JTextField xp, JTextField xpPra, JTextField nivelO, JTextField especial, JTextField skillPoints, JCheckBox hab1, JCheckBox hab2, JCheckBox hab3) {
        boolean flag;
        do {

            flag = false;
            try {

                //Calculo para pegar o nivel e ir somando O xp                
                String aux = JOptionPane.showInputDialog("Insira a quantidade de XP adiquirida: ");
                if (aux == null) {
                    return;
                }

                int xpPraInt = Integer.parseInt(xpPra.getText());
                int xpInt = Integer.parseInt(xp.getText());
                int novoXp = xpInt + Integer.parseInt(aux);

                int nivel = Integer.parseInt(nivelO.getText());
                if (novoXp >= xpPraInt) {
                    if (nivel >= 60) {
                        nivelO.setText("60");
                    } else {
                        nivel++;
                        nivelO.setText(String.valueOf(nivel));
                        int skill = Integer.parseInt(skillPoints.getText());
                        skill++;
                        skillPoints.setText(String.valueOf(skill));
                        xpPraInt += 100;
                        xpPra.setText(String.valueOf(xpPraInt));
                        xp.setText(String.valueOf(0));
                    }
                } else {
                    xp.setText(String.valueOf(novoXp));
                }

                if (nivel >= 10) {
                    hab1.setSelected(true);
                } else {
                    hab1.setSelected(false);
                }

                if (nivel >= 20) {
                    hab2.setSelected(true);
                } else {
                    hab2.setSelected(false);
                }

                if (nivel >= 30) {
                    hab3.setSelected(true);
                } else {
                    hab3.setSelected(false);
                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void removerAPE(JCheckBox envenenado, JCheckBox exausto, JCheckBox ferido, JCheckBox infectado, JTextField ape, JTextField vitAtual, boolean reduzHP) {
        int removerAPE = 10;
        boolean flag = false, hpReduzido = false;

        if ((envenenado.isSelected()) || (exausto.isSelected()) || (ferido.isSelected()) || (infectado.isSelected())) {
            removerAPE += 10;
            flag = true;
        }

        String apeAtualS = ape.getText();
        int apeAtualInt = Integer.parseInt(apeAtualS);
        apeAtualS = String.valueOf(apeAtualInt - removerAPE);

        if (apeAtualInt - removerAPE > 0) {
            ape.setText(apeAtualS);
        } else {
            ape.setText("0");
        }

        if ((apeAtualInt <= 30) && (reduzHP)) {
            JOptionPane.showMessageDialog(null, "Sua apetência caiu abaixo de 20!\nPerca de 20% do HP.\n-1 de desvantagem no dado para TODAS as ações.\nSe alimente em 6 horas, ou, morra.");
            hpReduzido = true;
        } else {
            if ((flag) && (apeAtualInt <= 40) && (reduzHP)) {
                JOptionPane.showMessageDialog(null, "Sua apetência caiu abaixo de 20!\nPerca de 20% do HP.\n-1 de desvantagem no dado para TODAS as ações.\nSe alimente em 6 horas, ou, morra.");
                hpReduzido = true;
            }
        }

        //redução do HP
        String hpAtual = vitAtual.getText();
        int hpAtualInt = Integer.parseInt(hpAtual);
        int checkHP1 = hpAtualInt;

        if ((hpReduzido) && (reduzHP)) {
            hpAtualInt -= hpAtualInt * 0.2;
            hpAtual = String.valueOf(hpAtualInt);
        }

        if ((hpReduzido) && (checkHP1 > 1)) {
            vitAtual.setText(hpAtual);
        } else {
            if ((hpReduzido) && (checkHP1 <= 1)) {
                vitAtual.setText("1");
            }
        }
    }

    public static void addVit(JTextField vitAtualmente, JTextField vit, boolean atrib) {
        boolean flag;
        String atributo;

        if (atrib) {
            atributo = "PV";
        } else {
            atributo = "PM";
        }

        do {

            flag = false;
            try {

                String aux = JOptionPane.showInputDialog("Insira a quantidade de " + atributo + " a ser ADICIONADA: ");
                if (aux == null) {
                    return;
                }

                String vitAtualS = vitAtualmente.getText();
                int vitAtualInt = Integer.parseInt(vitAtualS);
                int vitAdicionada = Integer.parseInt(aux);
                String vitTotalS = vit.getText();
                int vitTotalInt = Integer.parseInt(vitTotalS);

                if (vitAdicionada + vitAtualInt <= vitTotalInt) {
                    aux = String.valueOf(vitAdicionada + vitAtualInt);
                    vitAtualmente.setText(aux);
                } else {
                    vitAtualmente.setText(vitTotalS);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }

        } while (flag);
    }

    public static void addKarma(JTextField karma) {
        boolean flag;
        do {
            flag = false;
            try {

                String aux = JOptionPane.showInputDialog(null, "Insira a quantidade de karma a ser ADICIONADA: ");
                int teste;

                if (aux == null) {
                    return;
                }

                int karmaAdicionado = Integer.parseInt(aux);
                String karmaAnterior = karma.getText();
                int karmaAnteriorInt = Integer.parseInt(karmaAnterior);

                if (karmaAnteriorInt < 100) {
                    karma.setText(String.valueOf(karmaAdicionado + karmaAnteriorInt));
                }

                if (karmaAdicionado + karmaAnteriorInt > 100) {
                    karma.setText("100");
                }

                //Desvantagem do karma
                if (karmaAnteriorInt < 20 || karmaAnteriorInt + karmaAdicionado < 20) {
                    karma.setForeground(Color.red);
                } else {
                    karma.setForeground(Color.black);
                }

                //Desvantagem e vantagem do Karma CORES
                if (karmaAnteriorInt <= 19 || karmaAnteriorInt + karmaAdicionado <= 19) {
                    karma.setForeground(Color.red);
                } else if (karmaAnteriorInt >= 80 || karmaAnteriorInt + karmaAdicionado >= 80) {
                    karma.setForeground(Color.blue);
                    JOptionPane.showMessageDialog(null, "KARMA acima de 80! \nBonus de +1 em CARISMA/SORTE");
                } else {
                    karma.setForeground(Color.black);
                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira apenas números! \n" + erro.toString());
                flag = true;
            }
        } while (flag);
    }

    public static void setTotais(JTextField campoTotal, JTextField campoAtributo) {
        int total = Integer.parseInt(campoTotal.getText());
        int atributo = Integer.parseInt(campoAtributo.getText()) * 10;

        campoTotal.setText(String.valueOf(atributo));
    }

    // <editor-fold defaultstate="collapsed" desc="Vant-Desvant-Hab">
    public static void limpaCampo(JTextField campo) {
        campo.setText("");
    }

    public static void limpaCampo(JTextArea campo) {
        campo.setText("");
    }

    public static void getVantagens(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                JOptionPane.showMessageDialog(null, "Guerreiro de campo – Sua FORÇA ganha +2 de bónus.\n\nDor & Ganho - Sua RESISTÊNCIA ganha +2 de bónus. \n\nGunner – Ganhe +2 de vantagem no dado ao atacar usando, fuzil, pistola, submetralhadora ou qualquer arma branca. \n\nFuzil-Slayer – Um fuzil não ocupará espaço no seu inventário. Além disso, todos os fuzis perdem 1 de requerimento de FORÇA para você pode usar. \n\nCalor da batalha- Toda vez que for atacado corpo-a-corpo, você pode optar por se defender atacando com a coronha ou baioneta da arma, ao invés de jogar o dado proporcional a STAMINA, jogue o proporcional à FORÇA. \nATENÇÃO: Caso seja atacado por mais de um inimigo ao mesmo tempo, você só poderá usar essa vantagem em um e não todos.", "VANTAGENS - FUZILEIRO NAVAL", JOptionPane.PLAIN_MESSAGE);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Força bruta – Caso acerte três infectados com um único tiro de escopeta, ganhe outro ataque (NÃO CUMULATIVO). Além disso, ganhe um bónus de +2 de FORÇA. \n\nEscudeiro – Permite você se defender usando seu escudo antimotim, caso, ele esteja equipado em uma de suas mãos. Escolha entre FORÇA ou STAMINA o dado que será usado como defesa. \n\nEscopeta-Slayer – Uma escopeta de sua escolha, não ocupará espaço no slot. Além disso, cai em 1 o requisito para usar qualquer escopeta. \n\nCombatente defensivo – Caso um aliado perto de você vá sofrer um ataque, você tem a escolha de intervir usando seu escudo antimotim. APENAS UM ALIADO QUE ESTEJA PERTO. \n\nControle de pânico – A custa de um turno, você pode acalmar os ânimos de seus aliados, fazendo com que voltem ao combate, ou que realizem um comando seu. \n\nInterrogatório – Ao ter algemado contigo um inimigo, ou suspeito, E estando em um lugar isolado, descubra todas as informações que ele guarda. NÃO FUNCIONA COM BOSS.", "VANTAGENS - FORÇA POLICIAL", JOptionPane.PLAIN_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Biohazard - Imune a infecções, exceto BOSS e ESPECIAIS. \n\nCombatente veloz - SE, todos seus equipamentos forem leve, ganhe +2 de vantagem no dado para, correr, esquivar, atacar (corpo-a-corpo) e QTE. \n\nSub-Slayer - Uma submetralhadora de sua escolha, não ocupará espaço no slot. Além disso, todas as submetralhadoras perdem 1 de requerimento de FORÇA para você pode usar. \n\nPercepção - Ganhe +2 de vantagem no dado em testes de percepção. \n\nConhecimento infectante - Conhece tudo sobre os inimigos infectados de nível 1 e 2, inclusive suas fraquezas. \n\nSilêncio - Ganhe +1 de vantagem no dado ao realizar um ataque corpo-a-corpo em stealth.", "VANTAGENS - B.H.C", JOptionPane.PLAIN_MESSAGE);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Mente brilhante – Ganhe +2 de INTELIGÊNCIA. \n\nConhecimento tecnológico – Permite um hacker invadir portas de segurança eletrônica, assim como cofres eletrônicos usando seu terminal eletrônico. \n\nExploit – Você pode criar exploits utilizando componentes eletrônicos e usa-los em sistemas cujo já tenha acesso. Usar um exploit em combate conta como uma rodada, embora, você possa mesmo após usar o exploit, realizar mais uma ação que não seja de ataque. \n\nO técnico – Como hacker, quando você e/ou seu grupo estiverem preso em algum enigma ou problema jogue um D6, caso caia par, o mestre terá que te dizer a solução do enigma ou problema, caso caia ímpar, nada! \nEssa vantagem só pode ser utilizada uma vez por enigma/problema E uma vez a cada 6 horas. \n\nEngenharia social – Ganhe +2 de vantagem no dado em qualquer teste de carisma. ", "VANTAGENS - HACKER", JOptionPane.PLAIN_MESSAGE);
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Mente brilhante – Ganhe +2 de INTELIGÊNCIA. \n\nAtenção – Ganhe +2 de PERCEPÇÃO. \n\nConhecimento químico – Você pode criar explosivos químicos como granada improvisada, C4 e até granada venenosa utilizando componentes químicos além de munição para a sua lançadora química. \n\nAnticorpos químico – Menos chances de ser infectado, menos dano de armas químicas, veneno e outros danos tóxicos. \n\nVenenoso – Te permite buffar com veneno comum (para humanos), ou neutralizador (para os infectados), qualquer arma branca do tipo BRUTA ou CORTE.", "VANTAGENS - QUÍMICO", JOptionPane.PLAIN_MESSAGE);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Mente brilhante – Ganhe +2 de INTELIGÊNCIA. \n\nAtenção – Ganhe +2 de PERCEPÇÃO. \n\nConhecimento hospitalar – Você pode criar itens médicos utilizando componentes químicos-hospitalar e usa-los em pessoas necessitadas, inclusive em si mesmo. \nCaso esteja em combate, você poderá utilizar um item, sem custar sua rodada, porém sua próxima ação independente de qual seja irá encerrar sua rodada. \n\nO técnico – Você recarregara suas vacinas de cura M de volta para 3 e adicionalmente, recarrega sua vacina anti-infecção de volta para 1, após descansar sem gastar componentes ou qualquer outra coisa. \n\nMãos habilidosas – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo INCLUSIVE BOSS quando usando uma arma branca do tipo CORTE.", "VANTAGENS - MÉDICO", JOptionPane.PLAIN_MESSAGE);
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "Engenheiro Adaptável – Permite construir armas brancas e aprimorar tanto as armas brancas, quanto as de fogo utilizando componentes de construção. \n\nConhecimento civil – Permite um engenheiro arrombar uma porta ou cadeado simples usando seu kit de ferramentas. \n\nMestre de obras – Você pode criar barricadas de madeiras em quaisquer janelas ou portas gastando componentes de construção, caso esteja em batalha, custará uma rodada. \n\nCombatente civil – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo INCLUSIVE BOSS quando usando uma arma branca do tipo bruta. \n\nSr. Sorriso – Ganhe +2 de carisma.", "VANTAGENS - ENGENHEIRO", JOptionPane.PLAIN_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ UMA CLASSE SELECIONADA");
        }

    }

    public static void getVantagens(int classes, int sexo) {

        switch (classes) {

            case 1:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FN_F.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FN.png"));
                }
                JOptionPane.showMessageDialog(null, "Guerreiro de campo – Sua FORÇA ganha +2 de bónus.\n\nDor & Ganho - Sua RESISTÊNCIA ganha +2 de bónus. \n\nGunner – Ganhe +2 de vantagem no dado ao atacar usando, fuzil, pistola, submetralhadora ou qualquer arma branca. \n\nFuzil-Slayer – Um fuzil não ocupará espaço no seu inventário. Além disso, todos os fuzis perdem 1 de requerimento de FORÇA para você pode usar. \n\nCalor da batalha- Toda vez que for atacado corpo-a-corpo, você pode optar por se defender atacando com a coronha ou baioneta da arma, ao invés de jogar o dado proporcional a STAMINA, jogue o proporcional à FORÇA. \nATENÇÃO: Caso seja atacado por mais de um inimigo ao mesmo tempo, você só poderá usar essa vantagem em um e não todos.", "VANTAGENS - FUZILEIRO NAVAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FP_F.jpg"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FP.png"));
                }
                JOptionPane.showMessageDialog(null, "Força bruta – Caso acerte três infectados com um único tiro de escopeta, ganhe outro ataque (NÃO CUMULATIVO). Além disso, ganhe um bónus de +2 de FORÇA. \n\nEscudeiro – Permite você se defender usando seu escudo antimotim, caso, ele esteja equipado em uma de suas mãos. Escolha entre FORÇA ou STAMINA o dado que será usado como defesa. \n\nEscopeta-Slayer – Uma escopeta de sua escolha, não ocupará espaço no slot. Além disso, cai em 1 o requisito para usar qualquer escopeta. \n\nCombatente defensivo – Caso um aliado perto de você vá sofrer um ataque, você tem a escolha de intervir usando seu escudo antimotim. APENAS UM ALIADO QUE ESTEJA PERTO. \n\nControle de pânico – A custa de um turno, você pode acalmar os ânimos de seus aliados, fazendo com que voltem ao combate, ou que realizem um comando seu. \n\nInterrogatório – Ao ter algemado contigo um inimigo, ou suspeito, E estando em um lugar isolado, descubra todas as informações que ele guarda. NÃO FUNCIONA COM BOSS.", "VANTAGENS - FORÇA POLICIAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-BHC.jpg"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-BHC.jpg"));
                }
                JOptionPane.showMessageDialog(null, "Biohazard - Imune a infecções, exceto BOSS e ESPECIAIS. \n\nCombatente veloz - SE, todos seus equipamentos forem leve, ganhe +2 de vantagem no dado para, correr, esquivar, atacar (corpo-a-corpo) e QTE. \n\nSub-Slayer - Uma submetralhadora de sua escolha, não ocupará espaço no slot. Além disso, todas as submetralhadoras perdem 1 de requerimento de FORÇA para você pode usar. \n\nPercepção - Ganhe +2 de vantagem no dado em testes de percepção. \n\nConhecimento infectante - Conhece tudo sobre os inimigos infectados de nível 1 e 2, inclusive suas fraquezas. \n\nSilêncio - Ganhe +1 de vantagem no dado ao realizar um ataque corpo-a-corpo em stealth.", "VANTAGENS - B.H.C", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Hacker_F.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Hacker.png"));
                }
                JOptionPane.showMessageDialog(null, "Mente brilhante – Ganhe +2 de INTELIGÊNCIA. \n\nConhecimento tecnológico – Permite um hacker invadir portas de segurança eletrônica, assim como cofres eletrônicos usando seu terminal eletrônico. \n\nExploit – Você pode criar exploits utilizando componentes eletrônicos e usa-los em sistemas cujo já tenha acesso. Usar um exploit em combate conta como uma rodada, embora, você possa mesmo após usar o exploit, realizar mais uma ação que não seja de ataque. \n\nO técnico – Como hacker, quando você e/ou seu grupo estiverem preso em algum enigma ou problema jogue um D6, caso caia par, o mestre terá que te dizer a solução do enigma ou problema, caso caia ímpar, nada! \nEssa vantagem só pode ser utilizada uma vez por enigma/problema E uma vez a cada 6 horas. \n\nEngenharia social – Ganhe +2 de vantagem no dado em qualquer teste de carisma. ", "VANTAGENS - HACKER", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Quimico.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Quimico.png"));
                }
                JOptionPane.showMessageDialog(null, "Mente brilhante – Ganhe +2 de INTELIGÊNCIA. \n\nAtenção – Ganhe +2 de PERCEPÇÃO. \n\nConhecimento químico – Você pode criar explosivos químicos como granada improvisada, C4 e até granada venenosa utilizando componentes químicos além de munição para a sua lançadora química. \n\nAnticorpos químico – Menos chances de ser infectado, menos dano de armas químicas, veneno e outros danos tóxicos. \n\nVenenoso – Te permite buffar com veneno comum (para humanos), ou neutralizador (para os infectados), qualquer arma branca do tipo BRUTA ou CORTE.", "VANTAGENS - QUÍMICO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Medico_F.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Medico.png"));
                }
                JOptionPane.showMessageDialog(null, "Mente brilhante – Ganhe +2 de INTELIGÊNCIA. \n\nAtenção – Ganhe +2 de PERCEPÇÃO. \n\nConhecimento hospitalar – Você pode criar itens médicos utilizando componentes químicos-hospitalar e usa-los em pessoas necessitadas, inclusive em si mesmo. \nCaso esteja em combate, você poderá utilizar um item, sem custar sua rodada, porém sua próxima ação independente de qual seja irá encerrar sua rodada. \n\nO técnico – Você recarregara suas vacinas de cura M de volta para 3 e adicionalmente, recarrega sua vacina anti-infecção de volta para 1, após descansar sem gastar componentes ou qualquer outra coisa. \n\nMãos habilidosas – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo INCLUSIVE BOSS quando usando uma arma branca do tipo CORTE.", "VANTAGENS - MÉDICO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Engenheiro_F.jpg"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Engenheiro.png"));
                }
                JOptionPane.showMessageDialog(null, "Engenheiro Adaptável – Permite construir armas brancas e aprimorar tanto as armas brancas, quanto as de fogo utilizando componentes de construção. \n\nConhecimento civil – Permite um engenheiro arrombar uma porta ou cadeado simples usando seu kit de ferramentas. \n\nMestre de obras – Você pode criar barricadas de madeiras em quaisquer janelas ou portas gastando componentes de construção, caso esteja em batalha, custará uma rodada. \n\nCombatente civil – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo INCLUSIVE BOSS quando usando uma arma branca do tipo bruta. \n\nSr. Sorriso – Ganhe +2 de carisma.", "VANTAGENS - ENGENHEIRO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ UMA CLASSE SELECIONADA");
        }

    }

    public static void getDesvantagens(int classes, int sexo) {

        switch (classes) {

            case 1:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FN_F.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FN.png"));
                }
                JOptionPane.showMessageDialog(null, "Barulhento – Em testes de stealth, -2 no dado. \n\nServir e proteger – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, \nou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não. \n\nAntiterrorista – Você ataca sem hesitar qualquer terrorista que vê. \nATENÇÃO: O ataque não é em frenesi, você pode formular estratégias e atacar com sabedoria.", "DESVANTAGENS - FUZILEIRO NAVAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FP_F.jpg"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-FP.png"));
                }
                JOptionPane.showMessageDialog(null, "Proteger e servir – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, \nou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não. \n\nO bom exemplo – Como policial, você não pode roubar itens de pessoas boas, assim como não pode atacar um aliado ou civil que não tenha feito nada de errado, \nMAS, caso o item em questão seja de missão, ou, o aliado esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha fazer, ou não tal atitude. \n\nLei & Ordem – Você ataca sem hesitar, mas com estratégia, criminosos e bandidos. Além disso, sempre intervém e situações problemáticas e de caos.", "DESVANTAGENS - FORÇA POLICIAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-BHC.jpg"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-BHC.jpg"));
                }
                JOptionPane.showMessageDialog(null, "Olhar vazio - Em testes de carismas, -3 no dado. \n\nSubpeso - Além de não pode usar equipamento pesado, você pode apenas carregar duas armas em seu slot (a arma no slot especial da vantagem SUB-SLAYER não conta).", "DESVANTAGENS - B.H.C", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Hacker_F.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Hacker.png"));
                }
                JOptionPane.showMessageDialog(null, "Cracker – Ao realizar uma atitude ruim, perca +10 de KARMA adicional e lembre-se! Se o seu KARMA cair abaixo de 20 haverá terríveis consequências. \n\nOrgulho – Impossível de resistir a uma provocação, e sempre que provocado você irá inevitavelmente atacar.\n\nDespreparo armado – Como hacker, você nunca poderá utilizar uma arma de fogo, ou branca do tipo ESPECIAL, porém, consegue utilizar qualquer outra sem penalizações.", "DESVANTAGENS - HACKER", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Quimico.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Quimico.png"));
                }
                JOptionPane.showMessageDialog(null, "Medroso – As chances de seu personagem entrar em pânico são maiores, além disso, -2 em qualquer teste de coragem. \n\nDespreparado – Um químico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. \nATENÇÃO, um químico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. \nPor exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.", "DESVANTAGENS - QUÍMICO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Medico_F.png"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Medico.png"));
                }
                JOptionPane.showMessageDialog(null, "Juramento pela vida – Ao enfrentar inimigos humanos, você não conseguirá zerar a vitalidade deles, caso seu ataque gere um dano superior à vitalidade restante do inimigo, o HP dele ficará em 1, mas seu próximo ataque nesse inimigo pode mata-lo. \n\nDespreparado – Um médico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. \nATENÇÃO, um médico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. \nPor exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.", "DESVANTAGENS - MÉDICO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                if (sexo == 2) {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Engenheiro_F.jpg"));
                } else {
                    icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/C-Engenheiro.png"));
                }
                JOptionPane.showMessageDialog(null, "Medroso – As chances de seu personagem entrar em pânico são maiores, além disso, -2 em qualquer teste de coragem. \n\nDespreparado – Um engenheiro NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. \nATENÇÃO, um engenheiro nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. \nPor exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.", "DESVANTAGENS - ENGENHEIRO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ UMA CLASSE SELECIONADA");
        }
    }

    public static void getDesvantagens(JComboBox classes) {
        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                JOptionPane.showMessageDialog(null, "Barulhento – Em testes de stealth, -2 no dado. \n\nServir e proteger – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, \nou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não. \n\nAntiterrorista – Você ataca sem hesitar qualquer terrorista que vê. \nATENÇÃO: O ataque não é em frenesi, você pode formular estratégias e atacar com sabedoria.", "DESVANTAGENS - FUZILEIRO NAVAL", JOptionPane.PLAIN_MESSAGE);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Proteger e servir – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, \nou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não. \n\nO bom exemplo – Como policial, você não pode roubar itens de pessoas boas, assim como não pode atacar um aliado ou civil que não tenha feito nada de errado, \nMAS, caso o item em questão seja de missão, ou, o aliado esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha fazer, ou não tal atitude. \n\nLei & Ordem – Você ataca sem hesitar, mas com estratégia, criminosos e bandidos. Além disso, sempre intervém e situações problemáticas e de caos.", "DESVANTAGENS - FORÇA POLICIAL", JOptionPane.PLAIN_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Olhar vazio - Em testes de carismas, -3 no dado. \n\nSubpeso - Além de não pode usar equipamento pesado, você pode apenas carregar duas armas em seu slot (a arma no slot especial da vantagem SUB-SLAYER não conta).", "DESVANTAGENS - B.H.C", JOptionPane.PLAIN_MESSAGE);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Cracker – Ao realizar uma atitude ruim, perca +10 de KARMA adicional e lembre-se! Se o seu KARMA cair abaixo de 20 haverá terríveis consequências. \n\nOrgulho – Impossível de resistir a uma provocação, e sempre que provocado você irá inevitavelmente atacar.\n\nDespreparo armado – Como hacker, você nunca poderá utilizar uma arma de fogo, ou branca do tipo ESPECIAL, porém, consegue utilizar qualquer outra sem penalizações.", "DESVANTAGENS - HACKER", JOptionPane.PLAIN_MESSAGE);
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Medroso – As chances de seu personagem entrar em pânico são maiores, além disso, -2 em qualquer teste de coragem. \n\nDespreparado – Um químico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. \nATENÇÃO, um químico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. \nPor exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.", "DESVANTAGENS - QUÍMICO", JOptionPane.PLAIN_MESSAGE);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Juramento pela vida – Ao enfrentar inimigos humanos, você não conseguirá zerar a vitalidade deles, caso seu ataque gere um dano superior à vitalidade restante do inimigo, o HP dele ficará em 1, mas seu próximo ataque nesse inimigo pode mata-lo. \n\nDespreparado – Um médico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. \nATENÇÃO, um médico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. \nPor exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.", "DESVANTAGENS - MÉDICO", JOptionPane.PLAIN_MESSAGE);
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "Medroso – As chances de seu personagem entrar em pânico são maiores, além disso, -2 em qualquer teste de coragem. \n\nDespreparado – Um engenheiro NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. \nATENÇÃO, um engenheiro nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. \nPor exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.", "DESVANTAGENS - ENGENHEIRO", JOptionPane.PLAIN_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ UMA CLASSE SELECIONADA");
        }
    }

    public static void getHabilidades(JComboBox classes) {
        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                JOptionPane.showMessageDialog(null, "Habilidade 1 - Ao alcançar o level 10, você não entrará mais em pânico, ou precisará fazer teste de coragem. \n\nHabilidade 2 – Mesmo exausto ou com a apetência zerada, você ainda conseguirá viver mais um dia sem receber qualquer desvantagem por isso. \n\nHabilidade 3- Após as terríveis experiências de combate, ver todos seus amigos morrerem e ver as cicatrizes em seu corpo, você já não é mais um simples guerreiro. Se algum de seus aliados cair gravemente ferido, ou se o sua vitalidade cair abaixo de 0, entre no modo BERSERK. \nModo BERSERK: Ao entrar no modo BERSERK sua vitalidade volta ao máximo, você passa a ignorar a dor e pode se movimentar mais rapidamente, mesmo com equipamentos pesados. Todo dano que receber é reduzido na metade, e seu dano corpo-a-corpo aumenta em +10.\nO modo BERSERK é cancelado caso sua vitalidade caia abaixo de 30 ou, após um período de 10 minutos. No modo BERSERK você ainda mantem sua consciência, porém, não consegue mais mirar tão bem, perdendo um ponto de vantagem no dado ao atacar com arma de fogo. \nApós o fim do modo BERSERK, sua vitalidade cai para 20, você fica em exaustão e apenas um médico poderá te curar.", "HABILIDADES - FUZILEIRO NAVAL", JOptionPane.PLAIN_MESSAGE);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Habilidade 1 - Ao alcançar o level 10, você receberá a habilidade GRITO DE ORDEM, que lhe permite intimidar inimigos humanos e amenizar badernas. \n\nHabilidade 2 - Ao se defender ou atacar usando o escudo, você irá automaticamente atordoar um inimigo, que receberá uma penalidade de -2 no dado na próxima jogada. Você também ganhara direito a realizar um ataque em seguida. \n\nHabilidade 3 - Você conhece todas as ruas, gangues, perigos, inimigos que o espreitam. Lida com coisas que estão além de qualquer outro policial conseguiria lidar, mas acima de tudo, você protege seus aliados do perigo eminente. \nAo defender com sucesso um aliado, você e o aliado recuperará +15 de VITALIDADE, além disso, a próxima rodada passa a ser a do seu aliado, caso a rodada já fosse ser dele, passa a ser sua.", "HABILIDADES - FORÇA POLICIAL", JOptionPane.PLAIN_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Habilidade 1 - Ao alcançar o level 10, você poderá usar uma submetralhadora em cada mão. Se optar por assim fazer, selecione dois alvos para atirar ao mesmo tempo, ou, um único alvo para tomar os dois tiros. \n\nHabilidade 2 - Ao usar equipamentos leves e armas silenciosas, ganhe +1 de vantagem em qualquer ataque, stealth ou não, corpo-a-corpo ou não. \n\nHabilidade 3 - Após intenso treino e experiência de combate, você já não é mais um simples soldado da B.H.C, é um veterano no campo te batalha contra os riscos biológicos. \nMantenha TODOS os seus bônus mesmo usando equipamento médio.", "HABILIDADES - B.H.C", JOptionPane.PLAIN_MESSAGE);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Habilidade 1 - Ao alcançar o level 10 componentes eletrônicos utilizados para criar um exploit reduz em 2. \n\nHabilidade 2 - Você agora poderá hackear novos sistemas, inclusive as de segurança como torretas eletrônicas, não só neutralizando-as, mas, utilizando em favor próprio. \n\nHabilidade 3 - Como hacker, você não só sabe lidar com os problemas, você os soluciona, e após esse tempo lidando com infectados e outras forças hostis você encontrou a solução definitiva. \nSeu exploit SCANER foi aprimorado e você consegue descobrir a posição de qualquer inimigo, mesmo os invisíveis e por tempo indeterminado. \nAlém disso, inimigos expostos, atacados ou que receberam qualquer desvantagem por causa de um exploit seu, recebe também -2 de desvantagem no dado para qualquer ação, EXCLUI alguns infectados de nível 3 e o de nível 4.", "HABILIDADES - HACKER", JOptionPane.PLAIN_MESSAGE);
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Habilidade 1 - Ao alcançar o level 10 componentes químicos utilizados para criar itens explosivos ou venenosos é reduzido em 2. \n\nHabilidade 2 - Agora seus aliados não tomam mais dano de suas armas químicas. \n\nHabilidade 3 - Agora você já não é só mais um químico qualquer, e sim, um combatente químico que aprendeu a melhor foram possível de suportar seus aliados e enfrentar seus inimigos. \nSuas bombas químicas, e seu buff (VENENOSO) agora não precisa mais alternar entre veneno comum ou neutralizante, você desenvolveu um novo componente químico que suporta os dois juntos.", "HABILIDADES - QUÍMICO", JOptionPane.PLAIN_MESSAGE);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Habilidade 1 - Ao alcançar o level 10 componentes químicos-hospitalar utilizados para criar itens de cura reduz em 2. \n\nHabilidade 2 - Ao reviver um aliado, você recupera totalmente a vitalidade dele, mas, isso só pode ocorrer uma vez por combate. \n\nHabilidade 3 - Após esse período lidando com os infectados e forças hostis, como médico, você está mais do que apto ao campo de batalha, para auxiliar os feridos e seus aliados. \nAo estar em combate com seus aliados, a RESISTÊNCIA deles e sua recebem um buff de +10, ao fim de suas respectivas rodadas, eles curam +1 de VITALIDADE e além disso, \nsuas vacina de cura M passaram a ser G, e subiu para 2 o número de vacinas anti-infcção que você pode carregar.", "HABILIDADES - MÉDICO", JOptionPane.PLAIN_MESSAGE);
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "Habilidade 1 - Ao alcançar o level 10, você poderá criar acessórios para armas de fogo. \n\nHabilidade 2 - Você agora pode arrombar quase todos os tipos de portas e cadeados, excluindo as de missão principal em alguns casos. \n\nHabilidade 3 - Após lidar com as forças hostis que te cercam usando como armas aquilo que um dia foram suas ferramentas, você aprendeu a tirar melhor proveito das mesmas. \nCai para 2 a diferença para realizar um ataque crítico em um inimigo, inclusive BOSS enquanto usa uma arma branca do tipo bruta ou especial.", "HABILIDADES - ENGENHEIRO", JOptionPane.PLAIN_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ UMA CLASSE SELECIONADA");
        }
    }

    public static void getSobreClasse(int opcao, JEditorPane hab, JEditorPane vant, JEditorPane desvant, JLabel classe) {
        switch (opcao) {
            case 0://Selecione a classe
                limparSobreClasse(hab, vant, desvant);
                classe.setText("-");
                break;

            // <editor-fold defaultstate="collapsed" desc="Fuzileiro">
            case 1://Fuzileiro Naval
                classe.setText("Fuzileiro Naval");
                hab.setText("<b>Habilidade 1</b> - Ao alcançar o level 10, você não entrará mais em pânico, ou precisará fazer teste de coragem. <br><br>"
                        + "<b>Habilidade 2</b> – Mesmo exausto ou com a apetência zerada, você ainda conseguirá viver mais um dia sem receber qualquer desvantagem por isso. <br><br>"
                        + "<b>Habilidade 3</b> - Após as terríveis experiências de combate, ver todos seus amigos morrerem e ver as cicatrizes em seu corpo, você já não é mais um simples guerreiro. Se algum de seus aliados cair gravemente ferido, ou se o sua vitalidade cair abaixo de 0, entre no modo BERSERK. <br>"
                        + "<b>Modo BERSERK:</b> Ao entrar no modo BERSERK sua vitalidade volta ao máximo, você passa a ignorar a dor e pode se movimentar mais rapidamente, mesmo com equipamentos pesados. Todo dano que receber é reduzido na metade, e seu dano corpo-a-corpo aumenta em +10. O modo BERSERK é cancelado caso sua vitalidade caia abaixo de 30 ou, após um período de 10 minutos. No modo BERSERK você ainda mantem sua consciência, porém, não consegue mais mirar tão bem, perdendo um ponto de vantagem no dado ao atacar com arma de fogo. Após o fim do modo BERSERK, sua vitalidade cai para 20, você fica em exaustão e apenas um médico poderá te curar.");

                vant.setText("<b>Guerreiro de campo</b> – Sua FORÇA ganha +2 de bónus.<br><br>"
                        + "<b>Dor & Ganho</b> - Sua RESISTÊNCIA ganha +2 de bónus.<br><br>"
                        + "<b>Gunner</b> – Ganhe +2 de vantagem no dado ao atacar usando, fuzil, pistola, submetralhadora ou qualquer arma branca.<br><br>"
                        + "<b>Fuzil-Slayer</b> – Um fuzil não ocupará espaço no seu inventário. Além disso, todos os fuzis perdem 1 de requerimento de FORÇA para você pode usar.<br><br>"
                        + "<b>Calor da batalha</b> - Toda vez que for atacado corpo-a-corpo, você pode optar por se defender atacando com a coronha ou baioneta da arma, ao invés de jogar o dado proporcional a STAMINA, jogue o proporcional à FORÇA. <br> <u>ATENÇÃO:</u> Caso seja atacado por mais de um inimigo ao mesmo tempo, você só poderá usar essa vantagem em um e não todos.");

                desvant.setText("<b>Barulhento</b> – Em testes de stealth, -2 no dado.<br><br>"
                        + "<b>Servir e proteger</b> – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, ou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não.<br><br>"
                        + "<b>Antiterrorista</b> – Você ataca sem hesitar qualquer terrorista que vê. <br>"
                        + "<u>ATENÇÃO:</u> O ataque não é em frenesi, você pode formular estratégias e atacar com sabedoria.");

                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Policial">
            case 2://Força Policial
                classe.setText("Força Policial");
                hab.setText("<b>Habilidade 1</b> - Ao alcançar o level 10, você receberá a habilidade GRITO DE ORDEM, que lhe permite intimidar inimigos humanos e amenizar badernas. <br><br>"
                        + "<b>Habilidade 2</b> - Ao se defender ou atacar usando o escudo, você irá automaticamente atordoar um inimigo, que receberá uma penalidade de -2 no dado na próxima jogada. Você também ganhara direito a realizar um ataque em seguida. <br><br>"
                        + "<b>Habilidade 3</b> - Você conhece todas as ruas, gangues, perigos, inimigos que o espreitam. Lida com coisas que estão além de qualquer outro policial conseguiria lidar, mas acima de tudo, você protege seus aliados do perigo eminente. <br>Ao defender com sucesso um aliado, você e o aliado recuperará +15 de VITALIDADE, além disso, a próxima rodada passa a ser a do seu aliado, caso a rodada já fosse ser dele, passa a ser sua.");

                vant.setText("<b>Força bruta</b> – Caso acerte três infectados com um único tiro de escopeta, ganhe outro ataque <b>(NÃO CUMULATIVO)</b>. Além disso, ganhe um bónus de +2 de FORÇA.<br><br>"
                        + "<b>Escudeiro </b> – Permite você se defender usando seu escudo antimotim, caso, ele esteja equipado em uma de suas mãos. Escolha entre FORÇA ou STAMINA o dado que será usado como defesa.<br><br>"
                        + "<b>Escopeta-Slayer</b> – Uma escopeta de sua escolha, não ocupará espaço no slot. Além disso, cai em 1 o requisito para usar qualquer escopeta.<br><br>"
                        + "<b>Combatente defensivo</b> – Caso um aliado perto de você vá sofrer um ataque, você tem a escolha de intervir usando seu escudo antimotim. <b>APENAS UM ALIADO QUE ESTEJA PERTO</b>.<br><br>"
                        + "<b>Controle de pânico</b> – A custa de um turno, você pode acalmar os ânimos de seus aliados, fazendo com que voltem ao combate, ou que realizem um comando seu. <br><br>"
                        + "<b>Interrogatório</b> – Ao ter algemado contigo um inimigo, ou suspeito, E estando em um lugar isolado, descubra todas as informações que ele guarda. <b>NÃO FUNCIONA COM BOSS</b>.");

                desvant.setText("<b>Proteger e servir</b> – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, ou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não.<br><br>"
                        + "<b>O bom exemplo</b> – Como policial, você não pode roubar itens de pessoas boas, assim como não pode atacar um aliado ou civil que não tenha feito nada de errado, <b>MAS</b>, caso o item em questão seja de missão, ou, o aliado esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha fazer, ou não tal atitude. <br><br>"
                        + "<b>Lei & Ordem</b> – Você ataca sem hesitar, mas com estratégia, criminosos e bandidos. Além disso, sempre intervém e situações problemáticas e de caos.");

                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="BHC">
            case 3://B.H.C
                classe.setText("B.H.C");
                hab.setText("<b>Habilidade 1</b> - Ao alcançar o level 10, você poderá usar uma submetralhadora em cada mão. Se optar por assim fazer, selecione dois alvos para atirar ao mesmo tempo, ou, um único alvo para tomar os dois tiros.<br><br>"
                        + "<b>Habilidade 2</b> - Ao usar equipamentos leves e armas silenciosas, ganhe +1 de vantagem em qualquer ataque, stealth ou não, corpo-a-corpo ou não.<br><br>"
                        + "<b>Habilidade 3</b> - Após intenso treino e experiência de combate, você já não é mais um simples soldado da B.H.C, é um veterano no campo te batalha contra os riscos biológicos. <br>"
                        + "<b>Mantenha TODOS os seus bônus mesmo usando equipamento médio</b>.");

                vant.setText("<b>Biohazard </b>- Imune a infecções, exceto BOSS e ESPECIAIS. <br><br>"
                        + "<b>Combatente veloz - SE</b>, todos seus equipamentos forem leve, ganhe +2 de vantagem no dado para, correr, esquivar, atacar (corpo-a-corpo) e QTE. <br><br>"
                        + "<b>Sub-Slayer</b> - Uma submetralhadora de sua escolha, não ocupará espaço no slot. <br>Além disso, todas as submetralhadoras perdem 1 de requerimento de FORÇA para você pode usar. <br><br>"
                        + "<b>Percepção </b>- Ganhe +2 de vantagem no dado em testes de percepção. <br><br>"
                        + "<b>Conhecimento infectante</b> - Conhece tudo sobre os inimigos infectados de nível 1 e 2, inclusive suas fraquezas. <br><br>"
                        + "<b>Silêncio </b>- Ganhe +1 de vantagem no dado ao realizar um ataque corpo-a-corpo em stealth.");

                desvant.setText("<b>Olhar vazio</b> - Em testes de carismas, -3 no dado. <br><br>"
                        + "<b>Subpeso </b>- Além de não pode usar equipamento pesado, você pode apenas carregar duas armas em seu slot <b>(a arma no slot especial da vantagem SUB-SLAYER não conta)</b>.");
                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Hacker">
            case 4://Hacker
                classe.setText("Hacker");
                hab.setText("<b>Habilidade 1</b> - Ao alcançar o level 10 componentes eletrônicos utilizados para criar um exploit reduz em 2.<br><br>"
                        + "<b>Habilidade 2</b> - Você agora poderá hackear novos sistemas, usando seus Exploits avançados</b>.<br><br>"
                        + "<b>Habilidade 3</b> - Como hacker, você não só sabe lidar com os problemas, você os soluciona, e após esse tempo lidando com infectados e outras forças hostis você encontrou a solução definitiva. <br>"
                        + "Seu exploit SCANER foi aprimorado e você consegue descobrir a posição de qualquer inimigo, mesmo os invisíveis e por tempo indeterminado.<br>"
                        + "Além disso, inimigos expostos, atacados ou que receberam qualquer desvantagem por causa de um exploit seu, recebe também -2 de desvantagem no dado para qualquer ação, <b>EXCLUI </b>alguns infectados de nível 3 e o de nível 4.");

                vant.setText("<b>Mente brilhante</b> – Ganhe +2 de INTELIGÊNCIA.<br><br>"
                        + "<b>Conhecimento tecnológico</b> – Permite um hacker invadir portas de segurança eletrônica, assim como cofres eletrônicos usando seu terminal eletrônico.<br><br>"
                        + "<b>Exploit</b> – Você pode criar exploits utilizando componentes eletrônicos e usa-los em sistemas cujo já tenha acesso. Usar um exploit em combate conta como uma rodada, embora, você possa mesmo após usar o exploit, realizar mais uma ação que não seja de ataque.<br><br>"
                        + "<b>O técnico</b> – Como hacker, quando você e/ou seu grupo estiverem preso em algum enigma ou problema jogue um D6, caso caia par, o mestre terá que te dizer a solução do enigma ou problema, caso caia ímpar, nada!<br>"
                        + "<u>Essa vantagem só pode ser utilizada uma vez por enigma/problema E uma vez a cada 6 horas.</u><br><br>"
                        + "<b>Engenharia social</b> – Ganhe +2 de vantagem no dado em qualquer teste de carisma.");

                desvant.setText("<b>Cracker</b> – Ao realizar uma atitude ruim, perca +10 de KARMA adicional e lembre-se! Se o seu KARMA cair abaixo de 20 haverá terríveis consequências. <br><br>"
                        + "<b>Orgulho</b> – Impossível de resistir a uma provocação, e sempre que provocado você irá inevitavelmente atacar.<br><br>"
                        + "<b>Despreparo armado</b> – Como hacker, você nunca poderá utilizar uma arma de fogo, ou branca do tipo <b>ESPECIAL</b>, porém, consegue utilizar qualquer outra sem penalizações.");
                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Quimico">
            case 5://Químico
                classe.setText("Químico");
                hab.setText("<b>Habilidade 1</b> - Ao alcançar o level 10 componentes químicos utilizados para criar itens explosivos ou venenosos é reduzido em 2. <br><br>"
                        + "<b>Habilidade 2</b> - Agora seus aliados não tomam mais dano de suas armas químicas.<br><br>"
                        + "<b>Habilidade 3</b> - Agora você já não é só mais um químico qualquer, e sim, um combatente químico que aprendeu a melhor foram possível de suportar seus aliados e enfrentar seus inimigos.<br>"
                        + "Suas bombas químicas, e seu buff (VENENOSO) agora não precisa mais alternar entre veneno comum ou neutralizante, você desenvolveu um novo componente químico que suporta os dois juntos.");

                vant.setText("<b>Mente brilhante</b> – Ganhe +2 de INTELIGÊNCIA.<br>"
                        + "Atenção – Ganhe +2 de PERCEPÇÃO. <br><br>"
                        + "<b>Conhecimento químico</b> – Você pode criar explosivos químicos como granada improvisada, C4 e até granada venenosa utilizando componentes químicos além de munição para a sua lançadora química. <br><br>"
                        + "<b>Anticorpos químico</b> – Menos chances de ser infectado, menos dano de armas químicas, veneno e outros danos tóxicos. <br><br>"
                        + "<b>Venenoso</b> – Te permite buffar com veneno comum (para humanos), ou neutralizador (para os infectados), qualquer arma branca do tipo BRUTA ou CORTE.<br>"
                        + "<b>ATENÇÃO:</b> O buff custa 1 componente químico e dura 2 rodadas.");

                desvant.setText("<b>Medroso</b> – As chances de seu personagem entrar em pânico são maiores, além disso, -2 em qualquer teste de coragem. <br><br>"
                        + "<b>Despreparado</b> – Um químico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. <br>"
                        + "<b>ATENÇÃO</b>, um químico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma.<br>"
                        + "Por exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.");

                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Médico">
            case 6://Médico
                classe.setText("Médico");
                hab.setText("<b>Habilidade 1</b> - Ao alcançar o level 10 componentes químicos-hospitalar utilizados para criar itens de cura reduz em 2. <br><br>"
                        + "<b>Habilidade 2</b> - Ao reviver um aliado, você recupera totalmente a vitalidade dele, mas, isso só pode ocorrer uma vez por combate.<br><br>"
                        + "<b>Habilidade 3</b> - Após esse período lidando com os infectados e forças hostis, como médico, você está mais do que apto ao campo de batalha, para auxiliar os feridos e seus aliados.<br>"
                        + "Ao estar em combate com seus aliados, a RESISTÊNCIA deles e sua recebem um buff de +10, ao fim de suas respectivas rodadas, eles curam +1 de VITALIDADE e além disso, suas vacina de cura M passaram a ser G, e subiu para 2 o número de vacinas anti-infcção que você pode carregar.");

                vant.setText("<b>Mente brilhante</b> – Ganhe +2 de INTELIGÊNCIA.<br><br>"
                        + "<b>Atenção</b> – Ganhe +2 de PERCEPÇÃO.<br><br>"
                        + "<b>Conhecimento hospitalar</b> – Você pode criar itens médicos utilizando componentes químicos-hospitalar e usa-los em pessoas necessitadas, inclusive em si mesmo. "
                        + "Caso esteja em combate, você poderá utilizar um item, sem custar sua rodada, porém sua próxima ação independente de qual seja irá encerrar sua rodada. <br><br>"
                        + "<b>O técnico</b> – Você recarregara suas vacinas de cura M de volta para 3 e adicionalmente, recarrega sua vacina anti-infecção de volta para 1, após descansar sem gastar componentes ou qualquer outra coisa. <br><br>"
                        + "<b>Mãos habilidosas</b> – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo, <b>INCLUSIVE</b> BOSS quando usando uma arma branca do tipo <b>CORTE</b>.");

                desvant.setText("<b>Juramento pela vida</b> – Ao enfrentar inimigos humanos, você não conseguirá zerar a vitalidade deles, caso seu ataque gere um dano superior à vitalidade restante do inimigo, o HP dele ficará em 1, mas seu próximo ataque nesse inimigo pode mata-lo.<br><br>"
                        + "<b>Despreparado</b> – Um médico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado. "
                        + "<b>ATENÇÃO</b>, um médico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma.<br>"
                        + "Por exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.");

                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Engenheiro">
            case 7://Engenheiro
                classe.setText("Engenheiro");
                hab.setText("<b>Habilidade 1</b> - Ao alcançar o level 10, você poderá criar acessórios para armas de fogo.<br><br>"
                        + "<b>Habilidade 2</b> - Você agora pode arrombar quase todos os tipos de portas e cadeados, excluindo as de missão principal em alguns casos. Também, diminui em 2 o número de componentes necessários para construção de itens.<br><br>"
                        + "<b>Habilidade 3</b> - Após lidar com as forças hostis que te cercam usando como armas aquilo que um dia foram suas ferramentas, você aprendeu a tirar melhor proveito das mesmas. <br>"
                        + "Cai para 2 a diferença para realizar um ataque crítico em um inimigo, inclusive BOSS enquanto usa qualquerarma branca.");

                vant.setText("<b>Engenheiro Adaptável</b> – Permite consertar veículos e outros objetos.<br><br>"
                        + "<b>Conhecimento civil</b> – Permite um engenheiro arrombar uma porta ou cadeado simples usando seu kit de ferramentas.<br><br>"
                        + "<b>Mestre de obras</b> – Você pode criar itens e equipamentos gastando componentes de construção, caso esteja em batalha, custará uma rodada. <br><br>"
                        + "<b>Combatente civil</b> – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo INCLUSIVE BOSS quando usando uma arma branca do tipo bruta.<br>"
                        + "Também, se a arma possuir qualquer bónus, ele é aplicado automaticamente <b>(SÓ PODE OCORRER UMA VEZ POR RODADA)</b><br><br>"
                        + "<b>Sr. Sorriso</b> – Ganhe +2 de carisma.");

                desvant.setText("<b>Medroso</b> – As chances de seu personagem entrar em pânico são maiores, além disso, -2 em qualquer teste de coragem. <br><br>"
                        + "<b>Despreparado</b> – Um engenheiro NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado.<br>"
                        + "<b>ATENÇÃO</b>, um engenheiro nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma.<br>"
                        + "Por exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.");

                break;
            // </editor-fold>
        }
    }

    public static void getEscolhido(JEditorPane vant, JEditorPane desvant, JLabel classe) {
        
        vant.setText("<b>Guerreiro de campo</b> – Sua FORÇA ganha +2 de bónus.<br><br>"
                + "<b>Dor & Ganho</b> - Sua RESISTÊNCIA ganha +2 de bónus.<br><br>"
                + "<b>Gunner</b> – Ganhe +2 de vantagem no dado ao atacar usando, fuzil, pistola, submetralhadora ou qualquer arma branca.<br><br>"
                + "<b>Fuzil-Slayer</b> – Um fuzil não ocupará espaço no seu inventário. Além disso, todos os fuzis perdem 1 de requerimento de FORÇA para você pode usar.<br><br>"
                + "<b>Calor da batalha</b> - Toda vez que for atacado corpo-a-corpo, você pode optar por se defender atacando com a coronha ou baioneta da arma, ao invés de jogar o dado proporcional a STAMINA, jogue o proporcional à FORÇA. <br> <u>ATENÇÃO:</u> Caso seja atacado por mais de um inimigo ao mesmo tempo, você só poderá usar essa vantagem em um e não todos.");

        desvant.setText("<b>Barulhento</b> – Em testes de stealth, -2 no dado.<br><br>"
                + "<b>Servir e proteger</b> – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, ou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não.<br><br>"
                + "<b>Antiterrorista</b> – Você ataca sem hesitar qualquer terrorista que vê. <br>"
                + "<u>ATENÇÃO:</u> O ataque não é em frenesi, você pode formular estratégias e atacar com sabedoria.")

    }

    // </editor-fold>
    public static void limparSobreClasse(JEditorPane hab, JEditorPane vant, JEditorPane desvant) {
        hab.setText("NÃO HÁ CLASSE SELECIONADA!");
        vant.setText("NÃO HÁ CLASSE SELECIONADA!");
        desvant.setText("NÃO HÁ CLASSE SELECIONADA!");
    }

    // <editor-fold defaultstate="collapsed" desc="Slot/Debuffer">
    public static void destravaSlot(JTextField peso, JTextField slot9, JTextField slot10) {
        String PesS = peso.getText();
        int PesInt = Integer.parseInt(PesS);
        boolean desbloqueioSlot9 = false, desbloqueioSlot10 = false;

        if (PesInt >= 10) {
            slot9.setEditable(true);
            slot9.setToolTipText("Insira o nome do equipamento no respectivo slot");
            desbloqueioSlot9 = true;

        }

        if (PesInt == 10) {
            JOptionPane.showMessageDialog(null, "9° slot desbloqueado!");

        }

        if (PesInt >= 20) {
            slot10.setEditable(true);
            slot10.setToolTipText("Insira o nome do equipamento no respectivo slot");
            desbloqueioSlot10 = true;

        }

        if (PesInt == 20) {
            JOptionPane.showMessageDialog(null, "10° slot desbloqueado!");

        }
    }

    public static void debuffersAtiv(JCheckBox item, String desvantagemAdd, String desvantagemRemov) {
        if (item.isSelected()) {
            JOptionPane.showMessageDialog(null, desvantagemAdd);
        } else {
            JOptionPane.showMessageDialog(null, desvantagemRemov);
        }

    }

    public static int debufferMOD(JCheckBox item, JLabel label, int opcao) {
        int retorno = 0;
        switch (opcao) {
            case 0://sangrando
                if (item.isSelected()) {
                    try {
                        int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos % será o dano referente ao sangramento: "));
                        label.setText("<html><b>ESTÁ</b> <u>sangrando</u>: " + valor + "% de dano adicional;<br></html>");
                        retorno = valor;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Insira apenas números!", "Erro", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    label.setText("<html><b>NÃO ESTÁ</b> <u>sangrando</u>: " + 0 + "% de dano adicional;<br></html>");
                }
                break;

            case 1://exausto
                if (item.isSelected()) {
                    try {
                        int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de desvantagem no dado: "));
                        label.setText("<html><b>ESTÁ</b> <u>exausto</u>: -" + valor + " de desvantagem no dado;<br></html>");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Insira apenas números!", "Erro", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    label.setText("<html><b>NÃO ESTÁ</b> <u>exausto</u>: -" + 0 + " de desvantagem no dado;<br></html>");
                }
                break;

            case 2://stunado
                if (item.isSelected()) {
                    try {
                        int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de rodadas sem ação: "));
                        label.setText("<html><b>ESTÁ</b> <u>stunado</u>: " + valor + " rodadas sem ação;<br></html>");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Insira apenas números!", "Erro", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    label.setText("<html><b>NÃO ESTÁ</b> <u>stunado</u>: 0 rodadas sem ação;<br></html>");
                }
                break;

            case 3://envenenado
                if (item.isSelected()) {
                    try {
                        int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de desvantagem no dado: "));
                        label.setText("<html><b>ESTÁ</b> <u>envenenado</u>: " + valor + " de dano constante;<br></html>");
                        retorno = valor;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Insira apenas números!", "Erro", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    label.setText("<html><b>NÃO ESTÁ</b> <u>envenenado</u>: 0 de dano constante;<br></html>");
                }
                break;

            case 4://outro
                if (item.isSelected()) {
                    try {
                        String nome = JOptionPane.showInputDialog("Insira APENAS o nome da desvantagem: ");
                        String desc = JOptionPane.showInputDialog("Insira APENAS a descrição da desvantagem: ");
                        label.setText("<html><b>ESTÁ</b> <u>" + nome + "</u>: " + desc + ";<br></html>");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Insira apenas números!", "Erro", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    label.setText("<html><b>NÃO ESTÁ</b> <u>??????</u>: ??????;</html>");
                }
                break;
        }

        return retorno;
    }

    public static void slotEspecial(JComboBox classe, JTextField especial) {
        int aux = classe.getSelectedIndex();

        if ((aux == 1) || (aux == 2) || (aux == 3)) {
            especial.setEditable(true);
        } else {
            especial.setEditable(false);
        }
    }

    // </editor-fold>
}
