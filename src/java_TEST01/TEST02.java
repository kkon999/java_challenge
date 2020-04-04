package java_TEST01;

import java.util.Arrays;

class Sol {

public int[] Shirt_solution(String[] shirtSize) {
	int[] answer = {};
	return answer;
}
}

public class TEST02 {

	public static void main(String[] args) {
		
		Sol s1 = new Sol();
		
		String[] shirtSize = {"S", "M", "L"};
		int[] ret= s1.Shirt_solution(shirtSize);
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
	}
}
