package interfaceSample;

public class InterfaceExample implements TestInterface {
public static void printone()
{
	System.out.println("hello from implementing class");
}
public static void printtwo()
{
	System.out.println("second implement class hello");
}
	public static void main(String[] args) {
		InterfaceExample obj=new InterfaceExample();
		obj.display();
		obj.print();
		printone();
		printtwo();
	}

	@Override
	public void print() {
		System.out.println("Hello from interface 1");
		
		
	}

	@Override
	public void display() {
		System.out.println("hello interface 2");
	}

}
