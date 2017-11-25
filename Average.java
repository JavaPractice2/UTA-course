import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter number 1 :");
		double n1 = in.nextDouble();
		System.out.printf("Enter number 2 :");
		double n2 = in.nextDouble();
		System.out.printf("Enter number 3 :");
		double n3 = in.nextDouble();
		double average = (n1+n2+n3)/3;
		System.out.printf("The average is %f", average);
	}

}
