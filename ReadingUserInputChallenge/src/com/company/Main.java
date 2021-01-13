//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        Scanner scanner = new Scanner(System.in);
//        //System.out.println("Please enter a digit: ");
//        boolean hasNextInt = scanner.hasNextInt();
//        int digits = scanner.nextInt();
//        if (hasNextInt) {
//            //int digits = scanner.nextInt();
//            int sum = 0;
//
//            //for (int i = 0; i <= 11; i++) {
//              int count = 0;
//              while(count <= 10)
//                  count ++;
//                System.out.println("Please enter a digit: #" + sum);
//                sum += digits;
//                System.out.println(sum);
//                scanner.nextLine();
//
//            }
//
//else {
//
//            System.out.println("Invalid Number");
//        }
//
//        scanner.close();
//
//    }
//
//
//}


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while(true) {
        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//               if(counter == 10) {
//                   break;
//               }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();

    }
}