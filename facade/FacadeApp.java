package facade;

import facade.entity.Account;
import facade.entity.Address;
import facade.entity.Customer;
import facade.facade.BankFacade;
import facade.facade.CustomerFacade;
import facade.repository.AccountRepository;

public class FacadeApp {

    public static void main(String[] args) {
        Customer customer = new Customer("1", "Otong");

        Address address1 = new Address("1", "Jakarta", "Indonesia");
        Address address2 = new Address("2", "Bandung", "Indonesia");

        customer.getAddresses().add(address1);
        customer.getAddresses().add(address2);

        CustomerFacade customerFacade = new CustomerFacade();
        customerFacade.save(customer);

        // ===============

        BankFacade bankFacade = new BankFacade();
        bankFacade.transfer("0001", "0002", 1000000L);
        bankFacade.transfer("0003", "0004", 5000000L);
    }
}
