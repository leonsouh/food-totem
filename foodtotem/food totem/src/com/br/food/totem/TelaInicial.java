package com.br.food.totem;

public class TelaInicial extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaInicial.class.getName());

    public TelaInicial() {
        initComponents();
        
   
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtParaViagem = new javax.swing.JButton();
        LbTelaInicial = new javax.swing.JLabel();
        LbImagemComerAqui = new javax.swing.JLabel();
        LbImagemParaViagem = new javax.swing.JLabel();
        LbFazerOPedido = new javax.swing.JLabel();
        btComerAqui = new javax.swing.JButton();

        BtParaViagem.setBackground(new java.awt.Color(232, 232, 232));
        BtParaViagem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BtParaViagem.setText("Para Viagem");
        BtParaViagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtParaViagemMouseClicked(evt);
            }
        });
        BtParaViagem.addActionListener(this::BtParaViagemActionPerformed);

        LbTelaInicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LbTelaInicial.setText("Tela inicial");

        LbImagemComerAqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/br/food/totem/comendo aqui.png"))); // NOI18N

        LbImagemParaViagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/br/food/totem/levar pra comer.png"))); // NOI18N

        LbFazerOPedido.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        LbFazerOPedido.setText("Fazer o Pedido");

        btComerAqui.setBackground(new java.awt.Color(221, 221, 221));
        btComerAqui.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btComerAqui.setText("Comer aqui");
        btComerAqui.addActionListener(this::btComerAquiActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LbTelaInicial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LbFazerOPedido)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LbImagemComerAqui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btComerAqui))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(LbImagemParaViagem)
                                    .addComponent(BtParaViagem))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTelaInicial)
                .addGap(42, 42, 42)
                .addComponent(LbFazerOPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbImagemComerAqui)
                    .addComponent(LbImagemParaViagem))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtParaViagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btComerAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtParaViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtParaViagemActionPerformed
        java.awt.EventQueue.invokeLater(() -> new TelaDeSeleçãoDeLanchesComerAqui().setVisible(true));
    }//GEN-LAST:event_BtParaViagemActionPerformed

    private void BtParaViagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtParaViagemMouseClicked
      
    }//GEN-LAST:event_BtParaViagemMouseClicked

    private void btComerAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComerAquiActionPerformed
        java.awt.EventQueue.invokeLater(() -> new TelaDeSeleçãoDeLanchesComerAqui().setVisible(true));
    }//GEN-LAST:event_btComerAquiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtParaViagem;
    private javax.swing.JLabel LbFazerOPedido;
    private javax.swing.JLabel LbImagemComerAqui;
    private javax.swing.JLabel LbImagemParaViagem;
    private javax.swing.JLabel LbTelaInicial;
    private javax.swing.JButton btComerAqui;
    // End of variables declaration//GEN-END:variables
}
