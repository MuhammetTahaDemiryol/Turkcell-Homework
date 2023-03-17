package org.example.hmwk1.adapter;

import org.example.hmwk1.entity.Developer;
import org.example.hmwk1.entity.Game;
import org.example.hmwk1.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class MernisService implements CheckService {
    List<Customer> userList = new ArrayList<>();

    public MernisService() {
        fillList();
    }

    public void fillList() {




        Customer john = new Customer(1,"7676@gmail.com","4321","John","Williams","767676767676",1932);
        Customer harry = new Customer(2,"7676@gmail.com","4321","Harry","Potter","12121212",2000);
        Customer weasley = new Customer(3,"7676@gmail.com","4321","Weasley","Williams","13131313",2002);
        Customer snape = new Customer(4,"7676@gmail.com","4321","Snape","Williams","1111111",2006);

        userList.add(harry);
        userList.add(weasley);
        userList.add(snape);
        userList.add(john);


    }
    @Override
    public boolean checkUser(Customer customer) {
        for (Customer customer2 : userList) {
            if (customer2.getTc().equals(customer.getTc()) &&
                    customer2.getName().equals(customer.getName()) &&
                    customer2.getSurName().equals(customer.getSurName()) &&
                    customer2.getBirthYear() == customer.getBirthYear()) {
                return true;
            }
        }
        return false;
    }




}
