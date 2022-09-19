package com.commerce.commercebankfundraiser.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
 void deleteUserByID(Long id);

 Optional<User> findUserByID(Long id);
}
