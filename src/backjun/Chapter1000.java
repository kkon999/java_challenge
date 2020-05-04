package backjun;

import java.util.Scanner;

public class Chapter1000 {
	public static void main(String[] args) {
		
		// Scanner 메소드를 사용하여 데이터를 사용자로부터 입력 받아 인스턴스 sc에 저장
		Scanner sc = new Scanner(System.in);
		// int형 변수 A,B를 생성
		int A , B;
		// 입출력 메소드 nextInt를 사용하여 데이터를 입력받고 A,B 변수에 저장
		A = sc.nextInt();
		B = sc.nextInt();
		
		// Print 메소드를 사용하여 변수 A,B에 저장된 두 데이터를 덧셈 연산
		System.out.println(A+B);
	}

}
			