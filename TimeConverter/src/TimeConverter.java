import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minutes");
		int minutes = scan.nextInt();
		double result =convertToHours( minutes);
		System.out.println(result);

	}
	public static double convertToHours(int minutes) {
		double convert = minutes/60.0;
		return convert;
	}
}
