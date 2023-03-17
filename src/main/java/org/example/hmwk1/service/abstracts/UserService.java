package org.example.hmwk1.service.abstracts;

import org.example.hmwk1.entity.Customer;

import java.util.List;

public interface UserService {
    void addUser(Customer user);
    List<Customer> getUsers();
    void deleteUser(Customer user);

    void updateUser(int id,Customer user);

}
