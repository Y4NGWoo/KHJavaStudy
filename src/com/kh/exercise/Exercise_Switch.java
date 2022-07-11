package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Switch {
	public void exercise1() {
		// 1 ~ 3 ������ ������ �Է¹޾�
		// 1�� ��� ������ �Դϴ�.
		// 2�� ��� �Ķ����Դϴ�.
		// 3�� ��� �ʷϻ��Դϴ�.
		// �׿��� ������ �Է��� ��� �߸��Է��ϼ̽��ϴٸ� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 3 ������ ������ �Է����ּ���.");
		int input = sc.nextInt();
		
		switch(input) {  
		case 1 : System.out.println("�ʷϻ��Դϴ�."); break; 
		case 2 : System.out.println("�Ķ����Դϴ�."); break;
		case 3 : System.out.println("�ʷϻ��Դϴ�."); break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�."); break;
		}
		
	}

	
	public void exercise2( ) {
		/*
		 * ���� �ΰ��� �����ȣ ���� 1���� �Է¹޾Ƽ�
		 * �����ȣ����(+,-,*,/)�� �ش��ϴ� ����� �����ϰ� ����ϼ���.
		 * ��, �� ���� ���ڸ� �Է��� ��� �����ڸ� �߸��Է��ϼ̽��ϴٸ� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		double cal = sc.nextDouble();
		System.out.print("�����ȣ���� �Է�(+,-,*,/) : ");
		char operator = sc.next().charAt(0);
		System.out.print("�ι�° ���� �Է� : ");
		double cal2 = sc.nextDouble();		

		double result = 0;
		
		switch(operator) {  
		case '+' :  result = (cal+cal2); break; 
		case '-' :  result = (cal-cal2); break;
		case '*' :  result = (cal*cal2); break;
		case '/' :  result = (cal/cal2); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}
		System.out.println("��� : " + result);
		
	}

	
	
	
	
	public void exercise3() {
	/*
	 * 1 ~ 12 ������ ���ڸ� �Է¹޾� �ش��ϴ� ���� ���� ������ ��¥�� ����ϼ���.
	 * �׿��� ���ڸ� �Է��� ��� 1 ~ 12 ������ ���ڸ� �Է��ϼ��並 ����ϼ���
	 * 
	 * 1�� ~ 12������ �� �ϳ��� �Է��ϼ��� : 3
	 * �Է��Ͻ� ���� 31�ϱ����Դϴ�.
	 * break Ȱ�� !!
	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ~ 12������ �� �� �ϳ��� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 :
		case 8 : 
		case 10 : 
		case 12 : System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�."); break;
		case 2 : System.out.println("�Է��Ͻ� ���� 28�ϱ��� Ȥ�� 29�ϱ����Դϴ�."); break;
		case 4 :
		case 6 : 
		case 9 : 
		case 11 : System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�."); break;
		default : System.out.println("1 ~ 12 ������ ���ڸ� �Է��ϼ���."); break;
		}
	}
}