/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Historia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class Save {

    public static void salvar(JRadioButton[] principais, JRadioButton[] secundarias, JTextField[] campos) {

        try {

            String aux = JOptionPane.showInputDialog("Insira o nome do grupo: ");
            if (aux.equals("")) {
                JOptionPane.showMessageDialog(null, "Não é possível salvar o jogo sem o nome do grupo!");
                return;
            }

            PrintWriter out = new PrintWriter("Saves/"+aux + " - SAVE GAME.sav");

            //SALVANDO MISSOES PRINCIPAIS
            for (int i = 0; i < principais.length; i++) {

                if (principais[i].isSelected()) {
                    out.println("true");
                } else {
                    out.println("false");
                }
            }

            //SALVANDO MISSOES SECUNDARIAS
            for (int i = 0; i < secundarias.length; i++) {

                if (secundarias[i].isSelected()) {
                    out.println("true");
                } else {
                    out.println("false");
                }
            }

            //SALVANDO ATIVIDADES SECUNDARIAS
            for (int i = 0; i < campos.length; i++) {
                out.println(campos[i].getText());
            }

            out.close();
            JOptionPane.showMessageDialog(null, "Jogo salvo com sucesso!");
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar jogo\n" + erro.toString());
        }

    }

    public static void salvar(JRadioButton[] principais, JRadioButton[] secundarias, JTextField[] campos, String aux, int progresso, JTextField saveAtual, String ultimaModificacao) {

        try {

            PrintWriter out = new PrintWriter("Saves/" + aux + " - SAVE GAME.sav");

            //SALVANDO MISSOES PRINCIPAIS
            for (int i = 0; i < principais.length; i++) {

                if (principais[i].isSelected()) {
                    out.println("true");
                } else {
                    out.println("false");
                }
            }

            //SALVANDO MISSOES SECUNDARIAS
            for (int i = 0; i < secundarias.length; i++) {

                if (secundarias[i].isSelected()) {
                    out.println("true");
                } else {
                    out.println("false");
                }
            }

            //SALVANDO ATIVIDADES SECUNDARIAS
            for (int i = 0; i < campos.length; i++) {
                out.println(campos[i].getText());
            }
            
            //SALVANDO O PROGRESSO
            out.println(String.valueOf(progresso));
            saveAtual.setText(aux);
            
            //Salvando ultima modificacao
            out.println(ultimaModificacao);

            out.close();
            JOptionPane.showMessageDialog(null, "Jogo salvo com sucesso!");
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar jogo\n" + erro.toString());
        }

    }

    public static void carregar(JRadioButton[] principais, JRadioButton[] secundarias, JTextField[] campos) {

        try {

            String nome = JOptionPane.showInputDialog("Insira o nome do grupo: ");
            if (nome == null) {
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader("Saves/" + nome + " - SAVE GAME.sav"));

            //CARREGANDO MISSOES PRINCIPAIS
            for (int i = 0; i < principais.length; i++) {
                String teste = br.readLine();
                boolean ativado = Boolean.parseBoolean(teste);
                principais[i].setSelected(ativado);
            }

            //CARREGANDO MISSOES SECUNDARIAS
            for (int i = 0; i < secundarias.length; i++) {
                String teste = br.readLine();
                boolean ativado = Boolean.parseBoolean(teste);
                secundarias[i].setSelected(ativado);
            }

            //CARREGANDO ATIVIDADES SECUNDARIAS
            for (int i = 0; i < campos.length; i++) {
                campos[i].setText(br.readLine()); // 
            }

            br.close();

            JOptionPane.showMessageDialog(null, "Grupo: " + nome.toUpperCase() + " carregado com sucesso!");

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o save\n" + erro.toString());
        }

    }

    public static void carregar(JRadioButton[] principais, JRadioButton[] secundarias, JTextField[] campos, String nome, JProgressBar barra, JTextField saveAtual, JTextField UltimaModificacao) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("Saves/" + nome + " - SAVE GAME.sav"));

            //CARREGANDO MISSOES PRINCIPAIS
            for (int i = 0; i < principais.length; i++) {
                String teste = br.readLine();
                boolean ativado = Boolean.parseBoolean(teste);
                principais[i].setSelected(ativado);
            }

            //CARREGANDO MISSOES SECUNDARIAS
            for (int i = 0; i < secundarias.length; i++) {
                String teste = br.readLine();
                boolean ativado = Boolean.parseBoolean(teste);
                secundarias[i].setSelected(ativado);
            }

            //CARREGANDO ATIVIDADES SECUNDARIAS
            for (int i = 0; i < campos.length; i++) {
                campos[i].setText(br.readLine()); // 
            }
            
            //SALVANDO O PROGRESSO
            barra.setValue(Integer.parseInt(br.readLine()));
            
            //Pondo a data da ultima modificacao
            UltimaModificacao.setText(br.readLine());

            br.close();

            JOptionPane.showMessageDialog(null, "Grupo: " + nome.toUpperCase() + " carregado com sucesso!");
            saveAtual.setText(nome);

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o save\n" + erro.toString());
        }

    }

    public static void nova(JRadioButton[] principais, JRadioButton[] secundarias, JTextField[] campos, JProgressBar barra) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("Saves/default - SAVE GAME.sav"));

            //CARREGANDO MISSOES PRINCIPAIS
            for (int i = 0; i < principais.length; i++) {
                String teste = br.readLine();
                boolean ativado = Boolean.parseBoolean(teste);
                principais[i].setSelected(ativado);
            }

            //CARREGANDO MISSOES SECUNDARIAS
            for (int i = 0; i < secundarias.length; i++) {
                String teste = br.readLine();
                boolean ativado = Boolean.parseBoolean(teste);
                secundarias[i].setSelected(ativado);
            }

            //CARREGANDO ATIVIDADES SECUNDARIAS
            for (int i = 0; i < campos.length; i++) {
                campos[i].setText(br.readLine()); // 
            }
            
            //SALVANDO O PROGRESSO
            barra.setValue(0);

            br.close();

            JOptionPane.showMessageDialog(null, "Novo jogo carregado com sucesso!");

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao carregar novo jogo\n" + erro.toString());
        }

    }

}
