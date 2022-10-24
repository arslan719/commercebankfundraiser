package com.commerce.commercebankfundraiser.service;

import com.commerce.commercebankfundraiser.exception.UserNotFoundException;
import com.commerce.commercebankfundraiser.model.CardInfo;
import com.commerce.commercebankfundraiser.repo.CardInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
@Service

public class CardInfoService {

    private final CardInfoRepo cardInfoRepo;

    @Autowired
    public CardInfoService(CardInfoRepo cardInfoRepo) {
        this.cardInfoRepo = cardInfoRepo;
    }

    public List<CardInfo>findAllUser()
    {
        return cardInfoRepo.findAll();
    }

    public CardInfo updateCardInfo(CardInfo cardInfo)
    {
        return cardInfoRepo.save(cardInfo);
    }

    public CardInfo findCardInfo(Long ID)
    {
        return cardInfoRepo.findCardInfoById(ID).orElseThrow(()-> new UserNotFoundException("CardInfo By Id " + ID + "was not found"));
    }

    public void deleteCardInfo(Long id )
    {
        cardInfoRepo.deleteCardInfoById(id);
    }
}
