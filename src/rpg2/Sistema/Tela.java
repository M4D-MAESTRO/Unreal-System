/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author M4ESTRO
 */
public class Tela {

    public static int getLargura() {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int larg = (int) tela.getWidth();
        return larg;
    }

    public static int getAltura() {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int alt = (int) tela.getHeight();
        return alt;
    }

    public static Dimension telaFull() {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        return tela;
    }

    public static void posCarregamento(boolean carregado, UnrealSystemRPGView dadoJFrame) {
        if (carregado) {
            dadoJFrame.setVisible(true);
        }
    }
}
