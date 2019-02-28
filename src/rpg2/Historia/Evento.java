/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Historia;

import javax.swing.JOptionPane;

/**
 *
 * @author M4ESTRO
 */
public class Evento {

    //<editor-fold defaultstate="collapsed" desc=" EVENTOS ">
    static String[] ajudarSobrevivente = {"Selecione o evento", "Ajudar sobrevivente dando recurso", "Ajudar sobrevivente matando infectados ao redor dele", "Ajudar sobrevivente matando criminosos ao redor dele", "Ajudar sobrevivente escoltando-o de um ponto à outro"};
    static String[] defenderAssentamento = {"Selecione o evento", "Defender assentamento aliado contra infectados", "Defender assentamento aliado contra terroristas", "Defender assentamento aliado contra a Unreal"};
    static String[] eliminarHorda = {"Selecione o evento", "Eliminar horda de infectados", "Eliminar horda de aranhas gigantes", "Eliminar horda de cachorros infectados"};
    static String[] impedirCT = {"Selecione o evento", "Impedir criminosos/terroristas de destruir algo", "Impedir criminosos/terroristas de roubar algo", "Impedir pequeno grupo de criminosos/terroristas"};
    static String[] pegarRecurso = {"Selecione o evento", "Pegar recurso de uma loja próxima", "Pegar recurso de um caminhão próximo", "Pegar recurso de uma casa próxima"};

    static String[] todos = {"Selecione o evento", "Ajudar sobrevivente dando recurso", "Ajudar sobrevivente matando infectados ao redor dele", "Ajudar sobrevivente matando criminosos ao redor dele", "Ajudar sobrevivente escoltando-o de um ponto à outro", "Defender assentamento aliado contra infectados", "Defender assentamento aliado contra terroristas", "Defender assentamento aliado contra a Unreal", "Eliminar horda de infectados", "Eliminar horda de aranhas gigantes", "Eliminar horda de cachorros infectados", "Impedir criminosos/terroristas de destruir algo", "Impedir criminosos/terroristas de roubar algo", "Impedir pequeno grupo de criminosos/terroristas", "Pegar recurso de uma loja próxima", "Pegar recurso de um caminhão próximo", "Pegar recurso de uma casa próxima"};

    static String[] def = {"Selecione o evento"};
    
    
    public static String[] getAjudarSobrevivente() {
        return ajudarSobrevivente;
    }

    public static String[] getDefenderAssentamento() {
        return defenderAssentamento;
    }

    public static String[] getEliminarHorda() {
        return eliminarHorda;
    }

    public static String[] getImpedirCT() {
        return impedirCT;
    }

    public static String[] getPegarRecurso() {
        return pegarRecurso;
    }

    public static String[] getTodos() {
        return todos;
    }

    public static String[] getDefaultModel() {
        return def;
    }
    
//</editor-fold>
    public static int numEvento(int quantidadeDeEventos) {
        int evento = 0;

        if (quantidadeDeEventos >= 10) {

            do {
                evento = (int) (((Math.random() * 10) + 1) + ((Math.random() * 10) + 1));
            } while (evento > quantidadeDeEventos);

        } else {

            do {
                evento = (int) (((Math.random() * 10) + 1));
            } while (evento > quantidadeDeEventos);

        }

        return evento;
    }

    public static String eventoAleatorio(int opcao) {
        String eventoGerado = "";
        int evento = 0;
        switch (opcao) {
            case 1: // 1 - Ajudar Sobreviventes
                eventoGerado = ajudarSobrevivente[numEvento(4)];
                break;

            case 2: // 2 - Defender assentamento aliado
                eventoGerado = defenderAssentamento[numEvento(3)];
                break;

            case 3: // 3 - Eliminar horda
                eventoGerado = eliminarHorda[numEvento(3)];
                break;

            case 4: // 4 - Impedir criminosos/terroristas
                eventoGerado = impedirCT[numEvento(3)];
                break;

            case 5: // 5 - Pegar Recursos
                eventoGerado = pegarRecurso[numEvento(3)];
                break;

            case 6: // 6 - Todos
                eventoGerado = todos[numEvento(16)];
                break;

            default: // 0 - Selecione um tipo de evento
                JOptionPane.showMessageDialog(null, "Selecione um tipo de evento antes de usar o gerador");
        }
        return eventoGerado;
    }

}
