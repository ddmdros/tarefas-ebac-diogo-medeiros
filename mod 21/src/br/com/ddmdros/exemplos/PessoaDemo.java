package br.com.ddmdros.exemplos;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PessoaDemo {
    public static void main(String[] args) {
        List<Pessoa> listaPessoa = new Pessoa().popularPessoas();

        Stream<Integer> brasileiros = listaPessoa.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        IntStream brasileiros2 = listaPessoa.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);

    }
}
