/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.ArmasItens;

import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class ModBranco {

    private static String[] listaTipoAcessorios = {"Selecione o tipo de modificação", "Ponta ", "Modificadores", "Empunhadeira"};
    private static String[] listaPonta = {"Selecione o tipo de ponta", "Arame Farpado", "Lâmina Garra", "Lâmina Afiada", "Pregos", "Liga de Ferro"};
    private static String[] listaModificador = {"Selecione o tipo de MOD", "Modificador Tóxico", "Modificador Paralítico", "Modificador Incendiário", "Modificador Elétrico"};
    private static String[] listaEmpunhadeira = {"Selecione o tipo de empunhadeira", "Empunhadeira do Campeão", "Empunhadeira do Berserk", "Empunhadeira do Guardião"};

    public static String[] getListaTipoAcessorios() {
        return listaTipoAcessorios;
    }

    public static String[] getListaPonta() {
        return listaPonta;
    }

    public static String[] getListaModificador() {
        return listaModificador;
    }

    public static String[] getListaEmpunhadeira() {
        return listaEmpunhadeira;
    }

    
    
    
    //<editor-fold defaultstate="collapsed" desc=" PONTA">
    public static void getArame(JTextField nome, JEditorPane desc) {
        nome.setText("Arame Farpado");
        desc.setContentType("text/html");
        desc.setText("<b>Arame Farpado:</b> Aumenta em 50% chance de causar ferimento por duas rodada.<br>"
                + "<b>Disponível para:</b> <u>Bastão policial, Bastão de baseball e Pá.</u>");
    }

    public static void getGarra(JTextField nome, JEditorPane desc) {
        nome.setText("Lâmina Garra");
        desc.setContentType("text/html");
        desc.setText("<b>Lâmina Garra:</b> Aumenta em 50% chance de causar ferimento por duas rodada.<br>"
                + "<b>Disponível para:</b> <u>Soco inglês, Faca, Katana, Kukri e Kris.</u>");
    }

    public static void getAfiada(JTextField nome, JEditorPane desc) {
        nome.setText("Lâmina Afiada");
        desc.setContentType("text/html");
        desc.setText("<b>Lâmina Afiada:</b> Aumenta em 0.5 o dano total da arma.<br>"
                + "<b>Disponível para:</b> <u>Faca, Katana, Kukri e Kris.</u>");
    }

    public static void getPregos(JTextField nome, JEditorPane desc) {
        nome.setText("Pregos");
        desc.setText("<b>Pregos:</b> Aumenta em 0.5 o dano total da arma.<br>"
                + "<b>Disponível para:</b> <u>Bastão policial, Bastão de baseball e Pá.</u>");
    }

    public static void getLigaFerro(JTextField nome, JEditorPane desc) {
        nome.setText("Liga de Ferro");
        desc.setText("<b>Liga de Ferro:</b> Aumenta a durabilidade do escudo.<br>"
                + "<b>Disponível para:</b> <u>Escudo.</u>");
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" MOD">
    public static void getToxico(JTextField nome, JEditorPane desc) {
        nome.setText("Modificador Tóxico");
        desc.setText("<b>Modificador Tóxico:</b> Gera 30% de chances de causar envenenamento por duas rodada (apenas humanos).<br>"
                + "<b>Disponível para:</b> <u>Todas, menos as táticas.</u>");
    }

    public static void getParalitico(JTextField nome, JEditorPane desc) {
        nome.setText("Modificador Paralítico");
        desc.setText("<b>Modificador Paralítico:</b> Gera 50% de chances de paralisar o alvo por uma rodada (apenas infectados níveis 1 e 2).<br>"
                + "<b>Disponível para:</b> <u>Todas, menos as táticas.</u>");
    }

    public static void getIncendiario(JTextField nome, JEditorPane desc) {
        nome.setText("Modificador Incendiário");
        desc.setText("<b>Modificador Incendiário:</b> Gera 50% de chances de incendiar o alvo por duas rodadas (2.0 de dano por rodada)<br>"
                + "<b>Disponível para:</b> <u>Todas, menos as táticas.</u>");
    }

    public static void getEletrico(JTextField nome, JEditorPane desc) {
        nome.setText("Modificador Elétrico");
        desc.setText("<b>Modificador Elétrico:</b> Aumenta em 0.5 o dano total da arma.<br>"
                + "<b>Disponível para:</b> <u>Todas, menos a Stun gun.</u>");
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Empunhadeira">
    public static void getCampeao(JTextField nome, JEditorPane desc) {
        nome.setText("Empunhadeira do Campeão");
        desc.setText("<b>Empunhadeira do Campeão:</b> Chance de 30% de poder atacar novamente com a arma branca utilizada.<br>"
                + "<b>Disponível para:</b> <u>Todas, menos a Stun gun e o Escudo.</u>");
    }

    public static void getBerserk(JTextField nome, JEditorPane desc) {
        nome.setText("Empunhadeira do Berserk");
        desc.setText("<b>Empunhadeira do Berserk:</b> Aumenta em 0.5 o dano total da arma.<br>"
                + "<b>Disponível para:</b> <u> Todas, menos a Stun gun.</u>");
    }

    public static void getGuardiao(JTextField nome, JEditorPane desc) {
        nome.setText("Empunhadeira do Guardião");
        desc.setText("<b>Empunhadeira do Guardião:</b> Aumenta a durabilidade da arma.<br>"
                + "<b>Disponível para:</b> <u> Todas, menos a Stun gun.</u>");
    }

    //</editor-fold>
}
