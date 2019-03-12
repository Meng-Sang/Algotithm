package week_three;

import java.util.Scanner;

public class xiaomukuai {
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n = cin.nextInt();
	int i=0,a;
	while(i<n)
	{
		int sum = 0;
		a =cin.nextInt();
		int [] arr = new int [a];
		for (int j = 0; j < arr.length; j++) {
			if(j==0)
			{
			arr[j]=1;
			}
			else {
				arr[j]=arr[j-1]+j+1;
			}
		}
		for (int j : arr) {
			sum+=j;
			System.out.println(j);
		}
		System.out.println(sum);
		i++;
	}
}
}
