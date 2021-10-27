package patternPrograms;
public class Pattern3 
{
	public static void main(String[] args) 
	{
		int num=5;
		for(int i=1;i<=5;i++) 
		{
			for(int j=num;j>=1;j--)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
	}

}
