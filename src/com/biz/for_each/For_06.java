package com.biz.for_each;

public class For_06 {

	public static void main(String[] args) {
		/*
		 *�������� �ּ� 
		 * 
		 *  intMin ����, intMax������
		 *  1. ��ü��
		 *  2. ¦���� ��
		 *  3. Ȧ���� ��
		 */
		
		int intMin = 0;
		int intMax = 10;
		int intSum = 0;
		int intEvenSum =0;
		int intOddSum = 0;
		for(int i = intMin; i <= intMax; i++) {
			intSum+= i;
		} 
			// ¦���� ���۰� ���
		int intEven = intMin + intMin%2;
		for(int i =intEven; i <= intMax; i+=2) {
				intEvenSum+= i;
		} 
			// Ȧ���� ���۰� ���
		int intOdd = intMin + ((intMin+1)%2); 
		for(int i =intOdd; i <= intMax; i+=2) {
				intOddSum+= i;
		} 
			System.out.println(intMin +"����" +intMax+ " ���� ��ü���� ="+intSum);
			System.out.println(intMin +"����" + intMax + "���� ¦������  ="+intEvenSum);
			System.out.println(intMin +"����" + intMax + "���� Ȧ������  ="+intOddSum);

	
	}

}
