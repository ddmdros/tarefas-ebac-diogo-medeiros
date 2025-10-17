package br.com.ddmdros.exemplos;

import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        //lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")).forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}
