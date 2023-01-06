package dev.shaneholland.demo.jpasecurity.repository;

import dev.shaneholland.demo.jpasecurity.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepository extends ListCrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
