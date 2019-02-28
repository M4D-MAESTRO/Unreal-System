/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Inimigos;

import java.io.Serializable;

/**
 *
 * @author M4ESTRO
 */
public class InimigoMedievalOBJ extends InimigosOBJ implements Serializable{
     private short des, sab;
     private int pm;
     String  tendencia, raca;

    public InimigoMedievalOBJ() {
    }
     
     //<editor-fold defaultstate="collapsed" desc=" get/set">

    public short getDes() {
        return des;
    }

    public void setDes(short des) {
        this.des = des;
    }

    public short getSab() {
        return sab;
    }

    public void setSab(short sab) {
        this.sab = sab;
    }

    public int getPm() {
        return pm;
    }

    public void setPm(int pm) {
        this.pm = pm;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
     
      //</editor-fold>
}
