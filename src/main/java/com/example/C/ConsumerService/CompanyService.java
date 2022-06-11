package com.example.C.ConsumerService;

import com.example.C.Model.Consumer;
import com.example.C.Model.Order;
import com.example.C.Repo.ConsumerRepo;
import com.example.C.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {


    @Autowired
    private ConsumerRepo companyRepo;

    @Autowired
    private OrderRepo orderRepo;


    //getConsumer
    public Consumer getCompany(String username){
        return companyRepo.findByUsername(username);
    }

    //b2b
    public Order B2B (Order order){
        if (companyRepo.findByUsername(order.getFrom()) == null){
            return null;
        }
        else
        return orderRepo.save(order);
    }


    //B2C
    public Order B2C (Order order){
        return orderRepo.save(order);
    }
}
