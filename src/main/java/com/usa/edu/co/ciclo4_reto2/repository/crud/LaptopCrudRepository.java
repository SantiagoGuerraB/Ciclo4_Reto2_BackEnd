package com.usa.edu.co.ciclo4_reto2.repository.crud;
import com.usa.edu.co.ciclo4_reto2.model.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LaptopCrudRepository extends MongoRepository<Laptop, Integer> {

    Optional<Laptop> findTopByOrderByIdDesc();

}
