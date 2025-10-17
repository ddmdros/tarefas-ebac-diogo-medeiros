package br.com.ddmdros.exemplos;

import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        long count = lista.stream().filter(p -> p.getNome().startsWith("M")).count();
        System.out.println(count);
    }
}
