/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Espectador;
import classes.Pesquisa;
import javax.swing.JOptionPane;

/**
 *
 * @author lucca
 */
public class Cadastro extends javax.swing.JDialog {

    private Pesquisa pesquisaFilme;

    public Cadastro(java.awt.Frame parent, boolean modal,Pesquisa pesquisa) {
        super(parent, modal);
        initComponents();
        pesquisaFilme=pesquisa;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGOpinioes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFIdade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jBGrava = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registra Opiniões");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Espectador"));

        jLabel1.setText("Idade:");

        jLabel2.setText("Qual é a sua opinião sobre o filme?");

        BGOpinioes.add(jRadioButton1);
        jRadioButton1.setText("Ótimo");
        jRadioButton1.setActionCommand("A");

        BGOpinioes.add(jRadioButton2);
        jRadioButton2.setText("Bom");
        jRadioButton2.setActionCommand("B");

        BGOpinioes.add(jRadioButton3);
        jRadioButton3.setText("Regular");
        jRadioButton3.setActionCommand("C");

        BGOpinioes.add(jRadioButton4);
        jRadioButton4.setText("Ruim");
        jRadioButton4.setActionCommand("D");

        BGOpinioes.add(jRadioButton5);
        jRadioButton5.setText("Péssimo");
        jRadioButton5.setActionCommand("E");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jBGrava.setText("Gravar");
        jBGrava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBGrava)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGrava)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGravaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravaActionPerformed
        if (jTFIdade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo idade tem preenchimento obrigatório", "Aviso", 0);
            jTFIdade.requestFocusInWindow();
            return;
        }
        if (BGOpinioes.getSelection() != null) {
            String simNao[] = {"Sim", "Não"};
            int grava = JOptionPane.showOptionDialog(this, "Confima os dados?", "Gravando...", JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
            if (grava == 0) {
                Espectador espectador = new Espectador(Byte.parseByte(jTFIdade.getText()), BGOpinioes.getSelection().getActionCommand().charAt(0));
                if (!pesquisaFilme.adiciona(espectador)) {
                    JOptionPane.showMessageDialog(this, "Infelizmente sua opinião não foi computada por falta de espaço", "Aviso", 0);
                }
                jTFIdade.setText(null);
                jTFIdade.requestFocusInWindow();
                BGOpinioes.clearSelection();

            }

        } else {
            JOptionPane.showMessageDialog(this, "Dê sua opinião sobre o filme!!", "Aviso", 0);
        }
    }//GEN-LAST:event_jBGravaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGOpinioes;
    private javax.swing.JButton jBGrava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField jTFIdade;
    // End of variables declaration//GEN-END:variables
}