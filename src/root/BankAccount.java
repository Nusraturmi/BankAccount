package root;
import java.util.Scanner;

import account.Account;
public class BankAccount {

	public static void main(String[] args) {
		Account Saving = new Account(1, "Current Account", 50.1);
		Saving.assignBalance("Running Account", 50.1);
		System.out.println(Saving);
		Saving.show();
		
		//deposit amount taking from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter deposit amount: ");
		double depositeAmount = sc.nextDouble();
		Saving.deposit(depositeAmount);
		Saving.show();
		
		//withdrawal ammount
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter withdrawal amount: ");
		double withdrawAmount = sc1.nextDouble();
		Saving.withdraw(withdrawAmount);
		
	}

}
