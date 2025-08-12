package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número ");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado%2 == 0){
            System.out.println(numeroDigitado + " é par");
        }

        else {
            System.out.println(numeroDigitado + " é ímpar");
        }
    }

}
