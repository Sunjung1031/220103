package ��������_��������_����;

/*
 *  �ڹ��� Ŭ���� ������ �ν��Ͻ� ������ �����ϱ� ���� ���� ���α׷�
 */
class Card {
	static int width = 100;  // ���� Ŭ���� ����
	static int height = 250; // ���� Ŭ���� ����
	
	String kind;  //ī�� ���� ���� ������ ���� �ν��Ͻ� ����
	int number;   //ī�� ���� ���� ������ �ν��Ͻ� ����
	
}
public class CardGameEx {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card card1 = new Card();  //Card��� �ν��Ͻ� ��ü�� ����
		card1.kind = "Spade ";
		card1.number = 5;
		
		Card card2 = new Card();
		card2.kind = "Heart ";
		card2.number = 8; 
		
		System.out.println("ī��1�� "+card1.kind+card1.number+"�̸�,"+"ī��ũ���"+card1.height+"x"+card1.width+"��");
		System.out.println("ī��2�� "+card2.kind+card2.number+"�̸�,"+"ī��ũ���"+card2.height+"x"+card2.width+"��");
	}
				
	

}
