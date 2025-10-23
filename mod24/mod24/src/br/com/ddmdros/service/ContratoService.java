package br.com.ddmdros.service;

import br.com.ddmdros.dao.IContratoDao;

public class ContratoService implements IContratoService {
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;

    }

    public String salvar(){
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso";
    }
}
