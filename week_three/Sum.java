package week_three;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext())
		{
			int a = cin.nextInt(),b = cin.nextInt();
			String s = String.valueOf(b);
			StringBuilder sb = new StringBuilder();
			for(int i=s.length()-1;i>=0;i--)
			{
				sb.append(s.charAt(i));
			}
			System.out.println(Integer.parseInt(sb.toString())+a);;
		}
	}

}
