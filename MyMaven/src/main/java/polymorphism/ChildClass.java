package polymorphism;

public class ChildClass extends ParentClass{
    @Override
	public void display()
	{
	super.display();
	System.out.println("method from child class");
	}

	public static void main(String[] args) {
		ParentClass obj=new ParentClass();
		obj.display();
	}

}
