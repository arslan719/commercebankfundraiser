package com.commerce.commercebankfundraiser.repo;

import com.commerce.commercebankfundraiser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
 void deleteUserByID(Long id);

 Optional<User> findUserByID(Long id);
}
