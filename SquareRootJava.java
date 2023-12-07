package javaChallenge2;


public class SquareRootJava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//integer number to find the Square root
		int i = 8;
		System.out.println(i);
		
		
		//Return square root of i
		double dValue = Math.sqrt(i);
		System.out.println(dValue);
		
		//Casting double to integer 
		int ivalue = (int)dValue;
		System.out.println(ivalue);

		System.out.println("Square root of " + i + " is " + ivalue);
		
	}

}
