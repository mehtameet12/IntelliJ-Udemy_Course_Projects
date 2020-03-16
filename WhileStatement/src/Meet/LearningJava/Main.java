package Meet.LearningJava;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(sumDigits(1351));
    }
    public static int sumDigits(int number)
    {
        int temp1 = 0;
        int temp2 = 0;
        String Flag = "";
        Flag = Integer.toString(number);
        int length = Flag.length();

        for (int i = 1; i<=length+1; i++)
        {
            temp1 = number % 10;
            number  = number/10;
            temp2 = temp2+ temp1;

        }
        return temp2;
    }
}
