package com.kh.control;

import java.util.Scanner;

public class Exam_If {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0입니다.");
		} else if(num >0) {
			System.out.println("양수 입니다.");
		} else {
			System.out.println("음수 입니다.");
		}
		// String result = num == 0 ? "0입니다." : num > 0 ? "양수" : "음수";
		// 삼항연산자와 로직이 같음
	}
}
