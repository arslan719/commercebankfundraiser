package com.commerce.commercebankfundraiser.UserResouce;

import com.commerce.commercebankfundraiser.model.CardInfo;
import com.commerce.commercebankfundraiser.service.CardInfoService;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CardInfo")
public class CardInfoResouce {
    private final CardInfoService cardInfoService;

    public CardInfoResouce(CardInfoService cardInfoService) {
        this.cardInfoService = cardInfoService;
    }
    @GetMapping
    @Bean
    public ResponseEntity<List<CardInfo>> getPaytemInfo()
    {
        List<CardInfo> cardInfos  = cardInfoService.findAllUser();
        return new ResponseEntity<>(cardInfos, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<CardInfo>getCardInfoId(@PathVariable("id")Long id)
    {
        CardInfo cardInfo = cardInfoService.findCardInfo(id);
        return new ResponseEntity<>(cardInfo, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<CardInfo> UpdateCardInfo(@RequestBody CardInfo cardInfo)
    {
        CardInfo updateCardInfo = cardInfoService.updateCardInfo(cardInfo);
        return new ResponseEntity<>(updateCardInfo,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteUser(@PathVariable("id") Long id)
    {
        cardInfoService.deleteCardInfo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
