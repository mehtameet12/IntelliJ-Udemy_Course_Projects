package Meet.LearningJava;

public class ForChallenge {
    public static void main (String[] args)
    {
        System.out.println("The prime number found is "+isPrime(13));
    }
    public static String isPrime(int n)
    {
        System.out.println(n);
        String temp = "";
        int flag = 0;
           if (n==1)
               return "False";

           for(int i = 2; i<n; i++)
           {
               if (n%i==0)
                   return "False";
               else {
                   System.out.println(n);
                   temp = Integer.toString(n);
                   flag++;
                    return temp;
               }
           }
           return temp;
    }
}
