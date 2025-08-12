package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura7_triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int primeiroLado = scanner.nextInt();
        System.out.println("Digite o segundo lado: ");
        int segundoLado = scanner.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int terceiroLado = scanner.nextInt();

        if ((primeiroLado + segundoLado) > terceiroLado && (segundoLado + terceiroLado) > primeiroLado && (terceiroLado + primeiroLado) > segundoLado){
            System.out.println("Os lados podem formar um triângulo");
        } else{
            System.out.println("Os lados não podem formar um triangulo");
        }
    }
}
