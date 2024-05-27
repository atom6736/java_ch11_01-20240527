package com.chihwancompany.exer01;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob1 = new Object();
		Date da1 = new Date();
		
		System.out.println(ob1);
		System.out.println(da1);
		
		//날짜를 계산해주는 java.lang소속 클래스. Date.을 치면 두개가 자동완성으로 뜨는데 하나는 lang소속, 다른 하나는 util소속. 그것을 잘 봐야 함.
		//위의 프린트문을 실행하면 아래와 같이 출력됨.
		//java.lang.Object@372f7a8d
		//Mon May 27 09:54:01 GMT+09:00 2024

		//System.out.println(ob1.toString());
		//System.out.println(da1.);
		//da1에 점을 찍어보면 ob1에서 보였던 똑 같은 것 9가지가 보인다. 그 이유는 어떤 클래스든지 Object를 상속받기 때문. 그곳의 9개의 메소드(재산)를 상속받아 보여주게 되는 것.
		//hashcode는 거의 쓸일이 없고, toString은 객체 안의 내용물을 출력할 때 쓰일 일이 있다. 
		//toString은 객체안의 내용이 출력되는 경우가 있다. 그럴 때 필요함. 여기 코딩연습에서는 똑같이 출력되고 다르게 나오지는 않는다.
		
		

	}

}
