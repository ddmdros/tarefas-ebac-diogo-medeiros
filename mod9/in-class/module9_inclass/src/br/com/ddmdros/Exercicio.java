package br.com.ddmdros;

import java.util.Scanner;

public class Exercicio {

    //Crie um projeto e uma classe. Na classe, leia um valor numerico no console,
    // coloque numa variavel do tipo primitivo, faça a conversao para wrapper
    // dessa variavel e imprima novamente no console.

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int inteiroPrimitivo = leitura.nextInt();

        System.out.println("Inteiro primitivo: " + inteiroPrimitivo);

        Integer inteiroWrapper = inteiroPrimitivo;

        System.out.println("Inteiro Wrapper: " + inteiroWrapper);

    }
}