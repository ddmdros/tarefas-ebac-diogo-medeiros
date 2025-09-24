package br.com.ddmdros.reflections2.Exception;

/**
 * @author rodrigo.pires
 */
public class TipoChaveNaoEncontradaException extends Exception {

  public TipoChaveNaoEncontradaException(String msg) {
    this(msg, null);
  }

  public TipoChaveNaoEncontradaException(String msg, Throwable e) {
    super(msg, e);
  }
}