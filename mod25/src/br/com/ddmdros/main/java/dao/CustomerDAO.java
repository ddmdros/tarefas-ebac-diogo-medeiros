package br.com.ddmdros.main.java.dao;

import br.com.ddmdros.main.java.domain.Customer;

public class CustomerDAO implements ICustomerDAO {
    @Override
    public Boolean save(Customer customer) {
        return true;

    }

    @Override
    public Customer findByCPF(Long cpf) {
        return null;
    }

    @Override
    public void delete(Long cpf) {

    }

    @Override
    public void modifyCustomer(Customer customer) {

    }
}
