package java_TEST01;

 class TEST3_1 {
	 	
	 	public int solution(int price, String grade) {
	 		int answer = 0;
	 		
	 		if      (grade.equals("S")) {
	 			answer = (int) (price*0.95);
			}
	 		else if (grade.equals("V")) {
	 			answer = (int) (price*0.5);
 			}
	 		else if (grade.equals("G")) {
	 			answer = (int) (price*2.0);
	 		}
	 		
	 		
	        return answer;
	 		
		}
	 	
	 	public static void main(String[] args) {
				
		TEST3_1 sol = new TEST3_1();
		
		int price1 = 2500;
		String grade1 = "V";
		int ret1 = sol.solution(price1,grade1);
		System.out.println(ret1);
		
		
		int price2 = 92055;
		String grade2 = "S";
		int ret2 = sol.solution(price2,grade2);
		System.out.println(ret2);
		
	}

}
