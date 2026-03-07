package bundles;
import java.util.Scanner;

public class SalaryTaxCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base Salary:");
        double baseSalary = sc.nextDouble();

        System.out.println("Enter Bonus:");
        double bonus = sc.nextDouble();

        System.out.println("Enter Years of Experience:");
        int experience = sc.nextInt();

        double totalIncome = baseSalary + bonus;

        // Experience bonus
        if (experience > 5) {
            totalIncome += totalIncome * 0.10;
        }

        double tax;

        if (totalIncome < 500000) {
            tax = totalIncome * 0.05;
        } 
        else if (totalIncome <= 1000000) {
            tax = totalIncome * 0.10;
        } 
        else {
            tax = totalIncome * 0.20;
        }

        double netSalary = totalIncome - tax;

        System.out.println("Total Income: " + totalIncome);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);

        sc.close();
    }
}