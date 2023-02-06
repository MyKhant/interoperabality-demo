package com.example.webui.controller;

import com.example.webui.ds.Customer;
import com.example.webui.ds.Customers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/webui")
public class CustomerController {

    @Value("${backend.url}")
    public String url;

    @GetMapping({"/","/home"})
    public String home(){
        return "index";
    }

    private RestTemplate template = new RestTemplate();

    // http://localhost:8080/customer/all

    @GetMapping("/customer-list")
    public String listAllCustomer(Model model){
        ResponseEntity<Customers> response =
                template.getForEntity(url + "customer/all", Customers.class);
        if (response.getStatusCode().is2xxSuccessful()){
            model.addAttribute("customers",response.getBody().getCustomers());
        }
        else {
            throw new RuntimeException("Not Found!");
        }
        return "index";
    }
}
