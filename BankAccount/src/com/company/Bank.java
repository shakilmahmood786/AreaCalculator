package com.company;

public class Bank {

    private double balance;
    private String customerName, email, phoneNumber, accountNumber;


    public Bank() {

        System.out.println("Empty constructor called");
    }

    public Bank(String accountNumber, Double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.balance = balance;
        this.customerName = customerName;
    }


    public Bank(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email,phoneNumber);
    }

    public void deposit(double depositAmount) {

        this.balance += depositAmount;
        System.out.println("Deposit amount made of " + depositAmount + ". New balance: " + this.balance);

    }

    public void withdrawl(double withdrawalAmount) {

        if (this.balance - withdrawalAmount < 0) {
            System.out.println("You do not have enough funds to make this withdrawal only " + this.balance + " available.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("you have withdrawn " + withdrawalAmount + " remaining balance is: " + this.balance);

        }

    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


