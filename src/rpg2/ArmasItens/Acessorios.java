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
public class Acessorios {

    static String[] listaTipoAcessorios = {"Selecione o tipo de acessório", "Cano", "Mira", "Barril", "Parte Inferior", "Punho & Pente"};
    static String[] listaCano = {"Selecione a acessório", "Munição perfurante", "Silenciador"};
    static String[] listaMira = {"Selecione a acessório", "ACOG", "Red Dot", "Mira de zoom longo"};
    static String[] listaBarril = {"Selecione a acessório", "Mira laser"};
    static String[] listaInferior = {"Selecione a acessório", "Grip", "Escopeta embutida"};
    static String[] listaPente = {"Selecione a acessório", "Pente duplo", "Pente extendido"};

    public static String[] getListaCano() {
        return listaCano;
    }

    public static String[] getListaMira() {
        return listaMira;
    }

    public static String[] getListaBarril() {
        return listaBarril;
    }

    public static String[] getListaInferior() {
        return listaInferior;
    }

    public static String[] getListaPente() {
        return listaPente;
    }

    //<editor-fold defaultstate="collapsed" desc=" Cano">
    
    public static void getPerfurante(JTextField nome, JEditorPane desc) {
        nome.setText("Munição perfurante");
        desc.setContentType("text/html");
        desc.setText("<b>Munição Perfurante</b><br>"
                + "Aumenta o dano da arma em 0.5.<br>"
                + "Além disso, passa a perfurar inimigos podendo acertar mais de um com o mesmo projétil.");
    }

    public static void getSilenciador(JTextField nome, JEditorPane desc) {
        nome.setText("Silenciador");
        desc.setContentType("text/html");
        desc.setText("<b>Silenciador</b><br>"
                + "Reduz o barulho de sua arma, diminuindo assim as chances de ser detectado ao usa-la.");
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Mira">
    
    public static void getAcog(JTextField nome, JEditorPane desc) {
        nome.setText("ACOG");
        desc.setText("<b>Mira ACOG</b><br>"
                + "Aumenta a distância do tiro, diminuindo penalidade de distância média");
    }

    public static void getRed(JTextField nome, JEditorPane desc) {
        nome.setText("Red dot");
        desc.setText("<b>Mira Red dot</b><br>"
                + "Aumenta a precisão em curta distância, diminuindo"
                + "penalidades em curta distância.<br>"
                + "+1 de vantagem no dado contra inimigos perto");
    }

    public static void getMiraLonga(JTextField nome, JEditorPane desc) {
        nome.setText("Mira de zoom longo");
        desc.setText("<b>Mira de Zoom longo</b><br>"
                + "Aumenta a distância do tiro, diminuindo penalidade à longa distância.<br>"
                + "Você não receberá penalidades contra inimigos longe, porém receberá"
                + "penalidade para os próximos. -1 no dado contra inimigos perto");
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Barril">
    
    public static void getLaser(JTextField nome, JEditorPane desc) {
        nome.setText("Mira Laser");
        desc.setText("<b>Mira Laser</b><br>"
                + "Uma arma equipada com a mira laser, te impede de tirar erro crítico.<br>"
                + "Some +1 toda vez que tirar 1 no dado.");
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Inferior">
    
    public static void getGrip(JTextField nome, JEditorPane desc) {
        nome.setText("Grip");
        desc.setText("<b>Grip</b><br>"
                + "Aumenta a precisão com a qual você utiliza a arma.<br>"
                + "-1 no requisito FORÇA para usa-la.");
    }

    public static void getEscopetaA(JTextField nome, JEditorPane desc) {
        nome.setText("Escopeta acoplada");
        desc.setText("<b>Escopeta acoplada</b><br>"
                + "Permite você utilizar uma escopeta acoplada,"
                + "dando o dano da arma + 2.0 adicional.<br>"
                + "<b>OBS:</b> Esta modificação está disponível apenas para alguns fuzis.");
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Punho & Pente">
    
    
    public static void getPenteD(JTextField nome, JEditorPane desc) {
        nome.setText("Pente duplo");
        desc.setText("<b>Pende duplo</b><br>"
                + "Diminui o tempo de recarga de sua arma caso leve mais de 1 rodada"
                + "para recarrega-la. <br>"
                + "Caso leve apenas 1 rodada, sua arma será recarregada caso outras "
                + "4 rodadas (de aliados ou inimigos) passe");
    }
    
    public static void getPenteE(JTextField nome, JEditorPane desc) {
        nome.setText("Pente estendido");
        desc.setText("<b>Pente extendido</b><br>"
                + "Aumenta a capacidade de munição na arma em +5 projéteis");
    }
    
    //</editor-fold>

    public static void limpaTela(JTextField nome, JTextArea desc) {
        nome.setText("");
        desc.setText("");
    }
    
    public static void limpaTela(JTextField nome, JEditorPane desc) {
        nome.setText("");
        desc.setText("");
    }








}
