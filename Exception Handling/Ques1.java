package ExceptionHandling;
import java.util.*;
class Account
{
	private int accno,pinno;
	private double amount;
	
}
public class Ques1 {
	public static void main(String[] args)
    {
		Scanner xyz = new Scanner(System.in);
		int pin,amount;
		int acc=0;
		while(true) {
		try {
			
			System.out.println(acc);
			acc =xyz.nextInt();
			break;
		}
		catch(Exception e){
			System.out.println(acc);
			System.out.println(e);
			continue;
		}
        }
    }
}