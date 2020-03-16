package Meet.LearningJava;

public class Main {

    public static void main(String[] args) {
	double myValue = 20.00;
	double mySecondValue = 80.00;
	double myResult = 100*(myValue+mySecondValue);
	double myRemainderVar = myResult%40;
	boolean bolResult;
	boolean testing = (myRemainderVar == 0) ?true:false;
    System.out.println("The value is "+testing);
    if (testing == false)
        System.out.println("Got Some Remainder");
    }
}

