package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura6_emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        double valorDoEmprestimo = scanner.nextDouble();

        if (valorDoEmprestimo >= 1000.00 && valorDoEmprestimo <= 5000.00){
            System.out.println("O valor " + valorDoEmprestimo + " está dentro do intervalo permitido para empréstimo");
        } else {
            System.out.println("O valor " + valorDoEmprestimo + " não está dentro do intervalo permitido para empréstimo");
        }
    }
}
