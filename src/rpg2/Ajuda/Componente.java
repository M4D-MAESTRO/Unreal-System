/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ajuda;

import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import rpg2.ArmasItens.Equipamentos;

/**
 *
 * @author M4ESTRO
 */
public class Componente {

    public static void getComponente(JComboBox opcao, JTextField nome, JTextArea desc ,JEditorPane pane, JLabel imagem) {

        switch (opcao.getSelectedIndex()) {
            case 0://Selecione o componenente
                nome.setText(opcao.getSelectedItem().toString());
                desc.setText("");
                break;

            case 1://Componenente de Construção
                Equipamentos.setItem(imagem, pane, 8);
                nome.setText(opcao.getSelectedItem().toString());
                pane.setContentType("text/html");
                pane.setText("<b>Criação de objetos:</b><br>"
                        + "Barricadas em janelas – 2 Componente de Construção.<br>"
                        + "Barricadas em portas – 3 Componente de Construção.<br>"
                        + "Máscara de gás – 5 Componente de Construção & 1 Componente Químico Hospitalar.<br>"
                        + "Soco inglês - 15 Componente de Construção. <br>"
                        + "Bastão retrátil – 5 Componente de Construção. <br>"
                        + "Pá – 20 Componente de Construção.<br>"
                        + "Escudo Policial – 10 Componente de Construção.<br>"
                        + "<br>"
                        + "<b>Criação de acessórios:</b><br>"
                        + "Munição perfurante – 10 Componente de Construção & 5 Componente Químico Explosivo.<br>"
                        + "Silenciador – 12 Componente de Construção.<br>"
                        + "Mira ACOG – 15 Componente de Construção.<br>"
                        + "Mira Red dot - 20 Componente de Construção. <br>"
                        + "Mira de zoom longo – 25 Componente de Construção. <br>"
                        + "Mira Laser– 15 Componente de Construção.<br>"
                        + "Grip – 10 Componente de Construção.<br>"
                        + "Escopeta acoplada – 20 Componente de Construção & 5 Componente Químico Explosivo.<br>"
                        + "Pente duplo – 15 Componente de Construção.<br>"
                        + "Pente estendido – 15 Componente de Construção."
                        + "<br>"
                        + "<br>"
                        + "<b>Criação de MODs:\n</b>"
                        + "Arame Farpado - 10 Componente de Construção.<br>"
                        + "Lâmina Garra - 10 Componente de Construção.<br>"
                        + "Lâmina Afiada - 20 Componente de Construção.<br>"
                        + "Pregos - 20  Componente de Construção.<br>"
                        + "Liga de Ferro - 15 Componente de Construção.<br>"
                        + "Modificador Tóxico - 20 Componente de Construção & 5 Componente Químico Hospitalar.<br>"
                        + "Modificador Paralítico - 20 Componente de Construção & 5 Componente Químico Hospitalar.<br>"
                        + "Modificador Incendiário - 20 Componente de Construção & 5 Componente Químico Explosivo.<br>"
                        + "Modificador Elétrico - 20 Componente de Construção& 5 Componente Eletrónico de Hackeamento.<br>"
                        + "Empunhadeira do Campeão - 15 Componente de Construção.<br>"
                        + "Empunhadeira do Berserk - 20 Componente de Construção.<br>"
                        + "Empunhadeira do Guardião - 15 Componente de Construção.<br>");
                break;

            case 2://Componenente Químico-explosivo
                Equipamentos.setItem(imagem, pane, 9);
                nome.setText(opcao.getSelectedItem().toString());
                pane.setContentType("text/html");
                pane.setText("<b>Criação de itens explosivos:</b><br>"
                        + "Granada de Distração – 4 Componente Químico Explosivo.<br>"
                        + "Granada Flashbang – 5 Componente Químico Explosivo.<br>"
                        + "Granada Frag – 6 Componente Químico Explosivo.<br>"
                        + "Granada Semtex – 7 Componente Químico Explosivo.<br>"
                        + "Granada Venenosa – 5 Componente Químico Explosivo e 3 Componente Químico Hospitalar.<br>"
                        + "C4 – 10 Componente Químico Explosivo.<br>"
                        + "Claymore – 8 Componente Químico Explosivo.<br>"
                        + "Granadas químicas – 3 Componente Químico Explosivo.");

                break;

            case 3://Componenente Químico-hospitalar
                Equipamentos.setItem(imagem, pane, 10);
                nome.setText(opcao.getSelectedItem().toString());
                pane.setContentType("text/html");
                pane.setText("<b>Criação de itens de cura:</b><br>"
                        + "Pílula P – 4 Componente Químico Hospitalar.<br>"
                        + "Pílula M – 6 Componente Químico Hospitalar.<br>"
                        + "Pílula G – 8 Componente Químico Hospitalar.<br>"
                        + "Vacina M/G – 15 Componente Químico Hospitalar.<br>"
                        + "Vacina Anti-infecção – 20 Componente Químico Hospitalar.");

                break;

            case 4://Componenente Eletrónico de hackeamento
                Equipamentos.setItem(imagem, pane, 11);
                nome.setText(opcao.getSelectedItem().toString());
                pane.setContentType("text/html");
                pane.setText("<b>Exploits:</b><br>"
                        + "Scanner – 5 Componente Eletrónico de Hackeamento.<br>"
                        + "Hackeamento de ambiente civil – 1 Componente Eletrónico de Hackeamento.<br>"
                        + "Drone & Carrinho de hackeamento – 2 Componente Eletrónico de Hackeamento.<br>"
                        + "Distração comunicativa – 2 Componente Eletrónico de Hackeamento.<br>"
                        + "Apagão Local – 5 CEH. <br>"
                        + "Dispositivo eletrônico – 2 Componente Eletrónico de Hackeamento.<br>"
                        + "<br>"
                        + "<b>Exploits avançados:</b><br>"
                        + "Hackeamento de ambiente militar – 3 Componente Eletrónico de Hackeamento.<br>"
                        + "Drone & Carrinho de combate – 8 Componente Eletrónico de Hackeamento.<br>"
                        + "Deturpação comunicativa – 5 Componente Eletrónico de Hackeamento.<br>"
                        + "Dispositivo explosivo – 3 Componente Eletrónico de Hackeamento.<br>"
                        + "Apagão geral – 10 Componente Eletrónico de Hackeamento.");

                break;
        }

    }

}
