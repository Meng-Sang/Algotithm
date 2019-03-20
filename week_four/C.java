package week_four;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a [] = new int [n];
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<a.length;i++)
			{
				a[i]=cin.nextInt();
			}
			outPut(a,list);
			for (Integer i : list) {
				System.out.print(i+" ");
			}
		cin.close();
	}

	private static void outPut(int[] a, List<Integer> list) {
		// TODO Auto-generated method stub
		if(a.length==1)
		{
			list.add(a[0]);
			return ;
		}
		if(a.length%2==0)
		{
			int b [] = new int[a.length/2];
			int i=0;
			for(int j=0;j<a.length;j++)
			{
				if(j%2==0)
					list.add(a[j]);
				else
					b[i++]=a[j];
			}
			outPut(b, list);
		}
		else
		{
			int b [] = new int[a.length/2];
			int i=0;
			for(int j=0;j<a.length;j++)
			{
				if(j%2==0)
					list.add(a[j]);
				else
					b[i++]=a[j];
			}
			int temp = b[0];
			for (int j = 0; j < b.length-1; j++) {
				b[j]=b[j+1];
			}
			b[b.length-1]=temp;
			outPut(b, list);
		}
	}

}
