/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class PegaData {

    public static String getLog() {
        Date agora = new Date();
        String hora = String.valueOf(agora.getTime());

        Calendar cal = Calendar.getInstance();
        cal.setTime(agora);
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        int horaDoDia = cal.get(Calendar.HOUR_OF_DAY);
        int minutos = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);
        String horaFormatada = horaDoDia + ":" + minutos + ":" + segundos;
        return horaFormatada;
    }
    
    public static int getAno() {
        Date agora = new Date();
        String hora = String.valueOf(agora.getTime());

        Calendar cal = Calendar.getInstance();
        cal.setTime(agora);
        int ano = cal.get(Calendar.YEAR);
        
        return ano;
    }
    
    public static String getUltimoSave() {
        Date agora = new Date();
        String hora = String.valueOf(agora.getTime());

        Calendar cal = Calendar.getInstance();
        cal.setTime(agora);
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        int horaDoDia = cal.get(Calendar.HOUR_OF_DAY);
        int minutos = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);
        String horaFormatada = dia + "/"+ mes + "/" + ano + " às " + horaDoDia + ":" + minutos + ":" + segundos;
        return horaFormatada;
    }
    
    public static int getMinuto(){
        Date agora = new Date();
        String hora = String.valueOf(agora.getTime());
        Calendar cal = Calendar.getInstance();
        cal.setTime(agora);
        int minutos = cal.get(Calendar.MINUTE); 
        
        return minutos;
    }
    
    public static boolean saveAutomatico(int ultimoSave){
        Date agora = new Date();
        String hora = String.valueOf(agora.getTime());
        Calendar cal = Calendar.getInstance();
        cal.setTime(agora);
        int minutos = cal.get(Calendar.MINUTE);

        boolean salvar = false;
        
        if(ultimoSave - minutos <= 1 ){
            salvar = true;
        }else{
            salvar = false;
        }
        
        return salvar;
        
    }
}
