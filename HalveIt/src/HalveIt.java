import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num");
		double num = scan.nextDouble();
		double result = halveTheNumber(num);
		System.out.printf("%.2f",result);
	}
	
	public static double halveTheNumber(double num) {
	double halve = num/2.0;
	return halve;
	}
}
