package ie.atu.customerservice;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class CustomerService {
    private List<CustomerDetails> customer = new ArrayList<>();

    public void createCustomer(CustomerDetails cd){
        customer.add(cd);
    }

    public List<CustomerDetails> getCustomerByld() {
        return customer;
    }
}
