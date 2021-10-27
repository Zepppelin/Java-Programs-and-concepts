package wrapperClasses;

public class ValueOf 
{
	
	public static void valueOfString()
	{
		// Every wrapper class except Character class contains static value of method to create wrapper object for the given string
				byte b=10;
				short s=20;
				int i =30;
				long l = 40;
				float f =50f;
				double  d= 50.9;
				boolean b1=true;
				Byte B=Byte.valueOf("b");
		        System.out.println(B);
		        
		        Short S=Short.valueOf("s");
		        System.out.println(S);
		        
		        Integer I=Integer.valueOf("i");
		        System.out.println(I);
		        
		        Long L=Long.valueOf("l");
		        System.out.println(L);
		        
		        Float F=Float.valueOf("f");
		        System.out.println(F);
		        
		        Double  D=Double.valueOf("d");
		        System.out.println(D);
		        
		        Boolean B1=Boolean.valueOf("b1");
		        System.out.println(B1);
		        
		        Boolean B2=Boolean.valueOf("ajeet"); // content is not true/false/True/False hence it will return false;
		        System.out.println(B2);
		        
		        Boolean B3=Boolean.valueOf("false");
		        System.out.println(B3);
		        
		        Boolean B4=Boolean.valueOf("TRue"); // if we are passing string as the argument then case and content both are not important
		        System.out.println(B4);
	}
	public static void valueOfPrimitive() 
	{
		//Every wrapper class including Character class contain static valueOf() method to create wrapper object for the given primitive
		byte b=10;
		short s=20;
		int i =30;
		long l = 40;
		float f =50f;
		double  d= 50.9;
		boolean b1=true;
		char c='a';
		Byte B=Byte.valueOf(b);
        System.out.println(B);
        
        Short S=Short.valueOf(s);
        System.out.println(S);
        
        Integer I=Integer.valueOf(i);
        System.out.println(I);
        
        Long L=Long.valueOf(l);
        System.out.println(L);
        
        Float F=Float.valueOf(f);
        System.out.println(F);
        
        Double  D=Double.valueOf(d);
        System.out.println(D);
        
        Character  C=Character.valueOf(c);
        System.out.println(C);
        
        Boolean B1=Boolean.valueOf(b1);
        System.out.println(B1);
        
        //Boolean B2=Boolean.valueOf(True); wrong// if we are passing boolean primitive as the argument then case and content both are important only allowed values are true and false
       // System.out.println(B2);
        
        
	}

	public static void main(String[] args)
	{
		
		valueOfPrimitive();
		valueOfPrimitive(); 
        
	}

}
