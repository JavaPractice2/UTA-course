import java.util.Scanner;

public class user {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter the radius: ");
    double radius = in.nextDouble();
    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius, 2);
    System.out.printf("The circumference is %f/n", circumference);
    System.out.printf("The area is %f/n" , area);
  }
}