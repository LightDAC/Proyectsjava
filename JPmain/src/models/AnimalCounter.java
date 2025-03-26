// models/AnimalCounter.java
package models;

public class AnimalCounter {
    public static int[] countAnimals(int heads, int legs) {
        int rabbits = (legs - 2 * heads) / 2;
        int ducks = heads - rabbits;
        
        if (rabbits < 0 || ducks < 0 || (2 * ducks + 4 * rabbits) != legs) {
            return null; // Solución inválida
        }
        return new int[]{ducks, rabbits};
    }
}
