public class HelloAppU7 {

    public static void main(String[] args) {
        // Default name if no arguments are provided
        String names = "World";

        // Check if command-line arguments exist
        if (args.length > 0) {
            // Join all arguments with a comma and a space
            names = String.join(", ", args);
        }

        // Print the final greeting to the console
        System.out.println("Hello, " + names + "!");
    }
}