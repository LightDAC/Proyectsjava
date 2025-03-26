// models/DigitIncreasing.java
package models;

public class DigitIncreasing {
    public static int isDigitIncreasing(int n) {
        for (int d = 1; d <= 9; d++) {
            int sum = 0;
            int term = d;
            while (sum < n) {
                sum += term;
                term = term * 10 + d;
            }
            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }
}
