package com.chihwancompany.exer01;

public class SystemTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = System.nanoTime(); //나노단위로 받는 것
		long b = System.currentTimeMillis(); // 마우스를 올려 반환타입을 확인한 후에 코딩.
		
//		System.out.println(a);
//		System.out.println(b); // 현재시간을 밀리세컨드 1/1000초.
	// 실행하니 403309255958900
		//1716772799674 이렇게 출력됨. 21억보다도 큰 숫자. 그래서 long으로 받아야 하는 것.
		// 나노초는 10의 9승분의 1초. 1/1000000000초
		
		long t1 = System.currentTimeMillis(); // 시작 시간
		long n1 = System.nanoTime(); // 현지시간을 나노단위
		
		int sum =0;
		for(int i=1;i<=100000000; i++) { // 1~10000000까지의 합
			sum=sum+i;
		}
			
			
		long t2 = System.currentTimeMillis(); // 끝 시간. end time
		long n2 = System.nanoTime();
		
		System.out.println(t2-t1); // 1~1000000까지의 합을 구하는데 걸린 시간이 출력될 것.
		// 실행해보면 3,4,5중의 한 값이 나올 것. 3이 출력되니 1부터 백만까지 더하는데 천분의 3초 정도 걸린 것.
		//0을 하나 더늘려보면 25가 출력됨. 100분의 25초. 그만큼 더 걸리는 것.
		System.out.println(n2-n1);
		
	}

}
