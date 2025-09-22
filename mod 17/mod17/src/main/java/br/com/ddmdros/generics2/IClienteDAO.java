package br.com.ddmdros.generics2;

import java.util.Collections;

public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    public void excluir (Long cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar (Long cpf);
    public Collections<Cliente> buscarTodos();
}
