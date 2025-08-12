package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura5_diautil {
    public static void main(String[] args) {

        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        Scanner scanner = new Scanner(System.in);
        String diaInserido = scanner.next();
        System.out.println(diaInserido);

//        if (diaInserido == "sábado" || diaInserido == "domingo"){
//            System.out.println(diaInserido + " não é um dia útil");
//        } else {
//            System.out.println(diaInserido + " é um dia útil");
//        }

        if (diaInserido.equals("segunda") || diaInserido.equals("terca") || diaInserido.equals("quarta") || diaInserido.equals("quinta") || diaInserido.equals("sexta")){
            System.out.println(diaInserido + " é um dia útil");
        } else {
            System.out.println(diaInserido + " não é um dia útil");
        }
    }
}
