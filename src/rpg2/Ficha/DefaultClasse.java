/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Ficha;

import javax.swing.JTextField;

/**
 *
 * @author M4ESTRO
 */
public class DefaultClasse {

    public static void setDefaultClasses(JTextField[] campos, int opcao) {
        switch (opcao) {
            case 0:
                setLimpar(campos);
                break;

            case 1:
                setFuzileiro(campos);
                break;

            case 2:
                setPolicial(campos);
                break;

            case 3:
                setBHC(campos);
                break;

            case 4:
                setHacker(campos);
                break;

            case 5:
                setQuimico(campos);
                break;

            case 6:
                setMedico(campos);
                break;

            case 7:
                setEngenheiro(campos);
                break;
        }
    }

    public static void setFuzileiro(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("70");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("4");//FOR
        i++;
        campos[i].setText("1");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("2");//STM
        i++;
        campos[i].setText("0");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("2");//RES
        i++;
        campos[i].setText("1");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("2");//FOR
        i++;
        campos[i].setText("0");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("0");//INT
        i++;
        campos[i].setText("2");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("Beretta M9");//Item 1
        i++;
        campos[i].setText("Colete Médio");//Item 2
        i++;
        campos[i].setText("50x Munição (PISTOLA)");//Item 3
        i++;
        campos[i].setText("30x Munição (FUZIL)");//Item 4
        i++;
        campos[i].setText("30x Munição (FUZIL)");//Item 5
        i++;
        campos[i].setText("2x Granadas (EXPLOSIVA)");//Item 6
        i++;
        campos[i].setText("1x C4");//Item 7
        i++;
        campos[i].setText("1x Spray de primeiros socorros");//Item 8
        i++;
        campos[i].setText("M16");//Item Especial
        i++;
        campos[i].setText("Faca");//Item Branco
        // </editor-fold>

    }

    public static void setPolicial(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("100");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("3");//FOR
        i++;
        campos[i].setText("2");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("1");//STM
        i++;
        campos[i].setText("1");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("2");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("1");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("2");//FOR
        i++;
        campos[i].setText("0");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("0");//INT
        i++;
        campos[i].setText("2");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("Beretta M9-F");//Item 1
        i++;
        campos[i].setText("Colete Pesado");//Item 2
        i++;
        campos[i].setText("50x Munição (PISTOLA)");//Item 3
        i++;
        campos[i].setText("15x Munição (ESCOPETA)");//Item 4
        i++;
        campos[i].setText("2x Granadas (DISTRAÇÃO)");//Item 5
        i++;
        campos[i].setText("2x Granadas (EXPLOSIVA)");//Item 6
        i++;
        campos[i].setText("Escudo");//Item 7
        i++;
        campos[i].setText("1x Spray de primeiros socorros");//Item 8
        i++;
        campos[i].setText("M37 Stakeout");//Item Especial
        i++;
        campos[i].setText("Cassetete policial");//Item Branco
        // </editor-fold>

    }

    public static void setBHC(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("70");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("3");//FOR
        i++;
        campos[i].setText("1");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("3");//STM
        i++;
        campos[i].setText("2");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("1");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("0");//FOR
        i++;
        campos[i].setText("0");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("0");//INT
        i++;
        campos[i].setText("0");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("Glock 17-S");//Item 1
        i++;
        campos[i].setText("Colete Leve");//Item 2
        i++;
        campos[i].setText("50x Munição (PISTOLA)");//Item 3
        i++;
        campos[i].setText("30x Munição (Submetralhadora)");//Item 4
        i++;
        campos[i].setText("30x Munição (Submetralhadora)");//Item 5
        i++;
        campos[i].setText("2x Granadas (FLASH)");//Item 6
        i++;
        campos[i].setText("Máscara de filtro");//Item 7
        i++;
        campos[i].setText("1x Spray de primeiros socorros");//Item 8
        i++;
        campos[i].setText("MP5-S");//Item Especial
        i++;
        campos[i].setText("Stun Rod");//Item Branco
        // </editor-fold>

    }

    public static void setHacker(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("50");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("2");//FOR
        i++;
        campos[i].setText("1");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("3");//STM
        i++;
        campos[i].setText("2");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("1");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("1");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("0");//FOR
        i++;
        campos[i].setText("0");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("2");//INT
        i++;
        campos[i].setText("0");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("Colt 1911");//Item 1
        i++;
        campos[i].setText("30x Munição (PISTOLA)");//Item 2
        i++;
        campos[i].setText("10x Componentes Eletrónico de Hackeamento");//Item 3
        i++;
        campos[i].setText("1x Spray de primeiros socorros");//Item 4
        i++;
        campos[i].setText("");//Item 5
        i++;
        campos[i].setText("");//Item 6
        i++;
        campos[i].setText("");//Item 7
        i++;
        campos[i].setText("");//Item 8
        i++;
        campos[i].setText("Terminal Portátil");//Item Especial
        i++;
        campos[i].setText("Bastão Retrátil");//Item Branco
        // </editor-fold>

    }

