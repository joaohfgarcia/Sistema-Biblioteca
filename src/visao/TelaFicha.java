package visao;

import com.sun.xml.internal.ws.util.StringUtils;
import controle.GerenciadorFichas;
import javax.swing.JOptionPane;
import modelo.Ficha;


public class TelaFicha extends javax.swing.JInternalFrame {
    
    public TelaFicha() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFicha = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        btBuscarLivro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbAutorFicha = new javax.swing.JLabel();
        lbIsbn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDadosLivro = new javax.swing.JTextArea();
        lbNumIsbn = new javax.swing.JLabel();
        lbAssuntos = new javax.swing.JLabel();
        lbDadosAssuntos = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);

        lbFicha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fichablack-24.png"))); // NOI18N
        lbFicha.setText("Visualizar Ficha Catalográfica");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTitulo.setText("Título:");

        tfTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btBuscarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-12-16_1.png"))); // NOI18N
        btBuscarLivro.setPreferredSize(new java.awt.Dimension(23, 23));
        btBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLivroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbAutorFicha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutorFicha.setText("AUTOR");

        lbIsbn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbIsbn.setText("Orientador:");

        txDadosLivro.setEditable(false);
        txDadosLivro.setColumns(20);
        txDadosLivro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txDadosLivro.setRows(5);
        txDadosLivro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(txDadosLivro);

        lbNumIsbn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbAssuntos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAssuntos.setText("Assuntos:");

        lbDadosAssuntos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbAutorFicha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbIsbn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbNumIsbn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbAssuntos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDadosAssuntos)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbAutorFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIsbn)
                    .addComponent(lbNumIsbn))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAssuntos)
                    .addComponent(lbDadosAssuntos))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbFicha)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbTitulo)
                            .addGap(18, 18, 18)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFicha)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTitulo)
                        .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btBuscarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 670, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLivroActionPerformed
        // TODO add your handling code here:
        String titulo = tfTitulo.getText();

        GerenciadorFichas gerenciadorFch = GerenciadorFichas.getInstance();
        Ficha fch = gerenciadorFch.buscarFicha(titulo);

        if (fch == null){
            JOptionPane.showMessageDialog(null,"Ficha não encontrada!");

        } else{

            tfTitulo.setText(fch.getTitulo());
            lbAutorFicha.setText(fch.getAutor());
            String[] nomes = fch.getAutor().split(",");
            String nomeNormal = nomes[1]+" "+ StringUtils.capitalize(nomes[0].toLowerCase());
            txDadosLivro.setText(fch.getTitulo()+ " - " + nomeNormal + " - " + fch.getCidade()
                + "/" + fch.getUf()+ " - " + fch.getUniversidade()+"."+fch.getAno());

            lbNumIsbn.setText(fch.getOrientador());
            lbDadosAssuntos.setText(fch.getAssunto1()+" - "+fch.getAssunto2()+" - "+fch.getAssunto3()
                +" I.Título" + " II."+fch.getUniversidade()+" - "+fch.getCidade()+" "+fch.getUf());
        }

    }//GEN-LAST:event_btBuscarLivroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarLivro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAssuntos;
    private javax.swing.JLabel lbAutorFicha;
    private javax.swing.JLabel lbDadosAssuntos;
    private javax.swing.JLabel lbFicha;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JLabel lbNumIsbn;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextArea txDadosLivro;
    // End of variables declaration//GEN-END:variables
}
