
public class Transacation {
	private char type;
	private double amount;
	public Transacation(char type,double amount) {
		this.type=type;
		this.amount=amount;
		
	}
	public void displayTransaction(double balance) {
		System.out.printf("%4c %12.2f %8.2f\n",type, amount, balance);
	}
	public static void main(String[] args) {
		Transacation transaction1=new Transacation('W',2000.0);
		Transacation transaction2=new Transacation('W',20000.0);
		Transacation transaction3=new Transacation('W',500.0);
		Transacation transaction4=new Transacation('W',15500.0);
		Transacation transaction5=new Transacation('W',10000.0);
		Transacation[] transacationList= {transaction1,transaction2,transaction3,transaction4,transaction5};
		for(Transacation transacation:transacationList) {
		

		transacation.displayTransaction(2000);
		
	}
	}
}



