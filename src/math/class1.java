package math;

import java.util.Scanner;

public class class1 {
	int a, b, c, d, f, g, h = 0;
	public void GameStart() {
		System.out.println("1. 더하기 \n2. 빼기 \n3. 곱하기 \n4. 나누기 \n0. 종료");
		Scanner z = new Scanner(System.in);
		h = z.nextInt();
		if ( h==1 ) {
			class1 mm = new class1();
			mm.Add();
		}
		else if( h==2) {
			class1 mm = new class1();
			mm.Sub();
		}
		else if( h==3) {
			class1 mm = new class1();
			mm.Mul();
		}
		else if( h==4) {
			class1 mm = new class1();
			mm.Div();
		}
		else if( h==0) {
			System.out.println("게임을 종료합니다.");
		}
	}
	public void Add(){
		for (int i=0; i<10; i++) {
		a = (int)(Math.random() * 10);
		b = (int)(Math.random() * 10);
		c = a + b;
		System.out.println((i+1)+"번째 문제 "+a+"+"+b+"=");
		Scanner q = new Scanner(System.in);
		d = q.nextInt();
		if (c==d) {
			f = f+1;
		}else {
			g = g+1;
		}
		}
		System.out.println("정답 : "+f+" 오답 : "+g);
	}
	public void Sub(){
		for (int i=0; i<10; i++) {
		a = (int)(Math.random() * 10);
		b = (int)(Math.random() * 10);
		c = a - b;
		System.out.println((i+1)+"번째 문제 "+a+"-"+b+"=");
		Scanner q = new Scanner(System.in);
		d = q.nextInt();
		if (c==d) {
			f = f+1;
		}else {
			g = g+1;
		}
		}
		System.out.println("정답 : "+f+" 오답 : "+g);
	}
	public void Mul(){
		for (int i=0; i<10; i++) {
		a = (int)(Math.random() * 10);
		b = (int)(Math.random() * 10);
		c = a * b;
		System.out.println((i+1)+"번째 문제 "+a+"*"+b+"=");
		Scanner q = new Scanner(System.in);
		d = q.nextInt();
		if (c==d) {
			f = f+1;
		}else {
			g = g+1;
		}
		}
		System.out.println("정답 : "+f+" 오답 : "+g);
	}
	public void Div(){
		for (int i=0; i<10; i++) {
		a = (int)(Math.random() * 10);
		b = (int)(Math.random() * 10);
		c = a / b;
		System.out.println((i+1)+"번째 문제 "+a+"/"+b+"=");
		Scanner q = new Scanner(System.in);
		d = q.nextInt();
		if (c==d) {
			f = f+1;
		}else {
			g = g+1;
		}
		}
		System.out.println("정답 : "+f+" 오답 : "+g);
	}
}
