package week_tow;

import java.util.Scanner;

public class ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner   cin = new Scanner(System.in);
		int n=Integer.parseInt(cin.nextLine());
		String [] strs = new String[n];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = cin.nextLine();
		}
		for(int i=0;i<strs.length-1;i++)
		{
			for(int j= i;j>=0;j--)
			{
				int a = Integer.parseInt(strs[j].substring(6, 14));
				int b = Integer.parseInt(strs[j+1].substring(6, 14));
				if(a<b)
				{
					String temp = strs[j];
					strs[j] =strs[j+1];
					strs[j+1] = temp;
				}
				if(a==b&&strs[j].compareTo(strs[j+1])<0)
				{
					String temp = strs[j];
					strs[j] =strs[j+1];
					strs[j+1] = temp;
				}
			}
		}
		for (String string : strs) {
			System.out.println(string);
		}
	}

}
