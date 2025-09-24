package br.com.ddmdros.reflections2.dao;

import br.com.ddmdros.reflections2.SingletonMap;
import br.com.ddmdros.reflections2.dao.generic.GenericDAO;
import br.com.ddmdros.reflections2.domain.Produto;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rodrigo.pires
 */
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
        Map<Long, Produto> mapaInterno =
                (Map<Long, Produto>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
        }
    }


    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setCodigo(entity.getCodigo());
    }
}