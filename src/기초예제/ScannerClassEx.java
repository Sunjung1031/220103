package ���ʿ���;

import java.util.Scanner;

public class ScannerClassEx {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/*
		System.out.print("�����Է� >>> ");
		int inputInt = Scan.nextInt();
		System.out.println(inputInt);
		*/
		System.out.println("�Ǽ� �Է� >>> ");
		String doubleString = Scan.nextLine();
		System.out.println(doubleString);
			double pi = 3.14;
			float pi1 = 3.1415F;
		// nextInt()�� �Է¹��� ���� ������ ��ȯ ��Ű��� �޼ҵ�
		int age = 20;
		char initial = '��';
		String name = "����";
		System.out.println(initial+name+"��"+age+"���̴�");
	}

}
