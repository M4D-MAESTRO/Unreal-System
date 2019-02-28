/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Utilitarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import rpg2.Inimigos.Inimigos;

/**
 *
 * @author M4ESTRO
 */
public class Guarnicao extends javax.swing.JPanel {

    private JList norte = new JList();
    private JList sul = new JList();
    private JList leste = new JList();
    private JList oeste = new JList();
    private boolean modoAtk;

    public Guarnicao(JList norte, JList sul, JList leste, JList oeste, boolean modoAtk) {
        initComponents();

        this.norte = norte;
        this.sul = sul;
        this.leste = leste;
        this.oeste = oeste;

        this.modoAtk = modoAtk;
        alternarModo(modoAtk);
    }

    public Guarnicao(JList norte, JList sul, JList leste, JList oeste, String forca, String tropa, Integer quant, boolean modoAtk) {
        initComponents();

        this.norte = norte;
        this.sul = sul;
        this.leste = leste;
        this.oeste = oeste;
        
        this.modoAtk = modoAtk;
        alternarModo(modoAtk);

        jComboBoxForca1.setSelectedItem(forca);
        jComboBoxTropa1.setSelectedItem(tropa);
        setQuantidadeMaxima(quant);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jComboBoxQuant1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxTropa1 = new javax.swing.JComboBox<>();
        jComboBoxDesig1 = new javax.swing.JComboBox<>();
        jButtonDesignar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxForca1 = new javax.swing.JComboBox<>();
        jLabelQuantMax = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(260, 133));

        jLabel8.setText("Quantidade");

        jComboBoxQuant1.setModel(new javax.swing.DefaultComboBoxModel<>(setQuant()));

        jLabel9.setText("Tropa");

