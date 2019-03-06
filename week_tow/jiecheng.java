package week_tow;

import java.util.Scanner;

public class jiecheng {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n,r;
		while(cin.hasNext())
		{
			n = cin.nextInt();
			r = cin.nextInt();
			if(n==r)
				System.out.println(1);
			else
			{
				long up = getData(r+1,n);
				long down = getData(1,n-r);
				System.out.println(up/down);
			}
		}
		
	}

	private static long getData(int i, int n) {
		// TODO Auto-generated method stub
		long temp = 1;
		for(int j=i;j<=n;j++)
		{
			temp = temp*j;
		}
		return temp;
	}

}
