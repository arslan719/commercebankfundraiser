package com.commerce.commercebankfundraiser.model;

public class Donor extends SignUp {
    
    Donor donor = new Donor();
    
    String cause;
    String title;
    int donation_amount;

    public Donor() {
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDonation_amount(int donation_amount) {
        this.donation_amount = donation_amount;
    }

    public String getCause() {
        return cause;
    }

    public String getTitle() {
        return title;
    }

    public int getDonation_amount() {
        return donation_amount;
    }

    public Donor(String cause, String title, int donation_amount) {
        this.cause = cause;
        this.title = title;
        this.donation_amount = donation_amount;
    }


}

