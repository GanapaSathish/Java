import java.util.Scanner;
public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the inches");
		double inches = scan.nextDouble();
		HeightConverter converter = new HeightConverter();

		 double result =converter.convertInchesToFeet(inches);
		 System.out.printf("%.2f",result);
	}

}
