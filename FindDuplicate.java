package javaChallenge5;

public class FindDuplicate {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}; 

		// initializing variable to false
		String dupIndicator = "False";

		System.out.println("Duplicate elements in given array: ");  

		 //Searches for duplicate element  
		        // read array for each element
			for(int i = 0; i < arr.length; i++) 
			{  
			   //read the same array again from the next element to check for duplicate
		            for(int j = i + 1; j < arr.length; j++) 
			    {  
		                if(arr[i] == arr[j])  
		                { 
				    dupIndicator  = "True";
				   //System.out.println("True");  
				   break;
				}
				 
		            }  
		        }  

		//output
		System.out.println("Output: " + dupIndicator  );  

	}

}
