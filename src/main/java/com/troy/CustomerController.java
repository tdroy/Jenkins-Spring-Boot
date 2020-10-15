package com.troy;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
public class CustomerController
{
    @RequestMapping("/")
    public List<Customer> findAll()
    {
      List<Customer> customerList = new ArrayList<Customer>();
      customerList.add(new Customer(1, "tanmoy"));
      customerList.add(new Customer(2, "troy"));
      return customerList;
    }
}