import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;


public class TestesLambdas {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };

        int result = intBinaryOperator.applyAsInt(1,1);
        System.out.println(result);


        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {
            return a + b;
        };

        int resultBiFunction = biFunction.apply(10,10);
        System.out.println(resultBiFunction);

        BiFunction<Double, Double, String> biFuncDouble = (Double a, Double b) -> {
            Double re = a/b;
            return String.valueOf(re) + "er";
        };

        String resultDS  = biFuncDouble.apply(10d,10d);
        System.out.println(resultDS);

        Long returnLong = calcular(1l, 2l, (Long v1, Long v2) -> {
            return v1 + v2;
        });

        System.out.println(returnLong);

        Runnable hello_world = () -> System.out.println("Hello World");
        hello_world.run();

        Consumer<Integer> stringConsumer = (Integer s) -> {
            System.out.println(s);
        };

        stringConsumer.accept(2);


        Supplier<Integer> integerCallable = () -> 42;
        System.out.println(integerCallable.get());

        Supplier<Double> doubleCallable = () -> {
            return 3.1415;
        };
        System.out.println(doubleCallable.get());

    }
        private static Long calcular(Long t, Long u, BiFunction<Long, Long, Long> function){
            return function.apply(t,u);
        }
}
