package Meet.LearningJava;

public class Main {

    public static void main(String[] args) {
        String playerName = "xyz";
        int score = 900;
        int returnedScore = CalculateHighScorePosition(score);
        displayHighScorePosition(playerName,returnedScore);

    }
    public static void displayHighScorePosition(String playerName, int positionHighscore )
    {
        System.out.println(playerName + " managed to get into position "+positionHighscore+" on the highscore table") ;
    }
    public  static  int CalculateHighScorePosition (int score){
        if (score >1000)
            return 1;
        if ((score >500)&& (score<1000))
            return 2;
        if ((score >100)&& (score<500))
            return 3;
        else
            return 4;
    }
}
