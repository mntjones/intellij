public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int minNum = Math.min(first, second);
        int largestDivisor = 1;

        for (int i = minNum; i > 1; i --) {

            if (first % i == 0 && second % i == 0) {
                largestDivisor = i;
                break;
            }

        }
        return largestDivisor;
    }
}
