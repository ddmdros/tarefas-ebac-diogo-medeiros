package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura3_senha {

    public static void main(String[] args) {

        String senhaEmpresa = "NovaSenhaEmpresa#2025!";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senhaInserida = scanner.next();

        if (senhaEmpresa.equals(senhaInserida)){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
