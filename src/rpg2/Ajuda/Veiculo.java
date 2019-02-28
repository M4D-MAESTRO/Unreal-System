/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ajuda;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author M4ESTRO
 */
public class Veiculo {

    public static void setImagem(JLabel label, int opcao) {
        ImageIcon imagem = null;

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Carro civil.jpg"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Carro civil esportivo.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Rover terrestre.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Hammer de combate.jpg"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Carrie Truck.jpg"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Tank.jpg"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Eagle.jpg"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Apache.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Carro civil esportivo.jpg"));
        }

        label.setIcon(imagem);
    }

    public static void cleanDesc(JTextArea desc) {
        desc.setText("");
    }

    public static void getCarroCivil(JTextArea desc) {
        desc.setText("Armas: NÃO\n"
                + "Capacidade: 4 passageiros  \n"
                + "Aprova de bala: NÃO. \n"
                + "Especificações: Resistência baixa, baixo consumo de gasolina, baixa chance de alguma peça quebrar.");
    }

    public static void getCarroEsportivo(JTextArea desc) {
        desc.setText("Armas: NÃO\n"
                + "Capacidade: 2 passageiros  \n"
                + "Aprova de bala: NÃO. \n"
                + "O veículo terrestre mais rápido existente.\n"
                + "Especificações: Resistência baixa, médio consumo de gasolina, média chance de alguma peça quebrar");
    }

    public static void getHoverTerrestre(JTextArea desc) {
        desc.setText("Armas: NÃO\n"
                + "Capacidade: 5 passageiros  \n"
                + "Aprova de bala: NÃO. \n"
                + "Especificações: Resistência média, médio consumo de gasolina, média chance de alguma peça quebrar");
    }

    public static void getHammerCombate(JTextArea desc) {
        desc.setText("Armas: Metralhadora\n"
                + "Capacidade: 5 passageiros  \n"
                + "Aprova de bala: Pistolas e submetralhadoras. \n"
                + "Especificações: Resistência alta, alto consumo de gasolina, baixa chance de alguma peça quebrar");
    }

    public static void getCarrieTruck(JTextArea desc) {
        desc.setText("Armas: NÃO\n"
                + "Capacidade: 12 passageiros  \n"
                + "Aprova de bala: NÃO. \n"
                + "Especificações: Resistência média, alto consumo de gasolina, média chance de alguma peça quebrar");
    }

    public static void getTank(JTextArea desc) {
        desc.setText("Armas: Metralhadora e mísseis\n"
                + "Capacidade: 4 passageiros  \n"
                + "Aprova de bala: SIM.\n"
                + "Só pode ser destruído com lançadores de mísseis \n"
                + "Especificações: Resistência altíssima, alto consumo de gasolina, nenhuma chance de alguma peça quebrar");
    }

    public static void getEagle(JTextArea desc) {
        desc.setText("Armas: NÃO\n"
                + "Capacidade: 6 passageiros  \n"
                + "Aprova de bala: NÃO. \n"
                + "Especificações: Resistência baixa, alto consumo de gasolina, nenhuma chance de alguma peça quebrar");
    }

    public static void getApache(JTextArea desc) {
        desc.setText("Armas: Metralhadora e Mísseis\n"
                + "Capacidade: 6 passageiros  \n"
                + "Aprova de bala: Pistolas e submetralhadoras. \n"
                + "Especificações: Resistência média, alto consumo de gasolina, nenhuma chance de alguma peça quebrar");
    }

}
