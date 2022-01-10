package 기초예제;

public class VariableEx02 {

	static int v2; // v2를 클래스 변수라고함. 자동으로 0으로 초기화 된다.
	public static void main(String[] args) {
		int v1 = 15; //지역 변수이다. 지역변수는 초기값을 설정해야한다.
		 /*
		  * 변수는 선언된 블록 내에서만 사용이 가능한다.
		  * 여러줄을 주석처리할 
		  */
		if(v1 > 10) { //[주석] if 블록
	        int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}

}