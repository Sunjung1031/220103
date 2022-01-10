package 기초예제;

import java.util.Scanner;

public class ScannerClassEx {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/*
		System.out.print("정수입력 >>> ");
		int inputInt = Scan.nextInt();
		System.out.println(inputInt);
		*/
		System.out.println("실수 입력 >>> ");
		String doubleString = Scan.nextLine();
		System.out.println(doubleString);
			double pi = 3.14;
			float pi1 = 3.1415F;
		// nextInt()는 입력받은 값을 정수로 변환 시키라는 메소드
		int age = 20;
		char initial = '이';
		String name = "형준";
		System.out.println(initial+name+"은"+age+"살이다");
	}

}
