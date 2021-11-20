package javaPrograms;

public class CountPercentageOfEveryCharacterInAString {

	public static void main(String[] args) 
	{
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int DigitsCount=0;
		int otherCharactersCount=0;	
		String s ="Tiger Runs @ The Speed Of 100 km/hour.";
		char[] arr=s.toCharArray();
		int totalCharCount=arr.length;
		for(int i=0;i<arr.length;i++) 
		{
			if(Character.isLowerCase(arr[i])) 
			{
				lowerCaseCount++;
			}
			else if(Character.isUpperCase(arr[i])) 
			{
				upperCaseCount++;
			}
			else if(Character.isDigit(arr[i]))
			{
				DigitsCount++;
			}
			else
			{
				otherCharactersCount++;
			}
		}
	
		System.out.println("Upper Case Percentage is:"+ " "+(double)(upperCaseCount*100)/totalCharCount);
		System.out.println("lower Case Percentage is:"+ " "+(double)(lowerCaseCount*100)/totalCharCount);
		System.out.println("Digits Percentage is:"+ " "+(double)(DigitsCount*100)/totalCharCount);
		System.out.println("Other Characters Percentage is:"+ " "+(double)(otherCharactersCount*100)/totalCharCount);
		}
}
