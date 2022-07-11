package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Switch {
	public void exercise1() {
		// 1 ~ 3 사이의 정수를 입력받아
		// 1인 경우 빨간색 입니다.
		// 2인 경우 파란색입니다.
		// 3인 경우 초록색입니다.
		// 그외의 정수를 입력할 경우 잘못입력하셨습니다를 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 3 사이의 정수를 입력해주세요.");
		int input = sc.nextInt();
		
		switch(input) {  
		case 1 : System.out.println("초록색입니다."); break; 
		case 2 : System.out.println("파란색입니다."); break;
		case 3 : System.out.println("초록색입니다."); break;
		default : System.out.println("잘못입력하셨습니다."); break;
		}
		
	}

	
	public void exercise2( ) {
		/*
		 * 정수 두개와 연산기호 문자 1개를 입력받아서
		 * 연산기호문자(+,-,*,/)에 해당하는 계산을 수행하고 출력하세요.
		 * 단, 그 외의 문자를 입력할 경우 연산자를 잘못입력하셨습니다를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		double cal = sc.nextDouble();
		System.out.print("연산기호문자 입력(+,-,*,/) : ");
		char operator = sc.next().charAt(0);
		System.out.print("두번째 정수 입력 : ");
		double cal2 = sc.nextDouble();		

		double result = 0;
		
		switch(operator) {  
		case '+' :  result = (cal+cal2); break; 
		case '-' :  result = (cal-cal2); break;
		case '*' :  result = (cal*cal2); break;
		case '/' :  result = (cal/cal2); break;
		default : System.out.println("잘못 입력하셨습니다."); break;
		}
		System.out.println("결과 : " + result);
		
	}

	
	
	
	
	public void exercise3() {
	/*
	 * 1 ~ 12 사이의 숫자를 입력받아 해당하는 숫자 달의 마지막 날짜를 출력하세요.
	 * 그외의 숫자를 입력할 경우 1 ~ 12 사이의 숫자를 입력하세요를 출력하세요
	 * 
	 * 1월 ~ 12월까지 중 하나를 입력하세요 : 3
	 * 입력하신 월은 31일까지입니다.
	 * break 활용 !!
	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월까지 달 중 하나를 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 :
		case 8 : 
		case 10 : 
		case 12 : System.out.println("입력하신 월은 31일까지입니다."); break;
		case 2 : System.out.println("입력하신 월은 28일까지 혹은 29일까지입니다."); break;
		case 4 :
		case 6 : 
		case 9 : 
		case 11 : System.out.println("입력하신 월은 30일까지입니다."); break;
		default : System.out.println("1 ~ 12 사이의 숫자를 입력하세요."); break;
		}
	}
}