package com.example.monica;

public class Series {

    public static long nSum (int n) {
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial (int n) {

        long factorial = 1;

        if (n == 0) {
            return 1;
        }
        else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static long fibonacci (int n) {
        long n1 = 0;
        long n2 = 1;
        long fibonacci = 0;

        if (n == 0) {
            return n1;
        }
        else if (n == 1) {
            return n2;
        }
        else {
            for (int i=2; i <= n; i++) {
                fibonacci = n1 + n2;
                n1 = n2;
                n2 = fibonacci;
            }
            return fibonacci;
        }
    }
}
