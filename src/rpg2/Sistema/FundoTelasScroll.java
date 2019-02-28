/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

/**
 *
 * @author M4ESTRO
 */
public class FundoTelasScroll extends JScrollPane {

    ImageIcon imagFicha1 = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Tela 01.jpg"));
    Image imagFicha01 = imagFicha1.getImage();

    public FundoTelasScroll() {
    }

    
    public void paintComponent(Graphics g) {
        g.drawImage(imagFicha01, 0, 0, getWidth(), getHeight(), this);
    }

}
