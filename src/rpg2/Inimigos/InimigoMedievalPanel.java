/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Inimigos;

import rpg2.Ficha.FichaToin;
import rpg2.Utilitarios.CampoBatalha;

/**
 *
 * @author M4ESTRO
 */
public class InimigoMedievalPanel extends InimigoPanel {

    int raca, classe, sexo;

    public int getPV() {
        return Integer.parseInt(jTextFieldPV.getText());
    }

    public int getPM() {
        return Integer.parseInt(jTextFieldPM.getText());
    }

    public short getLevel() {
        return Short.parseShort(jTextFieldLevelInimigo.getText());
    }
    
    public short getFOR() {
        return Short.parseShort(jTextFieldFOR.getText());
    }

    public short getDES() {
        return Short.parseShort(jTextFieldDES.getText());
    }

    public short getINT() {
        return Short.parseShort(jTextFieldINT.getText());
    }

    public short getSAB() {
        return Short.parseShort(jTextFieldSAB.getText());
    }

    public short getSOR() {
        return Short.parseShort(jTextFieldSOR.getText());
    }

    public short getRES() {
        return Short.parseShort(jTextFieldRES.getText());
    }

    public String getTedencia() {
        return jComboBoxTedencia.getSelectedItem().toString();
    }

    public String getRaca() {
        return jComboBoxRaca.getSelectedItem().toString();
    }

    public String getClasse() {
        return jComboBoxClasses.getSelectedItem().toString();
    }

    public String getSexo() {
        return jComboBoxSexo.getSelectedItem().toString();
    }

    public void setPV(int atributo){
        jTextFieldPV.setText(String.valueOf(atributo));
    }
    
    public void setPM(int atributo){
        jTextFieldPM.setText(String.valueOf(atributo));
    }
    
    public void setLevel(short atributo){
        jTextFieldLevelInimigo.setText(String.valueOf(atributo));
    }
    
    public void setFOR(short atributo){
        jTextFieldFOR.setText(String.valueOf(atributo));
    }
    
    public void setDES(short atributo){
        jTextFieldDES.setText(String.valueOf(atributo));
    }
    
    public void setINT(short atributo){
        jTextFieldINT.setText(String.valueOf(atributo));
    }
    
    public void setSAB(short atributo){
        jTextFieldSAB.setText(String.valueOf(atributo));
    }
    
    public void setSOR(short atributo){
        jTextFieldSOR.setText(String.valueOf(atributo));
    }
    
    public void setRES(short atributo){
        jTextFieldRES.setText(String.valueOf(atributo));
    }
    
    public void setTedencia(String atributo){
        jComboBoxTedencia.setSelectedItem(atributo);
    }
    
    public void setSexo(String atributo){
        jComboBoxSexo.setSelectedItem(atributo);
    }
    
    public void setRaca(String atributo){
        jComboBoxRaca.setSelectedItem(atributo);
    }
    
    public void setClasse(String atributo){
        jComboBoxClasses.setSelectedItem(atributo);
    }
    
