package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura9_acesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codigoInserido = scanner.nextInt();

        System.out.print("Digite o nível de permissão (1, 2 ou 3): ");
        int nivelInserido = scanner.nextInt();

        boolean codigoValido = (codigoInserido == 2023);
        boolean nivelValido = (nivelInserido == 1 || nivelInserido == 2 || nivelInserido == 3);

        if (codigoValido && nivelValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema");
        } else {
            System.out.println("Acesso negado.");

            if (!codigoValido && !nivelValido) {
                System.out.println("Motivo: Código e nível de permissão inválidos");
            } else if (!codigoValido) {
                System.out.println("Motivo: Código inválido");
            } else {
                System.out.println("Motivo: Nível de permissão inválido");
            }
        }

        scanner.close();
    }
}
