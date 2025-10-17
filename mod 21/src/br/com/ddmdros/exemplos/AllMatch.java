package br.com.ddmdros.exemplos;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Boolean result = lista.stream()
                .allMatch(p -> p.getNacionalidade().equals("México"));

        System.out.println(result);
    }
}
