package globalAggregationStudent;

public class StudentClass {
	StudentAddress address;
	public String sname;
	public int rollnum;
	
	public StudentClass(String sname,int rollnum,StudentAddress address) {

	this.sname=sname;
	this.rollnum=rollnum;
	this.address=address;
	

	}
	public void display() {

	System.out.println("Student Name: "+sname);
	System.out.println("Roll Number: "+rollnum);
	System.out.println("Address:"+address.housename);
	System.out.println(address.streetname);
	System.out.println(address.district);
	System.out.println(address.pin);
	}


	public static void main(String[] args) {

	StudentAddress obj=new StudentAddress("house1","street1","kannur",670301);

	StudentAddress obj1=new StudentAddress("house2","street2","calicut",789609);
	
	StudentClass std1=new StudentClass("ramu",34,obj);

	StudentClass std2=new StudentClass("anna",41,obj1);
	std1.display();
	std2.display();

}
}

