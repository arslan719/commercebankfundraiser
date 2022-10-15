package com.commerce.commercebankfundraiser.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PaytemInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
   String firstName;
   String lastName;
   String emailID;
   String address;
   String phoneNUmber;
   String cityName;
   String stateName;
   int zipCode;

      public PaytemInfo()
      {

      }

      public PaytemInfo(String firstName, String lastName, String emailID,String address, String phoneNUmber, String StateName, int ZipCode, String cityName)
      {
          this.firstName= firstName;
          this.lastName = lastName;
          this.emailID = emailID;
          this.address = address;
          this.phoneNUmber = phoneNUmber;
          this.stateName= StateName;
          this.zipCode = ZipCode;
          this.cityName= cityName;
      }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
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
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String toString()
    {
        return "cardInfo{ " + "id = " + id +
                ",firstName '" + firstName + '\'' +
                ",lastName '" + lastName + '\'' +
                ",emailId'" + emailID + '\'' +
                ",phoneNumber '" + phoneNUmber + '\'' +
                ",address '" + address + '\'' +
                ",CityName '" + cityName + '\'' +
                ",stateName'" + stateName + '\'' +
                ",zipcode '" + zipCode + '\'' +
                '}';

    }
}
