import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary;
        double bonus;
        double totalIncome;

        System.out.print("Enter Salary: ");
        salary = input.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = input.nextDouble();

        totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + 
                           " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);
    }
}