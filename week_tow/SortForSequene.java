package week_tow;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Scanner;

public class SortForSequene {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n,x;
		while(true)
		{
			n = cin.nextInt();
			x = cin.nextInt();
			if(n==0&&x==0)
				break;
			int a[] = new int[n+1];
			a[n] = x;
			for (int i = 0; i < a.length-1; i++) {
				a[i] =cin.nextInt();
			}
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
