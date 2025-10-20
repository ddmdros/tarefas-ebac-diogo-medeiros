package br.com.ddmdros.testes;

import br.com.ddmdros.tarefa_stream.Participante;
import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

public class TesteTarefaMod21 {

    @Test
    public void testListaSoComMulheres() {

        List<Participante> listaParticipantes = Arrays.asList(
                new Participante("Ana", 'F'),
                new Participante("Maria", 'F'),
                new Participante("Carla", 'F')
        );

        boolean todasMulheres = listaParticipantes.stream()
                .allMatch(p -> Character.valueOf('F').equals(p.getGenero()));

        Assert.assertTrue("A lista deve conter apenas mulheres", todasMulheres);


    }

    @Test
    public void testListaComHomem() {
        // Lista com um participante masculino
        List<Participante> participantes = Arrays.asList(
                new Participante("Ana", 'F'),
                new Participante("Carlos", 'M')
        );

        boolean todasMulheres = participantes.stream()
                .allMatch(p -> Character.valueOf('F').equals(p.getGenero()));

        Assert.assertFalse("A lista não deve conter apenas mulheres", todasMulheres);
    }


}
