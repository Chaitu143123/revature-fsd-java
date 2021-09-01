
public class ProfitCalculatorMethod {

	public static void main(String[] args) {
		int profit = profitCalculator(15,25);
		System.out.println("profit :" + profit);


	}
	public static int profitCalculator(int buyingprice , int sellingprice) {
	    int profit=sellingprice-buyingprice;
	    return profit;

		
	}

}
