public class HelloAppU5 {

    public static void main(String[] args) {
        // If no names are provided, display "Hello, World!"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Use enhanced for loop to traverse all arguments
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Display personalized greeting
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}