package anonimas;

public class AnonimasTeste {
    public static void main(String[] args) {
        IMyEventConsumer anonima = new IMyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };

        anonima.consumer("Teste anonima");


        IMyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer("Teste Lambda");


        receberInterface("oi",value -> System.out.println(value));

        receberInterface(Boolean.TRUE,value -> System.out.println(value));

    }

        private static void receberInterface(Object o,IMyEventConsumer anonimaLambda){
            anonimaLambda.consumer(o);
        }
}
