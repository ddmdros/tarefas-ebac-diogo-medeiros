package br.com.ddmdros.exemplos;

import java.util.List;
import java.util.stream.Stream;

public class DistinctDemo {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream().distinct();

        Stream<Pessoa> stream2 = lista.stream().limit(2);



    }
}
