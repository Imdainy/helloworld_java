package com.exam.quiz;
import java.util.Scanner;
import java.util.*;

public class Quiz2 {
	public static void main(String[] agrs){		
		Scanner scanner = new Scanner(System.in);
		int num, last;
		System.out.println("숫자 입력 :");
		num = scanner.nextInt();
		//last = scanner.nextInt();
		//System.out.println("입력한 숫자는  %d \n", num);
		//String inputString;
		
		// while(true){
		switch(num){
		case 1:
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			System.out.println("****");
			System.out.println("*****");
			//System.out.println("계속하시겠습니까? 1.계속 2.종료");
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
			System.out.println("종료");
		}

	}
}
