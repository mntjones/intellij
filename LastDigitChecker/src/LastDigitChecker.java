public class LastDigitChecker {

    public static boolean hasSameLastDigit (int n1, int n2, int n3) {

        boolean valid = isValid(n1) && isValid(n2) && isValid(n3);

        return valid && ((n1%10 == n2%10) || (n1%10 == n3%10) || (n2%10 == n3%10));

    }

    public static boolean isValid (int num) {
        return (num >= 10) && (num <= 1000);
    }
}
