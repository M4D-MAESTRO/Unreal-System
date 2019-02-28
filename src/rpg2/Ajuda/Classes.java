/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ajuda;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class Classes {

    static ImageIcon imagem = null;

    public static void cleanDefault(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText(""); // Descricao

        areas[1].setText(""); // Vantagens

        areas[2].setText(""); // Desvantagens

        areas[3].setText(""); // Habilidades

        areas[4].setText(""); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText(""); // KARMA

        campos[5].setText(""); // FOR

        campos[6].setText(""); // STM

        campos[7].setText(""); // RES

        campos[8].setText(""); // PER

        campos[9].setText(""); // INT

        campos[10].setText(""); // PES

        campos[11].setText(""); // CAR
    }

    public static void getFuzileiro(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText("A classe mais recomendada para quem gosta de estar na linha de frente, Os fuzileiros podem facilmente serem comparados a típicos guerreiros das eras medievais, focando-se totalmente em dano e no combate."); // Descricao

        areas[1].setText("Guerreiro de campo – Sua FORÇA ganha +2 de bónus.\n"
                + "\n"
                + "Dor & Ganho – Sua RESISTÊNCIA ganha +2 de bónus.\n"
                + "\n"
                + "Gunner – Ganhe +2 de vantagem no dado ao atacar usando, fuzil, pistola, submetralhadora ou qualquer arma branca.\n"
                + "\n"
                + "Fuzil-Slayer – Um fuzil não ocupará espaço no seu inventário. Além disso, todos os fuzis perdem 1 de requerimento de FORÇA para você pode usar.\n"
                + "\n"
                + "Calor da batalha- Toda vez que for atacado corpo-a-corpo, você pode optar por se defender atacando com a coronha ou baioneta da arma, ao invés de jogar o dado proporcional a STAMINA, jogue o proporcional à FORÇA. \n"
                + "ATENÇÃO: Caso seja atacado por mais de um inimigo ao mesmo tempo, você só poderá usar essa vantagem em um e não todos."); // Vantagens

        areas[2].setText("Barulhento – Em testes de stealth, -2 no dado.\n"
                + "\n"
                + "Servir e proteger – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, ou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não.\n"
                + "\n"
                + "Antiterrorista – Você ataca sem hesitar qualquer terrorista que vê.\n"
                + "ATENÇÃO: O ataque não é em frenesi, você pode formular estratégias e atacar com sabedoria."); // Desvantagens

        areas[3].setText("Level 10 - Ao alcançar o level 10, você não entrará mais em pânico, ou precisará fazer teste de coragem.\n"
                + "\n"
                + "Level 20 – Mesmo exausto ou com a apetência zerada, você ainda conseguirá viver mais um dia sem receber qualquer desvantagem por isso.\n"
                + "\n"
                + "Level 30- Se algum de seus aliados cair gravemente ferido, ou se o sua vitalidade cair abaixo de 0, entre no modo BERSERK.\n"
                + "Modo BERSERK: Ao entrar no modo BERSERK sua vitalidade volta ao máximo, você passa a ignorar a dor e pode se movimentar mais rapidamente, mesmo com equipamentos pesados. Todo dano que receber é reduzido na metade, e seu dano corpo-a-corpo aumenta em +10.\n"
                + "O modo BERSERK é cancelado caso sua vitalidade caia abaixo de 30 ou, após um período de 10 minutos. No modo BERSERK você ainda mantem sua consciência, porém, não consegue mais mirar tão bem, perdendo um ponto de vantagem no dado ao atacar com arma de fogo. Após o fim do modo BERSERK, sua vitalidade cai para 20, você fica em exaustão e apenas um médico poderá te curar."); // Habilidades

        areas[4].setText("Equipamentos:\n"
                + "1x M16.\n"
                + "1x Beretta M9.\n"
                + "1x Faca.\n"
                + "Colete Médio.\n"
                + "\n"
                + "Intens:\n"
                + "50x Munição (PISTOLA).\n"
                + "60x Munição (FUZIL).\n"
                + "2x Granadas (EXPLOSIVA).\n"
                + "1x C4\n"
                + "1x Spray de primeiros socorros."); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText("70"); // KARMA

        campos[5].setText("4 + 2"); // FOR

        campos[6].setText("2"); // STM

        campos[7].setText("2 + 2"); // RES

        campos[8].setText("1"); // PER

        campos[9].setText("0"); // INT

        campos[10].setText("1"); // PES

        campos[11].setText("0"); // CAR
    }

    public static void getPolicial(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText("A classe mais recomendada para os tanques, o policial pode ser facilmente comparado a um paladino que se preocupa tanto em eliminar seus inimigos, quanto em proteger seus aliados além de possuir um senso muito grande de justiça e bondade."); // Descricao

        areas[1].setText("Força bruta – Caso acerte três infectados com um único tiro de escopeta, ganhe outro ataque (NÃO CUMULATIVO). Além disso, ganhe um bónus de +2 de FORÇA.\n"
                + "\n"
                + "Escudeiro – Permite você se defender usando seu escudo antimotim, caso, ele esteja equipado em uma de suas mãos. Escolha entre FORÇA ou STAMINA o dado que será usado como defesa.\n"
                + "\n"
                + "Escopeta-Slayer – Uma escopeta de sua escolha, não ocupará espaço no slot. Além disso, cai em 1 o requisito para usar qualquer escopeta.\n"
                + "\n"
                + "Combatente defensivo – Caso um aliado perto de você vá sofrer um ataque, você tem a escolha de intervir usando seu escudo antimotim. APENAS UM ALIADO QUE ESTEJA PERTO. Além disso, ganha um bónus de +2 de RESISTÊNCIA\n"
                + "\n"
                + "Controle de pânico – A custa de um turno, você pode acalmar os ânimos de seus aliados, fazendo com que voltem ao combate, ou que realizem um comando seu.\n"
                + "\n"
                + "Interrogatório – Ao ter algemado contigo um inimigo, ou suspeito, E estando em um lugar isolado, descubra todas as informações que ele guarda. NÃO FUNCIONA COM BOSS."); // Vantagens

        areas[2].setText("Proteger e servir – Você não pode ignorar um aliado ou civil em perigo, mas vale lembrar, caso o aliado em questão não tenha uma boa relação contigo, ou esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha ajudar ou não.\n"
                + "\n"
                + "O bom exemplo – Como policial, você não pode roubar itens de pessoas boas, assim como não pode atacar um aliado ou civil que não tenha feito nada de errado, mas, caso o item em questão seja de missão, ou, o aliado esteja com o KARMA abaixo de 50, passa-se a ser de sua escolha fazer, ou não tal atitude.\n"
                + "\n"
                + "Lei & Ordem – Você ataca sem hesitar, mas com estratégia, criminosos e bandidos. Além disso, sempre intervém e situações problemáticas e de caos."); // Desvantagens

        areas[3].setText("Level 10 - Ao alcançar o level 10, você receberá a habilidade GRITO DE ORDEM, que lhe permite intimidar inimigos humanos e amenizar badernas.\n"
                + "\n"
                + "Level 20 - Ao se defender ou atacar usando o escudo, você irá automaticamente atordoar um inimigo, que receberá uma penalidade de -2 no dado na próxima jogada. Você também ganhara direito a realizar um ataque em seguida. \n"
                + "\n"
                + "Level 30- Ao defender com sucesso um aliado, você e o aliado recuperará +15 de VITALIDADE, além disso, a próxima rodada passa a ser a do seu aliado, caso a rodada já fosse ser dele, passa a ser sua. "); // Habilidades

        areas[4].setText("Equipamentos:\n"
                + "1x M37 Stakeout.\n"
                + "1x Beretta M9-F.\n"
                + "1x Cassetete policial.\n"
                + "1x Escudo antimotim\n"
                + "Colete Pesado.\n"
                + "\n"
                + "Intens:\n"
                + "50x Munição (PISTOLA).\n"
                + "15x Munição (ESCOPETA).\n"
                + "2x Granadas (EXPLOSIVA).\n"
                + "2x Granadas (DISTRAÇÃO)\n"
                + "1x Spray de primeiros socorros."); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText("100"); // KARMA

        campos[5].setText("3 + 2"); // FOR

        campos[6].setText("1"); // STM

        campos[7].setText("2 + 2"); // RES

        campos[8].setText("2"); // PER

        campos[9].setText("1"); // INT

        campos[10].setText("0"); // PES

        campos[11].setText("1"); // CAR
    }

    public static void getBHC(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText("A classe mais recomendada para quem gostar de fazer as coisas com calma, estratégia e em silêncio. Os agentes da B.H.C podem facilmente serem comparados com um assassino que aguarda a hora certa para atacar e que ataca com total precisão."); // Descricao

        areas[1].setText("Biohazard - Imune a infecções, exceto BOSS e ESPECIAIS.\n"
                + "\n"
                + "Combatente veloz - SE, todos seus equipamentos forem leve, ganhe +2 de vantagem no dado para, correr, esquivar, atacar (corpo-a-corpo) e QTE.\n"
                + "\n"
                + "Sub-Slayer - Uma submetralhadora de sua escolha, não ocupará espaço no slot. Além disso, todas as submetralhadoras perdem 1 de requerimento de FORÇA para você pode usar. \n"
                + "\n"
                + "Percepção - Ganhe +2 de vantagem no dado em testes de percepção.\n"
                + "\n"
                + "Conhecimento infectante - Conhece tudo sobre os inimigos infectados de nível 1 e 2, inclusive suas fraquezas.\n"
                + "\n"
                + "Silêncio - Ganhe +1 de vantagem no dado ao realizar um ataque corpo-a-corpo em stealth."); // Vantagens

        areas[2].setText("Olhar vazio - Em testes de carismas, -3 no dado.\n"
                + "\n"
                + "Subpeso -Além de não pode usar equipamento pesado, você pode apenas carregar duas armas em seu slot (a arma no slot especial da vantagem SUB-SLAYER não conta)."); // Desvantagens

        areas[3].setText("Level 10 - Ao alcançar o level 10, você poderá usar uma pistola em cada mão. Se optar por assim fazer, selecione dois alvos para atirar ao mesmo tempo, ou, um único alvo para tomar os dois tiros.\n"
                + "\n"
                + "Level 20 - Ao usar equipamentos leves e armas silenciosas, ganhe +1 de vantagem em qualquer ataque, stealth ou não, corpo-a-corpo ou não.\n"
                + "\n"
                + "Level 30- Mantenha TODOS os seus bônus mesmo usando equipamento médio."); // Habilidades

        areas[4].setText("Equipamentos:\n"
                + "1x MP5-S.\n"
                + "1x Glock 17-S.\n"
                + "1x Stun Rod.\n"
                + "Colete Leve.\n"
                + "Máscara de filtro.\n"
                + "\n"
                + "Itens:\n"
                + "50x Munição (PISTOLA).\n"
                + "60x Munição (Submetralhadora).\n"
                + "2x Granadas (FLASH).\n"
                + "1x Spray de primeiros socorros."); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText("70"); // KARMA

        campos[5].setText("3"); // FOR

        campos[6].setText("3"); // STM

        campos[7].setText("1"); // RES

        campos[8].setText("1"); // PER

        campos[9].setText("2"); // INT

        campos[10].setText("0"); // PES

        campos[11].setText("0"); // CAR
    }

    public static void getHacker(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText("A classe mais recomendada para quem quer apoiar seus aliados fornecendo informação sobre a batalha, criando distrações, mas ainda sim estando diretamente ligado ao combate.\n"
                + "O hacker pode facilmente ser comparado a um arqueiro que mantém certa distância do campo de batalha, mas ainda está lá avistando tudo."); // Descricao

        areas[1].setText("Mente brilhante – Ganhe +2 de INTELIGÊNCIA.\n"
                + "\n"
                + "Conhecimento tecnológico – Permite um hacker invadir portas de segurança eletrônica, assim como cofres eletrônicos usando seu terminal eletrônico.\n"
                + "\n"
                + "Exploit – Você pode criar exploits utilizando componentes eletrônicos e usa-los em sistemas cujo já tenha acesso. Usar um exploit em combate conta como uma rodada, embora, você possa mesmo após usar o exploit, realizar mais uma ação que não seja de ataque.\n"
                + "\n"
                + "O técnico – Como hacker, quando você e/ou seu grupo estiverem preso em algum enigma ou problema jogue um D6, caso caia par, o mestre terá que te dizer a solução do enigma ou problema, caso caia ímpar, nada! Essa vantagem só pode ser utilizada uma vez por enigma/problema E uma vez a cada 6 horas.\n"
                + "\n"
                + "Engenharia social – Ganhe +2 de vantagem no dado em qualquer teste de carisma."); // Vantagens

        areas[2].setText("Cracker – Ao realizar uma atitude ruim, perca +10 de KARMA adicional e lembre-se! Se o seu KARMA cair abaixo de 20 haverá terríveis consequências.\n"
                + "\n"
                + "Orgulho – Impossível de resistir a uma provocação, e sempre que provocado você irá inevitavelmente atacar.\n"
                + "\n"
                + "Despreparo armado – Como hacker, você nunca poderá utilizar uma arma de fogo, ou branca do tipo ESPECIAL, porém, consegue utilizar qualquer outra sem penalizações."); // Desvantagens

        areas[3].setText("Level 10 - Ao alcançar o level 10 componentes eletrônicos utilizados para criar um exploit reduz em 1.\n"
                + "\n"
                + "Level 20 – Exploits avançados. Você agora poderá hackear novos sistemas, inclusive as de segurança como torretas eletrônicas, não só neutralizando-as, mas, utilizando em favor próprio.\n"
                + "\n"
                + "Level 30- Seu exploit SCANER foi aprimorado e você consegue descobrir a posição de qualquer inimigo, mesmo os invisíveis e por tempo indeterminado. Além disso, inimigos expostos, atacados ou que receberam qualquer desvantagem por causa de um exploit seu, recebe também -2 de desvantagem no dado para qualquer ação, EXCLUI alguns infectados de nível 3 e o de nível 4. "); // Habilidades

        areas[4].setText("Equipamentos:\n"
                + "1x Colt 1911.\n"
                + "1x Terminal portátil.\n"
                + "1x Bastão retrátil.\n"
                + "\n"
                + "Itens:\n"
                + "30x Munição (PISTOLA).\n"
                + "10x Componentes eletrônicos.\n"
                + "1x Spray de primeiros socorros.\n"
                + "\n"
                + "Exploits:\n"
                + "Scanner – 5 CEH.\n"
                + "Hackeamento de ambiente civil – 1 CEH.\n"
                + "Drone & Carrinho de hackeamento – 2 CEH.\n"
                + "Distração comunicativa – 2 CEH.     \n"
                + "Apagão Local – 5 CEH.                \n"
                + "Dispositivo eletrônico – 2 CEH.\n"
                + "\n"
                + "Exploits avançados:\n"
                + "Hackeamento de ambiente militar – 3 CEH.\n"
                + "Drone & Carrinho de combate – 8 CEH.\n"
                + "Deturpação comunicativa – 5 CEH.\n"
                + "Dispositivo explosivo – 3 CEH.\n"
                + "Apagão geral – 10 CEH."); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText("50"); // KARMA

        campos[5].setText("2"); // FOR

        campos[6].setText("3"); // STM

        campos[7].setText("1"); // RES

        campos[8].setText("1"); // PER

        campos[9].setText("2 + 2"); // INT

        campos[10].setText("0"); // PES

        campos[11].setText("1"); // CAR
    }

    public static void getQuimico(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText("A classe mais recomendada para quem quer dar apoio e suporte a seus aliados matando e atrapalhando seus inimigos.\n"
                + "Um químico pode facilmente ser comparado a um mago que usa de sua inteligência e sabedoria para matar facilmente ou paralisar seus inimigos no combate."); // Descricao

        areas[1].setText("Mente brilhante – Ganhe +2 de INTELIGÊNCIA.\n"
                + "\n"
                + "Atenção – Ganhe +2 de PERCEPÇÃO.\n"
                + "\n"
                + "Conhecimento químico – Você pode criar explosivos químicos como granada improvisada, C4 e até granada venenosa utilizando componentes químicos além de munição para a sua lançadora química.\n"
                + "\n"
                + "Anticorpos químico – Menos chances de ser infectado, menos dano de armas químicas, veneno e outros danos tóxicos.\n"
                + "\n"
                + "Venenoso – Te permite buffar com veneno comum (para humanos), ou neutralizador (para os infectados), qualquer arma branca do tipo BRUTA ou CORTE."); // Vantagens

        areas[2].setText("Medroso – As chances de seu personagem entrar em pânico são maiores, além disso, -1 em qualquer teste de coragem.\n"
                + "\n"
                + "Despreparado – Um químico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado.\n"
                + "ATENÇÃO, um químico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. Por exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai."); // Desvantagens

        areas[3].setText("Level 10 - Ao alcançar o level 10 componentes químicos utilizados para criar itens explosivos ou venenosos é reduzido em 2.\n"
                + "\n"
                + "Level 20 – Agora seus aliados não tomam mais dano de suas armas químicas.\n"
                + "\n"
                + "Level 30- Suas bombas químicas, e seu buff (VENENOSO) agora não precisa mais alternar entre veneno comum ou neutralizante, você desenvolveu um novo componente químico que suporta os dois juntos."); // Habilidades

        areas[4].setText("Equipamentos:\n"
                + "1x Lançadora química.\n"
                + "1x Stun rod.\n"
                + "Máscara de filtro.\n"
                + "\n"
                + "Itens:\n"
                + "10x Componentes químicos - EXPLOSIVOS.\n"
                + "10x Componentes químicos - HOSPITALAR.\n"
                + "5x Munição-Química(NEUTRALIZADORA).\n"
                + "5x Munição-Química(VENENOSA).\n"
                + "1x Spray de primeiros socorros \n"
                + "\n"
                + "Criação de itens explosivos:\n"
                + "Granada de Distração – 4 CQE.\n"
                + "Granada Flashbang – 5 CQE.\n"
                + "Granada Frag – 6 CQE.\n"
                + "Granada Semtex – 7 CQE.\n"
                + "Granada Venenosa – 5 CQE e 3 CQH.\n"
                + "C4 – 10 CQE.\n"
                + "Claymore – 8 CQE.\n"
                + "Granadas químicas – 3 CQE."); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText("70"); // KARMA

        campos[5].setText("1"); // FOR

        campos[6].setText("2"); // STM

        campos[7].setText("2"); // RES

        campos[8].setText("2 + 2"); // PER

        campos[9].setText("3 + 2"); // INT

        campos[10].setText("0"); // PES

        campos[11].setText("0"); // CAR
    }

    public static void getImagem(JLabel label, int opcao) {
        switch (opcao) {
            case 1: // Fuzileiro Naval
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FN.png")));
                break;

            case 2: // Força Policial
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FP.png")));
                break;

            case 3: // B.H.C
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/BHC.jpg")));
                break;

            case 4: // Hacker
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Hacker.png")));
                break;

            case 5: // Químico
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Quimico.png")));
                break;

            case 6: // Médico
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Medico.png")));
                break;

            case 7: // Engenheiro
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Engenheiro.png")));
                break;

            default:
                label.setIcon(imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/BHC.png")));
        }
    }

    public static void getMedico(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText("A classe mais recomendada para quem deseja ajudar seus aliados deixando-os vivos e não se envolver muito em combates.\n"
                + "Um médico pode facilmente ser comparado a um clérigo ou sacerdote que busca sempre cuidar das feridas de seus companheiros."); // Descricao

        areas[1].setText("Mente brilhante – Ganhe +2 de INTELIGÊNCIA.\n"
                + "\n"
                + "Atenção – Ganhe +2 de PERCEPÇÃO.\n"
                + "\n"
                + "Conhecimento hospitalar – Você pode criar itens médicos utilizando componentes químicos-hospitalar e usa-los em pessoas necessitadas, inclusive em si mesmo. Caso esteja em combate, você poderá utilizar um item, sem custar sua rodada, porém sua próxima ação independente de qual seja irá encerrar sua rodada.\n"
                + "\n"
                + "O técnico – Você recarregara suas vacinas de cura M de volta para 3 e adicionalmente, recarrega sua vacina anti-infecção de volta para 1, após descansar sem gastar componentes ou qualquer outra coisa.\n"
                + "\n"
                + "Mãos habilidosas – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo INCLUSIVE BOSS quando usando uma arma branca do tipo CORTE."); // Vantagens

        areas[2].setText("Juramento pela vida – Ao enfrentar inimigos humanos, você não conseguirá zerar a vitalidade deles, caso seu ataque gere um dano superior à vitalidade restante do inimigo, o HP dele ficará em 1, mas seu próximo ataque nesse inimigo pode mata-lo.\n"
                + "\n"
                + "Despreparado – Um médico NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado.\n"
                + "ATENÇÃO, um médico nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. Por exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai.\n"
                + "\n"
                + "\n"
                + ""); // Desvantagens

        areas[3].setText("Level 10 - Ao alcançar o level 10 componentes químicos-hospitalar utilizados para criar itens de cura reduz em 2.\n"
                + "\n"
                + "Level 20 – Ao reviver um aliado, você recupera totalmente a vitalidade dele, mas, isso só pode ocorrer uma vez por combate.\n"
                + "\n"
                + "Level 30- Ao estar em combate com seus aliados, a RESISTÊNCIA deles e sua recebem um buff de +1, ao fim de suas respectivas rodadas, eles curam +1 de VITALIDADE e além disso, suas vacina de cura M passaram a ser G, e subiu para 2 o número de vacinas anti-infcção que você pode carregar. "); // Habilidades

        areas[4].setText("Equipamentos:\n"
                + "1x Kris.\n"
                + "1x Stun gun.\n"
                + "1x Kit de sobrevivência.\n"
                + "\n"
                + "Itens:\n"
                + "10x Componentes químicos-hospitalar.\n"
                + "1x Kit de primeiros socorros.\n"
                + "1x Vacinas anti-infecção.\n"
                + "3x Vacinas de cura M\n"
                + "\n"
                + "Criação de itens de cura:\n"
                + "Pílula P – 4 CQH.\n"
                + "Pílula M – 6 CQH.\n"
                + "Pílula G – 8 CQH.\n"
                + "Vacina M/G – 10 CQH.\n"
                + "Vacina Anti-infecção – 10 CQH."); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText("100"); // KARMA

        campos[5].setText("1"); // FOR

        campos[6].setText("2"); // STM

        campos[7].setText("1"); // RES

        campos[8].setText("2 + 2"); // PER

        campos[9].setText("3 + 2"); // INT

        campos[10].setText("0"); // PES

        campos[11].setText("1"); // CAR
    }

    public static void getEngenheiro(JTextArea[] areas, JTextField[] campos) {
        areas[0].setText("A classe mais recomendada para quem quer ser sorrateiro e passar despercebido, além de apoiar seus aliados cuidando de seus equipamentos.\n"
                + "Um engenheiro é difícil de ser comparado, mas eu diria que ele está entre um ladino que tenta sempre ser sorrateiro e usa de sua carisma para conseguir o que quer, e um ferreiro apto a construir."); // Descricao

        areas[1].setText("Engenheiro Adaptável – Permite construir armas brancas e aprimorar tanto as armas brancas, quanto as de fogo utilizando componentes de construção.\n"
                + "\n"
                + "Conhecimento civil – Permite um engenheiro arrombar uma porta ou cadeado simples usando seu kit de ferramentas, assim como reparar veículos.\n"
                + "\n"
                + "Mestre de obras – Você pode criar barricadas de madeiras em quaisquer janelas ou portas gastando componentes de construção, caso esteja em batalha, custará uma rodada.\n"
                + "\n"
                + "Combatente civil – Diminua em um, a diferença para realizar um ataque crítico em qualquer inimigo INCLUSIVE BOSS quando usando uma arma branca do tipo bruta.\n"
                + "\n"
                + "Sr. Sorriso – Ganhe +2 de carisma."); // Vantagens

        areas[2].setText("Medroso – As chances de seu personagem entrar em pânico são maiores, além disso, -1 em qualquer teste de coragem.\n"
                + "\n"
                + "Despreparado – Um engenheiro NÃO pode utilizar armas de fogo do tipo especial. E ao utilizar qualquer outra arma de fogo, tenha uma desvantagem de -1 no dado.\n"
                + "ATENÇÃO, um engenheiro nunca irá conseguir manusear uma arma do tipo especial, mas a desvantagem pode ser suprimida ao adquirir perícia com algum tipo de arma. Por exemplo, ao adquirir perícia em pistolas, você não terá mais a desvantagem, porém, ela ainda contará para outras armas como submetralhadoras, fuzis, escopetas e por ai vai."); // Desvantagens

        areas[3].setText("Level 10 - Ao alcançar o level 10, você poderá criar acessórios para armas de fogo.\n"
                + "\n"
                + "Level 20 – Você agora pode arrombar quase todos os tipos de portas e cadeados, excluindo as de missão principal em alguns casos.\n"
                + "\n"
                + "Level 30- Cai para 2 a diferença para realizar um ataque crítico em um inimigo, inclusive BOSS enquanto usa uma arma branca do tipo bruta ou especial."); // Habilidades

        areas[4].setText("Equipamentos:\n"
                + "1x Pá.\n"
                + "1x Kit de ferramentas.\n"
                + "1x Lanterna.\n"
                + "\n"
                + "Itens:\n"
                + "1x Kit de primeiros socorros.\n"
                + "30x Componentes de construção.\n"
                + "\n"
                + "Criação de objetos:\n"
                + "Barricadas em janelas – 2 CC.\n"
                + "Barricadas em portas – 3 CC.\n"
                + "Máscara de gás – 5 CC.\n"
                + "Soco inglês - 20 CC. \n"
                + "Bastão retrátil – 10 CC. \n"
                + "Pá – 25 CC.\n"
                + "Escudo Policial – 15 CC.\n"
                + "\n"
                + "\n"
                + "Criação de acessórios:\n"
                + "Munição perfurante – 10 CC.\n"
                + "Silenciador – 12 CC.\n"
                + "Mira ACOG – 15 CC.\n"
                + "Mira Red dot - 20 CC. \n"
                + "Mira de zoom longol – 25 CC. \n"
                + "Mira Laser– 15 CC.\n"
                + "Grip – 10 CC.\n"
                + "Escopeta acoplada – 20 CC.\n"
                + "Pente duplo – 15 CC.\n"
                + "Pente estendido – 15 CC."); // Equipamentos

        campos[0].setText("1"); // LEVEL

        campos[1].setText("100"); // VIT

        campos[2].setText("100"); // APE

        campos[3].setText("1"); // ESP

        campos[4].setText("70"); // KARMA

        campos[5].setText("1"); // FOR

        campos[6].setText("2"); // STM

        campos[7].setText("2"); // RES

        campos[8].setText("1"); // PER

        campos[9].setText("2"); // INT

        campos[10].setText("1"); // PES

        campos[11].setText("1 + 2"); // CAR
    }
}
