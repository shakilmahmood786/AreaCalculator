package com.company;

public class Main {

    public static void main(String[] args) {

        sumDigits(2);

    }

    public static int sumDigits(int number) {

        if (number >= 10) {

            int totalSum = 0;
            int hundreds = 0;
            int remainder = 0;
            int tens = 0;
            int single = 0;

            hundreds = number / 100;
            remainder = number % 100;
            tens = remainder / 10;
            single = remainder % 10;
            totalSum = hundreds + tens + single;

            System.out.println(totalSum);
            return totalSum;

        }
        System.out.println("-1");
        return -1;

    }
}

