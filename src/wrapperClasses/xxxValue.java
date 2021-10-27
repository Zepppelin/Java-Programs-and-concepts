package wrapperClasses;

public class xxxValue
{
	public static void byteValueee() 
	{
		byte b=10;
		Byte B= new Byte(b);
		byte b1=B.byteValue();
	    System.out.println(b1);
		short s=B.shortValue();
		System.out.println(s);
		int i=B.intValue();
		System.out.println(i);
		long l=B.longValue();
		System.out.println(l);
		float f=B.floatValue();
		System.out.println(f);
		double d=B.doubleValue();
		System.out.println(d);
		
	}
	public static void shortValueee() 
	{
		short s=10;
		Short S= new Short(s);
		
		byte b1=S.byteValue();
	    System.out.println(b1);
	    short s1=S.shortValue();
		System.out.println(s1);
		int i=S.intValue();
		System.out.println(i);
		long l=S.longValue();
		System.out.println(l);
		float f=S.floatValue();
		System.out.println(f);
		double d=S.doubleValue();
		System.out.println(d);
		
	}
	
	public static void intValueee() 
	{
				
		int i=10;
		Integer I= new Integer(i);
		
		byte b1=I.byteValue();
	    System.out.println(b1);
	    short s1=I.shortValue();
		System.out.println(s1);
		int ik=I.intValue();
		System.out.println(ik);
		long l=I.longValue();
		System.out.println(l);
		float f=I.floatValue();
		System.out.println(f);
		double d=I.doubleValue();
		System.out.println(d);
		
	}


	public static void main(String[] args)
	{
		//wrapper object to(-) primitive
		//Every number type wrapper class(Byte,Short,Integer,Long,Float,Double has the following 6 methods:
		//public byte byteValue()
		//public short shortValue()
		//public int intValue()
		//public long longValue()
		//public float floatValue()
		//public double doubleValue()
		byteValueee();
		shortValueee();
	}

}
