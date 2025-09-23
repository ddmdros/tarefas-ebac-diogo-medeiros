package br.com.ddmdros.cadastro.dao;

import br.com.ddmdros.cadastro.dao.generic.GenericDAO;
import br.com.ddmdros.cadastro.domain.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{

    public ProdutoDAO(){
        super();
        Map<Long, Produto> mapaInterno = this.map.get(this.getClassType());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getClassType(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getClassType() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {

        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setCodigo(entity.getCodigo());

    }
}
