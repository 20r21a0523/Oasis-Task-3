package Oasis;

public class Withdraw {

	public void meth(int balance,int amount) {
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println("Please collect your amount");
			System.out.println("Now the balance is :"+balance);
		}
		else
		{
			System.out.println("Insufficient balance.");
			System.out.println("Balance: "+balance);
		}
	}
   
}
