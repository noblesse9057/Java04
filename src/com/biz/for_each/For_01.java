package com.biz.for_each;

public class For_01 {

	public static void main(String[] args) {

		int intGu = 2;
		int intEle = 1;
		for(; intEle <= 10 ; intEle++) {
			// System.out.println("�ݺ�");
			System.out.println(intGu+"x"+ intEle +"="	+intGu * intEle);
		}

		intEle = 1;
		System.out.println("+=2");
		for(; intEle <= 10 ; intEle+=2) {
			// System.out.println("�ݺ�");
			System.out.println(intGu+"x"+ intEle +"="	+intGu * intEle);
		}
		
		}
	
}
	

