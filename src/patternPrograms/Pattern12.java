package patternPrograms;
public class Pattern12 
{
	public static void main(String[] args) 
	{
		int Upstar =5;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=Upstar;k++) 
			{
				System.out.print("* ");	
			}
			System.out.println();
			Upstar--;
		}
		int DownStar=1;
		int space=4;
		for(int m=1;m<=5;m++)
		{
			for(int n=1;n<=space;n++)
			{
				System.out.print(" ");
			}
			for(int o=1;o<=m;o++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			DownStar++;
			space--;
		}
	}

}
