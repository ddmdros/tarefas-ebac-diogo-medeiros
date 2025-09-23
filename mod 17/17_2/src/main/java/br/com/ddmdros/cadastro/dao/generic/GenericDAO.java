package br.com.ddmdros.cadastro.dao.generic;

import br.com.ddmdros.cadastro.domain.Persistente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {

    protected Map<Class, Map<Long,T>> map;

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public abstract Class<T> getClassType();

    public GenericDAO(){
        if(this.map == null) {

            this.map = new HashMap<>();

        }
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long,T> mapaInterno = this.map.get(getClassType());
        if(mapaInterno.containsKey(entity.getCodigo())){
            return false;
        }
        mapaInterno.put(entity.getCodigo(),entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
        Map<Long,T> mapaInterno = this.map.get(getClassType());
        T objetoCadastrado = mapaInterno.get(valor);
        if(objetoCadastrado != null){
            this.map.remove(valor,objetoCadastrado);
        }
    }

    @Override
    public void alterar(T entity) {
        Map<Long,T> mapaInterno = this.map.get(getClassType());
        T objetoCadastrado = mapaInterno.get(entity.getCodigo());
        if (objetoCadastrado != null){
            atualizarDados(entity,objetoCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
        Map<Long,T> mapaInterno = this.map.get(getClassType());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long,T> mapaInterno = this.map.get(getClassType());
        return mapaInterno.values();
    }
}
