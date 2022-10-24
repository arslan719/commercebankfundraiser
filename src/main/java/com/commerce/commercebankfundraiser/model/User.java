package com.commerce.commercebankfundraiser.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String title;



    public User() {}

    public User(String name,String email,String title)
    {
        this.name = name;
        this.email = email;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "User{" + "id = " + id +
                ", name '" + name + '\'' +
                ", email '" + email + '\'' +
                ", title '" + title + '\'' +
                '}';

    }

    public static class Doner {

        String name;
        String donation_title;
        int donation_amount;

        public Doner() {
        }

        public Doner(String name, String donation_title, int donation_amount) {
            this.name = name;
            this.donation_title = donation_title;
            this.donation_amount = donation_amount;
        }

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getDonation_title() {
            return donation_title;
        }

        public void setDonation_title(String donation_title) {
            this.donation_title = donation_title;
        }

        public int getDonation_amount() {
            return donation_amount;
        }

        public void setDonation_amount(int donation_amount) {
            this.donation_amount = donation_amount;
        }

        @Override
        public String toString() {
            return "Donor{" +
                    "name='" + name + '\'' +
                    ", donation_title='" + donation_title + '\'' +
                    ", donation_amount=" + donation_amount +
                    '}';
        }
    }
}
