package backjun;

import java.util.Scanner;


public class Chapter10953 {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        int limit = Integer.parseInt(sc.nextLine());
        while (limit-- > 0){
            String[] str = sc.nextLine().split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a + b);
           }
      }
}