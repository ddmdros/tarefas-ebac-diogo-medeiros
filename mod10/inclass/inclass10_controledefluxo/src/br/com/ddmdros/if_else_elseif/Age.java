package br.com.ddmdros.if_else_elseif;
import java.util.Scanner;

// if, else, else if
public class Age {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Type your age: ");
       int age = scanner.nextInt();
       String stringAge = getAge(age);
       System.out.println(stringAge);
    }

    public static String getAge(int age){
        if (age >= 0 && age <= 5){
            return "You're a toddler";
        } else if (age >= 6 && age <= 10) {
            return "You're a child";
        } else if (age >=11 && age <=18){
            return "You're a teenager";
        } else{
            return "You're an adult";
        }
    }
}
