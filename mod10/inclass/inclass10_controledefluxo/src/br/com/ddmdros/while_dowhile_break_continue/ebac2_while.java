package br.com.ddmdros.while_dowhile_break_continue;

import java.util.Scanner;

public class ebac2_while {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número?");
        String resposta = scanner.next();

        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Digite um número para gerar a tabuada: ");
            int num = scanner.nextInt();
            for (int i=0; i<=10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }
            System.out.println("Deseja gerar novamente a tabuada de algum número?");
            resposta = scanner.next();
        }
        System.out.println("Obrigado. ");
    }
}
