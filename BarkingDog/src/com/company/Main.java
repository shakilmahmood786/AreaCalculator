package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));

    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (hourOfDay < 8 && hourOfDay > 0) {

            return barking = true;


        } else if (hourOfDay > 22) {

            return barking = true;

        } else if (hourOfDay < 0 || hourOfDay > 23) {

            return barking = false;

        }
        else
        return false;

        }

    }
