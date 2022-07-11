package com.kh.control;

import java.util.Scanner;

public class Exam_While {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0; // 초기식
		while(i < 10) { // 조건식
			System.out.println("출력된 i의 값 : " + i);
			i++; // 증가식
		}
		System.out.println();
		int j = 9;
		while(j >= 0) {
			System.out.println("출력된 i의 값 : " + j);
			j--;
		}
	}
}