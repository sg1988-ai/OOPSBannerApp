import java.util.Random;

public class TicTacToe7 {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int slot;
        boolean isValid = false;

        // Loop Until Valid
        while (!isValid) {
            // Generate slot 1-9
            slot = random.nextInt(9) + 1;

            // Logic Reuse: Convert slot number to board coordinates
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Ensure move validity
            if (board[row][col] == ' ') {
                board[row][col] = computerSymbol;
                System.out.println("Computer placed " + computerSymbol + " in slot " + slot);
                isValid = true;
            }
        }
    }
}