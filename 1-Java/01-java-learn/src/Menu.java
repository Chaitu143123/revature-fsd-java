import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(true) {
		System.out.println("menu");
		System.out.println("=====");
		System.out.println("1.balance enquiry");
		System.out.println("2.recharge");
		System.out.println("3.change caller tune");
		System.out.println("4.exit");
		System.out.println("choose option :");
		int option = sc.nextInt();
		switch (option) {
        case 1: System.out.println("balance enquiry"); 
                break;
        case 2: System.out.println("recharge ");
                break;
        case 3: System.out.println("change caller tune "); 
                break;
        case 4: System.out.println("exit"); 
                 break;
        default: System.out.println("Invalid choice");



	}

}
}
}