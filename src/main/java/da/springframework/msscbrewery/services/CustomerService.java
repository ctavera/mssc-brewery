package da.springframework.msscbrewery.services;

import da.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById (UUID customerId);
}
