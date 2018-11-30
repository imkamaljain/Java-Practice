package Inheritance;
class Student
{
	String name;
	int roll,age;
	void getdata(String s,int r,int a)
	{
		name=s;
		roll=r;
		age=a;
	}
}
class Marks extends Student
{
	int totalmarks;
	void getmarks(int m)
	{
		totalmarks=m;
	}
	void display()
	{
		System.out.print("Name= "+name+"\nRoll no.= "+roll+"\nAge= "+age+"\nMarks= "+totalmarks);
	}
}
public class InheritanceDemo {
	public static void main(String[] args)
	{
		Marks m=new Marks();
		m.getmarks(425);
		m.getdata("Kamal Jain",1610991423,19);
		m.display();
	}
}
