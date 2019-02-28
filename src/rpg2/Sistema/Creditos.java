/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 2017102465
 */
public class Creditos {
    
    final static ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/SacrificioIcon.png"));
    public static void creditos(){
        JOptionPane.showMessageDialog(null, "Desenvolvido por: M4D Maestro \nO apóstolo do Falcão da Luz \n\nVersão: Beta \nLeia o arquivo 'Leia-me' para obter informações de mudanças, bugs e outros detalhes", "CRÉDITOS", JOptionPane.PLAIN_MESSAGE, icon);
    }
        
    
}
