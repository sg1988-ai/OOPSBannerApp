public class HelloAppU4 {

    public static void main(String[] args) {

        String message;

        // Check if names are provided
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            message = "Hello, " + nameBuilder.toString() + "!";
        } else {
            message = "Hello, Alice Bob Charlie!";
        }

        // Print the greeting
        System.out.println(message);
    }
}