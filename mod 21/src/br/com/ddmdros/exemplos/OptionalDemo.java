package br.com.ddmdros.exemplos;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Optional<Pessoa> opcional = lista.stream().max(Comparator.comparing(Pessoa::getIdade));

        if (opcional.isPresent()){
            System.out.println(opcional.get());
        }
    }
}
