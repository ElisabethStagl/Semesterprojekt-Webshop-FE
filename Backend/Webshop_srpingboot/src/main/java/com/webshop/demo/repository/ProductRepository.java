package com.webshop.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webshop.demo.model.Product;

/* Repository ist für die Verwaltung der Daten in einer Datenbank zuständig.
Es ist eine separate Schicht zwischen dem Service 
und der Datenbank und dient als Schnittstelle zur Datenbank. Außerdem kann das Repository getestet und wiederverwendet werden, 
ohne dass dafür das gesamte Model oder der Service überarbeitet werden müssen.
*/

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
public List<Product> findAllByCategory(String category);

}
