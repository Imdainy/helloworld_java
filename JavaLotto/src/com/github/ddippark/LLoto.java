package com.github.ddippark;

import java.util.Scanner;
import java.util.*;

public class LLoto {
	 public static void main(String[] args) {
	        Scanner insert_number = new Scanner(System.in); // �������߱⸦ �õ��ϴ� ����
	        int[] my_game = new int[3];
	        my_game[0]=1;
	        
	    while(true)
	    {
	    	System.out.println("     ��������������������������������");
	    	System.out.println("     ��UP & DOWN GAME��");
	    	System.out.println("     ��������������������������������");
	        System.out.println("����������������NEW GAME�ڦ�������������");
	        System.out.print("        ");
	        System.out.println(my_game[0] + "��° ����");
	        System.out.println("����������������������������������������������������");
	        System.out.print("���� ��� : ");
	        my_game[2]=5;
			 for(int i=0; i<my_game[2];i++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
	        my_game[1]=1;
	        int my_number = 0;
	        char check;
	        int ans_number =(int) (Math.random()*50)+1;
	        //System.out.println("����� �Է��� ���ڴ� "+input);
	        System.out.println("ȭ�鿡 ������ ���� ���ڸ� �Է��ϼ���.");
			System.out.println(my_game[1]+"��° �õ����Դϴ�");
			
	        while(my_number!=ans_number )
	        {
	             my_number = insert_number.nextInt(); //�Է¹ޱ�
	             while(true)
	             {
	            	 if(my_number>50)
	            	 {
	            		 System.out.println("0~50������ ���ڸ� �Է��ϼ���;;");
	            		 break;
	            	 }
	            	 else if(my_number<ans_number)//������
	            	 {
	            		 System.out.println("UP!!!!");
	            		 System.out.println("ȭ�鿡 ���ڸ� �� �� �� �Է��ϼ���.");
	            		 my_game[1] = my_game[1]+1;
	            		 my_game[2] = my_game[2]-1;
	            		 System.out.println(my_game[1]+"��° �õ����Դϴ�");
	            		 System.out.print("���� ��� : ");
	            		 for(int i=0; i<my_game[2];i++)
	            		 {
	            			 System.out.print("*");
	            		 }
	            		 System.out.println();

	            		 break;    
	            	 }
	            	 else if(my_number>ans_number)
	            	 {
	            		 System.out.println("DOWN!!!!"); 
	            		 System.out.println("ȭ�鿡 ���ڸ� �� �� �� �Է��ϼ���.");
	            		 my_game[1] = my_game[1]+1;
	            		 my_game[2] = my_game[2]-1;
	            		 System.out.print("���� ��� : ");
	            		 for(int i=0; i<my_game[2];i++)
	            		 {
	            			 System.out.print("*");
	            		 }
	            		 System.out.println();
	            		 break;
	            	 }
	            	 else if(my_number == ans_number)
	            	 {
	            		 break;
	            	 }            	 
	             }

	        }

	    
		      System.out.println("�����Դϴ�!!!");
		      System.out.println(my_game[1]+"������ ������ϴ�");
		      System.out.println("�� ���� �� �ұ��?(Y/N)");

		      check = insert_number.next().charAt(0);
		      if(check=='Y' || check=='y'){
		    	my_game[0]=my_game[0]+1;
		        continue;
		      }
		      else if(check =='N'||check=='n')
		      {
		    	  System.out.println("�ȳ��� ������~");
		    	  break;
		      }
		      else
		      {
		          System.out.println("�հ����� �̲���������? �߰���");
		          break;
		      }
	    }
	}
	}
