package com.webshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.webshop.demo.model.User;
import java.util.Optional;


/* Repository ist für die Verwaltung der Daten in einer Datenbank zuständig.
Es ist eine separate Schicht zwischen dem Service 
und der Datenbank und dient als Schnittstelle zur Datenbank. Außerdem kann das Repository getestet und wiederverwendet werden, 
ohne dass dafür das gesamte Model oder der Service überarbeitet werden müssen.
*/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