        jComboBoxTropa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a força primeiro" }));
        jComboBoxTropa1.setEnabled(false);
        jComboBoxTropa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTropa1ActionPerformed(evt);
            }
        });

        jComboBoxDesig1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Designação", "Norte", "Sul", "Leste", "Oeste" }));
        jComboBoxDesig1.setEnabled(false);
        jComboBoxDesig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDesig1ActionPerformed(evt);
            }
        });

        jButtonDesignar.setText("Designar");
        jButtonDesignar.setEnabled(false);
        jButtonDesignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesignarActionPerformed(evt);
            }
        });

        jLabel1.setText("Força");

        jComboBoxForca1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a força ", "Roma", "BHC", "Exército", "Sobreviventes" }));
        jComboBoxForca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxForca1ActionPerformed(evt);
            }
        });

        jLabelQuantMax.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQuantMax.setText("/ ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jComboBoxDesig1, 0, 121, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonDesignar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxTropa1, 0, 150, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBoxQuant1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelQuantMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jComboBoxForca1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxQuant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxForca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxTropa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDesig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDesignar))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDesignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesignarActionPerformed
        if (reduzirQuant()) {
            setLocal();
        }
    }//GEN-LAST:event_jButtonDesignarActionPerformed

    private void jComboBoxForca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxForca1ActionPerformed
        if (modoAtk) {
            String aux = jComboBoxForca1.getSelectedItem().toString();
            jComboBoxTropa1.setEnabled(true);

            switch (aux) {
                case "Roma":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropas(1)));
                    restDesign();
                    break;

                case "BHC":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropas(2)));
                    restDesign();
                    break;

                case "Exército":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropas(3)));
                    restDesign();
                    break;

                case "Sobreviventes":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropas(4)));
                    restDesign();
                    break;

                default:
                    jComboBoxTropa1.setEnabled(false);
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione a força primeiro"}));
                    desativarBotao();
                    desativarDesig();
                    break;
            }

        } else {
            String aux = jComboBoxForca1.getSelectedItem().toString();
            jComboBoxTropa1.setEnabled(true);

            switch (aux) {
                case "Força criminosa":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropasInimigas(1)));
                    restDesign();

                    break;

                case "Força da Unreal":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropasInimigas(2)));
                    break;

                case "Infectados nível 1":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropasInimigas(3)));
                    break;

                case "Infectados nível 2":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropasInimigas(4)));
                    break;

                case "Infectados nível 3":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropasInimigas(5)));
                    break;

                case "Infectados nível 4":
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(getTropasInimigas(6)));
                    break;

                default:
                    jComboBoxTropa1.setEnabled(false);
                    jComboBoxTropa1.setModel(new DefaultComboBoxModel<>(new String[]{"Selecione a força primeiro"}));
                    desativarBotao();
                    desativarDesig();
                    break;

            }

        }


    }//GEN-LAST:event_jComboBoxForca1ActionPerformed

    private void jComboBoxTropa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTropa1ActionPerformed
        desativarDesig();
    }//GEN-LAST:event_jComboBoxTropa1ActionPerformed

    private void jComboBoxDesig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDesig1ActionPerformed
        desativarBotao();
    }//GEN-LAST:event_jComboBoxDesig1ActionPerformed

    private void desativarBotao() {
        Integer aux = jComboBoxDesig1.getSelectedIndex();

        if (aux >= 1) {
            jButtonDesignar.setEnabled(true);
        } else {
            jButtonDesignar.setEnabled(false);
        }
    }

    private void desativarDesig() {
        Integer aux = jComboBoxTropa1.getSelectedIndex();
        if (aux >= 1) {
            jComboBoxDesig1.setEnabled(true);
        } else {
            jComboBoxDesig1.setSelectedIndex(0);
            jComboBoxDesig1.setEnabled(false);
        }

    }

    private void restDesign() {
        if (jComboBoxTropa1.getSelectedIndex() == 0) {
            jComboBoxDesig1.setSelectedIndex(0);
            jComboBoxDesig1.setEnabled(false);
            desativarBotao();
        }
    }

    private String[] getTropas(Integer opcao) {
        List<String> tropas = new ArrayList<>();

        switch (opcao) {
            case 1://Roma
                tropas.addAll(Arrays.asList("Selecione o soldado", "Soldados policiais", "Sargento policiais", "Comandante policial", "Soldados militar", "Sargento militar", "Comandante militar",
                        "Médicos assistentes", "Médicos chefes", "Carros civis com modificações", "Hammer de combate", "Tank"));
                break;

            case 2: //BHC
                tropas.addAll(Arrays.asList("Selecione o soldado", "Soldado da BHC", "Infiltrador da BHC", "Especialista da BHC", "Suporte da BHC",
                        "Carros civis esportivos", "Carrie Truck", "Eagle", "Apache"));
                break;

            case 3: //Exercito
                tropas.addAll(Arrays.asList("Selecione o soldado", "Soldados fuzileiros", "Sargento fuzileiros", "Comandante fuzileiro", "Médicos fuzileiros",
                        "Cirurgiões fuzileiros", "Hover terrestre", "Hammer de combate", "Tank", "Apache"));
                break;

            case 4: //Sobreviventes
                tropas.addAll(Arrays.asList("Selecione o soldado", "Sobrevivente civil", "Sobrevivente militar", "Sobrevivente especialista", "Sobrevivente médico",
                        "Carros civis", "Carros civis esportivos", "Hover terrestre"));
                break;
        }

        String aux[] = new String[tropas.size()];
        return tropas.toArray(aux);
    }

    private String[] getTropasInimigas(Integer opcao) {
        List<String> tropas = new ArrayList<>();

        switch (opcao) {
            case 1://Forca Criminosa
                tropas.addAll(Arrays.asList(Inimigos.getForcaCriminosa()));
                break;

            case 2: // Forca da Unreal
                tropas.addAll(Arrays.asList(Inimigos.getForcaUnreal()));
                break;

            case 3: //Infectados 1
                tropas.addAll(Arrays.asList(Inimigos.getInfectados1()));
                break;

            case 4: //Infectados 2
                tropas.addAll(Arrays.asList(Inimigos.getInfectados2()));
                break;

            case 5: //Infectados 3
                tropas.addAll(Arrays.asList(Inimigos.getInfectados3()));
                break;

            case 6: //Infectados 4
                tropas.addAll(Arrays.asList(Inimigos.getInfectados4()));
                break;
        }

        String aux[] = new String[tropas.size()];
        return tropas.toArray(aux);
    }

    private void setGuarnicao(JEditorPane editorPane) {
        String quantidade = jComboBoxQuant1.getSelectedItem().toString();
        String tropa = jComboBoxTropa1.getSelectedItem().toString();
        String atual = editorPane.getText();
        int aux = atual.indexOf("</p>");
        atual = atual.substring(0, aux);

        String textoFormatado = atual + "(x " + quantidade + ") - <b>" + tropa + "</b><br>" + "</p>  </body> </html>";

        editorPane.setText(textoFormatado);

        //</p>  </body> </html>
    }

    private void setGuarnicao(JList lista) {
        String quantidade = jComboBoxQuant1.getSelectedItem().toString();
        String tropa = jComboBoxTropa1.getSelectedItem().toString();
        String textoFormatado = "(x " + quantidade + ") - " + tropa;

        DefaultListModel listModel = (DefaultListModel) lista.getModel();
        listModel.addElement(textoFormatado);

        lista.setModel(listModel);

        //</p>  </body> </html>
    }

    private void setLocal() {
        Integer local = jComboBoxDesig1.getSelectedIndex();

        switch (local) {
            case 1: //norte
                setGuarnicao(norte);
                break;

            case 2:// sul
                setGuarnicao(sul);
                break;

            case 3: // leste
                setGuarnicao(leste);
                break;

            case 4: //oeste
                setGuarnicao(oeste);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Designação inválida!");

        }
    }

    private String[] setQuant() {
        String aux[] = new String[100];
        for (Integer i = 1; i <= 100; i++) {
            aux[i - 1] = i.toString();
        }

        return aux;
    }

    private String[] setQuant(Integer quant) {
        String aux[] = new String[quant];
        for (Integer i = 1; i <= quant; i++) {
            aux[i - 1] = i.toString();
        }

        return aux;
    }

    private boolean reduzirQuant() {
        Integer quantidade = Integer.parseInt(jComboBoxQuant1.getSelectedItem().toString());
        Integer quantMax = Integer.parseInt(jLabelQuantMax.getText().substring(1));

        if (quantidade > quantMax) {
            JOptionPane.showMessageDialog(null, "Você NÃO possui essa quantidade toda de tropas!");
            return false;
        } else {
            Integer novaQuant = quantMax - quantidade;
            setQuantidadeMaxima(novaQuant);
            return true;
        }

    }

    public void setQuantidadeMaxima(Integer quant) {
        jLabelQuantMax.setText("/" + quant.toString());
    }

    private void alternarModo(boolean modoAtk) {
        if (modoAtk) {
            jComboBoxForca1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione a força ", "Roma", "BHC", "Exército", "Sobreviventes"}));
        } else {
            jComboBoxForca1.setModel(new javax.swing.DefaultComboBoxModel<>(Inimigos.getListaForca()));
        }

    }

    public void tropaExiste(){
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDesignar;
    private javax.swing.JComboBox<String> jComboBoxDesig1;
    private javax.swing.JComboBox<String> jComboBoxForca1;
    private javax.swing.JComboBox<String> jComboBoxQuant1;
    private javax.swing.JComboBox<String> jComboBoxTropa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelQuantMax;
    // End of variables declaration//GEN-END:variables
}
