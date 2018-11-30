package ExceptionHandling;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.TimeUnit;
class Account1{
	private String accountNumber;
	private String accountName;
	Double dueAmount;
	SimpleDateFormat sdf;
	String currentDate;
	long noOfDays;
	
	public Account1(String accountNumber, String accountName, Double dueAmount) {
		super();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.dueAmount = dueAmount;
	}
	
	public Integer validate(String dueDate, Double unpaidAmount, Double amount) {
		try {
			if(amount == null)
				throw new InputMismatchException();
			Date d1 = sdf.parse(dueDate);
			currentDate = sdf.format(Calendar.getInstance().getTime());
			Date d2 = sdf.parse(currentDate);
			long diff = d2.getTime() - d1.getTime();
			noOfDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			if (unpaidAmount>2000 && noOfDays>45)
				throw new Exception();
		}
		catch(InputMismatchException e) {
			return -1;
		}
		catch(ParseException e) {
			return -2;
		}
		catch(Exception e) {
			return -3;
		}
		return 4;
	}
	
	public void display() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Name : " + accountName);
		System.out.println("Unpaid Amount : " + dueAmount );
	}
	
}

public class Ques5 {
	public static void main(String[] args) {
		String accountNumber;
		String accountName;
		String dueDate;
		Integer result;
		Double unpaidAmount, amount;
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the account number : ");
		accountNumber = xyz.nextLine();
		System.out.println("Enter the account holder name : ");
		accountName = xyz.nextLine();
		System.out.println("Enter the last due date : ");
		dueDate = xyz.nextLine();
		System.out.println("Enter the unpaid Amount : ");
		unpaidAmount = xyz.nextDouble();
		System.out.println("Enter Amount : ");
		try {
			amount = xyz.nextDouble();		
		}
		catch(InputMismatchException e) {
			amount = null;
		}
		Account1 obj = new Account1(accountNumber, accountName, unpaidAmount+amount);
		result = obj.validate(dueDate, unpaidAmount, amount);
		switch(result) {
			case -1:
				System.out.println("Invalid Amount");
				break;
			case -2:
				System.out.println("Invalid Date Format");
				break;
			case -3:
				System.out.println("Further Transactions Not Possible until clearance of bill");
				break;
			default:
				System.out.println("Transaction successfully completed");
				obj.display();
		}
		xyz.close();
		
	}
}
