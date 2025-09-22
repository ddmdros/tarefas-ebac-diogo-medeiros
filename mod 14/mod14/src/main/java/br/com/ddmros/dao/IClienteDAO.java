package br.com.ddmros.dao;

import br.com.ddmros.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir (Long cpf);

    public Cliente alterar (Cliente cliente);

    public Cliente consultar (Long cpf);

    public Collection<Cliente> buscarTodos();

}
