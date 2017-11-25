import java.util.Scanner;
public class Weeks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of weeks");
        double weeks = in.nextDouble();
		double days = 7 * weeks;
        System.out.printf("The number of days is %f/n", days);
	}

}
