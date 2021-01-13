package com.company;

public class Main {

    public static void main(String[] args) {

        isPalindrome(1222);

    }

    public static boolean isPalindrome(int number) {

        int originalNo = number;
        int reverseNo = 0;

        while (number != 0) {

            reverseNo = (reverseNo * 10) + (number % 10);
            number /= 10;

        }

        if (originalNo == reverseNo) {
            System.out.println("true");
            return true;

        }

         else if (originalNo != reverseNo) {

            System.out.println("false");
            return false;


            }
return false;

        }

    }

