package kh;

import java.util.Scanner;

public class op6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hz = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int n=hz.nextInt();
		if(n%2==0)
		{
			System.out.println("¦��");
		}
		else
		{
			System.out.println("Ȧ��");
		}
		
		float p=60, j=70, a=80, c=50, c2=30;
		float sc=p+j+a+c+c2;
		float m=sc/5;
		System.out.printf("���߳��� ���� ���հ��{%f}�Դϴ�. �����{%f}�Դϴ�\n",sc,m);
		
		int x=2;
		if(x%2==0)
		{
			System.out.println("¦��");
		}
		else
		{
			System.out.println("Ȧ��");
		}
		
		Scanner d= new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int n2=d.nextInt();
		int d = (n2 > 0)? n2:-n2;
	}

}
