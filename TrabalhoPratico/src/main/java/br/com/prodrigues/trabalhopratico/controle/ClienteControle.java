package br.com.prodrigues.trabalhopratico.controle;

import br.com.prodrigues.trabalhopratico.dao.ClienteDao;
import br.com.prodrigues.trabalhopratico.model.Cliente;
import br.com.prodrigues.trabalhopratico.modeltable.ClienteTableModel;
import br.com.prodrigues.trabalhopratico.view.gui.grid.ClienteGrid;
import br.com.prodrigues.trabalhopratico.view.gui.tela.ClienteTela;
import br.com.prodrigues.trabalhopratico.view.html.ClienteHtml;
import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteControle extends AbstractControleSimples<Cliente> {

    protected ClienteGrid grid;
    private final ClienteTela tela;
    private final ClienteTableModel model;

    public ClienteControle() {
        this.dao = new ClienteDao();
        this.model = new ClienteTableModel(this.dao.findAll());
        
        this.grid = ClienteGrid.getInstance(null, true, this, this.model);
        this.tela = ClienteTela.getInstance(null, true);
    }

    @Override
    public Cliente create() {
        
        Cliente cliente = tela.create(null);
        
        if (cliente == null) {
            return null;
        }
        else{
            dao.create(cliente);
            model.add(cliente);
        }
        
        return cliente;
    }

    @Override
    public List<Cliente> getAll() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.addAll(dao.findAll());
        return clientes;
    }

    @Override
    public void read(Cliente cliente) {
        this.tela.read(cliente);
    }

    @Override
    public boolean delete(Cliente objeto) {
        Cliente findById = dao.findById(objeto.getId());
        boolean delete = this.tela.delete(findById);
        if (delete) {
            if(this.dao.delete(findById)){
                this.model.remove(findById);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean filter(String column, String valor) {
        return true;
    }

    @Override
    public void showInicialScreen() {
        this.grid.setVisible(true);
    }

    @Override
    public Cliente update(Cliente objeto) {
         boolean concluido = false;
         Cliente update1 = null;
        do {
            Cliente update = tela.update(objeto);
            if (tela.isConfirmado()) {
                 update1 = this.dao.update(update);
                this.model.update(objeto, update1);
                concluido = true;
            }
        } while ((concluido != true) && (tela.isConfirmado()));
        return update1;
    }

    @Override
    public void print() {
        List<Cliente> lista = dao.findAll();

        String relatorioHtml = ClienteHtml.gerarRelatorio(lista, "Relatório de cliente");

        //Salvar em Disco
        FileWriter arquivo;
        try {
            arquivo = new FileWriter("/home/pedro/file.html");
            arquivo.append(relatorioHtml);
            arquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteControle.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("file:///home/pedro/file.html"));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(ClienteControle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //Abrir em Browser
        //Converter em HTML
    }
}