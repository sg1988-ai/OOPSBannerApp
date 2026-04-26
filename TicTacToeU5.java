public class TicTacToeU5 {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    /**
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {
        // Example test: checking row 1, column 1
        System.out.println(isValidMove(1, 1));
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // 1. Boundary Checking: Row and column must be 0-2
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Conditional Logic: Cell must be empty (contains a space ' ')
        if (board[row][col] == ' ') {
            return true;
        } else {
            return false;
        }
    }
}