package week_four;

import java.util.*;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
		while(n>0)
		{
			int m = cin.nextInt();
			if(!map.containsKey(m))
				map.put(m, 1);
			else
				map.put(m, map.get(m)+1);
			n--;
		}
		int temp = 0;
		for (Integer s : map.keySet()) {
			if(map.get(s)>temp)
				temp = map.get(s);
		}
		for (Integer s : map.keySet()) {
			if(map.get(s).equals(temp))
				map2.put(s, temp);
		}
		for (Integer s : map2.keySet()) {
			System.out.println(s);
			System.out.println(map2.get(s));
			break;
		}
		cin.close();
	}
}
