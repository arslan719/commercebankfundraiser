package com.commerce.commercebankfundraiser.service;

import com.commerce.commercebankfundraiser.repo.CardInfoRepo;
import org.springframework.context.annotation.Bean;


public class CardInfoServiceBuilder {
    private CardInfoRepo cardInfoRepo;


    public CardInfoServiceBuilder setCardInfoRepo(CardInfoRepo cardInfoRepo) {
        this.cardInfoRepo = cardInfoRepo;
        return this;
    }

    @Bean(name = "com.commerce.commercebankfundraiser.repo.CardInfoRepo")
    public CardInfoService createCardInfoService() {
        return new CardInfoService(cardInfoRepo);
    }
}