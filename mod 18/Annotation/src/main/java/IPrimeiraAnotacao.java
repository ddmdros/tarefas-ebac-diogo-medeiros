import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface IPrimeiraAnotacao {


    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default 10d;


}
