package br.com.ddmdros.tarefa_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome da pessoa, seguido de um traço e M para o gênero masculino e F para o gênero feminino, no seguinte formato:\n(nome da pessoa - M/F)\nPara adicionar outra pessoa, adicione uma vírgula:\nNome da Pessoa - M, Nome da Outra Pessoa - F");
        String entrada = scanner.nextLine();

        List<Participante> listaUsuario = Arrays.stream(entrada.split(","))
                .map(String::trim)
                        .map(item -> {
                            String[] partes = item.split("-");
                            if (partes.length == 2) {
                                String nome = partes[0].trim();
                                char genero = partes[1].toUpperCase().charAt(0);
                                return new Participante(nome, genero);
                            } else{
                                System.out.println("Formato inválido: " + item);
                                return null;
                            }
                        })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());


        List<Participante> listaFemale = listaUsuario.stream()
                .filter(participante -> participante.getGenero() == 'F')
                .collect(Collectors.toList())
                ;

        System.out.println("\nParticipantes do gênero feminino: ");

        listaFemale.forEach(System.out::println);

        scanner.close();

    }
}
