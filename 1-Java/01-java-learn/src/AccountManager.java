
public class AccountManager {

	public static void main(String[] args) {
		String accountNumber="0130234374";
		Double Balance=5000.0;
		System.out.println("accountNumber= " + accountNumber);
		System.out.println("initialBalance = " + Balance );
		System.out.println("\n------------------------");
		System.out.println("Type Transaction Balance");
		System.out.println("--------------------------");
		/*char type='W';
		double transacation=2000.0;
		Balance=Balance-transacation;
		System.out.printf("%4c %12.2f %8.2f\n",type, transacation, Balance);
	    type='D';
		transacation=20000.0;
		Balance=Balance+transacation;
		System.out.printf("%4c %12.2f %8.2f\n",type, transacation, Balance);
		type='D';
		transacation=500.0;
		Balance=Balance+transacation;
		System.out.printf("%4c %12.2f %8.2f\n",type, transacation, Balance);
		type='W';
		transacation=15500.0;
		Balance=Balance-transacation;
		System.out.printf("%4c %12.2f %8.2f\n",type, transacation, Balance);
		type='D';
		transacation=10000.0;
		Balance=Balance-transacation;
		System.out.printf("%4c %12.2f %8.2f\n",type, transacation, Balance);*/
		Balance =calculateBalance('W' ,2000.0 ,Balance);
		Balance =calculateBalance('D' ,20000.0 ,Balance);
		Balance =calculateBalance('D' ,500.0 ,Balance);
		Balance =calculateBalance('W' ,15500.0 ,Balance);
		Balance =calculateBalance('W' ,10000.0 ,Balance);


		System.out.println("--------------------------");
}
	public static double calculateBalance(char type,double transacation,double Balance) {
		if(type == 'D') {
			Balance += transacation;

			}
		if(type == 'W') {
			Balance -= transacation;
			}
		System.out.printf("%4c %12.2f %8.2f\n",type, transacation, Balance);
		return Balance;

		

	}
		


}
