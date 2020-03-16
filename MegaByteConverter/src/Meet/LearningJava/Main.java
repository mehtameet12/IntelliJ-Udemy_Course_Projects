package Meet.LearningJava;
public class Main {

    public static void main(String[] args)
    {
        int kiloBytes = 2500;
        PrintMegaBytesAndKilobytes(kiloBytes);

    }
    public static void PrintMegaBytesAndKilobytes(int kiloBytes)
    {
        kiloBytes = 2500;
        System.out.println("The Original Value of KiloBytes is "+ kiloBytes);
        int megaBytes = kiloBytes / 1024;
        System.out.println("The Value of MegaBytes is "+megaBytes);
        int remainderKiloBytes = (kiloBytes - (megaBytes*1024));
        System.out.println("The remainder of KB is "+remainderKiloBytes);
    }
}
