package com.chihwancompany.exer01;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ran1 = Math.random();
		
		System.out.println(ran1); // 실행할 때마다 값이 바뀜. 랜덤이므로 
		//다만, 1을 넘지 않는다. 실수이기때문. 0과 1.0사이의 실수를 반환하는 함수임.
		// 그런데 범위가 0은 나오지만 1은 나오지 않음. 0.0<= ran1<1.0 인 것
		// 이것을 이용해서 로토번호 1~45 중에서 한 개의 숫자를 반환하는 타입으로 바꾸어 본다면,
		//파이썬은 randint가 있지만 자바는 이것 하나뿐이라고.
		
		int lotto1 = (int)(ran1 * 45);  // 그러므로 45를 곱하면 1은 죽었다 깨도 안 나오니까 45는 안 나올 것임. 이것을 정수로 바꿀필요
		System.out.println(lotto1); // 실행하면 0~44까지만 출력됨. 왜냐하면 정수로 바꾸었으니까 소숫점을 떨어지고 44까지만 나오게 될 것.
		//그런데 0은 필요없고 45는 필요하니까
		System.out.println(lotto1+1); // 이렇게 해주면 1부터 45 사이에서 랜덤으로 숫자가 나올 것.
		// 자바는 이렇게 만들어서 사용해야 하는 것.
		// 주사위게임이라면 6을 곱한 다음에 1을 더하면 될 것임. 
		
		
		// 아래는 타입변환 연습문제 풀기 
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		
		
	}

}
