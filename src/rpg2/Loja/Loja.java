/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Loja;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import rpg2.ArmasItens.Acessorios;
import rpg2.ArmasItens.Armas;
import rpg2.ArmasItens.Equipamentos;
import rpg2.ArmasItens.ModBranco;
import rpg2.Imagens.Imagens;

/**
 *
 * @author M4ESTRO
 */
public class Loja {

    private static String[] listaMedica = {"Selecione o item", "Pílula - Pequena", "Pílula - Média", "Pílula - Grande", "Spray de primeiros socorros", "Kit de primeiros socorros", "Vacina anti-infecção", "Componente químico-hospitalar"};
    private static String[] listaEquItem = {"Selecione o item", "Munição - Pistola", "Munição - Submetralhadora", "Munição - Escopeta", "Munição - Fuzil", "Munição - Sniper", "Componente de Construção", "Máscara de Gás", "Colete leve", "Colete médio"};
    private static String[] listaArma = {"Selecione o item", "Beretta-M9", "Glock-17", "MP5K", "MP7", "PP2000", "Ranger"};
    private static String[] listaModFogo = {"Selecione o item", "Munição perfurante", "Silenciador", "ACOG", "Red Dot", "Mira Laser", "Grip", "Pente duplo", "Pente estendido"};
    private static String[] listaMecanica = {"Selecione o item", "Bastão de Baseball", "Bastão Retrátil", "Pá", "Faca", "Escudo Policial", "Componente químico-explosivo", "Componente Eletrónico de hackeamento"};

    private static String[] listaModBranca = {"Selecione o item", "Arame Farpado", "Lâmina Garra", "Lâmina Afiada", "Pregos", "Liga de Ferro", "Modificador Tóxico", "Modificador Paralítico", "Modificador Incendiário", "Modificador Elétrico", "Empunhadeira do Campeão", "Empunhadeira do Berserk", "Empunhadeira do Guardião"};

    //<editor-fold defaultstate="collapsed" desc=" GET das LISTAS">
    public static String[] getListaMedica() {
        return listaMedica;
    }

    public static String[] getListaEquItem() {
        return listaEquItem;
    }

    public static String[] getListaArma() {
        return listaArma;
    }

    public static String[] getListaModFogo() {
        return listaModFogo;
    }

    public static String[] getListaMecanica() {
        return listaMecanica;
    }

    public static String[] getListaModBranca() {
        return listaModBranca;
    }

    //</editor-fold>
    public static void ativarLoja(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes,JScrollPane[] scroll , JLabel[] labelValores, JLabel[] labelDesc) {
        for (int i = 0; i < imagens.length; i++) {
            imagens[i].setVisible(true);
            imagens[i].setEnabled(true);
            valores[i].setVisible(true);
            valores[i].setEnabled(true);
            descricoes[i].setVisible(true);
            descricoes[i].setEnabled(true);
            scroll[i].setVisible(true);
            scroll[i].setEnabled(true);        
            labelValores[i].setVisible(true);
            labelValores[i].setEnabled(true);
            labelDesc[i].setVisible(true);
            labelDesc[i].setEnabled(true);
        }
    }

    public static void desativarLoja(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes,JScrollPane[] scroll, JLabel[] labelValores, JLabel[] labelDesc, int comeco) {
        for (int i = comeco; i < imagens.length; i++) {
            imagens[i].setVisible(false);
            imagens[i].setEnabled(false);
            valores[i].setVisible(false);
            valores[i].setEnabled(false);
            descricoes[i].setVisible(false);
            descricoes[i].setEnabled(false);
            scroll[i].setVisible(false);
            scroll[i].setEnabled(false); 
            labelValores[i].setVisible(false);
            labelValores[i].setEnabled(false);
            labelDesc[i].setVisible(false);
            labelDesc[i].setEnabled(false);
        }
    }

    public static void setLojaMedica(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes,JScrollPane[] scroll, JLabel[] labelValores, JLabel[] labelDesc) {
        ativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc);
        int i = 0;
        //Pílula - Pequena
        Equipamentos.setItem(imagens[i], descricoes[i], 12);
        valores[i].setText("GOLD 50");
        i++;

        //Pílula - Media
        Equipamentos.setItem(imagens[i], descricoes[i], 13);
        valores[i].setText("GOLD 75");
        i++;

        //Pílula - Grande
        Equipamentos.setItem(imagens[i], descricoes[i], 14);
        valores[i].setText("GOLD 100");
        i++;

        //Spray de primeiros socorros
        Equipamentos.setItem(imagens[i], descricoes[i], 15);
        valores[i].setText("GOLD 150");
        i++;

        //Kit de primeiros socorros
        Equipamentos.setItem(imagens[i], descricoes[i], 16);
        valores[i].setText("GOLD 400");
        i++;

