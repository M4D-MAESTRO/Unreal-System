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
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class ControleInimigo {

    public static int numeracaoAtual(boolean operacao) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Config/" + "Inimigo" + ".config"));
            int aux = Integer.parseInt(br.readLine());
            br.close();
            if (operacao) {
                aux++;
            } else {
                aux--;
            }

            PrintWriter out = new PrintWriter("Config/" + "Inimigo" + ".config");
            out.println(aux);
            out.close();
            return aux;

        } catch (IOException erro) {
            return -1;
        }
    }
    
    public static int getNumeracaoAtual() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Config/" + "controlador" + ".config"));
            int aux = Integer.parseInt(br.readLine());
            br.close();

            return aux;

        } catch (IOException erro) {
            return -1;
        }
    }
    
    public static int codigoDeControle() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Config/" + "controlador" + ".config"));
            int aux = Integer.parseInt(br.readLine());
            br.close();
            aux++;
            PrintWriter out = new PrintWriter("Config/" + "controlador" + ".config");
            out.println(aux);
            out.close();
            return aux;

        } catch (IOException erro) {
            return -1;
        }
    }

    public static void setCodigo(JTextField jTextFieldCod, InimigosOBJ inimigo, int numeracaoFicha){
        if (jTextFieldCod.getText().isEmpty()) {
            int cod = ControleInimigo.codigoDeControle();
            inimigo.setCod(cod);
            inimigo.setNumeracao(cod);
            numeracaoFicha = cod;
            jTextFieldCod.setText(String.valueOf(inimigo.getCod()));
        } else {
            inimigo.setCod(numeracaoFicha);
            inimigo.setNumeracao(numeracaoFicha);
        }
    }
    
}
