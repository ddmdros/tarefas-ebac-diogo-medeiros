package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura2_aprovacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float segundaNota = scanner.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float terceiraNota = scanner.nextFloat();

        float media = (primeiraNota + segundaNota + terceiraNota)/3;

        if (media >= 7) {
            System.out.printf("O estudante teve média %.2f e foi aprovado", media);
        } else if (media >= 5.0 && media <= 6.9){
            System.out.printf("O estudante teve média %.2f e está de recuperação", media);
        } else {
            System.out.printf("O estudante teve média %.2f e foi reprovado", media);
        }
    }
}
