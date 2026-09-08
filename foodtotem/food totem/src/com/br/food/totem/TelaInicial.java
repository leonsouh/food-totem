package com.br.food.totem;

public class TelaInicial extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaInicial.class.getName());

    public TelaInicial() {
        initComponents();
        
        //BtComerAqui.setOpaque(true);
        //BtComerAqui.setContentAreaFilled(true);
        BtComerAqui.setBackground(new java.awt.Color(25, 5, 8, 5));
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtComerAqui = new javax.swing.JButton();
        BtParaViagem = new javax.swing.JButton();
        LbTelaInicial = new javax.swing.JLabel();
        LbImagemComerAqui = new javax.swing.JLabel();
        LbImagemParaViagem = new javax.swing.JLabel();
        LbFazerOPedido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtComerAqui.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BtComerAqui.setText("Comer Aqui");
        BtComerAqui.setMaximumSize(new java.awt.Dimension(150, 70));
        BtComerAqui.setMinimumSize(new java.awt.Dimension(150, 70));
        BtComerAqui.addActionListener(this::BtComerAquiActionPerformed);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LbTelaInicial)
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LbFazerOPedido)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LbImagemComerAqui)
                    .addComponent(BtComerAqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LbImagemParaViagem)
                    .addComponent(BtParaViagem))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTelaInicial)
                .addGap(43, 43, 43)
                .addComponent(LbFazerOPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbImagemComerAqui)
                    .addComponent(LbImagemParaViagem))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtComerAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtParaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtComerAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComerAquiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtComerAquiActionPerformed

    private void BtParaViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtParaViagemActionPerformed
         java.awt.EventQueue.invokeLater(() -> new ParaViagemTela().setVisible(true));
    }//GEN-LAST:event_BtParaViagemActionPerformed

    private void BtParaViagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtParaViagemMouseClicked
      
    }//GEN-LAST:event_BtParaViagemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtComerAqui;
    private javax.swing.JButton BtParaViagem;
    private javax.swing.JLabel LbFazerOPedido;
    private javax.swing.JLabel LbImagemComerAqui;
    private javax.swing.JLabel LbImagemParaViagem;
    private javax.swing.JLabel LbTelaInicial;
    // End of variables declaration//GEN-END:variables
}
