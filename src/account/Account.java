package account;

public class Account {

	private int id;
	private String name;
	private double balance;
	double nbal, depAmount, withdrawAmount;
	
	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	public double assignBalance(String name, double balance) {
		
		if(name == "Current Account") {
			 nbal = balance + 500;	
			System.out.println("Yes");
		}else {
			 nbal = balance+100;
			System.out.println("No");
		}
		//System.out.printf("Current Balance is:", balance);	
		return nbal;
	}
	public double deposit(double depAmount) {
		this.depAmount = depAmount;
		return nbal = nbal + depAmount;
	}
	public double withdraw(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		double remain = nbal - withdrawAmount;
		if(remain >= 1000)
		{
			System.out.println("New balance is : "+remain);
		}
		else {
			System.out.println("Insufficient balance for withdrawal");
		}
		return remain;
		
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public void show() {
		System.out.println("Now Balance is : "+ nbal);
		
	}
	
}
