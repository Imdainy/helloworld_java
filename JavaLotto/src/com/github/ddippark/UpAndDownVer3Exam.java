package com.github.ddippark;

import java.util.Scanner;

public class UpAndDownVer3Exam {
	public static void main(String[] args) {
		
		double sum=0;
	    int[] arr= new int[100];;
	    int game_count=0;
	    char check= ' ';;
	    int total_length=0;

	    
		Scanner trynum = new Scanner(System.in);
	    Scanner checkchar =new Scanner(System.in);
	 while(true)			{
		 
	 
	    UpAndDownVer3 game =new UpAndDownVer3();
	    
	    System.out.println("Up & Down �����Դϴ�.");
	    System.out.println("1���� 100������ ���� �� �����ּ���.");
	   
	    game.input = trynum.nextInt(); //�Է¹ޱ� 
	    
	   
	    	//game.input();
	    while(game.input!=game.random_num){
	    		game.loop();
	    		game.input=trynum.nextInt();
	    		}
	    
	    System.out.println("�����Դϴ�!!!");
	    System.out.println("�����" + game.count + " ������ ������ ������ϴ�!!!");
	    //--
	    arr[game_count++] = game.count;
	    game.count = 0;			// count�� �ʱ�ȭ
	    total_length = 0;
	    sum = 0;			// sum�� �ʱ�ȭ
	    for(int i=0; i<arr.length ; i++) {
	    	if (arr[i] > 0) {
	    		sum = sum + arr[i];
	    		total_length++;
	    	}
	    }
	    //--
	    System.out.println("���ݱ��� ����� �����" + (sum/(total_length)) +"�� �Դϴ�.");
	    //--
	    
	    
	    
	    
	    System.out.println("�ٽ� �ϰڽ��ϱ�?(Y/N)");
	    check=checkchar.next().charAt(0);
	 
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