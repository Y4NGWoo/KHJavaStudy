package com.kh.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise() {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		// for(int i = 1; i < 100; i+=2) for���϶�

		int i = 1;
		int sum = 0;
		
		while(i < 100) {
			sum += i;
			i += 2;
			
		}
		System.out.println("�հ� : " + sum);

	}

	
	
	
	
	
	public void exercise2() {
		// while���� �̿��Ͽ� ������ �ϳ� �Է¹޾� �� ���� 1 ~ 9������ �� �϶���
		// �� ���� �������� ����Ͻÿ�.
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����Ͻÿ�.
		// 1�ܰ� While������ ������ �����
		// 2�ܰ� �Է��� ������ ������ ���
		// 3�ܰ� �Է��� ���� 1 ~ 9 ������ ������ ���� ���
		// for(int i = 1; i < 10; i++) for���϶�
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		if(dan >= 1 && dan <= 9) {
			// ������ ���
			int i = 1;
			while(i < 10) {
				System.out.println(dan * i);
				i++;
			}
		}else {
			System.out.println("1 ~ 9������ ����� �Է��Ͽ��� �մϴ�.");
		}

		}
	


	
	
	
	
	
	
	
	
	public void exercise3() {
		// while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�
		// -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
		// ���� �ϳ� �Է� : 3
		// ���� �ϳ� �Է� : 4
		// ���� �ϳ� �Է� : 7
		// ���� �ϳ� �Է� : -1
		// �Է��Ͻ� ���� ���� : 14
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		while(num != -1) {
			System.out.print("���� �ϳ� �Է� : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("�Է��Ͻ� ���� ���� : " + sum);
	}
	
	
	
	
	
	
	
	public void exercise4() {
		/*
		 *  while���� �̿��Ͽ� -1�� �ɶ����� ���� �������� �Է¹ް� ����� ����Ͻÿ�.
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  10
		 *  20
		 *  3
		 *  -20
		 *  -10
		 *  -1
		 *  ������ ������ 5���̸� ����� 0.6�Դϴ�.
		 *  
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  -1
		 *  �Էµ� ���� �����ϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int input = sc.nextInt();
		while(input != -1) {
			sum += input;
			count++;
			input = sc.nextInt();
		}
		if(count == 0) {
			//�Էµ� ���� ���� ���
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			//�Էµ� ���� �ִ°��
		
		System.out.print("������ ������ " + count + "�̸� ");
		System.out.println("��� : " + (double)sum/count + "�Դϴ�."); //��������ȯ
		}
	}
}
