import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("What is your name?");
		String name = in.next();
		char first = name.charAt(0);
		System.out.printf("Your initial is %c" , first);

	}

}
