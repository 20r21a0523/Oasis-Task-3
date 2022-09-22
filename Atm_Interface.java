package Oasis;
import java.util.*;
public class Atm_Interface {
	int bal=1000000;
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		int ch,transactions=0;
		String transac_history="";
		System.out.println("ATM Machine");
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		System.out.println("Enter your pin:");
		int pin=sc.nextInt();
		System.out.println("1.Transaction History"+"\n"+"2.Withdraw"+"\n"+"3.Deposit"+"\n"+"4.Transfer"+"\n"+"5.Exit");;
		while(true)
		{
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("----Transaction History----");
			       new Transfer().meth4(transactions,transac_history);break;
			case 2:System.out.println("----Withdraw Operation----");
			       System.out.println("Enter amount to withdraw:");
			       int amount=sc.nextInt();
			       new Withdraw().meth(bal,amount);break;
			case 3:System.out.println("----Deposit Operation----");
				   System.out.println("Enter amount to deposit:");
			      int dep=sc.nextInt();
			      new Deposit().meth2(bal,dep);break;
			case 4:System.out.println("----Transfer Operation----");
			       System.out.println("Enter Account number:");
			       long num=sc.nextLong();
			       System.out.println("Enter amount to Transfer:");
			       int tran=sc.nextInt();
			       if(tran>bal)
				{
				    System.out.println("Insufficient Balance");
				}
				else
				{
				    System.out.println("Amount transfered successfully");
				    bal-=tran;
			       	    String var=tran+" Rs transferred to "+num+"\n";
				    transac_history=transac_history.concat(var);
				    transactions++;
				}
			       break;
			case 5:System.exit(0);break;
			default:System.out.println("Invalid choice");
			}
		}
	}

	public static void main(String[] args) 
	{
      new Atm_Interface().meth1();
	}

}
