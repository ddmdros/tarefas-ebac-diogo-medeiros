package br.com.ddmdros.exemplos;

import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoas();

        List<Pessoa> pessoasComM = pessoas.stream()
                .filter(p -> p.getNome().startsWith("M"))
                .collect(Collectors.toList());

        pessoasComM.forEach(pessoa -> System.out.println(pessoa));

        List<Pessoa> brasileiros = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());

        brasileiros.forEach(System.out::println);
    }
}
