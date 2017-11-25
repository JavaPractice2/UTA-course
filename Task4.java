import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Please enter a double number:");
		double a = in.nextDouble();
		int a1 = (int) a;
		double a2 = Math.round(a);
		double a3 = Math.floor(a);
		double a4 = Math.ceil(a);
		System.out.printf("a cast into an int becomes %d.\n", a1);
		System.out.printf("a rounded becomes %.0f.\n", a2);
		System.out.printf("The floor of a is %.0f.\n", a3);
		System.out.printf("The ceiling of a is %.0f.\n", a4);
	
	
	
	}

}
