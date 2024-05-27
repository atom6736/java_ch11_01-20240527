package com.chihwancompany.exer01;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "오늘은 자바 프로그래밍!!";
		String str2 = str1.replace("자바", "파이썬");
		
		System.out.println(str1);
		System.out.println(str2);
//특정 문자열을 바꿀 때 씀. 가끔 사용.
		
		String str3 = str1.replace("java", "파이썬");
		System.out.println(str3); // 만일 이렇게 하면 java가 없으니까 못 바꾸고 에러 나지 않으며 그대로 원본 문자열을 반환하게 됨.
		
		// 여기에도 슬라이싱이 있다. 잘라내는 것.
		
		String ssn = "880815-1234567";
		
		System.out.println(ssn.substring(7)); // 이것은 슬라이싱 7번 인덱스부터 시작해서 끝까지. 
		// 파이썬의 경우라면 ssn[7:]와 같은 것.
		
		System.out.println(ssn.substring(7,9)); // 이렇게 하면 7과 8까지만 나옴. ssn[7:9]와 같음. 실행하면 숫자 1,2만 출력됨.
		
		String no1 = "10";
		String no2 = "3.14";
		//System.out.println(no1/2); 하면 에러가 남. 왜냐하면 no1이 문자열이므로. 하지만 10이 문자열이지만 숫자처럼 생겼을니까 숫자로 바꿔줄 수 있음.
		//그때 사용하는 것이 래퍼클래스. 문자열을 숫자로 또는 수자열을 문자로. 서로 바꾸어 쓸 수 있다. Wrapper 클래스
		// 이것은 엄청 중요. 웹에서 숫자를 입력받아도 그것이 문자로 들어올 수 있어 그것을 숫자로 바꾸지 않으면 안됨.그럴때 필요.
		
		int num1 = Integer.parseInt(no1); //이렇게 하면 숫자로 변환되어 계산이 가능하게 되어 에러가 발생하지 않음. 
		//래퍼클래스는 해당 타입의 이름이 그대로 클래스가 되어 있음. 파이썬에서는 int num1 = (int)10
		System.out.println(num1/2);
		
		double num2 = Double.parseDouble(no2); // 문자열이 실수로 바귐
		System.out.println(num2/2);
		
		int val1 = 112;
		//String strVal1 = val1; 이렇게 하면 에러
		String strVal1 = String.valueOf(val1); // 이렇게 하면 정수가 문자열로 바뀜. 문자열로 바꾸어서 무얼하나? 한글자씩 빼서 사용해야 할 경우가 있을 것.
		
		double val2 = 3.141592;
		String strVal2 = String.valueOf(val2); // 실수를 문자열로 변환.
		
		// 이상의 내용은 매우 중요하므로 꼭 기억할 것.
	}

}
