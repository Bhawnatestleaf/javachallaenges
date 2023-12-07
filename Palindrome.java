package javaChallenge3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step1 : input string
		String input = "1 $2&3 A b a *321";
		//System.out.println("step1: " + input);
		System.out.println("Input: " + input);
		
		//step2: Convert all uppercase into lower case
		input = input.toLowerCase();
		
		//System.out.println("step2: " + input);
		
		//step3 : Remove other than alpha numeric
		input = input.replaceAll(
		          "[^a-zA-Z0-9]", "");
		
		//System.out.println("step3: " + input);
		
		//step4: Create new string - that store the input in reverse order
		char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    String reverse="";
	    for (int i=end;i>=begin;i--)
	    {
	    	reverse = reverse + in[i];
			
	    	//System.out.println(in[i]);
	    	
	    }
		//System.out.println("step4 input:" + input);
		//System.out.println("step4 reverse:" + reverse);
		
		//step 5: compare input Vs Reverse
		if(input.equals(reverse))
		{
			System.out.println("Output: True"  );
			System.out.println(input + " is a Palindrome" );
		}
		else
			{
			System.out.println("Output: False"  );
			System.out.println(input + " is not a Palindrome" );
			}
				
			
	    
	}

}
