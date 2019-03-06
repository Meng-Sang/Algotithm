package week_tow;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt(),b = cin.nextInt();
		int count=0;
		for (int i = a; i < b; i++) {
			if(judge(i)==true)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
	static boolean judge(int n)
	{
		if(n<=1)
			return false;
		if(n==2||n==3)
			return true;
		for (int i = 2; i < n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
