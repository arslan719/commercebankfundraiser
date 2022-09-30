package com.commerce.commercebankfundraiser.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<User,Long> {
 void deleteUserByID(Long id);

Optional<User> findUserByID(Long id);
}
