/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.cofrinho;

/**
 *
 * @author Aluno
 */
public class Tela02 extends javax.swing.JFrame {

    Cofrinho cofrinho01 = new Cofrinho();
    Cofrinho cofrinho02 = new Cofrinho();
    
    /**
     * Creates new form Tela02
     */
    public Tela02() {
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

        btnQuebrar01 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnQuebrar02 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo01 = new javax.swing.JLabel();
        btnDepositar01 = new javax.swing.JButton();
        btnSacar01 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSaldo02 = new javax.swing.JLabel();
        btnDepositar02 = new javax.swing.JButton();
        btnSacar02 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnTrasferir01 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnTrasferir02 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuebrar01.setText("Quebrar cofre");
        btnQuebrar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuebrar01ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Conta 01");

        btnQuebrar02.setText("Quebrar cofre");
        btnQuebrar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuebrar02ActionPerformed(evt);
            }
        });

        jLabel2.setText("Saldo");

        lblSaldo01.setText("0");

        btnDepositar01.setText("Depositar R$50");
        btnDepositar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar01ActionPerformed(evt);
            }
        });

        btnSacar01.setText("Sacar R$50");
        btnSacar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar01ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Conta 02");

        jLabel4.setText("Saldo");

        lblSaldo02.setText("0");

        btnDepositar02.setText("Depositar R$50");
        btnDepositar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar02ActionPerformed(evt);
            }
        });

        btnSacar02.setText("Sacar R$50");
        btnSacar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar02ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnTrasferir01.setText("Transferir");
        btnTrasferir01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasferir01ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnTrasferir02.setText("Transferir");
        btnTrasferir02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasferir02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldo01))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDepositar01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSacar01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuebrar01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrasferir01))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldo02))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDepositar02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSacar02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuebrar02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrasferir02)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSaldo01))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDepositar01)
                            .addComponent(btnSacar01)
                            .addComponent(btnQuebrar01))
                        .addComponent(jSeparator1))
                    .addComponent(btnTrasferir01))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSaldo02))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDepositar02)
                            .addComponent(btnSacar02)
                            .addComponent(btnQuebrar02))
                        .addComponent(jSeparator2))
                    .addComponent(btnTrasferir02, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuebrar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuebrar01ActionPerformed
        cofrinho01.quebrar();
        lblSaldo01.setText(String.format("%.2f", cofrinho01.saldo));
    }//GEN-LAST:event_btnQuebrar01ActionPerformed

    private void btnQuebrar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuebrar02ActionPerformed
        cofrinho02.quebrar();
        lblSaldo02.setText(String.format("%.2f", cofrinho02.saldo));
    }//GEN-LAST:event_btnQuebrar02ActionPerformed

    private void btnDepositar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar01ActionPerformed
        cofrinho01.depositar();
        lblSaldo01.setText(String.format("%.2f", cofrinho01.saldo));
    }//GEN-LAST:event_btnDepositar01ActionPerformed

    private void btnSacar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar01ActionPerformed
        cofrinho01.sacar();
        lblSaldo01.setText(String.format("%.2f", cofrinho01.saldo));
    }//GEN-LAST:event_btnSacar01ActionPerformed

    private void btnDepositar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar02ActionPerformed
        cofrinho02.depositar();
        lblSaldo02.setText(String.format("%.2f", cofrinho02.saldo));
    }//GEN-LAST:event_btnDepositar02ActionPerformed

    private void btnSacar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar02ActionPerformed
        cofrinho02.sacar();
        lblSaldo02.setText(String.format("%.2f", cofrinho02.saldo));
    }//GEN-LAST:event_btnSacar02ActionPerformed

    private void btnTrasferir01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasferir01ActionPerformed
        cofrinho01.trasferir(cofrinho02);
        lblSaldo01.setText(String.format("%.2f", cofrinho01.saldo));
        lblSaldo02.setText(String.format("%.2f", cofrinho02.saldo));
    }//GEN-LAST:event_btnTrasferir01ActionPerformed

    private void btnTrasferir02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasferir02ActionPerformed
        cofrinho02.trasferir(cofrinho01);
        lblSaldo01.setText(String.format("%.2f", cofrinho01.saldo));
        lblSaldo02.setText(String.format("%.2f", cofrinho02.saldo));
    }//GEN-LAST:event_btnTrasferir02ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar01;
    private javax.swing.JButton btnDepositar02;
    private javax.swing.JButton btnQuebrar01;
    private javax.swing.JButton btnQuebrar02;
    private javax.swing.JButton btnSacar01;
    private javax.swing.JButton btnSacar02;
    private javax.swing.JButton btnTrasferir01;
    private javax.swing.JButton btnTrasferir02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblSaldo01;
    private javax.swing.JLabel lblSaldo02;
    // End of variables declaration//GEN-END:variables
}
