package com.biz.for_each;

public class For_04 {

	public static void main(String[] args) {

		int intF = 100;
		int intFs = 1;
		
		for(int i = 10; i>0; i--) {
			System.out.println(i);
			// intFs = intFs * i;
			intFs *= i;
		}
		System.out.println(intFs);
	
	}

}
