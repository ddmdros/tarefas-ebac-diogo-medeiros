package br.com.ddmdros.test.java;

import br.com.ddmdros.main.java.dao.ICustomerDAO;
import br.com.ddmdros.main.java.domain.Customer;
import br.com.ddmdros.main.java.services.CustomerService;
import br.com.ddmdros.main.java.services.ICustomerService;
import br.com.ddmdros.test.java.dao.CustomerDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerServiceTest {

    private ICustomerService customerService;

    public CustomerServiceTest(){
        ICustomerDAO dao = new CustomerDaoMock();
        customerService = new CustomerService(dao);
    }


    private Customer customer;

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
    }


    @Test
    public void findCustomer(){

        Customer customerFound = customerService.findByCPF(customer.getCpf());

        Assert.assertNotNull(customerFound);
    }

    @Test
    public void saveCustomer(){
        Boolean returnSaveCustomer = customerService.save(customer);
        Assert.assertTrue(returnSaveCustomer);
    }

    @Test
    public void deleteCustomer(){
        customerService.delete(customer.getCpf());
    }


    @Test
    public void modifyCustomer(){
        customer.setName("Diogo Medeiros");
        customerService.modifyCustomer(customer);
        Assert.assertEquals("Diogo Medeiros", customer.getName());
    }
}
