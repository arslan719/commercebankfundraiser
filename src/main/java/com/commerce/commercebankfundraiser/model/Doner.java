package com.commerce.commercebankfundraiser.model;

public class Doner {
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
        return "Doner{" +
                "name='" + name + '\'' +
                ", donation_title='" + donation_title + '\'' +
                ", donation_amount=" + donation_amount +
                '}';
    }
}
