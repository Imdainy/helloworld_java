package com.github.ddippark;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 
public class Lotto {
	 public static void main(String[] args) {
	        Scanner insert_number = new Scanner(System.in); // 문제맞추기를 시도하는 숫자
	        int[] my_game = new int[2];
	        my_game[0]=1;
	       
	        // 
	        Random random = new Random();
	        int num = random.nextInt(1000);
	        System.out.println(num);
	       // 
	        
	    while(true)
	    {
	    	System.out.println("┌──────────────┐");
	    	System.out.println("│UP & DOWN GAME│");
	    	System.out.println("└──────────────┘");
	        my_game[1]=0;
	        System.out.println(my_game[0] + "번째 게임");
	        int my_number = 0;
	        char check;
	        int ans_number =(int) (Math.random()*50)+1;
	        //System.out.println("당신이 입력한 숫자는 "+input);
	        System.out.println("화면에 문제를 맞출 숫자를 입력하세요.");
	        while(my_number!=ans_number )
	        {
	             my_number = insert_number.nextInt(); //입력받기
	             while(true)
	             {
	            	 if(my_number>50)
	            	 {
	            		 System.out.println("0~50사이의 숫자를 입력하세요;;");
	            		 break;
	            	 }
	            	 else if(my_number<ans_number)//작으면
	            	 {
	            		 System.out.println("UP!!!!");
	            		 System.out.println("화면에 숫자를 한 번 더 입력하세요.");
	            		 my_game[1] = my_game[1]+1;
	            		 break;    
	            	 }
	            	 else if(my_number>ans_number)
	            	 {
	            		 System.out.println("DOWN!!!!"); 
	            		 System.out.println("화면에 숫자를 한 번 더 입력하세요.");
	            		 my_game[1] = my_game[1]+1;
	            		 break;
	            	 }
	            	 else if(my_number == ans_number)
	            	 {
	            		 break;
	            	 }
	             }
	        }
	    
		      System.out.println("정답입니다!!!");
		      System.out.println(my_game[1]+"번만에 맞췄습니다");
		      System.out.println("한 게임 더 할까요?(Y/N)");

		      check = insert_number.next().charAt(0);
		      if(check=='Y' || check=='y'){
		    	my_game[0]=my_game[0]+1;
		        continue;
		      }
		      else if(check =='N'||check=='n')
		      {
		    	  System.out.println("안녕히 가세요~");
		    	  break;
		      }
		      else
		      {
		          System.out.println("손가락이 미끄러졌나요? 잘가요");
		          break;
		      }
	    }
	}
	}
