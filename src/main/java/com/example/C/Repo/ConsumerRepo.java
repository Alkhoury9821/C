package com.example.C.Repo;

import com.example.C.Model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepo extends JpaRepository<Consumer,Integer> {
        Consumer findByUsername(String username);
}
