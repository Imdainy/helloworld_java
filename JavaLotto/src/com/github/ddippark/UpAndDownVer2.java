package com.github.ddippark;

import java.util.Scanner;

public class UpAndDownVer2 {
	 public static void main(String[] args) {
		 
		         Scanner s = new Scanner(System.in); // �������߱⸦ �õ��ϴ� ����
		         Scanner c = new Scanner(System.in); // �ٽ�
		     	int count=0;
		     	double sum=0;
		         
		         System.out.println("                 | | | | | | | | | | |");
		         System.out.println("              | |                       | | ");
		         System.out.println("            |                               |");
		         System.out.println("          |                                   | ");                 
		         System.out.println(" 	     |              UP & DOWN              |");
		         System.out.println("        | |                                   | |");
		         System.out.println("        |   |                               |   |");
		         System.out.println("        |     | |                       | |     |");
		         System.out.println("        |         | | | | | | | | | | |         |");             
		         System.out.println("        |                                       |");
		         System.out.println("        |                                       |");
		         System.out.println("         |              ��������               | ");
		         System.out.println("          |                                   |  ");
		         System.out.println("            |                               |");
		         System.out.println("              | |                       | |");
		         System.out.println("                  | | | | | | | | | | | ");
		   
		         int[] arr = new int[100];
		         int game_count = 0;
		         
		         
		     while(true)
		     {
		         int num = (int) (Math.random()*100 + 1);
		         System.out.println("Up & Down �����Դϴ�.");
		         System.out.println("1���� 100������ ���� �� �����ּ���.");
		         int input = 0;
		         char check;
		 
		         while(input!=num)
		         {
		             input = s.nextInt(); //�Է¹ޱ�
		             while(true)
		             {
		             	count++;
		             	if(input<num)    
		             	{
		             		System.out.println("UP!!!!");
		             		System.out.println("ȭ�鿡 ���ڸ� �� �� �� �Է��ϼ���.");
		             		break;
		 	        	}
		 	        	else if(input>num)
		 	        	{
		 	        		System.out.println("DOWN!!!!"); 
		         		  	System.out.println("ȭ�鿡 ���ڸ� �� �� �� �Է��ϼ���.");
		         		  	break;
		 	        	}
		 	        	else 
		 	        	{
		 	        		break;
		 	        	}
		             }
		         }
		 	    System.out.println("�����Դϴ�!!!");
		 	    System.out.println("�����" + count + "������ ������ ������ϴ�!!!");
		 	    arr[game_count++] = count;
		 	    count = 0;			// count�� �ʱ�ȭ
		 	    int total_length = 0;
		 	    sum = 0;			// sum�� �ʱ�ȭ
		 	    for(int i=0; i<arr.length ; i++) {
		 	    	if (arr[i] > 0) {
		 	    		sum = sum + arr[i];
		 	    		total_length++;
		 	    	}
		 	    }
		 	    System.out.println("���ݱ��� ����� �����" + (sum/(total_length)) +"�� �Դϴ�.");
		 	    System.out.println("�� ���� �� �ұ��? (Y/N)");
		 	    check = c.next().charAt(0);			// char check�� ���� �Է¹޴� �κ�
		 	    if(check=='Y' || check =='y'){
		 	    	continue;
		 	    }
		 	    else if(check =='N' || check =='n')
		 	    {
		 	    	System.out.println("�ȳ��� ������~");
		 	        break;
		 	    }
		 	    else
		 	    {
		 	        System.out.println("�հ����� �̲��� ������? �߰���");
		 	        break;
		 	    }
		     }
		   }
		 }
