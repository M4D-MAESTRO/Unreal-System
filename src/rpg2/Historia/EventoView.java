/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2.Historia;

import rpg2.Imagens.Imagens;
import rpg2.Sistema.Tela;

/**
 *
 * @author M4ESTRO
 */
public class EventoView extends javax.swing.JFrame {

    /**
     * Creates new form EventoView
     */
    int tipoEvento = 0;
    int evento = 0;

    public EventoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxTipoEvento = new javax.swing.JComboBox<>();
        jComboBoxEvento = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaDescEvento = new javax.swing.JTextArea();
        jButtonEventoAleatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerador de Evento");
        setIconImage(Imagens.getIconeTela(4));
        setLocation(Tela.getLargura()/2, Tela.getAltura()/2);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 240));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 190));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 190));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 190));

        jComboBoxTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo de evento", "Ajudar Sobreviventes", "Defender assentamento aliado", "Eliminar horda", "Impedir criminosos/terroristas", "Pegar Recursos", "Todos" }));
        jComboBoxTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoEventoActionPerformed(evt);
            }
        });

        jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o evento" }));
        jComboBoxEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEventoActionPerformed(evt);
            }
        });

        jTextAreaDescEvento.setEditable(false);
        jTextAreaDescEvento.setColumns(20);
        jTextAreaDescEvento.setRows(5);
        jScrollPane5.setViewportView(jTextAreaDescEvento);

        jButtonEventoAleatorio.setText("Evento aleatório");
        jButtonEventoAleatorio.setToolTipText("Selecione o tipo de evento, então clique no botão para gerar um aleatório");
        jButtonEventoAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEventoAleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoEvento, 0, 325, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEventoAleatorio)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEventoAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoEventoActionPerformed
        tipoEvento = jComboBoxTipoEvento.getSelectedIndex(); // 0 - Selecione o tipo de evento

        switch (tipoEvento) {
            case 1: // 1 - Ajudar Sobreviventes
                jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel(Evento.getAjudarSobrevivente()));
                jTextAreaDescEvento.setText("");
                break;

            case 2: // 2 - Defender assentamento aliado
                jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel(Evento.getDefenderAssentamento()));
                jTextAreaDescEvento.setText("");
                break;

            case 3: // 3 - Eliminar horda
                jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel(Evento.getEliminarHorda()));
                jTextAreaDescEvento.setText("");
                break;

            case 4: // 4 - Impedir criminosos/terroristas
                jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel(Evento.getImpedirCT()));
                jTextAreaDescEvento.setText("");
                break;

            case 5: // 5 - Pegar Recursos
                jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel(Evento.getPegarRecurso()));
                jTextAreaDescEvento.setText("");
                break;

            case 6: // 6 - Todos
                jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel(Evento.getTodos()));
                jTextAreaDescEvento.setText("");
                break;

            default:
                jComboBoxEvento.setModel(new javax.swing.DefaultComboBoxModel(Evento.getDefaultModel()));
                 jTextAreaDescEvento.setText("");

        }
    }//GEN-LAST:event_jComboBoxTipoEventoActionPerformed

    private void jComboBoxEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEventoActionPerformed
       jTextAreaDescEvento.setText(jComboBoxEvento.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxEventoActionPerformed

    private void jButtonEventoAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEventoAleatorioActionPerformed
        jTextAreaDescEvento.setText(Evento.eventoAleatorio(tipoEvento));
    }//GEN-LAST:event_jButtonEventoAleatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEventoAleatorio;
    private javax.swing.JComboBox<String> jComboBoxEvento;
    private javax.swing.JComboBox<String> jComboBoxTipoEvento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaDescEvento;
    // End of variables declaration//GEN-END:variables
}