package BasicLesonsPracticeReal;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());
        double currentInterestRate = deposit * (annualInterestRate / 100) /12;


        System.out.println(deposit + term * currentInterestRate);

    }
}
