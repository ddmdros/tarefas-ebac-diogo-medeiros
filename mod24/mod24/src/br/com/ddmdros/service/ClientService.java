package br.com.ddmdros.service;

import br.com.ddmdros.dao.ClienteDao;
import br.com.ddmdros.dao.ClienteDaoMock;
import br.com.ddmdros.dao.IClienteDao;

public class ClientService {

    private IClienteDao clienteDao;

    public ClientService(IClienteDao clienteDao){
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;

    }
    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
