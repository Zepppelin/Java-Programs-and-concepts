package javaPrograms;


public class StaShareCommonProp 
{
	static String Collegename="Harward";
    String name;
    int rollNum;
    
   public StaShareCommonProp(String name, int rollNum)
    {
    	this.name= name;
    	this.rollNum=rollNum;
    }
	public static void main(String[] args)
	{
		StaShareCommonProp t1 = new StaShareCommonProp("ajeet",123);
		StaShareCommonProp t2 = new StaShareCommonProp("kumar",456);
		StaShareCommonProp t3 = new StaShareCommonProp("ajeet",890);
		System.out.println(t1.name);
		System.out.println(t1.rollNum);
		System.out.println(t1.Collegename);
		System.out.println(t1.hashCode());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(t2.name);
		System.out.println(t2.rollNum);
		System.out.println(t2.Collegename);
		System.out.println(t2.hashCode());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");

		System.out.println(t3.name);
		System.out.println(t3.rollNum);
		System.out.println(t3.Collegename);
		System.out.println(t3.hashCode());
		
		
	}
}