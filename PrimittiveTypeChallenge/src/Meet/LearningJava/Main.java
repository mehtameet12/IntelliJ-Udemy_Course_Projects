package Meet.LearningJava;

public class Main {

    public static void main(String[] args) {
	    int IntegerVariable = 10;
	    byte ByteVariable = 5;
	    short ShortVariable = 7;
	    long myLongVariable = 50000L;
	    myLongVariable = myLongVariable + 10*((long) (IntegerVariable + ByteVariable + ShortVariable));
        System.out.println(myLongVariable);

	}
}
