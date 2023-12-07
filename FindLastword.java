package javaChallenge1;

public class FindLastword{

	public static void main(String[] args) {
		// original string value
		String var1 = "World is beautiful";

		//find last space in the string
		int var2 = var1.lastIndexOf(" ");

		//find last word in the string
		String var3 = var1.substring(var2+1);
		//System.out.println(var3);
		
		//find length of last word
		int var4 = var3.length();
		//System.out.println(var4);
		
		System.out.println("The last word is " +"\"" + var3 +"\" with length: " + var4);
	}

}
