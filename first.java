import java.util.Scanner;

public class Program{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to calculator, enter what u whana do:(1 = +,2 = -,3 = *,4 = /)");
		int num = in.nextInt();
		switch(num){
			
			case 1:
			System.out.println("Enter first number: ");
			int sum = in.nextInt();
			System.out.println("Enter second number: ");
			int sum_1 = in.nextInt();
			int result = sum + sum_1;
			System.out.printf("Sum of this two numbers is: %d",result);
			break;

			case 2:
			System.out.println("Enter first number: ");
			int min = in.nextInt();
			System.out.println("Enter second number: ");
			int min_1 = in.nextInt();
			int result_1 = min - min_1;
			System.out.printf("Your number is: %d", result_1);
			break;

			case 3:
			System.out.println("Enter first number: ");
			int z = in.nextInt();
			System.out.println("Enter second number: ");
			int z_1 = in.nextInt();
			int result_2 = z * z_1;
			System.out.printf("Your number is: %d", result_2);
			break;

			case 4:
			System.out.println("Enter first number: ");
			int y = in.nextInt();
			System.out.println("Enter second number: ");
			int y_1 = in.nextInt();
			int result_3 = y / y_1;
			System.out.printf("Your number is :%d", result_3);
			break;
		}
	}
}