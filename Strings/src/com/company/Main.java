package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = ("This is a string");
        System.out.println("My string is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);

        myString = myString + " \u00A9 2018";
        System.out.println("My string is equal to " + myString);

    }
}
