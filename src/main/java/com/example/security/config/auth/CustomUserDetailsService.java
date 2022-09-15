package com.example.security.config.auth;

import com.example.security.entity.Customer;
import com.example.security.repository.CustomerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final CustomerRepository customerRepository;

    public CustomUserDetailsService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> optional = customerRepository.findByEmail(username);

        if (optional.isEmpty()) {
            throw new UsernameNotFoundException("Customer not found: " + username);
        }

        return new CustomUserDetails(optional.get());
    }
}
