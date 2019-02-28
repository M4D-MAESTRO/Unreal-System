/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Historia;

import javax.swing.JTextArea;

/**
 *
 * @author M4ESTRO
 */
public class Atividades {

    public static void setDesc(JTextArea area) {
        area.setText("Nome da atividade	Descrição\n\n"
                + "Retomada.		Tomar assentamentos inimigos.\n"
                + "Serviço de escolta.	Escoltar veículos, pessoa ou grupo de pessoa.\n"
                + "Reconectando.		Estabelecer conexão com a B.H.C montando receptores em locais estratégicos.\n"
                + "Auxiliares do capeta.	Destruir laboratórios auxiliares da Unreal. - [Após o capítulo um apenas]\n"
                + "Guerra ao terror.	Tomar base de operações terroristas.\n"
                + "Selamento.		Buracos infernais para serem destruídos - [Após o capítulo dois apenas].\n"
                + "Desestabilização.	Entradas para as rupturas - [Após o capitulo dois apenas].\n"
                + "Sem paz.		Libertar almas do tormento da dor - [Após o capitulo dois apenas].\n"
                + "Sem luz.		Liberar luz no inferno da solidão - [Após o capitulo dois apenas].");
    }

    public static void setRecompensa(JTextArea area) {
        area.setText("Retomada: Munição, 1 pílula - P, 400xp, 1 assentamento aliado a mais. \n"
                + "\n"
                + "Serviço de escolta: Munição, granadas, 400xp.\n"
                + "\n"
                + "Auxiliar do capeta: 400xp, vacina anti-infecção, 5 componentes de cada tipo.\n"
                + "\n"
                + "Guerra ao terror: Munição, uma arma de fogo aleatória ou um equipamento, 400xp.\n"
                + "\n"
                + "Selamento: 500xp, vacina anti-infecção, 1 spray de primeiros socorros.\n"
                + "\n"
                + "Desestabilização: 800xp, uma arma de fogo especial.\n"
                + "\n"
                + "Reconectando: 600xp, 15 componentes eletrônicos.\n"
                + "\n"
                + "Extinção: 1000xp.\n"
                + "\n"
                + "Sem paz/luz: 600xp, 300 gold, +10 Karma + (Remoção de todo debuffer ativo).\n"
                + "");
    }

}
