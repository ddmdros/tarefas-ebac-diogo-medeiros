package br.com.ddmdros.main.java.services;

import br.com.ddmdros.main.java.domain.Customer;

public interface ICustomerService {


    Boolean save(Customer customer);

    Customer findByCPF(Long cpf);

    void delete(Long cpf);

    void modifyCustomer(Customer customer);
}
