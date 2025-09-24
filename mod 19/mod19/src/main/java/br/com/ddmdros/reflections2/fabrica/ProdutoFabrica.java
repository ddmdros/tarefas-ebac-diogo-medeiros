package br.com.ddmdros.reflections2.fabrica;

import br.com.ddmdros.reflections.Produto;
import br.com.ddmdros.reflections2.Exception.DadosInvalidosException;
import br.com.ddmdros.reflections2.domain.Persistente;

public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dados) throws DadosInvalidosException {
        try {
            Produto produto = new Produto();
            produto.setCodigo(Long.parseLong(dados[0].trim()));
            produto.setNome(dados[1]);
            return produto;
        } catch(IndexOutOfBoundsException e) {
            throw new DadosInvalidosException("Dados de produto estão inválidos");
        }
    }
}
