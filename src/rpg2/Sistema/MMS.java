/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class MMS {

    public static void MMSAtivo(JTextField[] campoTexto, JTextArea[] campoArea, JComboBox[] comboBox) {
        try {
            for (int i = 0; i < comboBox.length; i++) {
                comboBox[i].setEnabled(true);
            }

            for (int i = 0; i < campoTexto.length; i++) {
                campoTexto[i].setEditable(true);
            }

            for (int i = 0; i < campoArea.length; i++) {
                campoArea[i].setEditable(true);
            }

        } catch (NullPointerException e) {
            System.out.println("Consertar " + e.toString());
        }

    }

    public static void MMSInativo(JTextField[] campoTexto, JTextArea[] campoArea, JComboBox[] comboBox) {
        try {
            for (int i = 0; i < comboBox.length; i++) {
                comboBox[i].setEnabled(false);
            }

            for (int i = 0; i < campoTexto.length; i++) {
                campoTexto[i].setEditable(false);
            }

            for (int i = 0; i < campoArea.length; i++) {
                campoArea[i].setEditable(false);
            }

        } catch (NullPointerException e) {
            System.out.println("Consertar " + e.toString());
        }

    }

}
