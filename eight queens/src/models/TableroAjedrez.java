package models;

public class TableroAjedrez {
    private final int SIZE = 8;
    private final int[] queens; 

    public TableroAjedrez() {
        queens = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            queens[i] = -1; 
        }
    }

    public boolean placeQueens(int row) {
        if (row == SIZE) return true; 

        for (int col = 0; col < SIZE; col++) {
            if (isSafe(row, col)) {
                queens[row] = col;
                if (placeQueens(row + 1)) {
                    return true;
                }
                queens[row] = -1; 
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = queens[prevRow];
            if (prevCol == col || Math.abs(prevCol - col) == Math.abs(prevRow - row)) {
                return false;
            }
        }
        return true;
    }

    public int[] getQueens() {
        return queens;
    }

    public int getSize() {
        return SIZE;
    }
}
