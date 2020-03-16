package Meet.LearningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myFloatValue = Float.MAX_VALUE;
        float myFloatValueMin = Float.MIN_VALUE;
        System.out.println("Float Minimum Value = " + myFloatValueMin);
        System.out.println("Float Maximum Value = " + myFloatValue);

        double myDoubleValue = Double.MAX_VALUE;
        double myDoubleValueMin = Double.MIN_VALUE;
        System.out.println("Double Minimum Value = " + myDoubleValueMin);
        System.out.println("Double Maximum Value = " + myDoubleValue);

        int myIntValue = 5;
        float myFloatValueee = 5.25f;
        double myDouble = 5.25;
        System.out.println("myIntValue = "+myIntValue);
        System.out.println("myFloatValue = "+myFloatValueee);
        System.out.println("myDouble = "+myDouble);

        double myPounds = 5.0;
        double mykiloGrams;
        double conversion;
        mykiloGrams = myPounds*(0.45359237);
        System.out.println(myPounds + " Pounds is equal to "+mykiloGrams+ " Kilograms");



    }
}
