package ExceptionHandling;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

class OverLimitException extends Exception{
	public OverLimitException(String msg) {
		super(msg);
	}
}

class Accounts{
	private String accountNumber;
	private String accountName;
	Double dueAmount;
	SimpleDateFormat sdf;
	String currentDate;
	long noOfDays;
	
	public Accounts(String accountNumber, String accountName, Double dueAmount) {
		super();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.dueAmount = dueAmount;
	}
	
	public void validate(String dueDate, Double unpaidAmount, Double amount) throws ParseException{
		Date d1 = sdf.parse(dueDate);
		Date d2 = sdf.parse("01/12/2015");
		long diff = d1.getTime() - d2.getTime();
		noOfDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		System.out.println(noOfDays);
		try {
			if (unpaidAmount>2000 || noOfDays>45)
				throw new OverLimitException("Further Transactions Not Possible until clearance of bill");
			else
				display();
		}
		catch(OverLimitException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void display() {
		System.out.println("Transaction successfully completed");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Name : " + accountName);
		System.out.println("Unpaid Amount : " + dueAmount );
	}
	
}

public class Ques3 {
	public static void main(String[] args) throws ParseException{
		String accountNumber;
		String accountName;
		String dueDate;
		Double unpaidAmount, transacAmount;
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the account number : ");
		accountNumber = xyz.nextLine();
		System.out.println("Enter the account holder name : ");
		accountName = xyz.nextLine();
		System.out.println("Enter the last due date : ");
		dueDate = xyz.nextLine();
		System.out.println("Enter the unpaid Amount : ");
		unpaidAmount = xyz.nextDouble();
		System.out.println("Enter the transaction Amount : ");
		transacAmount = xyz.nextDouble();		
		Accounts obj = new Accounts(accountNumber, accountName, unpaidAmount+transacAmount);
		obj.validate(dueDate, unpaidAmount, transacAmount);
		xyz.close();
	}
}
