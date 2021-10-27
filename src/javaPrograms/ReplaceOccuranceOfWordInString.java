package javaPrograms;

public class ReplaceOccuranceOfWordInString {

	public static void main(String[] args) 
	{
		String str = "how to do in java provides java tutorials";
		str=str.replaceAll("java", "scala");
		System.out.println(str);

	}

}

