package week_tow;

import java.util.Arrays;
import java.util.Scanner;

public class SortForFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int [] a = new int [4];
		for (int i = 0; i < a.length; i++) {
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
