package backjun;

import java.util.Scanner; 

 public class Chapter09 {
	
	 public static void main(String[] args) { 
		 	
		 Scanner scanner = new Scanner(System.in); 
		 String text = scanner.nextLine();
		 String[] splitWords = text.split(" ");
		 
		 int count = 0;
		 for (String str : splitWords) {
			 if (!str.isEmpty()) { 
				 
				 ++count; 
				 
			 } 
		 }
		 
		 System.out.println(count); 
		 scanner.close();
		 
	 } 
}

