package 복습문제1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java!");
		System.out.println("-------------");
		
		boolean a=true;
		byte b=10;
		short c=20;
		int d=30;
		long e=40l;
		float f=12.5f;
		double g=34.56;
		char h='k';
		String i="hello java";
		System.out.println("boolean:"+a);
		System.out.println("byte:"+b);
		System.out.println("short:"+c);
		System.out.println("int:"+d);
		System.out.println("long:"+e);
		System.out.println("float:"+f);
		System.out.println("doubale:"+g);
		System.out.println("char:"+h);
		System.out.println("String:"+i);
		System.out.println("-------------");
		
		byte aVar=100;
		short bVar=30000;
		int cVar=50000;
		long dVar=100000;
		System.out.println("byte 타입:"+aVar);
		System.out.println("short 타입:"+bVar);
		System.out.println("int 타입:"+cVar);
		System.out.println("long 타입:"+dVar);
		System.out.println("-------------");
		
		float aVar1;
		double bVar1;
		aVar1=20.1f;
		bVar1=20.1f;
		System.out.println("floar 타입:"+aVar1);
		System.out.println("double 타입:"+bVar1);
		System.out.println("-------------");
		
		char aVar2='A';
		System.out.println("aVar2:"+aVar2);
		System.out.println("aVar2:"+(int)aVar2);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		System.out.println("-------------");
		
		int a1=20, b1=10, c1=0;
		c1=a1+b1;
		System.out.println(c1);
		c1=a1-b1;
		System.out.println(c1);
		c1=a1*b1;
		System.out.println(c1);
		c1=a1/b1;
		System.out.println(c1);
		c1=a1%b1;
		System.out.println(c1);
		c1=12%5;
		System.out.println(c1);
		System.out.println("-------------");
		
		int i1=5, j1=5;
		System.out.println(i1++);
		System.out.println(j1--);
		System.out.println("i1="+i1+",j1="+j1);
		System.out.println("-------------");
		
		int i2=5, j2;
		j2=i2++;//j2=5, i2=6
		System.out.println("j2="+j2);
		j2=++i2;//i2=7, j2=7
		System.out.println("j2="+j2);
		j2=i2--;//j2=7, i2=6
		System.out.println("j2="+j2);
		j2=--i2;//i2=6, j2=5
		System.out.println("j2="+j2);
		System.out.println("현재i="+i2);
		System.out.println("i2++:"+i2++);
		System.out.println("++i2:"+(++i2));
		System.out.println("i2--:"+i2--);
		System.out.println("--i2:"+(--i2));
		System.out.println("-------------");
		
		int a2=+1;
		int b2=-2;
		int c2=5;
		boolean d2=true;
		
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
		System.out.println(!d2);
		
		int i3=1;
		System.out.println(i3);
		i3=-i3;
		System.out.println(i3);
		i3=-i3;
		System.out.println(i3);
		i3=-i3;
		System.out.println(i3);
		System.out.println("-------------");
		
		char b3 = 'd';
		int e4=b3;
		System.out.println((char)++e4);
		//int e3 = b3+1);
		//System.out.println((char)e3);
		System.out.println("-------------");
		
		//20p 모르겠음
		System.out.println("-------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자를 입력하세요.");
		int value=sc.nextInt();
		
		System.out.println("-------------");
		
		int num=5;
		System.out.println((num%2==1)?"홀수":"짝수");
	}

}
