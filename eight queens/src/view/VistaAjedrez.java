package view;

public class VistaAjedrez {
    public void displayBoard(int[] queens, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (queens[row] == col) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

