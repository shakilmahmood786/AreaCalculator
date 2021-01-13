package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Shakil", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(-2, 1));
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }


    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }


    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet <= 0) || ((inches <= 0) || (inches >= 12))) {

            System.out.println("error");
            return -1;
        }


            double oneInch = 2.54;
            double oneFoot = 12;
            double feetToInches = ((feet * oneFoot) * oneInch);
            double inchesToCm = (inches * oneInch);
        System.out.println(feet + " feet," + inches + " inches" + inchesToCm + " cm");
                return (feetToInches + inchesToCm);
            }




        public static double calcFeetAndInchesToCentimeters (double inches){

            if (inches <= 0) {

                System.out.println("error in inches");


                    return -1;
                }

                double oneFoot = 12;
                double inchesToFeet = (inches / oneFoot);
                double inchesToFeetRemainder = (inches % oneFoot);
                System.out.println((inchesToFeet + " & " + inchesToFeetRemainder));
                return calcFeetAndInchesToCentimeters(inchesToFeet, inchesToFeetRemainder);
                }

            }


