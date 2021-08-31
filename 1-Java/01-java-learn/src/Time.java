import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hh:mm:ss :");
		String string=sc.nextLine();
		System.out.println("minutes :"+string.substring(3,5));

	}

}
