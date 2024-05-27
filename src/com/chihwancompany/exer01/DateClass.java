package com.chihwancompany.exer01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;  //항상 패키지와 클래스 사이에 입력.

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		
		Date now = new Date();
		
		String strNow1 = now.toString(); //문자열로 변환했으니 문자로 저장가능
		
		System.out.println(strNow1);
		// 실행하면 Mon May 27 12:38:48 GMT+09:00 2024
		//이것은 기본값이 영어이기도 하고 특정값을 뽑아내기도 애매하고 이 출력물을 그대로 쓰기는 애매함.
		//toString으로 문자열로 바꾸면 이렇게 별로 좋지 않음. 그래서 simple date format클래스와 함께 쓴다고.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 이것은 소속이 java.text소속
		String strNow2 = sdf.format(now);
		
		System.out.println(strNow2); 
		// 실행하면 2024년 05월 27일 12시 42분 26초 출력.
		// 웹에 현재날짜를 출력할 일이 있거나 할 때 상요됨. 예약당시의 날짜를 뽑아 DB에 저장할 때 쓰거나 등.
		
		
		//Callendar now2 = new Calendar(); // 타입 캘린더는 초기화를 할 수 없다는 에러메시지가 뜸
		// calendar는 a표시 추상클래스. 메모리에 인스턴스와 추상클래스는 메모리에 객체를 만들 수 없다.왜냐하며 이름만 있는 추상메소드이기 때문에. 그래서 에러가 남.
		// 추상클래스이므로 인스턴스생성 불가. 에러발생. new연산자를 못 쓴다.
		
		Calendar now2 = Calendar.getInstance(); // 싱글톤에서 나왔던 것.프로그램 내에서 캘린더로 만든 것이 하나만 존재하는 것.
		// 이렇게 하면 인스턴스를 생성가능
		
		int year = now2.get(Calendar.YEAR); // 캘린더 객체 안에 추상클래스이니까 상수로 저장되어 있는 거스 그래서 이탤릭체 대문자.
		// 이렇게 현재 운영체제의 연도 등을 뽑아 올 수 있는 것
		
		System.out.println(year);
		
		int month = now2.get(Calendar.MONTH)+1; // 1을 더해줘야 함. 인덱스 0부터 시작 때문인지.
		System.out.println(month); // +1을 하는데 주의.
		
		int day = now2.get(Calendar.DAY_OF_MONTH); // 1을 더해줘야 함. 월은 0월부터 시작하는 때문.
		System.out.println(day);
		
		int week = now2.get(Calendar.DAY_OF_WEEK); // 
		System.out.println(week); // 실행하면 2가 찍혔음. 2는 월요일을 숫자로 표시한 것.
		
		int ampm = now2.get(Calendar.AM_PM); // 
		System.out.println(ampm); // 1은 오후를 표시.
		
		// 캘린더에서 시스템의 현재시간을 가져올 때에는 current를 주로 사용. 밀리세컨드를 계산해서 찍어주거나 
		//아니면 DB에서 현재시간을 자동으로 입력하게 해주는 함수가 있다고. 예를 들어 예약시에 몇시에 예약했는지 하는 것을 입력해야 할 때에
		// 예약한 시간이 반드시 들어가야 할 때 시스템에서 현재시간을 뽑아서 문자열로 바꾸어 인서트문에 넣어주지 않고.
		//DB에서 예약레코드가 생성될 때 자동으로 현재 시각을 가져와서 기록하게 하는 함수가 DB가 있다고. current time이라고 해서 대개 이것을 사용한다고.
		//그러면 자동으로 레코드가 생성된 시간을 DB에 넣어준다고. 
		// 그러니 Date클래스 정도만 알아둬도 될 거라고. Calendar클래스도 많이 안 쓴다고.
		
		
		

	}

}
