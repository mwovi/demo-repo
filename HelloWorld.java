import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter principal amount: ");
		double principal = scanner.nextDouble();

		System.out.print("Enter annual interest rate (in %): ");
		double annualRate = scanner.nextDouble();

		System.out.print("Enter period (in years): ");
		int years = scanner.nextInt();

		double monthlyRate = annualRate / 100 / 12;
		int numberOfPayments = years * 12;

		double monthlyPayment = (principal * monthlyRate) /
				(1 - Math.pow(1 + monthlyRate, -numberOfPayments));

		System.out.printf("Monthly Mortgage Payment: %.2f\n", monthlyPayment);
		scanner.close();
	}
}
