package backjun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Chapter07 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int str_num = scan.nextInt();
		
		Set<String> str_set = new TreeSet<String>();
		Set<Integer> length_set = new TreeSet<Integer>();
		
		//문자 입력받기
		for(int i=0; i<str_num; i++) {
			String temp = scan.next();
			str_set.add(temp);
			length_set.add(temp.length());
		}
		
		ArrayList<String> str_arr = new ArrayList<String>();
		ArrayList<Integer> length_arr = new ArrayList<Integer>();
		
		str_arr.addAll(str_set);
		length_arr.addAll(length_set);
		
		for(int i = 0; i< length_arr.size(); i++) {
			for(int j=0; j<str_arr.size(); j++) {
				if(length_arr.get(i) == str_arr.get(j).length()) {
					System.out.println(str_arr.get(j));
				}
			}
		}
		
		scan.close();
	}

}