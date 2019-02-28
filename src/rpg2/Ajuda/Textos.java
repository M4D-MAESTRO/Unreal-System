/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ajuda;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author M4ESTRO
 */
public class Textos {
    static ImageIcon imagem = null;
    
    private static String sobreStatus = "O status nada mais é do que o atributo que seu personagem tem, normalmente personagens das classes HACKER e MÉDICO possuem INTELIGÊNCIA mais elevada por utilizarem mais no seu tipo de gameplay, focando em tática e suporte respectivamente, enquanto isso, classes como FUZILEIRO NAVAL e FORÇA POLICIAL, foca em FORÇA por serem os combatentes.\nO status dão bônus e permitem que o usuário utilize determinada arma ou equipamento (claro que não conflitando com alguma desvantagem da classe), além disso, ao alcançar determinado nível com algumas habilidades, elas passarão a ter um bônus passivo.\n";
    
    public static String getSobreStatus() {
        return sobreStatus;
    }
    
    private static String level = "Indica o level (ou nível) do seu personagem atual, possibilitando ele assim, adquirir novas armas, técnicas e habilidades.";
    
    public static void getSobreLevel() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Level.png"));
        JOptionPane.showMessageDialog(null, level, "LEVEL", JOptionPane.PLAIN_MESSAGE, imagem);
        
    }
    
    private static String karma = "Indica a quantidade de nível em que seu karma se encontra, com exceção do HACKER que começa com 50 de karma, e o POLICIAL e MÉDICO que começa com 100, todos os outros começam com 70 de karma. \nO karma chega a no máximo 100 e não pode ser upada. \n"
            + "O karma aumenta de acordo com ações e atitudes boas, e diminuem de acordo com atitudes ruins, ou até mesmo falta de atitude. Normalmente ele aumenta e diminui de 10 em 10, mas isso pode variar.\n"
            + "ATENÇÃO: Se seu karma chegar abaixo de 20, haverá consequências devastadoras, que possivelmente te levará à morte. Em contrapartida, manter o karma acima de 80 te dará um bônus de +1 em CARISMA/SORTE.";
    
    public static void getSobreKarma() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Karma.png"));
        JOptionPane.showMessageDialog(null, karma, "KARMA", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String slot = "Indica a quantidade de espaços que você tem em uso e disponível. \nHá um limite de itens que pode ser mantido em um único slot, após esse limite, ele passará a ocupar outro espaço. \nPor exemplo: Sê pode carregar apenas 20x Munição (PISTOLA), caso você consiga mais 1, este ocupará outro espaço no inventário. \n"
            + "Você pode desbloquear novos slots upando o PESO (PES).";
    
    public static void getSobreSlot() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Slot.png"));
        JOptionPane.showMessageDialog(null, slot, "SLOT", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String vitalidade = "Representa o seu HP, gastar um ponto nesse status aumentará em +1 sua vitalidade total.\n"
            + "Dado também proporcional ao teste de coragem.\n"
            + "PASSIVA: Após VIT for maior a 15, você recupera seu HP por completo após descansar.";
    
    public static void getSobreVitalidade() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/04 - Vitalidade.png"));
        JOptionPane.showMessageDialog(null, vitalidade, "VITALIDADE", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String apetencia = "Representa a necessidade de se alimentar do seu personagem. Se cair abaixo de 20 você perderá 20% da VITALIDADE, e ficará com -1 de desvantagem no dado para todas as ações. \nAlém disso, se você continuar com a VITALIDADE abaixo de 20 e não se alimentar, em 6 horas você morrerá. \nO máximo de APE é 100 e ela não pode ser upada. Caso se alimente com a APE em 100, ela não irá aumentar para 110, porém o tempo para ela diminuir irá recomeçar.\n"
            + "A cada 1 hora você perde 10 de APE, caso esteja, FERIDO, EXAUSTO, ENVENENADO ou INFECTADO, você perderá 20.";
    
    public static void getSobreApetencia() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/05 - Apetencia.png"));
        JOptionPane.showMessageDialog(null, apetencia, "APETÊNCIA", JOptionPane.QUESTION_MESSAGE, imagem);
    }
    
    private static String especial = "Representa uma habilidade especial que toda classe tem, ela aumenta em +1 automaticamente após upar e não é possível investir nesta habilidade."
            + "\nAo alcançar 10, 20 e 30 de ESPECIAL, você desbloqueará as habilidades";
    
    public static void getSobreEspecial() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/06 - Especial.png"));
        JOptionPane.showMessageDialog(null, especial, "ESPECIAL", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String forca = "Aumenta o dano físico corporal.\n"
            + "Aumenta também a força com a qual você usa uma arma/equipamento, gerando assim, maior precisão.\n"
            + "A força também é proporcional ao dado de ataque";
    
    public static void getSobreForca() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/07 - Forca.png"));
        JOptionPane.showMessageDialog(null, forca, "FORÇA", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String stamina = "Representa a quantidade de stamina, consequentemente, a quantidade de ação em quase todas as situações (exceto ataque e QTE). \nInvestir nesse status aumentará também o tempo de sua corrida. \n"
            + "A stamina é proporcional ao dado de defesa e fuga (corrida).";
    
    public static void getSobreStamina() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/08 - Stamina.png"));
        JOptionPane.showMessageDialog(null, stamina, "STAMINA", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String resistencia = "Representa a sua defesa e resistência a infecções, veneno e outros compostos químicos, investir nesse status aumentará ainda mais essa defesa e resistências.\n"
            + "A resistência é proporcional ao dado de QTE e de teste de resistência.\n"
            + "Passiva: Após alcançar o RES maior que 15 você poderá somar +2 de vantagem no dado, ou, subir o nível do dado. Por exemplo: 1 dado D4 passará a ser D6; 1 dado D12 passará a ser D20.\n"
            + "Essa passiva dura 10 minutos, mas após esse tempo, você ficará exausto.";
    
    public static void getSobreResistencia() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/09 - Resistencia.png"));
        JOptionPane.showMessageDialog(null, resistencia, "RESITÊNCIA", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String percepcao = "Investir nesse status, aumentará sua percepção à itens, cenário e inimigos.\n"
            + "A percepção é proporcional ao dado de percepção e defesa furtiva.\n"
            + "PASSIVA: Após sua PER for maior que 15 e você ter enfrentado o mesmo tipo de inimigo e derrotando-o duas vezes, descubra automaticamente o ponto fraco dele.  ";
    
    public static void getSobrePercepcao() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/10 - percepcao.png"));
        JOptionPane.showMessageDialog(null, percepcao, "PERCEPÇÃO", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String inteligencia = "Investir nesse status aumentará a inteligência e sabedoria.\n"
            + "Aumenta também a eficiência das vacinas e itens de cura (na pessoa ministrada).\n"
            + "PASSIVA: Após alcançar INT maior que 15, ganhe um bônus ao achar itens (não conta para os comprados).";
    
    public static void getSobreInteligencia() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/11 - Inteligencia.png"));
        JOptionPane.showMessageDialog(null, inteligencia, "INTELIGÊNCIA", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String peso = "Investir nesse status aumentará a quantidade de slots que se pode ser carregado. A cada 10 pontos, adquira 1 slot (até um máximo de 10 slots).\nTambém, para cada 1 ponto investido nesta habilidade, aumenta em 1 o número de projéteis e componente de criação de um mesmo tipo e de que se pode ser carregado no mesmo slot"
            + "\nPASSIVA: Após alcançar PES maior que 15, adquira uma das habilidades a seguir de acordo com sua classe.";
    
    public static void getSobrePeso() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/12 - Peso.png"));
        JOptionPane.showMessageDialog(null, peso, "PESO", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    
    private static String carisma = "Investir nesse status aumentará sua influência em negociações e decisões, além da sua sorte.\n" +
"Dado proporcional ao teste de carisma e sorte.\n" +
"PASSIVA: Após sua carisma for maior que 15, ganhe um desconto de 30% em compras com qualquer vendedor.";
    
    public static void getSobreCarisma() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/13 - Carisma.png"));
        JOptionPane.showMessageDialog(null, carisma, "CARSIMA", JOptionPane.QUESTION_MESSAGE, imagem);
    }
    
    private static String quadro;
    
    public static void setQuadro(JTextArea area) {
        quadro = "Valor do atributo (STATUS) \t\tDADO\n"
                + "\nSTATUS menor do que 6 \t\tD4\n"
                + "STATUS maior que 6 E menor do que 10\tD6\n"
                + "STATUS maior que 10 E menor do que 12\tD10\n"
                + "STATUS maior que 12 E menor do que 15\tD12\n"
                + "STATUS maior do que 15\t\tD20";
        area.setText(quadro);
    }
    
    public static void setQuadroInt(JTextArea area) {
        quadro = "Item\t\t\tBônus\n"
                + "\nItens de cura\t\t\tUma pílula P\n"
                + "Munição\n"
                + "\nPISTOLA, SUB ou FUZIL: \t\t10 de munição DO MESMO TIPO\n"
                + "ESCOPETA ou SNIPER: \t\t5 de munição DO MESMO TIPO\n"
                + "MAGNUM: \t\t\t1 de munição DO MESMO TIPO\n"
                + "\nComponente;\n NÃO-RARO\n"
                + "QUÍMICO-EXPLOSIVO/MEDICINAL \nCONSTRUNÇÃO ou ELETRÓNICO: \t3 DO MESMO TIPO\n"
                + "\nRARO/ munição ESPECIAL: \t\t"
                + "Jogar um D6, caso tire um número PAR, receba um do mesmo tipo, caso tire ÍMPAR, não receba nada.";
        area.setText(quadro);
        
    }
    
    public static void setQuadroPes(JTextArea area) {
        quadro = "Classe \t\tHabilidade\n"
                + "B.H.C, F.N ou F.P \tAmmo-Slayer – Te permite carregar munição extra sem ocupar slot. Opte por, 50 de pistola, 30 de submetralhadora ou fuzil, 15 de escopeta ou 10 de magnum adicional\n"
                + "Hacker \t\tEletro-Slayer – Te permite carregar 10 componentes eletrônicos sem ocupar slot.\n"
                + "Engenheiro \t\tConstrução-Slayer – Te permite carregar 10 componentes de construção sem ocupar slot.\n"
                + "Químico \t	Químio-Slayer – Te permite carregar 10 componentes químico-explosivo sem ocupar slot.\n"
                + "Médico \t\tMedicinal-Slayer – Te permite carregar 10 componentes medicinal sem ocupar slot.";
        area.setText(quadro);
    }
    
    
    private static String debuffers = "Player debuffer são as desvantagens que um jogador pode acabar tendo durante a gameplay. Cada debuffer gera uma desvantagem única! \nUm player pode ter mais de um debuffer ativo por vez." ;
    public static void getSobreDebuffers() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/14 - Debuffers.png"));
        JOptionPane.showMessageDialog(null, debuffers, "DEBUFFERS", JOptionPane.PLAIN_MESSAGE, imagem);
    }
    public static void setQuadroDebuffer(JTextArea area){
        quadro = "Debuffer \tDescrição  \t\t\t\t\t\t\t\tSolução\n" +
"\nFerido \tQuando ferido, o player tomará 10% de dano adicional, além de se tornar o alvo preferencial dos inimigos infectados. \tUsar qualquer item de cura.\n" +
"\nExausto \tQuando exausto, o player não conseguirá realizar certas ações, com isso toma -1 no dado. \t\t\tDescansando por pelo menos 1 hora.\n" +
"\nInfectado \tUma vez infectado, em 1 ou 2 horas se o player não usar uma vacina anti-infecção, ele morre. \t\t\tUsar uma vacina anti-infecção.\n" +
"\nParanoico \tUma vez com paranoia, o player não saberá distinguir o real do imaginário, podendo realizar ações fora de contexto \n\te até hostis contra seus próprios aliados. \t\t\t\t\t\tA paranoia passa sozinha de acordo com o inimigo que a aplicou\n" +
"\nEnvenenado \tQuando envenenado o player tomará 10 de dano por rodada. \t\t\t\t\tSair da zona do veneno, ou, usar 1 item de cura M ou superior.\n" +
"\t\t\t\t\t\t\t\t\tOBS: Usar o item de cura irá apenas retirar o debuffer, NÃO restaurará seu sua vitalidade.";
        
        area.setText(quadro);
    }
    
    
    
    
}
