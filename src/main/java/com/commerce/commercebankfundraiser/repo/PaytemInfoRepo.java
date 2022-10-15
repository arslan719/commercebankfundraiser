package com.commerce.commercebankfundraiser.repo;

import com.commerce.commercebankfundraiser.model.PaytemInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaytemInfoRepo extends JpaRepository<PaytemInfo,Long> {

    void deletePaytemInfoByID(Long id);

    @Override
    Optional<PaytemInfo> findById(Long id);
}
