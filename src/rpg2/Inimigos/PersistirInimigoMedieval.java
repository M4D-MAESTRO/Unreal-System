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

public class PersistirInimigoMedieval extends InimigoMedievalOBJ{
    
    public String gravarMedieval(String data){
        String ret = "Inimigo salvo com sucesso - " + data;
        
        try{
            FileOutputStream file = new FileOutputStream("Config/" + this.getCod());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
            
        }catch(IOException e){
            ret = "Falha ao salvar inimigo\n" + e.toString();
        }
        
        return ret;
    }
    
    public static InimigoMedievalOBJ carregarMedieval(int cod){
        try{
            FileInputStream file = new FileInputStream("Config/" + cod);
            ObjectInputStream stream = new ObjectInputStream(file);
            
            return ((InimigoMedievalOBJ) stream.readObject());
            
        }catch(IOException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar inimigo!\n" + e.toString());
        }
        
        return null;
    }
    
    public static String salvarMedieval(String tipo, JTextField campo[], JTextArea camposArea[], InimigoMedievalPanel comp, PersistirInimigoMedieval inimigo, ImageIcon imagem, String data){
        String status;
        try {
            inimigo.setTipoRPG(tipo);
            inimigo.setClasseInimigo(comp.getClasse());
            
            inimigo.setNome(campo[0].getText());
            inimigo.setDesc(camposArea[0].getText());
            inimigo.setDrops(campo[1].getText(), campo[2].getText(), camposArea[1].getText());
           // inimigo.setCod(Integer.parseInt(campo[3].getText()));
            inimigo.setVantagens(camposArea[2].getText());
            inimigo.setDesvantagens(camposArea[3].getText());
            
            inimigo.setLevel(comp.getLevel());
            inimigo.setTendencia(comp.getTedencia());
            inimigo.setSexo(comp.getSexo());
            inimigo.setRaca(comp.getRaca());
            
            inimigo.setHp(comp.getPV());
            inimigo.setPm(comp.getPM());
            inimigo.setFor1(comp.getFOR());
            inimigo.setDes(comp.getDES());
            inimigo.setRes(comp.getRES());
            inimigo.setInt1(comp.getINT());  
            inimigo.setSorte(comp.getSOR());
            inimigo.setSab(comp.getSAB());
            
            inimigo.setFoto(imagem);           

           
            status = inimigo.gravarMedieval(data);
            
            status = campo[0].getText() + " - " + status;
             
             ListaInimigo.salvarLista("Código: " + inimigo.getCod() + " | Inimigo: " + inimigo.getNome() + " | Tipo RPG: " + inimigo.getTipoRPG());

        } catch (HeadlessException | NumberFormatException e) {
            status = "Erro ao salvar inimigo\n" + e.toString();
        }
        return status;
    }

    public static void carregarMedieval(InimigoMedievalPanel comp, InimigoMedievalOBJ inimigo){
        comp.setPV(inimigo.getHp());
        comp.setPM(inimigo.getPm());
        comp.setFOR(inimigo.getFor1());
        comp.setDES(inimigo.getDes());
        comp.setINT(inimigo.getInt1());
        comp.setSAB(inimigo.getSab());
        comp.setSOR(inimigo.getSorte());
        comp.setRES(inimigo.getRes());
        comp.setLevel(inimigo.getLevel());
        comp.setTedencia(inimigo.getTendencia());
        comp.setSexo(inimigo.getSexo());
        comp.setRaca(inimigo.getRaca());
        comp.setClasse(inimigo.getClasseInimigo());
        
    }

}
