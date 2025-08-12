package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura4_desconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");

        float valorCompra = scanner.nextFloat();

        if (valorCompra >= 100){
            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Novo valor: R$ " + (valorCompra*0.9));
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valorCompra);
        }
    }
}
