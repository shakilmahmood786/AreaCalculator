package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {

        if (number < 0) {

            return false;

        } else if ((number % 2 == 0)) {

            return true;

        } else if ((number % 2 != 0)) {

            return false;
        }

        return false;
    }


        public static int sumOdd ( int start, int end){

            int sum = 0;


            if ((end >= start) && (start > 0) && (end > 0)) {


                for (int i = start; i < end; i++) {

                    if (isOdd(i) == true) {

                        sum = sum + i;
                        System.out.println(sum);
                    }
                }


            }

            return -1;


        }
    }