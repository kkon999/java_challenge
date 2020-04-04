package java_TEST01;

import java.util.Arrays;

		class Solution {
			public int[] solution(String[] shirt_size) {
				
				String[] shirtSize = {1,2,2,2,2};
				
				int[] size_counter = new int[6];
		        for(int i = 0; i < shirt_size.length; ++i) {
		            if(shirt_size[i].equals("XS"))
		               size_counter[0]++;
		            else if(shirt_size[i].equals("S"))
		                size_counter[1]++;
		            else if(shirt_size[i].equals("M"))
		                size_counter[2]++;
		            else if(shirt_size[i].equals("L"))
		                size_counter[3]++;
		            else if(shirt_size[i].equals("XL"))
		                size_counter[4]++;
		            else if(shirt_size[i].equals("XXL"))
		                size_counter[5]++;
		        }
		        return size_counter;
		    
		        
		    }
		    			
	    // The following is main method to output testcase.
	    public static void main(String[] args) {
	        Solution sol = new Solution();
	        String[] shirtSize = {"XS", "S", "M", "L", "XL", "XXL"};
	        int[] ret = sol.solution(shirtSize);
	 
	        // Press Run button to receive output.  
	        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
	    }
	}


		