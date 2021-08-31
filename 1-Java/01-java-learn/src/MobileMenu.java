import java.util.Scanner;

public class MobileMenu {

	public static void main(String[] args) {
		System.out.println("menu");
		System.out.println("=====");
		System.out.println("1.balance enquiry");
		System.out.println("2.recharge");
		System.out.println("3.change caller tune");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter option :");
		int option = sc.nextInt();
		switch( option ) {
		case 1:
		System.out.println("balance enquiry");
		break;
		case 2:
			System.out.println("recharge");
			break;
		case 3:
			System.out.println(" change caller tune");
			break;}
		



	}

}
