/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prodrigues.trabalhopratico.view.gui.tela;

import br.com.prodrigues.trabalhopratico.model.Cliente;
import br.com.prodrigues.trabalhopratico.view.IViewCrud;
import br.com.prodrigues.trabalhopratico.view.gui.ViewGuiSimples;
import javax.swing.JOptionPane;



/**
 *
 * @author alessio
 */
public class ClienteTela extends ViewGuiSimples implements IViewCrud<Cliente>{

    private static ClienteTela tela;
    private boolean confirmado = false;

    public boolean isConfirmado() {
        return confirmado;
    }
    
    
    
    
    /**
     * Creates new form ClienteTela
     * @param parent
     * @param modal
     */
    public ClienteTela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }  
    
    public void mostrarErro(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    
    public static ClienteTela getInstance(java.awt.Frame parent, boolean modal) {        
        if (tela == null){
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
                java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            return new ClienteTela(parent, modal);        
        }
        else{
            return tela;
        }
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panRodape = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        panPrincipal = new javax.swing.JPanel();
        labNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        labCPF = new javax.swing.JLabel();
        edtCPF = new javax.swing.JTextField();
        labEmail = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        panTitulo = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente Tela");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRodapeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addGap(20, 20, 20))
        );

        labNome.setText("Nome:");

        labCPF.setText("cpf");

        edtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPFActionPerformed(evt);
            }
        });

        labEmail.setText("email");

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addComponent(labEmail)
                        .addGap(18, 18, 18)
                        .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addComponent(labNome)
                        .addGap(18, 18, 18)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addComponent(labCPF)
                        .addGap(18, 18, 18)
                        .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCPF)
                    .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEmail)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        labTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        labTitulo.setText("Titulo");

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTituloLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(labTitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPFActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setConfirmado(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if(edtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Falta o Nome");
        }
        else{
            this.setConfirmado(true);
            this.dispose();            
        }
    }//GEN-LAST:event_btnOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panRodape;
    private javax.swing.JPanel panTitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public Cliente create(Cliente cliente) {
        labTitulo.setText("Cadastro de Cliente");

        edtCPF.setText("");
        edtCPF.setEditable(true);
        edtCPF.setEnabled(true);        
        edtNome.setText("");
        edtNome.setEditable(true);
        edtNome.setEnabled(true);
        edtEmail.setText("");
        edtEmail.setEditable(true);
        edtEmail.setEnabled(true);
        
        btnCancel.setVisible(true);
        this.setVisible(true);

        return this.getScreenObject();
    }

    @Override
    public void read(Cliente cli) {
        labTitulo.setText("Dados do Cliente");
        
        edtCPF.setText(cli.getCpf());
        edtCPF.setEditable(false);
        edtCPF.setEnabled(false);
        edtNome.setText(cli.getName());
        edtNome.setEditable(false);
        edtNome.setEnabled(false);
        edtEmail.setText(cli.getEmail());
        edtEmail.setEditable(false);
        edtEmail.setEnabled(false);
        
        btnCancel.setVisible(false);
        this.setVisible(true);
    }

    @Override
    public Cliente getScreenObject() {
        Cliente retorno = new Cliente();
        retorno.setName(edtNome.getText());
        retorno.setCpf(edtCPF.getText());
        retorno.setEmail(edtEmail.getText());
        return retorno;        
    }

    @Override
    public void limpaTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente update(Cliente object) {
      
            if(confirmado){
                object.setName(edtNome.getText());
                object.setCpf(edtCPF.getText());
                object.setEmail(edtEmail.getText());
                //object.setLogin(e.getText());
                //funcionario.setSenhea(txtSenha.getText());
            }
            else if(!confirmado){
            showMessage("CANCELADO PELO USUÁRIO!");
            }
            else if (object == null) {
                showMessage("NÃO ENCONTRADO!");
            }
            else{
                showMessage("ALTERADO COM SUCESSO!");
            }
            return object;
    }

    @Override
    public boolean delete(Cliente object) {
        if (confirmado){
            showMessage("Quer deletar?"+ object.getName());
            return true;
        }
        else{
            showMessage("NAO DELETADO,"+ object.getName());
            return false;
        }
        
    }

    @Override
    public void preparaUpdate(Cliente object) {
        labTitulo.setText("Dados do Cliente");
        
        edtCPF.setText(object.getCpf());
        edtCPF.setEditable(true);
        edtCPF.setEnabled(true);
        edtNome.setText(object.getName());
        edtNome.setEditable(true);
        edtNome.setEnabled(true);
        edtEmail.setText(object.getEmail());
        edtEmail.setEditable(true);
        edtEmail.setEnabled(true);
        
        this.setVisible(true);
        
    }

    private void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
    
}







