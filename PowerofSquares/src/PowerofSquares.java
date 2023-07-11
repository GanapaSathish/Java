import java.util.Scanner;

public class PowerofSquares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = scan.nextInt();
		int res = squareNumber(num1);
		System.out.println(res);
		
	}
	public static int squareNumber(int num)
	{
	return num*num;
	}

}
