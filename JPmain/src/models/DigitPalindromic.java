// models/DigitPalindromic.java
package models;

public class DigitPalindromic {
    public static int isDigitPalindromic(int n) {
        String numStr = Integer.toString(n);
        int len = numStr.length();
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - i - 1)) {
                return 0;
            }
        }
        return 1;
    }
}