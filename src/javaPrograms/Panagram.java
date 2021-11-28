package javaPrograms;

public class Panagram
{

	public static void main(String[] args)
	  {
	      String str = "The quick brown fox jumps over the lazy dog";
	      int index=0;
	      boolean status =false;
	      boolean[] arr = new boolean[26];
	      for(int i=0;i<str.length();i++)
	      {
	    	  if(str.charAt(i)>='A' && str.charAt(i)<='Z') 
	    	  {
	    		  index=str.charAt(i)-'A';
	    	  }
	    	  else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
	    	  {
	    		  index=str.charAt(i)-'a';
	    	  }
	    	  arr[index]=true;
	      }
	      for(int i=0;i<25;i++) 
	      {
	    	  if(arr[i]==true) 
	    	  {
	    		 status=true;
	    	  }
	    	  else 
	    	  {
	    		 status=false;
	    		  break;
	    	  }
	      }
	      if(status==true) 
	      {
	    	  System.out.println(str+" "+"is panagram");
	      }
	      else
	      {
	    	  System.out.println(str+" "+"is not panagram");
	      }
	      
	  }
}
