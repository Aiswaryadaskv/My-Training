package encapsulation1;

public class EncapusalationSample1 {
	private String name;
	private int age;
	public void setter(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void getter()
	{
	age=age*2;
	System.out.println("Name :"+ name);
	System.out.println("Age :"+ age);
	}

}
