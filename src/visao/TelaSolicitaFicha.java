/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.GerenciadorFichas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Ficha;
import javax.swing.JComboBox;
/**
 *
 
 */
public class TelaSolicitaFicha extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaSolicitaFicha
     */
    public TelaSolicitaFicha() {
        initComponents();
        this.cbxTipo.addItem("...");
        this.cbxTipo.addItem("Monografia(Graduação)");
        this.cbxTipo.addItem("Dissertação(Mestrado)");
        this.cbxTipo.addItem("Tese(Doutorado)");
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
        lbAssuntos = new javax.swing.JLabel();
        lbAluguelLivro = new javax.swing.JLabel();
        btSolicitar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfTitulo = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        lbEditora = new javax.swing.JLabel();
        lbAno = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbAutor = new javax.swing.JLabel();
        tfSnAutor = new javax.swing.JTextField();
        lbAutor3 = new javax.swing.JLabel();
        tfPnAutor = new javax.swing.JTextField();
        lbFolhas = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbUF = new javax.swing.JLabel();
        lbRetirada1 = new javax.swing.JLabel();
        lbRetirada2 = new javax.swing.JLabel();
        lbRetirada3 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        tfUniversidade = new javax.swing.JTextField();
        lbOrientador = new javax.swing.JLabel();
        tfOrientador = new javax.swing.JTextField();
        tfFolhas = new javax.swing.JTextField();
        lbNfolhas = new javax.swing.JLabel();
        tfAssunto1 = new javax.swing.JTextField();
        tfAssunto2 = new javax.swing.JTextField();
        tfAssunto3 = new javax.swing.JTextField();
        tfUf = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);

        lbAssuntos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAssuntos.setText("Assuntos:");

        lbAluguelLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbAluguelLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fichablack-24.png"))); // NOI18N
        lbAluguelLivro.setText("Solicitar Ficha Catalográfica");

        btSolicitar.setBackground(new java.awt.Color(50, 150, 0));
        btSolicitar.setForeground(new java.awt.Color(255, 255, 255));
        btSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-24_1.png"))); // NOI18N
        btSolicitar.setText("Salvar");
        btSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSolicitarActionPerformed(evt);
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

        tfTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTitulo.setText("Título:");

        lbEditora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEditora.setText("Universidade:");

        lbAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAno.setText("Ano:");

        tfAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                .addComponent(tfPnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
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

        lbFolhas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFolhas.setText("Tipo:");

        lbCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCidade.setText("Cidade:");

        tfCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbUF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbUF.setText("UF:");

        lbRetirada1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRetirada1.setText("1.");

        lbRetirada2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRetirada2.setText("2.");

        lbRetirada3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRetirada3.setText("3.");

        cbxTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfUniversidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbOrientador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbOrientador.setText("Orientador:");

        tfOrientador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfFolhas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbNfolhas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNfolhas.setText("Nº Folhas:");

        tfAssunto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfAssunto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfAssunto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfUf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbEditora)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbAssuntos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbRetirada1))
                                .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfUniversidade, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbRetirada3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbFolhas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbAno)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfAssunto3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tfAssunto1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                            .addComponent(lbRetirada2)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfAssunto2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(tfOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbNfolhas))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbUF)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfUf)
                                                .addComponent(tfFolhas, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))))
                                    .addGap(39, 39, 39))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbAluguelLivro)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAluguelLivro)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUniversidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAssuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRetirada1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRetirada2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAssunto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAssunto2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFolhas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNfolhas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFolhas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRetirada3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAssunto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 869, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void btSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSolicitarActionPerformed
        // TODO add your handling code here:
        GerenciadorFichas gerenciadorFch = GerenciadorFichas.getInstance();
        
        String titulo;
        String snAutor;
        String pnAutor;
        String universidade;
        String tipo;
        String assunto1;
        String assunto2;
        String assunto3;
        String orientador;
        int folhas;
        int ano;
        String cidade;
        String uf;
        String situacao;
        String data;
                
        titulo = tfTitulo.getText();
        if(titulo.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar titulo da publicação");
            return;
        }
        
        snAutor = tfSnAutor.getText().toUpperCase();
        if(snAutor.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar sobrenome do autor");
            return;
        }
        
        pnAutor = tfPnAutor.getText();
        if(pnAutor.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar primeiro nome do autor");
            return;
        }
        
        universidade = tfUniversidade.getText();
        if(universidade.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar nome da universidade");
            return;
        }
          
        tipo = cbxTipo.getSelectedItem().toString(); 
        if(tipo.equals("...")) {
            JOptionPane.showMessageDialog(null,"Escolher tipo de publicação");
            return;
        }    
        
        assunto1 = tfAssunto1.getText();
        if(assunto1.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digite pelo menos 1 assunto");
            return;
        }
        
        assunto2 = tfAssunto2.getText();
        
        assunto3 = tfAssunto3.getText();
        
        orientador = tfOrientador.getText();
        if(orientador.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar nome do orientador");
            return;
        }
        
        folhas = Integer.parseInt(tfFolhas.getText());
        if(folhas == 0) {
            JOptionPane.showMessageDialog(null,"Digitar numero de folhas");
            return;
        }
        
        ano = Integer.parseInt(tfAno.getText());
        if(ano == 0) {
            JOptionPane.showMessageDialog(null,"Digitar ano da publicação");
            return;
        }
        
        cidade = tfCidade.getText();
        if(cidade.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digite a cidade");
            return;
        }
        
        uf = tfUf.getText().toUpperCase();
        if(cidade.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digite a UF");
            return;
        }
                           
        situacao = "solicitada";
        
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hojeFormatado = hoje.format(formatter);
        data = hojeFormatado;
                
        Ficha addFicha = new Ficha (titulo,snAutor+","+pnAutor,universidade,tipo,
                               assunto1, assunto2, assunto3,orientador,folhas,ano, cidade, uf, situacao, data);
        
        JOptionPane.showMessageDialog(null,gerenciadorFch.adicionarFicha(addFicha));
        
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfUniversidade.setText("");
        cbxTipo.setSelectedItem("...");
        tfAssunto1.setText("");
        tfAssunto2.setText("");
        tfAssunto3.setText("");
        tfOrientador.setText("");
        tfFolhas.setText("");
        tfCidade.setText("");
        tfUf.setText("");      
        
          
    }//GEN-LAST:event_btSolicitarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfUniversidade.setText("");
        cbxTipo.setSelectedItem("...");
        tfAssunto1.setText("");
        tfAssunto2.setText("");
        tfAssunto3.setText("");
        tfOrientador.setText("");
        tfFolhas.setText("");
        tfCidade.setText("");
        tfUf.setText("");
        
        
    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSolicitar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAluguelLivro;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbAssuntos;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbAutor3;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbFolhas;
    private javax.swing.JLabel lbNfolhas;
    private javax.swing.JLabel lbOrientador;
    private javax.swing.JLabel lbRetirada1;
    private javax.swing.JLabel lbRetirada2;
    private javax.swing.JLabel lbRetirada3;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfAssunto1;
    private javax.swing.JTextField tfAssunto2;
    private javax.swing.JTextField tfAssunto3;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfFolhas;
    private javax.swing.JTextField tfOrientador;
    private javax.swing.JTextField tfPnAutor;
    private javax.swing.JTextField tfSnAutor;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfUf;
    private javax.swing.JTextField tfUniversidade;
    // End of variables declaration//GEN-END:variables
}
