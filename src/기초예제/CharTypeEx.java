package ���ʿ���; 

public class CharTypeEx {

	public static void main(String[] args) {
		char c1 = 'A';      // ���ڸ� ���� ����
		char c2 = 65;       //  10������ ����
		char c3 = '\u0041'; //16������ ����
		
		System.out.println(c1); // A ���
		System.out.println(c2); // A ���
		System.out.println(c3); // A ���
		
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// long ������ Ÿ�� ����
		long var1 = 1000000000000L;
		System.out.println(var1);
		
		// [�߿�] byteŸ���� �н����� ���� ��ȣȭ ��ų �� ����
		long aa = 9223372036854775807L;
	
	}

}
