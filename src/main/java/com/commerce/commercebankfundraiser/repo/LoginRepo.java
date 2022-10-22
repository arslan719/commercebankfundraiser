package com.commerce.commercebankfundraiser.repo;

import com.commerce.commercebankfundraiser.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, String> {
}
