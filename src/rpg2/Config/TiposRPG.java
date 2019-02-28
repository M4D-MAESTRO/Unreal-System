/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Config;

import javax.swing.ImageIcon;

/**
 *
 * @author M4ESTRO
 */
public class TiposRPG {
    
    static String[] listaInimigosHumanos = {"Selecione o inimigo", "Bandidos", "Terroristas", "Mercenários", "Agentes da Unreal",
        "Caçadores da Unreal", "Combatentes da Unreal", "Pigsaw", "Os irmãos Jack", "Phantom", "The Clow", "Beta - 02", "Beta - 01", "Ômega", "Alfa"};
    static String[] listaInimigosMedievais = {"Selecione o inimigo", "Humano", "Elfo", "Orc", "Mago", "Clérico", "Paladino", "Berserk", "Bárbaro"};
    static String[] listaInimigosInfectados2 = {"Selecione o inimigo", "Aberração Demoniáca", "Infectado Aprimorado", "Demónio Alado", "Scorpion", "Lesma Negra", "Aranha gigante", "Chacal", "Besta"};
    static String[] listaInimigosInfectados3 = {"Selecione o inimigo", "The Hunter", "Barão Infernal", "Bocejo", "Ghost", "Cerberus", "Alfa (Versão Besta)"};
    static String[] listaInimigosInfectados4 = {"Selecione o inimigo", "Cerberus 2.0", "Besta Apocalíptica"};

    static ImageIcon icone = null;

    //<editor-fold defaultstate="collapsed" desc=" Listas">
    public static String[] getMedieval() {
        return listaInimigosMedievais;
    }

    public static String[] getInfectados2() {
        return listaInimigosInfectados2;
    }

    public static String[] getInfectados3() {
        return listaInimigosInfectados3;
    }

    public static String[] getInfectados4() {
        return listaInimigosInfectados4;
    }

    public static String[] getHumanos() {
        return listaInimigosHumanos;
    }

    
    //</editor-fold>
    
}
