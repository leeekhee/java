package kh;

import java.util.Scanner;

public class op6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hz = new Scanner(System.in);
		System.out.println("수를 입력하세요.");
		int n=hz.nextInt();
		if(n%2==0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
		
		float p=60, j=70, a=80, c=50, c2=30;
		float sc=p+j+a+c+c2;
		float m=sc/5;
		System.out.printf("나잘난의 성적 총합계는{%f}입니다. 평균은{%f}입니다\n",sc,m);
		
		int x=2;
		if(x%2==0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
		
		Scanner d= new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int n2=d.nextInt();
		int d = (n2 > 0)? n2:-n2;
	}

}
