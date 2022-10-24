package com.commerce.commercebankfundraiser.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Repository
@Transactional(readOnly = true)
public interface SignUpRepository extends JpaRepository<SignUp, Long> {
    Optional<SignUp> findByEmail(String email);
}
