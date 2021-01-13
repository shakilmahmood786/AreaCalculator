package com.company;

public class VipCustomer {

    private String name, email;
    private int creditLImit;

    public VipCustomer(String name, String email, int creditLImit) {
        this.name = name;
        this.email = email;
        this.creditLImit = creditLImit;
    }


    public VipCustomer(String name, String email) {
        this(name, email, 1000);

    }

    public VipCustomer() {
this("Default name", "test@rnr.com", 1000);

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLImit() {
        return creditLImit;
    }
}