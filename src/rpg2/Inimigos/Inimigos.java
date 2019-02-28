/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Inimigos;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class Inimigos {

    static String[] listaInimigosHumanos = {"Selecione o inimigo", "Bandidos", "Psicopatas", "Terroristas", "Sádicos", "Mercenários", "Agentes da Unreal",
        "Caçadores da Unreal", "Combatentes da Unreal", "Pigsaw", "O Reanimador (ver 1)", "A Bruxa", "Os irmãos Jack", "Phantom", "The Clown", "Beta - 02", "Beta - 01", "Ômega", "Alfa"};
    static String[] listaInimigosInfectados1 = {"Selecione o inimigo", "Infectado", "Cachorro Infectado", "Infectado Maldito", "Caçadores Sombras", "Múmias Malditas", "Caçadores da Selva", "Sucubus"};
    static String[] listaInimigosInfectados2 = {"Selecione o inimigo", "Aberração Demoniáca", "Infectado Aprimorado", "Demónio Alado", "Scorpion", "Lesma Negra", "Aranha gigante", "Chacal", "Besta", "Corrompedora de Homens", "Demolidor", "O Carrasco", "Senhora dos Pesadelos"};
    static String[] listaInimigosInfectados3 = {"Selecione o inimigo", "The Hunter", "Barão Infernal", "Bocejo", "Ghost", "Cerberus", "O Reanimador (ver 2)", "Cilla"};
    static String[] listaInimigosInfectados4 = {"Selecione o inimigo", "Alfa Besta", "Cerberus 2.0", "Besta Apocalíptica"};
    static String[] listaInimigosAparicoes = {"Selecione o inimigo", "Cabeça demoniaca", "Aparições", "Manifestações", "Poltergeist", "Sr. Sorriso"};

    static String[] forcaInimiga = {"Selecione a força", "Força criminosa", "Força da Unreal", "Infectados nível 1", "Infectados nível 2", "Infectados nível 3", "Infectados nível 4"};
    static String[] forcaCriminosa = {"Selecione o inimigo", "Bandido", "Psicopatas", "Terrorista", "Sádicos", "Mercenário", "Pigsaw",
        "O Reanimador (ver 1)", "A Bruxa", "Os irmãos Jack", "Phantom", "The Clown"};

    static String[] forcaUnreal = {"Selecione o inimigo", "Agente da Unreal", "Caçador da Unreal", "Combatente da Unreal", "Beta - 02", "Beta - 01",
        "Ômega", "Alfa"};

    static String[] listaInimigosFull = {"Selecione o inimigo", "Bandidos", "Psicopatas", "Terroristas", "Sádicos", "Mercenários", "Agentes da Unreal", "Caçadores da Unreal", "Combatentes da Unreal",
        "Pigsaw", "O Reanimador (ver 1)", "A Bruxa", "Os irmãos Jack", "Phantom", "The Clown", "Beta - 02", "Beta - 01", "Ômega", "Alfa",
        "Infectado", "Cachorro Zumbi", "Infectado Maldito", "Caçadores Sombras", "Múmias Malditas", "Caçadores da Selva", "Sucubus",
        "Aberração Demoniáca", "Infectado Aprimorado", "Demónio Alado", "Scorpion", "Lesma Negra", "Aranha gigante", "Chacal", "Besta", "Corrompedora de Homens", "Demolidor", "O Carrasco", "Senhora dos Pesadelos",
        "The Hunter", "Barão Infernal", "Bocejo", "Ghost", "Cerberus", "O Reanimador (ver 2)", "Cilla", "Alfa (Versão Besta)", "Cerberus 2.0", "Besta Apocalíptica"
    };

    static ImageIcon icone = null;

    //<editor-fold defaultstate="collapsed" desc=" Listas">
    public static String[] getInfectados1() {
        return listaInimigosInfectados1;
    }

    public static String[] getInfectados2() {
        return listaInimigosInfectados2;
    }

    public static String[] getInfectados3() {
        return listaInimigosInfectados3;
    }

    public static String[] getInfectados4() {
        return listaInimigosInfectados4;
    }

    public static String[] getAparicoes() {
        return listaInimigosAparicoes;
    }

    public static String[] getHumanos() {
        return listaInimigosHumanos;
    }

    public static String[] getFullLista() {
        return listaInimigosFull;
    }

    public static String[] getListaForca() {
        return forcaInimiga;
    }

    public static String[] getForcaCriminosa() {
        return forcaCriminosa;
    }

    public static String[] getForcaUnreal() {
        return forcaUnreal;
    }

    //</editor-fold>
    static JTextField[] campoTextoAux = new JTextField[10];
    static JTextArea[] campoAreaAux = new JTextArea[2];

    public static String[] getForGuerra(Integer opcao) {
        String status[] = new String[4];

        //<editor-fold defaultstate="collapsed" desc=" - ">
        JTextField jTextFieldNomeInimigo = new JTextField();
        JTextField jTextFieldXPInimigo = new JTextField();
        JTextField jTextFieldGoldInimigo = new JTextField();
        JTextField jTextFieldLevelInimigo = new JTextField();
        JTextField jTextFieldHPInimigo = new JTextField();
        JTextField jTextFieldFORInimigo = new JTextField();
        JTextField jTextFieldSTMInimigo = new JTextField();
        JTextField jTextFieldRESInimigo = new JTextField();
        JTextField jTextFieldPERInimigo = new JTextField();
        JTextField jTextFieldINTInimigo = new JTextField();

        JTextArea jTextAreaDescInimigo = new JTextArea();
        JTextArea jTextAreaItensInimigo = new JTextArea();

        campoTextoAux[0] = jTextFieldNomeInimigo;
        campoTextoAux[1] = jTextFieldXPInimigo;
        campoTextoAux[2] = jTextFieldGoldInimigo;
        campoTextoAux[3] = jTextFieldLevelInimigo;
        campoTextoAux[4] = jTextFieldHPInimigo;
        campoTextoAux[5] = jTextFieldFORInimigo;
        campoTextoAux[6] = jTextFieldSTMInimigo;
        campoTextoAux[7] = jTextFieldRESInimigo;
        campoTextoAux[8] = jTextFieldPERInimigo;
        campoTextoAux[9] = jTextFieldINTInimigo;

        campoAreaAux[0] = jTextAreaDescInimigo;
        campoAreaAux[1] = jTextAreaItensInimigo;
        //</editor-fold>

        switch (opcao) {
            // <editor-fold defaultstate="collapsed" desc="Forca criminosa ">     
            case 1:
                getSobreBandido(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 2:
                getSobrePsicopatas(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 3:
                getSobreTerrorista(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 4:
                getSobreSadicos(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 5:
                getSobreMercenario(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 6:
                getSobrePigsaw(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 7:
                getSobreReanimador1(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 8:
                getSobreBruxa(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 9:
                getSobreIrmaosJack(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 10:
                getSobrePhantom(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 11:
                getSobreTheClown(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Força Unreal "> 
            case 12:
                getSobreAgenteUnreal(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 13:
                getSobreCacadorUnreal(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 14:
                getSobreCombatenteUnreal(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 15:
                getSobreBeta02(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 16:
                getSobreBeta01(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 17:
                getSobreOmega(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 18:
                getSobreAlfa(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;
            // </editor-fold>     

            // <editor-fold defaultstate="collapsed" desc="Infec 1 "> 
            case 19:
                getSobreInfectado(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 20:
                getSobreCachorroInfectado(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 21:
                getSobreInfectadoMaldito(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 22:
                getSobreCacadoresSombras(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 23:
                getSobreMumiasMalditas(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 24:
                getSobreCacadoresSelva(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 25:
                getSobreSucubus(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Infec 2 "> 
            case 26:
                getSobreAberracao(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 27:
                getSobreInfecAprimorado(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 28:
                getSobreDemoAlado(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 29:
                getSobreScorpion(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 30:
                getSobreLesmaNegra(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 31:
                getSobreAranhaG(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 32:
                getSobreChacal(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 33:
                getSobreBesta(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 34:
                getSobreCorrompedora(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 35:
                getSobreDemolidor(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 36:
                getSobreCarrasco(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 37:
                getSobreSenhoraPesadelos(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            //"Corrompedora de Homens", "Demolidor", "O Carrasco", "Senhora dos Pesadelos"};
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Infec 3 "> 
            case 38:
                getSobreTheHunter(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 39:
                getSobreBaraoInfernal(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 40:
                getSobreBocejo(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 41:
                getSobreGhost(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 42:
                getSobreCerberus(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 43:
                getSobreReanimador2(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 44:
                getSobreCilla(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Infec 4 "> 
            case 45:
                getSobreCerberus2(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 46:
                getSobreAlfaBesta(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;

            case 47:
                getSobreBestaApocaliptica(campoTextoAux, campoAreaAux);
                status = auxForGuerra(campoTextoAux, campoAreaAux, status);
                break;
            // </editor-fold>
        }

        return status;
    }

    private static String[] auxForGuerra(JTextField[] campoTexto, JTextArea[] campoArea, String status[]) {
        status[0] = campoTexto[0].getText();//Nome
        status[1] = campoTexto[4].getText();//Vit
        status[2] = campoTexto[5].getText();//Forca
        status[3] = campoTexto[7].getText();//Defesa

        return status;
    }

//<editor-fold defaultstate="collapsed" desc=" Humanos">
    public static void getSobreBandido(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Bandido"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 8"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 30"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("1+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("15"); //jTextFieldHPInimigo;
        campoTexto[5].setText("3"); //jTextFieldFORInimigo;
        campoTexto[6].setText("2"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("2"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("1"); //jTextFieldINTInimigo;
        campoArea[0].setText("Criminosos ordinários e patéticos que escaparam das prisões e delegacias durante o surto.\n"
                + "Eles ainda são perigosos, mas certamente há problemas maiores do que eles nesse momento"
                + "\n\nEquipamentos padrão: 1. Glock 17; \n\t              2. Faca.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA); 1 pírula – P.");// jTextAreaItensInimigo

    }

    public static void getSobrePsicopatas(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Psicopatas"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 15"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 40"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("3+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("30"); //jTextFieldHPInimigo;
        campoTexto[5].setText("5"); //jTextFieldFORInimigo;
        campoTexto[6].setText("2"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("2"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("1"); //jTextFieldINTInimigo;
        campoArea[0].setText("Perigosos psicopatas que andam com máscaras assustadoras, certamente fugiram de algum sanatório.\n"
                + "Burros, mas audáciosos e suícidas, nunca se sabe de onde eles sairão"
                + "\n\nEquipamentos padrão: 1. Besta; \n\t              2. Facas & Machadinhas; \n\t              3. Molotov.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P;\n"
                + "           Componente de criação (QUÍMICO-EXPLOSIVO).");// jTextAreaItensInimigo

    }

    public static void getSobreTerrorista(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Terrorista"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 20"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 30"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("5+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("30"); //jTextFieldHPInimigo;
        campoTexto[5].setText("7"); //jTextFieldFORInimigo;
        campoTexto[6].setText("5"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("4"); //jTextFieldRESInimigo;
        campoTexto[8].setText("3"); //jTextFieldPERInimigo;
        campoTexto[9].setText("2"); //jTextFieldINTInimigo;
        campoArea[0].setText("Integrante de um grupo extremista político, os terroristas só querem uma coisa, caos! \n"
                + "Parcialmente culpados por disseminar o vírus na cidade. Os terroristas são perigosos e portam armas e equipamentos medianos."
                + "\n\nEquipamentos padrão: 1. AK74M; \n\t              2. MP443 Frach.\n\t              3. Kukri.\n\t              4.Colete leve.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P;\n"
                + "           Componente de criação (QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR).");// jTextAreaItensInimigo

    }

    public static void getSobreSadicos(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Sádicos"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 80"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 100"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("5"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("6"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("2"); //jTextFieldINTInimigo;
        campoArea[0].setText("Mmebro do grupo dos psicopatas, um Sádico é assustadoramente perigoso. Grande e resistente, porta uma amendrontadora serra-elétrica\n"
                + "Parcialmente culpados por disseminar o vírus na cidade. Os terroristas são perigosos e portam armas e equipamentos medianos."
                + "\n\nEquipamentos padrão: 1. Serra-elétrica; \n");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA – FUZIL ou MAGNUM);\n"
                + "           2 pílula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR ou CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

    public static void getSobreMercenario(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Mercenário"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 30"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 150"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("6"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("6"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("Combatentes táticos e bem pago, os mercenários trabalham no geral para quem paga mais. "
                + "\nA incrível quantidade na cidade é sem dúvida comandada por The Clow, tenham cuidado, dentre os bandidos, psicopatas e terroristas, os mercenários são sem dúvidas os mais perigosos."
                + "\n\nEquipamentos padrão: 1. M16A4; \n\t              2. Colt-1911.\n\t              3. Kris.\n\t              4.Colete médio.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA – FUZIL ou MAGNUM);\n"
                + "           2 pílula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR ou CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

    public static void getSobreAgenteUnreal(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Agente da Unreal"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 45"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 100"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("40"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("8"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("8"); //jTextFieldRESInimigo;
        campoTexto[8].setText("6"); //jTextFieldPERInimigo;
        campoTexto[9].setText("5"); //jTextFieldINTInimigo;
        campoArea[0].setText("Apenas um membro de segurança da Unreal, apesar de ser do nível mais básico. Um agente da Unreal, independente da sua hirarquia não pode ser subestimado, fique atento!\n"
                + "O maior diferencial de qualquer agente ou membro da Unreal, são seu treinamento árduo e equipamentos de última geração"
                + "\n\nEquipamentos padrão: 1. Famas; \n\t              2. PMR30 c/ Mira Laser.\n\t              3. Stun rod.\n\t              4.Colete leve.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO).");// jTextAreaItensInimigo

    }

    public static void getSobreCacadorUnreal(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Caçador da Unreal"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 65"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 100"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("30"); //jTextFieldHPInimigo;
        campoTexto[5].setText("7"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("5"); //jTextFieldRESInimigo;
        campoTexto[8].setText("10"); //jTextFieldPERInimigo;
        campoTexto[9].setText("8"); //jTextFieldINTInimigo;
        campoArea[0].setText("Os caçadores da Unreal são especialistas em combate estratégico, silencioso e em rastrear pessoas.\n"
                + "Dispõem de um arsenal leve e versátil, além da sua capacidade infiltradora e equipamentos convenientes para o trabalho."
                + "\n\nEquipamentos padrão: 1. Scar-Light c/Silenciador e Mira de zoom longo; \n\t              2. Beretta M9 c/ Silenciador.\n\t              3. Bastão retrátil.\n\t              4.Colete leve.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR).");// jTextAreaItensInimigo

    }

    public static void getSobreCombatenteUnreal(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Combatente da Unreal"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 80"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 250"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("70"); //jTextFieldHPInimigo;
        campoTexto[5].setText("15"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("13"); //jTextFieldRESInimigo;
        campoTexto[8].setText("8"); //jTextFieldPERInimigo;
        campoTexto[9].setText("5"); //jTextFieldINTInimigo;
        campoArea[0].setText("Combatentes da Unreal é com certeza o inimigo humano mais forte e perigoso existente.\n"
                + "Eles dispõem de equipamentos medianos e um exo-esqueleto de combate extremamente moderno. São extremamente forte e resistentes e operam em esquadrões táticos. "
                + "\n\nEquipamentos padrão: 1. ACR c/ACOG; \n\t              2. MK3-Socom.\n\t              3. Soco Inglês.\n\t              4.Exo-esqueleto Médio.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA – FUZIL ou MAGNUM);\n"
                + "           2 pílula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR ou CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

    public static void getSobrePigsaw(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Pigsaw"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 250"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("80"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("6"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("6"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("2"); //jTextFieldINTInimigo;
        campoArea[0].setText("O líder nojento e asqueroso do Abatedouro, Pigsaw ao contrário do que muitos pensam devido sua aparência e atitudes, é apenas um homem com máscara de porco.\n"
                + "Muito grande e resistente para um homem, ele comanda os Carrascos e conflitava anteriormente com o The Clow.\n"
                + "Pigsaw já foi atuado por diversos motivos, mas sem dúvida as mais nojentas e asquerosas são: estupro, canibalismo, necrofilia e zoofilia."
                + "\n\nEquipamentos padrão: 1. Serra-elétrica; \n\t              2. Machadinha.\n\t              3. Kukri.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – G;\n"
                + "           Componente de criação (QUÍMICO-EXPLOSIVO e QUÍMICO-HOSPITALAR).");// jTextAreaItensInimigo

    }

    public static void getSobreReanimador1(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("O Reanimador (ver 1)"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 800"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 0"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("5"); //jTextFieldRESInimigo;
        campoTexto[8].setText("10"); //jTextFieldPERInimigo;
        campoTexto[9].setText("15"); //jTextFieldINTInimigo;
        campoArea[0].setText("Albert East, também conhecido como o 'Reanimador', ficou conhecido por suas teorias e contraditórios experimentos sobre trazer mortos de volta a vida\n"
                + "Albert ficou desaparecido após o surto viral..."
                + "\n\nEquipamentos padrão: 1. Mauser C96; \n\t              2. Foice.\n\t              3. O livro dos mortos.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – G;\n"
                + "           Componente de criação (QUÍMICO-EXPLOSIVO e QUÍMICO-HOSPITALAR).\n"
                + "1 - Mauser C96");// jTextAreaItensInimigo

    }

    public static void getSobreBruxa(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("A Bruxa"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 400"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("60"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("12"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("8"); //jTextFieldRESInimigo;
        campoTexto[8].setText("8"); //jTextFieldPERInimigo;
        campoTexto[9].setText("12"); //jTextFieldINTInimigo;
        campoArea[0].setText("Conhecimentos sobre essa 'Bruxa' foge da área inteligente da Unreal..."
                + "\n\nEquipamentos padrão: 1. Cajado; \n\t              2. Orbe teletransportador; \n\t              3. 2x Kris.\n\t");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – G;\n"
                + "           Componente de criação (QUÍMICO-EXPLOSIVO e QUÍMICO-HOSPITALAR)."
                + "1 - Kris"
                + "1 - Orbe teletransportador");// jTextAreaItensInimigo

    }

    public static void getSobreIrmaosJack(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Os irmãos Jack"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 150"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 100"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("90"); //jTextFieldHPInimigo;
        campoTexto[5].setText("12"); //jTextFieldFORInimigo;
        campoTexto[6].setText("8"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("4"); //jTextFieldRESInimigo;
        campoTexto[8].setText("6"); //jTextFieldPERInimigo;
        campoTexto[9].setText("3"); //jTextFieldINTInimigo;
        campoArea[0].setText("Responsáveis por distribuição e produção ilegal de bebidas, maconha e cocaína no interior, os irmãos Jack são apenas caipiras do campo, além de serem extremamente imbecis.\n"
                + "A verdadeira razão de ainda estarem vivo é o fato de The Clow achar mais lucrativo comprar as drogas deles do interior próximo do que vim importada.\n"
                + "Há também fortes evidencias de que os irmãos estariam ligados a uma seita satanista que realiza sacrifícios."
                + "\n\nEquipamentos padrão: 1. PP19; \n\t              2. Glock 17.\n\t              3. Pá;\n\t              4. Máscara de Gás..");//jTextAreaDescInimigo
        campoArea[1].setText("Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO).");// jTextAreaItensInimigo

    }

    public static void getSobrePhantom(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Phantom"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 300"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 1000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("75"); //jTextFieldHPInimigo;
        campoTexto[5].setText("20"); //jTextFieldFORInimigo;
        campoTexto[6].setText("12"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("8"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("Um dos principais líderes do grupo terrorista, pouco se sabe sobre Phantom, inclusive seu nome, ele é literalmente um fantasma...\n"
                + "As únicas informações plausíveis é que ele não é temido por seus soldados, e sim amado, ele é sem dúvida um ótimo atirador também."
                + "\n\nEquipamentos padrão: 1. G36C c/ ACOG, GRIP; \n\t              2. MK3-Socom.\n\t              3. Kukri;\n\t              4. Colete leve.");//jTextAreaDescInimigo
        campoArea[1].setText("Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO).");// jTextAreaItensInimigo

    }

    public static void getSobreTheClown(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("The Clown"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 1000"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 5000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("25+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("100"); //jTextFieldHPInimigo;
        campoTexto[5].setText("15"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("10"); //jTextFieldPERInimigo;
        campoTexto[9].setText("12"); //jTextFieldINTInimigo;
        campoArea[0].setText("O maior líder dos grupos criminosos do submundo e sem dúvidas um grande psicopata filho de uma puta (literalmente).\n"
                + "Robert Mills, ou The Clown, nasceu de uma prostituta que não quis abortar, foi criado no meio de um ambiente hostil onde sempre via sua mãe sofrendo abusos, claro, não demorou muito até ele também começar a sofrer o mesmo.\n"
                + "Aos 12 anos tirou a vida do cafetão de sua mãe com uma faca, e desde então com muita brutalidade e um humor macabro The Clown surgiu e ascendeu rumo à infâmia criminosa..."
                + "\n\nEquipamentos padrão: 1. M416 c/ Grip, Mira Laser; \n\t              2. Beretta M9;\n\t              3. Bastão de baseball;\n\t              4. Colete médio.");//jTextAreaDescInimigo
        campoArea[1].setText("Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "           5 pílula – P, M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR e de CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

    public static void getSobreBeta02(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Beta - 02"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 250"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 500"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("20+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("80"); //jTextFieldHPInimigo;
        campoTexto[5].setText("20"); //jTextFieldFORInimigo;
        campoTexto[6].setText("12"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("8"); //jTextFieldINTInimigo;
        campoArea[0].setText("Beta–02, é o terceiro membro do esquadrão A.Q.K.\n"
                + "Um combatente bem preciso equilibrado portando equipamentos medianos, Beta-02 também é reconhecido por seu conhecimento químico"
                + "\n\nEquipamentos padrão: 1. M14E c/ ACOG e GRIP; \n\t              2. Beretta M93R; \n\t              3. Kukri;\n\t              4. Lançadora Química;\n\t               5. Exo-esqueleto Leve.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA, MAGNUM ou FUZIL);\n"
                + "           3 pílula – P; 1 pílula – M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR e CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

    public static void getSobreBeta01(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Beta - 01"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 250"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 500"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("20+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("100"); //jTextFieldHPInimigo;
        campoTexto[5].setText("30"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("8"); //jTextFieldPERInimigo;
        campoTexto[9].setText("8"); //jTextFieldINTInimigo;
        campoArea[0].setText("Beta–01, é o segundo membro do esquadrão A.Q.K.\n"
                + "Robusto, forte, resistente e portando equipamentos pesados, é com certeza um supressor muito poderoso, mas o que ele ganha em força e resistência, ele com certeza perde em velocidade."
                + "\n\nEquipamentos padrão: 1. Giratória; \n\t              2. Ranger; \n\t              3. Soco inglês;\n\t              4. Exo-esqueleto pesado.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA, MAGNUM ou FUZIL);\n"
                + "           3 pílula – P; 1 pílula – M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR e CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

    public static void getSobreOmega(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Ômega"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 250"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 500"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("20+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("100"); //jTextFieldHPInimigo;
        campoTexto[5].setText("12"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("15"); //jTextFieldINTInimigo;
        campoArea[0].setText("Ômega, é o quarto membro do esquadrão A.Q.K.\nEmbora possa não parecer a princípio, Ômega é na verdade uma mulher, e extremamente rápida e habilidosa. \nSeu estilo de combate se assemelha muito aos caçadores da Unreal, talvez diferentemente dos outros membros, ela tenha sido uma caçadora, e não combatente."
                + "\n\nEquipamentos padrão: 1. 2x MP5K c/ silenciador, red-dot, mira laser e pente duplo; \n\t              2. PMR30; \n\t              3. Faca ocultada;\n\t              4. Exo-esqueleto de camuflagem.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA, MAGNUM ou FUZIL);\n"
                + "           3 pílula – P; 1 pílula – M;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR e CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

    public static void getSobreAlfa(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Alfa"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 1000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("25+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("100"); //jTextFieldHPInimigo;
        campoTexto[5].setText("15"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("13"); //jTextFieldPERInimigo;
        campoTexto[9].setText("15"); //jTextFieldINTInimigo;
        campoArea[0].setText("O líder do esquadrão A.Q.K (Advanced Quick Kill) um membro da elite da elite do grupo de combatentes da Unreal.\n"
                + "Pouco se sabe sobre Alfa, afinal, os membros da A.Q.K deixam de ter nomes e até vida.\n"
                + "A verdade é que Alfa e sua equipe jamais falharam em uma missão, ambos são extremamente perigosos e o melhor é não entrar no caminho deles."
                + "\n\nEquipamentos padrão: 1. F2000 c/ ACOG e Escopeta embutida; \n\t              2. Rex 412; \n\t              3. Stun rod;\n\t              4. Exo-esqueleto de Médio.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA, MAGNUM ou FUZIL);\n"
                + "           3 pílula – M; 1 pílula – G;\n"
                + "           Componente de criação (ELETRÓNICO, QUÍMICO-EXPLOSIVO, QUÍMICO-HOSPITALAR e CONSTRUÇÃO).");// jTextAreaItensInimigo

    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc=" Infectados Nível 1">
    public static void getSobreInfectado(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Infectado"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 3"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 25"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("1+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("5"); //jTextFieldHPInimigo;
        campoTexto[5].setText("5"); //jTextFieldFORInimigo;
        campoTexto[6].setText("1"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("0"); //jTextFieldINTInimigo;
        campoArea[0].setText("Os resultados mais básicos da catástrofe causada pela Unreal. Esses “infectados” já foram humanos um dia,"
                + "todos estão infectados com alguma espécie desconhecida de vírus, são lentos, estúpidos e frágeis, um tiro na cabeça parece mais do que o suficiente para deter um deles. "
                + "O maior problema é que sozinhos são patéticos, mais em horda...");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n           1 pírula – P");// jTextAreaItensInimigo

    }

    public static void getSobreCachorroInfectado(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Cachorro Infectado"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 5"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 5"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("1+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("8"); //jTextFieldHPInimigo;
        campoTexto[5].setText("5"); //jTextFieldFORInimigo;
        campoTexto[6].setText("3"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("4"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("0"); //jTextFieldINTInimigo;
        campoArea[0].setText("Infelizmente a infecção se espalhou até para os animais, cachorros são os mais comuns devido sua alta quantidade nas cidades."
                + "São ferozes, extremamente agressivos, mas pouco resistente. Ainda assim, todo cuidado é pouco..."
                + "O maior problema é que sozinhos são patéticos, mais em horda...");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – ESCOPETA);\n           1 pílula – P");// jTextAreaItensInimigo

    }

    public static void getSobreInfectadoMaldito(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Infectado Maldito"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 5"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 30"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("3+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("10"); //jTextFieldHPInimigo;
        campoTexto[5].setText("6"); //jTextFieldFORInimigo;
        campoTexto[6].setText("4"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("3"); //jTextFieldPERInimigo;
        campoTexto[9].setText("0"); //jTextFieldINTInimigo;
        campoArea[0].setText("Os Infectados Maldito, ou apenas, Malditos, são algum tipo de evolução dos infectados normais."
                + "Como sabemos, o crânio é a parte mais vulnerável de um infectado, mas os Malditos desenvolveram uma espécie de armadura orgânica para sua cabeça deixando-a invulnerável até que essa armadura seja rompida."
                + "Além disso se o Maldito morrer e sua armadura permanecer intacta, ela explodirá podendo ferir e até matar inimigos próximos..");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n          1 pílula – P;");// jTextAreaItensInimigo

    }

    public static void getSobreCacadoresSombras(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Caçadores das sombras"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 10"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 10"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("5+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("5"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("4"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("5"); //jTextFieldPERInimigo;
        campoTexto[9].setText("2"); //jTextFieldINTInimigo;
        campoArea[0].setText("Mais uma criação bizarra da Unreal, os caçadores das sombras não são nada além de um misto entre humanos, chimpanzés e é claro, o maldito vírus."
                + "São ferozes e mais agressivos do que os outros infectados, eles aparecem apenas durante a noite e tem uma movimentação bem mais veloz e inteligente do que os demais. \nTodo cuidado é pouco...");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);"
                + "\n          1 pílula – P, 1 pílula - M;");// jTextAreaItensInimigo

    }

    public static void getSobreMumiasMalditas(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Múmias Malditas"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 10"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 0"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("1+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("8"); //jTextFieldHPInimigo;
        campoTexto[5].setText("7"); //jTextFieldFORInimigo;
        campoTexto[6].setText("2"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("6"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("0"); //jTextFieldINTInimigo;
        campoArea[0].setText("[AS MÚMIAS POSSUÍDAS SÃO ENCONTRADAS APENAS DURANTE AS MISSÕES 22 E 23 SUBSTITUINDO OS INFECTADOS].");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          1 pílula – P;");// jTextAreaItensInimigo

    }

    public static void getSobreCacadoresSelva(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Caçadores da Selva"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 15"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 18"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("8+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("10"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("4"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("2"); //jTextFieldRESInimigo;
        campoTexto[8].setText("5"); //jTextFieldPERInimigo;
        campoTexto[9].setText("2"); //jTextFieldINTInimigo;
        campoArea[0].setText("Os caçadores das selva não são nada além de um misto entre humanos, cervos e é claro, o maldito vírus."
                + "São ferozes e mais agressivos do que os outros infectados, ficam predominantemente nas florestas e tem uma movimentação bem mais veloz e inteligente do que os demais. \nTodo cuidado é pouco...");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);"
                + "\n          1 pílula – P, 1 pílula - M;");// jTextAreaItensInimigo

    }

    public static void getSobreSucubus(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Sucubus"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 15"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 25"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("8+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("15"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("2"); //jTextFieldRESInimigo;
        campoTexto[8].setText("8"); //jTextFieldPERInimigo;
        campoTexto[9].setText("8"); //jTextFieldINTInimigo;
        campoArea[0].setText("Pouco sabemos sobre as Sucubus, apenas que nunca andam sozinhas e que aparentam obdecer algo maior do que elas mesmas");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);"
                + "\n          1 pílula – P, 1 pílula - M;");// jTextAreaItensInimigo

    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc=" Infectados Nível 2">
    public static void getSobreAberracao(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Aberração Demoníaca"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 25"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 80"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("12"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("15"); //jTextFieldRESInimigo;
        campoTexto[8].setText("10"); //jTextFieldPERInimigo;
        campoTexto[9].setText("5"); //jTextFieldINTInimigo;
        campoArea[0].setText("Certo, certo... Essa porra da medo! \nAs aberrações demoníacas estão muito presente em lugares fechados, e de preferência mas não obrigatoriamente, escuros. \nA B.H.C não consegue definir o que seria isso, não sabemos se é um infectado em processo de mutação, ou outra coisa. \nApenas sabemos que embora eles não sejam muito forte ou inteligente, não se deve arriscar a sorte, especialmente na escuridão.");//jTextAreaDescInimigo
        campoArea[1].setText("Itens: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL)\n           1 pírula – P\n           1 Componente químico (HOSPITALAR ou EXPLOSIVO).");// jTextAreaItensInimigo

    }

    public static void getSobreInfecAprimorado(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Infectado aprimorado"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 10"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 50"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("15"); //jTextFieldHPInimigo;
        campoTexto[5].setText("6"); //jTextFieldFORInimigo;
        campoTexto[6].setText("6"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("4"); //jTextFieldRESInimigo;
        campoTexto[8].setText("2"); //jTextFieldPERInimigo;
        campoTexto[9].setText("2"); //jTextFieldINTInimigo;
        campoArea[0].setText("Se iluda com sua aparência, o que os infectados aprimorados tem de feiura, eles tem de perigoso.\n"
                + "Mais rápidos e letais do que os infectados normais, eles costumam a aparecer após a noite, são mais inteligentes e também tem visão melhor a noite. Não se sabe como ou porque o vírus conseguiu se alastrar tanto a ponto de fazer tanto dano a um corpo humano, não se iluda, isto, já foi um homem.\n"
                + "Uma coisa é certa, cada vez mais concluímos que esse não é um vírus qualquer, não só isso, ele está longe de qualquer arma ou infecção biológica que o mundo já viu. Poderia mesmo um ser humano criar isso?");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P;\n"
                + "           1 Componente químico (HOSPITALAR ou EXPLOSIVO).");// jTextAreaItensInimigo
    }

    public static void getSobreDemoAlado(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Demónio alado"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 30"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 100"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("12"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("15"); //jTextFieldRESInimigo;
        campoTexto[8].setText("10"); //jTextFieldPERInimigo;
        campoTexto[9].setText("5"); //jTextFieldINTInimigo;
        campoArea[0].setText("Embora a B.H.C tenha registros de que a Unreal fez testes não só com humanos, mas com animais também, "
                + "eu pelo menos me recuso a acreditar de que este seja o caso. "
                + "O demónio alado é claramente uma espécie de morcego meio lobo demoníaco gigante, são ferozes, enxergam no escuro, afinal, "
                + "morcegos tem sonar, são rápidos e sua pele é bem resistente. "
                + "Se isso tudo já não fosse ruim, eles ainda costumam andar em duplas, ou até mesmo em grupos. "
                + "\nÉ necessário atenção e cuidado com lugares escuros e locais de florestas, montanhas e lugares fechados... \nAfinal, é onde eles costumam habitar...");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – P;\n"
                + "           1 Componente químico (HOSPITALAR ou EXPLOSIVO)..");// jTextAreaItensInimigo
    }

    public static void getSobreScorpion(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Scorpion"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 15"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 80"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("20"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("8"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("5"); //jTextFieldPERInimigo;
        campoTexto[9].setText("3"); //jTextFieldINTInimigo;
        campoArea[0].setText("Isso é mesmo uma experiências da Unreal? O que diabos seria esse vírus afinal?\n Isso se for de fato alguma espécie de vírus...\n"
                + "De qualquer forma os Scorpions são bastante resistentes e conseguem te perseguir por qualquer superfície.\nSem dúvida o seu maior diferencial é seu vírus super potente localizado em sua calda. Cuidado com ela....");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          1 pílula – P, M;\n"
                + "          1 Componente HOSPITALAR, ELETRÓNICO ou EXPLOSIVO..");// jTextAreaItensInimigo
    }

    public static void getSobreLesmaNegra(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Lesma Negra"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 40"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 130"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("20"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("6"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("3"); //jTextFieldPERInimigo;
        campoTexto[9].setText("1"); //jTextFieldINTInimigo;
        campoArea[0].setText("Mais um dos experimentos fracassados (ou não) da Unreal.\n"
                + "Um misto de lesma(?) com ser humano, essas criaturas possuem um bom ataque a distância além da capacidade de cegar temporariamente seus inimigos usando as lesmas que saem de seu corpo.");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          1 pílula – P, M;\n"
                + "          1 Componente HOSPITALAR ou EXPLOSIVO..");// jTextAreaItensInimigo
    }

    public static void getSobreAranhaG(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Aranha Gigante"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 30"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 100"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("30"); //jTextFieldHPInimigo;
        campoTexto[5].setText("12"); //jTextFieldFORInimigo;
        campoTexto[6].setText("8"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("5"); //jTextFieldPERInimigo;
        campoTexto[9].setText("2"); //jTextFieldINTInimigo;
        campoArea[0].setText("As aranhas gigantes, embora obviamente elas sejam grandes, ainda são bem frágeis, nós ainda não sabemos se o vírus afetou os animais, ou se esse é diretamente mais uma criação da Unreal");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          1 pílula – P, 1 pílula – M;\n"
                + "          1 Componente químico (HOSPITALAR, HACKEAMENTO, CONSTRUÇÃO e EXPLOSIVO).");// jTextAreaItensInimigo
    }

    public static void getSobreChacal(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Chacal"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 15"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 50"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("10+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("20"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("12"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("5"); //jTextFieldPERInimigo;
        campoTexto[9].setText("3"); //jTextFieldINTInimigo;
        campoArea[0].setText("Os chacais são mistos de seres humanos com chacais, são extremamente velozes, mas são bem tapados e frágeis, tem que ficar muito atento quando em grupos maiores pois suas presas e garras enormes rasgam profundamente a carne.");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          1 pílula – P, 1 pílula – M;\n");// jTextAreaItensInimigo
    }

    public static void getSobreBesta(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Besta"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 50"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 120"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("80"); //jTextFieldHPInimigo;
        campoTexto[5].setText("12"); //jTextFieldFORInimigo;
        campoTexto[6].setText("6"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("8"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("Pouco se sabe sobre as Bestas, apenas que são grande, resistentes, fortes e até inteligentes. Felizmente andam sempre isolados, ou no máximo em um trio, ainda assim, todo cuidado é pouco e o ideal é optar pela furtividade e estratégia.");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "          1 pílula – P, 1 pílula – M;\n"
                + "          1 Componente químico (HOSPITALAR, HACKEAMENTO, CONSTRUÇÃO e EXPLOSIVO).");// jTextAreaItensInimigo
    }

    public static void getSobreCorrompedora(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Corrompedora de homens"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 70"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 0"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("12"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("8"); //jTextFieldRESInimigo;
        campoTexto[8].setText("8"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("Líderes das Sucubus, as corrompedoras de homens são fatais contra oponentes de qualquer sexo, mas especialmente os masculinos");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "          1 pílula – P, 1 pílula – M;\n"
                + "          1 Componente químico (HOSPITALAR, HACKEAMENTO, CONSTRUÇÃO e EXPLOSIVO)."
                + "          1 essência da vida");// jTextAreaItensInimigo
    }

    public static void getSobreDemolidor(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Demolidor"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 50"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 150"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("60"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("4"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("12"); //jTextFieldRESInimigo;
        campoTexto[8].setText("5"); //jTextFieldPERInimigo;
        campoTexto[9].setText("5"); //jTextFieldINTInimigo;
        campoArea[0].setText("Demolidores são no geral homens que absuavam de anabolizantes, por algum motivo o vírus reagiu a isso e os deixaram, literalmente, monstruosos");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "          1 pílula – M, 1 pílula – G;\n"
                + "          1 Componente químico (HOSPITALAR, HACKEAMENTO, CONSTRUÇÃO e EXPLOSIVO).");// jTextAreaItensInimigo
    }

    public static void getSobreCarrasco(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("O Carrasco"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 100"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 150"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("8"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("Os carrascos são experimentos perigosos da Unreal que juntaram em um corpo meio metálico e com garras um demolidor");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "          1 pílula – P, 1 pílula – M;\n"
                + "          1 Componente químico (HOSPITALAR, HACKEAMENTO, CONSTRUÇÃO e EXPLOSIVO).");// jTextAreaItensInimigo
    }

    public static void getSobreSenhoraPesadelos(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Senhora dos Pesadelos"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 200"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 300"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("15+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("30"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("4"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("15"); //jTextFieldINTInimigo;
        campoArea[0].setText("Infelizmente não temos conhecimentos sobre... Isso.. Mas certamente não é humano. Apenas sabemos que seu poder está explícito em seu nome... Senhora dos Pesadelos");// jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "          1 pílula – P, 1 pílula – M;\n"
                + "          1 Componente químico (HOSPITALAR, HACKEAMENTO, CONSTRUÇÃO e EXPLOSIVO)."
                + "          1 MP412-Rex");// jTextAreaItensInimigo
    }

    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc=" Infectados Nível 3">
    public static void getSobreTheHunter(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("The Hunter"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: ???"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: ???"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("50+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("300"); //jTextFieldHPInimigo;
        campoTexto[5].setText("30"); //jTextFieldFORInimigo;
        campoTexto[6].setText("20"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("20"); //jTextFieldRESInimigo;
        campoTexto[8].setText("25"); //jTextFieldPERInimigo;
        campoTexto[9].setText("15"); //jTextFieldINTInimigo;
        campoArea[0].setText("Rápido, forte, inteligente, um monstro... Um demónio!\n"
                + "Pouco se sabe sobre o Hunter. Apenas que um homem não é páreo para ele, na verdade, talvez nem um exército."
                + "Eles parecem ser uma espécie de infectados com consciência, de alguma forma é muito discutido sobre o fato deles atacarem pessoas cruéis ignorando as de boa índole, os Huntes acabaram sendo conhecido como Vingadores por conta disso, mesmo embora ainda seja desconhecido como ele identifica esses tipos de coisa. O único problema é que uma vez em combate, eles parecem não distinguir quem é bom ou mau, fazendo com que todos se tornem alvos. O Hunter porta uma espada gigantesca que mais parece uma barra de ferro, além disso, seu corpo é totalmente protegido por uma espécie de armadura de ferro"
                + "A melhor forma de combater um Hunter é fugindo dele, e a melhor forma para isso, é tomando cuidado com suas atitudes.");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: ???");// jTextAreaItensInimigo

    }

    public static void getSobreBaraoInfernal(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Barão Infernal"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 2000"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 1000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("35+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("200"); //jTextFieldHPInimigo;
        campoTexto[5].setText("20"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("20"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("Grande, resistente, forte e incrivelmente poderoso, esse demónio também conhecido como Barão Infernal é com certeza o inimigo mais poderoso já visto até então. "
                + "\nNão estávamos preparados para isso...");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           5 pírula – M;\n"
                + "           1 pírula – G;\n"
                + "           5 Componente químico HOSPITALAR.\n"
                + "           1 Componente químico EXPLOSIVO.\n"
                + "           5 Componente químico ELETRÓNICOS.");// jTextAreaItensInimigo

    }

    public static void getSobreBocejo(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Cobra gigante (Bocejo)"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 1500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 1000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("20+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("200"); //jTextFieldHPInimigo;
        campoTexto[5].setText("20"); //jTextFieldFORInimigo;
        campoTexto[6].setText("12"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("14"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("5"); //jTextFieldINTInimigo;
        campoArea[0].setText("Esse bicho gigante, nojento e asqueroso, maldito desgraçado e claro, criado pela merda da Unreal, pode literalmente te comer sem muita dificuldade com um simples “Bocejo”.\n"
                + "A Unreal parece ter totalmente o controle sobre essa coisa, ou é o que parece...");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          3 pílula – M;\n"
                + "          1 pílula – G;\n"
                + "          3 Componente químico HOSPITALAR.\n"
                + "          1 Componente químico EXPLOSIVO.\n"
                + "          3 Componente de CONSTRUÇÃO.");// jTextAreaItensInimigo

    }

    public static void getSobreGhost(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Ghost"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 2000"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 2000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("25+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("150"); //jTextFieldHPInimigo;
        campoTexto[5].setText("15"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("15"); //jTextFieldINTInimigo;
        campoArea[0].setText("Honestamente eu não sei se Ghost é um experimento com o vírus demoníaco, ou se ele é propriamente um demónio, tudo que sei é que ele parece conseguir realizar perfeitamente uma ponte entre a Terra e o inferno.\n"
                + "Usando até mesmo de telepatia e tele transporte para cometer assassinatos, Ghost deve ser enfrentado com extrema cautela.");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "          3 pílula – M;\n"
                + "          1 pílula – G;\n"
                + "          3 Componente químico HOSPITALAR.\n"
                + "          1 Componente químico EXPLOSIVO.\n"
                + "          3 Componente de CONSTRUÇÃO.\n"
                + "          5 Componentes ELETRÓNICOS de HACKEAMENTO");// jTextAreaItensInimigo

    }

    public static void getSobreCerberus(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Cerberus"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 2500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 3000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("30+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("300"); //jTextFieldHPInimigo;
        campoTexto[5].setText("20"); //jTextFieldFORInimigo;
        campoTexto[6].setText("10"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("18"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("O guardião do portão do inferno, o cão de três cabeças, Cerberus");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          5 pílula – M;\n"
                + "          3 pílula – G;\n"
                + "          10 Componente químico HOSPITALAR.\n"
                + "          10 Componente químico EXPLOSIVO.\n"
                + "          10 Componente de CONSTRUÇÃO.");// jTextAreaItensInimigo

    }

    public static void getSobreReanimador2(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("O Reanimador (ver2)"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 3500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 3000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("30+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("150"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("14"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("10"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("25"); //jTextFieldINTInimigo;
        campoArea[0].setText("Albert retornou, mas desta vez se encontra em uma forma e essência ainda mais demoníaca do que já fora um dia");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "          5 pílula – M;\n"
                + "          3 pílula – G;\n"
                + "          10 Componente químico HOSPITALAR.\n"
                + "          10 Componente químico EXPLOSIVO.\n"
                + "          10 Componente de CONSTRUÇÃO."
                + "          TAURUS 44");// jTextAreaItensInimigo

    }

    public static void getSobreCilla(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Cilla"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 700"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 300"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("12+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("80"); //jTextFieldHPInimigo;
        campoTexto[5].setText("10"); //jTextFieldFORInimigo;
        campoTexto[6].setText("6"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("6"); //jTextFieldRESInimigo;
        campoTexto[8].setText("6"); //jTextFieldPERInimigo;
        campoTexto[9].setText("5"); //jTextFieldINTInimigo;
        campoArea[0].setText("Uma experiência da Unreal que consistiu em juntar uma mulher ao corpo molusco, bem como ao do que parece ser enguias. Cilla vive nas águas do Lago das Lágrimas, um rio subterrâneo que compreende grande parte do centro de Luisidiana. Cilla é rápida e astuta, está disposta a matar qualquer um que adentre seu território");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA ou FUZIL);\n"
                + "           1 pírula – G;\n"
                + "           Componente de criação (QUÍMICO-EXPLOSIVO e QUÍMICO-HOSPITALAR)");// jTextAreaItensInimigo

    }

    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc=" Infectados Nível 4">
    public static void getSobreCerberus2(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Cerberus 2.0"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 3500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 2000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("35+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("400"); //jTextFieldHPInimigo;
        campoTexto[5].setText("25"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("20"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("10"); //jTextFieldINTInimigo;
        campoArea[0].setText("Após ser derrotado, Cerberus assumiu uma forma ainda mais assustadora e diabólica, agora de aparência humanoide e de pé, ele parece mais resistente, rápido e perigoso");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "\n          5 pílula – M;"
                + "\n          3 pílula – G;"
                + "\n          10 Componente químico HOSPITALAR."
                + "\n          10 Componente químico EXPLOSIVO."
                + "\n          10 Componente de CONSTRUÇÃO.");// jTextAreaItensInimigo

    }

    public static void getSobreAlfaBesta(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Alfa Besta"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 3500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 2000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("35+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("300"); //jTextFieldHPInimigo;
        campoTexto[5].setText("20"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("15"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("8"); //jTextFieldINTInimigo;
        campoArea[0].setText("Após ser derrotado, Alfa assumiu uma forma  diabólica, ele parece mais resistente, rápido e perigoso");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "\n          5 pílula – M;"
                + "\n          3 pílula – G;"
                + "\n          10 Componente químico HOSPITALAR."
                + "\n          10 Componente químico EXPLOSIVO."
                + "\n          10 Componente de CONSTRUÇÃO.");// jTextAreaItensInimigo

    }

    public static void getSobreBestaApocaliptica(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Besta Apocalíptica"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 3500"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 2000"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("35+"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("300"); //jTextFieldHPInimigo;
        campoTexto[5].setText("20"); //jTextFieldFORInimigo;
        campoTexto[6].setText("15"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("15"); //jTextFieldRESInimigo;
        campoTexto[8].setText("15"); //jTextFieldPERInimigo;
        campoTexto[9].setText("8"); //jTextFieldINTInimigo;
        campoArea[0].setText("Após ser derrotado, Alfa assumiu uma forma  diabólica, ele parece mais resistente, rápido e perigoso");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "\n          5 pílula – M;"
                + "\n          3 pílula – G;"
                + "\n          10 Componente químico HOSPITALAR."
                + "\n          10 Componente químico EXPLOSIVO."
                + "\n          10 Componente de CONSTRUÇÃO.");// jTextAreaItensInimigo

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Apaicoes">
    public static void getSobreCabecaDemoniaca(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Cabeça Demoníaca"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 1000"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 500"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("N.E"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("N.E"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("N.E"); //jTextFieldPERInimigo;
        campoTexto[9].setText("N.E"); //jTextFieldINTInimigo;
        campoArea[0].setText("Uma cabeça demoníaca gigante que percebe e devora as pessoas");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "\n          2 pílula – M;"
                + "\n          3 pílula – G;");// jTextAreaItensInimigo
    }

    public static void getSobreAparicoes(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Aparições"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 50"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 0"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("N.E"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("30"); //jTextFieldHPInimigo;
        campoTexto[5].setText("5"); //jTextFieldFORInimigo;
        campoTexto[6].setText("N.E"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("N.E"); //jTextFieldPERInimigo;
        campoTexto[9].setText("N.E"); //jTextFieldINTInimigo;
        campoArea[0].setText("Aparições fantasmagóricas que atormentam as pessoas e sugam suas almas");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: 1 pílula – M");// jTextAreaItensInimigo
    }

    public static void getSobreManifestacoes(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Manifestações"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 80"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 0"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("N.E"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("30"); //jTextFieldHPInimigo;
        campoTexto[5].setText("N.E"); //jTextFieldFORInimigo;
        campoTexto[6].setText("N.E"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("N.E"); //jTextFieldPERInimigo;
        campoTexto[9].setText("N.E"); //jTextFieldINTInimigo;
        campoArea[0].setText("Manifestações fantasmagóricas e demoniacas que impedem passagens e bloqueia certas localizações.");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: N.E");// jTextAreaItensInimigo
    }

    public static void getSobrePoltergeist(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Poltergeist"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 1000"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 0"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("N.E"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("50"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("N.E"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("N.E"); //jTextFieldPERInimigo;
        campoTexto[9].setText("N.E"); //jTextFieldINTInimigo;
        campoArea[0].setText("A personificação das manifestações e/ou aparições em ''carne e osso''.");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "\n          1 pílula – G;");// jTextAreaItensInimigo
    }

    public static void getSobreSorriso(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText("Senhores do Sorriso"); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: 50"); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: 0"); //jTextFieldGoldInimigo;
        campoTexto[3].setText("N.E"); //jTextFieldLevelInimigo;
        campoTexto[4].setText("20"); //jTextFieldHPInimigo;
        campoTexto[5].setText("8"); //jTextFieldFORInimigo;
        campoTexto[6].setText("4"); //jTextFieldSTMInimigo;
        campoTexto[7].setText("0"); //jTextFieldRESInimigo;
        campoTexto[8].setText("10"); //jTextFieldPERInimigo;
        campoTexto[9].setText("0"); //jTextFieldINTInimigo;
        campoArea[0].setText("Os senhores do sorriso nada mais são do que pessoas com graves transtornos mentais que foram infectados.");//jTextAreaDescInimigo
        campoArea[1].setText("ITENS: Munição (PISTOLA – SUBMETRALHADORA – ESCOPETA - MAGNUM ou FUZIL);\n"
                + "\n          1 pílula – P, M;");// jTextAreaItensInimigo
    }

    //</editor-fold>
    public static void limpaTela(JTextField[] campoTexto, JTextArea[] campoArea) {
        campoTexto[0].setText(""); //jTextFieldNomeInimigo;
        campoTexto[1].setText("XP máximo: "); //jTextFieldXPInimigo;
        campoTexto[2].setText("GOLD máximo: "); //jTextFieldGoldInimigo;
        campoTexto[3].setText(""); //jTextFieldLevelInimigo;
        campoTexto[4].setText(""); //jTextFieldHPInimigo;
        campoTexto[5].setText(""); //jTextFieldFORInimigo;
        campoTexto[6].setText(""); //jTextFieldSTMInimigo;
        campoTexto[7].setText(""); //jTextFieldRESInimigo;
        campoTexto[8].setText(""); //jTextFieldPERInimigo;
        campoTexto[9].setText(""); //jTextFieldINTInimigo;
        campoArea[0].setText("");// jTextAreaDescInimigo
        campoArea[1].setText("Itens: ");// jTextAreaItensInimigo
    }

    //<editor-fold defaultstate="collapsed" desc=" Vantagens">
    public static void getVantagensHumano(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Bandido.png"));
                JOptionPane.showMessageDialog(null, "Nenhuma\n\n", "VANTAGENS - BANDIDOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Psicopatas.png"));
                JOptionPane.showMessageDialog(null, "Insanidade – Psicopatas nada temem.", "VANTAGENS - PSICOPATAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Terrorista.png"));
                JOptionPane.showMessageDialog(null, "Homem bomba – Todos explosivos tem efeito incendiário.", "VANTAGENS - TERRORISTAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Sadico.jpg"));
                JOptionPane.showMessageDialog(null, "Massacre – O sádico corre para cima do inimigo impiedosamente com sua serra-elétrica, se acertado, \na vitalidade do inimigo será reduzida em 90%", "VANTAGENS - SÁDICOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Mercenario.png"));
                JOptionPane.showMessageDialog(null, "Supressor – Inimigos recuados devido ao ataque de um mercenário recebem uma penalização de -1 no dado para as ações defensivas e de ataque. \n\nLinha de frente – Mercenários não podem ser intimidados e nunca ficam assustados. \n\nExploit – Mercenário tem acesso à certos exploits: scanner, hackeamento de ambiente civil e Apagão Local.", "VANTAGENS - MERCENÁRIOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Agente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Sonar – Uma vez a cada 3 rodadas o agente da Unreal pode usar seu sonar para tentar detectar inimigos próximos.\n\nNão tomam desvantagens no escuro, além de enxergar perfeitamente na mesma.", "VANTAGENS - AGENTE DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Cacador da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Combate veloz – Pode realizar dois ataques corporais, seja no mesmo inimigo, ou em outro próximo.\n\nA noite é minha amiga – +1 de vantagem em ATAQUE e DEFESA steath.", "VANTAGENS - CAÇADOR DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Combatente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Sonar – Uma vez a cada 3 rodadas o combatente da Unreal pode usar seu sonar para tentar detectar inimigos próximos.\n\nCombatente moderno – +1 de vantagem no dado para corrida, esquiva e QTE.\n\nExo-esqueleto – Ao fim da rodada de cada inimigo, há 30% de chances de ganhar uma rodada extra.", "VANTAGENS - COMBATENTE DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Pigsaw.jpg"));
                JOptionPane.showMessageDialog(null, "Serra fatal – A cada 3 rodadas Pigsaw atacará com sua serra-elétrica, inimigos acertados por ela terá seu HP reduzido a ZERO.\n\nLutador – Mais 6.5 de dano em ataques físicos.\n\nZumbi – Pigsaw aplica uma poderosa mordida (que causa 10 de dano ignorando a DEFESA, também aplica efeito de sangramento), ele também recupera 10 de HP ao executar com sucesso a mordida.", "VANTAGENS - PIGSAW", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - O Reanimador ver1.jpg"));
                JOptionPane.showMessageDialog(null, "Invocação dos mortos – Albert invoca para lutar ao seu lado 3 infectados armados com armas brancas.\n\nConsumo – Albert consome um infectado invocado para restaurar 5 pontos de vitalidade.\n\nTrevas – Albert lança uma bola de fogo negro que queima durante 2 rodadas o inimigo antigido", "VANTAGENS - O REANIMADOR", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - A bruxa.jpg"));
                JOptionPane.showMessageDialog(null, "Névoa negra – Libera uma névoa negra que limita a visão de seus inimigos além de envenna-los por 1 rodada, a névoa dura 2 rodadas.\n\nMorto novamente – Faz os corpos mortos próximos entrarem em violenta combustão causando dano de fogo negro aos antigidos, os corpos queimam durante 2 rodadas.\n\nOrbe – A bruxa pode utilizar seu orbe para se teletransportar para qualquer inimigo e ataca-los com suas Kris", "VANTAGENS - A BRUXA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Irmaos Jack.png"));
                JOptionPane.showMessageDialog(null, "Ameaça tripla – Ao fim da rodada do último irmão, os três realizarão 1 ataques conjunto.\n\nParanoicos – Os irmãos são imunes à veneno.\n\nConjunto – Inimigo suprimido pelo ataque de um dos irmãos, receberá -1 no dado para todas as ações.", "VANTAGENS - IRMÃOS JACK", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 13:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Phantom.png"));
                JOptionPane.showMessageDialog(null, "Terror – Ao suprimir um inimigo, o mesmo ficará amedrontado. \nInimigos amedrontados recebem penalidade de -1 no dado.\n\nGranadeiro – Ao atacar com sucesso um inimigo, Phantom lança automaticamente uma granada em outro inimigo.\n\nAtiador – +1 no dado para ações ofensivas.", "VANTAGENS - PHANTOM", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 14:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - The Clown.png"));
                JOptionPane.showMessageDialog(null, "Convicção – The Clown não pode ser assustado, não fica abalado com nada, não pode ser estunado e nem sofre intimidação.\n\nSaque rápido – Ao atacar com sucesso um inimigo, ganhe imediatamente um ataque rápido contra outro inimigo usando a pistola.\n\nSentinela – The Clown pode pôr uma sentry-gun no campo de batalha que dura 5 rodadas ou até ser destruída. \nEle pode fazer isso apenas 3 rodadas após a sentry-gun atual ser destruída o parar de funcionar. \nA sentry gun possui 10 de HP e causa 10 de dano por turno.\n\nSmile – The Clown lança um granada especial que faz os inimigos ficarem tonto além de perderem a noção e tomar dano contínuo de veneno por 2 rodadas. \n"
                        + "30% de chance de tomar o veneno.\n"
                        + "30% de chance de receber penalidade de -1 no dado para todas as ações.\n"
                        + "50% de chance de ser estunado por 1 turno.", "VANTAGENS - THE CLOWN", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 15:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 02.png"));
                JOptionPane.showMessageDialog(null, "Envenenado – 80% de chances de envenenar um inimigo atingido por seus ataques.\n\nAstúcia – Beta-02 não pode ser estunado.\n\nPercepção apurada – Beta-02 localiza facilmente seus inimigos em qualquer situação, além disso ele é imune a ataque steath. Também consegue realizar um tiro preciso que pode atravessar certas coberturas.\n\nPrecisão letal – +1 de vantagem no dado para ATAQUE e QTE, além disso, some mais 2 toda vez que tirar um erro crítico.", "VANTAGENS - BETA-02", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 16:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 01.png"));
                JOptionPane.showMessageDialog(null, "Supressor – Inimigos recuados devido ao ataque de Beta-01 recebem uma penalização de -1 no dado para TODAS as ações além de 30% de chances de tomar amedrontar.\n\nCombate pesado – Beta-01 ataca automaticamente seus atacantes, além disso, Beta-01 não sente dor e não pode ficar ferido.\n\nPressa esmagadora – Beta-01 pode utilizar sua habilidade especial “Pressa esmagadora” para matar instantaneamente um inimigo.\n\nDestruidor – Caso o ambiente ou objeto destruído por Beta-01 estivesse sendo usado como cobertura, o inimigo ali tomará dano.", "VANTAGENS - BETA-01", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 17:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Omega.png"));
                JOptionPane.showMessageDialog(null, "Silenciosa – +1 de vantagem em ATAQUE e DEFESA steath.\n\nVersátil – Ao atacar com sucesso fisicamente um inimigo, ganhe outro ataque físico contra outro ou o mesmo inimigo, caso tenha sucesso no outro ataque também, ganhe um terceiro e último ataque usando uma de suas pistolas. \nInimigos atingidos 2x consecutivas por Ômega ficam estunados.\n\nViúva negra – Inimigos atacados com esta habilidade ficam estunados por 1 rodada, além disso +1 de vantagem em QTE.\n\nHacker civil – Ômega pode hackear ambiente civil além de usar o exploit APAGÃO.", "VANTAGENS - ÔMEGA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 18:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Alfa.png"));
                JOptionPane.showMessageDialog(null, "Localizado – O Alfa sempre sabe a localização de todos os inimigos.\n\nHacker Militar – Alfa pode hackear ambientes civis e militares.\n\nImunidade química – Imune a veneno e outros danos químicos.\nVelocidade no combate – +1 de vantagem para ATAQUE e DEFESA, além de QTE.\n\nExo-esqueleto Alfa – A cada rodado do inimigo, há 50% de chances da sua ser a próxima.", "VANTAGENS - ALFA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensHumano(int classes) {
        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Bandido.png"));
                JOptionPane.showMessageDialog(null, "Nenhuma\n\n", "VANTAGENS - BANDIDOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Psicopatas.png"));
                JOptionPane.showMessageDialog(null, "Insanidade – Psicopatas nada temem.", "VANTAGENS - PSICOPATAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Terrorista.png"));
                JOptionPane.showMessageDialog(null, "Homem bomba – Todos explosivos tem efeito incendiário.", "VANTAGENS - TERRORISTAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Sadico.jpg"));
                JOptionPane.showMessageDialog(null, "Sonar – Uma vez a cada 3 rodadas o agente da Unreal pode usar seu sonar para tentar detectar inimigos próximos.\n\nNão tomam desvantagens no escuro, além de enxergar perfeitamente na mesma.", "VANTAGENS - SÁDICOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Mercenario.png"));
                JOptionPane.showMessageDialog(null, "Supressor – Inimigos recuados devido ao ataque de um mercenário recebem uma penalização de -1 no dado para as ações defensivas e de ataque. \n\nLinha de frente – Mercenários não podem ser intimidados e nunca ficam assustados. \n\nExploit – Mercenário tem acesso à certos exploits: scanner, hackeamento de ambiente civil e Apagão Local.", "VANTAGENS - MERCENÁRIOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Agente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Sonar – Uma vez a cada 3 rodadas o agente da Unreal pode usar seu sonar para tentar detectar inimigos próximos.\n\nNão tomam desvantagens no escuro, além de enxergar perfeitamente na mesma.", "VANTAGENS - AGENTE DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Cacador da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Combate veloz – Pode realizar dois ataques corporais, seja no mesmo inimigo, ou em outro próximo.\n\nA noite é minha amiga – +1 de vantagem em ATAQUE e DEFESA steath.", "VANTAGENS - CAÇADOR DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Combatente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Sonar – Uma vez a cada 3 rodadas o combatente da Unreal pode usar seu sonar para tentar detectar inimigos próximos.\n\nCombatente moderno – +1 de vantagem no dado para corrida, esquiva e QTE.\n\nExo-esqueleto – Ao fim da rodada de cada inimigo, há 30% de chances de ganhar uma rodada extra.", "VANTAGENS - COMBATENTE DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Pigsaw.jpg"));
                JOptionPane.showMessageDialog(null, "Serra fatal – A cada 3 rodadas Pigsaw atacará com sua serra-elétrica, inimigos acertados por ela terá seu HP reduzido a ZERO.\n\nLutador – Mais 6.5 de dano em ataques físicos.\n\nZumbi – Pigsaw aplica uma poderosa mordida (que causa 10 de dano ignorando a DEFESA, também aplica efeito de sangramento), ele também recupera 10 de HP ao executar com sucesso a mordida.", "VANTAGENS - PIGSAW", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - O Reanimador ver1.jpg"));
                JOptionPane.showMessageDialog(null, "Invocação dos mortos – Albert invoca para lutar ao seu lado 3 infectados armados com armas brancas.\n\nConsumo – Albert consome um infectado invocado para restaurar 5 pontos de vitalidade.\n\nTrevas – Albert lança uma bola de fogo negro que queima durante 2 rodadas o inimigo antigido", "VANTAGENS - O REANIMADOR", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - A bruxa.jpg"));
                JOptionPane.showMessageDialog(null, "Névoa negra – Libera uma névoa negra que limita a visão de seus inimigos além de envenna-los por 1 rodada, a névoa dura 2 rodadas.\n\nMorto novamente – Faz os corpos mortos próximos entrarem em violenta combustão causando dano de fogo negro aos antigidos, os corpos queimam durante 2 rodadas.\n\nOrbe – A bruxa pode utilizar seu orbe para se teletransportar para qualquer inimigo e ataca-los com suas Kris", "VANTAGENS - A BRUXA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Irmaos Jack.png"));
                JOptionPane.showMessageDialog(null, "Ameaça tripla – Ao fim da rodada do último irmão, os três realizarão 1 ataques conjunto.\n\nParanoicos – Os irmãos são imunes à veneno.\n\nConjunto – Inimigo suprimido pelo ataque de um dos irmãos, receberá -1 no dado para todas as ações.", "VANTAGENS - IRMÃOS JACK", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 13:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Phantom.png"));
                JOptionPane.showMessageDialog(null, "Terror – Ao suprimir um inimigo, o mesmo ficará amedrontado. \nInimigos amedrontados recebem penalidade de -1 no dado.\n\nGranadeiro – Ao atacar com sucesso um inimigo, Phantom lança automaticamente uma granada em outro inimigo.\n\nAtiador – +1 no dado para ações ofensivas.", "VANTAGENS - PHANTOM", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 14:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - The Clown.png"));
                JOptionPane.showMessageDialog(null, "Convicção – The Clown não pode ser assustado, não fica abalado com nada, não pode ser estunado e nem sofre intimidação.\n\nSaque rápido – Ao atacar com sucesso um inimigo, ganhe imediatamente um ataque rápido contra outro inimigo usando a pistola.\n\nSentinela – The Clown pode pôr uma sentry-gun no campo de batalha que dura 5 rodadas ou até ser destruída. \nEle pode fazer isso apenas 3 rodadas após a sentry-gun atual ser destruída o parar de funcionar. \nA sentry gun possui 10 de HP e causa 10 de dano por turno.\n\nSmile – The Clown lança um granada especial que faz os inimigos ficarem tonto além de perderem a noção e tomar dano contínuo de veneno por 2 rodadas. \n"
                        + "30% de chance de tomar o veneno.\n"
                        + "30% de chance de receber penalidade de -1 no dado para todas as ações.\n"
                        + "50% de chance de ser estunado por 1 turno.", "VANTAGENS - THE CLOWN", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 15:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 02.png"));
                JOptionPane.showMessageDialog(null, "Envenenado – 80% de chances de envenenar um inimigo atingido por seus ataques.\n\nAstúcia – Beta-02 não pode ser estunado.\n\nPercepção apurada – Beta-02 localiza facilmente seus inimigos em qualquer situação, além disso ele é imune a ataque steath. Também consegue realizar um tiro preciso que pode atravessar certas coberturas.\n\nPrecisão letal – +1 de vantagem no dado para ATAQUE e QTE, além disso, some mais 2 toda vez que tirar um erro crítico.", "VANTAGENS - BETA-02", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 16:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 01.png"));
                JOptionPane.showMessageDialog(null, "Supressor – Inimigos recuados devido ao ataque de Beta-01 recebem uma penalização de -1 no dado para TODAS as ações além de 30% de chances de tomar amedrontar.\n\nCombate pesado – Beta-01 ataca automaticamente seus atacantes, além disso, Beta-01 não sente dor e não pode ficar ferido.\n\nPressa esmagadora – Beta-01 pode utilizar sua habilidade especial “Pressa esmagadora” para matar instantaneamente um inimigo.\n\nDestruidor – Caso o ambiente ou objeto destruído por Beta-01 estivesse sendo usado como cobertura, o inimigo ali tomará dano.", "VANTAGENS - BETA-01", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 17:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Omega.png"));
                JOptionPane.showMessageDialog(null, "Silenciosa – +1 de vantagem em ATAQUE e DEFESA steath.\n\nVersátil – Ao atacar com sucesso fisicamente um inimigo, ganhe outro ataque físico contra outro ou o mesmo inimigo, caso tenha sucesso no outro ataque também, ganhe um terceiro e último ataque usando uma de suas pistolas. \nInimigos atingidos 2x consecutivas por Ômega ficam estunados.\n\nViúva negra – Inimigos atacados com esta habilidade ficam estunados por 1 rodada, além disso +1 de vantagem em QTE.\n\nHacker civil – Ômega pode hackear ambiente civil além de usar o exploit APAGÃO.", "VANTAGENS - ÔMEGA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 18:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Alfa.png"));
                JOptionPane.showMessageDialog(null, "Localizado – O Alfa sempre sabe a localização de todos os inimigos.\n\nHacker Militar – Alfa pode hackear ambientes civis e militares.\n\nImunidade química – Imune a veneno e outros danos químicos.\nVelocidade no combate – +1 de vantagem para ATAQUE e DEFESA, além de QTE.\n\nExo-esqueleto Alfa – A cada rodado do inimigo, há 50% de chances da sua ser a próxima.", "VANTAGENS - ALFA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect1(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado new.png"));
                JOptionPane.showMessageDialog(null, "Infectado – Ao morder com sucesso um inimigo há 40% de chance de infecta-lo.\n\nMordida – Inimigos mordidos por um zumbi toma 5 de dano adicional.", "VANTAGENS - INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cachorro Infectado.jpg"));
                JOptionPane.showMessageDialog(null, "Veloz – Ganha vantagens em corrida, e +1 de vantagem no dado para correr.\n\nEsquiva – 1 vez a cada 5 rodadas suas, opcionalmente, use um dado proporcional ao RES para uma esquiva adicional.", "VANTAGENS - CACHORRO INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado maldito.png"));
                JOptionPane.showMessageDialog(null, "Armadura – Os Malditos possuem uma armadura ao redor do crânio que protege o mesmo.\n"
                        + "O HP da armadura é de 5 pontos (PADRÃO).\n"
                        + "\nAutodestruição – Se um Maldito morrer sem ter a armadura do crânio destruída, a mesma explodirá causando 30 de dano aos inimigos ao redor.", "VANTAGENS - INFECTADO MALDITO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cacadores das sombras.png"));
                JOptionPane.showMessageDialog(null, "Bote – Um caçador pode dar um bote fatal em sua vítima, pulando em cima dela e tirando 20 de HP por turno. \nO caçador só sairá de cima da vítima se ele receber dano de terceiros.", "VANTAGENS - CAÇADORES DAS SOMBRAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Mumia possuida.png"));
                JOptionPane.showMessageDialog(null, "NENHUMA", "VANTAGENS - MÚMIA POSSUÍDA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Cacadores da selva.png"));
                JOptionPane.showMessageDialog(null, "Raízes - Os caçadores lançam uma lâmina nos pés dos inimigos que faz com que as raízes de árvores e plantas naquele local\nPrendam o inimigo por 1 rodadas"
                        + "\n\nAtaque dos chifres - O caçador avança com força total utilizando seus chifres para causar dano extra ", "VANTAGENS - CAÇADORES DA SELVA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Sucubus.jpg"));
                JOptionPane.showMessageDialog(null, "Encantadora - Dano tomando de homens são reduzidos em um terço\n\n"
                        + "Evasão - A sucubus utiliza sua asa para desviar dos ataques inimigos +1 no dado para esquivas", "VANTAGENS - SUCUBUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect1(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado new.png"));
                JOptionPane.showMessageDialog(null, "Infectado – Ao morder com sucesso um inimigo há 40% de chance de infecta-lo.\n\nMordida – Inimigos mordidos por um zumbi toma 5 de dano adicional.", "VANTAGENS - INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cachorro Infectado.jpg"));
                JOptionPane.showMessageDialog(null, "Veloz – Ganha vantagens em corrida, e +1 de vantagem no dado para correr.\n\nEsquiva – 1 vez a cada 5 rodadas suas, opcionalmente, use um dado proporcional ao RES para uma esquiva adicional.", "VANTAGENS - CACHORRO INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado maldito.png"));
                JOptionPane.showMessageDialog(null, "Armadura – Os Malditos possuem uma armadura ao redor do crânio que protege o mesmo.\n"
                        + "O HP da armadura é de 5 pontos (PADRÃO).\n"
                        + "\nAutodestruição – Se um Maldito morrer sem ter a armadura do crânio destruída, a mesma explodirá causando 30 de dano aos inimigos ao redor.", "VANTAGENS - INFECTADO MALDITO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cacadores das sombras.png"));
                JOptionPane.showMessageDialog(null, "Bote – Um caçador pode dar um bote fatal em sua vítima, pulando em cima dela e tirando 20 de HP por turno. \nO caçador só sairá de cima da vítima se ele receber dano de terceiros.", "VANTAGENS - CAÇADORES DAS SOMBRAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Mumia possuida.png"));
                JOptionPane.showMessageDialog(null, "NENHUMA", "VANTAGENS - MÚMIA POSSUÍDA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Cacadores da selva.png"));
                JOptionPane.showMessageDialog(null, "Raízes - Os caçadores lançam uma lâmina nos pés dos inimigos que faz com que as raízes de árvores e plantas naquele local\nPrendam o inimigo por 1 rodadas"
                        + "\n\nAtaque dos chifres - O caçador avança com força total utilizando seus chifres para causar dano extra ", "VANTAGENS - CAÇADORES DA SELVA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Sucubus.jpg"));
                JOptionPane.showMessageDialog(null, "Encantadora - Dano tomando de homens são reduzidos em um terço\n\n"
                        + "Evasão - A sucubus utiliza sua asa para desviar dos ataques inimigos +1 no dado para esquivas", "VANTAGENS - SUCUBUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect2(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aberracao.png"));
                JOptionPane.showMessageDialog(null, "Um com a escuridão: Inimigos recebem -1 de penalidade em, Percepção/Ataque em steath, quando em lugar escuro.\n"
                        + "\n"
                        + "Paranoia: Inimigos atingidos por seu golpe, pode entrar em modo de paranoia por 2 rodadas, sem saber definir o que está acontecendo, ou o que é real. "
                        + "\nCaso o Karma do seu inimigo esteja abaixo de 40, ele entrará automaticamente na paranoia, porém, caso o Karma esteja acima de 70 ele não correrá o risco de entrar na paranoia.\n"
                        + "\n"
                        + "Stalker: A aberração demoníaca consegue andar nas paredes e até mesmo entrar dentro delas, pode também realizar ataques furtivos assim, inimigos atacados assim sofrem uma penalidade de -2 no teste de percepção, "
                        + "\nalém disso, esse ataque ignora a RES do alvo. ", "VANTAGENS - Aberração Demoníaca", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Infectado aprimorado.png"));
                JOptionPane.showMessageDialog(null, "Criatura da noite: +1 de vantagem em: Percepção/Ataque em steath.\n"
                        + "\n"
                        + "Combatente veloz: +1 de vantagem no dado para correr, além disso, um aprimorado não se cansa.\n"
                        + "\n"
                        + "Vírus mutato: Aumenta as chances de envenenar e infectar um inimigo. ", "VANTAGENS - INFECTADO APRIMORADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - DemonioAlado.jpg"));
                JOptionPane.showMessageDialog(null, "Criatura da noite: +1 de vantagem em: Percepção/Ataque em steath.\n"
                        + "\n"
                        + "Sonar: Uma vez a cada 3 rodadas (sua), do demónio alado pode usar o sonar para detectar todos os inimigos próximos.\n"
                        + "\n"
                        + "Caçador da noite: Se realizar com sucesso um ataque em steath, o alvo terá seu HP INTEIRAMENTE reduzido à ZERO.", "VANTAGENS - DEMÓNIO ALADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Scorpion.png"));
                JOptionPane.showMessageDialog(null, "Escorpião venenoso – Ao realizar com sucesso um ataque com sua calda, sua vítima recebe uma dose letal do seu vírus fazendo-a tomar 30 de dano adicional, mais 5 de dano por rodada até usar item de cura.\n"
                        + "\nVersátil – Ande por qualquer superfície de qualquer jeito e posição.\n"
                        + "\nCarcaça metálica – É necessário destruir a carcaça antes de causar algum dano ao Scorpions, \nalém disso a carcaça deixa o Scorpions invulnerável a fogo ou paralisia, HP da carcaça 10. ", "VANTAGENS - SCORPION", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Lesma Negra.png"));
                JOptionPane.showMessageDialog(null, "Elástico – As lesmas negras atacar a distância usando seu braço.\n"
                        + "\nCobra cega – Podem utilizar suas mini-lesmas para cegar por 1 rodada um inimigo.", "VANTAGENS - LESMA NEGRA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aranha gigante.jpg"));
                JOptionPane.showMessageDialog(null, "Na teia – Inimigos atingidos por suas teias ficam imobilizados por uma rodada. \n"
                        + "\nCaçadora – Inimigos na teia ganham desvantagem de -2 no dado para ação de QTE e DEFESA, durante a imobilização, e 1 rodada após ela.\n"
                        + "\nViúva negra – Aranhas podem injetar veneno. ", "VANTAGENS - ARANHA GIGANTE", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Chacal.png"));
                JOptionPane.showMessageDialog(null, "Velocista – Velocidade extremamente alta, além de +1 de vantagem no dado para perseguição.\n"
                        + "\nAfiado – Todos os ataques dos chacais deixam o inimigo como debuffer de ferimento.", "VANTAGENS - CHACAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Besta.png"));
                JOptionPane.showMessageDialog(null, "Irrefreável – Uma Besta nunca recua e continua indo pra cima do adversário sem se importar com nada, além disso, a Besta não sente dor!\n"
                        + "\nGuerreiro – Besta causa dano +10 extra contra classes militares.", "VANTAGENS - BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Corrompedora de Homens.jpg"));
                JOptionPane.showMessageDialog(null, "Corrompedora – Dá um beijo em qualquer inimigo e o faz lutar ao seu lado por 2 rodadas se for homem, 1 rodada se for mulher!\n"
                        + "\nDeusa – Recebe apenas metade do dano causado por mulheres e um terço do dano causado por homens.", "VANTAGENS - CORROMPEDORA DE HOMENS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Demolidor.png"));
                JOptionPane.showMessageDialog(null, "Demolição – O demolidor golpeia o chão causando tremores, inimigos que cairem receberão -1 no dado pela próxima rodada\n", "VANTAGENS - DEMOLIDOR", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - O carrasco.jpg"));
                JOptionPane.showMessageDialog(null, "Irrefreável – Um Carrasco nunca recua e continua indo pra cima do adversário sem se importar com nada, além disso, a Carrasco não sente dor!\n"
                        + "\nGarrador – Carrasco aplica sangramento em cada ataque bem sucedido.", "VANTAGENS - CARRASCO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Senhora dos Pesadelos.jpg"));
                JOptionPane.showMessageDialog(null, "Nas sombras – A senhora dos pesadelos só pode ser vista com luz, porém, só pode ser atingida na escuridão!\n"
                        + "\nPesadelo – A senhora do pesadelo faz sua vítima sofrer aquilo que mais teme causando dano na alma da pessoa", "VANTAGENS - SENHORA DO PESADELO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect2(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aberracao.png"));
                JOptionPane.showMessageDialog(null, "Um com a escuridão: Inimigos recebem -1 de penalidade em, Percepção/Ataque em steath, quando em lugar escuro.\n"
                        + "\n"
                        + "Paranoia: Inimigos atingidos por seu golpe, pode entrar em modo de paranoia por 2 rodadas, sem saber definir o que está acontecendo, ou o que é real. "
                        + "\nCaso o Karma do seu inimigo esteja abaixo de 40, ele entrará automaticamente na paranoia, porém, caso o Karma esteja acima de 70 ele não correrá o risco de entrar na paranoia.\n"
                        + "\n"
                        + "Stalker: A aberração demoníaca consegue andar nas paredes e até mesmo entrar dentro delas, pode também realizar ataques furtivos assim, inimigos atacados assim sofrem uma penalidade de -2 no teste de percepção, "
                        + "\nalém disso, esse ataque ignora a RES do alvo. ", "VANTAGENS - Aberração Demoníaca", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Infectado aprimorado.png"));
                JOptionPane.showMessageDialog(null, "Criatura da noite: +1 de vantagem em: Percepção/Ataque em steath.\n"
                        + "\n"
                        + "Combatente veloz: +1 de vantagem no dado para correr, além disso, um aprimorado não se cansa.\n"
                        + "\n"
                        + "Vírus mutato: Aumenta as chances de envenenar e infectar um inimigo. ", "VANTAGENS - INFECTADO APRIMORADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - DemonioAlado.jpg"));
                JOptionPane.showMessageDialog(null, "Criatura da noite: +1 de vantagem em: Percepção/Ataque em steath.\n"
                        + "\n"
                        + "Sonar: Uma vez a cada 3 rodadas (sua), do demónio alado pode usar o sonar para detectar todos os inimigos próximos.\n"
                        + "\n"
                        + "Caçador da noite: Se realizar com sucesso um ataque em steath, o alvo terá seu HP INTEIRAMENTE reduzido à ZERO.", "VANTAGENS - DEMÓNIO ALADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Scorpion.png"));
                JOptionPane.showMessageDialog(null, "Escorpião venenoso – Ao realizar com sucesso um ataque com sua calda, sua vítima recebe uma dose letal do seu vírus fazendo-a tomar 30 de dano adicional, mais 5 de dano por rodada até usar item de cura.\n"
                        + "\nVersátil – Ande por qualquer superfície de qualquer jeito e posição.\n"
                        + "\nCarcaça metálica – É necessário destruir a carcaça antes de causar algum dano ao Scorpions, \nalém disso a carcaça deixa o Scorpions invulnerável a fogo ou paralisia, HP da carcaça 10. ", "VANTAGENS - SCORPION", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Lesma Negra.png"));
                JOptionPane.showMessageDialog(null, "Elástico – As lesmas negras atacar a distância usando seu braço.\n"
                        + "\nCobra cega – Podem utilizar suas mini-lesmas para cegar por 1 rodada um inimigo.", "VANTAGENS - LESMA NEGRA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aranha gigante.jpg"));
                JOptionPane.showMessageDialog(null, "Na teia – Inimigos atingidos por suas teias ficam imobilizados por uma rodada. \n"
                        + "\nCaçadora – Inimigos na teia ganham desvantagem de -2 no dado para ação de QTE e DEFESA, durante a imobilização, e 1 rodada após ela.\n"
                        + "\nViúva negra – Aranhas podem injetar veneno. ", "VANTAGENS - ARANHA GIGANTE", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Chacal.png"));
                JOptionPane.showMessageDialog(null, "Velocista – Velocidade extremamente alta, além de +1 de vantagem no dado para perseguição.\n"
                        + "\nAfiado – Todos os ataques dos chacais deixam o inimigo como debuffer de ferimento.", "VANTAGENS - CHACAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Besta.png"));
                JOptionPane.showMessageDialog(null, "Irrefreável – Uma Besta nunca recua e continua indo pra cima do adversário sem se importar com nada, além disso, a Besta não sente dor!\n"
                        + "\nGuerreiro – Besta causa dano +10 extra contra classes militares.", "VANTAGENS - BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Corrompedora de Homens.jpg"));
                JOptionPane.showMessageDialog(null, "Corrompedora – Dá um beijo em qualquer inimigo e o faz lutar ao seu lado por 2 rodadas se for homem, 1 rodada se for mulher!\n"
                        + "\nDeusa – Recebe apenas metade do dano causado por mulheres e um terço do dano causado por homens.", "VANTAGENS - CORROMPEDORA DE HOMENS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Demolidor.png"));
                JOptionPane.showMessageDialog(null, "Demolição – O demolidor golpeia o chão causando tremores, inimigos que cairem receberão -1 no dado pela próxima rodada\n", "VANTAGENS - DEMOLIDOR", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - O carrasco.jpg"));
                JOptionPane.showMessageDialog(null, "Irrefreável – Um Carrasco nunca recua e continua indo pra cima do adversário sem se importar com nada, além disso, a Carrasco não sente dor!\n"
                        + "\nGarrador – Carrasco aplica sangramento em cada ataque bem sucedido.", "VANTAGENS - CARRASCO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Senhora dos Pesadelos.jpg"));
                JOptionPane.showMessageDialog(null, "Nas sombras – A senhora dos pesadelos só pode ser vista com luz, porém, só pode ser atingida na escuridão!\n"
                        + "\nPesadelo – A senhora do pesadelo faz sua vítima sofrer aquilo que mais teme causando dano na alma da pessoa", "VANTAGENS - SENHORA DO PESADELO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect3(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Hunter.png"));
                JOptionPane.showMessageDialog(null, "Predador: +5 de vantagem em: Percepção/Ataque em steath e teste para descobrir inimigos oculto.\n"
                        + "\n"
                        + "A besta: Pode atacar a curta distância usando o “MORDER”. Acerto crítico do morder zera a vitalidade e derruba o alvo instantaneamente.\n"
                        + "\n"
                        + "Força bestial: +20 de FORÇA. \n"
                        + "\n"
                        + "O melhor guerreiro: Velocidade sobre-humana. +5 de vantagem ao correr e ao realizar esquivas\n"
                        + " \n"
                        + "Pele de ferro: +30 de RESISTÊNCIA. \n"
                        + "\n"
                        + "Inquebrável: O hunter não sente dor, além disso, não pode ter seus membros fraturados. ", "VANTAGENS - THE HUNTER", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Barao Infernal.png"));
                JOptionPane.showMessageDialog(null, "Demoníaco – Inimigos amedrontados recebem uma penalidade de -1 no dado, além disso, tomam 10% de dano adicional.\n"
                        + "\nRugido da besta – O rugido da besta amedronta e estuna por 1 rodada todos os inimigos afetados.\n"
                        + "\nForça demoníaca – +10 de FORÇA. \n"
                        + "\nBafo infernal – Inimigos atingidos pelo fogo recebem dano constante de 10% do total do dano por 2 rodadas. \n"
                        + "\nRei do inferno – Invoque 5 aberrações para auxiliá-lo – esta habilidade só pode ser utilizada 1 vez a cada 10 rodadas suas.\n"
                        + "\nAssas Indomáveis – +5 de vantagem ao correr.", "VANTAGENS - BARÃO INFERNAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Bocejo.png"));
                JOptionPane.showMessageDialog(null, "Tóxica – Bocejo joga veneno em área.\n"
                        + "\nCaçadora – Bocejo pode ficar invisível, +1 de vantagem no dado para ataque steath quando invisível.\n"
                        + "\nEspremer – Bocejo utiliza a força de seu corpo para tentar esmagar sua vítima causando um dano enorme e causando exaustão por 1 rodada. \n"
                        + "\nPresas – SInimigos atingidos pela presa de Bocejo ficam com o debuffer de FERIMENTO. \n"
                        + "\nEscama modificada – Bocejo é imune a fogo. ", "VANTAGENS - BOCEJO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Ghost.png"));
                JOptionPane.showMessageDialog(null, "Tóxico – Todos os ataques de Ghosts tem 50% de chance de envenenar.\n"
                        + "\nCriatura infernal – Ghost pode usar de telepatia para mover objetos e até pessoas, assim como se tele transportar e até se materializar em paredes assim como atravessa-las.\n"
                        + "\nGhost – Ataques de dentro da parede ganham +1 de vantagem no dado caso Ghost não tenha sido detectado. \n"
                        + "\nInferno – Inimigos atingidos o olhar infernal de Ghost ficam com o debuffer de PARANOIA por 1 rodada. \n"
                        + "\nSombra – Ghost se desmaterializa toda vez que toma um dano, impossibilitando-o de receber um novo ataque até que ele seja novamente espotado, ou que ele se materialize novamente. ", "VANTAGENS - GHOST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Cerberus.jpg"));
                JOptionPane.showMessageDialog(null, "Três cabeças – Cerberus ataca 3x.\n"
                        + "\nPortador do fogo – Cerberus além de ser imune a fogo, ele pode atacar com fogo causando danos contínuo por 2 rodadas.\n"
                        + "\nMacho alfa – Cerberus consegue comandar e até invocar os cachorros infectados. ", "VANTAGENS - CERBERUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - O Reanimador ver2.png"));
                JOptionPane.showMessageDialog(null, "Reanimação – O Reanimador agora invoca 5 zumbis armados com armas brancas.\n"
                        + "\nMaldição – O Reanimador invoca 3 zumbis dos antigos guerreiros equipados com armas de fogo.\n"
                        + "\nInvocador – O Reanimador agora também invoca Carrascos e Demolidores [1 de cada por vez]", "VANTAGENS - O REANIMADOR ", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - Cilla.png"));
                JOptionPane.showMessageDialog(null, "Enraizar – Cilla faz com quê suas enguias mordam e prendam os inimigos pela perna causando dano e stunando eles por 1 rodada.\n"
                        + "\nAmeaça - Cilla solta um jato de tinta preta e escapa da zona de perigo toda vez que recebe um dano maior que 10.\n"
                        + "\nMonstro - Cilla transforma a cabeça de 3 enguias em lobos e as atira como uma lança em direção a 1 ou 3 inimigos cada cabeça. \nO ataque gera uma explossão pequena que causa 1D10 + 10 de dano extra.", "VANTAGENS - CILLA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect3(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Hunter.png"));
                JOptionPane.showMessageDialog(null, "Predador: +5 de vantagem em: Percepção/Ataque em steath e teste para descobrir inimigos oculto.\n"
                        + "\n"
                        + "A besta: Pode atacar a curta distância usando o “MORDER”. Acerto crítico do morder zera a vitalidade e derruba o alvo instantaneamente.\n"
                        + "\n"
                        + "Força bestial: +20 de FORÇA. \n"
                        + "\n"
                        + "O melhor guerreiro: Velocidade sobre-humana. +5 de vantagem ao correr e ao realizar esquivas\n"
                        + " \n"
                        + "Pele de ferro: +30 de RESISTÊNCIA. \n"
                        + "\n"
                        + "Inquebrável: O hunter não sente dor, além disso, não pode ter seus membros fraturados. ", "VANTAGENS - THE HUNTER", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Barao Infernal.png"));
                JOptionPane.showMessageDialog(null, "Demoníaco – Inimigos amedrontados recebem uma penalidade de -1 no dado, além disso, tomam 10% de dano adicional.\n"
                        + "\nRugido da besta – O rugido da besta amedronta e estuna por 1 rodada todos os inimigos afetados.\n"
                        + "\nForça demoníaca – +10 de FORÇA. \n"
                        + "\nBafo infernal – Inimigos atingidos pelo fogo recebem dano constante de 10% do total do dano por 2 rodadas. \n"
                        + "\nRei do inferno – Invoque 5 aberrações para auxiliá-lo – esta habilidade só pode ser utilizada 1 vez a cada 10 rodadas suas.\n"
                        + "\nAssas Indomáveis – +5 de vantagem ao correr.", "VANTAGENS - BARÃO INFERNAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Bocejo.png"));
                JOptionPane.showMessageDialog(null, "Tóxica – Bocejo joga veneno em área.\n"
                        + "\nCaçadora – Bocejo pode ficar invisível, +1 de vantagem no dado para ataque steath quando invisível.\n"
                        + "\nEspremer – Bocejo utiliza a força de seu corpo para tentar esmagar sua vítima causando um dano enorme e causando exaustão por 1 rodada. \n"
                        + "\nPresas – SInimigos atingidos pela presa de Bocejo ficam com o debuffer de FERIMENTO. \n"
                        + "\nEscama modificada – Bocejo é imune a fogo. ", "VANTAGENS - BOCEJO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Ghost.png"));
                JOptionPane.showMessageDialog(null, "Tóxico – Todos os ataques de Ghosts tem 50% de chance de envenenar.\n"
                        + "\nCriatura infernal – Ghost pode usar de telepatia para mover objetos e até pessoas, assim como se tele transportar e até se materializar em paredes assim como atravessa-las.\n"
                        + "\nGhost – Ataques de dentro da parede ganham +1 de vantagem no dado caso Ghost não tenha sido detectado. \n"
                        + "\nInferno – Inimigos atingidos o olhar infernal de Ghost ficam com o debuffer de PARANOIA por 1 rodada. \n"
                        + "\nSombra – Ghost se desmaterializa toda vez que toma um dano, impossibilitando-o de receber um novo ataque até que ele seja novamente espotado, ou que ele se materialize novamente. ", "VANTAGENS - GHOST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Cerberus.jpg"));
                JOptionPane.showMessageDialog(null, "Três cabeças – Cerberus ataca 3x.\n"
                        + "\nPortador do fogo – Cerberus além de ser imune a fogo, ele pode atacar com fogo causando danos contínuo por 2 rodadas.\n"
                        + "\nMacho alfa – Cerberus consegue comandar e até invocar os cachorros infectados. ", "VANTAGENS - CERBERUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - O Reanimador ver2.png"));
                JOptionPane.showMessageDialog(null, "Reanimação – O Reanimador agora invoca 5 zumbis armados com armas brancas.\n"
                        + "\nMaldição – O Reanimador invoca 3 zumbis dos antigos guerreiros equipados com armas de fogo.\n"
                        + "\nInvocador – O Reanimador agora também invoca Carrascos e Demolidores [1 de cada por vez]", "VANTAGENS - O REANIMADOR ", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - Cilla.png"));
                JOptionPane.showMessageDialog(null, "Enraizar – Cilla faz com quê suas enguias mordam e prendam os inimigos pela perna causando dano e stunando eles por 1 rodada.\n"
                        + "\nAmeaça - Cilla solta um jato de tinta preta e escapa da zona de perigo toda vez que recebe um dano maior que 10.\n"
                        + "\nMonstro - Cilla transforma a cabeça de 3 enguias em lobos e as atira como uma lança em direção a 1 ou 3 inimigos cada cabeça. \nO ataque gera uma explossão pequena que causa 1D10 + 10 de dano extra.", "VANTAGENS - CILLA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect4(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/4 - Alfa Besta.png"));
                JOptionPane.showMessageDialog(null, "Manipulação das trevas – Alfa manipula qualquer aparição a seu favor\n"
                        + "\nManipulação do caos – Alfa modifica o ambiente a seu favor desrespeitando qualquer lei da natureza.\n", "VANTAGENS - ALFA BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/04 - Cerberus 2.0.jpg"));
                JOptionPane.showMessageDialog(null, "Três cabeças – Cerberus ataca uma única vez agora, sendo um ataque direcionado enquanto as duas outras cabeças cospem fogo em outros dois inimigos\n"
                        + "\nPortador do fogo – Cerberus além de ser imune a fogo, ele pode atacar com fogo causando danos contínuo por 2 rodadas.\n"
                        + "\nMacho alfa – Cerberus consegue comandar e até invocar os cachorros infectados. ", "VANTAGENS - CERBERUS 2.0", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensInfect4(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/4 - Alfa Besta.png"));
                JOptionPane.showMessageDialog(null, "Manipulação das trevas – Alfa manipula qualquer aparição a seu favor\n"
                        + "\nManipulação do caos – Alfa modifica o ambiente a seu favor desrespeitando qualquer lei da natureza.\n", "VANTAGENS - ALFA BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/04 - Cerberus 2.0.jpg"));
                JOptionPane.showMessageDialog(null, "Três cabeças – Cerberus ataca uma única vez agora, sendo um ataque direcionado enquanto as duas outras cabeças cospem fogo em outros dois inimigos\n"
                        + "\nPortador do fogo – Cerberus além de ser imune a fogo, ele pode atacar com fogo causando danos contínuo por 2 rodadas.\n"
                        + "\nMacho alfa – Cerberus consegue comandar e até invocar os cachorros infectados. ", "VANTAGENS - CERBERUS 2.0", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensAparicoes(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Cabeca demoniaca.jpg"));
                JOptionPane.showMessageDialog(null, "Pavor – Chance de 50% de amendrontar o inimigo a cada 2 rodadas.\n"
                        + "\nEscuridão – A cabeça demoniaca pode desaparecer e reaparecer em qualquer lugar escuro.\n",
                        "VANTAGENS - CABEÇA DEMONIACA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Aparicoes.jpg"));
                JOptionPane.showMessageDialog(null, "Pertubação – Chance de 30% de amendrontar o inimigo a cada 2 rodadas.\n"
                        + "\nLigação infernal – A cada golpe, há 20% de chances de dar paranóia no inimigo.\n"
                        + "\nNo escuro - Aparições são a prova de bala, só podem ser destruídas com golpes físicos",
                        "VANTAGENS - APARIÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Manifestacoes.jpg"));
                JOptionPane.showMessageDialog(null, "Metafísico – Manifestações podem bater e pegar seus inimigos, além disso, a cada rodada tem 30% de chance de amedrontar.\n"
                        + "\nBloqueio – Manifestações que tomaram portas, janelas e outros locais precisam ter sua fonte destruída, antes de liberar acesso.\n",
                        "VANTAGENS - MANIFESTAÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Portheigast.jpg"));
                JOptionPane.showMessageDialog(null, "Mestre – Um poltergeist pode invocar aparições e manifestações.\n",
                        "VANTAGENS - POLTERGEIST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Sr Sorriso.jpg"));
                JOptionPane.showMessageDialog(null, "Terror – Podem dar amendrontar em seus inimigos .\n"
                        + "\nDarkness - Antes de serem atacados é necessário que sejam detectados, o jogador deve antes de ataca-los, jogadr um dado para saber se irá conseguir vê-lo",
                        "VANTAGENS - SENHORES DO SORRISO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getVantagensAparicoes(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Cabeca demoniaca.jpg"));
                JOptionPane.showMessageDialog(null, "Pavor – Chance de 50% de amendrontar o inimigo a cada 2 rodadas.\n"
                        + "\nEscuridão – A cabeça demoniaca pode desaparecer e reaparecer em qualquer lugar escuro.\n",
                        "VANTAGENS - CABEÇA DEMONIACA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Aparicoes.jpg"));
                JOptionPane.showMessageDialog(null, "Pertubação – Chance de 30% de amendrontar o inimigo a cada 2 rodadas.\n"
                        + "\nLigação infernal – A cada golpe, há 20% de chances de dar paranóia no inimigo.\n"
                        + "\nNo escuro - Aparições são a prova de bala, só podem ser destruídas com golpes físicos",
                        "VANTAGENS - APARIÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Manifestacoes.jpg"));
                JOptionPane.showMessageDialog(null, "Metafísico – Manifestações podem bater e pegar seus inimigos, além disso, a cada rodada tem 30% de chance de amedrontar.\n"
                        + "\nBloqueio – Manifestações que tomaram portas, janelas e outros locais precisam ter sua fonte destruída, antes de liberar acesso.\n",
                        "VANTAGENS - MANIFESTAÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Portheigast.jpg"));
                JOptionPane.showMessageDialog(null, "Mestre – Um poltergeist pode invocar aparições e manifestações.\n",
                        "VANTAGENS - POLTERGEIST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Sr Sorriso.jpg"));
                JOptionPane.showMessageDialog(null, "Terror – Podem dar amendrontar em seus inimigos .\n"
                        + "\nDarkness - Antes de serem atacados é necessário que sejam detectados, o jogador deve antes de ataca-los, jogadr um dado para saber se irá conseguir vê-lo",
                        "VANTAGENS - SENHORES DO SORRISO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Desvantagens">
    public static void getDesvantagensHumano(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Bandido.png"));
                JOptionPane.showMessageDialog(null, "Despreparo – Menos 1 no dado para tudo, exceto defesa.", "DESVANTAGENS - BANDIDOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Psicopatas.png"));
                JOptionPane.showMessageDialog(null, "Despreparo – Menos 1 no dado para tudo, exceto ataque.", "DESVANTAGENS - PSICOPATAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Terrorista.png"));
                JOptionPane.showMessageDialog(null, "Desatento – Menos 1 no dado para ações de percepções e defesa steath.", "DESVANTAGENS - TERRORISTAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Sadico.jpg"));
                JOptionPane.showMessageDialog(null, "Pavor – Pode ser morto instantaneamente com qualquer ataque em Steath bem executado", "DESVANTAGENS - SÁDICO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Mercenario.png"));
                JOptionPane.showMessageDialog(null, "Na alma – Toma 5 de dano adicional se estiver ferido.", "DESVANTAGENS - MERCENÁRIOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Agente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Falha algorítmica – Os exploits dos Hackers tem diversas vantagens adicionais contra os agentes. \n\nFalha química – Os efeitos químicos dos Químicos tem diversas vantagens adicionais contra os agentes.", "DESVANTAGENS - AGENTE DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Cacador da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Exposto – Ao ser descoberto, receba -1 no dado para defesa.", "DESVANTAGENS - CAÇADOR DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Combatente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Falha algorítmica – Os exploits dos Hackers funciona contra os combatentes. \n\nFalha mecânica – Se por ventura o exo-esqueleto for desabilitado, o combatente ficará atordoado por 2 rodadas, além disso, perderá TODAS as vantagens.", "DESVANTAGENS - COMBATENTES DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Pigsaw.jpg"));
                JOptionPane.showMessageDialog(null, "Desatento – Menos 1 no dado para ações de percepções e defesa steath.\n\nPele sensível – Pigsaw toma 5 de dano adicional por fogo e veneno.", "DESVANTAGENS - PIGSAW", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - O Reanimador ver1.jpg"));
                JOptionPane.showMessageDialog(null, "NÃO POSSUI", "DESVANTAGENS - O Reanimador", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - A bruxa.jpg"));
                JOptionPane.showMessageDialog(null, "Inquisião – Toma dano extra contra fogo.\n\nSurpreendida – Recebe uma desvantagem de 2 no dado se não executar com sucesso um ataque com o Orbe", "DESVANTAGENS - A BRUXA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Irmaos Jack.png"));
                JOptionPane.showMessageDialog(null, "Paranoia – Caso a máscara de gás de um dos irmãos seja destruída, o mesmo perderá 10 de HP por rodada.\n\nFantasmas na máquina – Se os irmãos testemunharem um hacker usando um exploit, as próximas rodadas subsequentes eles ficarão assustados tomando -1 no dado para todas as ações defensivas.", "DESVANTAGENS - IRMÃOS JACK", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 13:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Phantom.png"));
                JOptionPane.showMessageDialog(null, "Equipamento precário – A cada ataque recebido, Phantom tem 20% de chances de ficar ferido.", "DESVANTAGENS - PHANTOM", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 14:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - The Clown.png"));
                JOptionPane.showMessageDialog(null, "Autoridade – The Clown toma 5 de dano adicional quando atacado por um fuzileiro naval ou um agente da força policial.", "DESVANTAGENS - THE CLOWN", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 15:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 02.png"));
                JOptionPane.showMessageDialog(null, "Repelido – Ao receber com sucesso dois ataques, Beta-02 perde a sua rodada.\n\nDefasado – Cada dano tomado a RES do Beta-02 diminui em 1.", "DESVANTAGENS - BETA-02", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 16:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 01.png"));
                JOptionPane.showMessageDialog(null, "Falha algorítmica – Os exploits dos Hackers funciona contra o Beta-01, \nalém disso se caso seu exo-esqueleto seja desabilitado, ele fica 1 rodada estunado.\n\nPesado – -2 de desvantagem no dado para DEFESA e QTE, também em corrida e velocidade.", "DESVANTAGENS - BETA-01", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 17:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Omega.png"));
                JOptionPane.showMessageDialog(null, "Em chamas – Toma dano extra de fogo além de perder todos os bónus no dado ao lutar em ambiente em chama.\n\nCounter – Ao impedir ou se defender com sucesso de um ataque steath de Ômega, ela perderá 1 de vantagem no dado de DEFESA por uma rodada.", "DESVANTAGENS - ÔMEGA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 18:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Alfa.png"));
                JOptionPane.showMessageDialog(null, "Desprevinido – -1 de vantagem no dado para defesa quando Alfa estiver distraído, ou suprimido.", "DESVANTAGENS - ALFA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensHumano(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Bandido.png"));
                JOptionPane.showMessageDialog(null, "Despreparo – Menos 1 no dado para tudo, exceto defesa.", "DESVANTAGENS - BANDIDOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Psicopatas.png"));
                JOptionPane.showMessageDialog(null, "Despreparo – Menos 1 no dado para tudo, exceto ataque.", "DESVANTAGENS - PSICOPATAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Terrorista.png"));
                JOptionPane.showMessageDialog(null, "Desatento – Menos 1 no dado para ações de percepções e defesa steath.", "DESVANTAGENS - TERRORISTAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Sadico.jpeg"));
                JOptionPane.showMessageDialog(null, "Pavor – Pode ser morto instantaneamente com qualquer ataque em Steath bem executado", "DESVANTAGENS - SÁDICO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Mercenario.png"));
                JOptionPane.showMessageDialog(null, "Na alma – Toma 5 de dano adicional se estiver ferido.", "DESVANTAGENS - MERCENÁRIOS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Agente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Falha algorítmica – Os exploits dos Hackers tem diversas vantagens adicionais contra os agentes. \n\nFalha química – Os efeitos químicos dos Químicos tem diversas vantagens adicionais contra os agentes.", "DESVANTAGENS - AGENTE DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Cacador da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Exposto – Ao ser descoberto, receba -1 no dado para defesa.", "DESVANTAGENS - CAÇADOR DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Combatente da Unreal.png"));
                JOptionPane.showMessageDialog(null, "Falha algorítmica – Os exploits dos Hackers funciona contra os combatentes. \n\nFalha mecânica – Se por ventura o exo-esqueleto for desabilitado, o combatente ficará atordoado por 2 rodadas, além disso, perderá TODAS as vantagens.", "DESVANTAGENS - COMBATENTES DA UNREAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Pigsaw.jpg"));
                JOptionPane.showMessageDialog(null, "Desatento – Menos 1 no dado para ações de percepções e defesa steath.\n\nPele sensível – Pigsaw toma 5 de dano adicional por fogo e veneno.", "DESVANTAGENS - PIGSAW", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - O Reanimador ver1.jpg"));
                JOptionPane.showMessageDialog(null, "NÃO POSSUI", "DESVANTAGENS - O Reanimador", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - A bruxa.jpg"));
                JOptionPane.showMessageDialog(null, "Inquisião – Toma dano extra contra fogo.\n\nSurpreendida – Recebe uma desvantagem de 2 no dado se não executar com sucesso um ataque com o Orbe", "DESVANTAGENS - A BRUXA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Irmaos Jack.png"));
                JOptionPane.showMessageDialog(null, "Paranoia – Caso a máscara de gás de um dos irmãos seja destruída, o mesmo perderá 10 de HP por rodada.\n\nFantasmas na máquina – Se os irmãos testemunharem um hacker usando um exploit, as próximas rodadas subsequentes eles ficarão assustados tomando -1 no dado para todas as ações defensivas.", "DESVANTAGENS - IRMÃOS JACK", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 13:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Phantom.png"));
                JOptionPane.showMessageDialog(null, "Equipamento precário – A cada ataque recebido, Phantom tem 20% de chances de ficar ferido.", "DESVANTAGENS - PHANTOM", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 14:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - The Clown.png"));
                JOptionPane.showMessageDialog(null, "Autoridade – The Clown toma 5 de dano adicional quando atacado por um fuzileiro naval ou um agente da força policial.", "DESVANTAGENS - THE CLOWN", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 15:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 02.png"));
                JOptionPane.showMessageDialog(null, "Repelido – Ao receber com sucesso dois ataques, Beta-02 perde a sua rodada.\n\nDefasado – Cada dano tomado a RES do Beta-02 diminui em 1.", "DESVANTAGENS - BETA-02", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 16:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Beta - 01.png"));
                JOptionPane.showMessageDialog(null, "Falha algorítmica – Os exploits dos Hackers funciona contra o Beta-01, \nalém disso se caso seu exo-esqueleto seja desabilitado, ele fica 1 rodada estunado.\n\nPesado – -2 de desvantagem no dado para DEFESA e QTE, também em corrida e velocidade.", "DESVANTAGENS - BETA-01", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 17:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Omega.png"));
                JOptionPane.showMessageDialog(null, "Em chamas – Toma dano extra de fogo além de perder todos os bónus no dado ao lutar em ambiente em chama.\n\nCounter – Ao impedir ou se defender com sucesso de um ataque steath de Ômega, ela perderá 1 de vantagem no dado de DEFESA por uma rodada.", "DESVANTAGENS - ÔMEGA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 18:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/H - Alfa.png"));
                JOptionPane.showMessageDialog(null, "Desprevinido – -1 de vantagem no dado para defesa quando Alfa estiver distraído, ou suprimido.", "DESVANTAGENS - ALFA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect1(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado new.png"));
                JOptionPane.showMessageDialog(null, "Estúpido – Menos 2 no dado para ações de percepções e defesa steath.", "DESVANTAGENS - INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cachorro Infectado.jpg"));
                JOptionPane.showMessageDialog(null, "Frágil – Ao receber um ataque com sucesso, um efeito de sangramento será automaticamente aplicado.", "DESVANTAGENS - CACHORRO INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado maldito.png"));
                JOptionPane.showMessageDialog(null, "Estúpido – Menos 1 no dado para ações de percepções e defesa steath.", "DESVANTAGENS - INFECTADO MALDITO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cacadores das sombras.png"));
                JOptionPane.showMessageDialog(null, "Frágil – Caçadores são extremamente fracos e vulneráveis especialmente ao fogo.\n"
                        + "\nLuz divina – Caçadores ficam assustados com luz UV e fogo, além de tomar dano adicional das mesmas.", "DESVANTAGENS - CAÇADORES DAS SOMBRAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Mumia possuida.png"));
                JOptionPane.showMessageDialog(null, "Depreciado – Menos 1 no dado para ações de defesa e em locomoção.", "DESVANTAGENS - MÚMIA POSSUÍDA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Cacadores da selva.png"));
                JOptionPane.showMessageDialog(null, "Cervo – Ao ver um aliado ser abatido um caçador entra em desespero ficando com -1 no dado para qualquer ação [duração de 1 rodada].", "DESVANTAGENS - CAÇADORES DA SELVA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Sucubus.jpg"));
                JOptionPane.showMessageDialog(null, "Rival – Toma um terço de dano adicional de outras mulheres", "DESVANTAGENS - SUCUBUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect1(int classes) {
        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado new.png"));
                JOptionPane.showMessageDialog(null, "Estúpido – Menos 2 no dado para ações de percepções e defesa steath.", "DESVANTAGENS - INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cachorro Infectado.jpg"));
                JOptionPane.showMessageDialog(null, "Frágil – Ao receber um ataque com sucesso, um efeito de sangramento será automaticamente aplicado.", "DESVANTAGENS - CACHORRO INFECTADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Infectado maldito.png"));
                JOptionPane.showMessageDialog(null, "Estúpido – Menos 1 no dado para ações de percepções e defesa steath.", "DESVANTAGENS - INFECTADO MALDITO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Cacadores das sombras.png"));
                JOptionPane.showMessageDialog(null, "Frágil – Caçadores são extremamente fracos e vulneráveis especialmente ao fogo.\n"
                        + "\nLuz divina – Caçadores ficam assustados com luz UV e fogo, além de tomar dano adicional das mesmas.", "DESVANTAGENS - CAÇADORES DAS SOMBRAS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/01 - Mumia possuida.png"));
                JOptionPane.showMessageDialog(null, "Depreciado – Menos 1 no dado para ações de defesa e em locomoção.", "DESVANTAGENS - MÚMIA POSSUÍDA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Cacadores da selva.png"));
                JOptionPane.showMessageDialog(null, "Cervo – Ao ver um aliado ser abatido um caçador entra em desespero ficando com -1 no dado para qualquer ação [duração de 1 rodada].", "DESVANTAGENS - CAÇADORES DA SELVA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/1 - Sucubus.jpg"));
                JOptionPane.showMessageDialog(null, "Rival – Toma um terço de dano adicional de outras mulheres", "DESVANTAGENS - SUCUBUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect2(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aberracao.png"));
                JOptionPane.showMessageDialog(null, "\nFrágil: Toma dano multiplicado por 10 de armas brancas - corporais.\n"
                        + "\n"
                        + "Despreparado: Morrem instantaneamente se receberem um ataque sem ter detectado o alvo.", "DESVANTAGENS - Aberração Demoníaca", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Infectado aprimorado.png"));
                JOptionPane.showMessageDialog(null, "\nCorpo exposto: Toma +1 de dano adicional contra fogo e golpes corporais.\n"
                        + "\n"
                        + "Olhos sensíveis: -1 de vantagem no dado para percepção ou esquiva em combates sob a luz do sol, ou uma de igual intensidade.", "DESVANTAGENS - INFECTADO APRIMORADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - DemonioAlado.jpg"));
                JOptionPane.showMessageDialog(null, "\nO dia é o meu inimigo: Morre insanamente ao entra em contato com a luz solar. "
                        + "\nAlém disso toma 15 de dano de luz ultravioleta.\n"
                        + "\n"
                        + "Fogo santo: Toma dano extra contra fogo. Sua RES é ignorada.", "DESVANTAGENS - DEMÓNIO ALADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Scorpion.png"));
                JOptionPane.showMessageDialog(null, "Parado – Scorpions fica 1 rodada a mais paralisados pelo efeito do gás de paralisia.\n"
                        + "\nOrgânico – Scorpions tem sua RES zerada ao ter sua carcaça destruída.", "DESVANTAGENS - SCORPION", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Lesma Negra.png"));
                JOptionPane.showMessageDialog(null, "Fraca - Morre insanamente ao ter o corpo esquartejado ou brutalmente separado [ESCOPETA].", "DESVANTAGENS - LESMA NEGRA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aranha gigante.jpg"));
                JOptionPane.showMessageDialog(null, "Light – Granadas de flash cega permanentemente as aranhas, fazendo-as tomar -1 no dado para todas as ações.", "DESVANTAGENS - ARANHA GIGANTE", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Chacal.png"));
                JOptionPane.showMessageDialog(null, "NENHUMA", "DESVANTAGENS - CHACAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Besta.png"));
                JOptionPane.showMessageDialog(null, "Desatento – -1 no dado para defesa steath e percepção.\n"
                        + "\nSuprimido – -1 no dado para ataque e defesa quando suprimido.", "DESVANTAGENS - BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Corrompedora de Homens.jpg"));
                JOptionPane.showMessageDialog(null, "Tristeza – Se o golpe da corrupção for resistido por uma mulher, a Corrompedora terá sua defesa reduzida na metade por duas rodada\nSe for resistida por um homem, além da redução da defesa, ela tomará o dobro de dano do homem que a resistiu", "DESVANTAGENS - CORROMPEDORA DE HOMENS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Demolidor.png"));
                JOptionPane.showMessageDialog(null, "Equilíbrio – Ataques bem sucedidos na cabeça do demolidor, geram 30% de chances de desiquilibra-lo, se ele cair ficará uma rodada fora de combate\n", "DESVANTAGENS - DEMOLIDOR", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - O carrasco.jpg"));
                JOptionPane.showMessageDialog(null, "Ferida exposta – O carrasco possui uma ferida exposta no peito, ao ser atingida com sucesso, ele toma 10 de dano adicional\n", "DESVANTAGENS - CARRASCO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Senhora dos Pesadelos.jpg"));
                JOptionPane.showMessageDialog(null, "Abençoado – Toma o dobro de dano do jogador com maior Karma", "DESVANTAGENS - SENHORA DO PESADELO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect2(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aberracao.png"));
                JOptionPane.showMessageDialog(null, "\nFrágil: Toma dano multiplicado por 10 de armas brancas - corporais.\n"
                        + "\n"
                        + "Despreparado: Morrem instantaneamente se receberem um ataque sem ter detectado o alvo.", "DESVANTAGENS - Aberração Demoníaca", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Infectado aprimorado.png"));
                JOptionPane.showMessageDialog(null, "\nCorpo exposto: Toma +1 de dano adicional contra fogo e golpes corporais.\n"
                        + "\n"
                        + "Olhos sensíveis: -1 de vantagem no dado para percepção ou esquiva em combates sob a luz do sol, ou uma de igual intensidade.", "DESVANTAGENS - INFECTADO APRIMORADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - DemonioAlado.jpg"));
                JOptionPane.showMessageDialog(null, "\nO dia é o meu inimigo: Morre insanamente ao entra em contato com a luz solar. "
                        + "\nAlém disso toma 15 de dano de luz ultravioleta.\n"
                        + "\n"
                        + "Fogo santo: Toma dano extra contra fogo. Sua RES é ignorada.", "DESVANTAGENS - DEMÓNIO ALADO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Scorpion.png"));
                JOptionPane.showMessageDialog(null, "Parado – Scorpions fica 1 rodada a mais paralisados pelo efeito do gás de paralisia.\n"
                        + "\nOrgânico – Scorpions tem sua RES zerada ao ter sua carcaça destruída.", "DESVANTAGENS - SCORPION", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Lesma Negra.png"));
                JOptionPane.showMessageDialog(null, "Fraca - Morre insanamente ao ter o corpo esquartejado ou brutalmente separado [ESCOPETA].", "DESVANTAGENS - LESMA NEGRA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Aranha gigante.jpg"));
                JOptionPane.showMessageDialog(null, "Light – Granadas de flash cega permanentemente as aranhas, fazendo-as tomar -1 no dado para todas as ações.", "DESVANTAGENS - ARANHA GIGANTE", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Chacal.png"));
                JOptionPane.showMessageDialog(null, "NENHUMA", "DESVANTAGENS - CHACAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 8:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/02 - Besta.png"));
                JOptionPane.showMessageDialog(null, "Desatento – -1 no dado para defesa steath e percepção.\n"
                        + "\nSuprimido – -1 no dado para ataque e defesa quando suprimido.", "DESVANTAGENS - BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 9:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Corrompedora de Homens.jpg"));
                JOptionPane.showMessageDialog(null, "Tristeza – Se o golpe da corrupção for resistido por uma mulher, a Corrompedora terá sua defesa reduzida na metade por duas rodada\nSe for resistida por um homem, além da redução da defesa, ela tomará o dobro de dano do homem que a resistiu", "DESVANTAGENS - CORROMPEDORA DE HOMENS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 10:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Demolidor.png"));
                JOptionPane.showMessageDialog(null, "Equilíbrio – Ataques bem sucedidos na cabeça do demolidor, geram 30% de chances de desiquilibra-lo, se ele cair ficará uma rodada fora de combate\n", "DESVANTAGENS - DEMOLIDOR", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 11:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - O carrasco.jpg"));
                JOptionPane.showMessageDialog(null, "Ferida exposta – O carrasco possui uma ferida exposta no peito, ao ser atingida com sucesso, ele toma 10 de dano adicional\n", "DESVANTAGENS - CARRASCO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 12:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/2 - Senhora dos Pesadelos.jpg"));
                JOptionPane.showMessageDialog(null, "Abençoado – Toma o dobro de dano do jogador com maior Karma", "DESVANTAGENS - SENHORA DO PESADELO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect3(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Hunter.png"));
                JOptionPane.showMessageDialog(null, "\nEnvenenado: Hunters tomam dano de veneno e outras substâncias tóxicas."
                        + "\n\nClemência: Um hunter pode optar por matar ou não um alvo de acordo com seu karma \n"
                        + "ou se esse alvo pedir perdão e misericórdia por seus atos.\n", "DESVANTAGENS - THE HUNTER", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Barao Infernal.png"));
                JOptionPane.showMessageDialog(null, "Chifre – Ao ter um dos chifres arrancados o Barão perde 50 de HP.\n", "VANTAGENS - BARÃO INFERNAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Bocejo.png"));
                JOptionPane.showMessageDialog(null, "Falha física – Após errar um ataque Bocejo toma -1 no dado para todas as ações na rodada subsequente.\n"
                        + "\nArranque a cabeça – Ao tomar um dano na cabeça, Bocejo leva +10 de dano adicional direto na vitalidade.", "DESVANTAGENS - BOCEJO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Ghost.png"));
                JOptionPane.showMessageDialog(null, "Centro neural – Ghost é muito suscetível a eletricidade e a exploits hackers, toda vez que for afetado por um desses, ele recebe -1 no dado para ações defensivas e ofensivas. \n"
                        + "\nHit-spot – Ghost possui pontos fracos que podem ser espotados, porém esses pontos só podem ser atingidos por uma sniper. Ao ter um ponto atingido Ghost toma 20 de dano adicional.", "DESVANTAGENS - GHOST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Cerberus.jpg"));
                JOptionPane.showMessageDialog(null, "NENHUMA", "DESVANTAGENS - CERBERUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - O Reanimador ver2.png"));
                JOptionPane.showMessageDialog(null, "Abençoados – Toma 10 de dano adicional de cada inimigo com Karma maior que 80.\n"
                        + "\nEnergia drenada - Após realizar uma invocação o reanimador ficara stunado por 1 rodada.\n", "DESVANTAGENS - O REANIMADOR ", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - Cilla.png"));
                JOptionPane.showMessageDialog(null, "Toxina - Cilla recebe dano extra de veneno.\n"
                        + "\nEm chamas - Cilla recebe dano extra de fogo.", "DESVANTAGENS - CILLA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect3(int classes) {
        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Hunter.png"));
                JOptionPane.showMessageDialog(null, "\nEnvenenado: Hunters tomam dano de veneno e outras substâncias tóxicas."
                        + "\n\nClemência: Um hunter pode optar por matar ou não um alvo de acordo com seu karma \n"
                        + "ou se esse alvo pedir perdão e misericórdia por seus atos.\n", "DESVANTAGENS - THE HUNTER", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Barao Infernal.png"));
                JOptionPane.showMessageDialog(null, "Chifre – Ao ter um dos chifres arrancados o Barão perde 50 de HP.\n", "VANTAGENS - BARÃO INFERNAL", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Bocejo.png"));
                JOptionPane.showMessageDialog(null, "Falha física – Após errar um ataque Bocejo toma -1 no dado para todas as ações na rodada subsequente.\n"
                        + "\nArranque a cabeça – Ao tomar um dano na cabeça, Bocejo leva +10 de dano adicional direto na vitalidade.", "DESVANTAGENS - BOCEJO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Ghost.png"));
                JOptionPane.showMessageDialog(null, "Centro neural – Ghost é muito suscetível a eletricidade e a exploits hackers, toda vez que for afetado por um desses, ele recebe -1 no dado para ações defensivas e ofensivas. \n"
                        + "\nHit-spot – Ghost possui pontos fracos que podem ser espotados, porém esses pontos só podem ser atingidos por uma sniper. Ao ter um ponto atingido Ghost toma 20 de dano adicional.", "DESVANTAGENS - GHOST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/03 - Cerberus.jpg"));
                JOptionPane.showMessageDialog(null, "NENHUMA", "DESVANTAGENS - CERBERUS", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 6:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - O Reanimador ver2.png"));
                JOptionPane.showMessageDialog(null, "Abençoados – Toma 10 de dano adicional de cada inimigo com Karma maior que 80.\n"
                        + "\nEnergia drenada - Após realizar uma invocação o reanimador ficara stunado por 1 rodada.\n", "DESVANTAGENS - O REANIMADOR ", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 7:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/3 - Cilla.png"));
                JOptionPane.showMessageDialog(null, "Toxina - Cilla recebe dano extra de veneno.\n"
                        + "\nEm chamas - Cilla recebe dano extra de fogo.", "DESVANTAGENS - CILLA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect4(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/4 - Alfa Besta.png"));
                JOptionPane.showMessageDialog(null, "Morto – Alfa está morrendo, e por isso toma 10 de dano por rodada\n"
                        + "\nOposto – Alfa recebe o dobro de dano do jogador com maior Karma.\n", "DESVANTAGENS - ALFA BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/04 - Cerberus 2.0.jpg"));
                JOptionPane.showMessageDialog(null, "Spot – Cerberus agora tem um ponto fraco localizado um pouco abaixo da barriga.\n"
                        + "Acertar esse ponto faz Cerberus tomar 30 de dano adicional.\n"
                        + "O ponto só pode ser acertado por Fuzil e Sniper. ", "DESVANTAGENS - CERBERUS 2.0", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensInfect4(int classes) {

        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/4 - Alfa Besta.png"));
                JOptionPane.showMessageDialog(null, "Morto – Alfa está morrendo, e por isso toma 10 de dano por rodada\n"
                        + "\nOposto – Alfa recebe o dobro de dano do jogador com maior Karma.\n", "DESVANTAGENS - ALFA BESTA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/04 - Cerberus 2.0.jpg"));
                JOptionPane.showMessageDialog(null, "Spot – Cerberus agora tem um ponto fraco localizado um pouco abaixo da barriga.\n"
                        + "Acertar esse ponto faz Cerberus tomar 30 de dano adicional.\n"
                        + "O ponto só pode ser acertado por Fuzil e Sniper. ", "DESVANTAGENS - CERBERUS 2.0", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }
    }

    public static void getDesvantagensAparicoes(JComboBox classes) {

        int classe = classes.getSelectedIndex();

        switch (classe) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Cabeca demoniaca.jpg"));
                JOptionPane.showMessageDialog(null, "Iluminado – Recua imediatamente após contato direto com luz ultravioleta ou granadas de flash.\n",
                        "DESVANTAGENS - CABEÇA DEMONIACA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Aparicoes.jpg"));
                JOptionPane.showMessageDialog(null, "Luz – Quando sob uma luz, a é imediatamente destruída.\n",
                        "DESVANTAGENS - APARIÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Manifestacoes.jpg"));
                JOptionPane.showMessageDialog(null, "Fogo – Manifestações podem ser afugentada com fogo (não serve para obter acesso a certos locais).\n"
                        + "\nLiberação – Manifestações podem ser dispensadas dos locais que ela possue se a fonte de seu poder for encontrada, ou com a ajuda de certos NPCs.\n",
                        "DESVANTAGENS - MANIFESTAÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Portheigast.jpg"));
                JOptionPane.showMessageDialog(null, "Interferência – Qualquer interferência eletrónica causada por um jogador ou qualquer outro motivo atordoará o poltergeist por uma rodada\n",
                        "DESVANTAGENS - POLTERGEIST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Sr Sorriso.jpg"));
                JOptionPane.showMessageDialog(null, "Iluminado – Eles não podem atacar o jogador com maior karma do grupo .\n",
                        "DESVANTAGENS - SENHORES DO SORRISO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    public static void getDesvantagensAparicoes(int classes) {
        switch (classes) {

            case 1:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Cabeca demoniaca.jpg"));
                JOptionPane.showMessageDialog(null, "Iluminado – Recua imediatamente após contato direto com luz ultravioleta ou granadas de flash.\n",
                        "DESVANTAGENS - CABEÇA DEMONIACA", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 2:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Aparicoes.jpg"));
                JOptionPane.showMessageDialog(null, "Luz – Quando sob uma luz, a é imediatamente destruída.\n",
                        "DESVANTAGENS - APARIÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 3:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Manifestacoes.jpg"));
                JOptionPane.showMessageDialog(null, "Fogo – Manifestações podem ser afugentada com fogo (não serve para obter acesso a certos locais).\n"
                        + "\nLiberação – Manifestações podem ser dispensadas dos locais que ela possue se a fonte de seu poder for encontrada, ou com a ajuda de certos NPCs.\n",
                        "DESVANTAGENS - MANIFESTAÇÕES", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 4:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Portheigast.jpg"));
                JOptionPane.showMessageDialog(null, "Interferência – Qualquer interferência eletrónica causada por um jogador ou qualquer outro motivo atordoará o poltergeist por uma rodada\n",
                        "DESVANTAGENS - POLTERGEIST", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            case 5:
                icone = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A - Sr Sorriso.jpg"));
                JOptionPane.showMessageDialog(null, "Iluminado – Eles não podem atacar o jogador com maior karma do grupo .\n",
                        "DESVANTAGENS - SENHORES DO SORRISO", JOptionPane.PLAIN_MESSAGE, icone);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NÃO HÁ INIMIGO SELECIONADO");
        }

    }

    //</editor-fold>
}