        //Vacina Anti-infeccao
        Equipamentos.setItem(imagens[i], descricoes[i], 19);
        valores[i].setText("GOLD 500");
        i++;

        //Componente químico-hospitalar
        Equipamentos.setItem(imagens[i], descricoes[i], 10);
        valores[i].setText("GOLD 10");
        i++;

        desativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc, i);
    }

    public static void setLojaEquItem(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes, JScrollPane[] scroll,  JLabel[] labelValores, JLabel[] labelDesc) {
        ativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc);
        int i = 0;
        //Munição - Pistola
        Equipamentos.setItem(imagens[i], descricoes[i], 1);
        valores[i].setText("(10x) GOLD 100");
        i++;

        //Munição - Submetralhadora
        Equipamentos.setItem(imagens[i], descricoes[i], 2);
        valores[i].setText("(10x) GOLD 200");
        i++;

        //Munição - Escopeta
        Equipamentos.setItem(imagens[i], descricoes[i], 3);
        valores[i].setText("(5x) GOLD 300");
        i++;

        //Munição - Fuzil
        Equipamentos.setItem(imagens[i], descricoes[i], 4);
        valores[i].setText("(10x) GOLD 300");
        i++;

        //Munição - Sniper
        Equipamentos.setItem(imagens[i], descricoes[i], 5);
        valores[i].setText("(5x) GOLD 300");
        i++;

        //Componente de Construção
        Equipamentos.setItem(imagens[i], descricoes[i], 8);
        valores[i].setText("GOLD 10");
        i++;

        //Máscara de Gás
        Equipamentos.setEquipamento(imagens[i], descricoes[i], 1);
        valores[i].setText("GOLD 300");
        i++;

        //Colete leve
        Equipamentos.setEquipamento(imagens[i], descricoes[i], 2);
        valores[i].setText("GOLD 300");
        i++;

        //Colete media
        Equipamentos.setEquipamento(imagens[i], descricoes[i], 3);
        valores[i].setText("GOLD 500");
        i++;

        desativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc, i);
    }

    public static void setLojaArma(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes,JScrollPane[] scroll,  JLabel[] labelValores, JLabel[] labelDesc) {
        ativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc);
        int i = 0;

        //Beretta-M9
        Armas.getBerettaM9(descricoes[i]);
        Imagens.setPistola(2, imagens[i]);
        valores[i].setText("GOLD 500");
        i++;

        //Glock-17
        Armas.getGlock17(descricoes[i]);
        Imagens.setPistola(4, imagens[i]);
        valores[i].setText("GOLD 500");
        i++;

        //MP5K
        Armas.getMP5k(descricoes[i]);
        Imagens.setSub(3, imagens[i]);
        valores[i].setText("GOLD 1000");
        i++;

        //MP7
        Armas.getMP7(descricoes[i]);
        Imagens.setSub(4, imagens[i]);
        valores[i].setText("GOLD 1000");
        i++;

        //PP2000
        Armas.getPP2000(descricoes[i]);
        Imagens.setSub(6, imagens[i]);
        valores[i].setText("GOLD 1000");
        i++;

        //Ranger
        Armas.getRanger(descricoes[i]);
        Imagens.setEscopeta(1, imagens[i]);
        valores[i].setText("GOLD 1500");
        i++;
        desativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc, i);
    }

    public static void setLojaModFogo(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes,JScrollPane[] scroll,  JLabel[] labelValores, JLabel[] labelDesc) {
        ativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc);
        int i = 0;

        //Munição perfurante
        Acessorios.getPerfurante(valores[i], descricoes[i]);
        Imagens.setCano(1, imagens[i]);
        valores[i].setText("GOLD 250");
        i++;

        //Silenciador
        Acessorios.getSilenciador(valores[i], descricoes[i]);
        Imagens.setCano(2, imagens[i]);
        valores[i].setText("GOLD 200");
        i++;

        //ACOG
        Acessorios.getAcog(valores[i], descricoes[i]);
        Imagens.setMira(1, imagens[i]);
        valores[i].setText("GOLD 300");
        i++;

        //Red Dot
        Acessorios.getRed(valores[i], descricoes[i]);
        Imagens.setMira(2, imagens[i]);
        valores[i].setText("GOLD 400");
        i++;

        //Mira Laser
        Acessorios.getLaser(valores[i], descricoes[i]);
        Imagens.setMira(2, imagens[i]);
        valores[i].setText("GOLD 300");
        i++;

        //Grip
        Acessorios.getGrip(valores[i], descricoes[i]);
        Imagens.setParteInf(1, imagens[i]);
        valores[i].setText("GOLD 200");
        i++;

        //Pente duplo
        Acessorios.getPenteD(valores[i], descricoes[i]);
        Imagens.setPente(1, imagens[i]);
        valores[i].setText("GOLD 300");
        i++;

        //Pente estendido
        Acessorios.getPenteE(valores[i], descricoes[i]);
        Imagens.setPente(2, imagens[i]);
        valores[i].setText("GOLD 300");
        i++;

        desativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc, i);
    }

    public static void setLojaModBranco(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes, JScrollPane[] scroll, JLabel[] labelValores, JLabel[] labelDesc) {
        ativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc);
        int i = 0;

        //Arame Farpado
        ModBranco.getArame(valores[i], descricoes[i]);
        Imagens.setMOD(1, imagens[i]);
        valores[i].setText("GOLD 200");
        i++;

        //Lâmina Garra
        ModBranco.getGarra(valores[i], descricoes[i]);
        Imagens.setMOD(2, imagens[i]);
        valores[i].setText("GOLD 400");
        i++;

        //Lâmina Afiada
        ModBranco.getAfiada(valores[i], descricoes[i]);
        Imagens.setMOD(3, imagens[i]);
        valores[i].setText("GOLD 400");
        i++;

        //Pregos
        ModBranco.getPregos(valores[i], descricoes[i]);
        Imagens.setMOD(4, imagens[i]);
        valores[i].setText("GOLD 400");
        i++;

        //Liga de Ferro
        ModBranco.getLigaFerro(valores[i], descricoes[i]);
        Imagens.setMOD(5, imagens[i]);
        valores[i].setText("GOLD 300");
        i++;

        //Modificador Tóxico
        ModBranco.getToxico(valores[i], descricoes[i]);
        Imagens.setMOD(6, imagens[i]);
        valores[i].setText("GOLD 500");
        i++;

        //Modificador Paralítico
        ModBranco.getParalitico(valores[i], descricoes[i]);
        Imagens.setMOD(7, imagens[i]);
        valores[i].setText("GOLD 500");
        i++;

        //Modificador Incendiário
        ModBranco.getIncendiario(valores[i], descricoes[i]);
        Imagens.setMOD(8, imagens[i]);
        valores[i].setText("GOLD 500");
        i++;
        
        //Modificador Elétrico
        ModBranco.getEletrico(valores[i], descricoes[i]);
        Imagens.setMOD(9, imagens[i]);
        valores[i].setText("GOLD 500");
        i++;

        //Empunhadeira do Campeão
        ModBranco.getCampeao(valores[i], descricoes[i]);
        Imagens.setMOD(10, imagens[i]);
        valores[i].setText("GOLD 300");
        i++;

        //Empunhadeira do Berserk
        ModBranco.getBerserk(valores[i], descricoes[i]);
        Imagens.setMOD(11, imagens[i]);
        valores[i].setText("GOLD 400");
        i++;

        //Empunhadeira do Guardião
        ModBranco.getGuardiao(valores[i], descricoes[i]);
        Imagens.setMOD(12, imagens[i]);
        valores[i].setText("GOLD 300");
        i++;

        desativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc, i);
    }

    public static void setLojaMecanica(JLabel[] imagens, JTextField[] valores, JEditorPane[] descricoes, JScrollPane[] scroll, JLabel[] labelValores, JLabel[] labelDesc) {
        ativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc);
        int i = 0;

        //Bastão de Baseball
        Armas.getBastao(descricoes[i]);
        Imagens.setBruta(3, imagens[i]);
        valores[i].setText("GOLD 400");
        i++;

        //Bastão Retrátil
        Armas.getBastaoR(descricoes[i]);
        Imagens.setBruta(4, imagens[i]);
        valores[i].setText("GOLD 100");
        i++;

        //Pá
        Armas.getPa(descricoes[i]);
        Imagens.setBruta(5, imagens[i]);
        valores[i].setText("GOLD 400");
        i++;

        //Faca
        Armas.getFaca(descricoes[i]);
        Imagens.setCorte(1, imagens[i]);
        valores[i].setText("GOLD 100");
        i++;

        //Escudo Policial
        Armas.getEscudo(descricoes[i]);
        Imagens.setCorte(7, imagens[i]);
        valores[i].setText("GOLD 200");
        i++;

        //Componente químico-explosivo
        Equipamentos.setItem(imagens[i], descricoes[i], 9);
        valores[i].setText("GOLD 10");
        i++;

        //Componente Eletrónico de hackeamento
        Equipamentos.setItem(imagens[i], descricoes[i], 11);
        valores[i].setText("GOLD 10");
        i++;

        desativarLoja(imagens, valores, descricoes, scroll, labelValores, labelDesc, i);
    }

}
