package com.example.demo.repos;

import com.example.demo.model.ModelProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ModelProduct, Long> {

}