    public InimigoMedievalPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jTextFieldLevelInimigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTedencia = new javax.swing.JComboBox<>();
        jLabel182 = new javax.swing.JLabel();
        jTextFieldPV = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        jTextFieldINT = new javax.swing.JTextField();
        jTextFieldSAB = new javax.swing.JTextField();
        jLabel187 = new javax.swing.JLabel();
        jTextFieldPM = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jTextFieldFOR = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        jTextFieldSOR = new javax.swing.JTextField();
        jTextFieldRES = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        jTextFieldDES = new javax.swing.JTextField();
        jLabel185 = new javax.swing.JLabel();
        jButtonResetar = new javax.swing.JButton();
        jLabel178 = new javax.swing.JLabel();
        jComboBoxRaca = new javax.swing.JComboBox<>();
        jLabel166 = new javax.swing.JLabel();
        jComboBoxClasses = new javax.swing.JComboBox<>();
        jLabel165 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(370, 280));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 0, 0), null), "Status", 0, 0, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));

        jLabel150.setText("Level: ");

        jTextFieldLevelInimigo.setText("1");
        jTextFieldLevelInimigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLevelInimigoKeyTyped(evt);
            }
        });

        jLabel1.setText("Tendência: ");

        jComboBoxTedencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a tedência", "Leal/Bom", "Leal/Neutro", "Leal/Mau", "Neutro/Bom", "Neutro/Neutro", "Neutro/Mau", "Caótico/Bom", "Caótico/Neutro", "Caótico/Mau" }));
        jComboBoxTedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTedenciaActionPerformed(evt);
            }
        });

        jLabel182.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel182.setText("Pontos Vitálicos: ");

        jTextFieldPV.setText("0");
        jTextFieldPV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPVKeyTyped(evt);
            }
        });

        jLabel186.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel186.setText("Inteligência:");

        jTextFieldINT.setText("0");
        jTextFieldINT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldINTKeyTyped(evt);
            }
        });

        jTextFieldSAB.setText("0");
        jTextFieldSAB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSABKeyTyped(evt);
            }
        });

        jLabel187.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel187.setText("Sabedoria: ");

        jTextFieldPM.setText("0");
        jTextFieldPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPMKeyTyped(evt);
            }
        });

        jLabel183.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel183.setText("Pontos de Mana:");

        jLabel184.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel184.setText("Força: ");

        jTextFieldFOR.setText("0");
        jTextFieldFOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFORKeyTyped(evt);
            }
        });

        jLabel188.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel188.setText("Carisma/ Sorte: ");

        jTextFieldSOR.setText("0");
        jTextFieldSOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSORKeyTyped(evt);
            }
        });

        jTextFieldRES.setText("0");
        jTextFieldRES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRESKeyTyped(evt);
            }
        });

        jLabel189.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel189.setText("Resistência: ");

        jTextFieldDES.setText("0");
        jTextFieldDES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDESKeyTyped(evt);
            }
        });

        jLabel185.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel185.setText("Destreza: ");

        jButtonResetar.setText("Resetar");
        jButtonResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetarActionPerformed(evt);
            }
        });

        jLabel178.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel178.setText("Raça: ");

        jComboBoxRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a raça", "Humano", "Elfo", "Anão", "Meio-Demónio", "Meio-Celestial" }));
        jComboBoxRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRacaActionPerformed(evt);
            }
        });

        jLabel166.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel166.setText("Classe: ");

        jComboBoxClasses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a classe" }));
        jComboBoxClasses.setEnabled(false);
        jComboBoxClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClassesActionPerformed(evt);
            }
        });

        jLabel165.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel165.setText("Sexo:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o sexo", "Masculino", "Feminino", "Não definido" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel178)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel184)
                                    .addComponent(jLabel183)
                                    .addComponent(jLabel185))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDES, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldPM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel166)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxClasses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel182)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel189)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldRES, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel188)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldSOR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonResetar)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel165)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel186)
                                    .addComponent(jLabel187))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldINT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSAB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel150)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLevelInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLevelInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxTedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel182)
                            .addComponent(jTextFieldPV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel183)
                            .addComponent(jTextFieldPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel187))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel184)
                            .addComponent(jTextFieldFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel185)
                            .addComponent(jTextFieldDES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel178)
                            .addComponent(jComboBoxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel166)
                            .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel186)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jTextFieldINT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jTextFieldSAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel188)
                                    .addComponent(jTextFieldSOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel189)
                                .addComponent(jTextFieldRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel165)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonResetar)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLevelInimigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLevelInimigoKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldLevelInimigoKeyTyped

    private void jComboBoxTedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTedenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTedenciaActionPerformed

    private void jButtonResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetarActionPerformed
        jTextFieldLevelInimigo.setText("1");
        jComboBoxTedencia.setSelectedIndex(0);
        jComboBoxRaca.setSelectedIndex(0);
        jComboBoxClasses.setSelectedIndex(0);
        jComboBoxSexo.setSelectedIndex(0);
        jTextFieldPV.setText("0");
        jTextFieldFOR.setText("0");
        jTextFieldRES.setText("0");
        jTextFieldINT.setText("0");
        jTextFieldPM.setText("0");
        jTextFieldDES.setText("0");
        jTextFieldSOR.setText("0");
        jTextFieldSAB.setText("0");
    }//GEN-LAST:event_jButtonResetarActionPerformed

    private void jComboBoxRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRacaActionPerformed
        raca = jComboBoxRaca.getSelectedIndex();
        FichaToin.setClasse(raca, jComboBoxClasses);
    }//GEN-LAST:event_jComboBoxRacaActionPerformed

    private void jComboBoxClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClassesActionPerformed
        classe = jComboBoxClasses.getSelectedIndex();
    }//GEN-LAST:event_jComboBoxClassesActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        sexo = jComboBoxSexo.getSelectedIndex();
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jTextFieldPVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPVKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldPVKeyTyped

    private void jTextFieldPMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPMKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldPMKeyTyped

    private void jTextFieldFORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFORKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldFORKeyTyped

    private void jTextFieldDESKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDESKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldDESKeyTyped

    private void jTextFieldINTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldINTKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldINTKeyTyped

    private void jTextFieldSABKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSABKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldSABKeyTyped

    private void jTextFieldSORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSORKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldSORKeyTyped

    private void jTextFieldRESKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRESKeyTyped
        CampoBatalha.formatarCampo(evt);
    }//GEN-LAST:event_jTextFieldRESKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResetar;
    private javax.swing.JComboBox<String> jComboBoxClasses;
    private javax.swing.JComboBox<String> jComboBoxRaca;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxTedencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JTextField jTextFieldDES;
    private javax.swing.JTextField jTextFieldFOR;
    private javax.swing.JTextField jTextFieldINT;
    private javax.swing.JTextField jTextFieldLevelInimigo;
    private javax.swing.JTextField jTextFieldPM;
    private javax.swing.JTextField jTextFieldPV;
    private javax.swing.JTextField jTextFieldRES;
    private javax.swing.JTextField jTextFieldSAB;
    private javax.swing.JTextField jTextFieldSOR;
    // End of variables declaration//GEN-END:variables
}
