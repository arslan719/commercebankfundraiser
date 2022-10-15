package com.commerce.commercebankfundraiser.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CardInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    String firstNameOnCard;
    String lastNameOnCard;
    int CardNumber;
    String CardExpiryDate;
    String numOfCVV;
    String streetName;
    String cityName;
    String stateName;
    int zipCode;



    public CardInfo(String firstNameOnCard, String lastNameOnCard, int CardNumber, String CardExpiryDate, String numOfCVV,String streetName, String cityName, String state, int zipcode )
    {
        this.firstNameOnCard= firstNameOnCard;
        this.lastNameOnCard = lastNameOnCard;
        this.CardNumber = CardNumber;
        this.CardExpiryDate = CardExpiryDate;
        this.numOfCVV = numOfCVV;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateName = state;
        this.zipCode = zipcode;
    }

    public CardInfo() {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNameOnCard() {
        return firstNameOnCard;
    }

    public void setFirstNameOnCard(String firstNameOnCard) {
        this.firstNameOnCard = firstNameOnCard;
    }

    public String getLastNameOnCard() {
        return lastNameOnCard;
    }

    public void setLastNameOnCard(String lastNameOnCard) {
        this.lastNameOnCard = lastNameOnCard;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    public String getCardExpiryDate() {
        return CardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        CardExpiryDate = cardExpiryDate;
    }

    public String getNumOfCVV() {
        return numOfCVV;
    }
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setNumOfCVV(String numOfCVV) {
        this.numOfCVV = numOfCVV;
    }
    @Override
    public String toString() {
        return "cardInfo{ " + "id = " + id +
                ",firstNameOnCard '" + firstNameOnCard + '\'' +
                ",lastNameOnCard '" + lastNameOnCard + '\'' +
                ",CardNumber '" + CardNumber + '\'' +
                ",CardExpiryDate '" + CardExpiryDate + '\'' +
                ",numOfCvv '" + numOfCVV + '\'' +
                '}';
    }
}
