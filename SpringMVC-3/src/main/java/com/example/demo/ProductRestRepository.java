package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "Products", collectionResourceRel = "Products")
public interface ProductRestRepository extends JpaRepository<Product,Integer>{

}
