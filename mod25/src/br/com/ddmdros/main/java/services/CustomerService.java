package br.com.ddmdros.main.java.services;

import br.com.ddmdros.main.java.dao.CustomerDAO;
import br.com.ddmdros.main.java.dao.ICustomerDAO;
import br.com.ddmdros.main.java.domain.Customer;

public class CustomerService implements ICustomerService {

    private ICustomerDAO customerDAO;

    public CustomerService(ICustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

    @Override
    public Boolean save(Customer customer) {
        customerDAO.save(customer);
        return customerDAO.save(customer);

    }

    @Override
    public Customer findByCPF(Long cpf) {
        return customerDAO.findByCPF(cpf);
    }

    @Override
    public void delete(Long cpf) {
        //customerDAO.delete(cpf);

    }
}
