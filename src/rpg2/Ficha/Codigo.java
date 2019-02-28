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

/**
 *
 * @author M4ESTRO
 */
public class Codigo {

    public static int codigoFichaToin() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Saves/" + "Control" + ".sav"));
            int aux = Integer.parseInt(br.readLine());
            br.close();
            aux++;
            PrintWriter out = new PrintWriter("Saves/" + "Control" + ".sav");
            out.println(aux);
            out.close();
            return aux;

        } catch (IOException erro) {
            return -1;
        }
    }

    public static String[] carregarLista() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Saves/" + "LISTA_TOIN" + ".sav"));
            String[] lista = br.lines().toArray(String[]::new);

            return lista;

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar lista\n" + erro.toString());
            return null;
        }
    }

    public static void carregarLista(JTextArea campo) {
        String[] lista = carregarLista();
        for (int i = 0; i < lista.length; i++) {
            campo.setText(lista[i].replace("\t", "\n"));
        }
    }

    public static void salvarLista(String nome) {
        try {
            boolean existe = false;

            String[] lista = carregarLista();
            PrintWriter out = new PrintWriter("Saves/" + "LISTA_TOIN" + ".sav");
            for (int i = 0; i < lista.length; i++) {
                out.append(lista[i]/* + " \t"*/);
                if (lista[i].contains(nome)) {
                    existe = true;
                }
            }

            if (!existe) {
                out.append(nome + " \t");
            }

            out.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar lista\n" + erro.toString());
        }
    }

}
