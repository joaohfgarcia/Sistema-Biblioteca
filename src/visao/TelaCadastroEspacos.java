package visao;

import controle.GerenciadorEspacos;
import javax.swing.JOptionPane;
import modelo.Espaco;


public class TelaCadastroEspacos extends javax.swing.JInternalFrame {

    
    public TelaCadastroEspacos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTituloTelaCadEsp = new javax.swing.JLabel();
        lbDescEsp = new javax.swing.JLabel();
        lbCapacidade = new javax.swing.JLabel();
        cbDispEsp = new javax.swing.JCheckBox();
        tfDescEsp = new javax.swing.JTextField();
        tfCapEsp = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();

        setClosable(true);

        lbTituloTelaCadEsp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTituloTelaCadEsp.setText("Cadastro de Espaços");

        lbDescEsp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDescEsp.setText("Descrição");

        lbCapacidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCapacidade.setText("Capacidade");

        cbDispEsp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbDispEsp.setText("Disponível");

        tfDescEsp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btSalvar.setBackground(new java.awt.Color(0, 204, 0));
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-24_1.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 153, 0));
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar-24.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-24_1.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-12-16_1.png"))); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTituloTelaCadEsp)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addGap(43, 43, 43)
                                .addComponent(btExcluir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbCapacidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCapEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbDispEsp))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbDescEsp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfDescEsp)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTituloTelaCadEsp)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescEsp)
                    .addComponent(tfDescEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCapEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCapacidade)
                    .addComponent(cbDispEsp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        String descEsp = tfDescEsp.getText();
        if(descEsp.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar descrição do espaço");
            return;
        }
        
        String capEsp = tfCapEsp.getText();
        if(capEsp.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar capacidade do espaço");
            return;
        }
        
        boolean dispEsp = cbDispEsp.isSelected(); 
        
        Espaco espaco = new Espaco(descEsp,capEsp,dispEsp);
        GerenciadorEspacos gerenciadorEsp = GerenciadorEspacos.getInstance();
                
        JOptionPane.showMessageDialog(null,gerenciadorEsp.adicionarEspaco(espaco));
        
        tfDescEsp.setText("");
        tfCapEsp.setText("");
        cbDispEsp.setSelected(false);
        tfDescEsp.requestFocus();
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        tfDescEsp.setText("");
        tfCapEsp.setText("");
        cbDispEsp.setSelected(false); 
        tfDescEsp.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        String descEsp = tfDescEsp.getText();
        GerenciadorEspacos gerenciadorEsp = GerenciadorEspacos.getInstance();
        boolean espacoRemover= gerenciadorEsp.removerEspaco(descEsp);
        if ( espacoRemover==false){
            JOptionPane.showMessageDialog(null,"Espaço não encontrado!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Espaço removido com sucesso!");
        }
        tfDescEsp.setText("");
        tfCapEsp.setText("");
        cbDispEsp.setSelected(false); 
        tfDescEsp.requestFocus();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        String buscaEsp = tfDescEsp.getText();
        GerenciadorEspacos gerenciadorEsp = GerenciadorEspacos.getInstance();
        Espaco esp1 = gerenciadorEsp.buscarEspaco(buscaEsp);
        
        if (esp1 == null){
            JOptionPane.showMessageDialog(null,"Espaço não encontrado!");
        } else{
            tfDescEsp.setText(esp1.getDescEspaco());
            tfCapEsp.setText(esp1.getCapacidade());
            cbDispEsp.setSelected(esp1.isDisponivel());
        } 
        
    }//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox cbDispEsp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCapacidade;
    private javax.swing.JLabel lbDescEsp;
    private javax.swing.JLabel lbTituloTelaCadEsp;
    private javax.swing.JTextField tfCapEsp;
    private javax.swing.JTextField tfDescEsp;
    // End of variables declaration//GEN-END:variables
}
