/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroclienteswing.dao;

import cadastroclienteswing.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author Diogo
 */

public interface IClienteDao {

    public Boolean cadastrar(Cliente cliente);

    public void excluir (Long cpf);

    public Cliente alterar (Cliente cliente);

    public Cliente consultar (Long cpf);

    public Collection<Cliente> buscarTodos();

}
