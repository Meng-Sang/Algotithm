package week_three;

import java.util.Scanner;

public class King {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner( System.in);
		int i=0,n = cin.nextInt();
		while(i<n)
		{
			String s = cin.next();
			System.out.println(minLen(s));
			i++;
		}
		cin.close();
	}
	public static int minLen(String s) {
		// TODO Auto-generated method stub

		int i = s.length()/2;
		if(s.length()<=1)
			return 1;
		if(s.length()%2!=0)
		{
			return s.length();
		}
		for(int j=i-1;j>=0;j--)
		{
			if(s.charAt(j)!=s.charAt(i++))
			{
				
				return s.length();
			}
		}
		return minLen(s.substring(0, s.length()/2));
	}

}
