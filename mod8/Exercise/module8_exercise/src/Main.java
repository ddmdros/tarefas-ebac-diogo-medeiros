public class Main {
    public static void main(String[] args) {
        float grade1 = 10f;
        float grade2 = 8.8f;
        float grade3 = 4.3f;
        float grade4 = 6.6f;

        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Grade 4: " + grade4);

        System.out.print("Average: " + String.format("%.2f", (grade1 + grade2 + grade3 + grade4) / 4));
    }
}
