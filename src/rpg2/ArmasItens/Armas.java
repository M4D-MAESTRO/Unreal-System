/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.ArmasItens;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class Armas {

    //CLASSE ARMAS 
    static String[] listaArmasFogo = {"Selecione a classe da arma", "Pistola", "Submetralhadora", "Fuzil", "Escopeta", "Sniper", "Magnum", "Especial"};
    static String[] listaArmasBranca = {"Selecione a classe da arma", "Bruta", "Corte", "Tatica"};
    static String[] listaArmasUsavel = {"Selecione a classe da arma", "Granada", "Tatica"};
    static String[] defaultSet = {"Selecione a classe da arma primeiro"};

    public static String[] getListaFogo() {
        return listaArmasFogo;
    }

    public static String[] getListaBranca() {
        return listaArmasBranca;
    }

    public static String[] getListaUsavel() {
        return listaArmasUsavel;
    }

    public static String[] getDefaultSet() {
        return defaultSet;
    }

    //ARMAS FOGO
    static String[] listaPistola = {"Selecione a pistola", "Colt-M1911", "Beretta-M9", "M9-Flashlight", "Glock17", "Glock17-Silenced", "M3-SOCOM", "MP443 Grach", "PMR30", "M93R", "MAUSER"};
    static String[] listaSubmetralhadora = {"Selecione a submetralhadora", "MP5", "MP5-Silenced", "MP5K", "MP7", "P90", "PP2000", "UMP-45", "FAMAS", "PP19", "MTAR"};
    static String[] listaFuzil = {"Selecione o fuzil", "M4A1", "M16A4", "M416", "AK74M", "SCAR-H", "SCAR-L", "ACR", "SG553-LB", "A91", "G36C", "F2000", "M14E", "G3", "L85A2", "M249", "M60", "TYPE88"};
    static String[] listaEscopeta = {"Selecione a escopeta", "RANGER", "STAKEOUT", "REMINGTON 870", "DAO 12", "XM1014", "SPAS 12", "USAS 12", "SAIGA 12", "JACKHAMMER"};
    static String[] listaSniper = {"Selecione a sniper", "BARRET .50", "L96A1", "PSG"};
    static String[] listaMagnum = {"Selecione a magnum", "MP412-Rex", "PYTHON", "TAURUS 44"};
    static String[] listaEspecialFogo = {"Selecione a arma especial", "RPG-7", "GATLING GUN", "FLAMETROWER", "LANÇADORA QUÍMICA", "STINGER"};

    //ARMAS BRANCA
    static String[] listaBruta = {"Selecione a arma bruta", "Soco Inglês", "Bastão Policial", "Taco de Baseball", "Bastão Retrátil", "Pá"};
    static String[] listaCorte = {"Selecione a arma de corte", "Faca", "Katana", "Kukri", "Kris"};
    static String[] listaTaticaBranca = {"Selecione o arma tatica", "Stun gun", "Stun rod", "Escudo Policial"};
    //static String[] listaEspecialBranca = {"Selecione a arma especial", "", ""};

    //ARMAS USAVEL
    static String[] listaGranada = {"Selecione a granada", "Distração", "Flashbang", "Frag", "Incendiária", "Semtex", "Veneno"};
    static String[] listaTaticaUsavel = {"Selecione o usável tático ou especial", "Faca balística", "C4", "Claymore", "Granadas Químicas"};
    //static String[] listaEspecialUsavel = {"Selecione o usável especial", ""};

    static ImageIcon iconeArma = null;

    //<editor-fold defaultstate="collapsed" desc=" Lista FOGO">
    public static String[] getPistola() {
        return listaPistola;
    }

    public static String[] getSubmetralhadora() {
        return listaSubmetralhadora;
    }

    public static String[] getFuzil() {
        return listaFuzil;
    }

    public static String[] getEscopeta() {
        return listaEscopeta;
    }

    public static String[] getSniper() {
        return listaSniper;
    }

    public static String[] getMagnum() {
        return listaMagnum;
    }

    public static String[] getEspecial() {
        return listaEspecialFogo;
    }

//</editor-fold>
    
    public static String[] getBruta() {
        return listaBruta;
    }

    public static String[] getCorte() {
        return listaCorte;
    }

    public static String[] getTatica() {
        return listaTaticaBranca;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Lista USAVEL">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    public static String[] getGranada() {
        return listaGranada;
    }

    public static String[] getTaticaUsavel() {
        return listaTaticaUsavel;
    }

    //public static String[] getEspecialUsavel() {
    //    return listaEspecialUsavel;
    //}
    //</editor-fold>
    //ACESSÓRIOS
    static String[] listaCano = {"Selecione o cano", ""};
    static String[] listaMira = {"Selecione a mira", ""};
    static String[] listaBarril = {"Selecione o barril", "Aberração Demoniáca", "Infectado Aprimorado", "Demónio Alado", ""};
    static String[] listaParteInferior = {"Selecione a parte inferior", "The Hunter", ""};
    static String[] listaPunhoPente = {"Selecione o punho & pente", ""};

    static ImageIcon iconeAcessorio = null;

    public static void limpaTela(JTextField[] campoTexto) {
        campoTexto[0].setText(""); //jTextFieldNomeArma;
        campoTexto[1].setText(""); //jTextFieldPoderArma;
        campoTexto[2].setText(""); //jTextFieldCapacidadeArma;
        campoTexto[3].setText(""); //jTextFieldRecargaArma;
        campoTexto[4].setText(""); //jTextFieldRequisitoArma;
        campoTexto[5].setText(""); //jTextFieldAcessorioArma;
        campoTexto[6].setText(""); //jTextFieldEspecialArma;

    }

    //<editor-fold defaultstate="collapsed" desc=" Armas de fogo">
    //<editor-fold defaultstate="collapsed" desc=" PISTOLAS">
    public static void getColt1911(JTextField[] campoTexto) {
        campoTexto[0].setText("Colt 1911"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("7 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;
    }

    public static void getBerettaM9(JTextField[] campoTexto) {
        campoTexto[0].setText("Beretta-M9"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.2"); //jTextFieldPoderArma;
        campoTexto[2].setText("10 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getBerettaM9(JEditorPane campoTexto) {
        campoTexto.setText("<b>Beretta M9</b> <br>"
                + "<b>Poder de fogo:</b> 1.2<br>"
                + "<b>Capacidade:</b> 10 projéteis<br>"
                + "<b>Tempo de Recarga:</b> 1 rodada<br>"
                + "<b>Requisito:</b> FOR 2<br>"
                + "<b>Acessórios:</b> Cano - Parte Inferior - Punho & Pente<br>"
                + "<b>Especial:</b> NADA"); //jTextFieldEspecialArma;
    }

    public static void getBerettaM9F(JTextField[] campoTexto) {
        campoTexto[0].setText("Beretta-M9 Flashligth (F.P Exclusive)"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.2"); //jTextFieldPoderArma;
        campoTexto[2].setText("10 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Lanterna embutida"); //jTextFieldEspecialArma;

    }

    public static void getGlock17(JTextField[] campoTexto) {
        campoTexto[0].setText("Glock 17"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("14 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Modo de tiro automático"); //jTextFieldEspecialArma;
    }

    public static void getGlock17(JEditorPane campoTexto) {
        campoTexto.setText("<b>Glock 17</b> <br>"
                + "<b>Poder de fogo:</b> 1.0<br>"
                + "<b>Capacidade:</b> 14 projéteis<br>"
                + "<b>Tempo de recarga:</b> 1 rodada<br>"
                + "<b>Requisito:</b> FOR 2<br>"
                + "<b>Acessórios:</b> Cano - Parte Inferior - Punho & Pente<br>"
                + "<b>Especial:</b> Modo de tiro automático"); //jTextFieldEspecialArma;
    }
    
    public static void getGlock17S(JTextField[] campoTexto) {
        campoTexto[0].setText("Glock 17-Silenced (B.H.C Exclusive)"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.1"); //jTextFieldPoderArma;
        campoTexto[2].setText("14 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Modo de tiro automático / Silenciador embutido"); //jTextFieldEspecialArma;

    }

    public static void getMK3Socom(JTextField[] campoTexto) {
        campoTexto[0].setText("MK3-Socom"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.2"); //jTextFieldPoderArma;
        campoTexto[2].setText("10 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2 / Perícia em pistola"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Mira laser embutida"); //jTextFieldEspecialArma;

    }

    public static void getMP443(JTextField[] campoTexto) {
        campoTexto[0].setText("MP443 Frach"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("10 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2 / Perícia em pistolas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Munição perfurante"); //jTextFieldEspecialArma;

    }

    public static void getPMR30(JTextField[] campoTexto) {
        campoTexto[0].setText("PMR30"); //jTextFieldNomeArma;
        campoTexto[1].setText("0.8"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 3 / Perícia em pistolas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Parte inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Munição perfurante / Modo automático"); //jTextFieldEspecialArma;

    }

    public static void getM93r(JTextField[] campoTexto) {
        campoTexto[0].setText("Beretta M93R"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.2"); //jTextFieldPoderArma;
        campoTexto[2].setText("15 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 4 / Perícia em pistolas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Parte inferior"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Pente estendido / Modo rajada"); //jTextFieldEspecialArma;

    }

    public static void getMauser(JTextField[] campoTexto) {
        campoTexto[0].setText("Mauser C96"); //jTextFieldNomeArma;
        campoTexto[1].setText("2.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("9 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 4 / Perícia em pistolas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Parte inferior"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Submetralhadoras">
    
    public static void getMP5(JTextField[] campoTexto) {
        campoTexto[0].setText("MP5"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.2"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 4"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Barril - Mira - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getMP5S(JTextField[] campoTexto) {
        campoTexto[0].setText("MP5-Silenced (B.H.C Exclusive)"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.3"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 4"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Barril - Mira - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Silenciador embutido"); //jTextFieldEspecialArma;

    }

    public static void getMP5k(JTextField[] campoTexto) {
        campoTexto[0].setText("MP5K"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.1"); //jTextFieldPoderArma;
        campoTexto[2].setText("20 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano  - Mira - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Grip embutido"); //jTextFieldEspecialArma;
    }
    
    public static void getMP5k(JEditorPane campoTexto) {
        campoTexto.setText("<b>MP5k</b> <br>"
                + "<b>Poder de fogo:</b> 1.1<br>"
                + "<b>Capacidade:</b> 20 projéteis<br>"
                + "<b>Tempo de recarga:</b> 1 rodada<br>"
                + "<b>Requisito:</b> FOR 2<br>"
                + "<b>Acessórios:</b> Cano  - Mira - Parte Inferior - Punho & Pente<br>"
                + "<b>Especial:</b> Grip embutido"); //jTextFieldEspecialArma;
    }

    public static void getMP7(JTextField[] campoTexto) {
        campoTexto[0].setText("MP7"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("20 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 2"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Mira - Parte Inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Grip embutido"); //jTextFieldEspecialArma;
    }
    
    public static void getMP7(JEditorPane campoTexto) {
        campoTexto.setText("<b>MP7</b> <br>"
                + "<b>Poder de fogo:</b> 1.0<br>"
                + "<b>Capacidade:</b> 20 projéteis<br>"
                + "<b>Tempo de recarga:</b> 1 rodada<br>"
                + "<b>Requisitos:</b> FOR 2<br>"
                + "<b>Acessórios:</b> Cano - Mira - Parte Inferior - Punho & Pente<br>"
                + "<b>Especial:</b> Grip embutido"); //jTextFieldEspecialArma;
    }

    public static void getP90(JTextField[] campoTexto) {
        campoTexto[0].setText("P90"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("50 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("3 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 9 / Perícia em submetralhadora"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Barril - Mira"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getPP2000(JTextField[] campoTexto) {
        campoTexto[0].setText("PP2000"); //jTextFieldNomeArma;
        campoTexto[1].setText("0.8"); //jTextFieldPoderArma;
        campoTexto[2].setText("15 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Mira"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }
    
    public static void getPP2000(JEditorPane campoTexto) {
        campoTexto.setText("<b>PP2000</b> <br>"
                + "<b>Poder de fogo:</b> 0.8<br>"
                + "<b>Capacidade:</b> 15 projéteis<br>"
                + "<b>Tempo de recarga:</b> 1 rodada<br>"
                + "<b>Requisitos:</b> FOR 1<br>"
                + "<b>Acessórios:</b> Mira<br>"
                + "<b>Especial:</b> NADA"); //jTextFieldEspecialArma;
    }

    public static void getUMP(JTextField[] campoTexto) {
        campoTexto[0].setText("UMP 45"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("25 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 8"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Barril - Mira - Parte Inferior"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getFamas(JTextField[] campoTexto) {
        campoTexto[0].setText("Famas"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.7"); //jTextFieldPoderArma;
        campoTexto[2].setText("20 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 10 / Perícia em submetralhadora"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Barril - Mira"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Modo de tiro Rajada"); //jTextFieldEspecialArma;

    }

    public static void getPP19(JTextField[] campoTexto) {
        campoTexto[0].setText("PP19"); //jTextFieldNomeArma;
        campoTexto[1].setText("2.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("40 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 12 / Perícia em submetralhadora"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Mira"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getMtar(JTextField[] campoTexto) {
        campoTexto[0].setText("MTAR"); //jTextFieldNomeArma;
        campoTexto[1].setText("2.3"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 15 / Perícia em submetralhadora"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Barril - Mira"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Fuzis">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    public static void getM4A1(JTextField[] campoTexto) {
        campoTexto[0].setText("M4A1"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.3"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 7"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getM16A4(JTextField[] campoTexto) {
        campoTexto[0].setText("M16A4"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 8"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Modo de tiro Rajada"); //jTextFieldEspecialArma;

    }

    public static void getM416(JTextField[] campoTexto) {
        campoTexto[0].setText("M416"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.8"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 9"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getAK74M(JTextField[] campoTexto) {
        campoTexto[0].setText("AK74M"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.3"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 7"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getScarH(JTextField[] campoTexto) {
        campoTexto[0].setText("Scar Heavy"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.8"); //jTextFieldPoderArma;
        campoTexto[2].setText("20 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 9"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getScarL(JTextField[] campoTexto) {
        campoTexto[0].setText("Scar Light"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 7"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getACR(JTextField[] campoTexto) {
        campoTexto[0].setText("ACR"); //jTextFieldNomeArma;
        campoTexto[1].setText("4.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 13"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Munição perfurante"); //jTextFieldEspecialArma;

    }

    public static void getSG553(JTextField[] campoTexto) {
        campoTexto[0].setText("SG553-LB"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.8"); //jTextFieldPoderArma;
        campoTexto[2].setText("35 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 13"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getA91(JTextField[] campoTexto) {
        campoTexto[0].setText("A91"); //jTextFieldNomeArma;
        campoTexto[1].setText("4.2"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 17 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getG36C(JTextField[] campoTexto) {
        campoTexto[0].setText("G36C"); //jTextFieldNomeArma;
        campoTexto[1].setText("4.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("35 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 20 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Mira - Parte inferior - Punho & Pente"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Mira laser embutida"); //jTextFieldEspecialArma;

    }

    public static void getF2000(JTextField[] campoTexto) {
        campoTexto[0].setText("F2000"); //jTextFieldNomeArma;
        campoTexto[1].setText("4.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 7"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Mira - Barril"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Munição perfurante"); //jTextFieldEspecialArma;

    }

    public static void getM14E(JTextField[] campoTexto) {
        campoTexto[0].setText("M14E"); //jTextFieldNomeArma;
        campoTexto[1].setText("5.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("20 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 21 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Cano - Mira - Parte inferior"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Modo de tiro Único"); //jTextFieldEspecialArma;

    }

    public static void getG3(JTextField[] campoTexto) {
        campoTexto[0].setText("G3"); //jTextFieldNomeArma;
        campoTexto[1].setText("4.8"); //jTextFieldPoderArma;
        campoTexto[2].setText("25 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 18 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Modo de tiro Único"); //jTextFieldEspecialArma;

    }

    public static void getL85A2(JTextField[] campoTexto) {
        campoTexto[0].setText("L85A2"); //jTextFieldNomeArma;
        campoTexto[1].setText("4.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("30 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 17 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getM249(JTextField[] campoTexto) {
        campoTexto[0].setText("M249"); //jTextFieldNomeArma;
        campoTexto[1].setText("5.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("100 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("2 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 23 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getM60(JTextField[] campoTexto) {
        campoTexto[0].setText("M60"); //jTextFieldNomeArma;
        campoTexto[1].setText("6.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("100 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("2 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 25 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getType88(JTextField[] campoTexto) {
        campoTexto[0].setText("Type 88"); //jTextFieldNomeArma;
        campoTexto[1].setText("7.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("100 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("2 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 28 / Perícia em fuzis"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Todos"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Escopeta">
    
    public static void getRanger(JTextField[] campoTexto) {
        campoTexto[0].setText("Ranger"); //jTextFieldNomeArma;
        campoTexto[1].setText("3.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("2 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada para 2 projéteis"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 4"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;
    }
    
    public static void getRanger(JEditorPane campoTexto) {
        campoTexto.setText("<b>Ranger</b> <br>"
                + "<b>Poder de fogo:</b> 3.0<br>"
                + "<b>Capacidade:</b> 2 projéteis<br>"
                + "<b>Tempo de recarga:</b> 1 rodada para 2 projéteis<br>"
                + "<b>Requisitos:</b> FOR 4<br>"
                + "<b>Acessórios:</b> Nenhum<br>"
                + "<b>Especial:</b> NADA"); //jTextFieldEspecialArma;
    }

    public static void getM37Stakeout(JTextField[] campoTexto) {
        campoTexto[0].setText("M37 Stakeout (F.P Exclusive) "); //jTextFieldNomeArma;
        campoTexto[1].setText("4.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("7 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada para 2 projéteis"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 6"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Mira laser embutida"); //jTextFieldEspecialArma;

    }

    public static void getRemington870(JTextField[] campoTexto) {
        campoTexto[0].setText("Remington 870"); //jTextFieldNomeArma;
        campoTexto[1].setText("5.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("7 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada para 2 projéteis"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 8"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getDAO(JTextField[] campoTexto) {
        campoTexto[0].setText("DAO 12"); //jTextFieldNomeArma;
        campoTexto[1].setText("5.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("12 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 10 / Perícia em escopetas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Grip embutido"); //jTextFieldEspecialArma;

    }

    public static void getXM1014(JTextField[] campoTexto) {
        campoTexto[0].setText("XM1014"); //jTextFieldNomeArma;
        campoTexto[1].setText("6.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("8 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada para 2 projéteis"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 4"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Barril"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getSPAS(JTextField[] campoTexto) {
        campoTexto[0].setText("SPAS 12"); //jTextFieldNomeArma;
        campoTexto[1].setText("6.3"); //jTextFieldPoderArma;
        campoTexto[2].setText("10 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada para 2 projéteis"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 15 / Perícia em escopetas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Barril"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getUSAS12(JTextField[] campoTexto) {
        campoTexto[0].setText("USAS12"); //jTextFieldNomeArma;
        campoTexto[1].setText("6.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("12 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 18"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Automática"); //jTextFieldEspecialArma;

    }

    public static void getSaiga(JTextField[] campoTexto) {
        campoTexto[0].setText("Saiga 12K"); //jTextFieldNomeArma;
        campoTexto[1].setText("8.5"); //jTextFieldPoderArma;
        campoTexto[2].setText("15 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 21 / Perícia em escopetas / Classes militares apenas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Barril"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Automática"); //jTextFieldEspecialArma;

    }

    public static void getJackhammer(JTextField[] campoTexto) {
        campoTexto[0].setText("Jackhammer"); //jTextFieldNomeArma;
        campoTexto[1].setText("10.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("12 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada para 1 projéteis"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 25 / Perícia em escopetas / Classes militares apenas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Sniper">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    public static void getAWM(JTextField[] campoTexto) {
        campoTexto[0].setText("L96-AWM"); //jTextFieldNomeArma;
        campoTexto[1].setText("12.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("10 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 18"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Parte inferior"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Perca de uma rodada pela ação do ferrolho"); //jTextFieldEspecialArma;

    }

    public static void getPSG(JTextField[] campoTexto) {
        campoTexto[0].setText("PSG"); //jTextFieldNomeArma;
        campoTexto[1].setText("8.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("12 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 18 / Perícia em sniper"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Parte inferior"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Semi-automática"); //jTextFieldEspecialArma;

    }

    public static void getBarret(JTextField[] campoTexto) {
        campoTexto[0].setText("Barret .50"); //jTextFieldNomeArma;
        campoTexto[1].setText("15.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("5 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("2 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 22 / Perícia em sniper / Classe militar apenas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Parte inferior"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Perca uma rodado pelo uso do ferrolho / Perfura blindagem."); //jTextFieldEspecialArma;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Magnum">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    public static void getRex(JTextField[] campoTexto) {
        campoTexto[0].setText("Rex 412"); //jTextFieldNomeArma;
        campoTexto[1].setText("10.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("6 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 13"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getPython(JTextField[] campoTexto) {
        campoTexto[0].setText("Colt. Python"); //jTextFieldNomeArma;
        campoTexto[1].setText("15.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("6 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 17"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getTaurus(JTextField[] campoTexto) {
        campoTexto[0].setText("Taurus .44"); //jTextFieldNomeArma;
        campoTexto[1].setText("20.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("6 projéteis"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 23 / Perícia em Magnum"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Especiais">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    public static void getLancadora(JTextField[] campoTexto) {
        campoTexto[0].setText("Lançadora química (Químico Exclusive)"); //jTextFieldNomeArma;
        campoTexto[1].setText("De acordo com a munição usada"); //jTextFieldPoderArma;
        campoTexto[2].setText("1 projétil"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("1 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("Classe químico apenas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Munições versáteis"); //jTextFieldEspecialArma;

    }

    public static void getGiratoria(JTextField[] campoTexto) {
        campoTexto[0].setText("Giratória"); //jTextFieldNomeArma;
        campoTexto[1].setText("10.0 (POR TURNO)"); //jTextFieldPoderArma;
        campoTexto[2].setText("5 turnos de tiro SEM PARAR"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("recarga apenas fora de combate"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 30 / Perícia em fuzis / Perícia em especiais / Classe – Militar."); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("5 turnos atirando sem parar. Ainda pode ser atacado. Penalidade de -2 na defesa. Acerta todos os inimigos em sua frente no campo de visão."); //jTextFieldEspecialArma;

    }

    public static void getFlame(JTextField[] campoTexto) {
        campoTexto[0].setText("Lança-Chamas"); //jTextFieldNomeArma;
        campoTexto[1].setText("5.0 por turno em chamas"); //jTextFieldPoderArma;
        campoTexto[2].setText("3 turnos"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("Recarga apenas fora de combate "); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 20 / Perícia em especiais / Classe – Militar."); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Inimigos em chama tomam dano por 3 rodadas. O fogo se alastra em área. POSSUI FOGO AMIGO."); //jTextFieldEspecialArma;

    }

    public static void getRPG(JTextField[] campoTexto) {
        campoTexto[0].setText("RPG-7"); //jTextFieldNomeArma;
        campoTexto[1].setText("50.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("1 tiro"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("3 rodada"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 20 / Perícia em especiais / Classe militar apenas."); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Contra inimigos aéreos ou voando -1 no dado. Contra inimigos terrestres +1 no dado."); //jTextFieldEspecialArma;

    }

    public static void getStinger(JTextField[] campoTexto) {
        campoTexto[0].setText("Stinger"); //jTextFieldNomeArma;
        campoTexto[1].setText("1 tiro"); //jTextFieldPoderArma;
        campoTexto[2].setText("1 projétil"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("FOR 20 / Perícia em especiais / Classe – Militar."); //jTextFieldRecargaArma;
        campoTexto[4].setText("Classe químico apenas"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("Nenhum"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Apenas pode ser usada contra inimigos aéreos! +1 no dado contra eles."); //jTextFieldEspecialArma;

    }

    //</editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Armas Brancas">
    //<editor-fold defaultstate="collapsed" desc=" BRUTAS">
    
    public static void getBastaoP(JTextField[] campoTexto) {
        campoTexto[0].setText("Cassetete policial"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.8 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getBastao(JTextField[] campoTexto) {
        campoTexto[0].setText("Bastão de baseball"); //jTextFieldNomeArma;
        campoTexto[1].setText("2.0 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 5"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;
    }
    
    public static void getBastao(JEditorPane campoTexto) {
        campoTexto.setText("<b>Bastão de baseball</b> <br>"
                + "<b>Poder de fogo:</b> 2.0 + FOR/10<br>"
                + "<b>Requisitos:</b> FOR 5<br>"
                + "<b>MODs:</b> Ponta, Modificadores, Empunhadeira<br>"
                + "<b>Especial:</b> NADA"); //jTextFieldEspecialArma;
    }

    public static void getBastaoR(JTextField[] campoTexto) {
        campoTexto[0].setText("Bastão retrátil"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.5 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }
    
    public static void getBastaoR(JEditorPane campoTexto) {
        campoTexto.setText("<b>Bastão retrátil</b> <br>"
                + "<b>Poder de fogo:</b> 1.5 + FOR/10<br>"
                + "<b>Requisitos:</b> FOR 1<br>"
                + "<b>MODs:</b> Ponta, Modificadores, Empunhadeira<br>"
                + "<b>Especial:</b> NADA"); //jTextFieldEspecialArma;
    }

    public static void getSoco(JTextField[] campoTexto) {
        campoTexto[0].setText("Soco inglês"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.5 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 5"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Dois ataques corporais"); //jTextFieldEspecialArma;

    }

    public static void getPa(JTextField[] campoTexto) {
        campoTexto[0].setText("Pá"); //jTextFieldNomeArma;
        campoTexto[1].setText("2.0 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }
    
    public static void getPa(JEditorPane campoTexto) {
        campoTexto.setText("<b>Pá</b> <br>"
                + "<b>Poder de fogo:</b> 2.0 + FOR/10<br>"
                + "<b>Requisitos:</b> FOR 1<br>"
                + "<b>MODs:</b> Ponta, Modificadores, Empunhadeira<br>"
                + "<b>Especial:</b> NADA"); //jTextFieldEspecialArma;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" CORTE">
    
    public static void getFaca(JTextField[] campoTexto) {
        campoTexto[0].setText("Faca"); //jTextFieldNomeArma;
        campoTexto[1].setText("0.5 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getFaca(JEditorPane campoTexto) {
        campoTexto.setText("<b>Faca</b> <br>"
                + "<b>Poder de fogo:</b> 0.5 + FOR/10<br>"
                + "<b>Requisitos:</b> FOR 1<br>"
                + "<b>MODs:</b> Ponta, Modificadores, Empunhadeira<br>"
                + "<b>Especial:</b> NADA"); //jTextFieldEspecialArma;
    }
    
    public static void getKatana(JTextField[] campoTexto) {
        campoTexto[0].setText("Katana"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.0 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 5"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Maior chance de desmembrar se a FORÇA for maios que 10, ou se um médico estiver usando."); //jTextFieldEspecialArma;

    }

    public static void getKris(JTextField[] campoTexto) {
        campoTexto[0].setText("Kris"); //jTextFieldNomeArma;
        campoTexto[1].setText("0.8 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getKukri(JTextField[] campoTexto) {
        campoTexto[0].setText("Kukri"); //jTextFieldNomeArma;
        campoTexto[1].setText("0.5 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 3"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Dois ataques corporais, maior chance de decapitção"); //jTextFieldEspecialArma;

    }

    //</editor-fold>    
    //<editor-fold defaultstate="collapsed" desc=" TÁTICA">
    
    public static void getStunG(JTextField[] campoTexto) {
        campoTexto[0].setText("Stun Gun"); //jTextFieldNomeArma;
        campoTexto[1].setText("Dano elétrico: 0"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Stuna um inimigo por um turno"); //jTextFieldEspecialArma;

    }

    public static void getStunR(JTextField[] campoTexto) {
        campoTexto[0].setText("Stun Rod"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.5 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 5"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Pode stunar um inimigo por um turno"); //jTextFieldEspecialArma;

    }

    public static void getEscudo(JTextField[] campoTexto) {
        campoTexto[0].setText("Escudo"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.0 + FOR/10"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 3"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Pode stunar um inimigo por um turno"); //jTextFieldEspecialArma;

    }

    public static void getEscudo(JEditorPane campoTexto) {
        campoTexto.setText("<b>Escudo</b> <br>"
                + "<b>Poder de fogo:</b> 1.0 + FOR/10<br>"
                + "<b>Requisitos:</b> FOR 3<br>"
                + "<b>MODs:</b> Ponta, Empunhadeira<br>"
                + "<b>Especial:</b> Pode stunar um inimigo por um turno"); //jTextFieldEspecialArma;
    }
    
//</editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" USÁVEIS">
    
    //<editor-fold defaultstate="collapsed" desc=" GRANADAS">
    
    public static void getFrag(JTextField[] campoTexto) {
        campoTexto[0].setText("Frag"); //jTextFieldNomeArma;
        campoTexto[1].setText("10.0 em área"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("NADA"); //jTextFieldEspecialArma;

    }

    public static void getSemtex(JTextField[] campoTexto) {
        campoTexto[0].setText("Semtex"); //jTextFieldNomeArma;
        campoTexto[1].setText("10.0 em área"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Gruda em superficies"); //jTextFieldEspecialArma;

    }

    public static void getFlash(JTextField[] campoTexto) {
        campoTexto[0].setText("Flash"); //jTextFieldNomeArma;
        campoTexto[1].setText("0"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Cega por 1 ou até 2 rodadas os inimigos (HUMANOS)"); //jTextFieldEspecialArma;

    }

    public static void getIncendiaria(JTextField[] campoTexto) {
        campoTexto[0].setText("Incendiária"); //jTextFieldNomeArma;
        campoTexto[1].setText("5.0 em área"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Inimigos em chama tomarão dano contínuo por mais 2 rodadas, o fogo também se mantém por 2 rodadas."); //jTextFieldEspecialArma;

    }

    public static void getDistrativa(JTextField[] campoTexto) {
        campoTexto[0].setText("Distrativa"); //jTextFieldNomeArma;
        campoTexto[1].setText("0"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Distrai inimigos. Humanos -1 no dado. Infectados (níveis 1 e 2) -3 e -1 no dado respectivamente."); //jTextFieldEspecialArma;

    }

    public static void getVenenosa(JTextField[] campoTexto) {
        campoTexto[0].setText("Venenosa"); //jTextFieldNomeArma;
        campoTexto[1].setText("10.0 em área"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("O efeito do veneno se mantém por 2 rodadas. Humanos nessa área sem máscaras de gás tomarão o dano continuamente. Infectados (de níveis 1 e 2) perdem 1 de vantagem no dado por qualquer ação."); //jTextFieldEspecialArma;

    }

    //</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Tatica & Especial">
    
    public static void getFacaB(JTextField[] campoTexto) {
        campoTexto[0].setText("Faca balística"); //jTextFieldNomeArma;
        campoTexto[1].setText("1.0"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Crítico multiplicado por 10. Munição pode ser recuperada dos corpos."); //jTextFieldEspecialArma;

    }

    public static void getC4(JTextField[] campoTexto) {
        campoTexto[0].setText("C4"); //jTextFieldNomeArma;
        campoTexto[1].setText("20.0 em área"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1 / INT 5"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("Pode destruir locais, veículos, e obstruções / 1 rodada para arma, e 1 para detonar."); //jTextFieldEspecialArma;

    }

    public static void getClaymore(JTextField[] campoTexto) {
        campoTexto[0].setText("Claymore em área"); //jTextFieldNomeArma;
        campoTexto[1].setText("5.0 em área"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("FOR 1"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("-1 no dado para humanos / -3 para infectados (níveis 1 e 2) para se defender"); //jTextFieldEspecialArma;

    }

    public static void getGranadasQ(JTextField[] campoTexto) {
        campoTexto[0].setText("Granadas químicas"); //jTextFieldNomeArma;
        campoTexto[1].setText("VEREFICAR CLICKANDO NO BOTÃO ABAIXO DA IMAGEM"); //jTextFieldPoderArma;
        campoTexto[2].setText("N.E"); //jTextFieldCapacidadeArma;
        campoTexto[3].setText("N.E"); //jTextFieldRecargaArma;
        campoTexto[4].setText("Classe químico"); //jTextFieldRequisitoArma;
        campoTexto[5].setText("N.E"); //jTextFieldAcessorioArma;
        campoTexto[6].setText("VEREFICAR CLICKANDO NO BOTÃO ABAIXO DA IMAGEM"); //jTextFieldEspecialArma;

    }

    //</editor-fold> 
    //</editor-fold>    
    //<editor-fold defaultstate="collapsed" desc=" Listas">
    
    public static String[] getCano() {
        return listaCano;
    }

    public static String[] getMira() {
        return listaMira;
    }

    public static String[] getbarril() {
        return listaBarril;
    }

    public static String[] getParteInferior() {
        return listaParteInferior;
    }

    public static String[] getPunhoPente() {
        return listaPunhoPente;
    }

    //</editor-fold>
}
