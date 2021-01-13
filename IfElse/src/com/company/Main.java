package com.company;

public class Main {

    public static void main(String[] args) {

boolean gameOver = true;
int score = 800;
int levelCompleted = 5;
int bonus = 100;

int scoreTwo = 10000;
int levelTwoCompleted = 8;
int bonusTwo = 200;

if (gameOver) {
    int finalScore = score + (levelCompleted * bonus);
    System.out.println("Your final score was " + finalScore);
}

        if (gameOver) {
            int finalScoreTwo = scoreTwo + (levelTwoCompleted * bonusTwo);
            System.out.println("Your final score was " + finalScoreTwo);
        }

    }
}
