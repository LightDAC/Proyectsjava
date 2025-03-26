// models/Padovan.java
package models;

public class Padovan {
    public static int getPadovan(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        return getPadovan(n - 2) + getPadovan(n - 3);
    }
}
