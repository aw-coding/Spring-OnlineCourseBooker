package com.codeclan.example.OnlineCourseBooker.controllers;


import com.codeclan.example.OnlineCourseBooker.models.Customer;
import com.codeclan.example.OnlineCourseBooker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

//    GET /resources (done)
//    GET /resources/{id} (done)
//    GET /resources?property=value
//    POST /resources
//    PUT /resources/{id}
//    DELETE /resources/{id}


//    @GetMapping(value="/customers")
//    public ResponseEntity<List<Customer>> getAllCustomers(){
//        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping(value = "/customers")
    public ResponseEntity getAllCustomersAndFilters(
            @RequestParam(required = false, name = "town") String town,
            @RequestParam(required = false, name = "age") Integer age,
            @RequestParam(required = false, name = "name") String name

    ) {
        //get customers by town
        if (town != null) {
            return new ResponseEntity(customerRepository.findCustomerByTown(town), HttpStatus.OK);
        }

        //get customers by name
        if (name != null) {
            return new ResponseEntity(customerRepository.findCustomerByName(name), HttpStatus.OK);
        }
        //get customers by age
//        if (age != null){
//            return new ResponseEntity(customerRepository.findCustomerByAge(age), HttpStatus.OK);
//        }
        return new ResponseEntity(customerRepository.findAll(), HttpStatus.OK);


    }

}









//    @GetMapping(value="/customers/{id}")
//    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
//        return new ResponseEntity(customerRepository.findById(id), HttpStatus.OK);
//    }

//    @GetMapping(value="/customers/")
//    public ResponseEntity<List<Customer>> getCustomersByTown(@PathVariable String town) {
//        return new ResponseEntity<>(customerRepository.findCustomerByTown(town), HttpStatus.OK);
//    }



