package backjun;

import java.util.Scanner;

public class Chapter05 {

	public static void main(String[] args) {
		
		// Scanner 메소드를 사용하여 데이터를 사용자로부터 입력 받아 인스턴스 sc에 저장
		Scanner sc =new Scanner(System.in);
		
		// while 문에서 hasNext 메소드를 사용하여 새로운 입력이 있을때 까지 기다림
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		
	}
}
