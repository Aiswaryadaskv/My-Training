package superAssignment;

public class Divisible extends Addition {
	public Divisible()
	{
		super(10,5);
	}
public void Divisible()
{
	int value=super.Addition();
	if(value%10==0)
	{
		System.out.println("value is divisible by 10");
	}
	else
	{
		System.out.println("value not divisible by 10");
	}
}
	public static void main(String args[])
	{
		Divisible obj=new Divisible();
		obj.Divisible();
	}
}

