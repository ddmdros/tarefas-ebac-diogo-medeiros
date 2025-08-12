import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ler 4 notas
        // dividir por 4
        // se >= 7 - aprovado
        // se >= 5 - recuperação
        // menor que 5 - reprovado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("Média: %.2f. ", media);

        if (media >= 7){
            System.out.println("Você foi aprovado!");
        } else if (media >= 5 && media <7){
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Você foi reprovado");
        }


    }


}
