package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class alura8_bancoSangue {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idadeDoador = scanner.nextInt();
        System.out.println("Digite o peso do doador (em kg): ");
        double pesoDoador = scanner.nextDouble();

        if ((idadeDoador >= 18 && idadeDoador <= 65) && (pesoDoador>50.0)){
            System.out.println("O doador é compatível");
        } else if(!(idadeDoador >= 18 && idadeDoador <= 65) && (pesoDoador>50.0)){
            System.out.println("O doador não é compatível");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos");
        } else if(!(idadeDoador >= 18 && idadeDoador <= 65) && !(pesoDoador>50.0)){
            System.out.println("O doador não é compatível");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos");
            System.out.println("Motivo: Deve ter mais de 50kg");
        } else {
            System.out.println("O doador não é compatível");
            System.out.println("Motivo: Deve ter mais de 50kg");
        }

        scanner.close();

        /*

        import java.util.Scanner;

public class VerificaDoacaoSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível. Motivo:");
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("- Deve pesar mais de 50 kg.");
            }
        }
        scanner.close();
    }
}
         */

    }
}
