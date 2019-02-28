/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Inimigos;

import java.io.Serializable;
import javax.swing.ImageIcon;
import rpg2.Sistema.PegaData;

/**
 *
 * @author M4ESTRO
 */
public  class InimigosOBJ implements Serializable {

    private int cod, numeracao;
    private String tipoRPG;
    private String classeInimigo;

    private String nome, desc, sexo;
    private String[] drops = new String[3];// [0]-XP; [1]-GOLD; [2]-Itens;    
    private short level, for1, res, int1, car, sorte;
    private int hp;
    private String vantagens, desvantagens;

    private ImageIcon foto = new ImageIcon();
    
    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        String aux = String.valueOf(PegaData.getAno()) + String.valueOf(cod);
        this.cod = Integer.parseInt(aux);
    }

    public InimigosOBJ() {
    }

    
    
    //<editor-fold defaultstate="collapsed" desc=" get/set">
 

    public String getTipoRPG() {
        return tipoRPG;
    }

    public void setTipoRPG(String tipoRPG) {
        this.tipoRPG = tipoRPG;
    }

    public String getClasseInimigo() {
        return classeInimigo;
    }

    public void setClasseInimigo(String classeInimigo) {
        this.classeInimigo = classeInimigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String[] getDrops() {
        return drops;
    }
    
    public String getDrops(int posc) {
        return drops[posc];
    }

    public void setDrops(String[] drops) {
        this.drops = drops;
    }
    
    public void setDrops(String xp, String gold, String itens) {
        this.drops[0] = xp;
        this.drops[1] = gold;
        this.drops[2] = itens;
    }

    public short getLevel() {
        return level;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    public short getFor1() {
        return for1;
    }

    public void setFor1(short for1) {
        this.for1 = for1;
    }

    public short getRes() {
        return res;
    }

    public void setRes(short res) {
        this.res = res;
    }

    public short getInt1() {
        return int1;
    }

    public void setInt1(short int1) {
        this.int1 = int1;
    }

    public short getCar() {
        return car;
    }

    public void setCar(short car) {
        this.car = car;
    }

    public short getSorte() {
        return sorte;
    }

    public void setSorte(short sorte) {
        this.sorte = sorte;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getVantagens() {
        return vantagens;
    }

    public void setVantagens(String vantagens) {
        this.vantagens = vantagens;
    }

    public String getDesvantagens() {
        return desvantagens;
    }

    public void setDesvantagens(String desvantagens) {
        this.desvantagens = desvantagens;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
    
     //</editor-fold>

}
