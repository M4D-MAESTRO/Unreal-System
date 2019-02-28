/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

import java.io.Serializable;
import javax.swing.ImageIcon;
import rpg2.Sistema.PegaData;

/**
 *
 * @author M4ESTRO
 */
public abstract class FichaOBJ implements Serializable{

    private String nome, classe, sexo;
    private short idade, forca, des, inte, res;
    private short skillPoints;
    private int pv, xp, xpPra;
    private String note;
    int cod = 0, numeracao = 0;

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
    
    
    private ImageIcon foto = new ImageIcon();

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getXpPra() {
        return xpPra;
    }

    public void setXpPra(int xpPra) {
        this.xpPra = xpPra;
    }

    private short nivel;
    private double gold;
    private String anotacoes;

    public FichaOBJ(String nome, String classe, String sexo, short idade, short pv, short forca, short des, short inte, short res, short skillPoints, short nivel, short gold, String anotacoes, String save) {
        this.nome = nome;
        this.classe = classe;
        this.sexo = sexo;
        this.idade = idade;
        this.pv = pv;
        this.forca = forca;
        this.des = des;
        this.inte = inte;
        this.res = res;
        this.skillPoints = skillPoints;
        this.nivel = nivel;
        this.gold = gold;
        this.anotacoes = anotacoes;
        this.save = save;
    }

    public FichaOBJ() {
    }
    private String save;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public short getForca() {
        return forca;
    }

    public void setForca(short forca) {
        this.forca = forca;
    }

    public short getDes() {
        return des;
    }

    public void setDes(short des) {
        this.des = des;
    }

    public short getInte() {
        return inte;
    }

    public void setInte(short inte) {
        this.inte = inte;
    }

    public short getRes() {
        return res;
    }

    public void setRes(short res) {
        this.res = res;
    }

    public short getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(short skillPoints) {
        this.skillPoints = skillPoints;
    }

    public short getNivel() {
        return nivel;
    }

    public void setNivel(short nivel) {
        this.nivel = nivel;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

}
