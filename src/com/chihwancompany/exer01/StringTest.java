package com.chihwancompany.exer01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//백엔드에서는 문자열을 많이 받을 수밖에 없어 String클래스는 중요. 아래에서 실습함.
		
		String str = "Korea"; // 자바의 문자열 선언. str은 객체가 아니라 사실은 변수인 것. 
		// 문자열 클래스에 문자를 입력해주면 저장하고 str에는 첫 문자의 번지수가 저장된다.
		//하지만 string은 클래스인것. 그러면 원래 String str2 = new String();와 같이 new연산자로 만들어야 하는 것. 
		// 그러면 Korea가 원래는 인수로 들어가야 하는 것. 그러면 그것을 가져다가 메모리에 만들어줄 것. 하지만 이렇게 쓰면 불편하니까 간단하게 쓰게끔 배려를 한 것. 일반변수 선언처럼 쓸 수 있게 한 것.
		// String 클래스에 생성자가 있고 그 생성자가 korea를 받도록 해 놓은 것. 기본생성자이면 아무것도 안 받게 되어 있어 Korea를 넣으면 에러가 날 텐데, 그렇지 않으므로 기본생성자 외에도 매개변수가 잇는 것을 알 수 있음.
		
		System.out.println(str.charAt(2)); //인덱스 2를 뽑아내라는 것이니까 Korea중에r만 출력. 
		//인덱스로 문자열 중 1글자만 추출할 때 사용.
		
		int [] intArray = {1,2,3,4,5};// 이렇게 하면 에러가 나지 않는데,
		//String str3 = new String(intArray); 문자열이 아닌 다른 배열을 넣어주면 에러발생.
		
		int a = 10;
		
		// String str3 = new String(a); 이렇게 해도 에러.
		//이번에는 바이트로 만든 1바이트짜리 공간
		byte[] byteArray = {75,30,21,20, 10,100};
		String str4 = new String(byteArray); //이것은 에러가 안남. 그러니 찍어보고 싶음.
		
		System.out.println(str4); // 실행하면 이렇게 출력됨. K d
		
		
		byte[] byteArray1 = {72,101,108,108,111}; //그러므로 아스키코드도 된 한글자의 배열로 받아들여 한글자당 메모리에 저장해서 마치 문자열이 저장된 것처럼 취급을 하는 클래스인 것.
		String str5 = new String(byteArray1);  //String클래스의 생성자가 문자열을 받는 것도 있을 거고 바이트배열을 받는 생성자도 있음을 알 수 있음.
		
		System.out.println(str5); // 실행하면 Hello가 출력됨.
		
		String str6 = new String(byteArray1, 2,3); //인덱스 2번부터 3개를 찍으라는 말. 이러한 생성자도 String안에 있다는 것. 참고로만 하라고.
		System.out.println(str6); // 실행하면 llo가 출력됨.
		
		//String은 문자열을 만드는 클래스인 것. 그러므로 int나 double, float와는 태생이 다른 class인 것. 그러므로 아스키코드도 된 한글자의 배열로 받아들여 한글자당 메모리에 저장해서 마치 문자열이 저장된 것처럼 취급을 하는 클래스인 것.
		
		String str7 = "자바프로그래밍";
		int a2 = str7.indexOf("프");
		System.out.println(a2); // 실행하면 자바프의 프가 인덱스 2이니까 2가 출력됨.
		
		
		int a3 = str7.indexOf("그래");
		System.out.println(a3); // 문자열ㄹ의 첫글자의 인덱스를 반환. 4가 출력됨.
		
		int a4 = str7.indexOf("왕"); // 해당 문자가 문자열에 없으면 무조건 -1반환. 즉 특정 문자가 있는지 없는지 확인할 때 사용함.
		System.out.println(a4);
		
		int a5 = str7.indexOf("왕자"); // 해당 문자가 문자열에 없으면 무조건 -1반환. 즉 특정 문자가 있는지 없는지 확인할 때 사용함.
		System.out.println(a5);
		
		if (str7.indexOf("푸로") != -1) { // 참이면 해당 문자열이 존재하는 경우이고 그렇지 않으면 해당 문자열이 존재하지 않는 경우가 됨. 이럴 때 사용함.
			
		} else {// 해당 문자열이 존재하지 않는 경우. 푸로는 존재하지 않으니까 -1이 나올 것이니까 같지 않아 거짓이 되니까 else가 실행될 것임.
			
// 따라서 indexOf를 이용하면 특정문자열이 있는지 확인이 가능하게 됨.			
			
		}

		
		
		
		
		
	}

}
