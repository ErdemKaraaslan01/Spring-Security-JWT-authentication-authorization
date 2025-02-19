package com.erdemkaraaslan.springsecurity.repository;

import com.erdemkaraaslan.springsecurity.entities.Role;
import com.erdemkaraaslan.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByEmail(String email);

    User findByRole(Role role);

}
