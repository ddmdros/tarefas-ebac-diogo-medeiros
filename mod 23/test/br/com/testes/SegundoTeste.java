package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {

    @Test
    public void teste2(){
        String nome = "Diogo";
        Assert.assertEquals("Diogo", nome);
    }
}

