package com.example.btbuoi4;

import java.util.Arrays;

public final class WhiteBoxPractice {
    private WhiteBoxPractice() {
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        validateNonNegative(length, "length");
        validateNonNegative(width, "width");
        return 2 * (length + width);
    }

    public static double calculateRectangleArea(double length, double width) {
        validateNonNegative(length, "length");
        validateNonNegative(width, "width");
        return length * width;
    }

    public static double[] solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient a must be different from 0");
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double sqrt = Math.sqrt(discriminant);
            double x1 = (-b - sqrt) / (2 * a);
            double x2 = (-b + sqrt) / (2 * a);
            double[] roots = new double[] {x1, x2};
            Arrays.sort(roots);
            return roots;
        }
        if (discriminant == 0) {
            return new double[] { -b / (2 * a) };
        }
        return new double[0];
    }

    public static int daysInMonth(int month, boolean leapYear) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return leapYear ? 29 : 28;
            default:
                throw new IllegalArgumentException("Month must be between 1 and 12");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int divisor = 3; divisor <= Math.sqrt(n); divisor += 2) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static long sumFromOneToN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        long sum = 0;
        for (int value = 1; value <= n; value++) {
            sum += value;
        }
        return sum;
    }

    public static int gcd(int a, int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);
        if (x == 0 && y == 0) {
            throw new IllegalArgumentException("At least one argument must be non-zero");
        }
        while (y != 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return x;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        long result = 1;
        for (int value = 2; value <= n; value++) {
            result *= value;
        }
        return result;
    }

    public static long sumOfFactorials(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        long sum = 0;
        for (int value = 1; value <= n; value++) {
            sum += factorial(value);
        }
        return sum;
    }

    private static void validateNonNegative(double value, String fieldName) {
        if (value < 0) {
            throw new IllegalArgumentException(fieldName + " must be non-negative");
        }
    }
}
