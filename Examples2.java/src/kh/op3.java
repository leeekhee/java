package kh;

public class op3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=8;
		
		System.out.printf("%d을 %d로 나누면, \n",x,y);
		System.out.printf("몫은 %d이고,"
				+ "나머지는 %d입니다.\n", x/y,x%y);
		
		int A=89, B=66;
		System.out.println(A < B);
		
		
		int i = 7;
		System.out.println(i > 3 && i < 5);
		System.out.println(i > 3 || i < 0);
		
		char x2 = 'j';
		System.out.println(x2 >= 'a' && x2 <='z');
		System.out.println(x2 >= 'a' && x2 <='z'||(x2 >= 'A' && x2 <= 'Z'));
		
		
	}

}
