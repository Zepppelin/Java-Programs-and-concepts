package Encapsulation;

public class Encapsulation 
{
	private String name;
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public static void main(String[] args) 
	{
		Encapsulation e = new Encapsulation();
		e.setName("Ajeet");
		System.out.println(e.getName());

	}

}
