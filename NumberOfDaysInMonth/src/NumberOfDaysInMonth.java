public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year) {

        boolean isLeapYear = false;

        if ((year >= 1 && year <= 9999) && year % 4 == 0) {

            if (year % 100 != 0) {
                isLeapYear = true;
            }
            else if (year % 400 == 0) {
                isLeapYear = true;
            }
        }

        return isLeapYear;
    }

    public static int getDaysInMonth (int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int numOfDays = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numOfDays = 29;
                }
                else {
                    numOfDays = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                numOfDays = 30;
                break;
        }

        return numOfDays;

    }
}
