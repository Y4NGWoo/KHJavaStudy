package com.kh.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		// for(int i = 1; i < 100; i+=2) for문일때

		int i = 1;
		int sum = 0;
		
		while(i < 100) {
			sum += i;
			i += 2;
			
		}
		System.out.println("합계 : " + sum);

	}

	
	
	
	
	
	public void exercise2() {
		// while문을 이용하여 정수를 하나 입력받아 그 수가 1 ~ 9사이의 수 일때만
		// 그 수의 구구단을 출력하시오.
		// 단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야 합니다"를 출력하시오.
		// 1단계 While문으로 구구단 만들기
		// 2단계 입력한 값으로 구구단 출력
		// 3단계 입력한 수가 1 ~ 9 사이의 숫자일 때만 출력
		// for(int i = 1; i < 10; i++) for문일때
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		if(dan >= 1 && dan <= 9) {
			// 구구단 출력
			int i = 1;
			while(i < 10) {
				System.out.println(dan * i);
				i++;
			}
		}else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}

		}
	


	
	
	
	
	
	
	
	
	public void exercise3() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 : 14
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		while(num != -1) {
			System.out.print("정수 하나 입력 : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("입력하신 수의 합은 : " + sum);
	}
	
	
	
	
	
	
	
	public void exercise4() {
		/*
		 *  while문을 이용하여 -1이 될때까지 정수 여러개를 입력받고 평균을 출력하시오.
		 *  정수를 입력하고 마지막에 -1을 입력하세요
		 *  10
		 *  20
		 *  3
		 *  -20
		 *  -10
		 *  -1
		 *  정수의 개수는 5개이며 평균은 0.6입니다.
		 *  
		 *  정수를 입력하고 마지막에 -1을 입력하세요
		 *  -1
		 *  입력된 수가 없습니다.
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		System.out.println("정수를 입력하고 마지막에 -1를 입력하세요.");
		int input = sc.nextInt();
		while(input != -1) {
			sum += input;
			count++;
			input = sc.nextInt();
		}
		if(count == 0) {
			//입력된 수가 없는 경우
			System.out.println("입력된 수가 없습니다.");
		} else {
			//입력된 수가 있는경우
		
		System.out.print("정수의 갯수는 " + count + "이며 ");
		System.out.println("평균 : " + (double)sum/count + "입니다."); //강제형변환
		}
	}
}
