package Meet.LearningJava;

public class ShouldWakeUp {

    public static void main (String[] args)
    {
        boolean s = true ;
        int hours = 5;
        System.out.println(s);
        ShouldWakeUp(s, hours);
    }
    public static void ShouldWakeUp (boolean state, int hours)
    {
        if ((hours >=0)&&(hours<=23)) {
            if ((state == true) && ((hours < 8) || (hours > 22)))
                System.out.println("The Dog is Barking");
            else
                System.out.println("The Dog is not Barking");
        }
    }
}
