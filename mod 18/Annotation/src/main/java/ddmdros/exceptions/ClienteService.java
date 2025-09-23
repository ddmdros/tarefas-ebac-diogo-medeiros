package ddmdros.exceptions;

public class ClienteService {


    public static void consutarCliente(String codigo) throws ClienteNaoEncontrado2Exception {
        try {
            ClienteDAO.consutarCliente(codigo);
        } catch (ClienteNaoEncontradoException e) {
            throw new ClienteNaoEncontrado2Exception(e.getMessage(), e);
        }

    }
}
