package com.kh.exercise;

import java.util.Scanner;

public class Exercise_if {
	public void exercise1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int iNum = sc.nextInt();
		//짝홀 판별 프로그램
		//int num = 4;
		//result = (num % 2 == 0); 짝수
		
		if (iNum > 0 && iNum % 2 == 0) {
			System.out.println("짝수입니다.");			
		}
		else if (iNum > 0) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
		sc.close();
		
		// 중첩if 문 
		//if(iNum > 0) {
			//	if(iNum % 2 == 0) {
				//	System.out.println("짝수입니다.");
			//	}
			//	else {
			//		System.out.println("홀수입니다.");
			//	}
	//		else {
		//			System.out.println("양수만 입력해주세요.");
		//		}
				
	}
	
	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수를 입력해주세요 : ");
		int mid = sc.nextInt();
		System.out.print("기말고사 점수를 입력해주세요 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수를 입력해주세요 : ");
		int hw = sc.nextInt();
		System.out.print("출석횟수를 입력해주세요 : ");
		int attd = sc.nextInt();
		
		double midScore = mid * 0.2;
		double finScore = fin * 0.3;
		double hwScore = hw * 0.3;
		double total = midScore + finScore + hwScore + attd;
		System.out.println("총점 : " + total);
		
		if (attd > 20 * 0.7 && total >= 70 ) {
			System.out.println("Pass입니다!");
			
		}
		else {
			if(total >= 70) {
			System.out.println("Fail입니다. [출석부족] ("+ attd + " / 20)");
		}
			else if (attd > 20 * 0.7) {
				System.out.println("Fail입니다. [점수 미달] " + total + "점");
			}
			else {
				System.out.println("Fail입니다. [출석부족] ("+ attd + " / 20)");
				System.out.println("Fail입니다. [점수 미달] " + total + "점");
			}
		}
	}
		
}


