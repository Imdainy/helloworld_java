package com.exam.quiz;
import java.util.Scanner;
import java.util.*;

public class Quiz2 {
	public static void main(String[] agrs){		
		Scanner scanner = new Scanner(System.in);
		int num, last;
		System.out.println("���� �Է� :");
		num = scanner.nextInt();
		//last = scanner.nextInt();
		//System.out.println("�Է��� ���ڴ�  %d \n", num);
		//String inputString;
		
		// while(true){
		switch(num){
		case 1:
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			System.out.println("****");
			System.out.println("*****");
			//System.out.println("����Ͻðڽ��ϱ�? 1.��� 2.����");
			//Scanner scanner = new Scanner(System.in);
			//last = scanner.nextInt();
			//if (last=2)
				break;
		case 2:
			System.out.println("    *");
			System.out.println("   **");
			System.out.println("  ***");
			System.out.println(" ****");
			System.out.println("*****");
			break;
		case 3:
			System.out.println("*****");
			System.out.println(" ****");
			System.out.println("  ***");
			System.out.println("   **");
			System.out.println("    *");
			break;
		case 4:
			System.out.println("*****");
			System.out.println("****");
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
			break;
		default:
			System.out.println("����");
		}

	}
}
