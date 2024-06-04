package facade.facade;

import facade.entity.Address;
import facade.entity.Customer;
import facade.repository.AddressRepository;
import facade.repository.CustomerRepository;

public class CustomerFacade {

    private CustomerRepository customerRepository = new CustomerRepository();

    private AddressRepository addressRepository = new AddressRepository();

    public void save(Customer customer) {
        customerRepository.save(customer);

        for (Address address : customer.getAddresses()) {
            addressRepository.save(address);
        }
    }

}
