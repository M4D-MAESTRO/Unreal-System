/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Imagens;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author M4ESTRO
 */
public class Imagens {

    //Imagens imagens = new Imagens();
    static ImageIcon imagem = null;
    static ImageIcon iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone64.png"));

    public static Image getIconeTela() {
        return iconeTela.getImage();
    }

    public static Image getIconeTela(int opcao) {
        switch (opcao) {
            case 0:
                iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone64.png"));
                break;
            case 1:
                iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone ajuda.png"));
                break;

            case 2:
                iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone batalha.png"));
                break;

            case 3:
                iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone bau.png"));
                break;

            case 4:
                iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone dado.png"));
                break;

            case 5:
                iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone mapa.png"));
                break;

            case 6:
                iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone porcentagem.png"));
                break;
        }

        return iconeTela.getImage();
    }

    //<editor-fold defaultstate="collapsed" desc=" Classes Masculinas">
    public static void setClasseImagem(int opcao) {

        switch (opcao) {
            case 0:
                JOptionPane.showMessageDialog(null, "CLASSE INVÁLIDA!", "Selecione uma classe", JOptionPane.ERROR_MESSAGE);

                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FN.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: FUZILEIRO NAVAL | Sexo: Masculino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FP.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: FORÇA POLICIAL | Sexo: Masculino ", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/BHC.jpg"));
                JOptionPane.showMessageDialog(null, "", "Classe: B.H.C | Sexo: Masculino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Hacker.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: HACKER | Sexo: Masculino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Quimico.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: QUÍMICO | Sexo: Masculino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Medico.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: MÉDICO | Sexo: Masculino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Engenheiro.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: ENGENHEIRO | Sexo: Masculino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/amaldicoado.jpg"));
                JOptionPane.showMessageDialog(null, "", "Classe: AMALDIÇOADO | Sexo: - ", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

        }

    }

    public static ImageIcon getClasseImagem(int opcao) {
        ImageIcon imagem = null;

        switch (opcao) {

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FN.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FP.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/BHC.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Hacker.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Quimico.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Medico.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Engenheiro.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Default_classe.jpg"));
                break;

        }

        return imagem;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Classes Femeninas">
    public static void setClasseImagemF(int opcao) {

        switch (opcao) {
            case 0:
                JOptionPane.showMessageDialog(null, "CLASSE INVÁLIDA!", "Selecione uma classe", JOptionPane.ERROR_MESSAGE);

                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FN_F.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: FUZILEIRO NAVAL | Sexo: Feminino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/FP_F.jpg"));
                JOptionPane.showMessageDialog(null, "", "Classe: FORÇA POLICIAL | Sexo: Feminino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/BHC.jpg"));
                JOptionPane.showMessageDialog(null, "", "Classe: B.H.C | Sexo: Feminino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Hacker_F.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: HACKER | Sexo: Feminino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Quimico.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: QUÍMICO | Sexo: Feminino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Medico_F.png"));
                JOptionPane.showMessageDialog(null, "", "Classe: MÉDICO | Sexo: Feminino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Classes/Engenheiro_F.jpg"));
                JOptionPane.showMessageDialog(null, "", "Classe: ENGENHEIRO | Sexo: Feminino", JOptionPane.PLAIN_MESSAGE, imagem);

                break;

        }

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Inimigos">
    public static void setImagemHumano(int opcao, JLabel foto) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bandido.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Psicopatas.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Terrorista.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/O sadista.jpg"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Mercenario.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Agente da Unreal.jpg"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cacador da Unreal.png"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Combatente da Unreal.jpg"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pigsaw.jpg"));
                break;

            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/O Reanimador ver1.jpg"));
                break;

            case 11:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/A bruxa.jpg"));
                break;

            case 12:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Irmaos Jack.png"));
                break;

            case 13:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Phantom.png"));
                break;

            case 14:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/The Clown.png"));
                break;

            case 15:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Beta - 02.jpg"));
                break;

            case 16:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Beta - 01.png"));
                break;

            case 17:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Omega.png"));
                break;

            case 18:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Alfa.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Skull 01.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setImagemInfectados1(int opcao, JLabel foto) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Infectado new.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cachorro Infectado.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Infectado maldito.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cacadores das sombras.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Mumia possuida.jpg"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cacadores da selva.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Sucubus.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Skull 01.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setImagemInfectados2(int opcao, JLabel foto) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Aberracao.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Infectado aprimorado.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/DemonioAlado.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Scorpion.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Lesma Negra.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Aranha gigante.jpg"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Chacal.png"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Besta.jpg"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corrompedora de Homens.jpg"));
                break;

            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Demolidor.png"));
                break;

            case 11:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/O carrasco.jpg"));
                break;

            case 12:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Senhora dos Pesadelos.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Skull 01.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setImagemInfectados3(int opcao, JLabel foto) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Hunter.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Barao Infernal.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bocejo.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Ghost.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cerberus.jpg"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/O Reanimador ver2.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cilla.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec2.jpg"));

        }
        foto.setIcon(imagem);
    }

    public static void setImagemInfectados4(int opcao, JLabel foto) {

        switch (opcao) {

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Alfa Besta.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cerberus 2.0.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Besta apocalipstica.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec4.jpg"));

        }
        foto.setIcon(imagem);
    }

    public static void setImagemAparicoes(int opcao, JLabel foto) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Cabeca demoniaca.jpg"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Aparicoes.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Manifestacoes.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Portheigast.jpg"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Sr Sorriso.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec4.jpg"));

        }
        foto.setIcon(imagem);
    }

    public static void setImagemDefault(int opcao, JLabel foto) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/human.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec1.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec2.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec3.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec4.jpg"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec5.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/defaultT.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setImagemDefault(JLabel foto) {

        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/defaultT.png"));
        foto.setIcon(imagem);
    }

    public static void setImagemRPG(int opcao, JLabel foto) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/human.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec1.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec2.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec3.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/infec4.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/defaultT.png"));

        }
        foto.setIcon(imagem);
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Armas">
    public static void setImagemDefaultArma(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/ArmaPadrao.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/ArmaFogo.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/ArmaBranca.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/ArmaUsavel.png"));
                break;
        }

        foto.setIcon(imagem);
    }

    public static void setPistola(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/ELITE-Mauser.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/01 - m1911.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/02 - m9.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/02.2 - m9_flashlight.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/03 - glock17.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/03.3 - glock17_silenced.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/04 - M3Socom.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/05 - mp443_grach.png"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/06 - PMR30_RD01.jpg"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/07 - m93r.png"));
                break;

            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/09 - MAUSER.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Pistolas/ELITE-Mauser.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setSub(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/ELITE-MP5.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/01 - mp5.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/02 - mp5_adv.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/03 - MP5k.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/04 - mp7.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/05 - p90.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/06 - pp2000.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/07 - ump.png"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/08 - famas.png"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/09 - pp19.png"));
                break;

            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/10 - mtar.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Submetralhadoras/ELITE-MP5.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setFuzil(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M4A1-ELITE.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/01 - m4a1 (2).png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/02 - m16a4.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/03 - m416.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/04 - ak74m.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/05 - scarh.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/06 - scarl.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/07 - acr.png"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/08 - sg553lb.png"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/09 - a91.png"));
                break;

            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/10 - g36c.png"));
                break;

            case 11:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/11 - f2000.png"));
                break;

            case 12:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/12 - m39.png"));
                break;

            case 13:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/13 - g3.png"));
                break;

            case 14:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/14 - l85a2.png"));
                break;

            case 15:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/15 - m249.png"));
                break;

            case 16:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/16 - m60.png"));
                break;

            case 17:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fuzis/17 - type88.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M4A1-ELITE.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setEscopeta(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/ELITE-M37.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/01 - Ranger.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/02 - Stakeout.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/03 - remington870.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/04 - dao12.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/05 - xm1014 (2).png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/06 - spas12.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/07 - usas12.png"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/08 - saiga12.png"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/09 - jackhammer.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escopetas/ELITE-M37.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setSniper(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Snipers/ELITE-Barret.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Snipers/Barret .50 cal.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Snipers/L96A1 copy.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Snipers/PSG-1 copy.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Snipers/ELITE-Barret.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setMagnum(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/ELITE-Taurus.jpg"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/mp412rex.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/Python copy.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/taurus44.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/ELITE-Taurus.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setEspecial(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/EspeciaisFogo/rpg7.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/EspeciaisFogo/rpg7.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/EspeciaisFogo/Gatling Gun.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/EspeciaisFogo/Flame.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/EspeciaisFogo/Lancadora.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/EspeciaisFogo/Stinger.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/EspeciaisFogo/rpg7.png"));

        }
        foto.setIcon(imagem);
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" BRANCAS">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    public static void setBruta(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bruta/ELITE-Bastao.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bruta/soco.jpg"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bruta/bastao-p.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bruta/taco.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bruta/bastao-r.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bruta/pa.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Bruta/ELITE-Bastao.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setCorte(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/ELITE-Kukri.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/Faca.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/Katana.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/Kukri.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/Kris.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/stun gun.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/stun rod.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/escudo.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Corte/ELITE-Kukri.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setTaticaBranca(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Stun gun.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Stun gun.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Stun rod.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Escudo.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Stun gun.png"));

        }
        foto.setIcon(imagem);
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Acessórios">
    public static void getDivAcessorios() {
        imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/DivArma.png"));
        JOptionPane.showMessageDialog(null, "", "Divisão dos acessórios na arma", JOptionPane.PLAIN_MESSAGE, imagem);
    }

    public static void setCano(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/defaultImg.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/perfura.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/Silenciador.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/defaultImg.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setMira(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/defaultImg.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/ACOG.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/Red Dot.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/Infared.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/defaultImg.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setBarril(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/defaultImg.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/laser.jpg"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/defaultImg.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setParteInf(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/defaultImg.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/Grip.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/escopeta.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/defaultImg.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setPente(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/defaultImg.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/pente duplo.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/pente extendido.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/defaultImg.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setMOD(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Acessorios/defaultImg.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M01 - Arame farpado.jpg"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M02 - Lamina garra.jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M03 - Lamina afiada.jpg"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M04 - Pregos.jpg"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M05 - Liga de ferro.jpg"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M06 - MOD_Toxico.png"));
                break;

            case 7:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M07 - MOD_Paralitico.jpg"));
                break;

            case 8:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M08 - MOD_Incendiario.jpg"));
                break;

            case 9:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M09 - MOD_Eletrico.png"));
                break;

            case 10:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M10 - Campeao.jpg"));
                break;

            case 11:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M11 - Berserk.png"));
                break;

            case 12:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/M12 - Guardiao.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Magnum/defaultImg.png"));

        }
        foto.setIcon(imagem);
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" USÁVEL">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    public static void setGranada(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Veneno.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Distracao.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Flash.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Frag.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Incendiaria.png"));
                break;

            case 5:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Semtex.png"));
                break;

            case 6:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Veneno.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Veneno.png"));

        }
        foto.setIcon(imagem);
    }

    public static void setTaticaEspecial(int opcao, JLabel foto) {

        switch (opcao) {
            case 0:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/TaticaEspecial/Granadas-quimicas.png"));
                break;

            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/TaticaEspecial/FacaB.png"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/TaticaEspecial/C4.png"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/TaticaEspecial/Claymore.png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/TaticaEspecial/Granadas-quimicas.png"));
                break;

            default:
                imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Granadas/Granadas-quimicas.png"));

        }
        foto.setIcon(imagem);
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Listas">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    //</editor-fold>
    public static ImageIcon setImageFile(int file, JLabel label, JFileChooser fc) {
        ImageIcon icon = null;
        try {
            if (file == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                icon = new ImageIcon(f.toString());
                int altura = icon.getIconHeight();
                int largura = icon.getIconWidth();

                if ((largura <= 405) && (altura <= 520)) {
                    label.setIcon(icon);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma imagem com 405px de largura e 520px de altura", "Erro com a dimensão da imagem", JOptionPane.ERROR_MESSAGE);
                    return null;
                }

                return icon;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir imagem!\n" + e.toString());
        }

        return null;
    }

    public static ImageIcon setImageFile(int file, JFileChooser fc) {
        ImageIcon icon = null;
        try {
            if (file == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                icon = new ImageIcon(f.toString());
                int altura = icon.getIconHeight();
                int largura = icon.getIconWidth();

                if ((largura <= 800) && (altura <= 600)) {
                    return icon;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione uma imagem com no máximo 600px de largura e 800px de altura", "Erro com a dimensão da imagem", JOptionPane.ERROR_MESSAGE);
                    return null;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir imagem!\n" + e.toString());
        }

        return null;
    }

}
