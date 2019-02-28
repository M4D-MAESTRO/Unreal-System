/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

/**
 *
 * @author M4ESTRO
 */
public class FichaToinOBJ extends FichaOBJ{

    public FichaToinOBJ() {
    }
    
    
    private String  reino, raca, tedencia, divindade;
    private short  sab, sor;
    private int  pm, atak_F, atak_D, atak_I, atak_S, def, pvAtual, pmAtual;
    private short  karma;
    private String armas, poder, aneis, pocoes;
    private String hab, vant, desvant;
    private String hist, medo, arrep;    
    private boolean envenenado, sangrando, exausto, stunado, outro;

        
    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTedencia() {
        return tedencia;
    }

    public void setTedencia(String tedencia) {
        this.tedencia = tedencia;
    }

    public String getDivindade() {
        return divindade;
    }

    public void setDivindade(String divindade) {
        this.divindade = divindade;
    }

    public int getPm() {
        return pm;
    }

    public void setPm(int pm) {
        this.pm = pm;
    }

    public short getSab() {
        return sab;
    }

    public void setSab(short sab) {
        this.sab = sab;
    }

    public short getSor() {
        return sor;
    }

    public void setSor(short sor) {
        this.sor = sor;
    }

    public int getAtak_F() {
        return atak_F;
    }

    public void setAtak_F(int atak_F) {
        this.atak_F = atak_F;
    }

    public int getAtak_D() {
        return atak_D;
    }

    public void setAtak_D(int atak_D) {
        this.atak_D = atak_D;
    }

    public int getAtak_I() {
        return atak_I;
    }

    public void setAtak_I(int atak_I) {
        this.atak_I = atak_I;
    }

    public int getAtak_S() {
        return atak_S;
    }

    public void setAtak_S(int atak_S) {
        this.atak_S = atak_S;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public short getKarma() {
        return karma;
    }

    public void setKarma(short karma) {
        this.karma = karma;
    }

    public int getPvAtual() {
        return pvAtual;
    }

    public void setPvAtual(int pvAtual) {
        this.pvAtual = pvAtual;
    }

    public int getPmAtual() {
        return pmAtual;
    }

    public void setPmAtual(int pmAtual) {
        this.pmAtual = pmAtual;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getAneis() {
        return aneis;
    }

    public void setAneis(String aneis) {
        this.aneis = aneis;
    }

    public String getPocoes() {
        return pocoes;
    }

    public void setPocoes(String pocoes) {
        this.pocoes = pocoes;
    }

    public String getHab() {
        return hab;
    }

    public void setHab(String hab) {
        this.hab = hab;
    }

    public String getVant() {
        return vant;
    }

    public void setVant(String vant) {
        this.vant = vant;
    }

    public String getDesvant() {
        return desvant;
    }

    public void setDesvant(String desvant) {
        this.desvant = desvant;
    }

    public String getHist() {
        return hist;
    }

    public void setHist(String hist) {
        this.hist = hist;
    }

    public String getMedo() {
        return medo;
    }

    public void setMedo(String medo) {
        this.medo = medo;
    }

    public String getArrep() {
        return arrep;
    }

    public void setArrep(String arrep) {
        this.arrep = arrep;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public boolean isSangrando() {
        return sangrando;
    }

    public void setSangrando(boolean sangrando) {
        this.sangrando = sangrando;
    }

    public boolean isExausto() {
        return exausto;
    }

    public void setExausto(boolean exausto) {
        this.exausto = exausto;
    }

    public boolean isStunado() {
        return stunado;
    }

    public void setStunado(boolean stunado) {
        this.stunado = stunado;
    }

    public boolean isOutro() {
        return outro;
    }

    public void setOutro(boolean outro) {
        this.outro = outro;
    }

    
    
    
}
