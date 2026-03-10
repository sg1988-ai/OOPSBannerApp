import java.util.Scanner;

class TriangleChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input three angles
        System.out.print("Enter first angle: ");
        int x = input.nextInt();

        System.out.print("Enter second angle: ");
        int y = input.nextInt();

        System.out.print("Enter third angle: ");
        int z = input.nextInt();

        // Calculate sum
        int sum = x + y + z;

        // Check condition
        if (sum == 180) {
            System.out.println("The given angles are internal angles of a Triangle");
        } else {
            System.out.println("The given angles are not internal angles of a Triangle");
        }

        input.close();
    }
}