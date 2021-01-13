package com.company;

public class Main {

    public static void main(String[] args) {


        Bank shakAccount = new Bank("12345678", 0.00, "Shakil", "shak@rnr.com", "0121 555 1234");

        System.out.println(shakAccount.getAccountNumber());
        System.out.println(shakAccount.getBalance());


        shakAccount.withdrawl(100.0);

        shakAccount.deposit(50.0);

        shakAccount.withdrawl(100.0);

        shakAccount.deposit(51.0);

        shakAccount.withdrawl(100.0);

        Bank farahAccount = new Bank("Farah", "farah@gmail.com", "123451");

        System.out.println(shakAccount.getAccountNumber() + " name " + shakAccount.getCustomerName());


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Shakil", "test@email.co.uk");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("nazia", "naz@rnr.com", 100);
        System.out.println(person3.getName());
    }

}