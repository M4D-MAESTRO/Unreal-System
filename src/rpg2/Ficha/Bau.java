/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class Bau {

    public static void salvar(JTextField nome, JTextArea bau) {

        try {

            PrintWriter out = new PrintWriter("Saves/Bau de " + nome.getText() + ".sav"); // jTextFieldNome

            String aux = bau.getText().replace("\n", "\t");
            out.println(aux);

            out.close();
            //JOptionPane.showMessageDialog(null, "Grupo salvo com sucesso!");
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar bau\n" + erro.toString());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Não há fichas carregadas!\n " + e.toString());
        }

    }

    public static void carregar(JTextField nome, JTextArea bau) {
        try {

            if (nome.getText().equals("")) {
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader("Saves/Bau de " + nome.getText() + ".sav"));

            String aux = br.readLine();
            bau.setText(aux.replace("\t", "\n"));

            br.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir \n" + erro.toString());
        }

    }

    /*
    public static void novoGrupo(JTextField[] campoTexto, JTextArea[] campoArea) {
       
        int numJogador = DadoJFrame.getNumFicha();
        campoTexto[0].setText("");
        for (int i = 0; i < numJogador; i++) {
            campoTexto[i+1].setText("");
        }

        for (int i = 0; i < numJogador; i++) {
            campoArea[i].setText("");
        }
    }*/
}
