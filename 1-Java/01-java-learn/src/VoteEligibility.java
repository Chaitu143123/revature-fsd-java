import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int age = sc.nextInt();
		if(age<18) {
			
		    System.out.println("cannot vote");
		}
		else {
			System.out.println("can vote");

		}
			

		

		// TODO Auto-generated method stub

	}

}
