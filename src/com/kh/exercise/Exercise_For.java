package com.kh.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// 1에서 100 사이의 자연수 중 홀수만 더하여 출력하시오.
		// 누적합 구하기
		int sum = 0;	// 변수 생성
				
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				sum = sum + i;			// sum += i;
			}
		}
		System.out.println("홀수의 합은 : " + sum);
	}
	
	
	
	
	
	public void exercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9사이의 수일 때만
		// 그 수의 구구단을 출력하시오.
		// 단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야합니다"를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9사이의 정수 하나 입력 : ");
		int dan = sc.nextInt();
		
		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan * i);
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하세요.");
		}
		// 1단계 : for문으로 구구단을 출력하는 방법
		// 2단계 : 입력한 정수의 구구단을 출력하기
		// 3단계 : 1~9 사이의 숫자로만 작동하게 하기
	}
	
	
	
	public void exercise3() {
		/*
		 * 1부터 10까지의 덧셈을 표시하고 합도 구하시오
		 * 1+2+3+4+5+6+7+8+9+10=55
		 */
		int sum = 0;	// 변수 생성
						
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+"); 			// i가 9일때까지 +로 출력
												// i이 될때 = 으로 출력
			} else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}

}
