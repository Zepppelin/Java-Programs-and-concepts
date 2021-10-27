package loopsAndConditionalStatements;

public class IfElseIfExample {

	public static void main(String[] args) 
	{
		int age = 21;
		if(age<18) 
		{
			System.out.println("age is lesser than 18");
		}
		else if(age<20)
		{
			System.out.println("age is lesser than 20");
		}
		else if(age>20) 
		{
			System.out.println("age is greater than 20");
		}
	}

}