    public static void setQuimico(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("70");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("1");//FOR
        i++;
        campos[i].setText("2");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("2");//STM
        i++;
        campos[i].setText("3");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("2");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("0");//FOR
        i++;
        campos[i].setText("2");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("2");//INT
        i++;
        campos[i].setText("0");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("Máscara de filtro");//Item 1
        i++;
        campos[i].setText("10x Componentes químicos - EXPLOSIVOS");//Item 2
        i++;
        campos[i].setText("10x Componentes químicos - HOSPITALAR");//Item 3
        i++;
        campos[i].setText("5x Munição-Química(NEUTRALIZADORA)");//Item 4
        i++;
        campos[i].setText("5x Munição-Química(VENENOSA)");//Item 5
        i++;
        campos[i].setText("1x Spray de primeiros socorros ");//Item 6
        i++;
        campos[i].setText("");//Item 7
        i++;
        campos[i].setText("");//Item 8
        i++;
        campos[i].setText("Lançadora química");//Item Especial
        i++;
        campos[i].setText("Stun rod");//Item Branco
        // </editor-fold>

    }

    public static void setMedico(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("100");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("1");//FOR
        i++;
        campos[i].setText("2");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("2");//STM
        i++;
        campos[i].setText("3");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("1");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("1");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("0");//FOR
        i++;
        campos[i].setText("2");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("2");//INT
        i++;
        campos[i].setText("0");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("Stun gun");//Item 1
        i++;
        campos[i].setText("10x Componentes químicos-hospitalar");//Item 2
        i++;
        campos[i].setText("1x Kit de primeiros socorros");//Item 3
        i++;
        campos[i].setText("1x Vacinas anti-infecção");//Item 4
        i++;
        campos[i].setText("3x Vacinas de cura M");//Item 5
        i++;
        campos[i].setText("");//Item 6
        i++;
        campos[i].setText("");//Item 7
        i++;
        campos[i].setText("");//Item 8
        i++;
        campos[i].setText("Kit de sobrevivência");//Item Especial
        i++;
        campos[i].setText("Kris");//Item Branco
        // </editor-fold>

    }

    public static void setEngenheiro(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("70");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("1");//FOR
        i++;
        campos[i].setText("1");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("2");//STM
        i++;
        campos[i].setText("2");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("2");//RES
        i++;
        campos[i].setText("1");//PES
        i++;
        campos[i].setText("1");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("0");//FOR
        i++;
        campos[i].setText("0");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("2");//INT
        i++;
        campos[i].setText("0");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("2");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("Stun gun");//Item 1
        i++;
        campos[i].setText("30x Componentes de Construção");//Item 2
        i++;
        campos[i].setText("1x Kit de primeiros socorros");//Item 3
        i++;
        campos[i].setText("");//Item 4
        i++;
        campos[i].setText("");//Item 5
        i++;
        campos[i].setText("");//Item 6
        i++;
        campos[i].setText("");//Item 7
        i++;
        campos[i].setText("");//Item 8
        i++;
        campos[i].setText("Kit de ferramentas");//Item Especial
        i++;
        campos[i].setText("Pá");//Item Branco
        // </editor-fold>

    }

    public static void setLimpar(JTextField[] campos) {
        int i = 0;

        // <editor-fold defaultstate="collapsed" desc="STATUS">  
        campos[i].setText("1");//Level
        i++;
        campos[i].setText("70");//Karma
        i++;
        campos[i].setText("100");//VIT
        i++;
        campos[i].setText("0");//FOR
        i++;
        campos[i].setText("0");//PER
        i++;
        campos[i].setText("100");//APE
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("0");//INT
        i++;
        campos[i].setText("1");//ESP
        i++;
        campos[i].setText("0");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="STATUS BONUS">  
        campos[i].setText("0");//FOR
        i++;
        campos[i].setText("0");//PER
        i++;
        campos[i].setText("0");//STM
        i++;
        campos[i].setText("0");//INT
        i++;
        campos[i].setText("0");//RES
        i++;
        campos[i].setText("0");//PES
        i++;
        campos[i].setText("0");//CAR
        i++;
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="ITENS">  
        campos[i].setText("");//Item 1
        i++;
        campos[i].setText("");//Item 2
        i++;
        campos[i].setText("");//Item 3
        i++;
        campos[i].setText("");//Item 4
        i++;
        campos[i].setText("");//Item 5
        i++;
        campos[i].setText("");//Item 6
        i++;
        campos[i].setText("");//Item 7
        i++;
        campos[i].setText("");//Item 8
        i++;
        campos[i].setText("");//Item Especial
        i++;
        campos[i].setText("");//Item Branco
        // </editor-fold>

    }

}
