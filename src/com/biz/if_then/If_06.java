package com.biz.if_then;

public class If_06 {

	public static void main(String[] args) {
		int intNum = 100;
		int index =2;
		for(index = 2 ; index < intNum; index++  ) {
			if (intNum % index == 0) {
				// System.out.println(intNum + "�� �Ҽ��� �ƴմϴ�");
				break;
			}
	}
	if(index >= intNum) {
		System.out.println(intNum + "�� �Ҽ��Դϴ�");

	}

}
}