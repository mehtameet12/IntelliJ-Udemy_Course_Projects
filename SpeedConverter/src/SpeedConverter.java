public class SpeedConverter {
   public static void main (String args[]){
       printConversion(-1);
   }
    public  static void printConversion(double kilometersPerHour){

        double milesPerHour = kilometersPerHour*1.609;
        double roundedValue = toMilesPerHour(kilometersPerHour);

        if (milesPerHour>0) {
            System.out.println("the conversion of " + kilometersPerHour + "KM/HR to Miles/Hr is " + milesPerHour);
        }
        else
            System.out.println("Invalid Value");
        if(roundedValue>=0)
        System.out.println("The rounded Value is "+roundedValue);


    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        double milesPerHour;
        milesPerHour = kilometersPerHour * 1.609;
        long roundedValue = Math.round(milesPerHour);
        return roundedValue;

    }
}
