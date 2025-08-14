package br.com.ddmdros.tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome das pessoas seguido de um traço e o gênero, separados por vírgulas (ex.: Maria - F, Rodrigo - M):");

        String entrada = scanner.nextLine();
        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {
            String[] partes = pessoa.trim().split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                char genero = partes[1].trim().toUpperCase().charAt(0);

                if (genero == 'M') {
                    grupoMasculino.add(nome);
                } else if (genero == 'F') {
                    grupoFeminino.add(nome);
                }
            }
        }

        System.out.println("\n--- Grupo Masculino ---");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\n--- Grupo Feminino ---");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
