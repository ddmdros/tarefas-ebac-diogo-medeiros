package br.com.ddmdros;

import br.com.ddmdros.dao.ContratoDao;
import br.com.ddmdros.dao.IContratoDao;
import br.com.ddmdros.dao.mock.ContratoDaoMock;
import br.com.ddmdros.service.ContratoService;
import br.com.ddmdros.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){

        IContratoDao dao = new IContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
