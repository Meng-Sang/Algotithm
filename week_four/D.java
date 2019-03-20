package week_four;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt(),m=cin.nextInt();
		int a [] = new int [n];
		int b [] = new int [m];
		inPut(n,a,cin);
		inPut(m,b,cin);
		System.out.println(distance(a,b));
	}

	private static int distance(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int temp = (a[a.length-1]>b[0])?(a[a.length-1]-b[0]):(b[0]-a[a.length-1]);
		for(int i = a.length-1;i>0;i--)
		{
			for(int j = 1;j<b.length;j++)
			{
			int t = a[i]>b[j]?a[i]-b[j]:b[j]-a[i];
			if(t<temp)
			temp=t;
			}
		}
		return temp;
	}

	private static void inPut(int n, int[] a, Scanner cin) {
		// TODO Auto-generated method stub
			for (int i = 0; i < a.length; i++) {
				a[i]  = cin.nextInt();
			}
	}

}
