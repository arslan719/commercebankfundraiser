package com.commerce.commercebankfundraiser.repo;

import com.commerce.commercebankfundraiser.model.CardInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardInfoRepo extends JpaRepository<CardInfo,Long> {
    void deleteCardInfoById(Long id);
    Optional<CardInfo>findCardInfoById(Long id);
}
