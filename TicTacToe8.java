import java.util.Scanner;

public class TicTacToe8 {
    // Game state flags as per requirements
    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== UC8: Game Loop Started ===");

        // Continuous Gameplay loop
        while (!gameOver) {
            if (isHumanTurn) {
                System.out.println("\n[Human Player's Turn]");
                humanMove(scanner);
                
                // Stop loop on win or draw
                if (checkWinOrDraw()) {
                    gameOver = true;
                    System.out.println("\nGame Over! Human player has ended the game.");
                    break;
                }
                
                // Switch turn
                isHumanTurn = false;
            } else {
                System.out.println("\n[AI Player's Turn]");
                aiMove();
                
                // Stop loop on win or draw
                if (checkWinOrDraw()) {
                    gameOver = true;
                    System.out.println("\nGame Over! AI player has ended the game.");
                    break;
                }
                
                // Switch turn
                isHumanTurn = true;
            }
        }
        
        System.out.println("=== Game Terminated Successfully ===");
        scanner.close();
    }

    // Handles the human player's move
    public static void humanMove(Scanner scanner) {
        System.out.print("Enter your move (e.g., cell number 1-9): ");
        String move = scanner.nextLine();
        System.out.println("Human placed mark at: " + move);
    }

    // Handles the AI player's move
    public static void aiMove() {
        System.out.println("AI is calculating the best move...");
        System.out.println("AI placed mark automatically.");
    }

    // State checking method to simulate a win or draw
    static int moveCounter = 0;
    public static boolean checkWinOrDraw() {
        moveCounter++;
        // Ends the continuous game loop after 4 moves for demonstration purposes
        return moveCounter >= 4; 
    }
}