package br.com.ddmdros.test.java.dao;

import br.com.ddmdros.main.java.dao.ICustomerDAO;
import br.com.ddmdros.main.java.domain.Customer;

public class CustomerDaoMock implements ICustomerDAO {
    @Override
    public Boolean save(Customer customer) {
    return true;
    }

    @Override
    public Customer findByCPF(Long cpf) {
        Customer customer = new Customer();
        customer.setCpf(cpf);
        return customer;
    }

    @Override
    public void delete(Long cpf) {

    }
}
