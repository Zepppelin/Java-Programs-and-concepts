package javaPrograms;

public class ReplaceAllWhiteSpaces {

	public static void main(String[] args) {
		String s = "how to do in java provides java tutorials";
		s=s.replaceAll("\\s", "");
		System.out.println(s);

	}

}

//public class Test1 
//{
//	public static String replaceWhiteSpaces(String s) 
//	{
//	    char[] arr=s.toCharArray();
//	    StringBuffer sb = new StringBuffer();
//	    for(int i=0;i<arr.length;i++) 
//	    {
//	    	if(arr[i]!=' ')
//	    	{
//	    		sb.append(arr[i]);
//	    	}
//	    }
//	    return sb.toString();
//	}
//	
//	public static void main(String[] args) 
//	{
//		String s = "how to do in java provides java tutorials";
//		System.out.println(replaceWhiteSpaces(s));
//		
//	}
//
//}