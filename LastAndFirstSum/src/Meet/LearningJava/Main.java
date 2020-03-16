package Meet.LearningJava;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(SumFirstAndLastDigit(5));
    }
    public static int SumFirstAndLastDigit(int number)
    {
        int temp = number %10;
        int temp2 = 0;
        int sum = 0;
        if (number>10) {
            while (number > 1) {
                number = number / 10;
            }
            sum = temp + number;
        }
        else if ((number>0)&&(number<10))
            sum = number+ number;
        else if (number<=0)
            return -1;
        return sum;
    }
}
