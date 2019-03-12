package week_three;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("zero", 0);map.put("one", 1);map.put("two", 2);map.put("three", 3);map.put("four", 4);
		map.put("five", 5);map.put("six", 6);map.put("seven", 7);map.put("eight", 8);map.put("nine", 9);
		while(cin.hasNext())
		{
			String temp = null;
			int t1=0,t2=0;
			int i=0,j=0;
			while(!(temp=cin.next()).equals("+"))
			{
				if(i==0)
				{
					t1=map.get(temp);
				}
				if(i==1)
				{
					t1=t1*10+map.get(temp);
				}
				i++;
			}
			while(!(temp=cin.next()).equals("="))
			{
				if(j==0)
				{
					t2=map.get(temp);
				}
				if(j==1)
				{
					t2=t2*10+map.get(temp);
				}
				j++;
			}
			System.out.println(t1+t2);
		}
	}

}
