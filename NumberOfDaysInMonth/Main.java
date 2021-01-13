package com.company;

public class Main {

    public static void main(String[] args) {

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, 2020);

    }

    public static boolean isLeapYear(int year) {

        if ((year >= 1) && (year <= 9999)) {
            return true;
        } else if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) ;
        {

            return false;

        }

        public static int getDaysInMonth (int month, int year){


                if (month < 1 || month > 12) {
                    System.out.println("-1");
                    return -1;

                }

                else if (year < 1 || year > 9999) {
                    System.out.println("-1");
                    return -1;
                }

                else

                switch (month){

                    case 1: case 3: case  5: case 7: case 8: case 10: case 12:
                        System.out.println("31");
                        return 31;
                    break;

                    case 4: case 6: case 9: case 11:
                        System.out.println("30");
                        return 30;
                    break;

                    default:
                        System.out.println("this is default");
                        break;


                }
            }

        }

    }

