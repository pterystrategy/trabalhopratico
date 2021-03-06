/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prodrigues.trabalhopratico.view.gui.tela;

import br.com.prodrigues.trabalhopratico.controle.EmprestimoControle;
import br.com.prodrigues.trabalhopratico.model.Cliente;
import br.com.prodrigues.trabalhopratico.model.Emprestimo;
import br.com.prodrigues.trabalhopratico.model.Livro;
import br.com.prodrigues.trabalhopratico.model.validações.LimiteDigitosLetrasNumeros;
import br.com.prodrigues.trabalhopratico.model.validações.LimiteDigitosNumeros;
import br.com.prodrigues.trabalhopratico.modelcombo.ClientesCellRenderer;
import br.com.prodrigues.trabalhopratico.modelcombo.ClientesComboModel;
import br.com.prodrigues.trabalhopratico.modelcombo.LivrosCellRenderer;
import br.com.prodrigues.trabalhopratico.modelcombo.LivrosComboModel;
import br.com.prodrigues.trabalhopratico.modeltable.LivroTableModel;
import br.com.prodrigues.trabalhopratico.view.IViewCrud;
import br.com.prodrigues.trabalhopratico.view.gui.ViewGuiSimples;
import java.awt.Frame;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author prorodrigues
 */
public class EmprestimoTela extends ViewGuiSimples implements IViewCrud<Emprestimo> {

    public EmprestimoTela(Frame parent, boolean modal, LivroTableModel model) {
        super(parent, modal);
        this.model = model;
        initComponents();
        this.cmbClientes.setRenderer(new ClientesCellRenderer());
    }

    public EmprestimoTela(Frame parent, boolean modal, LivroTableModel model, EmprestimoControle controle) {
        super(parent, modal);
        this.model = model;
        this.controle = controle;
        initComponents();
        this.cmbClientes.setRenderer(new ClientesCellRenderer());
        edtMulta.setDocument(new LimiteDigitosNumeros(10));
        edtObervacoesDevolucao.setDocument(new LimiteDigitosLetrasNumeros(100));
        edtObervacoes.setDocument(new LimiteDigitosLetrasNumeros(100));
    }

