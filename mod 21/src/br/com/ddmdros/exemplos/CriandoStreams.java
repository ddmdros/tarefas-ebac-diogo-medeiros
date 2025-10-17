package br.com.ddmdros.exemplos;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Stream<String> stream = List.of("Diogo", "Medeiros", "Teste").stream();

        Set.of("Diogo", "Medeiros", "Teste").stream();
        Map<String,String> map = Map.of("Diogo", "Medeiros");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "String2");



    }
}
