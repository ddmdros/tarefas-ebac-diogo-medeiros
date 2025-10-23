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

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.buscar();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.excluir();
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.atualizar();
    }
}
