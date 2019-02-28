/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ajuda;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author M4ESTRO
 */
public class NPC {

    public static void setImagem(JLabel label, int opcao) {
        ImageIcon imagem = null;

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/General James Bianco.jpg"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cesar.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Major Luke.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Tenente Katie.jpg"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Marcelle.jpg"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Suzie.jpg"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Rodrigo.jpg"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/deafultNPC.jpg"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Lilian Turner.jpg"));
                break;
                
            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Marcus Turner.jpg"));
                break;    

            case 11:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Homem Misterioso.jpg"));
                break;
                
            case 12:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Homem Misterioso (ver 2).jpg"));
                break;
                
            case 13:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Homem Misterioso (ver 3).jpg"));
                break;  
                
                 case 14:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Lucifer.jpg"));
                break;   

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/deafultNPC.jpg"));
        }

        label.setIcon(imagem);
    }

    public static void cleanDesc(JTextArea desc) {
        desc.setText("");
    }

    public static void getGeneralJames(JTextArea desc) {
        desc.setText("O criador e líder da B.H.C (Biohazard Containment), General James Bianco serviu apenas alguns anos como fuzileiro naval nos E.U.A, descontente de como algumas coisas funcionava, ele saiu da força e criou sua própria organização mercenária, a Death Star Squad.\n"
                + "Com a morte de seu contraditório pai alguns anos depois, James junto à sua força mercenária para ir atrás do homem responsável por isso.\n"
                + "Após se deparar com o homem Christopher Marques e conflitarem por um tempo, Christopher consegue derrotar James e sua força mercenária, mas ao invés de eliminar James, Christopher pede por sua ajuda após reconhecer seu incrível talento como combatente e principalmente como comandante. James recusa inicialmente, mas Christopher com provas incontestáveis mostra quem seu pai realmente era e o motivo que levou Christopher a mata-lo, não só isso, ele mostra tudo que seu pai em cooperação com o governo fazia para beneficiar e apoiar as operações da Unreal.\n"
                + "Após isso, Christopher se une a força mercenária de James que por sua vez muda de objetivo, jurando caçar, eliminar e parar de vez a Unreal, mudando também seu nome para B.H.C.\n"
                + "Anos depois e com o recente falecimento de Christopher, James se encontra impossibilitado de continuar na linha de frente da batalha contra a Unreal, mas faz tudo o que pode para ajudar seus integrantes como um excelente comandante."
                + "\n\nIdade: Desconhecida."
                + "\nFiliação: B.H.C.");
    }

    public static void getCesar(JTextArea desc) {
        desc.setText("O fundador e líder de Roma, César não é um título! É de fato seu nome, César ou capitão César Romero, era capitão das forças policiais de Luisidiana, após o fracasso em proteger a cidade do surto viral, César junto a outros policiais e militares ergueram Roma, a cidadela santuário que protege e abriga outros civis e até militares tanto dos infectados, como de criminosos, terroristas e até da própria Unreal\n"
                + "César é sem dúvida um homem admirável e respeitado pelos membros da cidadela."
                + "\n\nIdade: 54 anos."
                + "\nFiliação: Roma (antes elite da força policial de Luisidiana)");
    }

    public static void getMajorLuke(JTextArea desc) {
        desc.setText("Major do corpo de fuzileiro navais e um dos poucos comandantes remanescente na linha de frente de Luisidiana, Luke Kandel é o braço direito de César, um major altamente condecorado que nunca fugiu de um campo de batalha, sua principal campanha por Roma é contra os terroristas e agentes da Unreal, além da segurança de Roma é claro."
                + "\n\nIdade: 48 anos."
                + "\nFiliação: Roma (antes, corpo de fuzileiros navais)");
    }

    public static void getTenenteKatie(JTextArea desc) {
        desc.setText("Tenente da força policial de Luisidiana, Katie Sanavia é sem dúvida uma mulher de muitos talentos, além de belíssima! Katie é o braço esquerdo de César ajudando-o a cuidar de Roma comandando os policiais e médicos locais.\n"
                + "Sua principal campanha é lidar com os infectados e criminosos, além dos cuidados com os feridos e doentes."
                + "\n\nIdade: 28 anos."
                + "\nFiliação: Roma (antes, força policial de Luisidiana)");
    }

    public static void getMarcelle(JTextArea desc) {
        desc.setText("A principal médica e cirurgiã de Roma, Marcelle não só é genial na arte médica como é uma excelente pessoa, visite-a sempre que precisar de um médico ou de suprimentos."
                + "\n\nIdade: 32 anos."
                + "\nFiliação: Roma (antes, Hospital Geral de Luisidiana)");
    }

    public static void getSuzie(JTextArea desc) {
        desc.setText("A irmã mais nova de Katie, Suzie é uma amante e fanática por armas, além de ser a responsável pelo armamento, arsenal e manutenção das armas e equipamentos, visite-a sempre que precisar de armas e outros suprimentos."
                + "\n\nIdade: 21 anos."
                + "\nFiliação: Roma (antes, Universidade Federal de Luisidiana)");
    }

    public static void getRodrigo(JTextArea desc) {
        desc.setText("Rodrigo Mendes é o responsável pela manutenção de veículos e das defesas de Roma, mestra na arte mecânica e elétrica, visite-o sempre que precisar de um veículos e certos suprimentos."
                + "\n\nIdade: 30 anos."
                + "\nFiliação: Roma (antes, Oficina Los hermanos)");
    }

    public static void getClaraTurner(JTextArea desc) {
        desc.setText("A filha de Marcus e Lilian Turner, Clara possuía apenas oito anos de idade quando foi encontrada pelo grupo de sobreviventes que o ajudaram a recuperar seu ursinho de pelúcia. \n"
                + "Infelizmente Clara estava infectada e não havia nada o que se pudesse fazer mais..."
                + "\n\nIdade: 8 anos."
                + "\nFiliação: Nenhuma");
    }

    public static void getLilianTurner(JTextArea desc) {
        desc.setText("Uma ótima advogada e mãe, Lilian Turner abandonou toda a sua vida para viver com seu marido Marcus Turner na cidade de Luisidiana na Polônia, antes mesmo do surto viral, seu marido já havia desaparecido sem deixar rastros, mesmo Lilian tentando de tudo para contatar a Unreal, ela não obteve sucesso algum.\n"
                + "Após o surto Lilian ainda se encontra a procura de seu marido, infelizmente as vezes buscamos algo e acabamos perdendo outras. Sua filha Clara Turner também desapareceu durante o surto..."
                + "\n\nIdade: 34 anos."
                + "\nFiliação: Nenhuma (antes, advogada em Nova York)");
    }

    public static void getMarcusTurner(JTextArea desc) {
        desc.setText("O sargento do corpo de fuzileiros navais, Marcus Turner, se voluntariou para trabalhar em experimentos militares da Unreal... Infelizmente não temos mais informações sobre eles e em que experimento ele se meteu.\n"
                + "Marcus era um bom homem, casado com Lilian Turner e pai de Clara Turner, Marcus sempre foi um exemplo, como militar e pai, um marido extremamente devo e bom, além claro de ser um militar bem condecorado, espero apenas que ele esteja bem..."
                + "\n\nIdade: 40 anos."
                + "\nFiliação: Desconhecida (antes, corpo de fuzileiros navais dos EUA)");
    }

    public static void getHomemMisterioso(JTextArea desc) {
        desc.setText("Não sabemos nem o nome, nem direito seu rosto, não sei como farei essa descrição, mas vou tentar...\n"
                + "Pouco se sabe sobre o Homem misterioso, apenas que tem fortes laços com a Unreal e suas criaturas que por sua vez não atacam, muito pelo contrário, até o defende, honestamente? Questiono se ele é de fato um homem..."
                + "\n\nIdade: Desconhecida."
                + "\nFiliação: Unreal System (antes, desconhecida)");
    }
    
    public static void getHomemMisterioso2(JTextArea desc) {
        desc.setText("Bom, após todos esses ocorridos podemos confirmar, este ''homem'', é na realidade um demónio, mas certamnete não é apenas isso. Ele aparenta ter muito mais habilidade, inteligencia e competência do que qualquer outra criatura vista até então. "
                + "\n\nIdade: Desconhecida."
                + "\nFiliação: Inferno (antes, Unreal System)");
    }
    
    public static void getHomemMisterioso3(JTextArea desc) {
        desc.setText("Baphomet, este é o seu verdadeiro nome. Seu plano de dominação e subjulgamento da raça humana foi posto em prática desde que com a corrupção francesa e a ganância católica destruiram os templários."
                + "Hoje, com o auxilio da corrupção Estatal e da queda moral do homem, Baphomet conseguiu com sucesso terminar a 'KATHEDRAL', uma maquina que a primeiro momento apenas desestabilizou o mundo, nossas mentes e almas e os juntou ao universo infernal, mas que agora está trazendo plenamente o inferno para a terra."
                + "\n\nIdade: Desconhecida."
                + "\nFiliação: Inferno (antes, Unreal System)");
    }
    
    public static void getLucifer(JTextArea desc) {
        desc.setText("Um dos lordes do inferno, portador da luz, o mais belo dentre todos.\nLúcifer, o arcanjo caído, está entre nós, após o sol que prendia Lúcifer no inferno ser desativado\n"
                + "O criador da corrupção, pai da mentira e mestre das serpentes."
                + "\n\nIdade: Desconhecida."
                + "\nFiliação: Inferno (antes, desconhecida");
    }
    
    

}
