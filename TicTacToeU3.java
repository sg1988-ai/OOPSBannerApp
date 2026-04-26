import java.util.Scanner;

public class TicTacToeU3 {

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Output: Slot number (1-9)
     * Hint: Validation will be added in later use cases.
     */
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input from the user
        int slot = scanner.nextInt();
        
        // Return the slot value
        return slot;
    }
}