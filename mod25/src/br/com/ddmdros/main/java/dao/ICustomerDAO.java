package br.com.ddmdros.main.java.dao;

import br.com.ddmdros.main.java.domain.Customer;

public interface ICustomerDAO {


    Boolean save(Customer customer);

    Customer findByCPF(Long cpf);

    void delete(Long cpf);

    void modifyCustomer(Customer customer);
}
