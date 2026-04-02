public class HelloAppU6 {
    public static void main(String[] args) {
        // If no names are provided, display "Hello, World!"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Iterate through arguments and append a comma and space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String finalNames = nameBuilder.toString();

            // Remove the trailing ", " (last 2 characters)
            if (finalNames.length() > 0) {
                finalNames = finalNames.substring(0, finalNames.length() - 2);
            }

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}