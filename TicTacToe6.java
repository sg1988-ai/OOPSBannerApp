public class TicTacToe6 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        placeMove(0, 0, 'X');
        System.out.println(board[0][0]); // Should print 'X'
    }

    /**
     * Updates the board by placing the given symbol at
     * the specified row and column.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}