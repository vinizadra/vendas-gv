package view;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;

public class ViewProduto extends javax.swing.JFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    String salvarAlterar;
    
    /**
     * Creates new form ViewProdutos
     */
    public ViewProduto() {
        initComponents();
        carregarProdutos();
        setLocationRelativeTo(null);
        habilitarDesabilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPainelInicial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JLabel();
        jpFormCadastroProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfPreco = new javax.swing.JFormattedTextField();
        jtfEstoque = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfObs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfDescricao = new javax.swing.JTextArea();
        jpListagemProdutos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jbPesquisar = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        jpPainelInicial.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Produtos");

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/new.png"))); // NOI18N
        jbNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbNovoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbNovoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbNovoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbNovoMouseReleased(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/save.png"))); // NOI18N
        jbSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSalvarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbSalvarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbSalvarMouseReleased(evt);
            }
        });

        jpFormCadastroProduto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Formulário de cadastro");

        jtfId.setEditable(false);
        jtfId.setEnabled(false);
        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Preço");

        jtfPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        jtfPreco.setDisabledTextColor(new java.awt.Color(102, 153, 255));

        jtfEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstoqueActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estoque");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Observações");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descrição");

        jtfDescricao.setColumns(20);
        jtfDescricao.setRows(3);
        jScrollPane1.setViewportView(jtfDescricao);

        javax.swing.GroupLayout jpFormCadastroProdutoLayout = new javax.swing.GroupLayout(jpFormCadastroProduto);
        jpFormCadastroProduto.setLayout(jpFormCadastroProdutoLayout);
        jpFormCadastroProdutoLayout.setHorizontalGroup(
            jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jpFormCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome)
                            .addGroup(jpFormCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(106, 106, 106))))
                    .addGroup(jpFormCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFormCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfObs)))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jpFormCadastroProdutoLayout.setVerticalGroup(
            jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFormCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfObs, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpListagemProdutos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pesquisar");

        jtProdutos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.setGridColor(new java.awt.Color(255, 255, 255));
        jtProdutos.setShowGrid(true);
        jScrollPane2.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setMinWidth(50);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtProdutos.getColumnModel().getColumn(0).setMaxWidth(50);
            jtProdutos.getColumnModel().getColumn(2).setMinWidth(90);
            jtProdutos.getColumnModel().getColumn(2).setPreferredWidth(90);
            jtProdutos.getColumnModel().getColumn(2).setMaxWidth(90);
            jtProdutos.getColumnModel().getColumn(3).setMinWidth(70);
            jtProdutos.getColumnModel().getColumn(3).setPreferredWidth(70);
            jtProdutos.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        jbAlterar.setBackground(new java.awt.Color(0, 153, 255));
        jbAlterar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setBackground(new java.awt.Color(0, 153, 255));
        jbExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deletar.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Lista de produtos");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/search.png"))); // NOI18N
        jbPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbPesquisarMouseClicked(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/cancel.png"))); // NOI18N
        jbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbCancelarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jpListagemProdutosLayout = new javax.swing.GroupLayout(jpListagemProdutos);
        jpListagemProdutos.setLayout(jpListagemProdutosLayout);
        jpListagemProdutosLayout.setHorizontalGroup(
            jpListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListagemProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpListagemProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpListagemProdutosLayout.createSequentialGroup()
                        .addGroup(jpListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                            .addGroup(jpListagemProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListagemProdutosLayout.createSequentialGroup()
                                .addComponent(jtfPesquisar)
                                .addGap(10, 10, 10)
                                .addComponent(jbPesquisar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListagemProdutosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCancelar)))
                        .addContainerGap())))
        );
        jpListagemProdutosLayout.setVerticalGroup(
            jpListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListagemProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpListagemProdutosLayout.createSequentialGroup()
                        .addGroup(jpListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPesquisar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar))
                    .addGroup(jpListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbAlterar)
                        .addComponent(jbExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPainelInicialLayout = new javax.swing.GroupLayout(jpPainelInicial);
        jpPainelInicial.setLayout(jpPainelInicialLayout);
        jpPainelInicialLayout.setHorizontalGroup(
            jpPainelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNovo)
                .addContainerGap())
            .addComponent(jpFormCadastroProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpListagemProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPainelInicialLayout.setVerticalGroup(
            jpPainelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPainelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbSalvar)
                    .addComponent(jLabel1)
                    .addComponent(jbNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpFormCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpListagemProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPainelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPainelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseReleased
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/save.png")));
    }//GEN-LAST:event_jbSalvarMouseReleased

    private void jbSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMousePressed
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/saveclicked.png")));
    }//GEN-LAST:event_jbSalvarMousePressed

    private void jbSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseExited
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/save.png")));
    }//GEN-LAST:event_jbSalvarMouseExited

    private void jbSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseEntered
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/savehover.png")));
    }//GEN-LAST:event_jbSalvarMouseEntered

    private void jbSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseClicked
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/saveclicked.png")));
        if(salvarAlterar.equals("salvar")) {
            this.salvarProduto();
        } else if (salvarAlterar.equals("alterar")) {
            this.alterarProduto();
        }
    }//GEN-LAST:event_jbSalvarMouseClicked

    private void jbNovoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseReleased
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/new.png")));
    }//GEN-LAST:event_jbNovoMouseReleased

    private void jbNovoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMousePressed
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/newclicked.png")));
    }//GEN-LAST:event_jbNovoMousePressed

    private void jbNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseExited
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/new.png")));
    }//GEN-LAST:event_jbNovoMouseExited

    private void jbNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseEntered
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/newhover.png")));
    }//GEN-LAST:event_jbNovoMouseEntered

    private void jbNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseClicked
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/newclicked.png")));
        habilitarDesabilitarCampos(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoMouseClicked

    private void jbPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPesquisarMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) this.jtProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtProdutos.setRowSorter(classificador);
        String texto = jtfPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jbPesquisarMouseClicked

    private void jtfEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEstoqueActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Botão excluir
        int linha = jtProdutos.getSelectedRow();
        int codigoProduto = (int) jtProdutos.getValueAt(linha, 0);

        if(controllerProdutos.excluirProdutoController(codigoProduto)) {
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!", "Pronto!", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível excluir o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // Botão alterar
        // Seleciona a linha quer deseja visualizar no formulário
        salvarAlterar = "alterar";
        int linha = jtProdutos.getSelectedRow();

        try {
            int codigoProduto = (int) jtProdutos.getValueAt(linha, 0);
            habilitarDesabilitarCampos(true);
            //recupera dados do banco
            modelProdutos = controllerProdutos.retornaProdutoController(codigoProduto);
            //setar na interface
            this.jtfId.setText(String.valueOf(modelProdutos.getIdProduto()));
            this.jtfNome.setText(modelProdutos.getProdNome());
            this.jtfDescricao.setText(modelProdutos.getProdDescricao());
            this.jtfObs.setText(modelProdutos.getProdObs());
            this.jtfPreco.setText(String.valueOf(modelProdutos.getProdPreco()));
            this.jtfEstoque.setText(String.valueOf(modelProdutos.getProdEstoque()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void jbCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseClicked
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/cancelclicked.png")));
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarMouseClicked

    private void jbCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseEntered
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/cancelhover.png")));
    }//GEN-LAST:event_jbCancelarMouseEntered

    private void jbCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseExited
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/cancel.png")));
    }//GEN-LAST:event_jbCancelarMouseExited

    private void jbCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMousePressed
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/cancelclicked.png")));
    }//GEN-LAST:event_jbCancelarMousePressed

    private void jbCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseReleased
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botões/cancel.png")));
    }//GEN-LAST:event_jbCancelarMouseReleased

    /**
     * Limpa campos do formulário
     */
    private void limparCampos() {
        jtfId.setText("");
        jtfNome.setText("");
        jtfPreco.setText("");
        jtfEstoque.setText("");
        jtfObs.setText("");
        jtfDescricao.setText("");
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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }
    
    private void salvarProduto() {
        // Botão salvar
        modelProdutos.setProdNome(this.jtfNome.getText());
        modelProdutos.setProdPreco(Double.parseDouble(this.jtfPreco.getText().replaceAll(",", ".")));
        modelProdutos.setProdEstoque(Integer.parseInt(this.jtfEstoque.getText()));
        modelProdutos.setProdObs(this.jtfObs.getText());
        modelProdutos.setProdDescricao(this.jtfNome.getText());
        
        if(controllerProdutos.salvarProdutoController(modelProdutos) > 0) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "Pronto!", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível cadastrar o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void alterarProduto() {
        // Botão alterar
        modelProdutos.setProdNome(this.jtfNome.getText());
        modelProdutos.setProdPreco(Double.parseDouble(this.jtfPreco.getText().replaceAll(",", ".")));
        modelProdutos.setProdEstoque(Integer.parseInt(this.jtfEstoque.getText()));
        modelProdutos.setProdObs(this.jtfObs.getText());
        modelProdutos.setProdDescricao(this.jtfNome.getText());
        
        if(controllerProdutos.alterarProdutoController(modelProdutos)) {
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "Pronto!", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível alterar o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Habilita ou desabilta os campos do formulário
     * @param condicao 
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfPreco.setEnabled(condicao);
        jtfDescricao.setEnabled(condicao);
        jtfObs.setEnabled(condicao);
        jtfEstoque.setEnabled(condicao);
    }
    
    /**
     * Preencher a tabela com os produtos cadastrados no banco
     */
    private void carregarProdutos() {
        listaModelProdutos = controllerProdutos.retornarListaProdutosController();
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);
        
        // Inserir na tabela
        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[] {
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getProdNome(),
                "R$ " + listaModelProdutos.get(i).getProdPreco(),
                listaModelProdutos.get(i).getProdEstoque()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JLabel jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JLabel jbNovo;
    private javax.swing.JLabel jbPesquisar;
    private javax.swing.JLabel jbSalvar;
    private javax.swing.JPanel jpFormCadastroProduto;
    private javax.swing.JPanel jpListagemProdutos;
    private javax.swing.JPanel jpPainelInicial;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextArea jtfDescricao;
    private javax.swing.JFormattedTextField jtfEstoque;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfObs;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JFormattedTextField jtfPreco;
    // End of variables declaration//GEN-END:variables
}