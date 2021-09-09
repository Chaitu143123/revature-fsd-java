import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ac_number = 1234;
	    int ac_pass = 9999;
	    
		
	   
		
		System.out.println("1) CUSTOMER LOGIN");
		System.out.println("2) EMPLOYEE LOGIN");
		System.out.println("3)exit");
        while(true) {

		System.out.println("choose option :");
		int option = sc.nextInt();
		switch (option) {
        case 1: Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the account number:");
                System.out.println("Enter the Password:");
                int pw = scanner.nextInt();
                if(ac == ac_number && pw == ac_pass)
                {
                    System.out.println("Login Successfull!");
                }
                System.out.println("customer menu");
                System.out.println("==============");
                System.out.println("1.create new account");
                System.out.println("2.logout");
                break;
        case 2: System.out.println("employee login");
                break;
                
        case 3: System.out.println("exit"); 
                 break;
        default: System.out.println("Invalid choice");



	}

}
}

}

    
	    
	    