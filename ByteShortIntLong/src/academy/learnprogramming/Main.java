package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// Section 3.24 Primitive Types
        int myValue = 100;

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value: " + minValue);
        System.out.println("Integer Max Value: " + maxValue);
        // the max value + 1 turned into a negative number (-2147483648)
        // because of overflow. We tried to put too large of a number into
        // an int space. The computer tried to fit it, but couldn't
        System.out.println("Busted Max Value: " + (maxValue + 1));

        // The reverse happens when you try to subtract from the min num.
        // Called underflow.

        // can use underscores in big numbers to clarify (int num = 2_123_123;)
        //width of 32

        //Section 3.25

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Min byte value: " + minByteValue);
        System.out.println("Max byte value: " + maxByteValue);
        // smaller type size could lead to speed performance - width of 8

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Min short value: " + minShortValue);
        System.out.println("Max short value: " + maxShortValue);
        // short has width of 16

        //note the L at the end of the number assigned. You won't get an error unless you try to put a literal value
        // that is bigger than an int value because Java knows ints fit in longs.
        long myLongValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("Min long value: " + minLongValue);
        System.out.println("Max long value: " + maxLongValue);

        // Casting: converts a number from one type to another. Using (byte)(minByteValue/2) tells Java to treat
        // what's in parenthesis as a byte, not an int

        // 3.27 Challenge

        byte myByte = 3;
        short myShort = 9;
        int myInt = 6;

        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        // need to cast here
        short shortTotal = (short)(1000 + 10 * (myByte + myShort + myInt));

        System.out.println("My long: " + myLong);
        System.out.println("My short total: " + shortTotal);


    }
}
