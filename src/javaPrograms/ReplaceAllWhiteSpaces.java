package javaPrograms;

public class ReplaceAllWhiteSpaces {

	public static void main(String[] args) {
		String s = "how to do in java provides java tutorials";
		s=s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
