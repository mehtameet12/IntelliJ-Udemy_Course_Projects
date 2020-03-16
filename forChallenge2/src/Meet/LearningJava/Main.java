package Meet.LearningJava;

public class Main {

    public static void main(String[] args) {
            int flag = 0;
            int temp  = 0;
            for(int i = 1; i<=1000; i++)
                if ((i%3==0)&&(i%5==0))
                {
                    System.out.println("The Numbers divisible by either 3 or 5 are "+i);
                    flag++;
                    temp = temp+i;
                    if (flag == 5)
                    {
                        System.out.println("The sum of numbers is "+temp);
                        break;
                    }
                }

    }
}
