/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.ArmasItens;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.EditorKit;

/**
 *
 * @author M4ESTRO
 */
public class Equipamentos {

    static ImageIcon imagem = null;

    public static void setEquipamento(JLabel label, JEditorPane desc, int opcao) {
        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Mascara de filtro.jpg"));
                desc.setText("<b>Máscara de gás</b> que concede imunidade à gases infecciosos, venenosos e outros do género");
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Colete leve.jpg"));
                desc.setText("<b>Colete leve</b> que concede defesa adicional de +1 contra armas de fogo");
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Colete medio.jpg"));
                desc.setText("<b>Colete médio</b> que concede defesa adicional de +2 contra armas de fogo");
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Colete pesado.jpg"));
                desc.setText("<b>Colete pesado</b> que concede defesa adicional de +3 contra armas de fogo");
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Exo-Esqueleto.jpg"));
                desc.setText("<b>Exo-Esqueleto leve</b> que concede defesa adicional de +1 contra armas de fogo além da movimentação exo-esqueleto.");
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Exo-Esqueleto.jpg"));
                desc.setText("<b>Exo-Esqueleto médio</b> que concede defesa adicional de +2 contra armas de fogo além da movimentação exo-esqueleto.");
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Exo-Esqueleto.jpg"));
                desc.setText("<b>Exo-Esqueleto pesado</b> que concede defesa adicional de +3 contra armas de fogo além da movimentação exo-esqueleto.");
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Exo-Esqueleto.jpg"));
                desc.setText("");

        }
        label.setIcon(imagem);
    }

    public static void setItem(JLabel label, JEditorPane desc, int opcao) {
        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M1 - Pistola.png"));
                desc.setText("Pacote com uma determinada quantia de munição de <b>Pistola</b>.<br>"
                        + "<b>Máximo:</b> <u>50 projéteis por pacote.</u>");
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M2 - Submetralhadora.png"));
                desc.setText("Pacote com uma determinada quantia de munição de <b>Submetralhadora</b>.<br>"
                        + "<b>Máximo:</b> <u>30 projéteis por pacote.</u>");
                break;
            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M4 - Escopeta.png"));
                desc.setText("Pacote com uma determinada quantia de munição de <b>Escopeta</b>.<br>"
                        + "<b>Máximo:</b> <u>15 projéteis por pacote.</u>");
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M3 - Fuzil.png"));
                desc.setText("Pacote com uma determinada quantia de munição de <b>Fuzil</b>.<br>"
                        + "<b>Máximo:</b> <u>30 projéteis por pacote.</u>");
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M5 - Sniper.png"));
                desc.setText("Pacote com uma determinada quantia de munição de <b>Sniper</b>.<br>"
                        + "<b>Máximo:</b> <u>10 projéteis por pacote.</u>");
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M6 - Magnum.png"));
                desc.setText("Pacote com uma determinada quantia de munição de <b>Magnum</b>.<br>"
                        + "<b>Máximo:</b> <u>6 projéteis por pacote.</u>");
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M7 - ESPECIAL.png"));
                desc.setText("Pacote com uma determinada quantia de munição de <b>Especial</b>.<br>"
                        + "<b>Máximo:</b> <u>1 projétil por pacote.</u>");
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/CC.png"));
                desc.setText("<b>Componente de construção</b> que te permite criar barreiras, barricadas, modificações e melhorias de armas, assim como reparação das mesmas.<br><br>"
                        + "<b>Veja o menu de ajuda, História & Gameplay, aba: Sistema de construção, para obter mais informações</b>");
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/CCE.png"));
                desc.setText("<b>Componente químico-explosivo</b> que te permite criar munição para a Lançadora química, granadas e outros explosivos.<br><br>"
                        + "<b>Veja o menu de ajuda, História & Gameplay, aba: Sistema de construção, para obter mais informações</b>");
                break;

            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/CQH.jpg"));
                desc.setText("<b>Componente químico-hospitalar </b> que te permite criar itens de cura e recarregar as vacinas.<br><br>"
                        + "<b>Veja o menu de ajuda, História & Gameplay, aba: Sistema de construção, para obter mais informações</b>");
                break;

            case 11:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/CEH.jpg"));
                desc.setText("<b>Componente eletrónico de hackeamento </b>que te permite criar exploits de hackeamento.<br><br>"
                        + "<b>Veja o menu de ajuda, História & Gameplay, aba: Sistema de construção, para obter mais informações</b>");
                break;

            case 12:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pilula - P.png"));
                desc.setText("<b>Pílula pequena</b> que recupera 10 pontos de vitalidade.<br>"
                        + "<b>Número de uso: </b><u>uso único.</u>");
                break;

            case 13:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pilula - M.png"));
                desc.setText("<b>Pílula média</b> que recupera 15 pontos de vitalidade.<br>"
                        + "<b>Número de uso: </b><u>uso único.</u>");
                break;

            case 14:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pilula - G.png"));
                desc.setText("<b>Pílula grande</b> que recupera 20 pontos de vitalidade.<br>"
                        + "<b>Número de uso: </b><u>uso único.</u>");
                break;

            case 15:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Spray de Primeiros Socorros.jpg"));
                desc.setText("<b>Spray de Primeiros Socorros </b>, que recupera 25 pontos de vitalidade.<br>"
                        + "<b>Número de uso: </b><u>uso único</u>.");
                break;

            case 16:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Kit de primeiros socorros.jpg"));
                desc.setText("<b>Kit de primeiros socorros</b>, que recupera 25 pontos de vitalidade.<br>"
                        + "<b>Número de uso: </b><u>utilizável 3x.</u>");
                break;

            case 17:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Vacina - Cura.png"));
                desc.setText("<b>Vacina média</b> que recupera 30 pontos de vitalidade.<br>"
                        + "<b>Número de uso: </b><u>varia de acordo com o médico.</u>");
                break;

            case 18:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Vacina - Cura.png"));                
                desc.setText("<b>Vacina grande</b> que recupera 40 pontos de vitalidade.<br>"
                        + "<b>Número de uso: </b><u>varia de acordo com o médico.</u>");
                break;

            case 19:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Vacina - Anti-infeccao.png"));
                desc.setText("<b>Vacina anti-infecção</b>,que cessa os efeitos da infecção.<br>"
                        + "<b>Número de uso: </b><u>uso único.</u>");
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Spray de Primeiros Socorros.jpg"));
                desc.setText("");

        }
        label.setIcon(imagem);
    }

}
