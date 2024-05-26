package globalAggregationEmp;


import globalAggregationAddress.AddressClass;

public class EmployeeClass {
	AddressClass address;//reference to address class in different package
	int empid;
	String name;
	String designation;
	
	public EmployeeClass(int empid,String name,String designation,AddressClass address)
	{
		this.empid=empid;
		this.name=name;
		this.designation=designation;
		this.address=address;//all the things within address class is available
	}
	public void display()
	{
		System.out.println("Employeeid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("Address:"+address.housename);
		System.out.println(address.street);
		System.out.println(address.district);
		System.out.println(address.pin);
		System.out.println(" ***********");
	}
	public static void main(String args[])
	{
		AddressClass ad1=new AddressClass("Houseone","Street23","Kannur",670890);
		EmployeeClass em1=new EmployeeClass(101,"Raju","Manager",ad1);
		em1.display();
	}

}
