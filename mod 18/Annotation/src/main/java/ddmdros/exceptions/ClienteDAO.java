package ddmdros.exceptions;

public class ClienteDAO {

    public static void consutarCliente(String codigo) throws ClienteNaoEncontradoException {

        boolean isCadastrado = false;
        if (!isCadastrado){
            throw new ClienteNaoEncontradoException("Cliente não encontrado");
        }
        ClienteDAO.consutarCliente(codigo);
    }
}
