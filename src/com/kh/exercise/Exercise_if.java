package com.kh.exercise;

import java.util.Scanner;

public class Exercise_if {
	public void exercise1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int iNum = sc.nextInt();
		//¦Ȧ �Ǻ� ���α׷�
		//int num = 4;
		//result = (num % 2 == 0); ¦��
		
		if (iNum > 0 && iNum % 2 == 0) {
			System.out.println("¦���Դϴ�.");			
		}
		else if (iNum > 0) {
			System.out.println("Ȧ���Դϴ�.");
		}
		else {
			System.out.println("����� �Է����ּ���.");
		}
		sc.close();
		
		// ��øif �� 
		//if(iNum > 0) {
			//	if(iNum % 2 == 0) {
				//	System.out.println("¦���Դϴ�.");
			//	}
			//	else {
			//		System.out.println("Ȧ���Դϴ�.");
			//	}
	//		else {
		//			System.out.println("����� �Է����ּ���.");
		//		}
				
	}
	
	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰���� ������ �Է����ּ��� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻��� ������ �Է����ּ��� : ");
		int fin = sc.nextInt();
		System.out.print("���� ������ �Է����ּ��� : ");
		int hw = sc.nextInt();
		System.out.print("�⼮Ƚ���� �Է����ּ��� : ");
		int attd = sc.nextInt();
		
		double midScore = mid * 0.2;
		double finScore = fin * 0.3;
		double hwScore = hw * 0.3;
		double total = midScore + finScore + hwScore + attd;
		System.out.println("���� : " + total);
		
		if (attd > 20 * 0.7 && total >= 70 ) {
			System.out.println("Pass�Դϴ�!");
			
		}
		else {
			if(total >= 70) {
			System.out.println("Fail�Դϴ�. [�⼮����] ("+ attd + " / 20)");
		}
			else if (attd > 20 * 0.7) {
				System.out.println("Fail�Դϴ�. [���� �̴�] " + total + "��");
			}
			else {
				System.out.println("Fail�Դϴ�. [�⼮����] ("+ attd + " / 20)");
				System.out.println("Fail�Դϴ�. [���� �̴�] " + total + "��");
			}
		}
	}
		
}


