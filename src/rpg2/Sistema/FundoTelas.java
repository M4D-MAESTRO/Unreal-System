/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author M4ESTRO
 */
public class FundoTelas extends JPanel {

    ImageIcon imagemFundoIcon = null;
    Image imagemFundoImage = null;

    //Código para setar as imagens
    //new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Tela 01.jpg"));
    //Image imagemFundoImage = imagemFundoIcon.getImage();
    public FundoTelas(int opcao) {
        ImageIcon imagemFundoIconLocal = null;
        Image imagemFundoImageLocal = null;
        switch (opcao) {

            case 1:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 01.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;
                break;

            case 2:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 02.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            /* case 3: NAO PODE USAR DISGRACA
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 03.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;*/
            case 4:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 04.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 5:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 05.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 6:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 06.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 7:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 07.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 8:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 08.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 9:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 09.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 10:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 10.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 11:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 11.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 12:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 12.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 13:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 13.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 14:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 14.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 15:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 15.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 17:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 17.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 18:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 18.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 19:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 19.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 20:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 20.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 21:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 21.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 22: //NAO PODE USAR DISGRACA
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 22.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 23:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 23.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 24:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 24.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 25:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 25.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 26:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 26.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 27:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 27.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 28:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 28.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 29:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 29.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 30:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 30.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 31:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Fundo 31.png"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 32:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Guerra_Ataque.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

            case 33:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Guerra_Defesa.jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;

                break;

        }

    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(imagemFundoImage, 0, 0, getWidth(), getHeight(), this);
    }

}
