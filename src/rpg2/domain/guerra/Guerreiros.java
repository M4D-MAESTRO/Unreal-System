/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.domain.guerra;

import java.util.Objects;
import rpg2.Inimigos.Inimigos;

/**
 *
 * @author M4ESTRO
 */
public class Guerreiros {

    private String nome;
    private Integer vit;
    private Integer atk;
    private Integer def;
    private Integer stealth;
    private String funcao;
    private String bonus;
    private String forca;

    public Guerreiros() {
    }

    public Guerreiros(String guerreiro, boolean aliado) {
        if (aliado) {
            setGuerreiro(guerreiro);

        } else {
            setGuerreiroInimigo(guerreiro);
        }

    }

    public Guerreiros(String nome, Integer vit, Integer atk, Integer def, Integer stealth, String funcao, String bonus, String forca) {
        this.nome = nome;
        this.vit = vit;
        this.atk = atk;
        this.def = def;
        this.stealth = stealth;
        this.funcao = funcao;
        this.bonus = bonus;
        this.forca = forca;
    }

    public String getForca() {
        return forca;
    }

    public void setForca(String forca) {
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guerreiros other = (Guerreiros) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    // <editor-fold defaultstate="collapsed" desc=" "> 
    // </editor-fold>
    private void setGuerreiro(String guerreiro) {
        switch (guerreiro) {
            // <editor-fold defaultstate="collapsed" desc="Soldados Roma "> 
            case "Soldados policiais":
                this.nome = "Soldados policiais";
                this.vit = 40;
                this.atk = 8;
                this.def = 10;
                this.stealth = 1;
                this.funcao = "Defesa da linha de frente";
                this.bonus = "Nenhum";

                this.forca = "Roma";
                break;

            case "Sargento policiais":
                this.nome = "Sargento policiais";
                this.vit = 50;
                this.atk = 10;
                this.def = 12;
                this.stealth = 3;
                this.funcao = "Defesa da linha de frente";
                this.bonus = "Aumenta a DEF em +1 de todas as tropas policiais.";

                this.forca = "Roma";
                break;

            case "Comandante policial":
                this.nome = "Comandante policial";
                this.vit = 60;
                this.atk = 15;
                this.def = 20;
                this.stealth = 5;
                this.funcao = "Defesa da linha de frente";
                this.bonus = "Aumenta a DEF em +2 de todas as tropas.";

                this.forca = "Roma";
                break;

            case "Soldados militar":
                this.nome = "Soldados militar";
                this.vit = 40;
                this.atk = 10;
                this.def = 8;
                this.stealth = 1;
                this.funcao = "Dano da linha de frente";
                this.bonus = "Nenhum";
                this.forca = "Roma";

                this.forca = "Roma";
                break;

            case "Sargento militar":
                this.nome = "Sargento militar";
                this.vit = 50;
                this.atk = 12;
                this.def = 10;
                this.stealth = 3;
                this.funcao = "Dano da linha de frente";
                this.bonus = "Aumenta o ATK em +1 de todas as tropas militares";

                this.forca = "Roma";
                break;

            case "Comandante militar":
                this.nome = "Comandante militar";
                this.vit = 60;
                this.atk = 20;
                this.def = 15;
                this.stealth = 5;
                this.funcao = "Dano da linha de frente";
                this.bonus = "Aumenta o ATK em +2 de todas as tropas";

                this.forca = "Roma";
                break;

            case "Médicos assistentes":
                this.nome = "Médicos assistentes";
                this.vit = 10;
                this.atk = 5;
                this.def = 2;
                this.stealth = 2;
                this.funcao = "Suporte na linha de frente";
                this.bonus = "Recupera 5 de VIT de todas as tropas.";

                this.forca = "Roma";
                break;

            case "Médicos chefes":
                this.nome = "Médicos chefes";
                this.vit = 20;
                this.atk = 8;
                this.def = 5;
                this.stealth = 3;
                this.funcao = "Suporte na linha de frente";
                this.bonus = "Recupera 10 de VIT de todas as tropas.";

                this.forca = "Roma";
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Veículos Roma ">    
            case "Carros civis com modificações":
                this.nome = "Carros civis com modificações";
                this.vit = 50;
                this.atk = 10;
                this.def = 6;
                this.stealth = 0;
                this.funcao = "Transporte/Combate defensivo";
                this.bonus = "Nenhum.";

                this.forca = "Roma";
                break;

            case "Hammer de combate":
                this.nome = "Hammer de combate";
                this.vit = 80;
                this.atk = 20;
                this.def = 15;
                this.stealth = 0;
                this.funcao = "Transporte/Combate ofensivo";
                this.bonus = "Aprova de bala, pistolas e submetralhadoras.";

                this.forca = "Roma";
                break;

            case "Tank":
                this.nome = "Tank";
                this.vit = 200;
                this.atk = 50;
                this.def = 50;
                this.stealth = 0;
                this.funcao = "Combate ofensivo";
                this.bonus = "Só pode ser destruído com lançadores de mísseis.";

                this.forca = "Roma";
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Soldados BHC  "> 
            case "Soldado da BHC":
                this.nome = "Soldado da BHC";
                this.vit = 50;
                this.atk = 12;
                this.def = 10;
                this.stealth = 4;
                this.funcao = "Combate Stealth";
                this.bonus = "Quando com tropas de outras legiões, soldados da BHC atacam em turnos diferentes.";

                this.forca = "BHC";
                break;

            case "Infiltrador da BHC":
                this.nome = "Infiltrador da BHC";
                this.vit = 60;
                this.atk = 16;
                this.def = 12;
                this.stealth = 5;
                this.funcao = "Combate Stealth/Sabotagem";
                this.bonus = "Pode sabotar veículos inimigos bem como defesas automatizadas.";

                this.forca = "BHC";
                break;

            case "Especialista da BHC":
                this.nome = "Especialista da BHC";
                this.vit = 70;
                this.atk = 25;
                this.def = 20;
                this.stealth = 5;
                this.funcao = "Suporte geral";
                this.bonus = "Gera +1 de vantagem no dado para todas as ações na designação em que se encontra.";

                this.forca = "BHC";
                break;

            case "Suporte da BHC":
                this.nome = "Soldado da BHC";
                this.vit = 40;
                this.atk = 10;
                this.def = 8;
                this.stealth = 3;
                this.funcao = "Suporte na linha de frente / Combate na linha de frent";
                this.bonus = "Recupera 5 de VIT de todas as tropas / Ataca com lançadores químicos.";

                this.forca = "BHC";
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Veiculos BHC  "> 
            case "Carros civis esportivos":
                this.nome = "Carros civis esportivos";
                this.vit = 30;
                this.atk = 10;
                this.def = 10;
                this.stealth = 0;
                this.funcao = "Transporte/Infiltração dinâmica";
                this.bonus = "+1 no dado para ações defensivas.";

                this.forca = "BHC";
                break;

            case "Carrie Truck":
                this.nome = "Carrie Truck";
                this.vit = 80;
                this.atk = 10;
                this.def = 20;
                this.stealth = 0;
                this.funcao = "Transporte/Infiltração estática";
                this.bonus = "Nenhum.";

                this.forca = "BHC";
                break;

            case "Eagle":
                this.nome = "Eagle";
                this.vit = 100;
                this.atk = 10;
                this.def = 20;
                this.stealth = 0;
                this.funcao = "Aéreo/ Infiltração";
                this.bonus = "+1 de vantagem no dado quando não for atacado por criaturas aladas ou lançadores Stingers.";

                this.forca = "BHC";
                break;

            case "Apache":
                this.nome = "Apache";
                this.vit = 150;
                this.atk = 40;
                this.def = 30;
                this.stealth = 0;
                this.funcao = "Aéreo/ Combate ofensivo";
                this.bonus = "+1 de vantagem no dado quando não for atacado por criaturas aladas ou lançadores Stingers.";

                this.forca = "BHC";
                break;
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Soldados exercito "> 
            case "Soldados fuzileiros":
                this.nome = "Soldados fuzileiros";
                this.vit = 50;
                this.atk = 12;
                this.def = 10;
                this.stealth = 2;
                this.funcao = "Dano da linha de frente";
                this.bonus = "Nenhum";

                this.forca = "Exército";
                break;

            case "Sargento fuzileiros":
                this.nome = "Sargento fuzileiros";
                this.vit = 60;
                this.atk = 16;
                this.def = 12;
                this.stealth = 4;
                this.funcao = "Dano da linha de frentea";
                this.bonus = "Aumenta o ATK em +1 de todas as tropas militares.";

                this.forca = "Exército";
                break;

            case "Comandante fuzileiro":
                this.nome = "Comandante fuzileiro.";
                this.vit = 70;
                this.atk = 25;
                this.def = 20;
                this.stealth = 5;
                this.funcao = "Dano da linha de frente";
                this.bonus = "Aumenta o ATK em +1 de todas as tropas.";

                this.forca = "Exército";
                break;

            case "Médicos fuzileiros":
                this.nome = "Carros civis esportivos";
                this.vit = 30;
                this.atk = 8;
                this.def = 8;
                this.stealth = 3;
                this.funcao = "Suporte na linha de frente";
                this.bonus = "Recupera 5 de VIT de todas as tropas.";

                this.forca = "Exército";
                break;

            case "Cirurgiões fuzileiros":
                this.nome = "Carros civis esportivos";
                this.vit = 40;
                this.atk = 12;
                this.def = 10;
                this.stealth = 4;
                this.funcao = "Suporte na linha de frente";
                this.bonus = "Recupera 10 de VIT de todas as tropas.";

                this.forca = "Exército";
                break;
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Veiculo exercito  "> 
            case "Hover terrestre":
                this.nome = "Hover terrestre";
                this.vit = 80;
                this.atk = 15;
                this.def = 10;
                this.stealth = 4;
                this.funcao = "Transporte/Combate defensivo";
                this.bonus = "Nenhum.";

                this.forca = "Exército";
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Soldados sobreviventes "> 
            case "Sobrevivente civil":
                this.nome = "Sobrevivente civil";
                this.vit = 15;
                this.atk = 5;
                this.def = 4;
                this.stealth = 1;
                this.funcao = "Defesa da linha de frente";
                this.bonus = "Nenhum.";

                this.forca = "Sobreviventes";
                break;

            case "Sobrevivente militar":
                this.nome = "Sobrevivente militar";
                this.vit = 25;
                this.atk = 15;
                this.def = 12;
                this.stealth = 3;
                this.funcao = "Ataque da linha de frente";
                this.bonus = "Aumenta a ATK em +1 de todas as tropas.";

                this.forca = "Sobreviventes";
                break;

            case "Sobrevivente especialista":
                this.nome = "Sobrevivente especialista";
                this.vit = 20;
                this.atk = 10;
                this.def = 8;
                this.stealth = 3;
                this.funcao = "Suporte geral.";
                this.bonus = "Aumenta o ATK e a DEF em +2 de todas as tropas.";

                this.forca = "Sobreviventes";
                break;

            case "Sobrevivente médico":
                this.nome = "Sobrevivente médico";
                this.vit = 15;
                this.atk = 10;
                this.def = 8;
                this.stealth = 1;
                this.funcao = "Suporte na linha de frente.";
                this.bonus = "Aumenta a VIT de toda a tropa em +5. Recupera +10 de VIT por rodada.";

                this.forca = "Sobreviventes";
                break;
            // </editor-fold>
        }
    }

    private void setGuerreiroInimigo(String guerreiro) {
        String status[] = new String[4];
        switch (guerreiro) {
            // <editor-fold defaultstate="collapsed" desc="Forca Criminosa "> 
            case "Bandido":
                status = Inimigos.getForGuerra(1);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "Psicopatas":
                status = Inimigos.getForGuerra(2);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "Terrorista":
                status = Inimigos.getForGuerra(3);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "Sádicos":
                status = Inimigos.getForGuerra(4);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "Mercenário":
                status = Inimigos.getForGuerra(5);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "Pigsaw":
                status = Inimigos.getForGuerra(6);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "O Reanimador (ver 1)":
                status = Inimigos.getForGuerra(7);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "A Bruxa":
                status = Inimigos.getForGuerra(8);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "Os irmãos Jack":
                status = Inimigos.getForGuerra(9);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "Phantom":
                status = Inimigos.getForGuerra(10);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            case "The Clown":
                status = Inimigos.getForGuerra(11);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força criminosa";
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Unreal "> 
            case "Agente da Unreal":
                status = Inimigos.getForGuerra(12);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força da Unreal";
                break;

            case "Caçador da Unreal":
                status = Inimigos.getForGuerra(13);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força da Unreal";
                break;

            case "Combatente da Unreal":
                status = Inimigos.getForGuerra(14);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força da Unreal";
                break;

            case "Beta - 02":
                status = Inimigos.getForGuerra(15);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força da Unreal";
                break;

            case "Beta - 01":
                status = Inimigos.getForGuerra(16);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força da Unreal";
                break;

            case "Ômega":
                status = Inimigos.getForGuerra(17);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força da Unreal";
                break;

            case "Alfa":
                status = Inimigos.getForGuerra(18);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Força da Unreal";
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="infec1 ">                 
            case "Infectado":
                status = Inimigos.getForGuerra(19);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 1";
                break;

            case "Cachorro Infectado":
                status = Inimigos.getForGuerra(20);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 1";
                break;

            case "Infectado Maldito":
                status = Inimigos.getForGuerra(21);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 1";
                break;

            case "Caçadores Sombras":
                status = Inimigos.getForGuerra(22);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 1";
                break;

            case "Múmias Malditas":
                status = Inimigos.getForGuerra(23);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 1";
                break;

            case "Caçadores da Selva":
                status = Inimigos.getForGuerra(24);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 1";
                break;

            case "Sucubus":
                status = Inimigos.getForGuerra(25);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 1";
                break;

            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="infec 2 "> 
            case "Aberração Demoniáca":
                status = Inimigos.getForGuerra(26);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Infectado Aprimorado":
                status = Inimigos.getForGuerra(27);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Demónio Alado":
                status = Inimigos.getForGuerra(28);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Scorpion":
                status = Inimigos.getForGuerra(29);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Lesma Negra":
                status = Inimigos.getForGuerra(30);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Aranha gigante":
                status = Inimigos.getForGuerra(31);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Chacal":
                status = Inimigos.getForGuerra(32);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Besta":
                status = Inimigos.getForGuerra(33);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Corrompedora de Homens":
                status = Inimigos.getForGuerra(34);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Demolidor":
                status = Inimigos.getForGuerra(35);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "O Carrasco":
                status = Inimigos.getForGuerra(36);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;

            case "Senhora dos Pesadelos":
                status = Inimigos.getForGuerra(37);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 2";
                break;
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="infec 3 "> 
            case "The Hunter":
                status = Inimigos.getForGuerra(38);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 3";
                break;

            case "Barão Infernal":
                status = Inimigos.getForGuerra(39);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 3";
                break;

            case "Bocejo":
                status = Inimigos.getForGuerra(40);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 3";
                break;

            case "Ghost":
                status = Inimigos.getForGuerra(41);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 3";
                break;

            case "Cerberus":
                status = Inimigos.getForGuerra(42);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 3";
                break;

            case "O Reanimador (ver 2)":
                status = Inimigos.getForGuerra(43);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 3";
                break;

            case "Cilla":
                status = Inimigos.getForGuerra(44);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 3";
                break;
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="infec 4 "> 
            case "Cerberus 2.0":
                status = Inimigos.getForGuerra(45);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 4";
                break;

            case "Alfa Besta":
                status = Inimigos.getForGuerra(46);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 4";
                break;

            case "Besta Apocalíptica":
                status = Inimigos.getForGuerra(47);
                this.nome = status[0];
                this.vit = Integer.parseInt(status[1]);
                this.atk = Integer.parseInt(status[2]);
                this.def = Integer.parseInt(status[3]);
                this.stealth = 1;
                this.funcao = "";
                this.bonus = "Nenhum";

                this.forca = "Infectados nível 4";
                break;

            // </editor-fold>
        }

    }

}
