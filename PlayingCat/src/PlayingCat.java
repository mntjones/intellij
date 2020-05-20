public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature) {

        // true if temp is between 25 and 35 inclusive
        // true if summer and temp is between 25 and 45 inclusive

        if (temperature >= 25 && temperature <= 35) {
            return true;
        }

        if (summer == true && temperature >= 25 && temperature <= 45) {
            return true;
        }

        return false;

    }
}
