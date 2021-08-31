import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter shortname :");
		String string=sc.nextLine();
		
		if(string.length()>2 && string.length()<7) {
			System.out.println("This is a valid Short Name");
		}
			else {
				System.out.println("This is  not a valid Short Name");

			
			
		}

	}

}
