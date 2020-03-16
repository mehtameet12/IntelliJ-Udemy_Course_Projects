package Meet.LearningJava;

import com.sun.source.tree.ReturnTree;
import jdk.jshell.execution.StreamingExecutionControl;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(60,59));
        System.out.println(getDurationString(3600));

    }

    public static String getDurationString(int minutes, int seconds)
    {
        if ((seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }
        int remainingSeconds = 0;
        int remainingMinutes = 0;
        int hours = 0;
        if (minutes >= 60) {
            hours = minutes / 60;
            remainingMinutes = minutes - (hours*60);
            minutes = seconds / 60;
            minutes = minutes + remainingMinutes;
            remainingSeconds = seconds % 60;
        }

        return hours + "H " + minutes + "M " + remainingSeconds + "S";
    }

    public static String getDurationString(int seconds)
    {
        int minutes;
        if (seconds<= 0)
        {
            return "Invalid Value";
        }

                minutes = seconds / 60;
                int remainingSeconds = 0;
                remainingSeconds = seconds %60;
               // System.out.println(minutes + "M " + seconds + "S");
               return getDurationString(minutes, remainingSeconds);
            }

        }


