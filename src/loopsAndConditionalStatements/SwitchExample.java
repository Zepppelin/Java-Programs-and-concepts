package loopsAndConditionalStatements;

public class SwitchExample 
{

	public static void main(String[] args) 
	{
	   int number = 40;
	   switch(number) 
	   {
	       case 40:
	       {
		     System.out.println(10);
		     //break; //optional -- if break statement is not found it will execute the next case
	       }
	       case 20:
	       {
		      System.out.println(20);
	       }
		   case 30:
	       {
		       System.out.println(30);
	       }
	       default: //optional
	       {
	    	  System.out.println("not in 10 20 & 30"); // If a break statement is not found, it executes the next case.
	    	  //break;
	       }
	       case 50:
	       {
		       System.out.println(50);
	       }

	    }
	   
     }
}
