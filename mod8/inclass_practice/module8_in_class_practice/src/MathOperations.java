public class MathOperations {
    public static void main(String[] args) {
        arithmeticOperations();
        assignmentOperations();
    }
    public static void arithmeticOperations() {
            int num1 = 20;
            int num2 = 10;
            int num3 = num1 + num2;
            int num4 = num1 - num2;
            int num5 = num1 / num2;
            int num6 = num1 * num2;

            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);
            System.out.println(num6);
        }

    public static void assignmentOperations(){
        int num1 = 0;
        int num2 = 10;
        int num3 = num1 + num2;
        num3 += num2; // num3 = num3 = num2
    }
}
