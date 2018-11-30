package ExceptionHandling;
import java.util.Scanner;
class Transaction{
	private String accountNumber;
	private Double amount;
	public Transaction(String accountNumber, Double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean validate(Double transactionAmount) {
		if(transactionAmount > getAmount() || getAmount() == 500) {
			try {
				throw new Exception("Insufficient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally {
				System.out.println("Your available balance " + getAmount());
			}
		}
		else
			setAmount(getAmount() - transactionAmount);
		return true;
	}
}

public class Ques4 {

	public static void main(String[] args) {
		String accountNumber;
		Double amount;
		Double transactionAmount;
		String choice = "yes";
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the account number : ");
		accountNumber = xyz.nextLine();
		System.out.println("Enter the available amount : ");
		amount = xyz.nextDouble();
		Transaction obj = new Transaction(accountNumber, amount);
		while(choice.equals("yes")) {
			System.out.println("Enter the transaction amount : ");
			transactionAmount = xyz.nextDouble();
			if(!obj.validate(transactionAmount))
				break;
			System.out.println("Do you want to enter more ?(yes/ no) : ");
			xyz = new Scanner(System.in);
			choice = xyz.nextLine();
			if(choice.equals("no"))
				System.out.println("Your available balance " + obj.getAmount());
		}
		xyz.close();
	}

}
