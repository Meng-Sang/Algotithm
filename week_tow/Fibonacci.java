package week_tow;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		if(n==1||n==2)
		{
			System.out.println(1);
			return;
		}
		int a [] = new int[n];
		a[0] = 1;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-1]+a[i-2];
		}
		System.out.println(a[n-1]);
	}
}
