package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018.125";
        String anotherNumber = "12";
        System.out.println("number As String = " + numberAsString);
        System.out.println("number As String = " + anotherNumber);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        int numberInt = Integer.parseInt(anotherNumber);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println("numberAsString = " + anotherNumber);


    }

}

