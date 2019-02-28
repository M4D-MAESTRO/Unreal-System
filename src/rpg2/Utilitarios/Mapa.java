/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Utilitarios;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author M4ESTRO
 */
public class Mapa {
    static ImageIcon imagem = null;
    
    public static void trocaImagem(boolean alternar, JLabel label, JToggleButton butao){
        if(!alternar){
            imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Mapas/Mapa completo.png"));
            butao.setText("Original");
            butao.setToolTipText("Clique para alternar para o mapa com divisórias");
        }else{
             imagem = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/Mapas/Mapa completo - DIVISORIAS.png"));
             butao.setText("Divisorias");
            butao.setToolTipText("Clique para alternar para o mapa original");
        }
        
        label.setIcon(imagem);
    }
    
}
