package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(hasEqualSum(1, 1,1));
        System.out.println(hasEqualSum(1, 1,2));
        System.out.println(hasEqualSum(1, -1,0));

    }

    public static boolean hasEqualSum(int noOne, int noTwo, int noThree) {
        if(noThree == (noOne + noTwo)){
            return true;}

            else

                return false;

        }

    }


