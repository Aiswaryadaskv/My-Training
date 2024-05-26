package discountPolymorphism;
public class Onseason extends Offseason{
	public final double onseasondiscount=0.40;
	public void discoumt(double total)
	{
		super.discount(total);
		System.out.println("on season discount"+(total-(total*onseasondiscount)));
	}
public static void main(String args[])
{
	Onseason obj=new Onseason();
	obj.discount(20000);
}

}
