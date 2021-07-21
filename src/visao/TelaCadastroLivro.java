package visao;

import controle.GerenciadorLivros;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Livro;



public class TelaCadastroLivro extends javax.swing.JInternalFrame {


    public TelaCadastroLivro() {
        initComponents();
        
        this.cbxCategoria.removeAllItems();
        this.cbxTematica.removeAllItems();
        this.cbxCategoria.addItem("...");
        this.cbxTematica.addItem("...");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAutor2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbRetirada = new javax.swing.JLabel();
        lbAluguelLivro = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfTitulo = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        btBuscarLivro = new javax.swing.JButton();
        tfAno = new javax.swing.JTextField();
        lbEdicao = new javax.swing.JLabel();
        tfEdicao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbAutor = new javax.swing.JLabel();
        tfSnAutor = new javax.swing.JTextField();
        lbAutor3 = new javax.swing.JLabel();
        tfPnAutor = new javax.swing.JTextField();
        ckbDisponivel = new javax.swing.JCheckBox();
        btExcluir1 = new javax.swing.JButton();
        lbIsbn = new javax.swing.JLabel();
        tfIsbn = new javax.swing.JTextField();
        lbEditora1 = new javax.swing.JLabel();
        lbUF = new javax.swing.JLabel();
        tfEditora = new javax.swing.JTextField();
        lbRetirada1 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        cbxTematica = new javax.swing.JComboBox<>();
        tfqtAlugada = new javax.swing.JTextField();
        lbQtEstoque = new javax.swing.JLabel();
        lbQtAlugada = new javax.swing.JLabel();
        lbQtDisponivel = new javax.swing.JLabel();
        tfqtEstoque = new javax.swing.JTextField();
        tfqtReservada = new javax.swing.JTextField();
        tfUF = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();

        lbAutor2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor2.setText("Sobrenome:");

        setBorder(null);
        setClosable(true);

        lbRetirada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRetirada.setText("Categoria:");

        lbAluguelLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbAluguelLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book-16.png"))); // NOI18N
        lbAluguelLivro.setText("Cadastrar Publicação");

        btCadastrar.setBackground(new java.awt.Color(50, 150, 0));
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-24_1.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(0, 153, 255));
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar-24.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tfTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTitulo.setText("Título:");

        lbCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCidade.setText("Cidade:");

        tfCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAno.setText("Ano:");

        btBuscarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-12-16_1.png"))); // NOI18N
        btBuscarLivro.setPreferredSize(new java.awt.Dimension(23, 23));
        btBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLivroActionPerformed(evt);
            }
        });

        tfAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbEdicao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEdicao.setText("Edição:");

        tfEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdicaoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Autor"));

        lbAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor.setText("Sobrenome:");

        tfSnAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbAutor3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor3.setText("Primeiro nome:");

        tfPnAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAutor3)
                .addGap(18, 18, 18)
                .addComponent(tfPnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ckbDisponivel.setText("Disponível para locação");
        ckbDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbDisponivelActionPerformed(evt);
            }
        });

        btExcluir1.setBackground(new java.awt.Color(255, 0, 51));
        btExcluir1.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-24_1.png"))); // NOI18N
        btExcluir1.setText("Excluir");
        btExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir1ActionPerformed(evt);
            }
        });

        lbIsbn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbIsbn.setText("ISBN:");

        tfIsbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIsbnActionPerformed(evt);
            }
        });

        lbEditora1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEditora1.setText("Editora:");

        lbUF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbUF.setText("UF:");

        tfEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbRetirada1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRetirada1.setText("Temática:");

        cbxCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxCategoria.setAutoscrolls(true);
        cbxCategoria.setBorder(null);
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        cbxTematica.setAutoscrolls(true);
        cbxTematica.setBorder(null);
        cbxTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTematicaActionPerformed(evt);
            }
        });

        tfqtAlugada.setEditable(false);

        lbQtEstoque.setText("Qtd Estoque:");

        lbQtAlugada.setText("Qtd Alugada:");

        lbQtDisponivel.setText("Qtd Reservada:");

        tfqtEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfqtEstoqueActionPerformed(evt);
            }
        });

        tfqtReservada.setEditable(false);
        tfqtReservada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfqtReservadaActionPerformed(evt);
            }
        });

        tfUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btAtualizar.setBackground(new java.awt.Color(255, 153, 0));
        btAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/refresh-24_1.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbxTematica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbEditora1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbUF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbRetirada1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbQtEstoque))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)
                                    .addComponent(lbAno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ckbDisponivel))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tfqtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(91, 91, 91)
                                            .addComponent(lbQtAlugada))
                                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tfqtAlugada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbQtDisponivel)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfqtReservada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(btExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAluguelLivro)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAluguelLivro)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btBuscarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditora1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRetirada1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbDisponivel)
                    .addComponent(lbEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfqtAlugada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQtEstoque)
                    .addComponent(lbQtAlugada)
                    .addComponent(lbQtDisponivel)
                    .addComponent(tfqtReservada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfqtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfEditora.setText("");
        tfCidade.setText("");
        tfUF.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfIsbn.setText("");
        cbxCategoria.setSelectedItem("...");
        cbxTematica.setSelectedItem("...");
        ckbDisponivel.setSelected(false); 
        tfqtEstoque.setText("");
        tfqtAlugada.setText("");
        tfqtReservada.setText("");
        
        tfTitulo.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void tfEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdicaoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        
        String titulo, snautor, pnautor, editora, cidade, uf, categoria, tematica, 
                isbn, txtedicao,  txtano, txtqtdeEstoque;
        int edicao;
        int ano;
        int qtEstoque;
        int qtAlugada,qtReservada;
        boolean disponivel;
        
        titulo = tfTitulo.getText();
        
                
        if(titulo.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar título da publicação");
            return;
        }
        
        snautor = tfSnAutor.getText().toUpperCase();
        if(snautor.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar sobrenome do autor");
            return;
        }
        
        pnautor = tfPnAutor.getText();
        if(pnautor.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar primeiro nome do autor");
            return;
        }
        editora = tfEditora.getText();
        if(editora.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar Editora");
            return;
        }
        
        cidade = tfCidade.getText();
        if(cidade.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar Cidade");
            return;
        }
        
        uf = tfUF.getText().toUpperCase();
        if(uf.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar UF");
            return;
        }
        
        categoria = cbxCategoria.getSelectedItem().toString();
        if(categoria.equals("...")) {
            JOptionPane.showMessageDialog(null,"Escolher categoria");
            return;
        }  
        
        tematica = cbxTematica.getSelectedItem().toString();
        if(tematica.equals("...")) {
            JOptionPane.showMessageDialog(null,"Escolher temática");
            return;
        }
                
        isbn = tfIsbn.getText();
        if(isbn.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar ISBN");
            return;
        }
        
        txtedicao = tfEdicao.getText();
        if(txtedicao.length() == 0){
            JOptionPane.showMessageDialog(null,"Digitar edição  da publicação");
            return;
        }
        edicao = Integer.parseInt(txtedicao);
        
        txtano = tfAno.getText();
        if(txtano.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar ano da publicação");
            return;
        }
        ano = Integer.parseInt(txtano);
        
        disponivel = ckbDisponivel.isSelected();
        
        txtqtdeEstoque = tfqtEstoque.getText();
        if(txtqtdeEstoque.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar a quantidade em estoque");
            return;
        }
        qtEstoque = Integer.parseInt(txtqtdeEstoque);
        
        qtAlugada = 0;
        
        qtReservada = 0;       
        
        Livro addlivro = new Livro(titulo,snautor+","+pnautor,editora,cidade,uf,ano,edicao,isbn,
                categoria,tematica,disponivel,qtEstoque,qtAlugada,qtReservada);
        
        JOptionPane.showMessageDialog(null,gerenciadorLiv.adicionarLivro(addlivro));
        
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfEditora.setText("");
        tfCidade.setText("");
        tfUF.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfIsbn.setText("");
        cbxCategoria.setSelectedItem("...");
        cbxTematica.setSelectedItem("...");
        ckbDisponivel.setSelected(false);  
        tfqtEstoque.setText("");
        tfqtAlugada.setText("");
        tfqtReservada.setText("");          
        tfTitulo.requestFocus();
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void ckbDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbDisponivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbDisponivelActionPerformed

    private void btBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLivroActionPerformed
        // TODO add your handling code here:]
                
        String titulo = tfTitulo.getText();
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        Livro liv = gerenciadorLiv.buscarLivro(titulo);      

        if (liv == null){
            JOptionPane.showMessageDialog(null,"Livro não encontrado!");
            
        } else{
            
            tfTitulo.setText(liv.getTitulo());        
            String[] nomes = liv.getAutor().split(",");
            tfSnAutor.setText(nomes[0]);
            tfPnAutor.setText(nomes[1]);
            tfEditora.setText(liv.getEditora());
            tfCidade.setText(liv.getCidade());
            tfUF.setText(liv.getUf());           
            tfAno.setText(Integer.toString(liv.getAno()));     
            tfEdicao.setText(Integer.toString(liv.getEdicao()));
            tfIsbn.setText(liv.getIsbn());
            cbxCategoria.setSelectedItem(liv.getCategoria());
            cbxTematica.setSelectedItem(liv.getTematica());
            ckbDisponivel.setSelected(liv.isDisponivel());
            tfqtEstoque.setText(Integer.toString(liv.getQtEstoque()));
            tfqtAlugada.setText(Integer.toString(liv.getQtAlugada()));
            tfqtReservada.setText(Integer.toString(liv.getQtReservada()));
            
        }  
                
    }//GEN-LAST:event_btBuscarLivroActionPerformed

    private void btExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir1ActionPerformed
        // TODO add your handling code here:
        String titLivro = tfTitulo.getText();
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        boolean tituloRemover= gerenciadorLiv.removerLivro(titLivro);
        
        if ( tituloRemover==false){
            JOptionPane.showMessageDialog(null,"Publicação não encontrado!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Publicação removida com sucesso!");
        }
        
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfEditora.setText("");
        tfCidade.setText("");
        tfUF.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfIsbn.setText("");
        cbxCategoria.setSelectedItem("...");
        cbxTematica.setSelectedItem("...");
        ckbDisponivel.setSelected(false); 
        tfqtEstoque.setText("");
        tfqtAlugada.setText("");
        tfqtReservada.setText("");
        tfTitulo.requestFocus();
                
    }//GEN-LAST:event_btExcluir1ActionPerformed

    private void tfIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIsbnActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
  
        try {
            BufferedReader leiaArq = new BufferedReader(new InputStreamReader(new FileInputStream("categorias.txt"), "UTF-8"));
            
            String linha = leiaArq.readLine();
            while (linha != null){
                this.cbxCategoria.addItem(linha);
                linha = leiaArq.readLine();
            }
    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTematicaActionPerformed
        // TODO add your handling code here:
        
        try {
            BufferedReader leiaArq = new BufferedReader(new InputStreamReader(new FileInputStream("tematicas.txt"), "UTF-8"));
                       
            String linha = leiaArq.readLine();
            while (linha != null){
                this.cbxTematica.addItem(linha);
                linha = leiaArq.readLine();
            }
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxTematicaActionPerformed

    private void tfqtEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfqtEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfqtEstoqueActionPerformed

    private void tfqtReservadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfqtReservadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfqtReservadaActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
        
        String titulo = tfTitulo.getText();
        String snautor = tfSnAutor.getText();
        String pnautor = tfPnAutor.getText();
        String editora = tfEditora.getText();
        String cidade = tfCidade.getText();
        String uf = tfUF.getText();
        int ano = Integer.parseInt(tfAno.getText());
        int edicao = Integer.parseInt(tfEdicao.getText());
        String isbn = tfIsbn.getText();
        String categoria = cbxCategoria.getSelectedItem().toString();
        String tematica = cbxTematica.getSelectedItem().toString();
        boolean disponivel = ckbDisponivel.isSelected();
        int qtestoque = Integer.parseInt(tfqtEstoque.getText());
        int qtalugada = Integer.parseInt(tfqtAlugada.getText());
        int qtreservada = Integer.parseInt(tfqtReservada.getText());  
        
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        Livro atualizaLiv = new Livro(titulo,snautor+","+pnautor, editora, cidade, 
                uf, ano, edicao, isbn, categoria, tematica, disponivel, 
                qtestoque, qtalugada, qtreservada);      
   
        String retorno = gerenciadorLiv.atualizarLivro(atualizaLiv, titulo);      

        JOptionPane.showMessageDialog(null,retorno);      
  
        
    }//GEN-LAST:event_btAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscarLivro;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir1;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxTematica;
    private javax.swing.JCheckBox ckbDisponivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAluguelLivro;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbAutor2;
    private javax.swing.JLabel lbAutor3;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEditora1;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JLabel lbQtAlugada;
    private javax.swing.JLabel lbQtDisponivel;
    private javax.swing.JLabel lbQtEstoque;
    private javax.swing.JLabel lbRetirada;
    private javax.swing.JLabel lbRetirada1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEdicao;
    private javax.swing.JTextField tfEditora;
    private javax.swing.JTextField tfIsbn;
    private javax.swing.JTextField tfPnAutor;
    private javax.swing.JTextField tfSnAutor;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfUF;
    private javax.swing.JTextField tfqtAlugada;
    private javax.swing.JTextField tfqtEstoque;
    private javax.swing.JTextField tfqtReservada;
    // End of variables declaration//GEN-END:variables
}
