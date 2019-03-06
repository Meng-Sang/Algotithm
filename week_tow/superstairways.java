package week_tow;

import java.time.temporal.JulianFields;
import java.util.Scanner;

public class superstairways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt(),flag=0;
		while(flag<n)
		{
			int m =cin.nextInt();
			System.out.println(g(m));
			flag++;
			
		}
	}
	private static int g(int n)
	{
		if(n>1)
		{
		if(n==2)
		{
			return 1;
		}
		if(n==3)
		{
			return 2;
		}
		if(n>3)
		{
			return g(n-1)+g(n-2);
		}
		}
		return 0;
	}
	private static void f(int n) {
		// TODO Auto-generated method stub
		int a[] = new int[n+1];
		int j ;
		for(j = 2;j<=n;j++)
		{
			if(j==2)
			{
				a[j] = 1;
			}
			if(j==3)
			{
				a[j] = 2;
			}
			if(j>3)
			{
				a[j] = a[j-1]+a[j-2];
			}
		}
		System.out.println(a[n]);
	}
}
