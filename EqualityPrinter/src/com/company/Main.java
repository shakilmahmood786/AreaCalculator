package com.company;

public class Main {

    public static void main(String[] args) {

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

    }

    public static void printEqual(int first, int second, int third) {

        if ((first < 0) || (second < 0) || (third < 0)) {
            System.out.println("Invalid Value");
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);

        } else if ((first == second) && (first == third) && (second == third)) {

            System.out.println("All numbers are equal");
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);


        } else if ((first != second) && ( first != third) && (second != third)) {

            System.out.println("All numbers are different");
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);


        }
        else

            System.out.println("Neither all are equal or different");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


    }

}
