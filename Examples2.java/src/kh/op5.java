package kh;

import java.util.Scanner;

public class op5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하라");
		int jumsu=sc.nextInt();
		if(jumsu>=90)
		{
			System.out.println("수");
		}
		else if(jumsu>=80)
		{
			System.out.println("우");
		}
		else if(jumsu>=70)
		{
			System.out.println("미");
		}
		else if(jumsu>=60)
		{
			System.out.println("양");
		}
		else
		{
			System.out.println("가");
		}
		
		int g=1;
		if (g==1||g==3)
		{
		System.out.println("남자");
		}
		else
		{
		g=2;
	    g=4;
		System.out.println("여자");
		}
		
		
		int score=56;
		if(score>=90) //90~100
		{
			System.out.println("수");
		}
		else if (score>=80)
		{
			System.out.println("우");
		}
		else if (score>=70)
		{
			System.out.println("미");
		}
		else
		{
			System.out.println("가");
		}
		System.out.println("종료");
		
		
		
		
		
		
		int sc2=60;
		if(sc2>=60)
		{
			System.out.println("합격");
		}
		else
		{	
			System.out.println("불합격");
		}
		
		
	
	}

}
