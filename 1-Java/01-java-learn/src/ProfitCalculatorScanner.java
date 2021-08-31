import java.util.Scanner;
public class ProfitCalculatorScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter buyingprice :");
		int buyingprice=sc.nextInt();
		System.out.println("enter sellingprice :");
        int sellingprice=sc.nextInt();
		int profit=sellingprice-buyingprice;
	    
		
		System.out.println("profit :" + profit);
	}
}


		