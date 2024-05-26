package discountPolymorphism;

public class Offseason
{
	public final double offseasondiscount=0.15;
	public void discount(double total)
	{
		System.out.println("on season discount"+(total-(total*offseasondiscount)));
	}
}
    
