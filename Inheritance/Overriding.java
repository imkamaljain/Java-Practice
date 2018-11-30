package Inheritance;
import java.util.*;
class Account
{
	String accno,custname;
	double amount;
	void getAccountNumber()
	{
		
	}
	void setAccountNumber()
	{
		
	}
	
}
class CheckingAccount extends Account
{
	int billPayments()
	{
		return 0;
	}
}
class SavingsAccount extends Account
{
	int billPayments()
	{
		return 0;
	}
}
class FixedAccount extends Account
{
	int billPayments()
	{
		return 0;
	}
}
public class Overriding {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		Account A=new Account();
		int n=xyz.nextInt();
		switch(n)
		{
		case 1:
			
		}
	}
}