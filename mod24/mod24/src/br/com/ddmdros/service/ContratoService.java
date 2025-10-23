package br.com.ddmdros.service;

import br.com.ddmdros.dao.IContratoDao;

public class ContratoService extends IContratoService {
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;

    }

    public String salvar(){
        contratoDao.salvar();
        return "Sucesso";
    }
}
