package anonimas;

public class ReferenciaMetodos {

    public static void main(String[] args) {
    IMyEventConsumer myEvent2 = System.out::println;
    myEvent2.consumer("Olá");

    IMyEventConsumer myEvent3 = s -> System.out.println(s);
    myEvent3.consumer("Olá2");

    }


}
