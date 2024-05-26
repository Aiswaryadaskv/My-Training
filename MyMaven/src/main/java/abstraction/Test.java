package abstraction;

public class Test extends Sample {

	public static void main(String[] args) {
		Test obj=new Test();
		obj.display();
		obj.print();
	}

	@Override
	public void print() {
		System.out.println("Hello from abstract method");
		
	}

}
