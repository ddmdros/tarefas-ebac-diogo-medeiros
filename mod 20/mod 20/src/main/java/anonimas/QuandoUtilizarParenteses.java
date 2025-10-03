package anonimas;

public class QuandoUtilizarParenteses {
    public static void main(String[] args) {
        IMyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);
        };

        IMyEventConsumer myEvent1 = (s) -> {
            System.out.println(s);
        };


        IMyEventConsumer myEvent2 = s ->
            System.out.println(s);

        IMyEventConsumer myEvent3 = s -> {
            System.out.println(s);
            System.out.println(s);
        };
        myEvent2.consumer("as");

        IMyEvrentReturn <Integer> myEvent4 = s -> {
            return 1;
        };
        myEvent4.consumer(1);
    }
}
