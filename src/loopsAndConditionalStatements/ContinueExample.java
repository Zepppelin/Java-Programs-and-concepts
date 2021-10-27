package loopsAndConditionalStatements;

public class ContinueExample {

	public static void main(String[] args) 
	{
		int num=1;
		for(num=1;num<=10;num++) 
		{
			if(num==5)
			{
		      continue;		
			}
			System.out.print(num);
		}
		
		

	}

}
