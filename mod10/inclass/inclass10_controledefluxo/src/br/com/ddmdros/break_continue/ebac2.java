package br.com.ddmdros.break_continue;

public class ebac2 {
    public static void main(String[] args) {
        for (int contador=1; contador<=100; contador++){
            if (contador%5!=0)
                continue; // se nao for multiplo de 5, ignora a proxima linha
            System.out.println("Contador: " + contador);
        }
    }
}
