/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Sistema;

import rpg2.Utilitarios.Dados;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import rpg2.Config.TelaPrincipal;
import static rpg2.Sistema.UnrealSystemRPGView.carregado;

/**
 *
 * @author M4ESTRO
 */
public class LoadingView extends javax.swing.JFrame {

    /**
     * Creates new form LoadingView
     */
    private Timer time;
    private ActionListener al;
    static int tema = TelaPrincipal.getTema();
    static int tipo = TelaPrincipal.getTipo();
    ImageIcon iconeTela = new ImageIcon(ClassLoader.getSystemResource("rpg2/Imagens/icone64.png"));
    JFrame rpg;
    String frase[] = new String[3];
    ImageIcon fundo;

    //static LoadingView loadingView = new LoadingView();
   

    public LoadingView() {
        //this.setVisible(false);        
        al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if ((jProgressBarLoading.getValue() < 100) && (carregado)) {
                    jProgressBarLoading.setValue(jProgressBarLoading.getValue() + 3 + Dados.getDadoInt(6));

                    if (jProgressBarLoading.getValue() < 40) {
                        jLabelTextosDoLoading.setText(frase[0]);
                    }

                    if ((jProgressBarLoading.getValue() >= 40) && (jProgressBarLoading.getValue() < 65)) {
                        jLabelTextosDoLoading.setText(frase[1]);
                    }

                    if ((jProgressBarLoading.getValue() >= 65) && (jProgressBarLoading.getValue() < 100)) {
                        jLabelTextosDoLoading.setText(frase[2]);
                    }

                } else {
                    time.stop();
                    encerrar();

                    if (carregado) {
                        rpg.setVisible(true);
                        carregado = false;
                    }

                }
            }
        };        
        time = new Timer(200, al); // 100 milisegundos = 1s e.e
        initComponents();
        time.start();
    }

    public LoadingView(String frases[], int tipo, int tema, ImageIcon imagem) {
        //this.setVisible(false);
        this.tema = tema;
        this.tipo = tipo;
        switch (tipo) {
            case 2:
                rpg = new MedievalRPGView();                
                break;

            case 6:
                rpg = new UnrealSystemRPGView();
                break;
        }
        this.fundo = imagem;

        al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if ((jProgressBarLoading.getValue() < 100) && (carregado)) {
                    jProgressBarLoading.setValue(jProgressBarLoading.getValue() + 3 + Dados.getDadoInt(6));

                    if (jProgressBarLoading.getValue() < 40) {
                        jLabelTextosDoLoading.setText(frases[0]);
                    }

                    if ((jProgressBarLoading.getValue() >= 40) && (jProgressBarLoading.getValue() < 65)) {
                        jLabelTextosDoLoading.setText(frases[1]);
                    }

                    if ((jProgressBarLoading.getValue() >= 65) && (jProgressBarLoading.getValue() < 100)) {
                        jLabelTextosDoLoading.setText(frases[2]);
                    }

                } else {
                    time.stop();
                    encerrar();

                    if (carregado) {
                        rpg.setVisible(true);
                        carregado = false;
                    }

                }
            }
        };
        time = new Timer(200, al); // 100 milisegundos = 1s e.e
        initComponents();
        time.start();
    }

    public static int getTema() {
        return tema;
    }

    private void encerrar() {
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTemas = new javax.swing.ButtonGroup();
        UIManager.put("jProgressBar.foreground", Color.RED);
        UIManager.put("jProgressBarLoading.foreground", Color.red);
        jProgressBarLoading = new javax.swing.JProgressBar();
        jLabelTextosDoLoading = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Unreal System Project - Iniciando");
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setIconImage(iconeTela.getImage());
        setLocation(new java.awt.Point(450, 150));
        setMinimumSize(new java.awt.Dimension(730, 411));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jProgressBarLoading.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBarLoading.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBarLoading.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jProgressBarLoading.setStringPainted(true);
        getContentPane().add(jProgressBarLoading);
        jProgressBarLoading.setBounds(200, 340, 340, 50);

        jLabelTextosDoLoading.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        switch(tipo){
            case 1:
            jLabelTextosDoLoading.setForeground(new java.awt.Color(255, 0, 0));
            break;
            case 2:
            jLabelTextosDoLoading.setForeground(new java.awt.Color(153, 153, 0));
            break;
        }
        getContentPane().add(jLabelTextosDoLoading);
        jLabelTextosDoLoading.setBounds(150, 30, 560, 80);

        jLabel219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg2/Imagens/zombie_render_7_by_jorge573-d51ujlf.png"))); // NOI18N
        getContentPane().add(jLabel219);
        jLabel219.setBounds(160, 220, 450, 330);

        jLabelFundo.setIcon(fundo);
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 730, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Tema Inferno da dor (DEFAULT COLOR - RED) ">
        // UIManager.put("nimbusBase", new Color(135, 0, 0));
        // UIManager.put("nimbusBlueGrey", new Color(103, 81, 81));
        // UIManager.put("control", new Color(212, 204, 207));
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoadingView loadingView = new LoadingView();
                AWTUtilities.setWindowOpaque(loadingView, false);
                loadingView.toFront();
                loadingView.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTemas;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelTextosDoLoading;
    private javax.swing.JProgressBar jProgressBarLoading;
    // End of variables declaration//GEN-END:variables
}
