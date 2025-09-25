package anonimas;

public class TesteLambdaThreads {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {

                System.out.println("Executando sem lambda");

            }
        };

        new Thread(r).start();


        Runnable rLambda = () -> System.out.println("Executando com lambda");
            new Thread(rLambda).start();


        new Thread(() -> System.out.println("Executando com lambda 2")).start();

    }
}
