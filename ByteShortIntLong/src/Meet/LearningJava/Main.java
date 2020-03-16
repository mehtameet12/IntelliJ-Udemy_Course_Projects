package Meet.LearningJava;

import com.sun.jdi.ShortType;
import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	    int myValue =10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
        System.out.println("Busted Max Value "+(myMaxIntValue+1));
        System.out.println("Busted Min Value "+(myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Byte Min Value is = "+myMinByteValue);
        System.out.println("My Byte MAx Value is = "+myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Short Min Value is = "+myMinShortValue);
        System.out.println("My Short MAx Value is = "+myMaxShortValue);

        int myIntValue = 10;
        Byte myByteValue = (byte) (myIntValue);
        System.out.println(myByteValue);



    }
}
