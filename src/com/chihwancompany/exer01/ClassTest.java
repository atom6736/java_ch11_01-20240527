package com.chihwancompany.exer01;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class clazz= SystemTimeTest.class; //java.lang소속 클래스.클래스의 정보를 얻을 수 있는 상태로 변환
		
		System.out.println(clazz.getName());
		// 실행하면 소속되어 있는 패키지 네임과 본인의 소속이 출력됨.
		//com.chihwancompany.exer01.SystemTimeTest
		// 이 클래스의 메타데이터, 즉 클래스의 정보를 뽑아낼 수 있는 명령문임.
		// 나중에 경로 같은 것, 이 클래스가 위치하고 있는 경로 같은 것을 알기 위해 필요함.
		//경로를 알아야 가져올 수 있으니까. Spring framework에서 가끔 쓰일 일이 있다.

	}

}
