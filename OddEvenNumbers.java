import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is natural
        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }

            }

        } else {
            System.out.println("Please enter a positive number");
        }

        input.close();
    }
}