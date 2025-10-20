package br.com.testes;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import org.junit.Test;
import org.junit.Assert;

public class PrimeiroTeste {

    @Test
    public void test(){
        String nome = "Diogo";
        Assert.assertEquals("Diogo", nome);
    }

    @Test
    public void testNotEquals(){
        String nome = "Diogo";
        Assert.assertNotEquals("Diogo1", nome);
    }
}
