package com.github.ddippark;

import java.util.Scanner;

public class UpAndDownVer3 {
	int count;
    int input;
    int random_num;
    
  
 
	public UpAndDownVer3(){
		count=0;
	    input = 0;
	    random_num= (int)(Math.random()*100+1);
	    
	
	   
		}
	    

	
	
boolean loop(){	
		
	       //  input = trynum.nextInt(); //�Է¹ޱ�
		while(input!=random_num){
			//input = trynum.nextInt();
	         	count++;
	         	if(input<random_num)    
	         	{
	         		System.out.println("UP!!!!");
	         		System.out.println("ȭ�鿡 ���ڸ� �� �� �� �Է��ϼ���.");
	         		return false;
		        	}
		        	else if(input>random_num)
		        	{
		        	System.out.println("DOWN!!!!"); 
	     		  	System.out.println("ȭ�鿡 ���ڸ� �� �� �� �Է��ϼ���.");
	     		  	return false;
		        	}
		        	else 
		        	{
		        	return true;
		        	}
	         
	     
		}
		return true;
	}


}