    public static EmprestimoTela getInstance(Frame parent, boolean modal, LivroTableModel model) {
        if (tela == null) {
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
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(EmprestimoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            return new EmprestimoTela(parent, modal, model);
        } else {
            return tela;
        }
    }

    public static EmprestimoTela getInstance(Frame parent, boolean modal, LivroTableModel model, EmprestimoControle controle) {
        if (tela == null) {
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
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(EmprestimoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            return new EmprestimoTela(parent, modal, model, controle);
        } else {
            return tela;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        labTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labSituacao = new javax.swing.JLabel();
        btnRdPendencia = new javax.swing.JRadioButton();
        btnRdDevolucao = new javax.swing.JRadioButton();
        labMulta = new javax.swing.JLabel();
        edtMulta = new javax.swing.JFormattedTextField();
        panSinopse = new javax.swing.JScrollPane();
        edtObervacoes = new javax.swing.JTextArea();
        labObervacoes = new javax.swing.JLabel();
        panSinopse1 = new javax.swing.JScrollPane();
        edtObervacoesDevolucao = new javax.swing.JTextArea();
        labObervacoesDevolucao = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        labCliente = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGrid = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        panRodape = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        edtDateDevo = new javax.swing.JFormattedTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaEmprestimo");

        labTitulo.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Titulo");
        labTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Data de Devolução");

        labSituacao.setText("Situacao:");

        buttonGroup1.add(btnRdPendencia);
        btnRdPendencia.setText("Pendencia");

        buttonGroup1.add(btnRdDevolucao);
        btnRdDevolucao.setText("Devolução");

        labMulta.setText("Multa:");

        edtMulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        edtMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMultaActionPerformed(evt);
            }
        });

        edtObervacoes.setColumns(20);
        edtObervacoes.setRows(5);
        panSinopse.setViewportView(edtObervacoes);

        labObervacoes.setText("Obervações:");

        edtObervacoesDevolucao.setColumns(20);
        edtObervacoesDevolucao.setRows(5);
        panSinopse1.setViewportView(edtObervacoesDevolucao);

        labObervacoesDevolucao.setText("Obervações Devolução:");

        cmbClientes.setModel(this.modelClientes);

        labCliente.setText("Cliente:");

        tblGrid.setModel(this.model);
        jScrollPane2.setViewportView(tblGrid);

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/button-Delete-icon16.png"))); // NOI18N
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pencil-icon16px.png"))); // NOI18N
        btnEdit.setMaximumSize(new java.awt.Dimension(65, 22));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/button-Add-icon16px.png"))); // NOI18N
        btnAdd.setMaximumSize(new java.awt.Dimension(65, 22));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        panRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRodapeLayout = new javax.swing.GroupLayout(panRodape);
        panRodape.setLayout(panRodapeLayout);
        panRodapeLayout.setHorizontalGroup(
            panRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panRodapeLayout.setVerticalGroup(
            panRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRodapeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        edtDateDevo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        edtDateDevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDateDevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(labCliente))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(edtDateDevo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbClientes, 0, 157, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labObervacoesDevolucao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panSinopse1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labSituacao)
                                    .addComponent(labMulta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRdPendencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRdDevolucao))))
                            .addComponent(labObervacoes))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtDateDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRdDevolucao)
                    .addComponent(btnRdPendencia)
                    .addComponent(labSituacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labMulta))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panSinopse1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labObervacoesDevolucao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labObervacoes)
                    .addComponent(panSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.checandoBtnCancel();
    }//GEN-LAST:event_btnCancelActionPerformed
    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.checandoBtnOk();
    }//GEN-LAST:event_btnOkActionPerformed
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (this.checandoBtnAdd()) {
            this.controle.tabelaLivros();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void edtMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtMultaActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        this.removerObjeto();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.checandoBtnEdit();
    }//GEN-LAST:event_btnEditActionPerformed

    private void edtDateDevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDateDevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDateDevoActionPerformed
    private static EmprestimoTela tela;

    public static EmprestimoTela getTela() {
        return tela;
    }

    public static void setTela(EmprestimoTela tela) {
        EmprestimoTela.tela = tela;
    }
    private boolean confirmado;

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOk;
    private javax.swing.JRadioButton btnRdDevolucao;
    private javax.swing.JRadioButton btnRdPendencia;
    private javax.swing.JButton btnRemove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Cliente> cmbClientes;
    private javax.swing.JFormattedTextField edtDateDevo;
    private javax.swing.JFormattedTextField edtMulta;
    private javax.swing.JTextArea edtObervacoes;
    private javax.swing.JTextArea edtObervacoesDevolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labCliente;
    private javax.swing.JLabel labMulta;
    private javax.swing.JLabel labObervacoes;
    private javax.swing.JLabel labObervacoesDevolucao;
    private javax.swing.JLabel labSituacao;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panRodape;
    private javax.swing.JScrollPane panSinopse;
    private javax.swing.JScrollPane panSinopse1;
    private javax.swing.JTable tblGrid;
    // End of variables declaration//GEN-END:variables
    private final ClientesComboModel modelClientes = new ClientesComboModel();
    private final LivroTableModel model;
    public EmprestimoControle controle;
   
    public void setListaClientes(List<Cliente> listaClientes) {
        modelClientes.clear();
        modelClientes.addListCliente(listaClientes);
    }

    @Override
    public Emprestimo create(Emprestimo object) {
        this.preparaCreate();
        this.setVisible(true);
        if (confirmado) {
            return this.getScreenObject();
        } else {
            return null;
        }
    }

    @Override
    public void read(Emprestimo object) {
        this.preparaMostrar(object);
        this.setVisible(true);
    }

    @Override
    public Emprestimo update(Emprestimo object) {

        preparaUpdate(object);
        this.setVisible(true);
        if (confirmado) {
            object.setObervacoes(edtObervacoes.getText());
            object.setObervacoesDevolucao(edtObervacoesDevolucao.getText());
            object.setCliente((Cliente) cmbClientes.getSelectedItem());
            object.setLivros(model.getLista());
//            model.getLista().forEach((livro) -> {
//                livro.getEmprestimos().add(object);
//            });
        } else if (!confirmado) {
            showMessage("CANCELADO PELO USUÁRIO!");
            this.setVisible(false);
            return null;

        } else if (object == null) {
            showMessage("NÃO ENCONTRADO!");
            this.setVisible(false);
            return null;
        }
        return object;
    }

    @Override
    public boolean delete(Emprestimo object) {
        preparaDelete(object);
        this.setVisible(true);
        if (!confirmado) {
            showMessage("CANCELADO PELO USUÁRIO!");
            return false;
        } else if (object == null) {
            showMessage("NÃO ENCONTRADO!");
            return false;
        }
        return true;
    }

    @Override
    public Emprestimo getScreenObject() {
        Emprestimo object = new Emprestimo();
        
        object.setObervacoes(edtObervacoes.getText());
        object.setDataDevolucao(this.controle.gerarData());
        object.setDataEmprestimo(Date.from(Instant.now()));
        object.setObervacoesDevolucao(edtObervacoesDevolucao.getText());
        object.setCliente((Cliente) cmbClientes.getSelectedItem());
        object.setLivros(model.getLista());
        model.getLista().forEach((livro) -> {
            livro.getEmprestimos().add(object);
        });

        return object;
    }

    @Override
    public void limpaTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preparaUpdate(Emprestimo object) {
        labTitulo.setText("Cadastro de Editora");

        edtObervacoesDevolucao.setText(object.getObervacoesDevolucao());
        edtObervacoesDevolucao.setEditable(true);
        edtObervacoesDevolucao.setEnabled(true);

        edtObervacoes.setText(object.getObervacoes());
        edtObervacoes.setEditable(true);
        edtObervacoes.setEnabled(true);
        
        tblGrid.setEnabled(true);
        
        jLabel1.setVisible(true);
        jLabel1.setText("Data de Devolução: ");
        
        labMulta.setVisible(false);
        edtMulta.setVisible(false);
        model.limpar();
        object.getLivros().forEach((livro) -> {
            model.add(livro);
        });

        btnOk.setText("Alterar");
        btnCancel.setVisible(true);
    }

    private void preparaCreate() {
        tblGrid.setEnabled(true);
        
        labTitulo.setText("Emprestimo");
        edtMulta.setText("");
        edtMulta.setEditable(true);
        edtMulta.setEnabled(true);
        
        

        edtObervacoesDevolucao.setText("");
        edtObervacoesDevolucao.setEditable(true);
        edtObervacoesDevolucao.setEnabled(true);

        labMulta.setVisible(false);
        edtMulta.setVisible(false);
        DateFormat dateFormat = new SimpleDateFormat();
        String format = dateFormat.format(this.controle.gerarData());
        edtDateDevo.setText(format);
        
        edtObervacoes.setText("");
        edtObervacoes.setEditable(true);
        edtObervacoes.setEnabled(true);

        btnOk.setText("Salvar");
        btnOk.setVisible(true);

        btnCancel.setVisible(true);

    }

    private void preparaDelete(Emprestimo object) {

        labTitulo.setText("Emprestimo");
        
        tblGrid.setEnabled(false);
        edtMulta.setEditable(true);
        edtMulta.setEnabled(false);

        edtObervacoesDevolucao.setText(object.getObervacoesDevolucao());
        edtObervacoesDevolucao.setEditable(true);
        edtObervacoesDevolucao.setEnabled(false);

        edtObervacoes.setText(object.getObervacoes());
        edtObervacoes.setEditable(true);
        edtObervacoes.setEnabled(false);
        model.setListaA(object.getLivros());
        btnOk.setText("Deletar");
        btnOk.setVisible(true);

        btnCancel.setVisible(true);
    }

    private void preparaMostrar(Emprestimo object) {

        labTitulo.setText("Emprestimo");

        cmbClientes.setEditable(false);
        cmbClientes.setEnabled(true);

        edtObervacoes.setText(object.getObervacoes());
        edtObervacoes.setEditable(false);
        edtObervacoes.setEnabled(false);

        edtObervacoesDevolucao.setText(object.getObervacoesDevolucao());
        edtObervacoesDevolucao.setEditable(false);
        edtObervacoesDevolucao.setEnabled(false);

        tblGrid.setEnabled(false);

        edtMulta.setEditable(false);
        edtMulta.setEnabled(false);

        model.limpar();
        for (Livro livro : object.getLivros()) {
            model.add(livro);
        }

        edtObervacoes.setText(object.getObervacoes());
        edtObervacoes.setEditable(false);
        edtObervacoes.setEnabled(false);
        btnCancel.setVisible(true);

        btnOk.setText("Ok");
        btnOk.setVisible(true);

        btnCancel.setVisible(false);
    }

    private void checandoBtnCancel() {
        this.setConfirmado(false);
        this.dispose();
    }

    private void checandoBtnOk() {
        if (edtObervacoesDevolucao.getText().trim().isEmpty()
                || edtObervacoes.getText().trim().isEmpty()) {
            this.showMessage("Campo Vazio");
        } else {
            this.setConfirmado(true);
            this.dispose();
        }
    }

    private void removerObjeto() {
        try {
            if (!tblGrid.isEnabled()) {

            } else {
                int selectedRow = this.tblGrid.getSelectedRow();
                Livro objetoLinha = model.getObjetoLinha(selectedRow);
                model.remove(objetoLinha);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Objeto não selecionado");

        }
    }

    private boolean checandoBtnAdd() {
        return tblGrid.isEnabled();
    }

    private void checandoBtnEdit() {
        if (!tblGrid.isEnabled()) {

        } 
    }
}
