import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int temp;

        System.out.print("Enter First Number: ");
        number1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        number2 = input.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}