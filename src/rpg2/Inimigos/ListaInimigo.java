/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Inimigos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author 2017102465
 */
public class ListaInimigo implements Serializable{
    
     public static String[] carregarLista() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Config/" + "Listagem" + ".config"));
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
            PrintWriter out = new PrintWriter("Config/" + "Listagem" + ".config");
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
