package br.com.ddmdros.if_else_elseif;

import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the name of an animal: ");
        String text = scanner.next();
        String animal = animals(text);
        System.out.println(animal);
    }

    public static String animals(String animal){
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else  if (animal.equals("TIGER")){
            result = "wild animal";
        } else {
            result = "unkown animal";
        }
        return result;
    }
}
