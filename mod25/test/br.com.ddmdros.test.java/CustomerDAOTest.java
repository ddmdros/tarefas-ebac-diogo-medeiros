package br.com.ddmdros.test.java;

import br.com.ddmdros.main.java.dao.ICustomerDAO;
import br.com.ddmdros.main.java.domain.Customer;
import br.com.ddmdros.test.java.dao.CustomerDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerDAOTest {

    private ICustomerDAO customerDao;
    private Customer customer;

    public CustomerDAOTest(){
        customerDao = new CustomerDaoMock();
    }

    @Before
    public void init(){
        customer = new Customer();
        customer.setCpf(123456789l);
        customer.setName("Diogo");
        customer.setCity("Lages");
        customer.setAddress("Address");;
        customer.setState("SC");
        customer.setNumber(10);
        customer.setPhone(49999999999L);
        customerDao.save(customer);
    }

    @Test
    public void findClient(){
        Customer customerFound = customerDao.findByCPF(customer.getCpf());
        Assert.assertNotNull(customerFound);

    }

    @Test
    public void saveCustomer(){
        Boolean returnSaveCustomer = customerDao.save(customer);
        Assert.assertTrue(returnSaveCustomer);
    }

    @Test
    public void deleteCustomer(){
        customerDao.delete(customer.getCpf());
    }
}
