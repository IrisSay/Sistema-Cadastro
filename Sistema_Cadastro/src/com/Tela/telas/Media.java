/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.Tela.telas;

/**
 *
 * @author Professor
 */
public class Media extends javax.swing.JInternalFrame {

    /**
     * Creates new form Media
     */
    public Media() {
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

        NomeAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        Nota1 = new javax.swing.JTextField();
        Nota2 = new javax.swing.JTextField();
        Nota3 = new javax.swing.JTextField();
        Nota4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnMedia = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(456, 442));

        NomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAlunoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do aluno :");

        btnPesquisar.setText("Search:");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        Nota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota3ActionPerformed(evt);
            }
        });

        Nota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nota 1:                 Nota 2:                 Nota 3:                 Nota 4:");

        btnMedia.setText("Média :");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPesquisar))
                                            .addComponent(jLabel1))
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btnMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnMedia)
                .addGap(18, 18, 18)
                .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSair)
                .addGap(7, 7, 7))
        );

        setSize(new java.awt.Dimension(411, 442));
    }// </editor-fold>//GEN-END:initComponents

    private void NomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeAlunoActionPerformed

    private void Nota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nota4ActionPerformed

    private void Nota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nota3ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(Nota1.getText());
        double n2 = Double.parseDouble(Nota2.getText());
        double n3 = Double.parseDouble(Nota3.getText());
        double n4 = Double.parseDouble(Nota4.getText());
        double soma = (n1+n2+n3+n4);
        double notaF = (soma/4);
        double media = 7;
        String media2 = String.format("%.2f", notaF);
        if (media >= notaF){
            txtMedia.setText(media2);
            txtResultado.setText("ALUNO APROVADO");
        }
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String nome = String.valueOf(txtNome.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeAluno;
    private javax.swing.JTextField Nota1;
    private javax.swing.JTextField Nota2;
    private javax.swing.JTextField Nota3;
    private javax.swing.JTextField Nota4;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables


}
