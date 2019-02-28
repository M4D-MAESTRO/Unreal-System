/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Inimigos;

import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class PersistirInimigo extends InimigosOBJ{
    
    public String gravar(InimigosOBJ inimigo){
        String ret = "Inimigo salvo com sucesso!";
        
        try{
            FileOutputStream file = new FileOutputStream("Config/" + inimigo.getCod());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
            
        }catch(IOException e){
            ret = "Falha ao salvar inimigo\n" + e.toString();
        }
        
        return ret;
    }
    
    public static InimigosOBJ carregar(int cod){
        try{
            FileInputStream file = new FileInputStream("Config/" + cod);
            ObjectInputStream stream = new ObjectInputStream(file);
            InimigosOBJ inimigo = ((InimigosOBJ) stream.readObject());           
            return inimigo;
        }catch(IOException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar inimigo!\n" + e.toString());
        }
        
        return null;
    }
    
}
