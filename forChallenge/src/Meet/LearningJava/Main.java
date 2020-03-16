package Meet.LearningJava;

public class Main {

    public static void main(String[] args) {
        int flag = 0;
        for(int i = 2; i<14; i++) {
            if (isPrime(i) == true) {
                System.out.println("The prime number found is " + i);
                flag++;
            }
            if (flag == 3 )
               break;
        }

    }

    public static boolean isPrime(int n) {

        String temp = "";
        int flag = 0;
        if (n == 1)
            return false;

        for (int i = 2; i < n; i++) {

            if (n % i == 0)
                return false;
        }
        return true;
    }
}
