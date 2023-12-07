package javaChallenge9;

public class NonRepeatingChar {

	public static void main(String[] args, Object Break) {
		// TODO Auto-generated method stub
		//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

		String input = ("TestLeaf");

		//Initialise variable
		String found = "false";
				
		//string to char array
		char[] arr = input.toCharArray();

			for(int i = 0; i < arr.length; i++) 
			{  
			   //read the same array again from the next element to check for the character repeats
		            for(int j = i + 1; j < arr.length; j++) 
			    {  
		                if(arr[i] == arr[j])  
		                { 
				    found  = "True";
				}
		            }
			  //After reading thru entire string, if the same char not found then break the loop and return its index 	
			    if ( found == "false" ) 
			    {
				System.out.println("Output: " + arr[i]  );  
			
			    }

			//After reading entire string if still not found any non repeating characters then return -1
		            if(arr[i] == arr.length-1 )  
			    {
				    if ( found == "false" ) 
				    {
					System.out.println("Output: -1"  );  
				    }
			    }
						
		        }  

	}

		
	}


