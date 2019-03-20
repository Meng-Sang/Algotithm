package week_four;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Set<Integer> set = new TreeSet<Integer>();
		while(n>0)
		{
			int temp = cin.nextInt();
			set.add(temp);
			n--;
		}
		for (Integer i : set) {
			System.out.println(i);
		}
		cin.close();
	}

}
