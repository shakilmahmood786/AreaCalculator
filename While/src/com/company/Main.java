package com.company;

public class Main {

    public static void main(String[] args) {


        int start = 2;
        int end = 20;
        int noFound = 0;

        while (noFound!= 5) {
            start++;

            if (!isEvenNumber(start)) {
                continue;

            }
            noFound++;

            System.out.println("Even number " + start);
            System.out.println(noFound);
        }

    }

    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else

            return false;
        }

    }







//        isEvenNumber(100);
//
//    }
//
//    public static boolean isEvenNumber(int number) {
//
//        int count = 0;
//        while (count == 0)
//
//            count++;
//        if (number % 2 == 0) {
//            System.out.println("this is an even number " + number);
//            return true;
//        } else if (number % 2 != 0) {
//
//            System.out.println("this is an odd number " + number);
//
//            return false;
//
//        }
//        return false;
//
//    }