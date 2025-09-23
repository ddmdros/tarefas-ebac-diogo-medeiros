package br.com.ddmdros.cadastro.dao;


import br.com.ddmdros.cadastro.dao.Generic.IGenericDAO;
import br.com.ddmdros.cadastro.domain.Cliente;

import java.util.Collection;

/**
 * @author rodrigo.pires
 *
 * Interface que representa os dados de Cliente
 */
public interface IClienteDAO  {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}