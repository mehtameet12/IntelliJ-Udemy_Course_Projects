package Meet.LearningJava;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score  = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore =  calculateScore(true,800, levelCompleted, bonus );
        int secondScore = calculateScore(true,10000,8,200);
        System.out.println("The highscore is "+highScore);
        System.out.println("The secondScore is "+secondScore);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            return finalScore;

        }
        else
            return -1;
    }
}
