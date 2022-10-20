package com.commerce.commercebankfundraiser.repo;

import com.commerce.commercebankfundraiser.model.CardInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardInfoRepo extends JpaRepository<CardInfo,Long> {
    void deleteCardInfoByID(Long id);
    Optional<CardInfo>findCardInfoByID(Long id);
}
