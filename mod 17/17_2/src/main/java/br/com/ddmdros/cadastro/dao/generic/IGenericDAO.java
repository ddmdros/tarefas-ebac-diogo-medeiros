package br.com.ddmdros.cadastro.dao.generic;

import br.com.ddmdros.cadastro.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastrar(T entity);
    public void excluir(Long codigo);
    public void alterar (T entity);
    public T consultar (Long cpf);
    public Collection<T> buscarTodos();
}
