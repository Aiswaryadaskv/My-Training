package multipleInheritance;

public class ChildClass implements Parent1,Parent2{

	public static void main(String[] args) {
	//ChildClass obj=new ChildClass();
	//obj.print();
	//obj.display();
		Parent1 p1=new ChildClass();//reference of parent1 interface
		p1.display();
		//p1.print(); print is the method of parent2
	}

	@Override
	public void print() {
		System.out.println("print from child class");
		
	}

	@Override
	public void display() {
		System.out.println("display from child class");
	}
	

}
