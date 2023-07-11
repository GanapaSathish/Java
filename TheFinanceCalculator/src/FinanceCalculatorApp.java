import java.util.Scanner;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal");
		double principal = scan.nextDouble();

		System.out.println("Enter the rate");
		double rate = scan.nextDouble();
		
		System.out.println("Enter the time");
		double time= scan.nextDouble();
		
		FinanceCalculator calculator = new FinanceCalculator();

		double result =calculator.calculateSimpleInterest(principal,  rate, time);
		System.out.printf("%.2f",result);


	}

}
