package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsersSortedByMultipleColumns() {
        Sort.Order orderById = Sort.Order.asc("id");
        Sort.Order orderByFirstName = Sort.Order.asc("firstName");
        Sort.Order orderByLastName = Sort.Order.asc("lastName");
        Sort.Order orderByEmail = Sort.Order.asc("email");
        Sort.Order orderByCity = Sort.Order.asc("city");
        Sort.Order orderByState = Sort.Order.asc("state");
        Sort.Order orderByCountry = Sort.Order.asc("country");

        return userRepository.findAll(Sort.by(orderById, orderByFirstName, orderByLastName, orderByEmail, orderByCity, orderByState, orderByCountry));
    }
}
