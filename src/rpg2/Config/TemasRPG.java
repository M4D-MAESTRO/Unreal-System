/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Config;

/**
 *
 * @author M4ESTRO
 */
public class TemasRPG {
    
   private static String temasUnreal[] = {"Inferno da dor (default)", "Inferno da Solidão", "Salvação"};
   private static String temasMedievais[] = {"Fort (default)"};
   
   private static String temasDefault[] = {};
   
    
    public static String[] getLista(int opcao){
        switch(opcao){          
                                
            case 2:
                return temasMedievais;
                
            case 6:
                return temasUnreal;    
                                
            default:
                return temasDefault;
                
        }
    }
    
}
