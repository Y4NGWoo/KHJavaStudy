package com.kh.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// 1���� 100 ������ �ڿ��� �� Ȧ���� ���Ͽ� ����Ͻÿ�.
		// ������ ���ϱ�
		int sum = 0;	// ���� ����
				
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				sum = sum + i;			// sum += i;
			}
		}
		System.out.println("Ȧ���� ���� : " + sum);
	}
	
	
	
	
	
	public void exercise2() {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9������ ���� ����
		// �� ���� �������� ����Ͻÿ�.
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ����մϴ�"�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9������ ���� �ϳ� �Է� : ");
		int dan = sc.nextInt();
		
		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan * i);
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��ϼ���.");
		}
		// 1�ܰ� : for������ �������� ����ϴ� ���
		// 2�ܰ� : �Է��� ������ �������� ����ϱ�
		// 3�ܰ� : 1~9 ������ ���ڷθ� �۵��ϰ� �ϱ�
	}
	
	
	
	public void exercise3() {
		/*
		 * 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		 * 1+2+3+4+5+6+7+8+9+10=55
		 */
		int sum = 0;	// ���� ����
						
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+"); 			// i�� 9�϶����� +�� ���
												// i�� �ɶ� = ���� ���
			} else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}

}
