package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTeste {

    @Test
    public void testeClasseCliente(){
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Diogo");

        Assert.assertEquals("Diogo", cli.getNome());
    }
}
