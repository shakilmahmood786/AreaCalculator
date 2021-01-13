package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("shakil", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("shakil", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("shakil", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("shakil", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("shakil", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }


    public static void displayHighScorePosition (String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the table");

    }

public static int calculateHighScorePosition (int playerScore) {
    if (playerScore >= 1000) {
        return 1;
    }

        else if (playerScore >= 500) {
            return 2;
        }
            else if (playerScore >= 100) {
                return 3; }


    return 4;
    }
}

