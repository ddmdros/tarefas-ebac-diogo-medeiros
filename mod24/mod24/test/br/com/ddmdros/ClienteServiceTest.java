package br.com.ddmdros;

import br.com.ddmdros.dao.ClienteDao;
import br.com.ddmdros.dao.ClienteDaoMock;
import br.com.ddmdros.dao.IClienteDao;
import br.com.ddmdros.service.ClientService;

import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso",retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNosalvarTest(){
        IClienteDao mockDao = new ClienteDao();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso",retorno);

    }
}
