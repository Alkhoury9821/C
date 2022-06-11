package com.example.C.Controller;

import com.example.C.ConsumerService.CompanyService;
import com.example.C.Model.Consumer;
import com.example.C.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Company")
public class CompanyController {


    @Autowired
    private CompanyService companyService;


    @GetMapping("/getCompany/{username}")
    public ResponseEntity<Consumer> getCompany(@PathVariable String username){
        return ResponseEntity.ok().body(companyService.getCompany(username));
    }


    @PostMapping("orderFromCompany")
    public ResponseEntity<Order> B2B (@RequestBody Order order){
        return ResponseEntity.ok().body(companyService.B2B(order));
    }




}
