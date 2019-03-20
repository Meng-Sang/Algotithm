package week_four;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n =cin.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
		while(n>0)
		{
			countP(n,map);
			n--;
		}
		for (Integer s : map.keySet()) {
			System.out.println(map.get(s));
		}
		cin.close();
	}

	private static void countP(int n, Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		int t = n;
		while(t>9)
		{
			int temp = t%10;
			if(map.containsKey(temp))
				map.put(temp, map.get(temp)+1);
			else
				map.put(temp, 1);
			t=t/10;
		}
		if(map.containsKey(t))
			map.put(t, map.get(t)+1);
		else
			map.put(t, 1);
	}

}
