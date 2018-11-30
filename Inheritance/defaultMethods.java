package Inheritance;
interface vehicle {

	   default void print() {
	      System.out.println("I am a vehicle!");
	      
	   }
	   static void print1() {
		      System.out.println("I am a four wheeler!");
		   }
	}
interface fourWheeler {
	  default void print() {
	      System.out.println("I am a vehicle!");
	      
	   }
	  static void print1() {
	      System.out.println("I am a four wheeler!");
	   }
	}
class car implements vehicle, fourWheeler {

	   public void print() {
		   vehicle.print1();
		   vehicle.super.print();
	       fourWheeler.print1();
	       fourWheeler.super.print();
	   }
	}
public class defaultMethods {
public static void main(String args[])
{
	vehicle v=new car();
	v.print();
}
}
