package ddmdros.exceptions;

public class ClienteNaoEncontrado2Exception extends Exception {

    private Exception ex;
    public ClienteNaoEncontrado2Exception(String message, Throwable ex) {
        super(message,ex);
    }
}
