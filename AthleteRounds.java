import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double side1;
        double side2;
        double side3;

        System.out.print("Enter Side 1 (meters): ");
        side1 = input.nextDouble();

        System.out.print("Enter Side 2 (meters): ");
        side2 = input.nextDouble();

        System.out.print("Enter Side 3 (meters): ");
        side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters

        double numberOfRounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
    }
}