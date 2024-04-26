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
      System.out.println(new java.util.Date() + " : Inside Customer Controller.");
      List<Customer> customerList = new ArrayList<Customer>();
      customerList.add(new Customer(1, "tanmoy"));
      customerList.add(new Customer(2, "troy"));
      customerList.add(new Customer(2, "tdroy"));
      customerList.add(new Customer(3, "dharani"));
      return customerList;
    }
}
