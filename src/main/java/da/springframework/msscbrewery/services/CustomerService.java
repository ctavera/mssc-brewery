package da.springframework.msscbrewery.services;

import da.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById (UUID customerId);
}
