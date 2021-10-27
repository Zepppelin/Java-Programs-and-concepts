package javaPrograms;
// Private constructor - Outside person can't call this contructor and are not allowed to create object
// Private static variable of type test(singleton)
//Public static method - Write a static method that has return type object of this singleton class(Test)
public class Test 
{
	private static Test t=null;
	private Test() 
	{
		
	}
	public static Test getTest()
	{
		if((t==null)) 
		{
			t=new Test();
		}
		return t;
	}

	public static void main(String[] args)
	{
		Test t1= Test.getTest();
		Test t2 =  Test.getTest();
		Test t3 =  Test.getTest();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

	}

}
