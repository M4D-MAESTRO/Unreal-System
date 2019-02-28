/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 2017102465
 */
public class FichaPersiste extends FichaToinOBJ {
    
    public String salvar(String data){
        
        try{
            int aux = this.getCod();
            FileOutputStream file = new FileOutputStream("Saves/" + this.getCod());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
            
            Codigo.salvarLista("Jogador: " + this.getNome() + " - Código: " + this.getCod());
            
        }catch(IOException e){
            data = "Erro ao tentar salvar a ficha!\n" + e.toString();
        }        
        return data;
    }
    
    public static FichaToinOBJ abrir(int cod){
        try{
            FileInputStream file = new FileInputStream("Saves/" + cod);
            ObjectInputStream stream = new ObjectInputStream(file);            
            
            return ((FichaToinOBJ) stream.readObject()); 
            
        }catch(IOException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro ao abrir ficha! \n" + e.toString());
        }
        
        return null;
    }
    
}
