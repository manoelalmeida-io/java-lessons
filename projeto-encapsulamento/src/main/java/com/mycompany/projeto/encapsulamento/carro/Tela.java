/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento.carro;

/**
 *
 * @author Aluno
 */
public class Tela extends javax.swing.JFrame {

    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    
    /**
     * Creates new form Tela
     */
    public Tela() {
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

        btnLigarCarro1 = new javax.swing.JButton();
        btnAcelerarCarro1 = new javax.swing.JButton();
        btnFrearCarro1 = new javax.swing.JButton();
        btnDesligarCarro1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblStatusCarro1 = new javax.swing.JLabel();
        lblVelocidadeCarro1 = new javax.swing.JLabel();
        btnLigarCarro2 = new javax.swing.JButton();
        btnAcelerarCarro2 = new javax.swing.JButton();
        btnFrearCarro2 = new javax.swing.JButton();
        btnDesligarCarro2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblStatusCarro2 = new javax.swing.JLabel();
        pgsVelocidadeCarro2 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLigarCarro1.setText("Ligar");
        btnLigarCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigarCarro1ActionPerformed(evt);
            }
        });

        btnAcelerarCarro1.setText("Acelerar");
        btnAcelerarCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcelerarCarro1ActionPerformed(evt);
            }
        });

        btnFrearCarro1.setText("Frear");
        btnFrearCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrearCarro1ActionPerformed(evt);
            }
        });

        btnDesligarCarro1.setText("Desligar");
        btnDesligarCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligarCarro1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Status do Carro:");

        jLabel2.setText("Velocidade Atual:");

        lblStatusCarro1.setText("Desligado");

        lblVelocidadeCarro1.setText("0.0 km/h");

        btnLigarCarro2.setText("Ligar");
        btnLigarCarro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigarCarro2ActionPerformed(evt);
            }
        });

        btnAcelerarCarro2.setText("Acelerar");
        btnAcelerarCarro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcelerarCarro2ActionPerformed(evt);
            }
        });

        btnFrearCarro2.setText("Frear");
        btnFrearCarro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrearCarro2ActionPerformed(evt);
            }
        });

        btnDesligarCarro2.setText("Desligar");
        btnDesligarCarro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligarCarro2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Status do Carro:");

        lblStatusCarro2.setText("Desligado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgsVelocidadeCarro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLigarCarro1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAcelerarCarro1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFrearCarro1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesligarCarro1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatusCarro1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVelocidadeCarro1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLigarCarro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAcelerarCarro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFrearCarro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesligarCarro2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatusCarro2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLigarCarro1)
                    .addComponent(btnAcelerarCarro1)
                    .addComponent(btnFrearCarro1)
                    .addComponent(btnDesligarCarro1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblStatusCarro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblVelocidadeCarro1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLigarCarro2)
                    .addComponent(btnAcelerarCarro2)
                    .addComponent(btnFrearCarro2)
                    .addComponent(btnDesligarCarro2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblStatusCarro2))
                .addGap(18, 18, 18)
                .addComponent(pgsVelocidadeCarro2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigarCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigarCarro1ActionPerformed
        carro1.ligar();
        atualizar();
    }//GEN-LAST:event_btnLigarCarro1ActionPerformed

    private void btnAcelerarCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerarCarro1ActionPerformed
        carro1.acelerar();
        atualizar();
    }//GEN-LAST:event_btnAcelerarCarro1ActionPerformed

    private void btnFrearCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrearCarro1ActionPerformed
        carro1.frear();
        atualizar();
    }//GEN-LAST:event_btnFrearCarro1ActionPerformed

    private void btnDesligarCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesligarCarro1ActionPerformed
        carro1.desligar();
        atualizar();
    }//GEN-LAST:event_btnDesligarCarro1ActionPerformed

    private void btnLigarCarro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigarCarro2ActionPerformed
        carro2.ligar();
        atualizar();
    }//GEN-LAST:event_btnLigarCarro2ActionPerformed

    private void btnAcelerarCarro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerarCarro2ActionPerformed
        carro2.acelerar();
        atualizar();
    }//GEN-LAST:event_btnAcelerarCarro2ActionPerformed

    private void btnFrearCarro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrearCarro2ActionPerformed
        carro2.frear();
        atualizar();
    }//GEN-LAST:event_btnFrearCarro2ActionPerformed

    private void btnDesligarCarro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesligarCarro2ActionPerformed
        carro2.desligar();
        atualizar();
    }//GEN-LAST:event_btnDesligarCarro2ActionPerformed

    
    private void atualizar() {
        lblStatusCarro1.setText(carro1.getLigado() ? "Ligado" : "Desligado");
        lblStatusCarro2.setText(carro2.getLigado() ? "Ligado" : "Desligado");
        lblVelocidadeCarro1.setText(carro1.getVelocidade() + "km/h");
        pgsVelocidadeCarro2.setMaximum(120);
        pgsVelocidadeCarro2.setValue(carro2.getVelocidade().intValue());
    }
    
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcelerarCarro1;
    private javax.swing.JButton btnAcelerarCarro2;
    private javax.swing.JButton btnDesligarCarro1;
    private javax.swing.JButton btnDesligarCarro2;
    private javax.swing.JButton btnFrearCarro1;
    private javax.swing.JButton btnFrearCarro2;
    private javax.swing.JButton btnLigarCarro1;
    private javax.swing.JButton btnLigarCarro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblStatusCarro1;
    private javax.swing.JLabel lblStatusCarro2;
    private javax.swing.JLabel lblVelocidadeCarro1;
    private javax.swing.JProgressBar pgsVelocidadeCarro2;
    // End of variables declaration//GEN-END:variables
}
