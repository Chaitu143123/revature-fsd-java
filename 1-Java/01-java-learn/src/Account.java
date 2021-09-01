
public class Account {
	private String accountNumber;
	private double Balance;
	private Transacation[] transacations;
	public Account(String accountNumber, double balance, Transacation[] transacations) {
		super();
		this.accountNumber = accountNumber;
		this.Balance = balance;
		this.transacations = transacations;
	}
	public static void main(String[] args) {
		Transacation transaction1=new Transacation('W',2000.0);
		Transacation transaction2=new Transacation('D',20000.0);
		Transacation transaction3=new Transacation('D',500.0);
		Transacation transaction4=new Transacation('W',15500.0);
		Transacation transaction5=new Transacation('W',10000.0);
		Transacation[] transacationList= {transaction1,transaction2,transaction3,transaction4,transaction5};
		
		Account account= new Account("0130234374",5000.0,transacationList);
	}


	
}

