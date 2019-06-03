package com.biz.if_then;

public class If_02 {

	public static void main(String[] args) {

		for(int i= 0; i <35;i++) {
			System.out.println(i);
		}
		
		for(int i = 0 ; i <35 ;i++) {
			if(i%2==0) {
				System.out.println(i + "´Â Â¦¼öÀÔ´Ï´Ù");
		}
		}
		
		int intSum =0 ;
		for(int i = 0 ; i <=100;i++) {
			if(i%2==0) {
				intSum += i;
			}
		}
				System.out.println("Â¦¼öÀÇ ÇÕ:" + intSum);
				
				
			
			}
		
	}

