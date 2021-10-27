package javaPrograms;

public class UnwantedCharacter_String 
{

	public static void main(String[] args) 
	{
		String s ="!@#$%^&*123456abscfAdd)(*";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		

	}

}


/*public class Test 
{
	
	
	public static void main(String[] args) 
	{
		String s ="!@#$%^&*123456abscfAdd)(*";
		char[] arr=s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z'||arr[i]>='a' && arr[i]<='z'||arr[i]>='0' && arr[i]<='9')
			{
				sb.append(arr[i]);
			}
		}
		System.out.println(sb.toString());
		
    }
	

}*/