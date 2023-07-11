import java.util.Scanner;

public class TheCubeMystery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = scan.nextInt();
		int res = cubeNumber(num1);
		System.out.println(res);
		
	}
	public static int cubeNumber(int num)
	{
	return num*num*num;
	}

	}

