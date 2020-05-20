package academy.learnprogramming;

public class Main {

    // final =  can't change value
    private static final String INVALID_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(-10,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_MESSAGE;
        }

        int remainingSeconds = seconds % 60;
        int remainingMinutes = minutes % 60;
        int hours = minutes/60;

        String formattedHours = "" + hours;
        String formattedMinutes = "" + remainingMinutes;
        String formattedSeconds = "" + remainingSeconds;

        if (hours < 10) {
            formattedHours = "0" + hours;
        }

        if (remainingMinutes < 10) {
            formattedMinutes = "0" + remainingMinutes;
        }

        if (remainingSeconds < 10) {
            formattedSeconds = "0" + remainingSeconds;
        }

       return (formattedHours + "h " + formattedMinutes + "m " + formattedSeconds + "s");

    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_MESSAGE;
        }

        int remainingSeconds = seconds % 60;
        int minutes = seconds / 60;

        return getDurationString(minutes, remainingSeconds);

    }
}
