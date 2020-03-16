package Meet.LearningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        palindrome(131);

    }

    public static void palindrome(int number){

        int temp1;
        int temp2;
        int sum=0;

        temp2=number;

        while(number>0){
            temp1=number%10;
            sum=(sum*10)+temp1;
            number=number/10;
        }
        if(temp2==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");


    }
}
