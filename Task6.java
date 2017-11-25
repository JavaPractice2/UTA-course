import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Please enter a string:");
		String first = in.next();
		System.out.printf("Please enter a second string");
		String second = in.next(); 
		int fl = first.length();
		int sl = second.length();
		int sum = fl+sl;
		System.out.printf("The first string has length %d.\n", fl);
		System.out.printf("The second string has length %d.\n", sl);
		System.out.printf("The sum of the two lengths is %d.\n", sum);
	}

}
