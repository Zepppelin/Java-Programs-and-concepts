package javaPrograms;

public class Print_No_Without_Using_Any_Loop 
{
	
    public static void printNum(int num)
    {
       if(num<=100)
       {
    	 System.out.println(num);
    	 num++;
    	 printNum(num);
       }
       
       
    }
	public static void main(String[] args) 
	{
       printNum(1);
	}

}
