/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Utilitarios;

/**
 *
 * @author M4ESTRO
 */
public class Dados {

    public static String getDado(int numeroDeLadosDoDado) {
        int resultado;
        String aux = "";

        do {
            resultado = (int) ((Math.random()) * numeroDeLadosDoDado + 1);
        } while (!(resultado != 0));

        return aux = aux.valueOf(resultado);

    }

    public static int getDadoInt(int numeroDeLadosDoDado) {
        int resultado;

        do {
            resultado = (int) ((Math.random()) * numeroDeLadosDoDado + 1);
        } while (!(resultado != 0));

        return resultado;

    }

    public static boolean getChances(int percentual) {
        int resultado = (int) ((Math.random() * 10) + 1);
        
        switch (percentual) {
            case 1:                
                if(resultado <=  1){
                    return true;
                }
                break;

            case 2:
                if(resultado <=  2){
                    return true;
                }

                break;

            case 3:
                if(resultado <=  3){
                    return true;
                }
                break;

            case 4:
                if(resultado <=  4){
                    return true;
                }
                break;

            case 5:
                if(resultado <=  5){
                    return true;
                }
                break;

            case 6:
                if(resultado <=  6){
                    return true;
                }
                break;

            case 7:
                if(resultado <=  7){
                    return true;
                }
                break;

            case 8:
                if(resultado <=  8){
                    return true;
                }
                break;

            case 9:
                if(resultado <=  9){
                    return true;
                }
                break;

            case 10:
                if(resultado <=  10){
                    return true;
                }
                break;
        }

        return false;

    }





}
