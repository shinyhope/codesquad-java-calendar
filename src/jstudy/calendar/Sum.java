package jstudy.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		

		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println(" key in ; ");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + ", " + s2);
	
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + "," + b);
		
		int c = a +b;
		System.out.println("sum : " + (a+b));
	}
}  