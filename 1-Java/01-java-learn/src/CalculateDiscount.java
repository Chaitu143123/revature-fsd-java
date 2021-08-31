import java.util.Scanner;

public class CalculateDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter billAmount :");
		float billAmount=sc.nextFloat();
		System.out.println("enter discountPercentage :");
		float discountPercentage=sc.nextFloat();
		float discount =(billAmount * discountPercentage) / 100 ;
	    System.out.println("Discounted Amount = " + discount);



	}

}
